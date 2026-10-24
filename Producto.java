public class Producto {
    private String nombre;
    private String departamento;
    private double precio;
    public Producto(String nombre, int departamentoOp, double precio) {
        setNombre(nombre);
        setDepartamento(departamentoOp);
        setPrecio(precio);
    }
    public Producto(String nombre, String departamento, double precio) {
        setNombre(nombre);
        this.departamento = departamento;
        setPrecio(precio);}
    
        public void setNombre(String nombre) {
        if (nombre == null || nombre.trim().isEmpty()) {
            this.nombre = "Producto desconocido";  } 
        else {
            this.nombre = nombre; }}
    public String getNombre() {
        return nombre;
    }
    public void setPrecio(double precio) {
        if (precio <= 0) {
            this.precio = 100.0;
        } else {
            this.precio = precio;
        }
    }

    public double getPrecio() {
        return precio;
    }
    public String determinarDepartamento(int opc) {
        switch (opc) {
            case 1:
                return "Ropa";
            case 2:
                return "Electrónica y tecnología";
            case 3:
                return "Higiene y cuidado personal";
            case 4:
                return "Alimentos";
            case 5:
            default:
                return "Departamento desconocido";
        }  }
    public void setDepartamento(int opc) {
        this.departamento = determinarDepartamento(opc);}
    public String getDepartamento() {
        return departamento;
    }
    @Override
    public String toString() {
        return "Producto: " + nombre + " | Depto: " + departamento + " | Precio: $" + precio;
    }
}