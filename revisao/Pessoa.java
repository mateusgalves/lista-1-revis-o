import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;

public class Pessoa {

    private String nome;
    private Date dataNasc;
    private float altura;
    private int ano;
    

    public Pessoa(String nome, String dataNasc, float altura, int ano) throws ParseException {
        this.nome = nome;
        this.dataNasc = new SimpleDateFormat("yyyy-MM-dd").parse(dataNasc);
        this.altura = altura;
       
    }

    Pessoa(String nome, String dataNasc, float altura) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getNome() {
        return nome;
    }

    public void setDataNacimento(String dataNasc) throws ParseException {

        this.dataNasc = new SimpleDateFormat("yyyy-MM-dd").parse(dataNasc);
    }

    public Date getDataNasc() {
        return dataNasc;
    }

    public void setAltura (float altura){
        this.altura = altura;
    }
    
    public float getAltura (){
        return altura;
    }
    
    public int calcularData (int ano){
        
        Date dataNasc = new Date();
        Calendar calendar = new GregorianCalendar();
        calendar.setTime(dataNasc);
        int year = calendar.get(calendar.YEAR);
        
        int idade = ano - year;
        return ano;
        
    }
        
    }