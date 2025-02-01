import entidades.Produtos;
import java.util.ArrayList;


public class ServicoProdutos
{
    private ArrayList<Produtos> produtosCadastrados;

    public ServicoProdutos()
    {
        produtosCadastrados = new ArrayList<>();
    }

    public void cadastrarProduto(Produtos produto)
    {
        produtosCadastrados.add(produto);
    }

    public Produtos buscarProduto(int codigo)
    {
        for(Produtos produto : produtosCadastrados)
        {
            if(produto.getcodigo() == codigo)
            {
                return produto;
            }
        }
        return null; // Produto não encontrado
    }
}