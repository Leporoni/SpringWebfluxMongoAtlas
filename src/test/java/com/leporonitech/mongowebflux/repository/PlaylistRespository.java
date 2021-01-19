package com.leporonitech.mongowebflux.repository;

import com.leporonitech.mongowebflux.document.Playlist;
import org.springframework.data.mongodb.repository.ReactiveMongoRepository;

public interface PlaylistRespository extends ReactiveMongoRepository<Playlist, String> {
}
