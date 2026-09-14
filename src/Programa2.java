import java.util.Scanner;
public class Practica2 {
    public static void main(String [] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingresa la altura: ");
        double altura = sc.nextDouble();
        sc.nextLine();
        System.out.println("Ingresa la base: ");
        double base = sc.nextDouble();
        sc.close();
        
        System.out.println("El area es: " + base * altura);
        System.out.println("El perimetro es: " + (base * 2 + altura * 2));
    }
}