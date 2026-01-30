package com.interfaces.markerinterface.dataserialization;

public class BackupService {

    public static void backup(Object obj) {

        if (obj instanceof BackupEligible) {
            System.out.println("Backing up data...");
        } else {
            System.out.println("Object not eligible for backup");
        }
    }
}
