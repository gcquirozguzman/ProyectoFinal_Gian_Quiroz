package www.cibertec;

public class Main {
    static void main() {

        String producto = "Polo";
        int cantidad = 3;
        double precio = 50;

        double total = calcularTotal(precio, cantidad);

        if (total >= 100) {
            System.out.println("Compra grande");
        } else {
            System.out.println("Compra pequeña");
        }

        for (int i = 1; i <= cantidad; i++) {
            System.out.println("Producto vendido: " + i);
        }

        int opcion = 1;

        switch (opcion) {
            case 1:
                System.out.println(producto + " - Total: " + total);
                break;
            case 2:
                System.out.println("Precio: " + precio);
                break;
            default:
                System.out.println("Opción no válida");
        }

    }

    static double calcularTotal(double precio, int cantidad) {
        return precio * cantidad;
    }

}
