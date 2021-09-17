package pe.edu.upc.serviceimpl;

import java.util.List;

import javax.enterprise.context.RequestScoped;
import javax.inject.Inject;
import javax.inject.Named;

import pe.edu.upc.dao.IHerpuconDao;
import pe.edu.upc.entities.HerpuconEnti;
import pe.edu.upc.service.IHerpuconService;

@Named
@RequestScoped
public class HerpuconServiceImpl implements IHerpuconService {

	@Inject
	private IHerpuconDao hpdao;

	public void insert(HerpuconEnti he) {
		// TODO Auto-generated method stub
		hpdao.insert(he);

	}

	public List<HerpuconEnti> list() {
		// TODO Auto-generated method stub
		return hpdao.list();
	}

}
