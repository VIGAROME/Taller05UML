package sistema;

import java.util.ArrayList;

import Actividades.ActividadSumativa;
import Usuarios.Estudiante;
import Usuarios.Profesor;

public class Curso {
	
	private ArrayList<Estudiante> estudiantesEnEsperaDeInscripcion = new ArrayList<>();
	private ArrayList<Estudiante> estudiantesInscritos = new ArrayList<>();
	private String id;
	private String nombre;
	private boolean estadoDisponible;
	private Profesor responsable;
	private ArrayList<Foro> foros;
	private ArrayList<ActividadSumativa> actividadesSumativas;
	
	
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public boolean isEstadoDisponible() {
		return estadoDisponible;
	}
	public void setEstadoDisponible(boolean estadoDisponible) {
		this.estadoDisponible = estadoDisponible;
	}
	
	public boolean addEstudianteEspera(Estudiante e) {
		return this.estudiantesEnEsperaDeInscripcion.add(e);
	}
	public boolean addEstuantesIncriptos(Estudiante e) {
		e.AddCursosInscrptos(this);
		return this.estudiantesInscritos.add(e);
		
	}
	public void setResponsable(Profesor profesor) {
		responsable=profesor;
		
	}
	

}
