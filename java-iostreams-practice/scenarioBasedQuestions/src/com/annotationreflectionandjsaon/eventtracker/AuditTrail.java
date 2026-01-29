package com.annotationreflectionandjsaon.eventtracker;

import java.lang.annotation.*;

@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.METHOD)
public @interface AuditTrail {
    String action();
}
