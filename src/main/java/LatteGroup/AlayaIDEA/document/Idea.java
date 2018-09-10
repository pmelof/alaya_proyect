package LatteGroup.AlayaIDEA.document;

import com.fasterxml.jackson.annotation.JsonIgnore;
import org.springframework.data.mongodb.core.mapping.DBRef;
import org.springframework.data.annotation.Id;

import java.util.ArrayList;
import java.util.List;

public class Idea {

    @Id
    private String id;

    private String titulo;
    private String texto;
    private Integer contadorMeGusta;  //cantidad de me gusta de la idea.
    private Integer estado; //0=nueva, 1=seleccionada, 2=descartada, 3=en evaluación

    @JsonIgnore
    @DBRef
    private List<Comentario> comentarios;
    private Usuario usuario;
    private Reto reto;

    public Idea()
    {
        setComentarios(new ArrayList<>());
    }


    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getTexto() {
        return texto;
    }

    public void setTexto(String texto) {
        this.texto = texto;
    }

    public Integer getContadorMeGusta() {
        return contadorMeGusta;
    }

    public void setContadorMeGusta(Integer contadorMeGusta) {
        this.contadorMeGusta = contadorMeGusta;
    }

    public Integer getEstado() {
        return estado;
    }

    public void setEstado(Integer estado) {
        this.estado = estado;
    }

    public List<Comentario> getComentarios() {
        return comentarios;
    }

    public void setComentarios(List<Comentario> comentarios) {
        this.comentarios = comentarios;
    }

    public Usuario getUsuario() {
        return usuario;
    }

    public void setUsuario(Usuario usuario) {
        this.usuario = usuario;
    }

    public Reto getReto() {
        return reto;
    }

    public void setReto(Reto reto) {
        this.reto = reto;
    }
}
