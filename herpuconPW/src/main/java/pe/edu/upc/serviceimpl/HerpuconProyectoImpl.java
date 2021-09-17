package pe.edu.upc.serviceimpl;

import java.util.List;

import javax.enterprise.context.RequestScoped;
import javax.inject.Inject;
import javax.inject.Named;

import pe.edu.upc.dao.IHerpuconProyectoDao;
import pe.edu.upc.entities.HerpuconProyecto;
import pe.edu.upc.service.IHerpuconProyecto;

@Named
@RequestScoped
public class HerpuconProyectoImpl implements IHerpuconProyecto {

	@Inject
	private IHerpuconProyectoDao hepodao;
	public void insert(HerpuconProyecto hp) {
		// TODO Auto-generated method stub
		hepodao.insert(hp);
	}

	public List<HerpuconProyecto> list() {
		// TODO Auto-generated method stub
		return hepodao.list();
	}

}
