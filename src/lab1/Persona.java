package lab1;
public class Persona 
{

    public void setNombre(String Nombre) 
    {
        this.Nombre = Nombre;
    }
    
    public void setApellido(String Apellido) 
    {
        this.Apellido = Apellido;
    }
    
    public void setDni(String Dni) 
    {
        this.Dni = Dni;
    }

    public void setEdad(int Edad) 
    {
        this.Edad = Edad;
    }
    
    
    public String getNombre() 
    {
        if(this.Nombre==null)
        {return "Sin Nombre";}
        return Nombre;
    }

    public String getApellido() 
    {
        if(this.Apellido==null)
        {return "Sin Apellido";}
        return Apellido;
    }

  
     public int getEdad() 
    {
        return Edad;
    }
    public String getDni() 
    {
        if(this.Dni==null)
        {return "Sin Dni";}
        return Dni;
    }

 
    private String Nombre;
    private String Apellido;
    private String Dni;
    private int Edad;
    
    public Persona()
    {
    
    }
    
    public Persona(String Nombre, String Apellido, String Dni) 
    {
        this.Nombre = Nombre;
        this.Apellido = Apellido;
        this.Dni = Dni;
    }
    
    public String Registro()
    {
        return 
                "Nombre  : "+Persona.this.getNombre()+"\n"
                +"Apellido: "+Persona.this.getApellido()+"\n"
                +"  Dni   : "+Persona.this.getDni()+"\n"
                +" Edad   : "+Persona.this.getEdad()+"\n" ;
    }
    
    
    
}
