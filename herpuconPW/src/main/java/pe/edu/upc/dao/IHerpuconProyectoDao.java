package pe.edu.upc.dao;

import java.util.List;

import pe.edu.upc.entities.HerpuconProyecto;

public interface IHerpuconProyectoDao {

	public void insert(HerpuconProyecto hp);

	public List<HerpuconProyecto> list();
}
