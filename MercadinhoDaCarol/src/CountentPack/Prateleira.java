package CountentPack;

public class Prateleira extends Produto implements exibeProduto{
    private String marca;
    private String dataValidade;

    public Prateleira (int id, String nome, String marca, String dataValidade){
        this.marca = marca;
        this. dataValidade = dataValidade;
        super(id, nome);
    }

    @Override
    public void exibir() {
        System.out.println("ID: " + id + " | Nome: " + nome + " | Marca: " + marca + " | Data de Validade: " + dataValidade);
    }
}
