/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sv.edu.ujmd.proyectoconsola.clases;

/**
 *
 * @author Alexander-Siguenza
 */
public class Inicio {
    
    //instanciar clase
    static Acceso ac = new Acceso();
    static Menu mn = new Menu();
    
     public static void main(String[] args) {
        // TODO code application logic here
        ac.bienvenidad();
        mn.ingresoSistema();        
    }
    
}
