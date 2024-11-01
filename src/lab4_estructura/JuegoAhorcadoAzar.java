/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lab4_estructura;

import java.util.ArrayList;
import java.util.Random;
import javax.swing.JOptionPane;

/**
 *
 * @author Dell
 */

//EXTIENDE DE JUEGOAHORACADOBASE
public class JuegoAhorcadoAzar extends JuegoAhorcadoBase {
    private AdministrarPalabrasSecretas ad ;
    private String palabraE;
    private StringBuilder progreso;
    private ArrayList<String> palabras;
    
    
    public JuegoAhorcadoAzar(){
      palabraE="";
      progreso = progreso = new StringBuilder("_".repeat(palabraE.length()));
      
      palabras = new ArrayList<>();
        palabras.add("Hola");
        palabras.add("hoa");
        palabras.add("aa");
        palabras.add("aa");
        palabras.add("aa");
AdministrarPalabrasSecretas ad = new AdministrarPalabrasSecretas(); 
        if (ad.adminPalabras != null) {
            palabras.addAll(ad.adminPalabras);
        }
    }


     public String obtenerPalabra(){
        Random random = new Random();
        int index = random.nextInt(palabras.size());
        return palabraE = palabras.get(index);
        
    }
    
    public char actualizarPalabraActual(char letra){  
        for (int indice = 0; indice < palabraE.length(); indice++) {
            if (palabraE.charAt(indice) == letra) {
                return letra;
            }
        }

        return 0;  
    }
    
    public boolean VerificarLetra(char letra){
        return palabraE.indexOf(letra) != -1;
        
    }
    
    public  boolean Ganador(){
        return progreso.toString().equals(palabraE);
    }
    
    public String obtenerProgreso() {
        return progreso.toString();
    }
   
    public void jugar() {
        super.jugar();
    }
}
