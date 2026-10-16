import java.util.Scanner;

public abstract class Funcionario {

    Scanner scanner = new Scanner(System.in);

    private String nome;
    private String email;
    private String senha;
    private boolean admin;
    private boolean login;
    private static double caixa;
    private static int venda;

    public Funcionario(String nome, String email, String senha, boolean admin) {
        this.nome = nome;
        this.email = email;
        this.senha = senha;
        this.admin = admin;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }

    public boolean isAdmin() {
        return admin;
    }

    public void setAdmin(boolean admin) {
        this.admin = admin;
    }

    public boolean isLogin() {
        return login;
    }

    public static double getCaixa() {
        return caixa;
    }

    public void setCaixa(double caixa) {
        Funcionario.caixa = caixa;
    }

    public static int getVenda() {
        return venda;
    }

    public static void setVenda(int venda) {
        Funcionario.venda = venda;
    }

    public void Login(){
        String email;
        String senha;

        if (!this.login){
            System.out.println("===== LOGIN =====");
            System.out.print("EMAIL: ");
            email = scanner.nextLine();
            System.out.print("SENHA: ");
            senha = scanner.nextLine();
            if (email.equals(this.email) && senha.equals(this.senha)){
                this.login = true;
                System.out.println("LOGIN EFETUADO COM SUCESSO");
            }else {
                System.out.println("DADOS INCORRETOS");
            }

        }else{
            System.out.println("JÁ ESTÁ LOGADO!");
        }
    }

    public void Logoff (){
        int n;
        if(this.login) {
            System.out.println("DESEJA DESLOGAR");
            System.out.println("1 - SIM");
            System.out.println("2 - NÃO");
            System.out.print("ESCOLHA: ");
            n = scanner.nextInt();
            switch (n){
                case 1 : this.login = false; break;
                case 2 : break;
                default:
                    System.out.println("ESCOLHA ERRADA!");
            }


        }else{
            System.out.println("NINGUÉM ESTÁ LOGADO");
        }

    }


}
