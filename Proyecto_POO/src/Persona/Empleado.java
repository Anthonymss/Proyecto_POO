package Persona;
public class Empleado extends Usuario  {

    public Empleado() {
    }

    public Empleado(Integer id, String nombre, String apep, String direc, String correo, Integer telefono, String Usuario, String Contraseña, String tipoempleado) {
        super(id, nombre, apep, direc, correo, telefono, Usuario, Contraseña, tipoempleado);
    }

}