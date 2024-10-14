package com.example.demo.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.NamedStoredProcedureQuery;
import jakarta.persistence.Table;

@Entity
@Table(name = "Taller_Cuatro")
@NamedStoredProcedureQuery(
	    name = "OBTENER_USUARIOS_FUNC",
	    procedureName = "OBTENER_USUARIOS_FUNC",
	    resultClasses = TallerCuatro.class
	)

public class TallerCuatro {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "Id_Taller_Cuatro")
    private Long id;

    @Column(name = "Usuario")
    private String usuario;

    @Column(name = "Contrasena")
    private String contrasena;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getUsuario() {
		return usuario;
	}

	public void setUsuario(String usuario) {
		this.usuario = usuario;
	}

	public String getContrasena() {
		return contrasena;
	}

	public void setContrasena(String contrasena) {
		this.contrasena = contrasena;
	}

    
    // Getters y Setters
}
