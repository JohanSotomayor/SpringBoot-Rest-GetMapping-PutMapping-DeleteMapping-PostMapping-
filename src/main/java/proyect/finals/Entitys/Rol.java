package proyect.finals.Entitys;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table( name = "ROL" )
public class Rol implements Serializable{
//--------------------------------
//Constantes de la Clase.
//--------------------------------
/**
* Constante de Serializaci�n.
*/
private static final long serialVersionUID = -6362794385792247263L;
//--------------------------------
//Atributos de la Clase.
//--------------------------------
/**
* Identificador del Rol.
*/
private Long id;
/**
* Descripci�n del rol
*/
private String descripcion;
/**
* Sigla que sirve como constante para hacer validaciones en el c�digo.
*/
private String siglaRol;
/**
* Estado del rol
*/
private boolean estado;
//--------------------------------
//Constructor de la Clase.
//--------------------------------
/**
* Constructor por Defecto.
*/
public Rol( ) {
}
//--------------------------------
//M�todos de la Clase.
//--------------------------------
/**
* @return the idRol
*/
@Id
@GeneratedValue(strategy = GenerationType.IDENTITY )
@Column( name = "ID_ROL_PK", nullable = false )
public Long getId( ) {
return id;
}
/**
* @param idRol the idRol to set
*/
public void setId( Long idRol ) {
this.id = idRol;
}
/**
* @return the descripcion
*/
@Column( name = "DESCRIPCION", nullable = false )
public String getDescripcion( ) {
return descripcion;
}
/**
* @param descripcion the descripcion to set
*/
public void setDescripcion( String descripcion ) {
this.descripcion = descripcion;
}
/**
* @return the siglaRol
*/
@Column( name = "SIGLA_ROL")
public String getSiglaRol( ) {
return siglaRol;
}
/**
* @param siglaRol the siglaRol to set
*/
public void setSiglaRol(String siglaRol) {
this.siglaRol = siglaRol;
}
/**
* @return the estado
*/
@Column( name = "ESTADO", nullable = false )
public boolean getEstado( ) {
return estado;
}
/**
* @param estado the estado to set
*/
public void setEstado( boolean estado ) {
this.estado = estado;
}
/* (non-Javadoc)
* @see java.lang.Object#toString()
*/
@Override
public String toString() {
return "Rol [id=" + id + ", descripcion=" + descripcion + ", siglaRol=" + siglaRol + ", estado=" + estado + "]";
}
}
