package src.aula01_vetor_estrutura;

public class ComNumero {
    public static void main(String[] args) {
        int[] vetorzao = new int[8];
        vetorzao[0] = 1;
        vetorzao[1] = 4;
        vetorzao[2] = 8999999;
        vetorzao[3] = 37;
        vetorzao[4] = 67;
        vetorzao[5] = 5;
        vetorzao[6] = 3;
        vetorzao[7] = 2;
       for (int i = 0; i < 8; i++) {
        System.out.println(vetorzao[i]);
       }
       System.out.println("Acabou");
    }
}
