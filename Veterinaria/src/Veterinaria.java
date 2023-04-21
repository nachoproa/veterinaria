public class Veterinaria {
    private String nombreperro;
    private int edad;
    private String vacunas;
    private String raza;
    private String problema;
    private String tipo;

    public Veterinaria(String nombreperro, int edad, String vacunas, String raza, String problema, String tipo) {
        this.nombreperro = nombreperro;
        this.edad = edad;
        this.vacunas = vacunas;
        this.raza = raza;
        this.problema = problema;
        this.tipo = tipo;
    }

    @Override
    public String

    toString() {
        return "Veterinaria{" +
                "nombreperro='" + nombreperro + '\'' +
                ", edad=" + edad +
                ", vacunas='" + vacunas + '\'' +
                ", raza='" + raza + '\'' +
                ", problema='" + problema + '\'' +
                ", tipo='" + tipo + '\'' +
                '}';
    }

}

