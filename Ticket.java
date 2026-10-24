//ticket.java
public class Ticket {
    private Producto producto1;
    private Producto producto2;
    private double total;
    private double dineroRecibido;
    private double cambio;

    public Ticket(Producto producto1, Producto producto2, double dineroRecibido) {
        this.producto1 = producto1;
        this.producto2 = producto2;
        this.dineroRecibido = dineroRecibido;
        calcularTotalYCambio();
    }
    public void setProducto1(Producto producto1) {
        this.producto1 = producto1;
        calcularTotalYCambio();
    }

    public Producto getProducto1() {
        return producto1;
    }

    public void setProducto2(Producto producto2) {
        this.producto2 = producto2;
        calcularTotalYCambio();
    }

    public Producto getProducto2() {
        return producto2;
    }

    public void setDineroRecibido(double dineroRecibido) {
        this.dineroRecibido = dineroRecibido;
        calcularTotalYCambio();
    }

    public double getDineroRecibido() {
        return dineroRecibido;
    }

    public double getTotal() {
        return total;
    }

    public double getCambio() {
        return cambio;
    }
    private void calcularTotalYCambio() {
        if (producto1 != null && producto2 != null) {
            this.total = producto1.getPrecio() + producto2.getPrecio();
            this.cambio = dineroRecibido - this.total;
        }
    }
    @Override
    public String toString() {
        return "TICKET DE COMPRA:\n" +
               "1. " + producto1 + "\n" +
               "2. " + producto2 + "\n" +
               "Total: $" + total + "\n" +
               "Pagado: $" + dineroRecibido + "\n" +
               "Cambio: $" + cambio;
    }
}