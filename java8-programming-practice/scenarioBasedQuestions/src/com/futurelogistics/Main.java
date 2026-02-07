package com.futurelogistics;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        Utility utility = new Utility();

        System.out.println("Enter the Goods Transport details");
        System.out.println("Input format:");
        System.out.println("transportId:transportDate:transportRating:transportType:otherDetails");
        System.out.println();
        System.out.println("For BrickTransport:");
        System.out.println("RTS120A:12/8/21:5:BrickTransport:brickSize:brickQuantity:brickPrice");
        System.out.println("Example:");
        System.out.println("RTS120A:12/8/21:5:BrickTransport:6:800:40");
        System.out.println();
        System.out.println("For TimberTransport:");
        System.out.println("RTS113A:12/8/21:4:TimberTransport:timberLength:timberRadius:timberType:timberPrice");
        System.out.println("Example:");
        System.out.println("RTS113A:12/8/21:4:TimberTransport:20:4:Premium:500");
        System.out.println();

        String input = sc.nextLine();

        GoodsTransport goodsTransport = utility.parseDetails(input);

        // If invalid, program naturally ends (NO System.exit)
        if (goodsTransport == null) {
            return;
        }

        String type = utility.findObjectType(goodsTransport);

        System.out.println("Transporter id : " + goodsTransport.getTransportId());
        System.out.println("Date of transport : " + goodsTransport.getTransportDate());
        System.out.println("Rating of the transport : " + goodsTransport.getTransportRating());

        if (type.equals("BrickTransport")) {

            BrickTransports bt = (BrickTransports) goodsTransport;

            System.out.println("Quantity of bricks : " + bt.getBrickQuantity());
            System.out.println("Brick price : " + bt.getBrickPrice());
            System.out.println("Vehicle for transport : " + bt.vehicleSelection());
            System.out.println("Total charge : " + bt.calculateTotalCharge());

        } else if (type.equals("TimberTransport")) {

            TimberTransport tt = (TimberTransport) goodsTransport;

            System.out.println("Type of the timber : " + tt.getTimberType());
            System.out.println("Timber price per kilo : " + tt.getTimberPrice());
            System.out.println("Vehicle for transport : " + tt.vehicleSelection());
            System.out.println("Total charge : " + tt.calculateTotalCharge());
        }

        sc.close();
    }
}
