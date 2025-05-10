import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double montoPrestamo = 0, tasaInteresAnualA = 0, tasaInteresAnualB = 0,
                interesMesA = 0, interesMesB = 0, diferenciaInteres = 0,
                ahorroAnual = 0, cuotaMensual = 0;
        System.out.println("Ingrese el monto del prestamo.");
        montoPrestamo = sc.nextDouble();
        System.out.println("Ingrese el valor de la tasa de interes A(que esta sea la mas baja).");
        tasaInteresAnualA = sc.nextDouble();
        System.out.println("Ingrese el valor de la tasa de interes B(que esta sea la mas alta)");
        tasaInteresAnualB = sc.nextDouble();

        interesMesA = (montoPrestamo/12)+((tasaInteresAnualA/12)*100);
        interesMesB = (montoPrestamo/12)+((tasaInteresAnualB/12)*100);

        diferenciaInteres = interesMesB-interesMesA;
        ahorroAnual=(interesMesB*12)-(interesMesA*12);

        System.out.println("El interes mensual respecto a la tasa A corresponde a: "+ interesMesA);
        System.out.println("El interes mensual respecto a la tasa B corresponde a: "+ interesMesB);
        System.out.println("La diferencia en dinero mensualmente entre la tasa A y B es de: "+ diferenciaInteres);
        System.out.println("El ahorro anual en dinero su se toma la tasa mas baja es igual a: "+ ahorroAnual);

        if(interesMesA<interesMesB){
            System.out.println("El credito mas conveniente para usted es A, con una tasa de interes anual correspomdiente a: " + tasaInteresAnualA );
        }else{
            System.out.println(("El credito mas conveninete para usted es B, con una tasa de interes anual correspondiente a: "+ tasaInteresAnualB));
        }
    }
}