package proyect.finals.implement;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.RequestBody;

import proyect.finals.Entitys.Usuario;
import proyect.finals.dao.IUsuarioDao;
import proyect.finals.service.IUsuarioService;

@Service
public class ClienteServices implements IUsuarioService{
	
@Autowired
private IUsuarioDao clienteDao;


@Transactional(readOnly = true)
public List<Usuario> findAll() {
return (List<Usuario>) clienteDao.findAll();
}


//public Usuario findId(Long id, Usuario usuario) {
//return usuario;
//}


@Transactional(readOnly = false)
public Usuario create(@RequestBody Usuario usuario ){
System.out.println(usuario.getDependencia());
return clienteDao.save(usuario);
}


public void remove(Long id){
  clienteDao.delete(new Usuario(id));
 }

public Usuario update(Usuario usuario, Long id) {
	
 return
	clienteDao.findById(id)  
	.map(
			
			User -> {
				
				  User.setDocumento(usuario.getDocumento());
		          User.setUserName(usuario.getUserName());
				   User.setNombre(usuario.getNombre());
				   User.setMail(usuario.getMail());
				   User.setRol(usuario.getRol());
				   User.setDependencia(usuario.getDependencia());
				  
			 return clienteDao.save(User);
				    
			}
			
			).get();

}


}
