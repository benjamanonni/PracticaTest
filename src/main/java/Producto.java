public class Producto {
    private String nombre;
    private int stock;

    public Producto(String nombre, int stock) {
        if (nombre == null || nombre.isBlank()) {
            throw new IllegalArgumentException("Nombre inválido");
        }
        if (stock < 0) {
            throw new IllegalArgumentException("Stock inválido");
        }
        this.nombre = nombre;
        this.stock = stock;
    }

    public void venderUno() {
        if (stock == 0) {
            throw new IllegalStateException("Sin stock");
        }
        stock--;
    }

    public String getNombre() {
        return nombre;
    }

    public int getStock() {
        return stock;
    }
}
