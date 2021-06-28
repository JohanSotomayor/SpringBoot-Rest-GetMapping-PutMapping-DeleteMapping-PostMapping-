package proyect.finals.dao;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

import proyect.finals.Entitys.Usuario;

public interface IUsuarioDao extends CrudRepository<Usuario, Long> {


	
}