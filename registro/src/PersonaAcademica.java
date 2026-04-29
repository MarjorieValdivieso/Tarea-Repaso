public abstract class PersonaAcademica {
    private String codigo;
    private String nombre;
    private int edad;

    public PersonaAcademica(String codigo, String nombre, int edad) {
        setCodigo(codigo);
        setNombre(nombre);
        setEdad(edad);
    }

    public void mostrarDatos() {
        System.out.println("Codigo: " + codigo);
        System.out.println("Nombre: " + nombre);
        System.out.println("Edad: " + edad);
    }

    public void describirRol() {
        System.out.println("Rol: Colaborador academico.");
    }

    public double calcularPago() {
        return 0;
    }
    public double calcularPago(double bonoExtra) {
        return calcularPago() + bonoExtra;
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

    public void setEdad(int edad) {
        if (edad >= 18) {
            this.edad = edad;
        }
    }
    public String getCodigo() {
        return codigo;
    }

    public String getNombre() {
        return nombre;
    }

    public int getEdad() {
        return edad;
    }
}