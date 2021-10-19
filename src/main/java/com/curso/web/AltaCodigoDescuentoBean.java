
package com.curso.web;

import com.curso.entidades.DiscountCode;
import com.curso.servicios.CodigosDescuentosService;
import javax.ejb.EJB;
import javax.inject.Named;
import javax.enterprise.context.RequestScoped;


@Named(value = "altaCodigoDescuentoBean")
@RequestScoped
public class AltaCodigoDescuentoBean {

    @EJB
    private CodigosDescuentosService service;
    
    private DiscountCode descuento;
    
    public AltaCodigoDescuentoBean() {
        this.descuento = new DiscountCode();
    }

    public DiscountCode getDescuento() {
        return descuento;
    }

    public void setDescuento(DiscountCode descuento) {
        this.descuento = descuento;
    }
    
    public String btnGrabar(){
        System.out.println("... voy a grabar");
        service.alta(descuento);
        return "index";
    }
            
    
    
}
