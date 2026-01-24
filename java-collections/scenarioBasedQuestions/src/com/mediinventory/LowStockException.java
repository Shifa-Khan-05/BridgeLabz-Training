package com.mediinventory;

public class LowStockException extends Exception {
    public LowStockException(String msg) {
        super(msg);
    }
}
