/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package poop8sa;

/**
 *
 * @author poo01alu13
 */
public class Cuadrilatero extends Poligono{
    private int alpha, beta;
    private int a, b;
    private float base, altura;

     /**
     * Constructor null o vacío
     */
    public Cuadrilatero() {
    }
    /**
     * Constructor con valores
     * @param alpha representa un angúlo;
     * @param beta representa otro angulo;
     * @param a representa un lado a;
     * @param b representa un lado b;
     * @param base representa una base;
     * @param altura representa una altura;
     */
    public Cuadrilatero(int alpha, int beta, int a, int b, float base, float altura) {
        this.alpha = alpha;
        this.beta = beta;
        this.a = a;
        this.b = b;
        this.base = base;
        this.altura = altura;
    }
    /**
     * Método que obtiene y devuelve el valor de ángulo llamado alpha 
     * @return alpha ángulo de un triangúlo
     */
    public int getAlpha() {
        return alpha;
    }
    /**
     * Método que recibe un valor entero y se lo asigna al atributo alpha de un triángulo
     * @param alpha valor del ángulo
     */
    public void setAlpha(int alpha) {
        this.alpha = alpha;
    }
    /**
     * Método que obtiene y devuelve el valor de ángulo llamado beta 
     * @return beta ángulo de un triangúlo
     */
    public int getBeta() {
        return beta;
    }
    /**
     * Método que recibe un valor entero y se lo asigna al atributo alpha de un triángulo
     * @param beta valor del ángulo de un triángulo
     */
    public void setBeta(int beta) {
        this.beta = beta;
    }
    /**
     * Método que obtiene y devuelve el valor de un lado llamado a
     * @return el valor de un lado del cuadrilatero
     */
    public int getA() {
        return a;
    }
    /**
     * Método que recibe un valor entero y se lo asigna a "a"
     * @param a 
     */
    public void setA(int a) {    
        this.a = a;
    }
    /**
     * Método que obtiene y devuelve el valor de un lado llamado b
     * @return el valor de un lado del cuadrilatero
     */
    public int getB() {
        return b;
    }
     /**
     * Método que recibe un valor entero y se lo asigna a "b"
     * @param b 
     */
    public void setB(int b) {
        this.b = b;
    }
    /**
     * Método que obtiene y devuelve el valor de la base
     * @return el valor de la base del triámgulo
     */
    public float getBase() {
        return base;
    }
    /**
     * Método que recibe un valor entero y se lo asigna a "base"
     * @param base valor de la base de un cuadrilatero
     */
    public void setBase(float base) {
        this.base = base;
    }
    /**
     * Método que obtiene y devuelve el valor de la altura
     * @return altura el valor de la altura del triámgulo
     */
    public float getAltura() {
        return altura;
    }
    /**
     * Método que recibe un valor entero y se lo asigna a "altura"
     * @param altura valor de la base de un cuadrilatero
     */
    public void setAltura(float altura) {
        this.altura = altura;
    }
    
    @Override
    public float area(){
        return base*altura;
    }
    @Override
    public float perimetro(){
        return(base*2)+(altura*2);
    }
    @Override
    public String toString() {
        return "Cuadrilatero{" + "alpha=" + alpha + ", beta=" + beta + ", a=" + a + ", b=" + b + ", base=" + base + ", altura=" + altura + '}';
    }


    
    
}
