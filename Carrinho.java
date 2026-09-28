import java.util.ArrayList;
import java.util.List;

public class Carrinho {
    private List<ItemCarrinho> itens = new ArrayList<>();

    public boolean adicionarOuAtualizarItem(Produto produto, int quantidade) {
        if (quantidade > produto.getQuantidadeEstoque()) {
            System.out.println("Alerta: Quantidade solicitada superior ao estoque disponível.");
            return false;
        }

        for (ItemCarrinho item : itens) {
            if (item.getProduto().getId() == produto.getId()) {
                item.setQuantidade(quantidade);
                return true;
            }
        }
        itens.add(new ItemCarrinho(produto, quantidade));
        return true;
    }

    public void removerItem(int idProduto) {
        itens.removeIf(item -> item.getProduto().getId() == idProduto);
    }

    public double calcularTotal() {
        return itens.stream().mapToDouble(ItemCarrinho::getSubtotal).sum();
    }

    public List<ItemCarrinho> getItens() { return itens; }
    public void limpar() { itens.clear(); }
}