import java.util.Scanner;

public class Main2 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Codigo: ");
        String codigo = sc.nextLine();

        System.out.print("Nombre: ");
        String nombre = sc.nextLine();

        System.out.print("Edad: ");
        int edad = sc.nextInt();

        System.out.print("Horas de clase: ");
        int horas = sc.nextInt();

        System.out.print("Valor por hora: ");
        double valor = sc.nextDouble();

        System.out.print("Publicaciones: ");
        int publicaciones = sc.nextInt();

     
        PersonaAcademica obj = new DocenteInvestigador(
                codigo, nombre, edad, horas, valor, publicaciones
        );

        System.out.println("\n=== INFORMACIÓN ===");

        obj.mostrarDatos();
        System.out.println("Pago con bono extra: $" + obj.calcularPago(50));

        sc.close();
    }
}