public class Atendente extends Funcionario{



    public Atendente(String nome, String email, String senha) {
        super(nome, email, senha, false);
    }

    public void ReceberPagamento(double valor){
        setCaixa(getCaixa() + valor);

    }


}
