//Exercício 6
import java.util.*;

public class atv6 {

    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {

        int candidato = 0, candidato1 = 0, candidato2 = 0, candidato3 = 0, candidato4 = 0, nulos = 0, brancos = 0;

        do {

            System.out.println("Digite seu código de voto:");
            candidato = sc.nextInt();

            switch (candidato) {

                case 1:

                    candidato1++;

                    break;

                case 2:

                    candidato2++;

                    break;

                case 3:

                    candidato3++;

                    break;

                case 4:

                    candidato4++;

                    break;

                case 5:

                    nulos++;

                    break;

                case 6:

                    brancos++;

                    break;

                default:
                    System.out.println("Número de votação inválido.");
            }

        } while (candidato != 0);

        System.out.println("Número de votos para candidato 1: " + candidato1);
        System.out.println("Número de votos para candidato 2: " + candidato2);
        System.out.println("Número de votos para candidato 3: " + candidato3);
        System.out.println("Número de votos para candidato 4: " + candidato4);
        System.out.println("Número de votos nulos: " + nulos);
        System.out.println("Número de votos brancos: " + brancos);
    }
}
