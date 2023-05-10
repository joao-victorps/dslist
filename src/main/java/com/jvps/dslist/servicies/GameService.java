package com.jvps.dslist.servicies;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.jvps.dslist.dto.GameMinDTO;
import com.jvps.dslist.entities.Game;
import com.jvps.dslist.repositories.GameRepository;

@Service
public class GameService {
	
	@Autowired
	private GameRepository repository;
	
	public List<GameMinDTO> findAll(){
		List<Game> result = repository.findAll();
		List<GameMinDTO> dto = result.stream().map(x -> new GameMinDTO(x)).toList(); //converte (map) o x(GAME) em um novo x(new GameMinDTO) em forma de lista(toList)
		return dto;
	}
}
