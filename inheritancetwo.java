interface clinic{
public void registration();
}
class patientreg implements clinic {
public void registration(){
    System.out.println(" gets registered in the system");
}
}
class triage extends patientreg{
  public  void triages() {
        System.out.println(" assessed to determine the urgency of medical needs");
}
}
class medicalconsultation extends triage{
  public  void consultation(){
    System.out.println(" consults a doctor");
    }
}
class diagnostics extends medicalconsultation{
  public  void diagnostic(){
System.out.println("gets diagnised");
}
}
class treatments extends diagnostics{
  public  void treat(){
System.out.println(" gets treated");
}
}
class medication extends treatments{
  public  void medications(){
System.out.println("gets provided with medication");
}
}
class surgery extends medication{
  public  void surgeries(){
System.out.println("undergoes surgery");
}
}
class discharge extends surgery{
  public  void discharges(){
System.out.println("gets discarged");
}
}
class inheritancetwo{
 public static void main (String[]arg){
discharge dis= new discharge();
dis.discharges();
dis.surgeries();
dis.medications();
dis.treat();
dis.diagnostic();
dis.consultation();
dis.triages();
dis.registration();
} 
}