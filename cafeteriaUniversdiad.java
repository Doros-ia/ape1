import java.util.Scanner;

public class cafeteriaUniversdiad {
   //ACUERDATE DE CREAR VALIDACIONES PARA QUE INGRESE LOS DATOS CORRECTOS
    //Una estudiante compra varias ubidades de un producto, el programa solicita sus datos
    //calcula el subtotal, aplica un descuento didactico del 10%, obtiene el total
    //el cambio y comprueba si el dinero entregado cubre el pago
    // para este programa necesito entender que me tengo que pedir datos personles
    //como nombre, apellido, numero de cedula y numero de telefono 
    //despues me pide calcular el subtotal, aplicando un descuento del 10% y obteniendo el total a pagar
    //pero para calcular el subtotal necesito saber la cantidad de productos y el precio de cada producto
    //despues de calcular el total a pagar, necesito saber cuanto dinero me entrega el cliente
    //y crea una condicon o validacion que me diga que si el dinero entregado es mayor o igual al total a pagar, me calcula el cambio y me imprime la factura de compra
    //pero si el dinero entregado es menor al total a pagar, me imprime un mensaje que me diga que el dinero entregado no cubre el total a pagar y me dice cuanto falta para cubrir el total
    // y me regresa a la parte donde pide el dinero entregado para que el cliente pueda entregar mas dinero y cubrir el total a pagar
    //en pocas palabras la validacion que tengo que hacer, si no entregas el dinero suficiente
    //te avisa y te regresa para que puedas entregar todo el dinero que se necesita
    // de ahi se da fin al programa y se imprime la factura de compra con todos los datos del cliente, el producto comprado, la cantidad, el precio unitario, el subtotal, el descuento, el total a pagar, el dinero entregado y el cambio
    //creamos la clase public static void main 
    public static void main (String[] args){
      //y dentro de ella creamos un objeto de la clase Scanner para poder leer los datos ingresados por el usuario    
        Scanner scan = new Scanner(System.in);
      //Declaramos la variables de entrada 
String nombre, apellido,numeroCedula,numeroTelefono;
String nombreProducto;
int cantidadProducto,precioProcuto;
      //Declaramos las variables de proceso y salida
int subTotal,descuento, dinero, cambio, total;
//pedimos que ingrese los datos del cliente y del producto
System.out.println("Ingrese su nombre");
nombre = scan.nextLine();
System.out.println("Ingrese su apellido");
apellido = scan.nextLine();
System.out.println("Ingrese su numero de cedula");
numeroCedula = scan.nextLine();
System.out.println("Ingrese su numero de telefono");
numeroTelefono = scan.nextLine();
System.out.println("Ingrese el nombre del producto");
nombreProducto = scan.nextLine();
System.out.println("Ingrese la cantidad del producto");
cantidadProducto = scan.nextInt();
System.out.println("Ingrese el precio del producto");
precioProcuto = scan.nextInt();
//realizamos el calculo del subtotal, descuento y total a pagar
subTotal = cantidadProducto * precioProcuto;
descuento = subTotal * 10 / 100;
total = subTotal - descuento;
do {
//Despues pedimos el dinero y verificamos si es suficiente para cubrir el total a pagar
System.out.println("Total a pagar: $" + total);
System.out.println("Ingrese el dinero entregado");
dinero = scan.nextInt();
//realizamos la validacion para saber si el dinero entregado es suficiente para cubrir el total a pagar
//Si el dinero entregado es mayor o igual al total a pagar, calculamos el cambio y imprimimos la factura de compra
 if (dinero >= total){
    cambio = dinero - total;
    System.out.println("========================================");
    System.out.println("             FACTURA DE COMPRA UTA");
    System.out.println("========================================");
    System.out.println("Cliente: " + nombre + " " + apellido);
    System.out.println("Cedula: " + numeroCedula);
    System.out.println("Telefono: " + numeroTelefono);
    System.out.println("Producto: " + nombreProducto);
    System.out.println("Cantidad: " + cantidadProducto);
    System.out.println("Precio unitario: $" + precioProcuto);
    System.out.println("Subtotal: $" + subTotal);
    System.out.println("Descuento (10%): $" + descuento);
    System.out.println("Total a pagar: $" + total);
    System.out.println("Dinero entregado: $" + dinero);
    System.out.println("Cambio: $" + cambio);
    System.out.println("========================================");

 }
 //Si el dinero entregado es menor al total a pagar, imprimimos un mensaje que indique que el dinero entregado no cubre el total a pagar y cuanto falta para cubrir el total
 //y damos la opcion de ingresar nuevamente el dinero entregado para cubrir el total a pagar
 else{
    System.out.println("El dinero entregado no cubre el total a pagar.");
    System.out.println("Se requiere al menos: $" + total);
    System.out.println("Dinero recibido: $" + dinero);
    System.out.println("Falta: $" + (total - dinero));
    System.out.println("Por favor, ingrese el monto correcto a pagar");

 }
}while (dinero <= total);
scan.close();
    }
}
