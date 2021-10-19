package com.curso.jsf;

import javax.inject.Named;
import javax.enterprise.context.SessionScoped;
import java.io.Serializable;


@Named(value = "registroUsuarioBean")
@SessionScoped
public class RegistroUsuarioBean implements Serializable {

    private String nombre;
    private String clave;
    /**
     * Creates a new instance of RegistroUsuarioBean
     */
    public RegistroUsuarioBean() {
        System.out.println(".... instanciando RegistroUsuarioBean");
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getClave() {
        return clave;
    }

    public void setClave(String clave) {
        this.clave = clave;
    }
    
    //acction
    public String btnGrabarRegistro(){
        System.out.println(".. registro el usuario: " 
                + this.nombre  + " - " + this.clave);
        return "index";
    }
    
    
}
