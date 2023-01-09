package br.com.ada.controle.empresarial.service;

import br.com.ada.controle.empresarial.model.Funcionario;
import br.com.ada.controle.empresarial.repository.FuncionarioRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class FuncionarioService {

        private final FuncionarioRepository funcionarioRepository;

        public FuncionarioService(FuncionarioRepository funcionarioRepository) {
            this.funcionarioRepository = funcionarioRepository;
        }

        public Funcionario salvarFuncionario(Funcionario funcionario) {
            return funcionarioRepository.save(funcionario);
        }

        public List<Funcionario> listarFuncionarios() {
            return (List<Funcionario>) funcionarioRepository.findAll();
        }

        public Funcionario listarFuncionariosPorId(Long id) {
            return funcionarioRepository.findById(id).orElse(null);
        }

        public void deletarFuncionarios(Long id) {
            funcionarioRepository.deleteById(id);
        }
    }
