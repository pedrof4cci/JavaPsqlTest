package CountentPack;


public class Produto implements exibeProduto{
    private int id;
    private String nome;

    public Produto (int id, String nome){
        this.id = id;
        this.nome = nome;
    }

    @Override
    public void exibir() {
        System.out.println("ID: " + id + " | Nome: " + nome);
    }
}


