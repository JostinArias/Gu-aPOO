public class empleadomediotiempo extends empleados {
    private double salarioporHora;
    private int horastrabajadas;
    public empleadomediotiempo(String nombre, String numIdent, double salarioporHora, int horastrabajadas){
        super(nombre, numIdent);
        this.salarioporHora = salarioporHora;
        this.horastrabajadas = horastrabajadas;
    }
    
    public double calcularsalario(){
        return salarioporHora = horastrabajadas * 4;
    }
    
}
