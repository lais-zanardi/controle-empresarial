package br.com.ada.controle.empresarial.controller;

import br.com.ada.controle.empresarial.model.Despesa;
import br.com.ada.controle.empresarial.model.Usuario;
import br.com.ada.controle.empresarial.service.DespesaService;
import br.com.ada.controle.empresarial.service.UsuarioService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class DespesaController {
    private final DespesaService despesaService;

    public DespesaController(DespesaService despesaService) {
        this.despesaService = despesaService;
    }


    @PostMapping("/despesas")
    public Despesa salvar(@RequestBody Despesa despesa) {
        return despesaService.salvarDespesa(despesa);
    }

    @GetMapping("/despesas")
    public List<Despesa> list() {
        return despesaService.listarDespesas();
    }

    @GetMapping("/despesas/{nf}")
    public Despesa despesasPorNF(@PathVariable Long nf) {
        return despesaService.listarDespesasPorNF(nf);
    }

    @DeleteMapping("/despesas/{nf}")
    public void deleteNF(@PathVariable Long nf) {
        despesaService.deleteNF(nf);
    }



}
