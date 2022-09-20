//Exercício 3
import java.util.Scanner;

public class atv3 {

    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
//Atribuindo valores às variáveis contador (armazena quantas vezes que foi rodado) e multiplo (armazena os multiplos de 3).
        int contador = 1, multiplo = 0;
//Dizendo para rodar 100 vezes.
        while (contador <= 100) {
//Dizendo que para cada vez que rodar, imprimir a variável multiplo (inicialmente 0) + 3.
            multiplo = multiplo + 3;
//Imprime todos os 100 primeiros multiplos na tela.
            System.out.println(multiplo);
//Atribui +1 a cada vez que roda o while imprime na tela um multiplo (de 3).
            contador++;
        }
        sc.close();
    }
}
