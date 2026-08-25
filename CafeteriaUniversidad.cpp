#include <iostream>
#include <string>

using namespace std;

int main() {
    // Declaramos las variables de entrada
    string nombre, apellido, numeroCedula, numeroTelefono, nombreProducto;
    int cantidadProducto;
    
    // Usamos double para manejar correctamente los decimales en precios y descuentos
    double precioProducto, subTotal, descuento, dinero, cambio, total;

    // Pedimos que ingrese los datos del cliente y del producto
    cout << "Ingrese su nombre: ";
    getline(cin, nombre);
    
    cout << "Ingrese su apellido: ";
    getline(cin, apellido);
    
    cout << "Ingrese su numero de cedula: ";
    getline(cin, numeroCedula);
    
    cout << "Ingrese su numero de telefono: ";
    getline(cin, numeroTelefono);
    
    cout << "Ingrese el nombre del producto: ";
    getline(cin, nombreProducto);
    
    cout << "Ingrese la cantidad del producto: ";
    cin >> cantidadProducto;
    
    cout << "Ingrese el precio del producto: ";
    cin >> precioProducto;

    // Realizamos el calculo del subtotal, descuento y total a pagar
    subTotal = cantidadProducto * precioProducto;
    descuento = subTotal * 0.10; // 10% de descuento
    total = subTotal - descuento;

    // Creamos un ciclo do-while para que el cliente ingrese el dinero hasta cubrir el total
    do {
        cout << "\nTotal a pagar: $" << total << endl;
        cout << "Ingrese el dinero entregado: ";
        cin >> dinero;

        // Validación para saber si el dinero es suficiente
        if (dinero >= total) {
            cambio = dinero - total;
            
            cout << "\n========================================" << endl;
            cout << "            FACTURA DE COMPRA           " << endl;
            cout << "========================================" << endl;
            cout << "Cliente: " << nombre << " " << apellido << endl;
            cout << "Cedula: " << numeroCedula << endl;
            cout << "Telefono: " << numeroTelefono << endl;
            cout << "Producto: " << nombreProducto << endl;
            cout << "Cantidad: " << cantidadProducto << endl;
            cout << "Precio unitario: $" << precioProducto << endl;
            cout << "Subtotal: $" << subTotal << endl;
            cout << "Descuento (10%): $" << descuento << endl;
            cout << "Total a pagar: $" << total << endl;
            cout << "Dinero entregado: $" << dinero << endl;
            cout << "Cambio: $" << cambio << endl;
            cout << "========================================" << endl;
        } 
        else {
            cout << "\nEl dinero entregado no cubre el total a pagar." << endl;
            cout << "Se requiere al menos: $" << total << endl;
            cout << "Dinero recibido: $" << dinero << endl;
            cout << "Falta: $" << (total - dinero) << endl;
            cout << "Por favor, ingrese el monto correcto a pagar.\n" << endl;
        }
        
    } while (dinero < total); // Se repite solo si el dinero es estrictamente menor al total

    return 0;
}