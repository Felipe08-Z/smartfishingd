package com.itb.inf2dm.smartfishingd.services;
import com.itb.inf2dm.smartfishingd.model.entity.Catalogo;
import com.itb.inf2dm.smartfishingd.repository.CatalogoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service

public class CatalogoService {
    @Autowired
    private CatalogoRepository catalogoRepository;
    public List<Catalogo> findAll() {return catalogoRepository.findAll();}

public Catalogo save(Catalogo catalogo) {
        catalogoRepository.save(catalogo);
        return catalogoRepository.save(catalogo);
    }
public Catalogo update(Long id, Catalogo catalogo) {
    Catalogo catalogoExistente = findById(id);
    catalogoExistente.setStatusCatalogo(catalogo.getStatusCatalogo());
    catalogoExistente.setIdPeixe(catalogo.getIdPeixe());
    catalogoExistente.setIdPesqueiro(catalogo.getIdPesqueiro());
    return catalogoRepository.save(catalogoExistente);
    }
    public Catalogo findById(Long id) {
    return catalogoRepository.findById(id)
            .orElseThrow(()-> new RuntimeException("Catalogo nao encontrado com o id " + id));
}
    public void delete(Long id) {
        Catalogo catalogoExistente = findById(id);
        catalogoRepository.delete(catalogoExistente);
    }

}
