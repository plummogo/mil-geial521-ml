package com.example.demo;

import lombok.AllArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("api/v1/map")
@AllArgsConstructor
public class MapObjectController {
    private final MapObjectService mapObjectService;
    @GetMapping
    public List<MapObject> getMapObjects() {
        return mapObjectService.getAll();
    }

    @PostMapping("post")
    public ResponseEntity<String> addMapObject(@RequestBody MapObject mapObject) {
        return mapObjectService.addMapObject(mapObject);
    }

    @PutMapping("put")
    public ResponseEntity<String> updateMapObject(@RequestBody MapObject mapObject) {
        return mapObjectService.updateMapObject(mapObject);
    }

    @DeleteMapping("delete/{id}")
    public ResponseEntity<String> deleteMapObject(@PathVariable("id") Integer Id) {
        return mapObjectService.deleteMapObejctById(Id);
    }
}
