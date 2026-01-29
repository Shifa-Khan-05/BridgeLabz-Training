package com.annotationreflectionandjsaon.eventtracker;

import java.lang.reflect.Method;
import java.util.*;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.SerializationFeature;
import com.fasterxml.jackson.datatype.jsr310.JavaTimeModule;

public class EventTracker {

    public static void main(String[] args) throws Exception {

        List<AuditLog> logs = new ArrayList<>();

        Class<?> cls = UserService.class;

        for (Method method : cls.getDeclaredMethods()) {
            if (method.isAnnotationPresent(AuditTrail.class)) {
                AuditTrail audit = method.getAnnotation(AuditTrail.class);
                logs.add(new AuditLog(audit.action(), method.getName()));
            }
        }

        ObjectMapper mapper = new ObjectMapper();

        // 🔥 REQUIRED for Java 8 Date/Time
        mapper.registerModule(new JavaTimeModule());
        mapper.disable(SerializationFeature.WRITE_DATES_AS_TIMESTAMPS);
        mapper.enable(SerializationFeature.INDENT_OUTPUT);

        mapper.writeValue(new java.io.File("audit-log.json"), logs);

        System.out.println("Audit log generated successfully");
    }
}
