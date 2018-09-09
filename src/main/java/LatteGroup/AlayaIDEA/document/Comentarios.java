package LatteGroup.AlayaIDEA.document;

import javax.persistence.Id;

public class Comentarios {

    @Id
    private Integer id;
    private String texto;
    private Users autor;

    public Comentarios() {}

    public Comentarios(Integer id, String texto, Users autor) {
        this.id = id;
        this.texto = texto;
        this.autor = autor;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getTexto() {
        return texto;
    }

    public void setTexto(String texto) {
        this.texto = texto;
    }

    public Users getAutor() {
        return autor;
    }

    public void setAutor(Users autor) {
        this.autor = autor;
    }
}
