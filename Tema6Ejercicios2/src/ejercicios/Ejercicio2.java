package ejercicios;

import java.util.Scanner;

public class Ejercicio2 {
	/**
	 * Escribe un programa que lea el título y el contenido de una página web. La
	 * aplicación generará por consola un documento HTML donde el título será un
	 * encabezado de primer nivel (
	 * <h1>), y el resto del contenido será un párrafo (
	 * <p>
	 * ). El documento HTML debe contar con todas las etiquetas mínimas que todo
	 * documento HTML tiene.
	 * 
	 * @param args
	 */
	public static void main(String[] args) {
		String tituloWeb;
		String contenidoWeb;
		String codigoHtml="";
		String encabezadoWeb="";
		
		Scanner read = new Scanner (System.in);
		System.out.println("Introduce el título de tu página: ");
		tituloWeb=read.nextLine();
		
		System.out.println("Introduce el encabezado que quieres que tenga tu página: ");
		encabezadoWeb=read.nextLine();

		System.out.println("Introduce el contenido que quieres que aparezca en tu página: ");
		contenidoWeb=read.nextLine();
		
		
		codigoHtml+="<!DOCTYPE html>" + "\n"
				+ "\t" + "<head>" + "\n"
				+ "\t" + "\t" + "<title>" + tituloWeb + "</title>" + "\n"
				+ "\t" + "</head>" + "\n"
				+ "\t" +"<body>" + "\n"
				+ "\t" + "\t" + "<header>" + "\n"
				+ "\t" + "\t" + "\t" + "<h1> " + encabezadoWeb + " </h1>" + "\n" 
				+ "\t" + "\t" + "</header>" + "\n" + "\n"
				+ "\t" + "\t" + "<p> " + contenidoWeb + " </p>" + "\n" + "\n"
				+"\t" + "\t" + "<footer>" + "\n"
				+"\t" + "\t" + "</footer>" + "\n"
				+ "\t" +"</body>" + "\n"
				+ "</html>";
		
		System.out.println(codigoHtml);

	}

}
