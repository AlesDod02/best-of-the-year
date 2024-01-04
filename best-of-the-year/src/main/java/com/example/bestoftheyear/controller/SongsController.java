package com.example.bestoftheyear.controller;
import com.example.bestoftheyear.model.Song;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.ArrayList;
import java.util.List;

@Controller
@RequestMapping("/Songs")

public class SongsController {
    @GetMapping

    private  String getSongs(Model model){
        List<Song> songs = getSongs();
        model.addAttribute("songs", songs);
        return "Songs";

    }
    @GetMapping("/details")
    public String getSongDetails(@RequestParam int id, Model model) {
        Song song = getSongById(id);
                model.addAttribute("song", song);
        return "SongDetails";
    }


    private List<Song> getSongs() {
        List<Song> AllSongs = new ArrayList<>();

        AllSongs.add(new Song(23423, "Canzone1", "Gianna"));
        AllSongs.add(new Song(23454, "Canzone2", "Marco"));
        AllSongs.add(new Song(343636, "Canzone3", "Giovanni"));
        AllSongs.add(new Song(36442325, "Canzone4", "Giorgia"));
        AllSongs.add(new Song(646346, "Canzone5", "Matteo"));

        return AllSongs;
    }
    private Song getSongById(int songId) {
        Song song = null;
        for (Song p : getSongs()) {
            if (p.getId() == songId ){
                song = p;
                break;
            }
        }
        return song;
    }


}
