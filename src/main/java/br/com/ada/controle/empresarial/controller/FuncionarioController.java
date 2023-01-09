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
            return funcionarioService.save(funcionario);
        }

        @GetMapping("/funcionarios")
        public List<Funcionario> list() {
            return funcionarioService.listAll();
        }

        @GetMapping("/funcionarios/{id}")
        public Funcionario usuarioPorId(@PathVariable Long id) {
            return funcionarioService.listById(id);
        }

        @DeleteMapping("/funcionarios/{id}")
        public void deleteUsuarioPorId(@PathVariable Long id) {
            funcionarioService.deleteById(id);
        }



    }

}
