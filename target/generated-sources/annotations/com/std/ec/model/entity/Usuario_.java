package com.std.ec.model.entity;

import jakarta.persistence.metamodel.EntityType;
import jakarta.persistence.metamodel.SingularAttribute;
import jakarta.persistence.metamodel.StaticMetamodel;

/**
 * Static metamodel for {@link com.std.ec.model.entity.Usuario}
 **/
@StaticMetamodel(Usuario.class)
public abstract class Usuario_ {

	
	/**
	 * @see #id_usuario
	 **/
	public static final String ID_USUARIO = "id_usuario";
	
	/**
	 * @see #nombre
	 **/
	public static final String NOMBRE = "nombre";
	
	/**
	 * @see #nickName
	 **/
	public static final String NICK_NAME = "nickName";

	
	/**
	 * Static metamodel type for {@link com.std.ec.model.entity.Usuario}
	 **/
	public static volatile EntityType<Usuario> class_;
	
	/**
	 * Static metamodel for attribute {@link com.std.ec.model.entity.Usuario#id_usuario}
	 **/
	public static volatile SingularAttribute<Usuario, Integer> id_usuario;
	
	/**
	 * Static metamodel for attribute {@link com.std.ec.model.entity.Usuario#nombre}
	 **/
	public static volatile SingularAttribute<Usuario, String> nombre;
	
	/**
	 * Static metamodel for attribute {@link com.std.ec.model.entity.Usuario#nickName}
	 **/
	public static volatile SingularAttribute<Usuario, String> nickName;

}

