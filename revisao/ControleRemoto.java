

package lista.pkg1.exercico.revisao;
import java.util.Scanner;
/**
 *
 * @author Home
 */
public class ControleRemoto {
    private static int consulta;
    private static Scanner entrada;
    
    public static int getConsulta(){
        return consulta;
    }
    
    public static Scanner getEntrada(){
        return entrada;
        
    }
    
    public static void setEntrada (Scanner entrada){
        ControleRemoto.entrada = entrada;
    }
    public static void main (String[]args){
        setEntrada (new Scanner (System.in));
    }
}
