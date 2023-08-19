package lab1;

public class Lab1 
{
    public static void main(String[] args) 
    {
    
        Persona per = new Persona();
        Persona per2 = new Persona("Bryan Renzo","Luna Quispe","7151565");
        
        
        per2.setEdad(15);
        per.setNombre("Daniel Fernando");
        per.setApellido("Leon Luna");
        per.setDni("73175480");
        per.setEdad(19);
        
        
        String dateper = per.Registro(); 
        
        System.out.print(dateper);
        
        String dateper2 = per2.Registro(); 
        
        System.out.print(dateper2);
    }
    
    
}
