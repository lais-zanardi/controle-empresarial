package br.com.ada.controle.empresarial.repository;

import br.com.ada.controle.empresarial.model.Usuario;
import org.springframework.data.repository.CrudRepository;

public interface UsuarioRepository extends CrudRepository<Usuario, Long> {
}
