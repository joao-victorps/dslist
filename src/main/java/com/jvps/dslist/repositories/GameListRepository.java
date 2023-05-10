package com.jvps.dslist.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.jvps.dslist.entities.GameList;

public interface GameListRepository extends JpaRepository<GameList,Long> {

}
