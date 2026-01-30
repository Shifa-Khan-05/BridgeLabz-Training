package com.lambdaexpression.notificationfiltering;

class Alert {
    String type;
    String message;

    Alert(String type, String message) {
        this.type = type;
        this.message = message;
    }

    @Override
    public String toString() {
        return type + " → " + message;
    }
}
