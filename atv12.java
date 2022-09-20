//Exercício 12
import java.util.*;

public class atv12 {

    public static void main (String [] args) {
    System.out.print(s:);
    Scanner sc = new Scanner(System.in);
    
    float massa;
    int contador = 0, tempoT, h, resto, m, s;
    
    System.out.println(x:"Digite a massa, em gramas");
    massa = sc.nextFloat();
   
    while(massa > 0.5){
        contador++;
    }
    tempoT = contador * 50;
    h = tempoT/3600;
    resto = tempoT - ( h *3600);
    m = resto/60;
    s = resto - (m*60);
   
    System.out.println(h + ":" + m + ":" + s);
    }
}
