import java.io.FileWriter;
import java.io.PrintWriter;
import java.util.Scanner;

public class LeitorDeAlunos {
    public static void main(String[] args) {
        
        try {
        Scanner scanner = new Scanner(System.in);
        
        FileWriter arq = new FileWriter("C:\\Users\\geniu\\Downloads\\ListaIX\\alunos_universidade.txt");
        
        PrintWriter gravarArq = new PrintWriter(arq);

        String[] nomes = new String[5];
        
        double[] notasFinais = new double[5];

        System.out.println("Digite o nome e a nota final de cada aluno(a):");

        gravarArq.println("Dados dos alunos: ");

        for (int n = 0; n < 5; n++) {

            System.out.println("Digite o nome do " + (n + 1) + "° aluno: ");
            nomes[n] = scanner.nextLine();
        
            System.out.println("Digite a nota final do " + (n + 1) + "° aluno: ");
            notasFinais[n] = scanner.nextDouble();
    
            scanner.nextLine(); 
            System.out.println();
            
            

            gravarArq.print("Aluno: " + nomes[n]);
            gravarArq.print("\tNota Final: " + notasFinais[n]);
            gravarArq.println();
        }
        System.out.println("Dados salvos com sucesso.");

        gravarArq.close();
        
        scanner.close();

        }
        
        catch (Exception e) {
            System.out.println("Erro.");
        }
        
        finally {
            System.out.println("Programa finalizado.");
        }
    }
}