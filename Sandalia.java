public class Sandalia extends ProductoBase {

    private String tipoCorrea;

    public Sandalia(int id, String marca, double precio, int talla, int cantidadEnStock, String tipoCorrea) {
        super(id, marca, precio, talla, cantidadEnStock);
        this.tipoCorrea = tipoCorrea;

    }

    public String getTipoCorrea() {
        return tipoCorrea;
    }

    @Override
    public String tipoZapato() {
        return "Sandalia con Correa (" + tipoCorrea + ")";
    }
}
