
import java.util.ArrayList;
import java.util.Scanner;
import java.util.Collections;

public class ProgramaOrdenarNotas {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        ArrayList<String> listaAlunos = new ArrayList<String>();
        ArrayList<Double> notaAlunos = new ArrayList<Double>();

        char continuarLoop = 's';
        for (int i = 1; i < 1000; i++) {

            System.out.println("Cadastrar aluno (nome) " + i + ":");
            listaAlunos.add(sc.nextLine());
            System.out.println("Qual foi a nota final do aluno " + i + "?:");
            notaAlunos.add(sc.nextDouble());

            System.out.println("Aluno cadastrado com sucesso");

            System.out.println("Cadastrar novo aluno? [s] [n]");
            continuarLoop = sc.next().charAt(0);
            sc.nextLine();
            
            if (continuarLoop == 'n') {
                System.out.println("segue relação dos alunos em ordem de nota:");

                for (int k = 0; k < 100; k++) {

                    for (int j = 0; j < listaAlunos.size() - 1; j++) {
                        if (notaAlunos.get(j) < notaAlunos.get(j + 1)) {
                            Collections.swap(notaAlunos, j, j + 1);
                            Collections.swap(listaAlunos, j, j + 1);

                        }
                    }
                }

                System.out.println("Operacao conluida");
                for (int y = 0; y < listaAlunos.size(); y++) {
                    System.out.println("Nota do aluno 1 (" + listaAlunos.get(y) + "):" + notaAlunos.get(y));
                    i = i + 1000;
                }

            }

        }
    }

}
