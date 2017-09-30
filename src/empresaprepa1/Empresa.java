/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package empresaprepa1;

import java.util.Scanner;

/**
 *
 * @author Jorge
 */
public class Empresa {
    
    private String nombre;
    private Persona[] vecPersona = new Persona[2];
    Scanner sc = new Scanner(System.in);
    
    public Empresa(String nombre){
        
        this.nombre = nombre;
        AnadirPersonas();
        
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Persona[] getVecPersona() {
        return vecPersona;
    }

    public void setVecPersona(Persona[] vecPersona) {
        this.vecPersona = vecPersona;
    }
    
    public void AnadirPersonas(){
        
        for (int i = 0; i < this.vecPersona.length; i++) {
            
            System.out.println("Ingrese el nombre");
            String nombre = sc.next();
            System.out.println("Ingrese el apellido");
            String apellido = sc.next();
            System.out.println("Ingrese ci");
            int ci = sc.nextInt();
            
            vecPersona[i] = new Persona(nombre,apellido,ci);
        }
    }
    
    public void Mostrar(){
        
        System.out.println("Nombre de la empresa "+nombre);
        
        for (int i = 0; i < vecPersona.length; i++) {
            vecPersona[i].Mostrar();
        }
    }
    
}
