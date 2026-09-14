import java.util.Scanner;
public class Practica4 {
    public static void main(String [] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingresa el precio del producto: ");
        double precio = sc.nextDouble();
        sc.nextLine();
        System.out.println("Ingresa el porcentaje de descuento: ");
        double descuento = sc.nextDouble();
        sc.nextLine();
        sc.close();
        double precioFinal = precio - (precio * (descuento / 100));
        double IVA = precioFinal * 0.16;
        precioFinal = precioFinal + IVA;
        System.out.println("El precio final es: " + precioFinal);
    }
}