package br.com.ada.controle.empresarial.service;

import br.com.ada.controle.empresarial.model.Usuario;
import br.com.ada.controle.empresarial.repository.UsuarioRepository;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class UsuarioService {
    private final UsuarioRepository usuarioRepository;

    public UsuarioService(UsuarioRepository usuarioRepository) {
        this.usuarioRepository = usuarioRepository;
    }

    public Usuario save(Usuario usuario) {
        return usuarioRepository.save(usuario);
    }

    public List<Usuario> listAll() {
        return (List<Usuario>) usuarioRepository.findAll();
    }

    public Usuario listById(Long id) {
        return usuarioRepository.findById(id).orElse(null);
    }

    public void deleteById(Long id) {
        usuarioRepository.deleteById(id);
    }
}
