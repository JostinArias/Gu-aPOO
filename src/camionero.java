public class camionero extends empleados {
    private double salxviaje;
    private int viajes;
    
    public camionero(String nombre, String numIdent, double salxviaje, int viajes){
        super(nombre, numIdent);
        this.salxviaje = salxviaje;
        this.viajes = viajes;
    }

    public double calcularsalario(){
        return salxviaje * viajes;
    }

}
