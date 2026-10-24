public class Cajero {
    public static void main(String[] args) {
        System.out.println("PRUEBAS PRÁCTICA 2:\n");

        System.out.println("Pruebas de Nombre");
        Producto pNombreVacio = new Producto("", 1, 150.0);
        System.out.println("Caso Cadena vacía \"\": " + pNombreVacio.getNombre());

        Producto pNombreEspacio = new Producto(" ", 1, 150.0);
        System.out.println("Caso Espacio \" \": " + pNombreEspacio.getNombre());

        System.out.println("\nPruebas de Precio");
        Producto pPrecioCero = new Producto("Camisa", 1, 0);
        System.out.println("Caso Precio 0: $" + pPrecioCero.getPrecio());

        Producto pPrecioNegativo = new Producto("Pantalón", 1, -50.0);
        System.out.println("Caso Precio negativo (-50): $" + pPrecioNegativo.getPrecio());

        System.out.println("\n=Pruebas de Departamentos=");
        Producto p1 = new Producto("Playera", 1, 250.0);
        System.out.println("Opción 1: " + p1);

        Producto p2 = new Producto("Audífonos", 2, 800.0);
        System.out.println("Opción 2: " + p2);

        Producto p3 = new Producto("Jabón", 3, 35.0);
        System.out.println("Opción 3: " + p3);

        Producto p4 = new Producto("Manzana", 4, 15.0);
        System.out.println("Opción 4: " + p4);

        Producto p5 = new Producto("Objeto muy extrañoñ", 99, 500.0); 
        System.out.println("Opción 5 (Otro): " + p5);

        System.out.println("\nImpresión de Ticket");
        Ticket ticket = new Ticket(p1, p2, 1200.0);
        System.out.println(ticket);
    }
}