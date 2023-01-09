package br.com.ada.controle.empresarial.controller;


import br.com.ada.controle.empresarial.model.Veiculo;
import br.com.ada.controle.empresarial.service.VeiculoService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

public class VeiculoController {
    private final VeiculoService veiculoService;

    public VeiculoController(VeiculoService veiculoService) {
        this.veiculoService = veiculoService;
    }


    @PostMapping("/veiculos")
    public Veiculo salvar(@RequestBody Veiculo veiculo) {
        return veiculoService.salvarVeiculo(veiculo);
    }

    @GetMapping("/veiculos")
    public List<Veiculo> list() {
        return veiculoService.listarVeiculos();
    }

    @GetMapping("/veiculos/{id}")
    public Veiculo veiculosPorId(@PathVariable Long id) {
        return veiculoService.listarVeiculosPorId(id);
    }

    @DeleteMapping("/veiculos/{id}")
    public void deleteVeiculoPorId(@PathVariable Long id) {
        veiculoService.deletarVeiculosPorId(id);
    }



}

