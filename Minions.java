package examen;

import java.util.Random;

public class Minions {
	private int fuerza;
	private int torpeza;
	
    // CONSTRUCTOR CON DOS VARIABLES CREADAS CON RANDOM
	public Minions() {
		Random random = new Random();
		this.fuerza = random.nextInt(10) + 1;
		this.torpeza = random.nextInt(10) + 1;
	}
    // SOLO LOS GETER PARA NO PODER CAMBIAR VARIABLES UNA VEZ ESTAN CREADAS
	public int getFuerza() {
		return fuerza;
	}

	public int getTorpeza() {
		return torpeza;
	}

	@Override
	public String toString() {
		return "Minions [fuerza=" + fuerza + ", torpeza=" + torpeza + "]";
	}

}
