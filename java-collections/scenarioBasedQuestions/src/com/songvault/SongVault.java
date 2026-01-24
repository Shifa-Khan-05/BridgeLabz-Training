package com.songvault;


import java.io.*;
import java.util.*;
import java.util.regex.*;

public class SongVault {

    public static void main(String[] args) throws Exception {

        List<Song<?>> songs = new ArrayList<>();
        Map<String, List<Song<?>>> genreMap = new HashMap<>();
        Set<String> artists = new HashSet<>();

        BufferedReader br =
                new BufferedReader(
                        new FileReader("C:\\Users\\HP\\Desktop\\Java Programming Workspace\\java-collections\\scenarioBasedQuestions\\src\\com\\songvault\\song.txt"));

        String line, title = "", artist = "", genre = "";

        while ((line = br.readLine()) != null) {
            if (line.startsWith("Title")) title = line.split(": ")[1];
            if (line.startsWith("Artist")) artist = line.split(": ")[1];
            if (line.startsWith("Genre")) genre = line.split(": ")[1];
        }

        Song<?> s = new Song<>(title, artist, genre);
        songs.add(s);
        artists.add(artist);

        genreMap.computeIfAbsent(genre,
                k -> new ArrayList<>()).add(s);

        System.out.println("Artists: " + artists);
    }
}
