import java.io.PrintWriter;
import java.io.FileWriter;
import java.util.Scanner;

public class ProgramaPrincipal {
    public static void main(String[] args) {

        try {
            Scanner scanner = new Scanner(System.in);
            FileWriter arq = new FileWriter(D:\\Users\\matheus\\Desktop\\ListasUna\\Questao2");
            PrintWriter gravarArq = new PrintWriter(arq);

            Lista[] compras = new Lista[10];

            System.out.println("Digite o produto escolhido e seu respectivo valor.");
        
            for (int i = 0; i < 10; i++) {
                System.out.print("Item " + (i + 1) + ": ");
                String item = scanner.nextLine();

                System.out.print("Valor: ");
                double valor = scanner.nextDouble();
                scanner.nextLine();

                compras[i] = new Lista(item, valor);
            }

            System.out.println("\nLista de Compras:");

            for (int i = 0; i < 10; i++) {
                gravarArq.println("Item: " + compras[i].getItem() + " = Valor: R$" + compras[i].getValor());
            }

            arq.close();
            scanner.close();
        
    
        } catch (Exception e) {
            System.out.print("Não foi possível salvar os arquivos.");
        }
    }
}