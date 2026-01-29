package com.annotationsandreflections.healthcheckpro;

import java.lang.reflect.*;

public class HealthCheckPro {

    public static void scanController(Class<?> controllerClass) {

        System.out.println("Scanning: " + controllerClass.getSimpleName());

        for (Method method : controllerClass.getDeclaredMethods()) {

            boolean isPublicAPI = method.isAnnotationPresent(PublicAPI.class);
            boolean requiresAuth = method.isAnnotationPresent(RequiresAuth.class);
            AppInfo apiInfo = method.getAnnotation(AppInfo.class);

            if (!isPublicAPI && !requiresAuth) {
                System.out.println(" WARNING: Method '" + method.getName() +
                        "' is missing access annotation");
            }

            if (apiInfo == null) {
                System.out.println(" WARNING: Method '" + method.getName() +
                        "' is missing @ApiInfo");
            }
        }
    }
}
