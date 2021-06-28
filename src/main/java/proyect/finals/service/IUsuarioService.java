package proyect.finals.service;

import java.util.List;

//import org.springframework.web.bind.annotation.RequestBody;

import proyect.finals.Entitys.Usuario;
import proyect.finals.dao.IUsuarioDao;


public interface IUsuarioService {
	

public List<Usuario> findAll();
//public Usuario findId(Long id, Usuario usuario);
public Usuario create(Usuario usuario);
public void remove(Long id);

//clienteDao.delete((id));
//}
public Usuario update(Usuario usuario, Long id);



}
