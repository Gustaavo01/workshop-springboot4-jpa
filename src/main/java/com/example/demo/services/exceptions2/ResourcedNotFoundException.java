package com.example.demo.services.exceptions2;

public class ResourcedNotFoundException extends RuntimeException {

    public ResourcedNotFoundException(Object id ){
        super("Resource not found . Id " + id);
    }
}
