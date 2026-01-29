package com.annotationreflectionandjsaon.eventtracker;

import java.time.LocalDateTime;

public class AuditLog {

    public String action;
    public String method;
    public LocalDateTime timestamp;

    public AuditLog(String action, String method) {
        this.action = action;
        this.method = method;
        this.timestamp = LocalDateTime.now();
    }
}
