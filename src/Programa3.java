import java.util.Scanner;
public class Practica3 {
    public static void main(String [] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingresa los segundos: ");
        int segundos = sc.nextInt();
        sc.close();
        int horas = segundos / 3600;
        int minutos = (segundos % 3600) / 60;
        int segundosRestantes = segundos % 60;
        System.out.println("Horas: " + horas);
        System.out.println("Minutos: " + minutos);
        System.out.println("Segundos: " + segundosRestantes);
    }
}
