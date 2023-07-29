package Persona;

public  class Usuario {
    public Usuario() {
    }
    private Integer id;
    private String nombre;
    private String apep;
    private String direc;
    private String correo;
    private Integer telefono;
    private String Usuario;
    private String Contraseña;
    private String tipoempleado;

    public Usuario(Integer id, String nombre, String apep, String direc, String correo, Integer telefono, String Usuario, String Contraseña, String tipoempleado) {
        this.id = id;
        this.nombre = nombre;
        this.apep = apep;
        this.direc = direc;
        this.correo = correo;
        this.telefono = telefono;
        this.Usuario = Usuario;
        this.Contraseña = Contraseña;
        this.tipoempleado = tipoempleado;
    }

    public Integer getId() {return id;}
    public void setId(Integer id) {this.id = id;}
    public String getNombre() {return nombre;}
    public void setNombre(String nombre) {this.nombre = nombre;}
    public String getApep() {return apep;}
    public void setApep(String apep) {this.apep = apep;}
    public String getDirec() {return direc;}
    public void setDirec(String direc) {this.direc = direc;}
    public String getCorreo() {return correo;}
    public void setCorreo(String correo) {this.correo = correo;}
    public Integer getTelefono() {return telefono;}
    public void setTelefono(Integer telefono) {this.telefono = telefono;} 
    public String getUsuario() {return Usuario;}
    public void setUsuario(String Usuario) {this.Usuario = Usuario;}
    public String getContraseña() {return Contraseña;}
    public void setContraseña(String Contraseña) {this.Contraseña = Contraseña;}
    public String getTipoempleado() {return tipoempleado;}
    public void setTipoempleado(String tipoempleado) {this.tipoempleado = tipoempleado;}

}