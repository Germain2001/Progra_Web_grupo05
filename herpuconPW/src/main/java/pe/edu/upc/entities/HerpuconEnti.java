package pe.edu.upc.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name = "Persona")
public class HerpuconEnti {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int Cdni;

	@Column(name = "D_Nombre", nullable = false, length = 45)
	private String D_Nombre;
	@Column(name = "D_Apellido", nullable = false, length = 45)
	private String D_Apellido;
	@Column(name = "N_Celular", nullable = false, length = 45)
	private long N_Celular;
	@Column(name = "T_Email", nullable = false, length = 45)
	private String T_Email;
	@Column(name = "T_Direccion", nullable = false, length = 45)
	private String T_Direccion;
	
	@ManyToOne
	@JoinColumn(name="CCertificacion",nullable=false)
	private HerpuconCertification hc;

	public HerpuconEnti() {
		super();
		// TODO Auto-generated constructor stub
	}

	public HerpuconEnti(int cdni, String d_Nombre, String d_Apellido, long n_Celular, String t_Email,
			String t_Direccion, HerpuconCertification hc) {
		super();
		this.Cdni = cdni;
		this.D_Nombre = d_Nombre;
		this.D_Apellido = d_Apellido;
		this.N_Celular = n_Celular;
		this.T_Email = t_Email;
		this.T_Direccion = t_Direccion;
		this.hc = hc;
	}

	public int getCdni() {
		return Cdni;
	}

	public void setCdni(int cdni) {
		this.Cdni = cdni;
	}

	public String getD_Nombre() {
		return D_Nombre;
	}

	public void setD_Nombre(String d_Nombre) {
		this.D_Nombre = d_Nombre;
	}

	public String getD_Apellido() {
		return D_Apellido;
	}

	public void setD_Apellido(String d_Apellido) {
		this.D_Apellido = d_Apellido;
	}

	public long getN_Celular() {
		return N_Celular;
	}

	public void setN_Celular(long n_Celular) {
		this.N_Celular = n_Celular;
	}

	public String getT_Email() {
		return T_Email;
	}

	public void setT_Email(String t_Email) {
		this.T_Email = t_Email;
	}

	public String getT_Direccion() {
		return T_Direccion;
	}

	public void setT_Direccion(String t_Direccion) {
		this.T_Direccion = t_Direccion;
	}

	public HerpuconCertification getHc() {
		return hc;
	}

	public void setHc(HerpuconCertification hc) {
		this.hc = hc;
	}
	
	
	
}
