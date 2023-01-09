package br.com.ada.controle.empresarial.service;

import br.com.ada.controle.empresarial.model.Veiculo;
import br.com.ada.controle.empresarial.repository.VeiculoRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class VeiculoService {
    private final VeiculoRepository veiculoRepository;

    public VeiculoService(VeiculoRepository veiculoRepository) {
        this.veiculoRepository = veiculoRepository;
    }

    public Veiculo salvarVeiculo(Veiculo veiculo) {
        return veiculoRepository.save(veiculo);
    }

    public List<Veiculo> listarVeiculos() {
        return (List<Veiculo>) veiculoRepository.findAll();
    }

    public Veiculo listarVeiculosPorId(Long id) {
        return veiculoRepository.findById(id).orElse(null);
    }

    public void deletarVeiculosPorId(Long id) {
        veiculoRepository.deleteById(id);
    }
}


