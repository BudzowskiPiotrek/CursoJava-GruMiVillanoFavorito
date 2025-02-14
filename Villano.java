package examen;

import java.util.Arrays;

public class Villano {
	private String nombre;
	private int maldad;
	private Minions[] ejercito;
	public int nivelVictorias;

	// CONSTRUCTOR CON CARACTERISTICAS PEDIDAS
	public Villano(String nombre, int maldad) {
		this.nombre = nombre;
		if (maldad < 1) {
			this.maldad = 1;
		} else if (maldad > 4) {
			this.maldad = 4;
		} else {
			this.maldad = maldad;
		}
		this.ejercito = new Minions[maldad * 10];
		rectutarMinions();
		this.nivelVictorias = 0;
	}

	// SUS GETER Y SETER SIN SET DE MALDAD PARA NO PODER CAMBIARLO DE NINGUNA FORMA
	public String getNombre() {
		return nombre;
	}

	public int getNivelVictorias() {
		return nivelVictorias;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public int getMaldad() {
		return maldad;
	}

	public Minions[] getEjercito() {
		return ejercito;
	}

	public void setEjercito(Minions[] ejercito) {
		this.ejercito = ejercito;
	}

	@Override
	public String toString() {
		return "Villano [nombre=" + nombre + ", maldad=" + maldad + ", ejercito=" + Arrays.toString(ejercito) + "]";
	}

	// INICIANDO MINIONS CON CANTIDAD DEPENDIENDO DE SI MALDAD
	private void rectutarMinions() {
		for (int i = 0; i < ejercito.length; i++) {
			ejercito[i] = new Minions();

		}
	}

	// OBTENIENDO SUMA TOTAL DE LA FUERZA
	public int fuerza() {
		int fuerza = 0;
		for (int i = 0; i < ejercito.length; i++) {
			if (ejercito[i] != null) {
				fuerza += ejercito[i].getFuerza();
			}
		}
		return fuerza;
	}

	// OBTENIENDO SUMA TOTAL DE LA TORPEZA
	public int torpeza() {
		int torpeza = 0;
		for (int i = 0; i < ejercito.length; i++) {
			if (ejercito[i] != null) {
				torpeza += ejercito[i].getTorpeza();
			}
		}
		return torpeza;
	}

	// AQUI DIJO QUE SE PUEDE METER LOS SYSOUT ASI QUE MODULO MI PROPIO METODO
	// MOSTRAR
	public void mostrar() {
		System.out.println("\nNombre del Villano: " + nombre);
		System.out.println("Su nivel de maldad: " + maldad);
		System.out.println("Misiones cumplidad: " + nivelVictorias);
		System.out.println("Su fuerza es de: " + fuerza());
		System.out.println("Su torpeza es de: " + torpeza() + "\n");

	}

	// PARA SUBIR REGISTRO DE VICTORIAR, SE PODRIA HACERLO TAMBIEN CON CAMBIAR
	// VARIABLE A STATIC Y HACERLA DESDE MAIN =)
	public int registrarVictoria() {
		nivelVictorias += 1;
		return nivelVictorias;

	}

}
