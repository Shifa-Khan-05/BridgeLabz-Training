package com.exceptions.customexception;

class InvalidAgeException extends Exception {
    InvalidAgeException(String message) {
        super(message);
    }
}