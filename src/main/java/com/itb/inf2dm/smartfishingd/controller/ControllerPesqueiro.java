package com.itb.inf2dm.smartfishingd.controller;

import com.itb.inf2dm.smartfishingd.model.entity.Pesqueiro;
import com.itb.inf2dm.smartfishingd.model.services.PesqueiroService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Map;

@RestController
@RequestMapping("/api/v1/pesqueiro")
public class ControllerPesqueiro {
    @Autowired
    private PesqueiroService pesqueiroService;

    @GetMapping
    public ResponseEntity<List<Pesqueiro>> findAll() {
        return ResponseEntity.ok(pesqueiroService.findAll());
    }

    @PostMapping
    public ResponseEntity<Pesqueiro> salvarPesqueiro(@RequestBody Pesqueiro pesqueiro) {
        Pesqueiro novoPesqueiro = pesqueiroService.save(pesqueiro);
        return ResponseEntity.status(HttpStatus.CREATED).body(novoPesqueiro);
    }

    @GetMapping("/{id}")
    public ResponseEntity<Object> listarPesqueiroPorId(@PathVariable String id) {
                try {
                    return ResponseEntity.ok(pesqueiroService.findById(Long.parseLong(id)));
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
    public ResponseEntity<Object> atualizarPesqueiro(@PathVariable String id, @RequestBody Pesqueiro pesqueiro) {
        try {
            return ResponseEntity.ok(pesqueiroService.update(Long.parseLong(id), pesqueiro));
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
    public ResponseEntity<Object> deletarPesqueiroPorId(@PathVariable String id) {
        try {
            pesqueiroService.delete(Long.parseLong(id));
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
