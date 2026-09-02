/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.std.ec.repository;

import com.std.ec.model.entity.Usuario;
import com.std.ec.repository.persistence.CrudRepository;
import jakarta.persistence.EntityManager;

/**
 *
 * @author igrisdev
 */
public class UsuarioRepository extends CrudRepository<Usuario> {

    public UsuarioRepository() {
        super(Usuario.class);
    }

    @Override
    protected EntityManager getEntityManager() {
        return em;
    }
    
    

}
