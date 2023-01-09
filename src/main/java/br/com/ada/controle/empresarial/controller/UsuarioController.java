package br.com.ada.controle.empresarial.controller;

import br.com.ada.controle.empresarial.model.Usuario;
import br.com.ada.controle.empresarial.service.UsuarioService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class UsuarioController {
    private final UsuarioService usuarioService;

    public UsuarioController(UsuarioService usuarioService) {
        this.usuarioService = usuarioService;
    }


    @PostMapping("/usuarios")
    public Usuario salvar(@RequestBody Usuario usuario) {
        return usuarioService.save(usuario);
    }

    @GetMapping("/usuarios")
    public List<Usuario> list() {
        return usuarioService.listAll();
    }

    @GetMapping("/usuarios/{id}")
    public Usuario usuarioPorId(@PathVariable Long id) {
        return usuarioService.listById(id);
    }

    @DeleteMapping("/usuarios/{id}")
    public void deleteUsuarioPorId(@PathVariable Long id) {
        usuarioService.deleteById(id);
    }



}
