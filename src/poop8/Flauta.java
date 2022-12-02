/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package poop8;

/**
 *
 * @author crist
 */
public class Flauta extends InstrumentoViento{
    /**
     * Constructor null de la flauta
     */
    public Flauta() {
    }
    /**
     * Método que mostrara de que tipo es el instrumento 
     * @return el string "flauta"
     */
    @Override
    public String tipoInstrumento(){
        return "Flauta";
    }
    
    @Override
    public String toString() {
        return "Flauta{" + '}';
   }
}
