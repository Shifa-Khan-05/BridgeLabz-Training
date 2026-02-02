package com.optionalclass.ecommercesystem;

import java.util.Optional;

public class EcommerceApp {

    public static void main(String[] args) {

        Optional<Integer> discount = Optional.empty();
        Optional<String> coupon = Optional.of("SAVE20");
        Optional<String> seller = Optional.empty();
        String description = null;
        Optional<String> deliveryPartner = Optional.of("BlueDart");

        System.out.println("==============================================");

        // 1. Apply discount
        int finalDiscount = discount.orElse(0);
        System.out.println("Discount Applied: " + finalDiscount + "%");

        System.out.println("==============================================");

        // 2. Coupon code
        coupon.ifPresent(
                c -> System.out.println("Coupon Applied: " + c)
        );

        System.out.println("==============================================");

        // 3. Seller details
        seller.ifPresentOrElse(
                s -> System.out.println("Seller: " + s),
                () -> System.out.println("Seller details unavailable")
        );

        System.out.println("==============================================");

        // 4. Product description
        String finalDescription =
                Optional.ofNullable(description)
                        .orElse("No description available");
        System.out.println(finalDescription);

        System.out.println("==============================================");

        // 5. Delivery partner
        deliveryPartner.ifPresent(
                d -> System.out.println("Delivered by: " + d)
        );
    }
}
