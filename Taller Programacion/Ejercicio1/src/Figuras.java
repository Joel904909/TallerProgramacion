import javax.swing.*;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Figuras {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        //Calculo para el triangulo
        System.out.println("Calculo para el triangulo ");
        System.out.println("Ingrese la base del triangulo: ");
        double baseTriangulo = Double.parseDouble(reader.readLine());
        System.out.println("Ingrese la altura del triangulo: ");
        double alturaTriangulo = Double.parseDouble(reader.readLine());

        //Area del Triangulo
        double areaTriangulo = (baseTriangulo*alturaTriangulo)/2;
        System.out.println("El area del triangulo es: " +areaTriangulo);

        //Perimetro del Triangulo
        System.out.println("Ingrese los lados del triangulo: ");
        double ladoT1 = Double.parseDouble(reader.readLine());
        double ladoT2 = Double.parseDouble(reader.readLine());
        double ladoT3 = Double.parseDouble(reader.readLine());
        double perimTriangulo = ladoT1+ladoT2+ladoT3;
        System.out.println("El perimetro del triangulo es: " +perimTriangulo);

        //Calculo para el cuadrado
        System.out.println("Calculo para el cuadrado");
        System.out.println("Ingrese el lado del cuadrado: ");
        //Area del cuadrado
        double ladoCuad = Double.parseDouble(reader.readLine());
        double areaCuadrado = ladoCuad*ladoCuad;
        System.out.println("El area del cuadrado es: " + areaCuadrado);
        //Perimetro del cuadrado
        double perimCuadrado = 4*ladoCuad;
        System.out.println("El perimetro del cuadrado es: " + perimCuadrado);

        //Calculo del rectangulo
        System.out.println("Calculo para el rectangulo");
        System.out.println("Ingrese la base del rectangulo: ");
        double baseRectangulo = Double.parseDouble(reader.readLine());
        System.out.println("Ingrese la altura del rectangulo: ");
        double alturaRectangulo = Double.parseDouble(reader.readLine());

        //Area del rectangulo
        double areaRectangulo = baseRectangulo*alturaRectangulo;
        System.out.println("El area del rectangulo es: " + areaRectangulo);

        //Perimetro del rectangulo
        double perimRectangulo = (2*alturaRectangulo)+(2*baseRectangulo);
        System.out.println("El perimetro del rectangulo es: " + perimRectangulo);
    }
}
