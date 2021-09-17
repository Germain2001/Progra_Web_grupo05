package pe.edu.upc.dao;

import java.util.List;

import pe.edu.upc.entities.HerpuconCertification;

public interface IHerpuconCertificationDao {

	public void insert(HerpuconCertification hc);
	
	public List<HerpuconCertification> list();
}
