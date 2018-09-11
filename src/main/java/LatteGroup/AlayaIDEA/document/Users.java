package LatteGroup.AlayaIDEA.document;

import org.springframework.data.mongodb.core.mapping.Document;

import javax.persistence.Id;

@Document
public class Users {

    @Id
    private  Integer id;
    private String name;
    private String correo;
    private  Integer rol;

    public Users(){}

    public Users(Integer id, String name, String correo, Integer rol) {
        this.id = id;
        this.name = name;
        this.correo = correo;
        this.rol = rol;
    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getCorreo(){ return correo; }

    public void setCorreo(String correo){ this.correo = correo; }


    public Integer getRol() {
        return rol;
    }

    public void setRol(Integer rol) {
        this.rol = rol;
    }
}