import java.util.Scanner;

public class main {
    private static Scanner teclado = new Scanner(System.in).useDelimiter("\n");

    public static void main(String[] args) {
        int opcao;

        do {
            opcao = exibirMenu();

            switch (opcao) {
                case 1:
                    //listarContas();
                    break;
                case 2:
                    //abrirConta();
                    break;
                case 3:
                    //encerrarConta();
                    break;
                case 4:
                    //consultarSaldo();
                    break;
                case 5:
                    //realizarSaque();
                    break;
                case 6:
                    //realizarDeposito();
                    break;
                case 7:
                    System.out.print("Saindo...");
                    break;
                default:
                    System.out.println("Erro");
                    System.out.println("Pressione qualquer tecla e de ENTER para voltar ao menu");
                    teclado.next();
                    break;
            }
        }while (opcao != 7);
    }

    private static int exibirMenu() {
        System.out.println("""
                
                ❤️❤️ Mercadinho da Carol ❤️❤️ 
                
                ESCOLHA UMA OPÇÃO:
                1 - Listar contas abertas
                2 - Abertura de conta
                3 - Encerramento de conta
                4 - Consultar saldo de uma conta
                5 - Realizar saque em uma conta
                6 - Realizar depósito em uma conta
                7 - Sair
                """);
        return teclado.nextInt();
    }
}
