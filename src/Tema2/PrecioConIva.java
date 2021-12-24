package Tema2;

import java.util.Scanner;

public class PrecioConIva {

    public static void main(String[] args) {

        double iva;
        double precio;
        double precioIva;

        Scanner producto = new Scanner(System.in);
        System.out.println("Introduce cual es el precio del producto");
        precio = producto.nextDouble();

        Scanner impuesto = new Scanner(System.in);
        System.out.println("Introduce el iva que quieres aplicar al producto");
        iva = impuesto.nextDouble();

        precioIva = precio + (precio*iva);
        System.out.println("El precio final con el iva aplicado es "+ precioIva);
    }
}
