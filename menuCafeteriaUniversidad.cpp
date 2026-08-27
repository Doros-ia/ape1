#include <iostream>
#include <string>
#include <iomanip>

using namespace std;

int main() {

    string nombre, apellido, numeroCedula, numeroTelefono;
    string nombreProducto;

    int opcionProducto, cantidadProducto;
    double precioProducto, subtotal, descuento, dinero, cambio, total;

    cout << "=== DATOS DEL CLIENTE ===" << endl;

    cout << "Ingrese su nombre: ";
    getline(cin, nombre);

    cout << "Ingrese su apellido: ";
    getline(cin, apellido);

    cout << "Ingrese su numero de cedula: ";
    getline(cin, numeroCedula);

    cout << "Ingrese su numero de telefono: ";
    getline(cin, numeroTelefono);

    cout << "\n=== MENU DE LA CAFETERIA ===" << endl;
    cout << "1. Cafe                 $2.00" << endl;
    cout << "2. Sandwich             $5.00" << endl;
    cout << "3. Almuerzo             $8.00" << endl;
    cout << "4. Jugo                 $3.00" << endl;

    cout << "Elija un producto (1-4): ";
    cin >> opcionProducto;

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
            cout << "Opcion no valida." << endl;
            return 0;
    }

    do {
        cout << "Ingrese la cantidad que desea comprar: ";
        cin >> cantidadProducto;

        if (cantidadProducto <= 0) {
            cout << "La cantidad debe ser mayor que cero." << endl;
        }

    } while (cantidadProducto <= 0);

    // Calcular subtotal
    subtotal = cantidadProducto * precioProducto;

    // Aplicar descuento del 10%
    if (subtotal >= 10.00) {
        descuento = subtotal * 0.10;
    } else {
        descuento = 0.00;
    }

    // Calcular total
    total = subtotal - descuento;

    // Solicitar dinero hasta que sea suficiente
    do {

        cout << fixed << setprecision(2);
        cout << "\nTotal a pagar: $" << total << endl;

        cout << "Ingrese el dinero entregado: $";
        cin >> dinero;

        if (dinero < total) {
            cout << "El dinero no cubre el pago. Falta: $"
                 << total - dinero << endl;
        }

    } while (dinero < total);

    // Calcular cambio
    cambio = dinero - total;

    // Mostrar factura
    cout << "\n========================================" << endl;
    cout << "             FACTURA DE COMPRA" << endl;
    cout << "========================================" << endl;

    cout << "Cliente: " << nombre << " " << apellido << endl;
    cout << "Cedula: " << numeroCedula << endl;
    cout << "Telefono: " << numeroTelefono << endl;
    cout << "Producto: " << nombreProducto << endl;
    cout << "Cantidad: " << cantidadProducto << endl;

    cout << fixed << setprecision(2);

    cout << "Precio unitario: $" << precioProducto << endl;
    cout << "Subtotal: $" << subtotal << endl;
    cout << "Descuento: $" << descuento << endl;
    cout << "Total a pagar: $" << total << endl;
    cout << "Dinero entregado: $" << dinero << endl;
    cout << "Cambio: $" << cambio << endl;

    cout << "========================================" << endl;

    return 0;
}