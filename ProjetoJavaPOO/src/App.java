import entidades.Usuario;
import entidades.Produtos;
import java.time.LocalDate;
import java.time.temporal.ChronoUnit;
import java.util.List;
import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        ServicoAutenticacao servicoAutenticacao = new ServicoAutenticacao();
        ServicoProdutos servicoProdutos = new ServicoProdutos();
        Scanner scanner = new Scanner(System.in);


        boolean sistemaAtivo = true;

        while (sistemaAtivo) {
            System.out.println("Bem-vindo ao Sistema.");
            System.out.println("1. Cadastrar Usuario");
            System.out.println("2. Login");
            System.out.println("3. Cadastrar Produto");
            System.out.println("4. Sair");
            System.out.printf("Digite a sua escolha: ");
            int opcao = scanner.nextInt();
            scanner.nextLine(); // Consumir nova linha
        
            switch (opcao) {
                case 1:
                    // Cadastro de novo usuario
                    System.out.println("Cadastro de Usuario:");
                    System.out.print("Nome: ");
                    String nome = scanner.nextLine();
                    System.out.print("Email: ");
                    String email = scanner.nextLine();
                    System.out.print("Senha: ");
                    String senha = scanner.nextLine();
        
                    Usuario usuario = new Usuario(nome, email, senha);
        
                    servicoAutenticacao.cadastrarUsuario(usuario);
                    System.out.println("  ");
                    System.out.println("Usuario cadastrado com sucesso.");
                    System.out.println("  ");
                    break;
                case 2:
                    // Login de usuario
                    System.out.println("Login de Usuario:");
                    System.out.print("Email: ");
                    String emailLogin = scanner.nextLine();
                    System.out.print("Senha: ");
                    String senhaLogin = scanner.nextLine();
        
                    Usuario usuarioAutenticado = servicoAutenticacao.login(emailLogin, senhaLogin);
                    if (usuarioAutenticado != null) {
                        System.out.println("  ");
                        System.out.println("Login realizado com sucesso.");
                        System.out.println("  ");
                    } else {
                        System.out.println("  ");
                        System.out.println("Email ou senha incorretos.");
                        System.out.println("  ");
                    }
                    break;
                case 3:
                    // Cadastro de novo produto
                    System.out.println("Cadastro de Produto:");
                    System.out.print("Nome: ");
                    String nomeProduto = scanner.nextLine();
                    System.out.print("Codigo: ");
                    int codigo = scanner.nextInt();
                    System.out.print("Preco: ");
                    double preco = scanner.nextDouble();
                    System.out.print("Quantidade: ");
                    int quantidade = scanner.nextInt();
        
                    Produtos produto = new Produtos(nomeProduto, codigo, preco, quantidade);
        
                    servicoProdutos.cadastrarProduto(produto);
                    System.out.println(" ");
                    System.out.println("Produto cadastrado com sucesso.");
                    System.out.println(" ");
                    break;
                case 4:
                    // Sair do sistema
                    sistemaAtivo = false;
                    System.out.println("  ");
                    System.out.println("Saindo do sistema...");
                    System.out.println("  ");
                    break;
                default:
                System.out.println("  ");
                    System.out.println("Opcao invalida. Tente novamente.");
                    System.out.println("  ");
                    break;
            }
        }
    }
}
