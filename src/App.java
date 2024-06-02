public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("Hello World");
        empleados[] Empleados = new empleados[3];

        Empleados[0] = new empleadoatiempocompleto("manuel arias sirias", "32323U", 20000);

        Empleados[1] = new empleadomediotiempo("josé arias sirias", "134820U", 200,222);

        Empleados[2] = new camionero("edward", "2009-124", 20000, 12);

        
        for(int i =0 ; i < Empleados.length; i++){
            System.out.println("empleados "+ Empleados[i].getnombre()+ ", salario mensual: $"+ Empleados[i].calcularsalario());
        }
    }
}
