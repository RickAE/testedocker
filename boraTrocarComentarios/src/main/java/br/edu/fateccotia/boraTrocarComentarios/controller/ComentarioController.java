package br.edu.fateccotia.boraTrocarComentarios.controller;

import br.edu.fateccotia.boraTrocarComentarios.model.Comentario;
import br.edu.fateccotia.boraTrocarComentarios.service.ComentarioService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/")
public class ComentarioController {
    @Autowired
    ComentarioService comentarioService;
    @PostMapping("/cadastrar")
    public ResponseEntity<Comentario> save(@RequestBody Comentario comentario) {
        Comentario comentarioCriado = comentarioService.save(comentario);
        return ResponseEntity.status(HttpStatus.CREATED).body(comentarioCriado);
    }

    @GetMapping("/publicacao/{id}")
    public ResponseEntity<List<Comentario>> findByidPublicacao(@PathVariable(name = "id") String id) {
        List<Comentario> comentariosPub = comentarioService.findByIdPublicacao(id);
        return ResponseEntity.status(HttpStatus.OK).body(comentariosPub);
    }
}
