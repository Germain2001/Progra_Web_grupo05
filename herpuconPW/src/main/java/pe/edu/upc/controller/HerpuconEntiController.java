package pe.edu.upc.controller;

import java.util.ArrayList;
import java.util.List;

import javax.annotation.PostConstruct;
import javax.enterprise.context.RequestScoped;
import javax.inject.Inject;
import javax.inject.Named;

import pe.edu.upc.entities.HerpuconEnti;
import pe.edu.upc.service.IHerpuconService;

@Named
@RequestScoped
public class HerpuconEntiController {
	
	@Inject
	private IHerpuconService herpuservice;
	
	//atributos
	private HerpuconEnti herpuconenti;
	List<HerpuconEnti>listaPersona;
	
	//constructor
	@PostConstruct
	public void init() {
		this.herpuconenti=new HerpuconEnti();
		this.listaPersona=new ArrayList<HerpuconEnti>();
		this.list();
	}
	
	public String nuevaPersona() {
		this.setHerpuconenti(new HerpuconEnti());
		return "persona.xhtml";
	}
	public void insert() {
		herpuservice.insert(herpuconenti);
		this.list();
	}
	
	public void list() {
		listaPersona=herpuservice.list();
	}
	//getter & setters

	public HerpuconEnti getHerpuconenti() {
		return herpuconenti;
	}

	public void setHerpuconenti(HerpuconEnti herpuconenti) {
		this.herpuconenti = herpuconenti;
	}

	public List<HerpuconEnti> getListaPersona() {
		return listaPersona;
	}

	public void setListaPersona(List<HerpuconEnti> listaPersona) {
		this.listaPersona = listaPersona;
	}
	
	
	
	
	

}
