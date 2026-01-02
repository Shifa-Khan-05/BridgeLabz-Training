package com.encapsulationandpolymorphism.librarymangement;

public abstract class LibraryItem implements Reservable {

    // Encapsulation: private fields
    private int itemId;
    private String title;
    private String author;

    // Sensitive data (secured)
    private String borrowerName;
    private boolean isAvailable = true;

    public LibraryItem(int itemId, String title, String author) {
        this.itemId = itemId;
        this.title = title;
        this.author = author;
    }

    // Abstract method
    public abstract int getLoanDuration();

    // Concrete method
    public void getItemDetails() {
        System.out.println("Item ID: " + itemId);
        System.out.println("Title: " + title);
        System.out.println("Author: " + author);
        System.out.println("Loan Duration: " + getLoanDuration() + " days");
        System.out.println("Available: " + isAvailable);
    }

    // Interface methods
    @Override
    public void reserveItem(String borrowerName) {
        if (isAvailable) {
            this.borrowerName = borrowerName;
            isAvailable = false;
            System.out.println("Item reserved by: " + borrowerName);
        } else {
            System.out.println("Item already reserved");
        }
    }

    @Override
    public boolean checkAvailability() {
        return isAvailable;
    }

    // Controlled access
    protected String getBorrowerName() {
        return borrowerName;
    }
}
