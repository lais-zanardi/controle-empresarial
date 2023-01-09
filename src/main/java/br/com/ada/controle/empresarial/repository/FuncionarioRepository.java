package br.com.ada.controle.empresarial.repository;

import br.com.ada.controle.empresarial.model.Funcionario;
import org.springframework.data.repository.CrudRepository;

public interface FuncionarioRepository extends CrudRepository<Funcionario, Long> {
}
