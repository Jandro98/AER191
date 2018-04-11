
package aceptaelreto191;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class AceptaElReto191 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader (new InputStreamReader(System.in));
        String s = br.readLine();//Se pide el numero de veces que se realizaran las operaciones
        int n = Integer.parseInt(s);//Al pedirlo como String, lo pasamos a int para poder operar con el
        for(int i=0;i<n;i++){
            int sol=0;//Variable que mostrará la solución final
            s = br.readLine();//Se piden los 3 numeros correspondientes
            String ss[] = s.split(" ");//Al pedirlos como String, los separamos de 1 en 1
            //Instanciamos las distintas variables y les damos su valor correspondiente
            int n1=Integer.parseInt(ss[0]);
            int n2=Integer.parseInt(ss[1]);
            int n3=Integer.parseInt(ss[2]);
            //suma aritmetica noseque
            for(int j=0;j<n1;j++){//Creamos un bucle que se repetirá tantas veces como haya indicado el usuario(n1)
                sol+=n2-n3*j;/*A la variable sol(que comienza en 0) le vamos añadiendo la suma de la capacidad en litros de cada acuario,
                                teniendo en cuenta que cada acuario consecutivo tiene menos capacidad que el anterior*/
            }
            System.out.println(sol);//Mostramos la solucion por pantalla
            System.out.println("Hola");
            System.out.println("Esto es un cambio");
        }
    }
}
