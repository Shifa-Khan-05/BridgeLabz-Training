package com.sortingalgorithms.movietime;

class Movie {
    private String movieName;
    private int showTime; 

    public Movie(String movieName, int showTime) {
        this.movieName = movieName;
        this.showTime = showTime;
    }

    public String getMovieName() {
        return movieName;
    }

    public int getShowTime() {
        return showTime;
    }

    @Override
    public String toString() {
        int hours = showTime / 60;
        int minutes = showTime % 60;
        return movieName + " at " +
               String.format("%02d:%02d", hours, minutes);
    }
}
