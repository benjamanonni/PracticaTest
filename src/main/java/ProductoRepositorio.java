public interface ProductoRepositorio {
    Producto buscar(String nombre);
    void guardar(Producto producto);
}
