package com.streambuzz;

import java.util.*;

public class Program {

	public static List<CreatorStats> engagementBoard = new ArrayList<CreatorStats>();

	public void registerCreator(CreatorStats record) {
		System.out.println("Creator register successfully....");
		engagementBoard.add(record);
	}

	public static Map<String, Integer> getTopPostCounts(List<CreatorStats> records, double likeThreshold) {
		Map<String, Integer> result = new LinkedHashMap<String, Integer>();
		for (CreatorStats creatorStats : records) {
			int count = 0;
			for (double like : creatorStats.getWeeklyLikes()) {
              if(like>=likeThreshold)
              {
            	  count++;
              }
			}
			if (count>0) {
				result.put(creatorStats.getCreatorName(), count);
			}
		}
       return result;
	}
	
	public double calculateAverageLikes() {
		double totallikes=0;
		int totalWeeks=0;
		for (CreatorStats creator : engagementBoard) {
            for (double likes : creator.getWeeklyLikes()) {
                totallikes += likes;
                totalWeeks++;
            }
        }
        return totalWeeks > 0 ? totallikes / totalWeeks : 0;

	}
	

}
