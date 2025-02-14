package examen;

import java.util.Scanner;

public class Main {
	// NOS COMENTO QUE SE PUEDE PONER 3/4 COSAS FUERAS.
	public static Scanner sn = new Scanner(System.in);
	public static Scanner st = new Scanner(System.in);
	public static Mision[] misiones = new Mision[10];
	public static Villano gru = new Villano("Gru", 4);

	public static void main(String[] args) {
		menu();
	}

	// METODO CON MENU PRINCIPAL
	private static void menu() {
		int flag = 0;
		do {
			System.out.println("Pulsa1. Para Crear misiones");
			System.out.println("Pulsa2. Para Listar misiones");
			System.out.println("Pulsa3. Para Listar estadisticas de mi villano");
			System.out.println("Pulsa4. Para Conseguir Victorias");
			System.out.println("Pulsa5. Para Salir");
			flag = sn.nextInt();
			menuOpciones(flag);
		} while (flag != 5);

	}

	// METODO CON EL SWITCH DE MENU PRINCIPAL
	private static void menuOpciones(int flag) {
		switch (flag) {
		case 1:
			crearMision();
			break;
		case 2:
			listarMisiones();
			break;
		case 3:
			gru.mostrar();
			break;
		case 4:
			conseguirVictorias();
			break;
		default:
			System.err.println("Numero no valido, intenta otra vez");
		}
	}

	// METODO CREAR MISION ( POCO QUE EXPLICAR DIRIA YO )
	private static void crearMision() {
		if (sitioLibre() != -1) {
			System.out.println("\nHas elegido crear mision nueva!\n" + "Ingrese Nombre de la mision");
			String nombre = st.nextLine();
			System.out.println("Escribe pequeña descripcion de la mision");
			String descripcion = st.nextLine();
			System.out.println("Ingrese su dificultad, valor tiene que ser solo numerico y entero min 10 - max 400");
			int dificultad = sn.nextInt();
			misiones[sitioLibre()] = new Mision(nombre, descripcion, dificultad);
		} else {
			System.err.println("No se puede crear mas misiones, memoria llena");
		}

	}

	// METODO PARA LISTAR MISIONES CREADAS ( AQUI TAMPOCO VEO NADA PARA EXPLICAR )
	private static void listarMisiones() {
		System.out.println("\nLa lista de misiones Creadas\n");
		for (int i = 0; i < misiones.length; i++) {
			if (misiones[i] != null) {
				System.out.println("Mision numero: " + (i + 1));
				misiones[i].mostrar();
			}
		}
	}

	// METODO PARA CONSEGUIR VICTORIA
	// DENTRO DE IF CREAMOS CONTROS COMPROBANDO SI MISION SE PUEDE HACER Y SI AUN ESTA DISPONIBLE
	private static void conseguirVictorias() {
		System.out.println("Dime numero de la mision");
		int numero = sn.nextInt() - 1;
		if (misiones[numero] != null && misiones[numero].isDisponibilidad() == true) {
			boolean resultado = misiones[numero].estado(gru);
			System.out.println(resultado ? "La mision se completo\n" : "Fuerza no suficiente\n");
			if (resultado) {
				gru.registrarVictoria();
			}
		} else {
			System.err.println("La mision no existe, o ya no esta disponible\n");
		}
	}

	// METODO SITIO LIBRE
	// SOY MAS FAN DE CONTADORES PERO AQUI TIENE UN METODO PARA SABER DONDE SE PUEDE CREAR MISION NUEVA
	// SI NO ENCONTRARIA SITIO DEVOLVERIA -1 LO QUE SERIA COMO UN SEGURO PARA IF EN EL METODO DE CREAR MISION
	private static int sitioLibre() {
		int contador = -1;
		boolean freno = true;
		for (int i = 0; i < misiones.length && freno; i++) {
			if (misiones[i] == null) {
				contador = i;
				freno = false;
			}
		}
		return contador;
	}

}
