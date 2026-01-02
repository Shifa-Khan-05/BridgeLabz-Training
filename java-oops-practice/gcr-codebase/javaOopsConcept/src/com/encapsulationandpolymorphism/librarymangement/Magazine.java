package com.encapsulationandpolymorphism.librarymangement;


public class Magazine extends LibraryItem {

    public Magazine(int id, String title, String author) {
        super(id, title, author);
    }

    @Override
    public int getLoanDuration() {
        return 7; // 1 week
    }
}