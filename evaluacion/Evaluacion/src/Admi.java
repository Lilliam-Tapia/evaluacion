import java.io.BufferedReader;

public class Admi extends Persona{

 private int nivelDeconfianza;
 
public Admi(String Nombre,String Identificacion, int SalarioBasico,int DiasTrabajados,float dedu, float deducciones, int salud){
    super(Nombre, Identificacion, DiasTrabajados, SalarioBasico, DiasTrabajados, dedu, deducciones,salud);
}

public Admi(String Nombre, String Identificacion, int sueldo, int salud, int SalarioBasico, int DiasTrabajados,float dedu, float deducciones, int nivelDeconfianza) {
    super(Nombre, Identificacion, sueldo, salud, SalarioBasico, DiasTrabajados, dedu, deducciones);
    this.nivelDeconfianza = nivelDeconfianza;
}

public int getniveldeConfianza(){
    return niveldeConfianza;
}

public void setniveldeConfianza(int niveldeConfianza){
    this.niveldeConfianza = niveldeConfianza;
}


public Admi cargar(BufferedReader Almacen){
    String Nomb, Identi;
    int SalBase, DiasTrb, suel, saludl;
    float deven, dedu;
    
    try{
        Nomb = Almacen.readLine();
        Identi = Almacen.readLine();
        SalBase = Integer.parseInt(Almacen.readLine());
        DiasTrb = Integer.parseInt(Almacen.readLine());
        suel = Integer.parseInt(Almacen.readLine());
        saludl = Integer.parseInt(Almacen.readLine());
        deven = Float.parseFloat(Almacen.readLine());
        dedu  = Float.parseFloat(Almacen.readLine());
        return new Admi(Nomb, Identi,SalBase,DiasTrb,suel,deven,dedu,saludl); 
    }catch (Exception e){
    
   }
    return null;
    
}


}