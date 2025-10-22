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
        double[] derivadas = new double[semanas - 1];
        for (int i = 0; i < semanas - 1; i++) {
            derivadas[i] = ventasSemanales[i + 1] - ventasSemanales[i]; // derivada semanal
        }

        // Mostrar resultados por semana
        System.out.println("\n=== Comparación de ventas semana a semana ===");
        for (int i = 0; i < derivadas.length; i++) {
            System.out.print("De la semana " + (i + 1) + " a la semana " + (i + 2) + ": ");
            if (derivadas[i] > 0) {
                System.out.println("Crecimiento (" + derivadas[i] + ")");
            } else if (derivadas[i] < 0) {
                System.out.println("Decrecimiento (" + derivadas[i] + ")");
            } else {
                System.out.println("Estable (" + derivadas[i] + ")");
            }
        }

        // Calcular promedio de crecimiento semanal
        double sumaDerivadas = 0;
        for (int i = 0; i < derivadas.length; i++) {
            sumaDerivadas += derivadas[i];
        }
        double promedio = sumaDerivadas / derivadas.length;

        System.out.println("\nPromedio de crecimiento semanal: " + promedio);
        if (promedio > 0) {
            System.out.println("Tendencia general: CRECIMIENTO 📈");
        } else if (promedio < 0) {
            System.out.println("Tendencia general: DECRECIMIENTO 📉");
        } else {
            System.out.println("Tendencia general: ESTABLE ➖");
        }
    }
    
}

