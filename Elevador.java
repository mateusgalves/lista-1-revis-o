
import java.util.List;

public class Elevador {

    private int edificio;
    private int qualAndar;
    private int andarAtual = 0;
    private int qualAndarQuerIr = 0;
    private List<Pessoa> pessoas;

    public void setPessoas(List<Pessoa> pessoas) {
        this.pessoas = pessoas;

    }

    public int getAndarAtual() {
        return andarAtual;
    }
    
    public void setAndarAtual(int edificio, int qualAndar){
        this.edificio = edificio;
        this.qualAndar = qualAndar;
        
    }
    
    public int getQualAndarQuerIr(){
        return qualAndarQuerIr;
    }
    
    public List<Pessoa> getPessoas(){
        return qualAndarQuerIr;
    }

    public List <Pessoa> getPessoas(){
        return this.pessoas;
    }
    
    public void SubirDescer(){
        if (andarAtual > qualAndarQuerIr){
            System.out.println("Sobe");
        }else{
            System.out.println ("Desce");
        }
    }
}
