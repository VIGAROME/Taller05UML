package sistema;

import java.time.LocalDate;
import java.util.ArrayList;

import Usuarios.PersonalAcademico;
import Usuarios.Usuario;

public class Indicente {
	int id;
	LocalDate fechaReportado;
	String estado;
	String titulo;
	String descripcion;
	ArrayList<Usuario> log_actualizacion;
	LocalDate fechaCerrado;
	String tipo;
	PersonalAcademico beneficiario;
	private Usuario responsable;
	
}
