package notasdeclase;

import java.util.Scanner;

public class DoWhile {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String [] names = {"Manuela" , "Elizabeth" , "Mariana" , "Luisa" , "Margarita"};
        int i=0;
        do{
                System.out.println(names[i]);
                i++;
            }while(i < 0);

            ////////////////////////////////////////////////////////


            int datos[] = new int[8];
            int j = 0;
            do {
                System.out.println("Desea ingresar un dato y/n");
                String resp = sc.nextLine();
                if (resp.equals("y")){
                    datos[j]= sc.nextInt();
                } else if (resp.equals("n")) {
                    break;
                }else{
                    System.out.println("Use solo y/n en minuscula");
                }
            }while(j < datos.length);

            for (int k = 0; k< datos.length; k++){
                System.out.println(datos[k]);
            }
        }








    }

