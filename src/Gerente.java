public class Gerente extends Funcionario {


    public Gerente(String nome, String email, String senha) {
        super(nome, email, senha, true);
    }

    public void RelatorioFinanceiro(){
        System.out.println("==== TOTAL DO CAIXA ====");
        System.out.println("TOTAL: " + Atendente.getCaixa());
        System.out.println("========================");

    }

    public void RelatorioVenda(){
        System.out.println("==== TOTAL DE VENDA ====");
        System.out.println("TOTAL: " + Vendedor.getVenda());
        System.out.println("========================");

    }

}
