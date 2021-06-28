package proyect.finals.controller;

import java.util.List;

import javax.websocket.server.PathParam;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.HttpStatusCodeException;

import proyect.finals.Entitys.Usuario;
import proyect.finals.service.IUsuarioService;

@RestController
@RequestMapping("/api")
public class Controller {
	
	

@Autowired
private IUsuarioService usuarioService;


@GetMapping("/usuario")
public List<Usuario> index(){
return usuarioService.findAll();
}


@GetMapping("usuario/{id}")
public @ResponseBody ResponseEntity<Usuario> getById(@PathVariable Usuario id) {
  return new ResponseEntity<Usuario>(id, HttpStatus.OK);

}

@PostMapping("/usuario")
public Usuario create(@RequestBody Usuario usuario){
return usuarioService.create(usuario);
}

@DeleteMapping("/usuario/{id}")
ResponseEntity deleteUser(@PathVariable Long id) {
	usuarioService.remove(id);
	return new ResponseEntity(HttpStatus.NO_CONTENT);
}

@PutMapping("usuario/{id}")
ResponseEntity<Usuario> UpdateUs(@RequestBody Usuario usuario, @PathVariable Long id){
	
	return new ResponseEntity<>(usuarioService.update(usuario, id), HttpStatus.OK);
}


	
}
