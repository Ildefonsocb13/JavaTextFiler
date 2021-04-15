//
//  PruebaMain.java
//  
//	Segundo Examen Parcial
//
//  Created by Castro Bouquet Ildefonso on 12/04/2021.
//
package com.examen2;

//  Imports
import java.util.Scanner;
import java.util.ArrayList;

//  Main class
public class PruebaMain {
    public static void main(String[] args) {
        // Variables Declaration
        Modulo variable;
        Scanner input;
        String path;
        ArrayList<String> ildefonso, castro;
        int i;
        int tot;

        // Variables Initialization
        variable = new Modulo();
        input = new Scanner(System.in);

        /* Open File with text to read */
        // path: D:\VSC\Java\PrimerProyecto\piramidal\src\com\examen2\texto.csv
        System.out.print("Path y nombre del archivo: ");
        path = input.nextLine();
        ildefonso = variable.leerTexto(path);
        input.close();

        // Clean File
        ildefonso = variable.limpiarTexto(ildefonso);

        // Pregunta 1
        System.out.println("El arrayList a manipular es:");
        for (i = 0; i < ildefonso.size(); i++) {
            if (ildefonso.get(i) != "") {
                System.out.println(ildefonso.get(i));
            }
        }
        System.out.println("Tamanio del arrayList a manipular es:" + ildefonso.size());
        // End Pregunta 1

        castro = variable.rango(ildefonso);

        // Pregunta 2

        System.out.println("arrayList ya filtrado:");
        for (i = 0; i < castro.size(); i++) {
            if (castro.get(i) != "") {
                System.out.println(castro.get(i));
            }
        }
        System.out.println("Tamanio del arrayList filtrado es:" + castro.size());
        // End Pregunta 2

        // Pregunta 3
        tot = variable.total(castro);
        System.out.println("El total es: " + tot);
        tot = tot / castro.size();
        System.out.println("El promedio es: " + tot);
        // End Pregunta 3
    }
}
