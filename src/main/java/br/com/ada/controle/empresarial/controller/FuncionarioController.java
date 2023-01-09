package br.com.ada.controle.empresarial.controller;

import br.com.ada.controle.empresarial.model.Funcionario;
import br.com.ada.controle.empresarial.service.FuncionarioService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class FuncionarioController {

        private final FuncionarioService funcionarioService;

        public FuncionarioController(FuncionarioService funcionarioService) {
            this.funcionarioService = funcionarioService;
        }


        @PostMapping("/funcionarios")
        public Funcionario salvar(@RequestBody Funcionario funcionario) {
            return funcionarioService.salvarFuncionario(funcionario);
        }

        @GetMapping("/funcionarios")
        public List<Funcionario> list() {
            return funcionarioService.listarFuncionarios();
        }

        @GetMapping("/funcionarios/{id}")
        public Funcionario funcionarioPorId(@PathVariable Long id) {
            return funcionarioService.listarFuncionariosPorId(id);
        }

        @DeleteMapping("/funcionarios/{id}")
        public void deleteFuncionarioPorId(@PathVariable Long id) {
            funcionarioService.deletarFuncionarios(id);
        }



    }

