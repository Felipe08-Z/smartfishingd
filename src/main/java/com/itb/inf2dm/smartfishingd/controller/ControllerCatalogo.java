package com.itb.inf2dm.smartfishingd.controller;

import com.itb.inf2dm.smartfishingd.model.entity.Catalogo;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.itb.inf2dm.smartfishingd.model.services.CatalogoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Map;


@RestController
@RequestMapping("/api/v1/catalogo")
public class ControllerCatalogo {
    @Autowired
    private CatalogoService catalogoService;

    @GetMapping
    public ResponseEntity<List<Catalogo>> findAll() {
        return ResponseEntity.ok(catalogoService.findAll());
    }

    @PostMapping
    public ResponseEntity<Catalogo> salvarCatalogo(@RequestBody Catalogo catalogo) {
        Catalogo novoCatalogo = catalogoService.save(catalogo);
        return ResponseEntity.status(HttpStatus.CREATED).body(novoCatalogo);
    }

    @GetMapping("/{id}")
    public ResponseEntity<Object> listarCatalogoPorId(@PathVariable String id) {
        try {
            return ResponseEntity.ok(catalogoService.findById(Long.parseLong(id)));
        } catch (NumberFormatException e) {
            return ResponseEntity.badRequest().body(
                    Map.of(
                            "status", 400,
                            "error", "bad request",
                            "message", "o id não é valido" + id
                    )
            );
        } catch (RuntimeException e) {
            return ResponseEntity.status(404).body(
                    Map.of(
                            "status", 400,
                            "error", "badrequest",
                            "message", "o id nao e valido" + id
                    )
            );
        }
    }

    @PutMapping("/{id}")
    public ResponseEntity<Object> atualizarCatalogo(@PathVariable String id, @RequestBody Catalogo catalogo) {
        try {
            return ResponseEntity.ok(catalogoService.update(Long.parseLong(id), catalogo));
        } catch (NumberFormatException e) {
            return ResponseEntity.badRequest().body(
                    Map.of(
                            "status", 400,
                            "error", "Bad Request",
                            "message", "O id informado não é válido: " + id
                    )
            );

        } catch (RuntimeException e) {
            return ResponseEntity.status(404).body(
                    Map.of(
                            "status", 404,
                            "error", "Not Found",
                            "message", "Produto não encontrado com o id: " + id
                    )
            );
        }
    }
    @DeleteMapping("/{id}")
    public ResponseEntity<Object> deletarCatalogoPorId(@PathVariable String id) {
        try {
            catalogoService.delete(Long.parseLong(id));
            return ResponseEntity.ok().body(
                    Map.of(
                            "status", 200,
                            "message", "Produto excluído com sucesso!"
                    ));
        }
        catch (NumberFormatException e) {
            return ResponseEntity.badRequest().body(
                    Map.of(
                            "status", 400,
                            "error", "Bad Request",
                            "message", "O id informado não é válido: " + id
                    )
            );
        }
        catch (RuntimeException e) {
            return ResponseEntity.status(404).body(
                    Map.of(
                            "status", 404,
                            "error", "Not Found",
                            "message", "Produto não encontrado com o id: " + id
                    )
            );
        }
    }
}