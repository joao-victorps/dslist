package com.jvps.dslist.servicies;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.jvps.dslist.dto.GameDTO;
import com.jvps.dslist.dto.GameMinDTO;
import com.jvps.dslist.entities.Game;
import com.jvps.dslist.repositories.GameRepository;

@Service
public class GameService {
	
	@Autowired
	private GameRepository repository;
	
	@Transactional(readOnly = true)
	public List<GameMinDTO> findAll(){
		List<Game> result = repository.findAll();
		List<GameMinDTO> dto = result.stream().map(x -> new GameMinDTO(x)).toList(); //converte (map) o x(GAME) em um novo objeto (->) x(new GameMinDTO) em forma de lista(toList)
		return dto;
	}
	
	@Transactional(readOnly = true)
	public GameDTO findById(Long id) {
		Game result = repository.findById(id).get();
		//convertendo para o DTO
		GameDTO dto = new GameDTO(result);
		return dto;
	}
	
}
