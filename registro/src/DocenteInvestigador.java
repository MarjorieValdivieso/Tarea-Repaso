class DocenteInvestigador extends Docente {
    private int publicaciones;

    public DocenteInvestigador(String codigo, String nombre, int edad, int horasClase, double valorHora, int publicaciones) {
        super(codigo, nombre, edad, horasClase, valorHora);
        setPublicaciones(publicaciones);
    }

    public void setPublicaciones(int publicaciones) {
        if (publicaciones >= 0) {
            this.publicaciones = publicaciones;
        }
    }

    @Override
    public double calcularPago() {
        double bono = publicaciones * 20;
        return super.calcularPago() + bono;
    }

    @Override
    public void describirRol() {
        System.out.println("Rol: Docente investigador con produccion academica.");
    }

    @Override
    public void mostrarDatos() {
        System.out.println("Codigo: " + getCodigo());
        System.out.println("Nombre: " + getNombre());
        System.out.println("Edad: " + getEdad());
        System.out.println("Horas de clase: " + horasClase);
        System.out.println("Valor por hora: " + valorHora);
        System.out.println("Publicaciones: " + publicaciones);
        describirRol();
        System.out.println("Pago final: $" + calcularPago());
    }
}