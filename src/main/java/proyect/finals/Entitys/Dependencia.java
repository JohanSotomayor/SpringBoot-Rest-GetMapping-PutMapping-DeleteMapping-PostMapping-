package proyect.finals.Entitys;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table( name = "DEPENDENCIA" )
public class Dependencia {

	/**
	* Identificador de la entidad Dependencias
	*/
	private Long id;
	/**
	* Codigo de la dependencia
	*/
	private String codigo;
	/**
	* Descripci�n de la dependencia
	*/
	private String descripcion;
	/**
	* Cargo que dirije la deendencia.
	*/
	private String cargo;
	/**
	* Estado de la dependencia
	*/
	private boolean estado;
	
	public Dependencia() {
		
	}
	
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY )
	@Column( name = "ID_DEPENDENCIA_PK", nullable = false )
	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	@Column( name = "CODIGO", nullable = false )
	public String getCodigo() {
		return codigo;
	}

	public void setCodigo(String codigo) {
		this.codigo = codigo;
	}

	@Column( name = "DESCRIPCION", nullable = false )
	public String getDescripcion() {
		return descripcion;
	}

	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}

	@Column( name = "CARGO", nullable = false )
	public String getCargo() {
		return cargo;
	}

	public void setCargo(String cargo) {
		this.cargo = cargo;
	}

	@Column( name = "ESTADO", nullable = false )
	public boolean Estado() {
		return estado;
	}

	public void setEstado(boolean estado) {
		this.estado = estado;
	}
	
	@Override
	public String toString() {
	return "Dependencia [id=" + id + ", codigo="+codigo+", descripcion=" + descripcion + ", cargo=" + cargo + ", estado=" + estado + "]";
	}
	
	
}
