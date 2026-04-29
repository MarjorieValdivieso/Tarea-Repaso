class BecadoExcelencia extends EstudianteBecado {
    private double bonoExcelencia;

    public BecadoExcelencia(String codigo, String nombre, double promedio, double valorMatricula, double porcentajeBeca, double bonoExcelencia) {
        super(codigo, nombre, promedio, valorMatricula, porcentajeBeca);
        this.bonoExcelencia = bonoExcelencia;
    }

    @Override
    public double calcularPagoFinal() {
        double pago = super.calcularPagoFinal() - bonoExcelencia;
        return (pago < 0) ? 0 : pago;
    }
}