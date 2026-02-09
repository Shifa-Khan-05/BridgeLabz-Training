package com.streambuzz;

import java.util.*;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        Program program = new Program();
        boolean running = true;

        while (running) {
            System.out.println("1. Register Creator");
            System.out.println("2. Show Top Posts");
            System.out.println("3. Calculate Average Likes");
            System.out.println("4. Exit");
            System.out.print("Enter your choice: ");

            int choice = sc.nextInt();
            sc.nextLine(); // consume newline

            switch (choice) {

                case 1:
                    CreatorStats creator = new CreatorStats();

                    System.out.print("Enter Creator Name: ");
                    creator.setCreatorName(sc.nextLine());

                    double[] likes = new double[4];
                    System.out.println("Enter weekly likes (Week 1 to 4):");

                    for (int i = 0; i < 4; i++) {
                        likes[i] = sc.nextDouble();
                    }

                    creator.setWeeklyLikes(likes);
                    program.registerCreator(creator);

                    System.out.println("Creator registered successfully");
                    break;

                case 2:
                    System.out.print("Enter like threshold: ");
                    double threshold = sc.nextDouble();

                    Map<String, Integer> topPosts =
                            Program.getTopPostCounts(Program.engagementBoard, threshold);

                    if (topPosts.isEmpty()) {
                        System.out.println("No top-performing posts this week");
                    } else {
                        for (Map.Entry<String, Integer> entry : topPosts.entrySet()) {
                            System.out.println(entry.getKey() + " - " + entry.getValue());
                        }
                    }
                    break;

                case 3:
                    double average = program.calculateAverageLikes();
                    System.out.println("Overall average weekly likes: " + average);
                    break;

                case 4:
                    System.out.println("Logging off - Keep Creating with StreamBuzz!");
                    running = false;
                    break;

                default:
                    System.out.println("Invalid choice");
            }
        }

        sc.close();
    }
}
