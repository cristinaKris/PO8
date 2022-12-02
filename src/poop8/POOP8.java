/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package poop8;

/**
 *
 * @author poo01alu13 
 */
public class POOP8{

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //PRUEBA FIGURAS GEOMETRICAS
        System.out.println("Bienvenido a la prueba de figuras geometricas");
         Poligono poligono;
         
        poligono = new Triangulo();
        System.out.println(poligono);
        poligono = new Cuadrilatero();
        System.out.println(poligono);
        
        //PRUEBA INSTRUMENTOS
        System.out.println("Bienvenido a la prueba de instrumentos");
        InstrumentoMusical instrumento;
        
        instrumento =new Flauta();
        instrumento.tocar();
        System.out.println(instrumento.tipoInstrumento());
        //Prueba Meses
        System.out.println("El mes "+Meses.DOS+" corresponde a: ");
        System.out.println(Meses.NOMBRES_MESES[ Meses.DOS]);
    }
    
}
