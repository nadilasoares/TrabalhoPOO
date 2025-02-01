package entidades;

public class Produtos
{
    private String nomeProduto;
    private int codigo;
    private double preco;
    private int quantidade;

    public Produtos(String nomeProduto, int codigo, double preco, int quantidade)
    {
        this.nomeProduto = nomeProduto;
        this.codigo = codigo;
        this.preco = preco;
        this.quantidade = quantidade;
    }

    public String getnomeProduto()
    {
        return nomeProduto;
    }

    public int getcodigo()
    {
        return codigo;
    }

    public double getpreco()
    {
        return preco;
    }

    public int getquantidade()
    {
        return quantidade;
    }

}