//Exercício 5
import java.util.Scanner;

public class atv5 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int idade = 0, filhos = 0, somaIdade = 0, somaFilhos = 0, maiorIdade = 0, percentual = 0, moradores = 0, acima60 = 0;
        float mediaIdade=0, mediaFilhos=0;

        do {

            System.out.println("Digite sua idade:");
            idade = sc.nextInt();

            somaIdade = somaIdade + idade;

            System.out.println("Digite quantos filhos você tem:");
            filhos = sc.nextInt();

            somaFilhos = somaFilhos + filhos;

            if (maiorIdade > idade) {

                maiorIdade = idade;
            }

            if (idade >= 60) {

                acima60++;
            }

            if (idade > 0) {

                moradores++;
            }

        } while (idade > 0);

        mediaIdade = (float) somaIdade / moradores;
        mediaFilhos = (float) somaFilhos / moradores;
        percentual = acima60 / moradores * 100;

        System.out.println("A idade média entre os moradores é de " + mediaIdade);
        System.out.println("A média do número de filhos entre os moradores é de " + mediaFilhos);
        System.out.println("A maior idade entre os moradores é de " + maiorIdade);
        System.out.println("O percentual de pessoas acima de 60 anos é de " + percentual);

        sc.close();
    }
}
