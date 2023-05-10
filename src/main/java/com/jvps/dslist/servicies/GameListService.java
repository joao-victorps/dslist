package com.jvps.dslist.servicies;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.jvps.dslist.dto.GameListDTO;
import com.jvps.dslist.entities.GameList;
import com.jvps.dslist.repositories.GameListRepository;

@Service
public class GameListService {
	
	@Autowired
	private GameListRepository repository;
	
	@Transactional(readOnly = true)
	public List<GameListDTO> findAll(){
		List<GameList> result = repository.findAll();
		List<GameListDTO> dto = result.stream().map(x -> new GameListDTO(x)).toList(); //converte (map) o x(GAME) em um novo objeto (->) x(new GameMinDTO) em forma de lista(toList)
		return dto;
	}
	
	
}
