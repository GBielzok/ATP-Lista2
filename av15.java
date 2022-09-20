//Exercício 15
import java.util.*;
    public class atv15{
    public static void main (String [] args) {
    
        System.out.print(s:);
        Scanner sc = new Scanner(System.in);
    
        float c501=0, c555=0, c430=0, c126=0, pc501=0, pc555=0,
        pc430=0, pc126=0;
        int canal, cont = 0;
        
        do{
            System.out.println(x:"Digite o canal");
            canal = sc.nextInt();
            switch (canal) {
                case 501:
                c501++;
                    break;
                case 555:
                c555++;
                    break;
                case 430:
                c430++;
                    break;
                case 126:
                c126++;
                    break;
                }
                
                if (canal !=0){
                    cont++;
                }
                
                while(canal !=0);
                pc126 = (c126/cont)*100;
                pc430 = (c430/cont)*100;
                pc501 = (c501/cont)*100;
                pc555 = (c555/cont)*100;
                
                System.out.println("Porcentagem canal 126: " +pc126);
                System.out.println("Porcentagem canal 430: " +pc430);
                System.out.println("Porcentagem canal 501: " +pc501);
                System.out.println("Porcentagem canal 555: " +pc555);
                sc.close();
                }
                }
