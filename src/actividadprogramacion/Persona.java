package actividadprogramacion;


public class Persona {
    
    String nombre;
    String numero_documento;
    int edad;
    String motivo;
    String telefono;
    String estado;

    public Persona(String nombre, String numero_documento, int edad, String motivo, String telefono, String estado) {
        this.nombre = nombre;
        this.numero_documento = numero_documento;
        this.edad = edad;
        this.motivo = motivo;
        this.telefono = telefono;
        this.estado = estado;
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
        return estado;
    }
}