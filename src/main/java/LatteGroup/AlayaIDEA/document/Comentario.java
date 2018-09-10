package LatteGroup.AlayaIDEA.document;

import com.fasterxml.jackson.annotation.JsonIgnore;
import org.springframework.data.mongodb.core.mapping.DBRef;

import javax.persistence.Id;

public class Comentario {

    @Id
    private String id;

    private String texto;
    private Usuario autor;

    @DBRef
    private Idea idea;

    public Comentario() {}

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getTexto() {
        return texto;
    }

    public void setTexto(String texto) {
        this.texto = texto;
    }

    public Usuario getAutor() {
        return autor;
    }

    public void setAutor(Usuario autor) {
        this.autor = autor;
    }

    public Idea getIdea() {
        return idea;
    }

    public void setIdea(Idea idea) {
        this.idea = idea;
    }
}
