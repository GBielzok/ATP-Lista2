//Exercício 1
import java.util.Scanner;

public class atv1 {
  public static void main(String[] args) {

    Scanner sc = new Scanner(System.in);
    int dcode, totalAulas, totalFaltas;
    float notaSemestral, provaFinal, exameEspecial, notaFinal;
//Entrada de dados iniciais, tais como: código da disciplina, total de aulas e total de faltas.
    System.out.println("Digite um código da disciplina:");
    dcode = sc.nextInt();

    System.out.println("Digite o número total de aulas:");
    totalAulas = sc.nextInt();

    System.out.println("Digite o número total de faltas:");
    totalFaltas = sc.nextInt();
// Caso o aluno tenha mais que o nº tolerável de faltas ele já é reprovado.
    if (totalFaltas > totalAulas * 0.25) {

      System.out.println("O aluno foi reprovado na disciplina " + dcode + " por infrequência.");
//Caso não, é pedido a nota semestral.
    } else {
      System.out.println("Digite a nota do semestre sem a prova final:");
      notaSemestral = sc.nextFloat();
//Caso a nota semestral sejá maior ou igual a 30 é pedido a nota da prova final, caso contrário o aluno já é reprovado.
      if (notaSemestral >= 30) {
        System.out.println("Digite a nota da sua prova final:");
        provaFinal = sc.nextFloat();
//Aqui foi atribuido a nota da prova final somada a nota do semestre à variável "notaFinal".        
        notaFinal = provaFinal + notaSemestral;
//Caso o aluno atinja 60 pontos ou mais ele e aprovado.
        if (notaFinal >= 60) {
          System.out.println("O aluno foi aprovado na disciplina " + dcode + " com a nota final " + notaFinal);
//Caso o aluno não atinja 60 pontos ou mais, ele deve digitar a nota do exame especial.
        } else {
          System.out.println("Digite a nota do seu exame especial:");
          exameEspecial = sc.nextFloat();
//Aqui se soma a nota semestral com a nota do exame especial e caso seja maior ou igual a 60 p aluno é aprovado, caso contrário, reprovado.
          if (exameEspecial + notaSemestral >= 60) {            
//Aqui foi atribuido a nota do exame especial somada a nota do semestre à variável "notaFinal".              
            notaFinal = exameEspecial + notaSemestral;
            System.out.println("O aluno foi aprovado na disciplina " + dcode + " com a nota final " + notaFinal);
//Aqui o aluno está sendo reprovado por não ter atinjido 60 ou mais mesmo tendo feito o exame especial.
          } else {
            System.out.println("O aluno foi reprovado na disciplina " + dcode + " por nota.");
          }
        }
//Aqui o aluno está sendo reprovado por não atingir 30 ou mais pontos no semestre.      
      } else
        System.out.println("O aluno foi reprovado na disciplina " + dcode + " por nota.");
    }

    sc.close();
  }
}
