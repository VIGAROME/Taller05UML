package Actividades;

import java.time.LocalDate;

public class Tarea extends ActividadSumativa{
	private LocalDate fechaDePublicacion;

	public LocalDate getFechaDePublicacion() {
		return fechaDePublicacion;
	}

	public void setFechaDePublicacion(LocalDate fechaDePublicacion) {
		this.fechaDePublicacion = fechaDePublicacion;
	}
}
