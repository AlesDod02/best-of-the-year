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
        List<Song> Songs = getSongs();
        model.addAttribute("songs", Songs);
        return "Songs";

    }


    //private String getSongsTitles(@RequestParam List<Song>Songs, Model model){
      //  model.addAttribute("getTitles",  )
    //}
    @GetMapping("/titles")
    private String getTitles(List<Song> Songs, Model model){

        for (int i = 0; i < Songs.size() ; i++) {
            return Songs.get(i).getTitle();




        }
        model.addAttribute("title", Songs.getTitle());
        return "Songs";


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


}
