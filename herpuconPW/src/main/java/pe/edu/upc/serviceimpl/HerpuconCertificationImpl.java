package pe.edu.upc.serviceimpl;

import java.util.List;

import javax.enterprise.context.RequestScoped;
import javax.inject.Inject;
import javax.inject.Named;

import pe.edu.upc.dao.IHerpuconCertificationDao;
import pe.edu.upc.entities.HerpuconCertification;
import pe.edu.upc.service.IHerpuconCertification;

@Named
@RequestScoped

public class HerpuconCertificationImpl implements IHerpuconCertification {

	@Inject
	private IHerpuconCertificationDao hcdao;

	public void insert(HerpuconCertification hc) {
		// TODO Auto-generated method stub
		hcdao.insert(hc);
	}

	public List<HerpuconCertification> list() {
		// TODO Auto-generated method stub
		return hcdao.list();
	}

}
