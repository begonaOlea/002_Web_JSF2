package com.curso.jsf;

import javax.inject.Named;
import javax.enterprise.context.RequestScoped;

/**
 *
 * @author begonaolea
 */
@Named(value = "helloBean")
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
