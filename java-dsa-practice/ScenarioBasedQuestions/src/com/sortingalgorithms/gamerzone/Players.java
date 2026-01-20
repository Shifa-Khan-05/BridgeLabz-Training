package com.sortingalgorithms.gamerzone;

public class Players {
    private String playerId;
    private int scores;

    public Players(String playerId, int scores) {
        this.playerId = playerId;
        this.scores = scores;
    }

    int getScores() {
        return scores;
    }

    @Override
    public String toString() {
        return playerId + " | Score: " + scores;
    }
}
