package LatteGroup.AlayaIDEA.document;

import org.springframework.data.mongodb.core.mapping.Document;

import javax.persistence.Id;

@Document
public class Users {

    @Id
    private  Integer id;
    private String name;
    private  Integer rol;

    public Users(){}

    public Users(Integer id, String name, Integer rol) {
        this.id = id;
        this.name = name;
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


    public Integer getRol() {
        return rol;
    }

    public void setRol(Integer rol) {
        this.rol = rol;
    }
}