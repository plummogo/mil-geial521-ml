package com.example.demo;

import org.springframework.data.mongodb.repository.MongoRepository;

import java.util.Optional;


public interface MapObjectRepository extends MongoRepository<MapObject, String> {
    Optional<MapObject> deleteMapObjectsById(Integer Id);
    Optional<MapObject> findMapObjectById(Integer Id);
}
