package com.curso.jsf;

import com.curso.beans.UsuarioBean;
import javax.inject.Named;
import javax.enterprise.context.RequestScoped;
import java.io.Serializable;
import java.util.Date;
import javax.faces.application.FacesMessage;
import javax.faces.context.FacesContext;
import javax.faces.view.facelets.FaceletContext;
import javax.inject.Inject;


@Named(value = "registroUsuarioBean")
@RequestScoped
public class RegistroUsuarioBean implements Serializable {

    @Inject
    private UsuarioBean usuario;
    private String clave;
    
    private int codigo;
    private Date fechaAlta;
    
    /**
     * Creates a new instance of RegistroUsuarioBean
     */
    public RegistroUsuarioBean() {
        System.out.println(".... instanciando RegistroUsuarioBean");
    }

    public UsuarioBean getUsuario() {
        return usuario;
    }

    public void setUsuario(UsuarioBean usuario) {
        this.usuario = usuario;
    }

    public String getClave() {
        return clave;
    }

    public void setClave(String clave) {
        this.clave = clave;
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public Date getFechaAlta() {
        return fechaAlta;
    }

    public void setFechaAlta(Date fechaAlta) {
        this.fechaAlta = fechaAlta;
    }
    
    
    
    
    //acction
    public String btnGrabarRegistro(){
        System.out.println(".. registro el usuario: " + usuario.getNombre()
                + " - " + this.clave);
        // llamar un servicio que grave en bd un usuario
        //RegistoUusairoService.grabar(new Usuario());
        
        //MUESTRO AL USUARIO UN SE GRABÓ OK
       FacesContext fc =  FacesContext.getCurrentInstance();
       
       fc.addMessage(null, new FacesMessage("El usuario se registró OK"));
        
        return null;//"index";
    }
    
    
}
