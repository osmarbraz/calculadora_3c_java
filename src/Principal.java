
import controle.CtrCalculadora;

/**
 * Classe que possui a operação main da aplicação. Server para dar inicio ao
 * sistema.
 *
 * @author osmarbraz
 * @version 1.0
 * @updated 19-nov-2013 15:22:20
 */
public class Principal {

    /**
     * Inicia a aplicação.
     *
     * @param args args
     */
    public static void main(String[] args) {

        CtrCalculadora controle = new CtrCalculadora();
        controle.executar();
    }
}
