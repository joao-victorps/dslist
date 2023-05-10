package com.jvps.dslist.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.jvps.dslist.entities.Game;

public interface GameRepository extends JpaRepository<Game,Long> {

}
