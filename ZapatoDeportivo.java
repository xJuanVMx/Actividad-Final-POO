public class ZapatoDeportivo extends ProductoBase {

    private String tipoDeporte;

    public ZapatoDeportivo(int id, String marca, double precio, int talla, int cantidadEnStock, String tipoDeporte) {
        super(id, marca, precio, talla, cantidadEnStock);
        this.tipoDeporte = tipoDeporte;

    }

    public String getTipoDeporte() {
        return tipoDeporte;
    }

    @Override
    public String tipoZapato() {
        return "Deportivo (" + tipoDeporte + ")";
    }
}
