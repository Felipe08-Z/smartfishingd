package com.itb.inf2dm.smartfishingd.services;
import com.itb.inf2dm.smartfishingd.model.entity.Peixe;
import com.itb.inf2dm.smartfishingd.repository.PeixeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service

public class PeixeService {
    @Autowired
    private PeixeRepository peixeRepository;
    public List<Peixe> findAll() {return peixeRepository.findAll();}

    public Peixe save(Peixe peixe) {
        peixeRepository.save(peixe);
        return peixeRepository.save(peixe);
    }
    public Peixe update(Long id, Peixe peixe) {
        Peixe peixeExistente = findById(id);
        peixeExistente.setStatusPeixe(peixe.getStatusPeixe());
        peixeExistente.setNome(peixe.getNome());
        peixeExistente.setDescricao(peixe.getDescricao());
        peixeExistente.setId(id);
        peixeExistente.setFoto(peixe.getFoto());
        return peixeRepository.save(peixeExistente);
    }
    public Peixe findById(Long id) {
        return peixeRepository.findById(id)
                .orElseThrow(()-> new RuntimeException("Catalogo nao encontrado com o id " + id));
    }
    public void delete(Long id) {
        Peixe peixeExistente = findById(id);
        peixeRepository.delete(peixeExistente);
    }
}
