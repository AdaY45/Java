package com.company.construction;

public class ConstructionIsNotFinishedException extends RuntimeException{

    public ConstructionIsNotFinishedException(String message) {
        super(message);
    }
}
