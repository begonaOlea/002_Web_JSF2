/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/J2EE/EJB30/StatelessEjbClass.java to edit this template
 */
package com.curso.servicios;

import com.curso.entidades.DiscountCode;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

@Stateless
public class CodigosDescuentosService {
    
    @PersistenceContext(unitName = "my_persistence_unit")
    private EntityManager em; // encargado de llamar a la bd  INSERT, DELETE , ETC

   public void alta(DiscountCode dc){
       em.persist(dc); // enviar un INSERT A LA BD
   }
   
}
