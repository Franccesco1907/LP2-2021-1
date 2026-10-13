import pe.edu.pucp.lp2soft.gestclientes.model.Categoria;
import pe.edu.pucp.lp2soft.gestclientes.model.Cliente;

public class ClienteConstructorTest {
    public static void main(String[] args) {
        Cliente cliente = new Cliente(7, "Ana", "12345678", Categoria.VIP);
        if (cliente.getIdPersona() != 7
                || !"Ana".equals(cliente.getNombreCompleto())
                || !"12345678".equals(cliente.getDNI())
                || cliente.getCategoria() != Categoria.VIP) {
            throw new AssertionError("Cliente must retain the supplied identity and category");
        }
        System.out.println("PASS: Cliente constructor and inherited identity");
    }
}
