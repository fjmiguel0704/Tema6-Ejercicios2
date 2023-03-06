package ejercicios;

import java.util.Scanner;

public class Ejercicio1 {
//	El preprocesador del lenguaje C elimina los comentarios (/* … */ del código fuente antes de compilar. Diseña un programa que lea por teclado una sentencia en C, y elimine los comentarios:
//	Sentencia: if (a==3) /* igual a tres */ a++; /* incrementamos a */
//	Salida: if (a==3) a++;
	public static void main(String[] args) {
		String fraseUsuario;
		String abreComent;
		String cierraComent;

		Scanner read = new Scanner(System.in);
		System.out.println("Introduce una frase de código en lenguaje C con comentarios: ");
		fraseUsuario = read.nextLine();

		int abreComentario = fraseUsuario.indexOf("/*");

		int cierraComentario = fraseUsuario.indexOf("/", abreComentario + 1);

		String subcadena = fraseUsuario.substring(abreComentario, cierraComentario + 1);

		String fraseSinComent = fraseUsuario.replace(subcadena, "");

		while (abreComentario >= 0 && cierraComentario >= 0) {
			abreComentario = fraseSinComent.indexOf("/*");

			cierraComentario = fraseSinComent.indexOf("/", abreComentario + 1);

			if (abreComentario < 0 || cierraComentario < 0) {
				break;
			}

			subcadena = fraseSinComent.substring(abreComentario, cierraComentario + 1);

			fraseSinComent = fraseSinComent.replace(subcadena, "");
		}
		System.out.println(fraseSinComent);
	}
}