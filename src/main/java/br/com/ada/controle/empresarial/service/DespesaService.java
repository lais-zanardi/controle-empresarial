package br.com.ada.controle.empresarial.service;

import br.com.ada.controle.empresarial.model.Despesa;
import br.com.ada.controle.empresarial.repository.DespesaRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class DespesaService {
    private final DespesaRepository despesaRepository;

    public DespesaService(DespesaRepository despesaRepository) {
        this.despesaRepository = despesaRepository;
    }

    public Despesa save(Despesa despesa) {
        return despesaRepository.save(despesa);
    }

    public List<Despesa> listAll() {
        return (List<Despesa>) despesaRepository.findAll();
    }

    public Despesa despesasPorNF(Long nf) {
        return despesaRepository.findById(nf).orElse(null);
    }

    public void deleteNF(Long nf) {
        despesaRepository.deleteById(nf);
    }
}
