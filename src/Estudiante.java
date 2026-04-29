class Estudiante {
    private String codigo;
    private String nombre;
    private double promedio;
    private double valorMatricula;

    public Estudiante(String codigo, String nombre, double promedio, double valorMatricula) {
        setCodigo(codigo);
        setNombre(nombre);
        setPromedio(promedio);
        setValorMatricula(valorMatricula);
    }

    public void mostrarDatos() {
        System.out.println("Codigo: " + codigo);
        System.out.println("Nombre: " + nombre);
        System.out.println("Promedio: " + promedio);
        System.out.println("Matricula: " + valorMatricula);
        System.out.println("Pago Final: " + calcularPagoFinal());
    }

    public boolean validarPromedio() {
        return promedio >= 0 && promedio <= 10;
    }

    public double calcularPagoFinal() {
        return valorMatricula;
    }

    public double calcularPagoFinal(double descuentoExtra) {
        return valorMatricula - descuentoExtra;
    }

    public void setCodigo(String codigo) {
        if (codigo != null && !codigo.isEmpty()) {
            this.codigo = codigo;
        }
    }

    public void setNombre(String nombre) {
        if (nombre != null && !nombre.isEmpty()) {
            this.nombre = nombre;
        }
    }

    public void setPromedio(double promedio) {
        if (promedio >= 0 && promedio <= 10) {
            this.promedio = promedio;
        }
    }

    public void setValorMatricula(double valorMatricula) {
        if (valorMatricula > 0) {
            this.valorMatricula = valorMatricula;
        }
    }

    public double getValorMatricula() {
        return valorMatricula;
    }
}