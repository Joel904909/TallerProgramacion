import javax.swing.*;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Calcular_Kilometros {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        //Ingreso de datos
        String numMotor,numVentanas,puertas,marca,modelo;
        JOptionPane.showMessageDialog(null, "Ingreso de datos del vehiculo");
        numMotor=JOptionPane.showInputDialog("Ingrese el numero del motor del vehiculo: ");
        numVentanas=JOptionPane.showInputDialog("Ingrese el numero de ventanas del vehiculo: ");
        puertas=JOptionPane.showInputDialog("Ingrese el numero de puertas del vehiculo: ");
        marca=JOptionPane.showInputDialog("Ingrese la marca del vehiculo: ");
        modelo=JOptionPane.showInputDialog("Ingrese el modelo del vehiculo: ");
        double KmI = Double.parseDouble(JOptionPane.showInputDialog("Ingrese el kilometraje inicial"));
        double KmF = Double.parseDouble(JOptionPane.showInputDialog("Ingrese el kilometraje final"));
        //Calculo de Kilometros recorridos
       double KmR=KmF-KmI;

        JOptionPane.showMessageDialog(null, "Numero de Motor: " + numMotor +
                "\nNumero de Ventanas: " + numVentanas +
                "\nNumero de Puertas: " + puertas +
                "\nMarca: " + marca +
                "\nModelo: " + modelo +
                "\nKilometros iniciales: " + KmI +
                "\nKilometros finales: " + KmF +
                "\nKilometros recorridos: " + KmR);







    }
}
