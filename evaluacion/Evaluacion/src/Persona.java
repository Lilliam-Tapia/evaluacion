public class Persona {
     
     private String Nombre, Identificacion;
     private int SalarioBasico, DiasTrabajados,sueldo,salud;
     private Float devengos, deducciones;
     
     
     public Persona(String Nombre, String Identificacion,int sueldo,int salud, int SalarioBasico, int DiasTrabajados,float dedu,float deducciones ){
         this.Nombre = Nombre;
         this.Identificacion = Identificacion;
         this.SalarioBasico = SalarioBasico;
         this.DiasTrabajados = DiasTrabajados;
         this.sueldo = (int) sueldo;
         this.salud = salud;
         Principal suel = new Principal();
         suel.getTotalpagar();
     }

    public String getIdentificacion() {
        return Identificacion;
    }

    public void setIdentificacion(String Identificacion) {
        this.Identificacion = Identificacion;
    }
  

    public int getSueldo() {
        return sueldo;
    }

    public void setSueldo(int sueldo) {
        this.sueldo = sueldo;
    }

    public int getSalud() {
        return salud;
    }

    public void setSalud(int salud) {
        this.salud = salud;
    }

    public Float getDevengos() {
        return devengos;
    }

    public void setDevengos(Float devengos) {
        this.devengos = devengos;
    }

    public Float getDeducciones() {
        return deducciones;
    }

    public void setDeducciones(Float deducciones) {
        this.deducciones = deducciones;
    }
     
     
     public String getNombre(){
         return Nombre;
     }
     
     public void setNombre(String Nombre){
         this.Nombre = Nombre;
     }

    public int getSalarioBasico() {
        return SalarioBasico;
    }

    public void setSalarioBasico(int SalarioBasico) {
        this.SalarioBasico = SalarioBasico;
    }

    public int getDiasTrabajados() {
        return DiasTrabajados;
    }

    public void setDiasTrabajados(int DiasTrabajados) {
        this.DiasTrabajados = DiasTrabajados;
        
    }

    public void guardar2(PrintWriter Escribe){
        Escribe.println(Nombre);
        Escribe.println(Identificacion);
         Escribe.println(SalarioBasico);
         Escribe.println(DiasTrabajados);
         Escribe.println(sueldo);
         Escribe.println(salud);
         Escribe.println(devengos);
         Escribe.println(deducciones);
   }
   
   public Persona cargar(BufferedReader Almacen){
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
           return new Persona(Nomb, Identi,SalBase,DiasTrb,suel,deven,dedu,saludl); 
       }catch (Exception e){
       
      }
       return null;
       
   }

   
    }