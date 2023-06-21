package Usuarios;

import java.util.ArrayList;

import sistema.Indicente;

public class Usuario {
	String usuario;
	String contrasena;
	String nombre;
	String apellido;
	ArrayList<Indicente> incidentes;
	
	public Usuario(String usuario, String contrasena, String nombre, String apellido) {
		
		this.usuario = usuario;
		this.contrasena = contrasena;
		this.nombre = nombre;
		this.apellido = apellido;
		this.incidentes=new ArrayList<>();
	}

	boolean logIn() {
		return true;
	}
	
	boolean logOut() {
		return true;
	}
	
}
