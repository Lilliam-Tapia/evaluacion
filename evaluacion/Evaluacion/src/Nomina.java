import java.util.Scanner;


public class App {
    public static void main(String[] args) {
        Scanner lector = new Scanner(System.in);
    
        System.out.print("Ingrese la cantidad de empleados: ");
        int cantidadEmpleados = lector.nextInt();
        
        Persona[] empleados = new Persona[cantidadEmpleados];
        Metodos metodos = new Metodos();

        for (int i = 0; i < cantidadEmpleados; i++) {
            System.out.print("Ingrese el nombre del empleado "+ (i + 1) +":");
            String nombre = lector.next();

            System.out.print("Ingrese la identificación del empleado: ");
            String identificacion = lector.next();
          
            System.out.print("Ingrese las horas trabajadas del empleado: ");
            int  diastrabajados = lector.nextInt();
                
            System.out.print("Ingrese el salario del empleado: ");
            int salarioBasico = lector.nextInt();
    
            empleados[i] = new Persona(nombre, identificacion, diastrabajados, salarioBasico);
        }
         
        System.out.println("eso:"+metodos.getTotaldeducciones(empleados));

      
    }
}