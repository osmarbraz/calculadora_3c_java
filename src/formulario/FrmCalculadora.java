package formulario;

import java.awt.Dimension;
import java.awt.Rectangle;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

/**
 * Classe que implementa a interface principal do sistema.
 *
 * @author osmarbraz
 * @version 1.0
 * @updated 14-nov-2012 16:08:57
 */
@SuppressWarnings("serial")
public class FrmCalculadora extends JFrame {

    private javax.swing.JLabel jLBNumero1;
    public javax.swing.JTextField jTFNumero1;

    private javax.swing.JLabel jLBNumero2;
    public javax.swing.JTextField jTFNumero2;

    private javax.swing.JLabel jLBResultado;
    public javax.swing.JTextField jTFResultado;

    public javax.swing.JButton jBtnSomar;
    public javax.swing.JButton jBtnSubtrair;
    public javax.swing.JButton jBtnDividir;
    public javax.swing.JButton jBtnMultiplicar;

    public javax.swing.JButton jBtnLimpar;
    public javax.swing.JButton jBtnFechar;

    private JPanel contentPane;

    /**
     * Construtor sem argumento.
     */
    public FrmCalculadora() {
        inicializar();
    }

    /**
     * Inicializa os componentes da janela.
     */
    private void inicializar() {
        contentPane = (JPanel) this.getContentPane();

        jBtnSomar = new javax.swing.JButton();
        jBtnSubtrair = new javax.swing.JButton();
        jBtnMultiplicar = new javax.swing.JButton();
        jBtnDividir = new javax.swing.JButton();
        jBtnLimpar = new javax.swing.JButton();
        jBtnFechar = new javax.swing.JButton();

        jLBNumero1 = new javax.swing.JLabel();
        jLBNumero2 = new javax.swing.JLabel();

        jTFNumero1 = new javax.swing.JTextField();
        jTFNumero2 = new javax.swing.JTextField();

        jLBResultado = new javax.swing.JLabel();
        jTFResultado = new javax.swing.JTextField();

        contentPane.setLayout(null);
        this.setSize(new Dimension(325, 220));
        this.setTitle("Calculadora");
        this.addWindowListener(new WindowAdapter() {
            public void windowClosing(WindowEvent e) {
                System.exit(0);
            }
        });

        jLBNumero1.setBounds(new Rectangle(11, 11, 60, 17));
        jTFNumero1.setBounds(new Rectangle(11, 28, 70, 21));
        jLBNumero1.setText("Numero1");

        jLBNumero2.setBounds(new Rectangle(11, 60, 60, 17));
        jTFNumero2.setBounds(new Rectangle(11, 75, 70, 21));
        jLBNumero2.setText("Numero2");

        jLBResultado.setBounds(new Rectangle(11, 109, 170, 17));
        jTFResultado.setBounds(new Rectangle(11, 124, 150, 21));
        jLBResultado.setText("Resultado");

        jBtnSomar.setBounds(new Rectangle(200, 9, 110, 27));
        jBtnSomar.setText("Somar");

        jBtnSubtrair.setBounds(new Rectangle(200, 39, 110, 27));
        jBtnSubtrair.setText("Subtrair");

        jBtnMultiplicar.setBounds(new Rectangle(200, 69, 110, 27));
        jBtnMultiplicar.setText("Multiplicar");

        jBtnDividir.setBounds(new Rectangle(200, 99, 110, 27));
        jBtnDividir.setText("Dividir");

        jBtnLimpar.setBounds(new Rectangle(200, 129, 110, 27));
        jBtnLimpar.setText("Limpar");

        jBtnFechar.setBounds(new Rectangle(200, 159, 110, 27));
        jBtnFechar.setText("Fechar");

        contentPane.add(jLBNumero1, null);
        contentPane.add(jTFNumero1, null);
        contentPane.add(jLBNumero2, null);
        contentPane.add(jTFNumero2, null);
        contentPane.add(jLBResultado, null);
        contentPane.add(jTFResultado, null);

        contentPane.add(jBtnSomar, null);
        contentPane.add(jBtnSubtrair, null);
        contentPane.add(jBtnMultiplicar, null);
        contentPane.add(jBtnDividir, null);
        contentPane.add(jBtnLimpar, null);
        contentPane.add(jBtnFechar, null);

    }

    public void mostrarMensagem(String mensagem) {
        JOptionPane.showMessageDialog(null, mensagem);
    }

    /**
     * Processa os eventos da janela.
     *
     * @param e Eventos da janela.
     */
    protected void processWindowEvent(WindowEvent e) {
        super.processWindowEvent(e);
        if (e.getID() == WindowEvent.WINDOW_CLOSING) {
            System.exit(0);
        }
    }
}
