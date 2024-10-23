import javax.swing.*;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
public class IVA_Producto {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        double iva;
        System.out.println("Ingrese el valor del producto: ");
        double valor = Double.parseDouble(reader.readLine());

        if(valor<=0){
            System.out.println("Este producto no tiene IVA :)");
        }else{
            if(valor<=500){
                iva = valor*0.12+valor;
                System.out.println("El valor de su producto con el 12% de IVA es: "+iva);
            } else if (valor>500 && valor<=1500) {
                iva = valor*0.14+valor;
                System.out.println("El valor de su producto con el 14% de IVA es: "+iva);
            }else if(valor>1500){
                iva = valor*0.15+valor;
                System.out.println("El valor de su producto con el 15% de IVA es: "+iva);

            }
        }
    }
}
