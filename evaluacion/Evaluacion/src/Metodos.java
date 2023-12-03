public class Metodos {

    private double Sueldo = 0;
    private float subsidiotransporte = 0;
    private float salud = 0;
    private float pension = 0;
    private float Totalpagar = 0;
    private double totaldevengos = 0;
    private double totaldeducciones = 0;
    private static final int SMVL = 6840;
    private static final int STLV =90000;
     
    public void Calcular_sueldo(int Salariobasico, int Diastrabajados){
        int dial, sueldito;
        Sueldo = Salariobasico * Diastrabajados / 30;
        dial = Diastrabajados;
        sueldito = Salariobasico;
        Calcular_subsidio(sueldito,dial);
    }
    
    public void Calcular_pencion(double Sueldo){
        pension = Sueldo * 0.04f;
        Calcular_deducciones(pension);
    }
    public void Calcular_deducciones(float pension){
        totaldeducciones = salud + pension;
    }
    public void Calcular_subsidio(double Salariobasico,int Diastrabajados ){
        {
        if(Sueldo <= SMVL *2){
           subsidiotransporte = 6840 * Diastrabajados / 30;
           }else{
            subsidiotransporte = 0;
        }
        }
        Calcular_devengos(subsidiotransporte);
    }
    public void Calcular_devengos(float subsidiotransporte){
       float deducciones;
       deducciones = (float) totaldeducciones;
       totaldevengos = Sueldo + subsidiotransporte;
       Calcular_total((float)totaldevengos,deducciones);
    }
    public void Calcular_total(float totaldevengos, float totaldeducciones){
        Totalpagar = (float)(totaldevengos - totaldeducciones);
    }
    public void Calcular_Salud(int Salariobasico){
        salud = Salariobasico * 0.04f;
    }

    public double getSueldo() {
        return Sueldo;
    }

    public void setSueldo(double Sueldo) {
        this.Sueldo = Sueldo;
    }

    public float getSubsidiotransporte() {
        return subsidiotransporte;
    }

    public void setSubsidiotransporte(float subsidiotransporte) {
        this.subsidiotransporte = subsidiotransporte;
    }

    public float getSalud() {
        return salud;
    }

    public void setSalud(float salud) {
        this.salud = salud;
    }

    public float getPension() {
        return pension;
    }

    public void setPension(float pension) {
        this.pension = pension;
    }

    public float getTotalpagar() {
        return Totalpagar;
    }

    public void setTotalpagar(float Totalpagar) {
        this.Totalpagar = Totalpagar;
    }

    public double getTotaldevengos() {
        return totaldevengos;
    }

    public void setTotaldevengos(double totaldevengos) {
        this.totaldevengos = totaldevengos;
    }

    public double getTotaldeducciones() {
        return totaldeducciones;
    }

    public void setTotaldeducciones(double totaldeducciones) {
        this.totaldeducciones = totaldeducciones;
    }
    
    
}
