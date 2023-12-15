package modelo;

public class Persona {

    private long idPersona;
    private String nombre;
    private String apellidos;
    private String telefono;

    public Persona() {}
    public Persona(long idPersona, String nombre, String apellidos, String telefono) {

        this.idPersona = idPersona;
        this.nombre = nombre;
        this.apellidos = apellidos;
        this.telefono = telefono;

    }

    public void setIdPersona(long idPersona) {

        this.idPersona = idPersona;

    }

    public void setNombre(String nombre) {

        this.nombre = nombre;

    }

    public void setApellidos(String apellidos) {

        this.apellidos = apellidos;

    }

    public void setTelefono(String telefono) {

        this.telefono = telefono;
    }

    public long getIdPersona() {

        return idPersona;

    }

    public String getNombre() {

        return nombre;

    }

    public String getApellidos() {

        return apellidos;

    }

    public String getTelefono() {

        return telefono;


    }

}