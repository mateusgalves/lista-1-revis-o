/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lista.pkg1.exercico.revisao;

/**
 *
 * @author Home
 */
public class AgendaTeste {
    public static void main (String []args){
        Agenda minha_agenda = new Agenda();
        System.out.println ("A Agenda Contém: " + minha_agenda.temQuantos());
        
        minha_agenda.ArmazenarPessoa ("João, 52, 1.81f");
        minha_agenda.ArmazenarPessoa ("Lara, 49, 1.72f");
        minha_agenda.ArmazenarPessoa ("Nani, 27, 1.76f");
        minha_agenda.ArmazenarPessoa ("Rayssa, 26, 1.45f");
        minha_agenda.ArmazenarPessoa ("Enrico, 24, 1.76f");
        minha_agenda.ArmazenarPessoa ("Gabriel, 23, 1.76f");
        minha_agenda.ArmazenarPessoa ("Caio, 25, 1.65f");
        minha_agenda.ArmazenarPessoa ("Jane, 35, 1.65f");
        minha_agenda.ArmazenarPessoa ("Mauro, 49, 1.81f");
        //o próximo não irá funcionar pois não caberá na agenda
        
        System.out.println (minha_agenda.ArmazenarPessoa("Samuel", 42, 1.70f));
        
        System.out.println ("A Agenda: " + minha_agenda.ImprimirAgenda());
        
        System.out.println ("Buscar Rayssa? " + minha_agenda.BuscarPessoa("Rayssa"));
        
        System.out.println ("Buscar Néia? " + minha_agenda.BuscarPessoa("Néia"));
        
        if (minha_agenda.RemovePessoa("Rayssa")){
            System.out.println ("Remover Rayssa");
            
            System.out.println (" A Agenda Contém:  " + minha_agenda.temQuantos());
        };
        
        System.out.println ("*");
        minha_agenda.ImprimirAgenda();
        if (minha_agenda.RemovePessoa("Maurício")){
            System.out.println ("Remover Mauricio");
        }else{
            System.out.println ("Não foi possivel remover");
                    }
        System.out.println ("*");
        minha_agenda.ImprimirAgenda();
        
        if (minha_agenda.RemovePessoa("mauro")){
             System.out.println ("Remover Mauro");
        }else{
             System.out.println ("Não foi possivel remover");
             
        }
         System.out.println ("*");
         minha_agenda.ImprimirAgenda();
    }
    
}
