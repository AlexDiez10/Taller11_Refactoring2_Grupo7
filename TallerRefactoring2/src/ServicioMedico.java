public class ServicioMedico {
    private String nombre;
    private String descripcion;
    private double costo;
    private int duracion;

    public ServicioMedico(String nombre, String descripcion, double costo, int duracion) {
        this.nombre = nombre;
        this.descripcion = descripcion;
        // Ojo que las dos asignaciones de abajo deben de tener logica de validacion en el setter, esos valores no pueden ser negativos
        this.costo = costo;
        this.duracion = duracion;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public double getCosto() {
        return costo;
    }

    public void setCosto(double costo) throws CostAndDurationNotZeroException {
        if(costo<0){
            throw new CostAndDurationNotZeroException("El costo no puede ser menor a 0");
        }
        this.costo = costo;
    }

    public int getDuracion() {
        return duracion;
    }

    public void setDuracion(int duracion) throws CostAndDurationNotZeroException {
        if(duracion<0){
            throw new CostAndDurationNotZeroException("La duración no puede ser menor a 0");
        }
        this.duracion = duracion;
    }
}
