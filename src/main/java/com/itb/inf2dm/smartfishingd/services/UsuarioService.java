package com.itb.inf2dm.smartfishingd.services;
import com.itb.inf2dm.smartfishingd.model.entity.Usuario;
import com.itb.inf2dm.smartfishingd.repository.UsuarioRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service

public class UsuarioService {
    @Autowired
    private UsuarioRepository usuarioRepository;

    public List<Usuario> findAll() {
        return usuarioRepository.findAll();
    }

    public Usuario save(Usuario usuario) {
        usuarioRepository.save(usuario);
        return usuarioRepository.save(usuario);
    }

    public Usuario update(Long id, Usuario usuario) {
        Usuario usuarioExistente = findById(id);
        usuarioExistente.setNome(usuario.getNome());
        usuarioExistente.setEmail(usuario.getEmail());
        usuarioExistente.setSenha(usuario.getSenha());
        usuarioExistente.setId(usuario.getId());
        usuarioExistente.setFoto(usuario.getFoto());
        usuarioExistente.setNivelAcesso(usuario.getNivelAcesso());
        usuarioExistente.setStatusUsuario(usuario.getStatusUsuario());
        usuarioExistente.setDataCadastro(usuario.getDataCadastro());
        return usuarioRepository.save(usuarioExistente);
    }
    public Usuario findById(Long id) {
        return usuarioRepository.findById(id)
                .orElseThrow(()-> new RuntimeException("Catalogo nao encontrado com o id " + id));
    }
    public void delete(Long id) {
        Usuario usuarioExistente = findById(id);
        usuarioRepository.delete(usuarioExistente);
    }
}