import java.util.ArrayList;

public class SistemaZapatos {

    private ArrayList<ProductoBase> zapatos = new ArrayList<>();

    public void agregarZapato(ProductoBase z) {
        zapatos.add(z);
        System.out.println("Zapato agregado con éxito!\n");
    }

    public void listarZapatos() {
        if (zapatos.isEmpty()) {
            System.out.println("No hay zapatos registrados.\n");
            return;
        }

        System.out.println("\nLISTA DE ZAPATOS");
        for (ProductoBase z : zapatos) {
            System.out.println(z);
        }
        System.out.println();
    }

    public ProductoBase buscarPorId(int id) {
        for (ProductoBase z : zapatos) {
            if (z.getId() == id) 
                return z;
        }
        return null;
    }

    public boolean eliminarZapato(int id) {
        ProductoBase z = buscarPorId(id);
        if (z != null) {
            zapatos.remove(z);
            return true;
        }
        return false;
    }
}
