import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        // peso en kg/ altura en metros al cuadrado

        //Declaro las variables
        double peso, altura,icm;
        int edad;
        String nombre;


        //Pido al usuario que ingrese sus datos
        Scanner entrada = new Scanner(System.in);
        System.out.println("Ingrese su nombre y apellido");
        nombre= entrada.nextLine();
        System.out.println("Ingrese su Edad");
        edad= entrada.nextInt();
        System.out.println("Ingrese su Peso");
        peso= entrada.nextDouble();
        System.out.println("Ingrese su Altura en metros");
        altura= entrada.nextDouble();



        //Realizo los calculos

        icm= peso/(altura*altura);
        System.out.println("Su indice de masa corporal es: "+icm);
        
        if (icm<16.0) {
            System.out.println("Bajo peso, Delgadez Severa");

        }
        else if (icm >= 16.0 && icm<=16.99) {
            System.out.println("Bajo Peso, Delgadez Moderada");
        }
        else if (icm >= 17.0 && icm<=18.49) {
            System.out.println("Bajo Peso, Delgadez Leve");
        }
        else if (icm >= 18.5 && icm<=24.99){
            System.out.println("Valor normal, riesgo promedio");
        } else if (icm >= 25 && icm<=29.99) {
            System.out.println("Esta en sobrepeso, riesgo aumentado");
            
        } else if (icm >= 30 && icm<=34.99) {
            System.out.println("Es obeso, Moderado");

        } else if (icm >= 35 && icm<=39.99) {
            System.out.println("Es Obeso grado II, riesgo Severo");

        }else {
            System.out.println("Es Obeso grado III, riesgo Muy Severo");

        }


    }
}