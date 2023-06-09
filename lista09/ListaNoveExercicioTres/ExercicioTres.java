import java.io.FileWriter;
import java.io.PrintWriter;
import java.util.Scanner;
import java.util.Random;

public class ExercicioTres {
    public static void main(String[] args) {
        try {
            Scanner scanner = new Scanner(System.in);
            Random random = new Random();
            FileWriter arq = new FileWriter("C:\\Users\\Usuario\\Downloads\\Lista_9_UNA\\ExercicioTres\\recibo_viagem.txt");
            PrintWriter gravarArq = new PrintWriter(arq);

            String nome, cpf, destino, escolha;
            int idade, poltrona;
            double valor;

            System.out.println("Coleta de dados para viagem:");

            System.out.print("\nDigite seu nome: ");
            nome = scanner.nextLine();
            System.out.print("Digite sua idade: ");
            idade = scanner.nextInt();

            while (true) {
                System.out.print("Digite seu CPF (xxx.xxx.xxx-xx): ");
                cpf = scanner.next();

                if (cpf.length() == 14) {
                    if (cpf.charAt(3) == '.' && cpf.charAt(7) == '.' && cpf.charAt(11) == '-') {
                        break;
                    } else {
                        System.out.println("\nCPF inválido, digite-o corretamente.");
                    }
                } else {
                    System.out.println("\nCPF inválido, digite-o corretamente.");
                }
            }

            while (true) {

                System.out.println("\nEscolha um destino de acordo com os números a seguir: \n1 - São Paulo | R$250,00 \n2 - Nova York | R$2400,00 \n3 - Berlim    | R$3800,00");
                escolha = scanner.next();

                switch (escolha) {
                    case "1":
                    destino = "São Paulo";
                    valor = 250.00;
                        break;
                    case "2":
                    destino = "Nova York";
                    valor = 2400.00;
                        break;
                    case "3":
                    destino = "Berlim";
                    valor = 3800.00;
                        break;
                    default:
                        System.out.println("\nEscolha inválida. Favor escolher um número válido do menu.");
                        continue;
                }
                break;
            }

            System.out.println("\nRecibo gerado com sucesso.");
            poltrona = random.nextInt(20) + 1;
            //A baixo, faço o recibo
            gravarArq.println("\t#### Dados pessoais ####");
            gravarArq.printf("Nome: %s%nIdade: %d%nCPF: %s", nome, idade, cpf);
            gravarArq.println();
            gravarArq.println("\t#### Dados da viagem ####");
            gravarArq.printf("Destino: %s%nValor: R$%.2f%nNúmero da poltrona: %d", destino , valor, poltrona);

            gravarArq.close();
            scanner.close();

        } catch (Exception e) {
            System.out.println("Deu algo errado.");
        } finally {
            System.out.println("Programa concluído.");
        }
    }
}