package com.itb.inf2dm.smartfishingd.model.services;
import com.itb.inf2dm.smartfishingd.model.entity.UsuarioPesqueiro;
import com.itb.inf2dm.smartfishingd.model.repository.UsuarioPesqueiroRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service

public class UsuarioPesqueiroService {
    @Autowired
    private UsuarioPesqueiroRepository usuarioPesqueiroRepository;

    public List<UsuarioPesqueiro> findAll() {
        return usuarioPesqueiroRepository.findAll();
    }

    public UsuarioPesqueiro save(UsuarioPesqueiro usuarioPesqueiro) {
        usuarioPesqueiroRepository.save(usuarioPesqueiro);
        return usuarioPesqueiroRepository.save(usuarioPesqueiro);
    }

    public UsuarioPesqueiro update(Long id, UsuarioPesqueiro usuarioPesqueiro){
        UsuarioPesqueiro usuarioPesqueiroExistente = findById(id);
        usuarioPesqueiroExistente.setId(id);
        usuarioPesqueiroExistente.setIdPesqueiro(usuarioPesqueiro.getIdPesqueiro());
        usuarioPesqueiroExistente.setIdUsuario(usuarioPesqueiro.getIdUsuario());
        return usuarioPesqueiroRepository.save(usuarioPesqueiroExistente);

    }
    public UsuarioPesqueiro findById(Long id) {
        return usuarioPesqueiroRepository.findById(id)
                .orElseThrow(()-> new RuntimeException("Catalogo nao encontrado com o id " + id));
    }
    public void delete(Long id) {
        UsuarioPesqueiro usuarioPesqueiroExistente = findById(id);
        usuarioPesqueiroRepository.delete(usuarioPesqueiroExistente);
    }
}
