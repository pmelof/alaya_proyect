package LatteGroup.AlayaIDEA.document;

import javax.persistence.Id;
import java.util.List;

public class Retos {

    @Id
    private Integer id;
    private String titulo;
    private String texto;
    private String area;
    private List<Ideas> ideas;

    public Retos() {}

    public Retos(Integer id,  String titulo , String texto, String area, List<Ideas> ideas) {
        this.id = id;
        this.titulo = titulo;
        this.texto = texto;
        this.area = area;
        this.ideas = ideas;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
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

    public String getArea() {
        return area;
    }

    public void setArea(String area) {
        this.area = area;
    }

    public List<Ideas> getIdeas() {
        return ideas;
    }

    public void setIdeas(List<Ideas> ideas) {
        this.ideas = ideas;
    }
}
