import javax.swing.JOptionPane;
import java.time.LocalDate;
import java.time.Period;
import java.time.format.DateTimeFormatter;

class Empleado {
    // Atributos del empleado
    private String cedula;
    private String nombre;
    private String apellido;
    private String genero;
    private double salario;
    private LocalDate fechaNacimiento;
    private LocalDate fechaIngreso;

    // Constructor con apellido y género agregados
    public Empleado(String cedula, String nombre, String apellido, String genero, double salario, LocalDate fechaNacimiento, LocalDate fechaIngreso) {
        this.cedula = cedula;
        this.nombre = nombre;
        this.apellido = apellido;
        this.genero = genero;
        this.salario = salario;
        this.fechaNacimiento = fechaNacimiento;
        this.fechaIngreso = fechaIngreso;
    }

    // Modificar salario
    public void modificarSalario(double nuevoSalario) {
        this.salario = nuevoSalario;
    }

    // Calcular edad
    public int calcularEdad() {
        return Period.between(fechaNacimiento, LocalDate.now()).getYears();
    }

    // Calcular prestaciones
    public double calcularPrestaciones() {
        int antiguedad = Period.between(fechaIngreso, LocalDate.now()).getYears();
        return (antiguedad * salario) / 12;
    }

    // Mostrar datos con apellido y género agregados
    public String mostrarDatos() {
        return "Cedula: " + cedula + "\nNombre: " + nombre + " " + apellido + "\nGenero: " + genero + "\nSalario: $" + salario;
    }
}

public class Main {
    public static void main(String[] args) {
        // Formato de fecha
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");

        // Ingresar datos del empleado, incluyendo apellido y género
        String cedula = JOptionPane.showInputDialog("Ingrese la cédula:");
        String nombre = JOptionPane.showInputDialog("Ingrese el nombre:");
        String apellido = JOptionPane.showInputDialog("Ingrese el apellido:");
        String genero = JOptionPane.showInputDialog("Ingrese el género (Masculino/Femenino):");
        double salario = Double.parseDouble(JOptionPane.showInputDialog("Ingrese el salario:"));
        LocalDate fechaNacimiento = LocalDate.parse(JOptionPane.showInputDialog("Fecha de nacimiento (dd/MM/yyyy):"), formatter);
        LocalDate fechaIngreso = LocalDate.parse(JOptionPane.showInputDialog("Fecha de ingreso (dd/MM/yyyy):"), formatter);

        // Crear objeto Empleado
        Empleado empleado = new Empleado(cedula, nombre, apellido, genero, salario, fechaNacimiento, fechaIngreso);

        // Mostrar datos del empleado con apellido y género incluidos
        JOptionPane.showMessageDialog(null, "Datos del empleado:\n" + empleado.mostrarDatos());

        // Modificar salario
        if (JOptionPane.showConfirmDialog(null, "¿Desea modificar el salario?") == JOptionPane.YES_OPTION) {
            double nuevoSalario = Double.parseDouble(JOptionPane.showInputDialog("Ingrese el nuevo salario:"));
            empleado.modificarSalario(nuevoSalario);
        }

        // Mostrar edad y prestaciones
        JOptionPane.showMessageDialog(null, "Edad: " + empleado.calcularEdad() + " años");
        JOptionPane.showMessageDialog(null, "Prestaciones: $" + empleado.calcularPrestaciones());
    }
}
