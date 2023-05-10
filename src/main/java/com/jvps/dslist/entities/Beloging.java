package com.jvps.dslist.entities;

import java.util.Objects;

import jakarta.persistence.EmbeddedId;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;


@Entity
@Table(name ="tb_belonging")
public class Beloging {
	
	@EmbeddedId
	private BelogingPK id = new BelogingPK();
	
	private Integer position;
	
	public Beloging() {
	}

	public Beloging(Game game, GameList list, Integer position) {
		id.setGame(game);
		id.setList(list);
		this.position = position;
	}

	public BelogingPK getId() {
		return id;
	}

	public void setId(BelogingPK id) {
		this.id = id;
	}

	public Integer getPosition() {
		return position;
	}

	public void setPosition(Integer position) {
		this.position = position;
	}

	@Override
	public int hashCode() {
		return Objects.hash(id);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Beloging other = (Beloging) obj;
		return Objects.equals(id, other.id);
	}
	
	
}
