package com.annotationreflectionandjsaon.eventtracker;

public class UserService {

    @AuditTrail(action = "LOGIN")
    public void login() {}

    @AuditTrail(action = "FILE_UPLOAD")
    public void uploadFile() {}

    public void viewProfile() {}
}
