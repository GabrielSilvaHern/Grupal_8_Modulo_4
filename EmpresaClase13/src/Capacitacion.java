public class Capacitacion {

    private int identificador;
    private String rutCliente;
    private String dia;
    private String hora;
    private String lugar;
    private String duracion;
    private int cantAsistentes;

    public Capacitacion() {
    }

    public Capacitacion(int identificador, String rutCliente, String dia, String hora, String lugar, String duracion, int cantAsistentes) {
        this.identificador = identificador;
        this.rutCliente = rutCliente;
        this.dia = dia;
        this.hora = hora;
        this.lugar = lugar;
        this.duracion = duracion;
        this.cantAsistentes = cantAsistentes;
    }

    @Override
    public String toString() {
        return "Capacitacion: \n" +
                "identificador: " + identificador +
                ", rutCliente: '" + rutCliente + '\'' +
                ", dia: '" + dia + '\'' +
                ", hora: '" + hora + '\'' +
                ", lugar: '" + lugar + '\'' +
                ", duracion: '" + duracion + '\'' +
                ", cantAsistentes: " + cantAsistentes;
    }
}
