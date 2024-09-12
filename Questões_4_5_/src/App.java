// para isso requer importar essas bibliotecas
import java.util.ArrayList; 
import java.util.List;
public class App {
    //Resumindo, estamos fazendo uma lista que receber os objeitos(ou produtos);
    public static void main(String[] args) throws Exception {
        // 4° QUESTÃO:
            List<Produto> produtos = new ArrayList<Produto>();
            Produto produto1 = new Produto("Caixa JBL", 80);
            // produtos.add(new Produto("Caixa JBL", 80));
            produtos.add(new Produto("Iphone", 1500));
            produtos.add(produto1);
            System.out.println("Produto\tPreço:");
            for (int i = 0; i<=produtos.size()-1; i++){
                Produto produto = produtos.get(i);
                System.out.println(produto.nome + " "+ produto.preco);
            }
        // Classe Associada -> Produto.java 
        // Fim 4° Questão!

        //5° QUESTÃO:
            Loja minha_lojinha = new Loja("Perigo", "Rua Produtos Furtados Silva");
            Produto produto2 = new Produto("Caixa JBL", 80);

            minha_lojinha.adicionar_produto(produto2);
            minha_lojinha.adicionar_produto(new Produto("Iphone", 1500));
            minha_lojinha.adicionar_produto(new Produto("Ps5", 2500));

            minha_lojinha.listar_produto();
            minha_lojinha.vender_produto("Iphone");

            minha_lojinha.listar_produto();
        // Classes Associadas -> Produto.java, Loja.java; 
        // Fim 5° Questão!
    }
}
