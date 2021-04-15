//
//  Modulo.java
//  
//	Segundo Examen Parcial
//
//  Created by Castro Bouquet Ildefonso on 12/04/2021.
//
package com.examen2;

//	Imports
import java.io.File;
import java.util.ArrayList;
import java.io.FileNotFoundException;
import java.util.Scanner;

// 	Class Modulo
public class Modulo {

	// Constructor
	public Modulo() {

	}

	/*
	 * This Method reads from path and saves it in a string
	 * 
	 * @param (String) path: Path from file to read
	 * 
	 * @returns (String []) arregloTemporal: saved Text
	 * 
	 * Copied from microProyecto from: Castro Bouquet Ildefonso, Fragoso Oseguera
	 * Juan Pablo
	 */
	public ArrayList<String> leerTexto(String path) {
		// Variables
		ArrayList<String> ildefonso = new ArrayList<String>();// Changed "texto" to "ildefonso"

		try {
			Scanner archivo = new Scanner(new File(path));

			while (archivo.hasNext()) {
				ildefonso.add(archivo.nextLine());
			}

			archivo.close();
		} catch (FileNotFoundException ex) {
			ex.toString();
			System.out.println("No se encontró el archivo.");
			System.exit(0);// Added for less errors
		}

		return ildefonso;
	}

	/*
	 * This Method errases all caracters from texto
	 * 
	 * @param (ArrayList<String>) texto: Text to clean
	 * 
	 * @returns (ArrayList<String>) temp: Cleaned text
	 */
	public ArrayList<String> limpiarTexto(ArrayList<String> texto) {
		// Variable Declaration
		ArrayList<String> temp;// An Arraylist to save every number separated from each other.
		String[] nuevoTexto;// String for easy modification
		int i;// Loop
		int longitud;// Size of texto and nuevoTexto

		// Variables Initialization
		longitud = texto.size();
		nuevoTexto = texto.toArray(new String[longitud]);
		temp = new ArrayList<String>();

		// Loop por cleaning
		for (i = 0; i < longitud; i++) {
			nuevoTexto[i] = nuevoTexto[i].replaceAll("\\D", "");
		}

		// Loop for string to Arraylist
		for (i = 0; i < longitud; i++) {
			temp.add(nuevoTexto[i]);
		}

		return temp;
	}

	/*
	 * This Method saves on an array values from 100-20000
	 * 
	 * @param (ArrayList<String>) texto: Text to filter
	 * 
	 * @returns (ArrayList<String>) rango: Filtered values
	 */
	public ArrayList<String> rango(ArrayList<String> texto) {
		// Variable Declaration
		ArrayList<String> castro;
		int i;// loop
		int value;

		// Variables Initialization
		castro = new ArrayList<String>();
		i = 0;

		for (i = 0; i < texto.size(); i++) {
			// System.out.println("1"); //validation Process
			if (texto.get(i) != "") {
				// System.out.println("2"); //validation Process
				value = Integer.parseInt(texto.get(i));
				if (value >= 100 && value <= 20000) {
					// System.out.println("loop" + value); //validation Process
					castro.add(Integer.toString(value));// revisar
				}
			}
		}
		return castro;
	}

	/*
	 * This Method adds all numbers in an array
	 * 
	 * @param (ArrayList<String>) texto: integers to add
	 * 
	 * @returns (Integer) total: total add of texto's numbers
	 */
	public Integer total(ArrayList<String> texto) {
		// Variable Declaration
		int total;
		int i;

		// Variables Initialization
		total = 0;

		// Loop adding all numbers
		for (i = 0; i < texto.size(); i++) {
			total += Integer.parseInt(texto.get(i));
		}

		return total;
	}
}
