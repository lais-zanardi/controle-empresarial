package br.com.ada.controle.empresarial.repository;

import br.com.ada.controle.empresarial.model.Despesa;
import org.springframework.data.repository.CrudRepository;

public interface DespesaRepository extends CrudRepository<Despesa, Long> {
}
