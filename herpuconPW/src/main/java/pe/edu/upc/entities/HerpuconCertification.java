package pe.edu.upc.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="Certificacion")
public class HerpuconCertification {

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int CCertificacion;
	
	@Column(name="I_TipoCertificacion",nullable=false,length=40)
	private String I_TipoCertificacion;
	
	@Column(name="Vigencia",nullable=false,length=40)
	private String Vigencia;
	
    @Column(name="F_FechaCertificacion",nullable=false,length=40)	
	private String F_FechaCertificacion;
    
	@Column(name="F_ValidoHasta",nullable=false,length=40)
	private String F_ValidoHasta;

	public HerpuconCertification() {
		super();
		// TODO Auto-generated constructor stub
	}

	public HerpuconCertification(int cCertificacion, String i_TipoCertificacion, String vigencia,
			String f_FechaCertificacion, String f_ValidoHasta) {
		super();
		this.CCertificacion = cCertificacion;
		this.I_TipoCertificacion = i_TipoCertificacion;
		this.Vigencia = vigencia;
		this.F_FechaCertificacion = f_FechaCertificacion;
		this.F_ValidoHasta = f_ValidoHasta;
	}

	public int getCCertificacion() {
		return CCertificacion;
	}

	public void setCCertificacion(int cCertificacion) {
		this.CCertificacion = cCertificacion;
	}

	public String getI_TipoCertificacion() {
		return I_TipoCertificacion;
	}

	public void setI_TipoCertificacion(String i_TipoCertificacion) {
		this.I_TipoCertificacion = i_TipoCertificacion;
	}

	public String getVigencia() {
		return Vigencia;
	}

	public void setVigencia(String vigencia) {
		this.Vigencia = vigencia;
	}

	public String getF_FechaCertificacion() {
		return F_FechaCertificacion;
	}

	public void setF_FechaCertificacion(String f_FechaCertificacion) {
		this.F_FechaCertificacion = f_FechaCertificacion;
	}

	public String getF_ValidoHasta() {
		return F_ValidoHasta;
	}

	public void setF_ValidoHasta(String f_ValidoHasta) {
		this.F_ValidoHasta = f_ValidoHasta;
	}
	
	
	
	
}
