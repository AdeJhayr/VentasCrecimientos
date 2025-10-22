package ec.edu.espoch.ventascrecimiento;

import java.util.Scanner;

public class VentasCrecimiento 
{
    public static void main(String[] args) 
    {
        Scanner entrada = new Scanner(System.in);
        
        System.out.println("Cuantas semanas desea analizar");
        int semanas = entrada.nextInt();
        int diasPorSemana = 7;
        
        double[] ventasSemanales;
        ventasSemanales = new double[semanas];
        
        for (int i = 0; i < semanas; i++) 
        {
            double sumaSemana = 0;
            System.out.println("Semana " + (i + 1));
            
            for (int j = 0; j < diasPorSemana; j++) 
            {
                System.out.print("Ingrese la venta del dia  "+(j+1)+":");
                double ventaDia = entrada.nextDouble();
                sumaSemana += ventaDia;
            }
            
            ventasSemanales[i] = sumaSemana;
            System.out.println("Total de ventas en la semana "+(i+1)+":"+sumaSemana);
        }
        
    }
}

