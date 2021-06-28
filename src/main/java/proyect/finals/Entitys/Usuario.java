package proyect.finals.Entitys;


import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;
import javax.persistence.Table;



@Entity
@Table( name = "USUARIOS" )
public class Usuario implements Serializable{
//--------------------------------
//Constantes de la clase.
//--------------------------------
/**
* Constante de serializaci�n.
*/
private static final long serialVersionUID = 1265660971450473499L;
//--------------------------------
//Atributos de la clase.
//--------------------------------
/**
* Identificador de la entidad UsuarioBO
*/
private Long id;
/**
* Numero de documento de la persona
*/
private String documento;
/**
* Nombre de usuario en el sistema
*/
private String userName;
/**
* Nombre de la persona
*/
private String nombre;
/**
* Email de la persona
*/
private String mail;
/**
* Estado del usuario
*/
private boolean estado;
/**
* RolBO al que pertenece este usuario
*/
private Rol rol;
/**
* DependenciaBO a la que pertenece el usuario.
*/
private Dependencia dependencia;
//--------------------------------
//Constructor de la clase.
//--------------------------------
/**
* Constructor por defecto.
*/
public Usuario( ) {
}

public Usuario(Long id) {
	this.id=id;
}

//--------------------------------
//Metodos de la clase.
//--------------------------------
/**
* @return the id
*/
@Id
@GeneratedValue( strategy = GenerationType.IDENTITY)
@Column( name = "ID_USUARIO_PK", nullable = false )
public Long getId() {
return id;
}
/**
* @param id the id to set
*/
public void setId(Long id) {
this.id = id;
}
/**
* @return the documento
*/
@Column( name = "DOCUMENTO", nullable = false )
public String getDocumento() {
return documento;
}
/**
* @param documento the documento to set
*/
public void setDocumento(String documento) {
this.documento = documento;
}
/**
* @return the userName
*/
@Column( name = "USERNAME", nullable = false, unique = true )
public String getUserName() {
return userName;
}
/**
* @param userName the userName to set
*/
public void setUserName(String userName) {
this.userName = userName;
}
/**
* @return the nombre
*/
@Column( name = "NOMBRE", nullable = false )
public String getNombre() {
return nombre;
}
/**
* @param nombre the nombre to set
*/
public void setNombre(String nombre) {
this.nombre = nombre;
}
/**
* @return the mail
*/
@Column( name = "EMAIL", nullable = false )
public String getMail() {
return mail;
}
/**
* @param mail the mail to set
*/
public void setMail(String mail) {
this.mail = mail;
}
/**
* @return the estado
*/
@Column( name = "ESTADO", nullable = false )
public boolean isEstado() {
return estado;
}
/**
* @param estado the estado to set
*/
public void setEstado(boolean estado) {
this.estado = estado;
}
/**
* @return the rol
*/
@OneToOne
@JoinColumn( name = "ID_ROL_FK", nullable = false )
public Rol getRol() {
return rol;
}
/**
* @param rol the rol to set
*/
public void setRol(Rol rol) {
this.rol = rol;
}
/**
* @return the dependencia
*/
@ManyToOne( fetch = FetchType.EAGER )
@JoinColumn( name = "ID_DEPENDENCIA_FK", nullable = false)
public Dependencia getDependencia( ) {
return dependencia;
}
/**
* @param dependencia the dependencia to set
*/
public void setDependencia( Dependencia dependencia ) {
this.dependencia = dependencia;
}
/* (non-Javadoc)
* @see java.lang.Object#toString()
*/

@Override
public String toString() {
return "UsuarioBO [id=" + id + ", documento=" + documento + ", userName=" + userName + ", nombre=" + nombre + ", mail=" + mail + ", estado=" + estado + ", rol=" + rol + ", dependencia=" + dependencia + "]";
}
}
