package com.streamapi.insuaranceclaimanalysis;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class InsuranceClaimAnalysis {

public static void main(String[] args) {
	List<Claim> claims = new ArrayList<>();

    claims.add(new Claim("Health", 50000));
    claims.add(new Claim("Health", 30000));
    claims.add(new Claim("Vehicle", 20000));
    claims.add(new Claim("Vehicle", 40000));
    claims.add(new Claim("Travel", 15000));
    claims.add(new Claim("Travel", 25000));
    
    Map<String, Double> averageClaimAmount=claims.stream().collect(Collectors.groupingBy(Claim::getClaimType,Collectors.averagingDouble(Claim::getClaimAmount))) ; 
     
    System.out.println("Average claim amount by claim type:");
    averageClaimAmount.forEach(
        (type, avg) -> System.out.println(type + " : " + avg)
    );
    
}
}
