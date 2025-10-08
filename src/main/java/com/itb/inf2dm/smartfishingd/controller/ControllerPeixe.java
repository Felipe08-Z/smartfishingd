package com.itb.inf2dm.smartfishingd.controller;

import com.itb.inf2dm.smartfishingd.model.entity.Peixe;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.itb.inf2dm.smartfishingd.model.services.PeixeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Map;

@RestController
@RequestMapping("/api/v1/peixe")
public class ControllerPeixe {

    @Autowired
    private PeixeService peixeService;

    @GetMapping
    public ResponseEntity<List<Peixe>> findAll() {
        return ResponseEntity.ok(peixeService.findAll());
    }

    @PostMapping
    public ResponseEntity<Peixe> salvarPeixe(@RequestBody Peixe peixe) {
        Peixe novoPeixe = peixeService.save(peixe);
        return ResponseEntity.status(HttpStatus.CREATED).body(novoPeixe);
    }

    @GetMapping("/{id}")
    public ResponseEntity<Object> listarPeixePorId(@PathVariable String id) {
        try {
            return ResponseEntity.ok(peixeService.findById(Long.parseLong(id)));
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
    public ResponseEntity<Object> atualizarPeixe(@PathVariable String id, @RequestBody Peixe peixe) {
        try {
            return ResponseEntity.ok(peixeService.update(Long.parseLong(id), peixe));
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
    public ResponseEntity<Object> deletarPeixePorId(@PathVariable String id) {
        try {
            peixeService.delete(Long.parseLong(id));
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



