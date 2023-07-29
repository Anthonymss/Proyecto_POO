package Persona;

public class Cliente {

    public Cliente() {
    }
    private String DNI;
    private String Nombre;
    private String Apellidos;
    private String Direccion;
    private String Distrito;
    private String Correo;
    private String Telefono;

    public Cliente(String DNI, String Nombre, String Apellidos, String Direccion, String Distrito, String Correo, String Telefono) {
        this.DNI = DNI;
        this.Nombre = Nombre;
        this.Apellidos = Apellidos;
        this.Direccion = Direccion;
        this.Distrito = Distrito;
        this.Correo = Correo;
        this.Telefono = Telefono;
    }
    
    
    public String getDNI() {return DNI;}
    public void setDNI(String DNI) {this.DNI = DNI;}
    public String getNombre() {return Nombre;}
    public void setNombre(String Nombre) {this.Nombre = Nombre;}
    public String getApellidos() {return Apellidos;}
    public void setApellidos(String Apellidos) {this.Apellidos = Apellidos;}
    public String getDireccion() {return Direccion;}
    public void setDireccion(String Direccion) {this.Direccion = Direccion;}  
    public String getDistrito() {return Distrito;}
    public void setDistrito(String Distrito) {this.Distrito = Distrito;}
    public String getCorreo() {return Correo;}
    public void setCorreo(String Correo) {this.Correo = Correo;}
    public String getTelefono() {return Telefono;}
    public void setTelefono(String Telefono) {this.Telefono = Telefono;}

    


}