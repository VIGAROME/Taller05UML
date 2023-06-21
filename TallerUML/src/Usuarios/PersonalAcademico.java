package Usuarios;

import java.util.ArrayList;

import sistema.Foro;
import sistema.Indicente;

public class PersonalAcademico extends Usuario{
	ArrayList<Indicente> incidentes;

	public PersonalAcademico(String usuario, String contrasena, String nombre, String apellido) {
		super(usuario, contrasena, nombre, apellido);
		// TODO Auto-generated constructor stub
	}
	
	public void reportarError(String mail, String contenido) {
		
	}
	
	public void solicitarAsesoramientoDelSistema(String email, String contenido) {
		
	}
	
	public void comentarEnForo(Foro foro, String comentario) {
		
	}
}
