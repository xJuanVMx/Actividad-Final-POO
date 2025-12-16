public abstract class ProductoBase {

    private int id;
    private String nombre;
    private double precio;
    private int talla;
    private int cantidadEnStock;

    public ProductoBase(int id, String nombre, double precio, int talla, int cantidadEnStock) {
        this.id = id;
        this.nombre = nombre;
        this.precio = precio;
        this.talla = talla;
        this.cantidadEnStock = cantidadEnStock;
    }

    public int getId() {
        return id;
    }

    public String getNombre() {
        return nombre;
    }

    public double getPrecio() {
        return precio;
    }

    public int getTalla() {
        return talla;
    }

    public int getcantidadEnStock() {
        return cantidadEnStock;
    }

    public void setMarca(String nombre) {
        this.nombre = nombre;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public void setTalla(int talla) {
        this.talla = talla;
    }

    public void setCantidad(int cantidadEnStock) {
        this.cantidadEnStock = cantidadEnStock;
    }

    public abstract String tipoZapato();

    @Override
    public String toString() {
        return "ID: " + id + " | Marca: " + nombre + " | Precio: " + precio + " | Talla: " + talla + " | Tipo: "
                + tipoZapato() + " | Cantidad en Stock: " + cantidadEnStock;
    }
}
