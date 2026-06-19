public class ProductoServicio {
    private ProductoRepositorio repositorio;

    public ProductoServicio(ProductoRepositorio repositorio) {
        this.repositorio = repositorio;
    }

    public void vender(String nombre) {
        Producto producto = repositorio.buscar(nombre);
        if (producto == null) {
            throw new IllegalArgumentException("No existe");
        }
        producto.venderUno();
        repositorio.guardar(producto);
    }
}
