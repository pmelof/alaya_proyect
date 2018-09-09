package LatteGroup.AlayaIDEA.document;

import javax.persistence.Id;
import java.util.List;

public class Ideas {

    @Id
    private Integer id;
    private String title;
    private String text;
    private Integer counterLike;  //cantidad de me gusta de la idea.
    private Integer state; //0=nueva, 1=seleccionada, 2=descartada, 3=en evaluación
    private List<Comentarios> comentarios;

    public Ideas(){}

    public Ideas(Integer id, String title, String text, Integer counterLike, Integer state, List<Comentarios> comentarios) {
        this.id = id;
        this.title = title;
        this.text = text;
        this.counterLike = counterLike;
        this.state = state;
        this.comentarios = comentarios;
    }

    public Integer getState() {
        return state;
    }

    public void setState(Integer state) {
        this.state = state;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

    public Integer getCounterLike() {
        return counterLike;
    }

    public void setCounterLike(Integer counterLike) {
        this.counterLike = counterLike;
    }

    public List<Comentarios> getComentarios() {
        return comentarios;
    }

    public void setComentarios(List<Comentarios> comentarios) {
        this.comentarios = comentarios;
    }
}
