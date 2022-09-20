//Exercício 11
import java.util.*;

public class atv11 {
    public static void main (String [] args) {
    
    System.out.print(s:);
    Scanner sc = new Scanner(System.in);
    
    int pot = 1, bs, exp;
    System.out.print(x:"Digite a base e o exponte");
    bs = sc.nextInt();
    exp = sc.nextInt();
    
    for(int i = 1; i<= exp){
    pot = pot * bs;
    }
    
    System.out.println(bs + "^" + exp + "=" pot);
    }
}
