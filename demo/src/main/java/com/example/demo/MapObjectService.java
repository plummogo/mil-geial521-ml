package com.example.demo;

import lombok.AllArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@AllArgsConstructor
@Service
public class MapObjectService {
    private final MapObjectRepository mapObjectRepository;
    public List<MapObject> getAll() {
        return mapObjectRepository.findAll();
    }

    public ResponseEntity<String> addMapObject(MapObject mapObject) {
        mapObjectRepository.insert(mapObject);
        return new ResponseEntity<>(
                "Added map object id: "+ mapObject.getId() + ", successfully ADDED!",
                HttpStatus.OK
        );    }

    public ResponseEntity<String> updateMapObject(MapObject mapObject) {
        Optional<MapObject> foundMapObject = mapObjectRepository.findMapObjectById(mapObject.getId().intValue());
        if(!foundMapObject.isPresent()){
            return new ResponseEntity<>(
                    "Id: " + mapObject.getId().intValue() + " NOT FOUND",
                    HttpStatus.BAD_REQUEST
            );
        }
        foundMapObject.ifPresent(s -> {
            s.setBuoys(mapObject.getBuoys());
            s.setCages(mapObject.getCages());
            s.setCoordinates(mapObject.getCoordinates());
            s.setDescription(mapObject.getDescription());
            mapObjectRepository.save(s);
        });
        return new ResponseEntity<>(
                "Selected map object id: " + mapObject.getId() + ", successfully UPDATED!",
                HttpStatus.OK
        );
    }

    public ResponseEntity<String> deleteMapObejctById(Integer Id) {
        Optional<MapObject> foundMapObject = mapObjectRepository.findMapObjectById(Id);
        if(!foundMapObject.isPresent()){
            return new ResponseEntity<>(
                    "Id: " + Id + " NOT FOUND",
                    HttpStatus.BAD_REQUEST
            );
        }
        mapObjectRepository.deleteMapObjectsById(Id);
        return new ResponseEntity<>(
                "Selected map object id: "+ Id + ", successfully DELETED!",
                HttpStatus.OK
        );
    }
}
