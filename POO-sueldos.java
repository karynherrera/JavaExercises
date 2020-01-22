/*Ingresar por pantalla nombre y edad,, uno que cargue y el otro que imprima,
que muestre los datos personales, luego ingresar sueldos y 
que muestre el sueldo y en el main muestre a la persona, muestre el sueldo*/
package sueldos;

import java.util.Scanner;

public class Sueldos {

    protected Scanner sc;
    protected String nombre;
    protected int edad;
    protected double salary;

    public Sueldos() {
        sc = new Scanner(System.in);
    }

    public void getData1() {
        System.out.printf("Ingrese el nombre: ");
        nombre = sc.nextLine();
        System.out.printf("Ingrese la edad: ");
        edad = sc.nextInt();
    }

    public void getData2() {
        System.out.printf("Ingrese el sueldo: ");
        salary = sc.nextDouble();
    }


    public static class nomina extends Sueldos {

        void showData() {
            System.out.printf("nombre: "+ nombre +", edad:" +edad+ ", sueldo: $"+salary);
        }
    }

    public static class nominaData{ 
        public static void main(String[] args) {
        nomina nomina = new nomina();
        nomina.getData1();
        nomina.getData2();
        nomina.showData();
    }
    }
    

}
