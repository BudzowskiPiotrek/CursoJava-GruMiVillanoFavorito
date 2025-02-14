package examen;

public class Mision {

	private String nombre;
	private String descripcion;
	private int puntuacionNecesaria;
	private boolean disponibilidad;

	//CONSTRUCTOR CON NIVEL DE MISION CON LIMITACIONES
	public Mision(String nombre, String descripcion, int puntuacionNecesaria) {
		this.nombre = nombre;
		this.descripcion = descripcion;
		setPuntuacionNecesaria(puntuacionNecesaria);
		this.disponibilidad = true;
	}

	//SUS GETER Y SETER
	public boolean isDisponibilidad() {
		return disponibilidad;
	}

	public void setDisponibilidad(boolean disponibilidad) {
		this.disponibilidad = disponibilidad;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getDescripcion() {
		return descripcion;
	}

	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}

	public int getPuntuacionNecesaria() {
		return puntuacionNecesaria;
	}
	
	public void setPuntuacionNecesaria(int puntuacionNecesaria) {
		if (puntuacionNecesaria < 10) {
			this.puntuacionNecesaria = 10;
		} else if (puntuacionNecesaria > 400) {
			this.puntuacionNecesaria = 400;
		} else {
			this.puntuacionNecesaria = puntuacionNecesaria;
		}
	}

	@Override
	public String toString() {
		return "Mision [nombre=" + nombre + ", descripcion=" + descripcion + ", puntuacionNecesaria="
				+ puntuacionNecesaria + "]";
	}

	// METODO PARA SABER SI LA MISION SE PUEDE HACER, SI FUE TERMINADA PARA NO PODER REPETIRLA
	public boolean estado(Villano villano) {
		boolean exito = false;
		int puntos = villano.fuerza() - villano.torpeza();

		if (puntos >= puntuacionNecesaria && disponibilidad == true) {
			exito = true;
			this.disponibilidad = false;
		}
		return exito;
	}

	// Y AQUI LO MISMO A PESAR DE METODO TOSTRING PREFIERO HACER MI PROPIO METODO MOSTRAR QUE QUEDA MAS BONITO
	public void mostrar() {
		System.out.println("Disponibilidad : " + (disponibilidad ? "Si" : "No"));
		System.out.println("Nombre de la mision: " + nombre);
		System.out.println("Trata de: " + descripcion);
		System.out.println("Tu dificultad es de: " + puntuacionNecesaria + " puntos.\n");
	}

}
