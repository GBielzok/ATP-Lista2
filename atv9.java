//Exercício 9
import java.util.Scanner;

public class atv9 {
    public static void main(String[] args) {
    
        Scanner sc = new Scanner(System.in);
    
    float masc=0, femi=0, voto, sexo;
    float femi_sim=0, femi_não=0, masc_sim=0, masc_nã0=0;
    float pormascsim, pormcnao, porfemsim,porfemnao;
    int cont=0;
    
    while (cont <150){
    
    System.out.println(" Sobre a gestão atual do D.A, você é a favor: 1- Sim e 0 - Não");
    voto = sc.nextFloat();
    
    System.out.println(" Digite seu gênero, 0- Feminino ou 1-Masculino");
    sexo = sc.nextFloat();
    
        if (sexo == 0){
            femi++;
        
        }else if (sexo == 1){
            masc++;
        
        }if (voto ==1 && sexo==0 ){
            femi_sim++;
        
        }else if (voto == 0 && sexo==0){
            femi_não++;
        
        }else if( voto ==1 && sexo==1){
            masc_sim++;
        
        }else if(voto ==0 && sexo==1){
            masc_nã0++;
        
        }
        cont++;
    }
    
    porfemsim = (femi_sim/femi)*100;
    porfemnao = (femi_não/femi)*100;
    pormascsim = (masc_sim/masc)*100;
    pormcnao= (masc_nã0/ masc)*100;
    
    System.out.println("Resultados femininos:");
    System.out.println((" O total do publico feminino que participaram foi de: " +femi));
    System.out.println(" O total do publico feminino que aprova a gestão e iguaal a: " +femi_sim);
    System.out.println(" O total do publico feminino que não aprova a gestão e iguaal a: " +femi_não);
    System.out.println(" A porcentagem total de votos sim e igual a:" +porfemsim);
    System.out.println(" A porcentagem total de votos não e igual a:" +porfemnao);
    System.out.println("Resultados masculinos:");
    System.out.println((" O total do publico masculino que participaram foi de: " +masc));
    System.out.println(" O total do publico masculino que aprova a gestão e iguaal a: " +masc_sim);
    System.out.println(" O total do publico masculino que não aprova a gestão e iguaal a: " +masc_nã0);
    System.out.println(" A porcentagem total de votos sim e igual a:" +pormascsim);
    System.out.println(" A porcentagem total de votos não e igual a:" +pormcnao);
    
    sc.close();
    }
}
