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
public class Calculadora {

    private int numeroUno;
    private int numeroDos;
    private String ope; // +,-,*,/
    private double resultados;

    public Calculadora() {
    }

    public int getNumeroUno() {
        return numeroUno;
    }

    public void setNumeroUno(int numeroUno) {
        this.numeroUno = numeroUno;
    }

    public int getNumeroDos() {
        return numeroDos;
    }

    public void setNumeroDos(int numeroDos) {
        this.numeroDos = numeroDos;
    }

    public double getResultados() {
        return resultados;
    }

    public void setResultados(double resultados) {
        this.resultados = resultados;
    }

    public String getOpe() {
        return ope;
    }

    public void setOpe(String ope) {
        this.ope = ope;
    }
    
    

    public void operacion() {
        switch (ope) {
            case "+":
                resultados =  numeroUno + numeroDos ;
                break;
            case "-":
                resultados =  numeroUno - numeroDos ;
                break;
            case "*":
                resultados =  numeroUno * numeroDos ;
                break;
            default:
                resultados =  numeroUno / numeroDos ;
                break;
        }
            
    }

    public double resultado() {
        return resultados;
    }

}
