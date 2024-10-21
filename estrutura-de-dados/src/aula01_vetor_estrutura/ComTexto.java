package src.aula01_vetor_estrutura;

import java.util.Scanner;

public class ComTexto {
    public static void main(String[] args) {
        String[] estados = new String[10];
        estados[0] = "AC";
        estados[1] = "PA";
        estados[2] = "Am";
        estados[3] = "GO";
        estados[4] = "MG";
        estados[5] = "RR";
        estados[6] = "TO";
        estados[7] = "SP";
        estados[8] = "RJ";
        estados[9] = "RO";
        for (int i = 0; i < 10; i++) {
            System.out.println("Estado "+ i+ ": " + estados[i]);
        }
        Scanner leitor = new Scanner(System.in);
        System.out.println("Qual sigla você busca?");
        String siglaBusca = leitor.nextLine();
        //busca linear
        boolean encontrou = false;
        for (int i = 0; i < estados.length; i++) {
            String elemento = estados[i];
            if(elemento.equals(siglaBusca)){
                encontrou =true;
                break;
            }
        }
        if(encontrou == true){
            System.out.println("Tem sim");
        }else{
            System.out.println("Não tem");
        }
    }
}
