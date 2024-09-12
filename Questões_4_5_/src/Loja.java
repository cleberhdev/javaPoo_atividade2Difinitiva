// 5° QUESTÃO:
import java.util.ArrayList;
import java.util.List;
public class Loja {
    String nome;
    String endereco;
    List<Produto> produtos;
    public Loja(String nome, String endereco){
        this.nome = nome;
        this.endereco = endereco;
        this.produtos = new ArrayList<>();
    }
    public void adicionar_produto(Produto produto){
        this.produtos.add(produto);
    }
    public void listar_produto(){
        System.out.println("Produto\tPreco:");
        for (int i = 0; i <= this.produtos.size()-1; i++){
            Produto produto = this.produtos.get(i);
            System.out.println(produto.nome+" "+ produto.preco);
        }
        System.out.println("");
    }
    public void vender_produto(String nome){
        for (int i = 0; i <=this.produtos.size()-1; i++){
            Produto produto = this.produtos.get(i);
            if (produto.nome.equals(nome)){
                produtos.remove(i);
            }
        }
    }
}
