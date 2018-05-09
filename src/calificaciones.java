public class calificaciones {

    static String veredicto(String valor1, String valor2){
        if (valor1.equals(valor2)){
            return "Perfecto. Has tenido buen criterio. ";
        }
        if (Integer.value0f(valor1) < Integer.value0f(valor2)){
            return "Has mejorado, o te ha llegado el éxito inesperado. ";
        }
        else
            return "Te has confiado. Falta realismo. ";
    }

    public static void main (String[] args){

        String valor1;
        String valor2;

        valor1=args[3];
        valor2=args[4];

        System.out.println("La calificación de " + args[0] + " " + args[1] + " " + args[2] + " el obbjetivo final es: " + args[3] + " nota final: " + args[4]);
        System.out.println(calificaciones.veredicto(valor1,valor2));
    }
}
