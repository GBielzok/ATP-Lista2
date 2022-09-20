//Exercício 4
import java.util.Scanner;

public class atv4 {

    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    
    int kesimo;

//Usuário atribui um número inteiro à variável "kesimo".
    System.out.println("Digite um número inteiro:");
    kesimo = sc.nextInt();
    
//Cálculo do késimo
//Dividindo o valor em kesimo por 10
    kesimo = kesimo / 10;
//Dividindo o quociente por 10   
    kesimo = kesimo / 10;
//Pegando o resto da divisão do quociente por 10 (que é o k-ésimo)
    kesimo = kesimo % 10;

//Imprimindo o resultado
    System.out.println(kesimo);
    
    
        sc.close();
    }
}
