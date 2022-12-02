/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package poop8;
/**
 *
 * @author crist
 */
public class InstrumentoViento extends Object implements InstrumentoMusical {
    /**
     *      Constructor vacio o nulo
     */
    public InstrumentoViento() {
    }
    /**
     * Sobre escritura del método tocar mostrará la leyenda "Tocando instrumento de viento"
     */
    @Override
    public void tocar() {
        System.out.println("Tocando instrumento de viento");
    }
    /**
     * Sobre escritura del método afinar mostrará la leyenda "Afinando instrumento de aire"
     */
    @Override
    public void afinar() {
        System.out.println("Afinando instrumento de viento");
    }
    /**
     * Sobre escritura del método "tipo instrumento de viento"
     */
    @Override
    public String tipoInstrumento() {
        return "Instrumento de viento";
    }

    @Override
    public String toString() {
        return "InstrumentoViento{" + '}';
    }
    
    
}
