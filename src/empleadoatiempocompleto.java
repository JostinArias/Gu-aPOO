public class empleadoatiempocompleto extends empleados{
    private double salarioanual;
    public empleadoatiempocompleto(String nombre, String numeroIdent, double salarioanual){
        super(nombre, numeroIdent);
        this.salarioanual = salarioanual ;
    }
    public double calcularsalario(){
        return salarioanual / 12 ;
    }

}
