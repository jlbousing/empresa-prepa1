/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package empresaprepa1;

/**
 *
 * @author Jorge
 */
public class Persona {

    private String nombre;
    private String apellido;
    private int ci;
    
    public Persona(String n , String a, int c){
         
        this.nombre = n;
        this.apellido = a;
        this.ci = c;
    }
    
    public void setNombre(String nombre){
        this.nombre = nombre;
    }
    
    public String getNombre(){
        return nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public int getCi() {
        return ci;
    }

    public void setCi(int ci) {
        this.ci = ci;
    }
    
    public void Mostrar(){
        System.out.println("Nombre: "+nombre);
        System.out.println("Apellido "+apellido);
        System.out.println("Ci: "+ci);
    }
    
}
