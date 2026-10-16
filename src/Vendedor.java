public class Vendedor extends Funcionario{

    public Vendedor(String nome, String email, String senha) {
        super(nome, email, senha, false);
    }

    public void RealizarVenda(int valor){
        setVenda(getVenda() + valor);

    }

}
