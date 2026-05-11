package CountentPack;

public class Congelados extends Produto implements exibeProduto{
    private String marca;
    private int temperaturaIdeal;


    public Congelados (int id, String nome, String marca, int temperaturaIdeal) {
        this.marca = marca;
        this.temperaturaIdeal = temperaturaIdeal;
        super(id, nome);
    }

    @Override
    public void exibir() {
        System.out.println("ID: " + id + " | Nome: " + nome + " | Marca: " + marca + " | Temperatura ideal: " + temperaturaIdeal);
    }
}

