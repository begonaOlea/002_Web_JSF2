
package com.curso.beans;

import javax.inject.Named;
import javax.enterprise.context.SessionScoped;
import java.io.Serializable;

/**
 *
 * @author begonaolea
 */
@Named(value = "usuarioBean")
@SessionScoped
public class UsuarioBean implements Serializable {

    
    private String nombre = "guest";
    private String idioma  = "es";
    private boolean administrador = true;
    
    public UsuarioBean() {
        System.out.println("...... iniciando UsuarioBean ambito Sesión");
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getIdioma() {
        return idioma;
    }

    public void setIdioma(String idioma) {
        this.idioma = idioma;
    }

    public boolean isAdministrador() {
        return administrador;
    }
    
    
    
    //accion cambiar el idioma
    public String btnCambiaIdioma(String idioma){
        this.idioma = idioma;
        return null; // se renderiza la misma pagina que ha llamado
    }
    
  
}
