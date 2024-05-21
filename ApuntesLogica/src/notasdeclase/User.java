package notasdeclase;

import java.util.Scanner;

public class User {


    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        String [] names = {"Manuela" , "Elizabeth" , "Mariana" , "Luisa" , "Margarita"};

        int ages[] = new int[5];

        double salaries[] = new double[5];

        ages[0]= 22;
        ages[1]= 42;
        ages[2]= 20;
        ages[3]= 21;
        ages[4]= 70;

        System.out.println(ages[0]);
        System.out.println(ages.length);


        int i = 0;

        while(i < ages.length){

            System.out.println(ages[i]);

            i++;
        }

        int j = 0;

        while (j < names.length){

            System.out.println(names[j]);

            j++;

        }

        //Vamos a ingresar unos  datos usando scanner para tomar datos del sistema
        // y el ciclo while para que de manera automatica pida los 5 datos:

        int k=0;

        while(k< salaries.length){

            System.out.println("Ingrese el salario" + (k+1));
            salaries[k] = sc.nextDouble();
            k++;
        }
        // Ahora vamos a imprimir
        int p=0;
        while (p<salaries.length){
            System.out.println(salaries[p]);
            p++;
        }








    }
}
