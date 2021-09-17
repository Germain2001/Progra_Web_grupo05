package pe.edu.upc.service;

import java.util.List;

import pe.edu.upc.entities.HerpuconProyecto;

public interface IHerpuconProyecto {

	public void insert(HerpuconProyecto hp);
	
	public List<HerpuconProyecto> list();
	
}
