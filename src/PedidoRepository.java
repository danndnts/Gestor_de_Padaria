import java.util.ArrayList;
import java.util.List;

public class PedidoRepository implements CrudRepository<Pedido> {
    private List<Pedido> pedidos = new ArrayList<>();

    @Override
    public void criar(Pedido pedido) {
        pedidos.add(pedido);
    }

    @Override
    public List<Pedido> listar() {
        return pedidos;
    }

    @Override
    public void atualizar(Pedido pedido) {
        for (int i = 0; i < pedidos.size(); i++) {
            if (pedidos.get(i).getCliente().getNome().equals(pedido.getCliente().getNome())) {
                pedidos.set(i, pedido);
                break;
            }
        }
    }

    @Override
    public void deletar(Pedido pedido) {
        pedidos.remove(pedido);
    }
}
