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

    public int getIdentificador() {
        return identificador;
    }

    public void setIdentificador(int identificador) {
        this.identificador = identificador;
    }

    public String getRutCliente() {
        return rutCliente;
    }

    public void setRutCliente(String rutCliente) {
        this.rutCliente = rutCliente;
    }

    public String getDia() {
        return dia;
    }

    public void setDia(String dia) {
        this.dia = dia;
    }

    public String getHora() {
        return hora;
    }

    public void setHora(String hora) {
        this.hora = hora;
    }

    public String getLugar() {
        return lugar;
    }

    public void setLugar(String lugar) {
        this.lugar = lugar;
    }

    public String getDuracion() {
        return duracion;
    }

    public void setDuracion(String duracion) {
        this.duracion = duracion;
    }

    public int getCantAsistentes() {
        return cantAsistentes;
    }

    public void setCantAsistentes(int cantAsistentes) {
        this.cantAsistentes = cantAsistentes;
    }

    public String mostrarDetalle() {
        return "La capacitación será en " +this.lugar +" a las " +this.hora +" del dia " +this.dia +", y durará " +this.duracion +"." ;

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
