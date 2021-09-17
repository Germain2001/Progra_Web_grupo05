package pe.edu.upc.service;

import java.util.List;

import pe.edu.upc.entities.HerpuconCertification;

public interface IHerpuconCertification {

	public void insert(HerpuconCertification hc);
	
	public List<HerpuconCertification> list();
	
}
