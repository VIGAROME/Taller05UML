package Usuarios;

import java.util.ArrayList;

import Actividades.ActividadSumativa;
import sistema.Curso;

public class Profesor extends PersonalAcademico{
	
	private ArrayList<Curso> cursosACargo=new ArrayList();; 

	public Profesor(String usuario, String contrasena, String nombre, String apellido) {
		super(usuario, contrasena, nombre, apellido);
		// TODO Auto-generated constructor stub
	}
	
	public void cargarActividadSumativa(Curso curso, Estudiante estudiante, ActividadSumativa actSumativa) {
		
	}
	
	public void addCursosACargo(Curso c) {
		this.cursosACargo.add(c);
		c.setResponsable(this);
	}
}
