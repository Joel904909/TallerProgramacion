import javax.swing.*;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Calculadora {
    public static void main(String[] args) throws IOException{
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        //Ingreso de numeros
        String operacion;
        double resultado = 0;
        JOptionPane.showMessageDialog(null, "Inicio Calculadora");
        double num1 = Double.parseDouble(JOptionPane.showInputDialog("Ingrese el primer numero: "));
        double num2 = Double.parseDouble(JOptionPane.showInputDialog("Ingrese el segundo numero: "));
        operacion = JOptionPane.showInputDialog("Ingrese la operacion que quiere realizar(+,-,*,/): ");


        //Metodologia de la calculadora
        switch (operacion){
            case "+":
                resultado = num1 + num2;
                break;
            case "-":
                resultado = num1-num2;
                break;
            case "*":
                resultado = num1*num2;
                break;
            case "/":
                if(num2==0){
                    JOptionPane.showMessageDialog(null, "No se puede hacer divisiones por 0");
                }else{
                    resultado = num1/num2;
                }
        }
        JOptionPane.showMessageDialog(null, "El resultado de la operacion efectuada es: "+resultado);

    }


}
