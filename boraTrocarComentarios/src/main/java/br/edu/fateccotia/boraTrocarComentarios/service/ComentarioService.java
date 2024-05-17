package br.edu.fateccotia.boraTrocarComentarios.service;

import br.edu.fateccotia.boraTrocarComentarios.model.Comentario;
import br.edu.fateccotia.boraTrocarComentarios.repository.ComentarioRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ComentarioService {
    @Autowired
    ComentarioRepository comentarioRepository;

    public Comentario save(Comentario comentario) {
        return comentarioRepository.save(comentario);
    }

    public List<Comentario> findByIdPublicacao(String id) {
        return comentarioRepository.findByIdPublicacao(id);
    }
}
