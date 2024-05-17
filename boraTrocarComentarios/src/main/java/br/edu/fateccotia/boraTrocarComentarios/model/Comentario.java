package br.edu.fateccotia.boraTrocarComentarios.model;

import lombok.Data;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.mongodb.core.mapping.MongoId;

import java.util.List;

@Document
@Data
public class Comentario {
    @MongoId
    private String idComentario;
    private String idPublicacao;
    private String idUsuario;
    private String comentario;

}
