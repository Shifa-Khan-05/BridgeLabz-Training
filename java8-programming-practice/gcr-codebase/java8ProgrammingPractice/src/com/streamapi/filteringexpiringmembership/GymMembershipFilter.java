package com.streamapi.filteringexpiringmembership;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
public class GymMembershipFilter {
	public static void main(String[] args) {

        List<Member> members = new ArrayList<>();

        members.add(new Member("Shifa", LocalDate.now().plusDays(10)));
        members.add(new Member("Abhay", LocalDate.now().plusDays(40)));
        members.add(new Member("Rahul", LocalDate.now().plusDays(25)));
        members.add(new Member("Riya", LocalDate.now().minusDays(5)));  // already expired

        LocalDate today = LocalDate.now();
        LocalDate next30Days = today.plusDays(30);

        List<Member> expiringSoon =
                members.stream()

                       // filter memberships expiring within next 30 days
                       .filter(member ->
                               !member.getExpiryDate().isBefore(today) &&
                               member.getExpiryDate().isBefore(next30Days)
                       )

                       .collect(Collectors.toList());

        System.out.println("Memberships expiring within next 30 days:");
        expiringSoon.forEach(System.out::println);
    
}
}
