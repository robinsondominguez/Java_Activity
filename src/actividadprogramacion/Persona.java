package actividadprogramacion;


public class Persona {
    
    String nombre;
    String numero_documento;
    int edad;
    String motivo;
    String telefono;
    String estado;

    public Persona(String nombre, String numero_documento, int edad, String motivo, String telefono) {
        this.nombre = nombre;
        this.numero_documento = numero_documento;
        this.edad = edad;
        this.motivo = motivo;
        this.telefono = telefono;
    }   

    public String getNombre() {
        return nombre;
    }
    
    public String getNumero_document() {
        return numero_documento;
    }

    public int getEdad() {
        return edad;
    }

    public String getMotivo() {
        return motivo;
    }

    public String getTelefono() {
        return telefono;
    }

    public String getEstado() {
        estado = "disponible";
        return estado;
    }
    public void setEstado(String estado){
        this.estado = estado;
    }
}