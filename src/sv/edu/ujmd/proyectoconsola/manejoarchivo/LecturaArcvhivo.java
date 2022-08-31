/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sv.edu.ujmd.proyectoconsola.manejoarchivo;

import java.io.*;

/**
 *
 * @author Alexander-Siguenza
 */
public class LecturaArcvhivo {

    public static void main(String[] arg) {
        File archivo = null;
        FileReader fr = null;
        BufferedReader br = null;
        String[] accesos = new String[3];

        try {
            // Apertura del fichero y creacion de BufferedReader para poder
            // hacer una lectura comoda (disponer del metodo readLine()). 
            archivo = new File("C:\\usuarios.txt");
            fr = new FileReader(archivo);
            br = new BufferedReader(fr);

            // Lectura del fichero 
            String linea;
            int i = 0;
            while ((linea = br.readLine()) != null) {
                System.out.println(linea);
                if (i != 0) {
                    accesos[i - 1] = linea;
                }
                i++;
            }
            System.out.println("****************************");
            for (int f = 0; f < 3; f++) {
                System.out.println(accesos[f]);
            }
        } catch (Exception e) {
            System.out.println(e.getMessage());
        } finally {
            // En el finally cerramos el fichero, para asegurarnos
            // que se cierra tanto si todo va bien como si salta
            // una excepcion
            try {
                if (null != fr) {
                    fr.close();
                }
            } catch (Exception e2) {
                System.out.println(e2.getMessage());
            }
        }
    }
}
