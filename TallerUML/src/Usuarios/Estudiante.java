package Usuarios;

import java.util.ArrayList;

import Actividades.ActividadSumativa;
import sistema.Curso;

public class Estudiante extends PersonalAcademico{
	ArrayList<Curso> cursosInscriptos = new ArrayList();

	public Estudiante(String usuario, String contrasena, String nombre, String apellido) {
		super(usuario, contrasena, nombre, apellido);
		// TODO Auto-generated constructor stub
	}
	
	public void solicitarInscripcionCurso(Curso curso) {
		
	}
	public void realizarActividadSumativa(Curso curso, ActividadSumativa actSumativa) {
		
	}
	
	public void InscribirseCursos(Curso c) {
		c.addEstudianteEspera(this);
	}
	
	public boolean AddCursosInscrptos(Curso c) {
		return this.cursosInscriptos.add(c);
	}
}
