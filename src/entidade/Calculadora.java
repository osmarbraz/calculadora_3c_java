package entidade;

/**
 * Classe que representa a abstração principal do sistema.
 *
 * @author osmarbraz
 * @version 1.0
 * @updated 19-nov-2013 15:24:06
 */
public class Calculadora {

    /**
     * Primeiro numero.
     */
    private double numero1;

    /**
     * Segundo numero.
     */
    private double numero2;

    /**
     * Construtor sem argumentos da classe.
     */
    public Calculadora() {
        this(0, 0);
    }

    /**
     * Construtor com argumentos da classe.
     *
     * @param numero1
     * @param numero2
     */
    public Calculadora(double numero1, double numero2) {
        setNumero1(numero1);
        setNumero2(numero2);
    }

    /**
     * Retorna o numero1 da calculadora.
     */
    public double getNumero1() {
        return numero1;
    }

    /**
     * Modifica o numero1 da calculadora.
     *
     * @param numero1 Um numero que representa o primeiro numero da calculadora.
     */
    public void setNumero1(double numero1) {
        this.numero1 = numero1;
    }

    /**
     * Retorna o numero2 da calculadora.
     */
    public double getNumero2() {
        return numero2;
    }

    /**
     * Modifica o numero2 da calculadora.
     *
     * @param numero2 Um numero que representa o segundo numero da calculadora.
     */
    public void setNumero2(double numero2) {
        this.numero2 = numero2;
    }

    /**
     * Retorna a soma dos dois numeros da calculadora.
     */
    public double getSoma() {
        return (getNumero1() + getNumero2());
    }

    /**
     * Retorna a subtracao do primeiro numero menos o segundo numero da
     * calculadora.
     */
    public double getSubtracao() {
        return (getNumero1() - getNumero2());
    }

    /**
     * Retorna o produto do primeiro pelo segundo numero da calculadora.
     */
    public double getProduto() {
        return (getNumero1() * getNumero2());
    }

    /**
     * Retorna o divisao do primeiro pelo segundo numero da calculadora.
     */
    public double getDivisao() {
        return (getNumero1() / getNumero2());
    }

    /**
     * Retorna uma string com o estado do objeto.
     */
    public String paraString() {
        return ("numero1: " + getNumero1() + " - numero2: " + getNumero2());
    }
}
