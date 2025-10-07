package com.itb.inf2dm.smartfishingd.services;
import com.itb.inf2dm.smartfishingd.model.entity.Pesqueiro;
import com.itb.inf2dm.smartfishingd.model.entity.Pesqueiro;
import com.itb.inf2dm.smartfishingd.repository.PesqueiroRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class PesqueiroService {
    @Autowired
    private PesqueiroRepository pesqueiroRepository;
    public List<Pesqueiro> findAll() {return pesqueiroRepository.findAll();}

    public Pesqueiro save(Pesqueiro pesqueiro) {
        pesqueiroRepository.save(pesqueiro);
        return pesqueiroRepository.save(pesqueiro);
    }
    public Pesqueiro update (Long id, Pesqueiro pesqueiro) {
    Pesqueiro pesqueiroExistente = findById(id);
    pesqueiroExistente.setNome(pesqueiro.getNome());
    pesqueiroExistente.setCep(pesqueiro.getCep());
    pesqueiroExistente.setNumero(pesqueiro.getNumero());
    pesqueiroExistente.setComplemento(pesqueiro.getComplemento());
    pesqueiroExistente.setDescricao(pesqueiro.getDescricao());
    pesqueiroExistente.setTelefone(pesqueiro.getTelefone());
    pesqueiroExistente.setId(pesqueiro.getId());
    pesqueiroExistente.setDataCadastro(pesqueiro.getDataCadastro());
    pesqueiroExistente.setStatusPesqueiro(pesqueiro.getStatusPesqueiro());
    pesqueiroExistente.setFoto(pesqueiro.getFoto());
    pesqueiroExistente.setInformacao(pesqueiro.getInformacao());
    pesqueiroExistente.setMapa(pesqueiro.getMapa());
        return pesqueiroRepository.save(pesqueiroExistente);
    }
    public Pesqueiro findById(Long id) {
        return pesqueiroRepository.findById(id)
                .orElseThrow(()-> new RuntimeException("Catalogo nao encontrado com o id " + id));
    }
    public void delete(Long id) {
        Pesqueiro pesqueiroExistente = findById(id);
        pesqueiroRepository.delete(pesqueiroExistente);
    }

}
