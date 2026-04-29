import java.util.Scanner;

public class Main2 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Codigo: ");
        String codigo = sc.nextLine();

        System.out.print("Nombre: ");
        String nombre = sc.nextLine();

        System.out.print("Promedio: ");
        double promedio = sc.nextDouble();

        System.out.print("Matricula: ");
        double valorMatricula = sc.nextDouble();

        System.out.print("Porcentaje beca: ");
        double porcentajeBeca = sc.nextDouble();

        System.out.print("Numero materias: ");
        int numeroMaterias = sc.nextInt();

        System.out.print("Recargo pendiente: ");
        double recargo = sc.nextDouble();

        System.out.print("Tipo (1=Becado Excelencia, 2=Regular con Recargo): ");
        int tipo = sc.nextInt();

        if (tipo == 1) {
            System.out.print("Bono excelencia: ");
            double bono = sc.nextDouble();

            BecadoExcelencia e = new BecadoExcelencia(
                    codigo, nombre, promedio, valorMatricula, porcentajeBeca, bono
            );

            e.mostrarDatos();

        } else if (tipo == 2) {

            RegularConRecargo e = new RegularConRecargo(
                    codigo, nombre, promedio, valorMatricula, numeroMaterias, recargo
            );

            e.mostrarDatos();
        }

        sc.close();
    }
}