package numeroMayor_y_menor;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class numeroMayor_y_menor {
    

    public static void main( String[] args) throws IOException
    {
        InputStreamReader capturar_teclado = new InputStreamReader(System.in);
        BufferedReader buffer = new BufferedReader(capturar_teclado);

        System.out.println("Ingresa el primer número: ");
        String strNumero1 = buffer.readLine();
        Integer Numero1 = Integer.parseInt(strNumero1);

        System.out.println("Ingresa el segundo número: ");
        String strNumero2 = buffer.readLine();
        Integer Numero2 =Integer.parseInt(strNumero2);

        System.out.println("Ingresa el tercer número: ");
        String strNumero3 = buffer.readLine();
        Integer Numero3 =Integer.parseInt(strNumero3);

        Integer Mayor = Numero1;
        Integer menor = Numero1;

        if (Numero2 > Mayor){
            Mayor = Numero2;
        }

        if (Numero2 < menor){
            Numero2 = menor;
        }

        if (Numero3 > Mayor){
            Mayor = Numero3;
        }

        if(Numero3 < menor){
            Numero3 = menor;
        }

        System.out.println(Mayor  + " es el mayor número, y " + menor + " es el menor número.");               
        
        System.exit(0);
    
    }

}
