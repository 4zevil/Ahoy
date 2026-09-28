import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

public class Pedido {
    private int id;
    private Cliente cliente;
    private List<ItemCarrinho> itens;
    private double valorTotal;
    private String enderecoEntrega;
    private String formaPagamento;
    private String status;
    private LocalDateTime dataCriacao;

    public Pedido(int id, Cliente cliente, Carrinho carrinho, String enderecoEntrega, String formaPagamento) {
        this.id = id;
        this.cliente = cliente;
        this.itens = new ArrayList<>(carrinho.getItens());
        this.valorTotal = carrinho.calcularTotal();
        this.enderecoEntrega = enderecoEntrega;
        this.formaPagamento = formaPagamento;
        this.status = "PENDENTE";
        this.dataCriacao = LocalDateTime.now();
    }

    public boolean processarPagamento() {
        for (ItemCarrinho item : itens) {
            if (item.getQuantidade() > item.getProduto().getQuantidadeEstoque()) {
                this.status = "CANCELADO - FORA DE ESTOQUE";
                return false;
            }
        }

        for (ItemCarrinho item : itens) {
            item.getProduto().baixarEstoque(item.getQuantidade());
        }

        this.status = "PAGO";
        return true;
    }

    public int getId() { return id; }
    public Cliente getCliente() { return cliente; }
    public String getStatus() { return status; }
    public List<ItemCarrinho> getItens() { return itens; }
    public double getValorTotal() { return valorTotal; }
    public String getEnderecoEntrega() { return enderecoEntrega; }
    public String getFormaPagamento() { return formaPagamento; }
    public LocalDateTime getDataCriacao() { return dataCriacao; }
}