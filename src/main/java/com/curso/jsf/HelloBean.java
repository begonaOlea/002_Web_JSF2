package com.curso.jsf;

import javax.annotation.ManagedBean;
import javax.faces.bean.RequestScoped;
//import javax.inject.Named;
//import javax.enterprise.context.RequestScoped;

/**
 *
 * @author begonaolea
 */
//@Named(value = "helloBean")
//@RequestScoped
@ManagedBean
@RequestScoped
public class HelloBean {   //  #{helloBean.name}

    private String name = "bego";
    /**
     * Creates a new instance of HelloBean
     */
    public HelloBean() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
    
    
    
    
    
}
