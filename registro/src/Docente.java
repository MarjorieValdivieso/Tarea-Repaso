class Docente extends PersonaAcademica {
    protected int horasClase;
    protected double valorHora;

    public Docente(String codigo, String nombre, int edad, int horasClase, double valorHora) {
        super(codigo, nombre, edad);
    }
