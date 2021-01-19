package com.leporonitech.mongowebflux;

import com.leporonitech.mongowebflux.document.Playlist;
import com.leporonitech.mongowebflux.repository.PlaylistRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;
import reactor.core.publisher.Flux;
import java.util.UUID;

//@Component
//public class DummyData implements CommandLineRunner {
//
//	private final PlaylistRepository playlistRepository;
//
//    DummyData(PlaylistRepository playlistRepository) {
//        this.playlistRepository = playlistRepository;
//    }
//
//    @Override
//    public void run(String... args) throws Exception {
//
//    	playlistRepository.deleteAll()
//                .thenMany(
//                        Flux.just("Fear Of The Dark", "Number Of The Beast", "Brave New World", "Killers",
//                                "Ghost Of Navigator", "Sun And Steel", "The Thin Line Between Love And Hate")
//                                .map(nome -> new Playlist(UUID.randomUUID().toString(), nome))
//                                .flatMap(playlistRepository::save))
//                .subscribe(System.out::println);
//    }
//}
