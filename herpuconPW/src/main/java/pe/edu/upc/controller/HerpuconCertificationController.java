package pe.edu.upc.controller;

import java.util.ArrayList;
import java.util.List;

import javax.annotation.PostConstruct;
import javax.enterprise.context.RequestScoped;
import javax.inject.Inject;
import javax.inject.Named;

import pe.edu.upc.entities.HerpuconCertification;
import pe.edu.upc.service.IHerpuconCertification;

@Named
@RequestScoped
public class HerpuconCertificationController {

	@Inject
	private IHerpuconCertification herpuservice;
	
	private HerpuconCertification herpuconcerti;
	List<HerpuconCertification> listacertificados;
	
	@PostConstruct
	public void init() {
		this.herpuconcerti=new HerpuconCertification();
		this.listacertificados= new ArrayList<HerpuconCertification>();
		this.list();
	}
	public String nuevoCertificado() {
		this.setHerpuconcerti(new HerpuconCertification());
		return "vaccination.xhtml";
	}
	public void insert() {
		herpuservice.insert(herpuconcerti);
		this.list();
	}
	public void list() {
		listacertificados = herpuservice.list();
	}

	public HerpuconCertification getHerpuconcerti() {
		return herpuconcerti;
	}

	public void setHerpuconcerti(HerpuconCertification herpuconcerti) {
		this.herpuconcerti = herpuconcerti;
	}

	public List<HerpuconCertification> getListacertificados() {
		return listacertificados;
	}

	public void setListacertificados(List<HerpuconCertification> listacertificados) {
		this.listacertificados = listacertificados;
	}
	
}
