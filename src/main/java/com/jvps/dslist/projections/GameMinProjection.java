package com.jvps.dslist.projections;

public interface GameMinProjection {
	
	//Colocando os metodos para a consulta em SQL nativo no repositorio
	Long getId();
	String getTitle();
	Integer getYear();
	String getImgUrl();
	String getShortDescription();
	Integer getPosition();
	
}
