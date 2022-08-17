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
public class Menu {

    private String saludo = "Bienvenido (nombre: )";
    private String mensaje = "¿Que desea hacer?";
    private String opcion1 = "1- Venta nueva";
    private String opcion2 = "2- Consultar inventarios";
    private String opcion3 = "3- Cambiar contraseña";
    private String opcion4 = "4- Salir del sistema";

    public Menu() {
    }

    public String getSaludo() {
        return saludo;
    }

    public void setSaludo(String saludo) {
        this.saludo = saludo;
    }

    public String getMensaje() {
        return mensaje;
    }

    public void setMensaje(String mensaje) {
        this.mensaje = mensaje;
    }

    public String getOpcion1() {
        return opcion1;
    }

    public void setOpcion1(String opcion1) {
        this.opcion1 = opcion1;
    }

    public String getOpcion2() {
        return opcion2;
    }

    public void setOpcion2(String opcion2) {
        this.opcion2 = opcion2;
    }

    public String getOpcion3() {
        return opcion3;
    }

    public void setOpcion3(String opcion3) {
        this.opcion3 = opcion3;
    }

    public String getOpcion4() {
        return opcion4;
    }

    public void setOpcion4(String opcion4) {
        this.opcion4 = opcion4;
    }

    //Procedimiento o Funcion
    public void ingresoSistema() {
        System.out.println(" ");
        System.out.println(saludo);
        System.out.println(mensaje);
        System.out.println(opcion1);
        System.out.println(opcion2);
        System.out.println(opcion3);
        System.out.println(opcion4);
    }

}
