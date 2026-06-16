package controle;

import java.awt.event.ActionEvent;

import formulario.FrmCalculadora;
import entidade.Calculadora;

/**
 * Classe que realiza a interação entre a interface e a entidade do sistema.
 *
 * @author osmarbraz
 * @version 1.0
 * @updated 19-nov-2013 15:23:38
 */
public class CtrCalculadora {

    private FrmCalculadora frmCalculadora;

    /**
     * Construtor sem argumentos.
     */
    public CtrCalculadora() {
        // Instacia a janela
        setFrmCalculadora(new FrmCalculadora());

        // Associa os eventos aos componentes
        getFrmCalculadora().jBtnAdicionar
                .addActionListener(new java.awt.event.ActionListener() {
                    public void actionPerformed(ActionEvent e) {
                        jBAdicionar_actionPerformed(e);
                    }
                });

        getFrmCalculadora().jBtnSubtrair
                .addActionListener(new java.awt.event.ActionListener() {
                    public void actionPerformed(ActionEvent e) {
                        jBSubtrair_actionPerformed(e);
                    }
                });

        getFrmCalculadora().jBtnMultiplicar
                .addActionListener(new java.awt.event.ActionListener() {
                    public void actionPerformed(ActionEvent e) {
                        jBMultiplicar_actionPerformed(e);
                    }
                });

        getFrmCalculadora().jBtnDividir
                .addActionListener(new java.awt.event.ActionListener() {
                    public void actionPerformed(ActionEvent e) {
                        jBDividir_actionPerformed(e);
                    }
                });

        getFrmCalculadora().jBtnLimpar
                .addActionListener(new java.awt.event.ActionListener() {
                    public void actionPerformed(ActionEvent e) {
                        jBLimpar_actionPerformed(e);
                    }
                });

        getFrmCalculadora().jBtnFechar
                .addActionListener(new java.awt.event.ActionListener() {
                    public void actionPerformed(ActionEvent e) {
                        jBFechar_actionPerformed(e);
                    }
                });
    }

    /**
     * Operação que inicia a sequ�ncia de interações da manutenção de
     * Calculadora.
     */
    public void executar() {
        getFrmCalculadora().setVisible(true);
    }

    void jBAdicionar_actionPerformed(ActionEvent e) {
        Calculadora calculadora = new Calculadora();
        calculadora.setNumero1(Double.parseDouble(getFrmCalculadora().jTFNumero1.getText()));
        calculadora.setNumero2(Double.parseDouble(getFrmCalculadora().jTFNumero2.getText()));
        getFrmCalculadora().jTFResultado.setText(Double.toString(calculadora.getSoma()));
    }

    void jBSubtrair_actionPerformed(ActionEvent e) {
        Calculadora calculadora = new Calculadora();
        calculadora.setNumero1(Double.parseDouble(getFrmCalculadora().jTFNumero1.getText()));
        calculadora.setNumero2(Double.parseDouble(getFrmCalculadora().jTFNumero2.getText()));
        getFrmCalculadora().jTFResultado.setText(Double.toString(calculadora.getDiferenca()));
    }

    void jBMultiplicar_actionPerformed(ActionEvent e) {
        Calculadora calculadora = new Calculadora();
        calculadora.setNumero1(Double.parseDouble(getFrmCalculadora().jTFNumero1.getText()));
        calculadora.setNumero2(Double.parseDouble(getFrmCalculadora().jTFNumero2.getText()));
        getFrmCalculadora().jTFResultado.setText(Double.toString(calculadora.getProduto()));
    }

    void jBDividir_actionPerformed(ActionEvent e) {
        Calculadora calculadora = new Calculadora();
        calculadora.setNumero1(Double.parseDouble(getFrmCalculadora().jTFNumero1.getText()));
        calculadora.setNumero2(Double.parseDouble(getFrmCalculadora().jTFNumero2.getText()));
        getFrmCalculadora().jTFResultado.setText(Double.toString(calculadora.getQuociente()));
    }

    void jBLimpar_actionPerformed(ActionEvent e) {
        getFrmCalculadora().jTFNumero1.setText("");
        getFrmCalculadora().jTFNumero2.setText("");
        getFrmCalculadora().jTFResultado.setText("");
    }

    void jBFechar_actionPerformed(ActionEvent e) {
        System.exit(0);
    }

    /**
     * Retorna o formulário utilizado por este controle.
     */
    public FrmCalculadora getFrmCalculadora() {
        return frmCalculadora;
    }

    /**
     * Modifica o formulário utilizando por este controle.
     *
     * @param frmCalculadora Um formulario do tipo FrmCalculadora.
     */
    public void setFrmCalculadora(FrmCalculadora frmCalculadora) {
        this.frmCalculadora = frmCalculadora;
    }
}
