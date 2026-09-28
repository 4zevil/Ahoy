public class Main {
    public static void main(String[] args) {
        Vendedor vendedor = new Vendedor(1, "TechStore", "contato@tech.com", "123", "12.345.678/0001-90");
        Produto notebook = new Produto(101, "Notebook Gamer", "16GB RAM, SSD 512GB", 4500.0, 5, "foto.jpg", vendedor);

        Cliente cliente = new Cliente(1, "João Rocha", "joao@email.com", "senha123", "Rua A, 123");
        Carrinho carrinho = new Carrinho();

        boolean adicionou = carrinho.adicionarOuAtualizarItem(notebook, 2);

        if (adicionou) {
            Pedido pedido = new Pedido(1, cliente, carrinho, cliente.getEndereco(), "Cartão de Crédito");
            
            if (pedido.processarPagamento()) {
                System.out.println("Compra realizada! Status: " + pedido.getStatus());
                System.out.println("Estoque restante do produto: " + notebook.getQuantidadeEstoque());
            } else {
                System.out.println("Falha ao processar o pedido: " + pedido.getStatus());
            }
        }

        Denuncia denuncia = new Denuncia(1, cliente, "Propaganda Enganosa", "Descrição incorreta", notebook, vendedor);
        System.out.println("Denúncia criada com ID " + denuncia.getId() + " - Status: " + denuncia.getStatus());
    }
}