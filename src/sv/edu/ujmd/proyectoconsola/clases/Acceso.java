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
public class Acceso {

    //Atributos
    private String usuario = "admin";
    private String clave = "admin123";
    private String nombreSistema = " FarmaFiorella";
    private String bienvenida = "Bienvenido al sistema ";
    private String mensaje1 = "Favor ingresar credenciales";
    private String ingreseUsuario = "Ingresar usuario   : ";
    private String ingreseclave = "Ingresar contraseña : ";

    //Constructor
    public Acceso() {
    }

    //get y set
    public String getUsuario() {
        return usuario;
    }

    public void setUsuario(String usuario) {
        this.usuario = usuario;
    }

    //Funcion
    public String getClave() {
        return clave;
    }

    //Procedimiento
    public void setClave(String clave) {
        this.clave = clave;
    }

    public String getNombreSistema() {
        return nombreSistema;
    }

    public void setNombreSistema(String nombreSistema) {
        this.nombreSistema = nombreSistema;
    }

    public String getBienvenida() {
        return bienvenida;
    }

    public void setBienvenida(String bienvenida) {
        this.bienvenida = bienvenida;
    }

    public String getMensaje1() {
        return mensaje1;
    }

    public void setMensaje1(String mensaje1) {
        this.mensaje1 = mensaje1;
    }

    public String getIngreseUsuario() {
        return ingreseUsuario;
    }

    public void setIngreseUsuario(String ingreseUsuario) {
        this.ingreseUsuario = ingreseUsuario;
    }

    public String getIngreseclave() {
        return ingreseclave;
    }

    public void setIngreseclave(String ingreseclave) {
        this.ingreseclave = ingreseclave;
    }

    //Procedimiento o Funcion
    public void bienvenidad() {
        System.out.println(bienvenida + nombreSistema);
        System.out.println(mensaje1);
        System.out.println(ingreseUsuario);
        System.out.println(ingreseclave);
    }

}
