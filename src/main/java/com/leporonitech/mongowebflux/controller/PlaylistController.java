package com.leporonitech.mongowebflux.controller;

import com.leporonitech.mongowebflux.document.Playlist;
import com.leporonitech.mongowebflux.service.PlaylistService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

//@RestController
public class PlaylistController {

    @Autowired
    PlaylistService playlistService;

    @GetMapping(value = "/playlist")
    public Flux<Playlist> getPlaylist(){
        return playlistService.findAll();
    }

    @GetMapping(value = "/playlist/{id}")
    public Mono<Playlist> getPlaylistId(@PathVariable String id){
        return playlistService.findById(id);
    }

    @PostMapping(value = "/playlist")
    public Mono<Playlist> save(@RequestBody Playlist playlist) {
        return playlistService.save(playlist);
    }
}
