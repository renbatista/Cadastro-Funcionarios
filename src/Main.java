import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args){

        var scanner = new Scanner(System.in);
        // Cada funcionario tem que ter nome, email, senha.

        ArrayList <Gerente> gerentes = new ArrayList<>();
        ArrayList <Vendedor> vendedores = new ArrayList<>();
        ArrayList <Atendente> atendentes = new ArrayList<>();

        boolean on = true;
        boolean continuar;
        String nome, email, senha;

        do {
            continuar = true;

            System.out.println("==== Cadastro de Funcionarios ====");
            System.out.println("Escolha a função:");
            System.out.println("1 - Gerente");
            System.out.println("2 - Vendedor");
            System.out.println("3 - Atendendente");

            int opfuncionario = scanner.nextInt();
            scanner.nextLine();

            if(opfuncionario == 1){
                System.out.println("Digite o nome: ");
                nome = scanner.nextLine();
                System.out.println("Digite o email: ");
                email = scanner.nextLine();
                System.out.println("Digite a senha: ");
                senha = scanner.nextLine();

                gerentes.add(new Gerente(nome, email, senha));

            } else if (opfuncionario == 2) {
                System.out.println("Digite o nome: ");
                nome = scanner.nextLine();
                System.out.println("Digite o email: ");
                email = scanner.nextLine();
                System.out.println("Digite a senha: ");
                senha = scanner.nextLine();

                vendedores.add(new Vendedor(nome, email, senha));

            } else if (opfuncionario == 3 ) {
                System.out.println("Digite o nome: ");
                nome = scanner.nextLine();
                System.out.println("Digite o email: ");
                email = scanner.nextLine();
                System.out.println("Digite a senha: ");
                senha = scanner.nextLine();

                atendentes.add(new Atendente(nome, email,senha));

            }else{
                System.out.println("COMANDO ERRADO!");
            }
            do {


                System.out.println("Deseja adicionar mais algum funcionário?");
                System.out.println(" 1 - SIM / 2 - NÃO");

                int opcao = scanner.nextInt();

                if (opcao == 2) {
                    on = false;
                    continuar = false;
                } else if (opcao == 1) {
                    continuar = false;
                } else {
                    System.out.println("Comando errado!");
                }
            }while (continuar);

        }while (on);

        System.out.println("Temos " + gerentes.size() + " gerente(s)");
        System.out.println("Temos " + vendedores.size() + " vendedor(es)");
        System.out.println("Temos " + atendentes.size() + " atendente(s)");

    }

}
