//Exercício 10
import java.util.Scanner;
    public class atv10 {
    public static void main(String[] args) {
    
    Scanner sc = new Scanner(System.in);
    
    int som20=0, som30=0, som40=0, num=0;
   
    for(int i = 1; i <=40; i++){
    System.out.println(" Digite um número: ");
    num = sc.nextInt();
    
    if(i >=1 && i <=20){
    som20= som20 + num;
    }else if (i>= 21 && i<=30){
    som30=som30 + num;
    }else {
    som40=som40 + num;
    }
    }
    
    System.out.println(" A somas dos primeiros 20 numeros e igual a:" +som20);
    System.out.println(" A somas do 21° ate o nuemero 30 e igual a:" +som30);
    System.out.println(" A somas do 31° ate o numero 40 e igual a:" +som40);
    sc.close();
    }
    }
