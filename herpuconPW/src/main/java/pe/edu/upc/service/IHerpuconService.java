package pe.edu.upc.service;

import java.util.List;

import pe.edu.upc.entities.HerpuconEnti;

public interface IHerpuconService {

	public void insert(HerpuconEnti he);
	
	public List<HerpuconEnti>list();
}
