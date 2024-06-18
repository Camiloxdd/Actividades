    /*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package sobrecarga;

/**
 *
 * @author juang
 */
public class Principal {
    public static void main (String[] args){
        Persona persona = new Persona ();
        Perro perro = new Perro();
        Vaca vaca = new Vaca();
        
        
        persona.Comer();
        perro.Comer();
        vaca.Comer();
        
       
    } 
    
}
