package pe.edu.upc.controller;

import java.util.ArrayList;
import java.util.List;

import javax.annotation.PostConstruct;
import javax.enterprise.context.RequestScoped;
import javax.inject.Inject;
import javax.inject.Named;

import pe.edu.upc.entities.HerpuconProyecto;
import pe.edu.upc.service.IHerpuconProyecto;

@Named
@RequestScoped
public class HerpuconProyectoController {

	@Inject
	private IHerpuconProyecto herpuservice;

	private HerpuconProyecto herpuproyenti;
	List<HerpuconProyecto> listaProyectos;

	@PostConstruct
	public void init() {
		this.herpuproyenti = new HerpuconProyecto();
		this.listaProyectos = new ArrayList<HerpuconProyecto>();
		this.list();
	}

	public String nuevoProyecto() {
		this.setHerpuproyenti(new HerpuconProyecto());
		return "proyecto.xhtml";
	}
	public void insert() {
		herpuservice.insert(herpuproyenti);
		this.list();
	}

	public void list() {
		listaProyectos = herpuservice.list();
	}

	// getters & setters
	public HerpuconProyecto getHerpuproyenti() {
		return herpuproyenti;
	}

	public void setHerpuproyenti(HerpuconProyecto herpuproyenti) {
		this.herpuproyenti = herpuproyenti;
	}

	public List<HerpuconProyecto> getListaProyectos() {
		return listaProyectos;
	}

	public void setListaProyectos(List<HerpuconProyecto> listaProyectos) {
		this.listaProyectos = listaProyectos;
	}

}
