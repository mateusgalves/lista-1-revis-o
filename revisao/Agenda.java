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
class Main {

    public class Agenda {

        private String[] nome = new String[10];
        private int[] idade = new int[10];
        private float[] altura = new float[10];
        int total_agenda = 0;

        public void Agenda() {
            System.out.println("Agenda: ");
        }

        ;
        int BuscarPessoa(String Wnome) {
            int achou = 0;
            for (int i = 0; i < 10; i++) {
                if (nome[i] == Wnome) {
                    achou = i + 1;
                    break;
                }
            }

            return achou;
        }

        int ArmazenarPessoa(String Wnome, int Widade, float Waltura) {
            if (total_agenda < 10) {
                nome[total_agenda] = Wnome;
                altura[total_agenda] = Waltura;
                total_agenda++;
                return (total_agenda);
            } else {
                return 0;
            }
        }

        int temQuantos() {
            return total_agenda;
        }

        boolean RemovePessoa(String Wnome) {
            int w;
            if (total_agenda < 1) {
                //se a agenda estiver vazia
                return false;
            };

            w = BuscarPessoa(Wnome); //retorna a posição base 1
            if (w != 0) {
                w--; //muda para base 0

                for (int i = w; i < total_agenda - 1; i++) {
                    nome[i] = nome[i + 1];
                    idade[i] = idade[i + 1];
                    altura[i] = altura[i + 1];
                };

                //zera o ultimo lançamento
                nome[9] = "";
                idade[9] = 0;
                altura[9] = 0;
                total_agenda--;
                return true;
            } else {
                return false;

            }

        }

        void ImprimirPessoa(int posicao) {
            int i = posicao - 1;
            System.out.println(posicao + "/" + nome[i] + "/" + idade[i] + "/" + altura[i]);
        }

        void imprimirAgenda() {
            System.out.println("posição/Nome/Idade/Altura");
            for (int i = 0; i < total_agenda; i++) {
                ImprimirPessoa(i + 1);
            }
        }

    };
    
    
}
