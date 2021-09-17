package pe.edu.upc.entities;


import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="Proyecto")
public class HerpuconProyecto {

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int CProyecto;
	
	@Column(name="D_NombreProyecto",nullable=false,length=45)
	private String D_NombreProyecto;
		
	@Column(name="F_InicioProyecto",nullable=false,length=30)
	private String F_InicioProyecto;
	
	@Column(name="F_EntregaProyecto",nullable=false,length=30)
	private String F_EntregaProyecto;
	
	@Column(name="I_TipoProyecto",nullable=false,length=40)
	private String I_TipoProyecto;

	public HerpuconProyecto() {
		super();
		// TODO Auto-generated constructor stub
	}

	public HerpuconProyecto(int cProyecto, String d_NombreProyecto, String f_InicioProyecto, String f_EntregaProyecto,
			String i_TipoProyecto) {
		super();
		this.CProyecto = cProyecto;
		this.D_NombreProyecto = d_NombreProyecto;
		this.F_InicioProyecto = f_InicioProyecto;
		this.F_EntregaProyecto = f_EntregaProyecto;
		this.I_TipoProyecto = i_TipoProyecto;
	}

	public int getCProyecto() {
		return CProyecto;
	}

	public void setCProyecto(int cProyecto) {
		this.CProyecto = cProyecto;
	}

	public String getD_NombreProyecto() {
		return D_NombreProyecto;
	}

	public void setD_NombreProyecto(String d_NombreProyecto) {
		this.D_NombreProyecto = d_NombreProyecto;
	}

	public String getF_InicioProyecto() {
		return F_InicioProyecto;
	}

	public void setF_InicioProyecto(String f_InicioProyecto) {
		this.F_InicioProyecto = f_InicioProyecto;
	}

	public String getF_EntregaProyecto() {
		return F_EntregaProyecto;
	}

	public void setF_EntregaProyecto(String f_EntregaProyecto) {
		this.F_EntregaProyecto = f_EntregaProyecto;
	}

	public String getI_TipoProyecto() {
		return I_TipoProyecto;
	}

	public void setI_TipoProyecto(String i_TipoProyecto) {
		this.I_TipoProyecto = i_TipoProyecto;
	}
	
	
	
}
