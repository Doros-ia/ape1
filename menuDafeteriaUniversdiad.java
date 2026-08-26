import java.util.Scanner;

public class menuDafeteriaUniversdiad {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        String nombre, apellido, numeroCedula, numeroTelefono;
        String nombreProducto;
        int opcionProducto, cantidadProducto;
        double precioProducto, subtotal, descuento, dinero, cambio, total;

        System.out.println("=== DATOS DEL CLIENTE ===");
        System.out.print("Ingrese su nombre: ");
        nombre = scan.nextLine();
        System.out.print("Ingrese su apellido: ");
        apellido = scan.nextLine();
        System.out.print("Ingrese su numero de cedula: ");
        numeroCedula = scan.nextLine();
        System.out.print("Ingrese su numero de telefono: ");
        numeroTelefono = scan.nextLine();

        System.out.println("\n=== MENU DE LA CAFETERIA ===");
        System.out.println("1. Cafe                 $2.00");
        System.out.println("2. Sandwich             $5.00");
        System.out.println("3. Almuerzo             $8.00");
        System.out.println("4. Jugo                 $3.00");
        System.out.print("Elija un producto (1-4): ");
        opcionProducto = scan.nextInt();

        switch (opcionProducto) {
            case 1:
                nombreProducto = "Cafe";
                precioProducto = 2.00;
                break;
            case 2:
                nombreProducto = "Sandwich";
                precioProducto = 5.00;
                break;
            case 3:
                nombreProducto = "Almuerzo";
                precioProducto = 8.00;
                break;
            case 4:
                nombreProducto = "Jugo";
                precioProducto = 3.00;
                break;
            default:
                System.out.println("Opcion no valida.");
                scan.close();
                return;
        }

        do {
            System.out.print("Ingrese la cantidad que desea comprar: ");
            cantidadProducto = scan.nextInt();
            if (cantidadProducto <= 0) {
                System.out.println("La cantidad debe ser mayor que cero.");
            }
        } while (cantidadProducto <= 0);

        subtotal = cantidadProducto * precioProducto;
        descuento = subtotal >= 10.00 ? subtotal * 0.10 : 0.00;
        total = subtotal - descuento;

        do {
            System.out.printf("\nTotal a pagar: $%.2f%n", total);
            System.out.print("Ingrese el dinero entregado: $");
            dinero = scan.nextDouble();

            if (dinero < total) {
                System.out.printf("El dinero no cubre el pago. Falta: $%.2f%n", total - dinero);
            }
        } while (dinero < total);

        cambio = dinero - total;
        System.out.println("\n========================================");
        System.out.println("             FACTURA DE COMPRA");
        System.out.println("========================================");
        System.out.println("Cliente: " + nombre + " " + apellido);
        System.out.println("Cedula: " + numeroCedula);
        System.out.println("Telefono: " + numeroTelefono);
        System.out.println("Producto: " + nombreProducto);
        System.out.println("Cantidad: " + cantidadProducto);
        System.out.printf("Precio unitario: $%.2f%n", precioProducto);
        System.out.printf("Subtotal: $%.2f%n", subtotal);
        System.out.printf("Descuento: $%.2f%n", descuento);
        System.out.printf("Total a pagar: $%.2f%n", total);
        System.out.printf("Dinero entregado: $%.2f%n", dinero);
        System.out.printf("Cambio: $%.2f%n", cambio);
        System.out.println("========================================");

        scan.close();
    }
}
