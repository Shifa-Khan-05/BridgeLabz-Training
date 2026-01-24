package com.mediinventory;

import java.util.Objects;

public class Item<T> {
    public int id;
    public String name;
    public int quantity;
    public String expiry;

    public Item(int id, String name, int quantity, String expiry) {
        this.id = id;
        this.name = name;
        this.quantity = quantity;
        this.expiry = expiry;
    }

    // Remove duplicates by Item ID
    @Override
    public boolean equals(Object o) {
        return o instanceof Item && this.id == ((Item<?>) o).id;
    }

    @Override
    public int hashCode() {
        return Objects.hash(id);
    }
}
