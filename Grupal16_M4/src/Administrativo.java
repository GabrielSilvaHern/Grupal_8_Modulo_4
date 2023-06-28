public class Administrativo extends Usuario{

    private String area;
    private int expPrevia;

    public Administrativo() {
    }

    public Administrativo(String nombre, String fechaNacimiento, String run, String area, int expPrevia) {
        super(nombre, fechaNacimiento, run);
        this.area = area;
        this.expPrevia = expPrevia;
    }

    public String getArea() {
        return area;
    }

    public void setArea(String area) {
        this.area = area;
    }

    public int getExpPrevia() {
        return expPrevia;
    }

    public void setExpPrevia(int expPrevia) {
        this.expPrevia = expPrevia;
    }

    public String analizarUsuario() {
        return this.toString();
    }

    @Override
    public String toString() {
        return "Administrativo " +
                "\nNombre: "+super.analizarUsuario()+", "+
                "area: '" + area + '\'' +
                ", expPrevia: " + expPrevia;
    }
}
