package modelo;

public class Paciente extends Persona {

    private int personaId;
    private int edad;
    private float peso;
    private float talla;
    private String padecimiento;
    private int numEstudios;

    public Paciente() { super(); }

    public Paciente(long idPersona, String nombre, String apellidos,
                    String telefono, int personaId, int edad,
                    float peso, float talla, String padecimiento,
                    int numEstudios) {

        super(idPersona, nombre, apellidos, telefono);
        this.personaId = personaId;
        this.edad = edad;
        this.peso = peso;
        this.talla = talla;
        this.padecimiento = padecimiento;
        this.numEstudios = numEstudios;

    }

    public void setPersonaId(int personaId) {

        this.personaId = personaId;

    }

    public void setEdad(int edad) {

        this.edad = edad;

    }

    public void setPeso(float peso) {

        this.peso = peso;

    }

    public void setTalla(float talla) {

        this.talla = talla;

    }

    public void setPadacemiento(String padecimiento) {

        this.padecimiento = padecimiento;

    }

    public void setNumEstudios(int numEstudios) {

        this.numEstudios = numEstudios;

    }

    public int getPersonaId() {

        return personaId;

    }

    public int getEdad() {

        return edad;

    }

    public float getPeso() {

        return peso;

    }

    public float getTalla() {

        return talla;

    }

    public String getPadecimiento() {

        return padecimiento;

    }

    public int getNumEstudios() {

        return numEstudios;

    }

}