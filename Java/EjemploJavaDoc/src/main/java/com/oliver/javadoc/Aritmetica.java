package com.oliver.javadoc;

/**
 * Esta clase permite realizar operaciones aritmeticas
 * @author Oliver Sinue
 * @version 1.0
 */
public class Aritmetica {

    /**
     * Primer operando
     */
    int operandoA;
    
    /**
     * Operando b
     */
    int operandoB;

    
    
    /**
     * Contructor vacio
     */
    
    public Aritmetica() {
    }

    /**
     * 
     * @param operandoA
     * @param operandoB 
     */
    public Aritmetica(int operandoA, int operandoB) {
        this.operandoA = operandoA;
        this.operandoB = operandoB;
    }
    
    
    /**
     * Metodo para sumar 2 numeros
     * @return resultado de la suma
     */
    public int sumar() {
        return this.operandoA + this.operandoB;
    }
    
}
