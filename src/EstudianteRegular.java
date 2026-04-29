class EstudianteRegular extends Estudiante {
    protected int numeroMaterias;

    public EstudianteRegular(String codigo, String nombre, double promedio, double valorMatricula, int numeroMaterias) {
        super(codigo, nombre, promedio, valorMatricula);
        setNumeroMaterias(numeroMaterias);
    }

    public void setNumeroMaterias(int numeroMaterias) {
        if (numeroMaterias > 0) {
            this.numeroMaterias = numeroMaterias;
        }
    }

    @Override
    public double calcularPagoFinal() {
        return getValorMatricula() + (numeroMaterias * 10);
    }
}