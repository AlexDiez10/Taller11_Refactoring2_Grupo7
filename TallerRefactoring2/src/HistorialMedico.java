import java.util.ArrayList;
import java.util.List;

public class HistorialMedico {
    private List<Consulta> consultas;
    private List<RecetaMedica> recetasMedicas;

    public HistorialMedico() {
        this.consultas = new ArrayList<>();
        this.recetasMedicas = new ArrayList<>();
    }

    public List<Consulta> getConsultas() {
        return consultas;
    }

    public void setConsultas(List<Consulta> consultas) {
        this.consultas = consultas;
    }

    public void addConsulta(Consulta consulta) {
        consultas.add(consulta);
    }

    public void deleteConsulta(Consulta consulta) ElementNotFoundException {
        int index = consultas.indexOf(consulta)
        if (index == -1) {
            throw new ElementNotFoundException("Consulta no encontrada: " + consulta);
        } 
        consultas.remove(index);
    }
    
    public List<RecetaMedica> getRecetasMedicas() {
        return recetasMedicas;
    }

    public void setRecetasMedicas(List<RecetaMedica> recetasMedicas) {
        this.recetasMedicas = recetasMedicas;
    }

    public void addReceta(RecetaMedica receta) {
        recetasMedicas.add(receta);
    }

    public void deleteReceta(RecetaMedica receta) {
        int index = recetasMedicas.indexOf(receta)
        if (index == -1) {
            throw new ElementNotFoundException("Receta no encontrada: " + receta);
        }
        recetasMedicas.remove(index);
    }
}
