public class ZapatoFormal extends ProductoBase {

    private String material;

    public ZapatoFormal(int id, String marca, double precio, int talla, int cantidadEnStock, String material) {
        super(id, marca, precio, talla, cantidadEnStock);
        this.material = material;

    }

    public String getMaterial() {
        return material;
    }

    @Override
    public String tipoZapato() {
        return "Formal (Material: " + material + ")";
    }
}
