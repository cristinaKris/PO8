/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package poop8;

/**
 *
 * @author poo01alu13
 */
public class Triangulo extends Poligono{
    private int alpha, beta, gamma;
    private int a, b, c;
    private float base, altura;

    public Triangulo() {
    }

    public Triangulo(int alpha, int beta, int gamma, int a, int b, int c, float base, float altura) {
        this.alpha = alpha;
        this.beta = beta;
        this.gamma = gamma;
        this.a = a;
        this.b = b;
        this.c = c;
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
     * Método que recibe un valor entero y se lo asigna al atributo beta de un triángulo
     * @param beta valor del ángulo de un triángulo
     */
    public void setBeta(int beta) {
        this.beta = beta;
    }
    /**
     * Método que obtiene y devuelve el valor de ángulo llamado gamma 
     * @return gamma ángulo de un triangúlo
     */
    public int getGamma() {
        return gamma;
    }
    /**
     * Método que recibe un valor entero y se lo asigna al atributo gamma de un triángulo
     * @param gamma valor del ángulo de un triángulo
     */
    public void setGamma(int gamma) {
        this.gamma = gamma;
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
     * Método que obtiene y devuelve el valor de un lado llamado c
     * @return el valor de un lado del cuadrilatero
     */
    public int getC() {
        return c;
    }
    /**
     * Método que recibe un valor entero y se lo asigna a "c"
     * @param c 
     */
    public void setC(int c) {
        this.c = c;
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
     * @param altura valor de la altura de un cuadrilatero
     */
    public void setAltura(float altura) {
        this.altura = altura;
    }
    /**
     * Sobre escritura del método área, el cual obtiene el area de un cuadrilatero
     * @return el valor de la base por la altura
     */
    @Override
    public float area(){
        return (base*altura)/2;
    }
    @Override
    public float perimetro(){
        return(base*2)+(altura*2);
    }
    /**
     * Sobre escritura del método perimetro, el cual obtiene el perimetro de un cuadrilatero
     * @return el valor de la base por dos más la altura por dos
     */
    @Override
    public String toString() {
        return "Triangulo{" + "alpha=" + alpha + ", beta=" + beta + ", gamma=" + gamma + ", a=" + a + ", b=" + b + ", c=" + c + ", base=" + base + ", altura=" + altura + '}';
    }

    
}
