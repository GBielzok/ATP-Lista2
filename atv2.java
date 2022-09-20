//Exercício 2
import java.util.Scanner;

public class atv2 {
  public static void main(String[] args) {

    Scanner sc = new Scanner(System.in);

    int x, y;
//Entrada do usuário com valores para X e Y
    System.out.println("Digite um valor para x:");
    x = sc.nextInt();

    System.out.println("Digite um valor para y:");
    y = sc.nextInt();
//Atribuído que se x positivo e y positivo = primeiro quadrante.
    if (x > 0 && y > 0){
        System.out.println(x+ "," +y+ " PRIMEIRO QUADRANTE.");
//Atribuído que se x negativo e y positivo = primeiro quadrante.   
    }else if (x < 0 && y > 0){
        System.out.println(x+ "," +y+ " SEGUNDO QUADRANTE.");
//Atribuído que se x negativo e y negativo = primeiro quadrante.    
    }else if (x < 0 && y < 0){
        System.out.println(x+ "," +y+ " TERCEIRO QUADRANTE.");
//Atribuído que se x positivo e y negativo = primeiro quadrante.    
    }else if (x > 0 && y < 0){
        System.out.println(x+ "," +y+ " QUARTO QUADRANTE.");
  } 
sc.close();
 }
}
