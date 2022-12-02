/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package poop8sa;

/**
 *
 * @author crist
 */
public class POOP8SA {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Poligono poligono = new Poligono();
        //Poligono puede comportarse como objeto
        Object objeto = poligono;
        System.out.println(objeto);
        
        //Una referencia puede ser  reasignada a otros objetos
        poligono = new Triangulo();
        System.out.println(poligono);
        poligono = new Cuadrilatero();
        System.out.println(poligono);
        
        // Solo se pueden ejecutar los métodos que están definidos
        // en la referencia sin emabrgo se ejecutarán como están implementados en la instancia
        // El método toString se puede ejecutar porque está definifo
        // en Polígono, sin embargo, se va a ejecutar como está
        // implementado en la instancia (Cuadrilátero en este caso).
        System.out.println(poligono);
        // El método setBase no está definido en Polígono, por lo tanto
        // lasiguiente instrucción marcaría un error:
        // poligono.SetBase(5.5);
        
        // METODO POLIMORFICO
        Poligono poligono1 = new Poligono();
        getPoligono(poligono1);
        poligono1 = new Triangulo();
        getPoligono(poligono1);
        poligono1 = new Cuadrilatero();
        getPoligono(poligono);
    }

    private static void getPoligono(Poligono p) {
        if(p instanceof Triangulo){
            System.out.println("El objeto es un triangulo");
        } else {
            if (p instanceof Cuadrilatero) {
                System.out.println("El objeto es un cuadrilatero");
            } else {
                System.out.println("El objeto es un poligono");
            }
        }
    }
    
}
