package com.company;

import java.io.IOException;
import java.util.Scanner;

public class Menu {
    public static void main(String[] args)throws IOException{
        Scanner sc = new Scanner(System.in);

        int a;
        while(true){
            System.out.println("Benvinguts");
            System.out.println("1.Configuració competició");
            System.out.println("2.Resultats");
            System.out.println("3.Jugar");
            System.out.println("4.Acabar");

            int opcion = sc.nextInt();

            switch (opcion){
                case 1:
                    ConfiguracioScreem ConfiguracioScreem = new ConfiguracioScreem();
                    ConfiguracioScreem.show();
                    break;

                case 2:
                    ResultatsScreen ResultatsScreen = new ResultatsScreen();
                    ResultatsScreen.show();
                    break;


                case 3:
                    JugarScreen JugarScreen = new JugarScreen();
                    JugarScreen.show();
                    break;

                case 4:
                    AcabarScreen AcabarScreen = new AcabarScreen();
                    AcabarScreen.show();
                    break;

                case 5:
                    return;




            }



        }



    }
}
