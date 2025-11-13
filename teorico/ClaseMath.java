package teorico;

import java.util.Random;

public class ClaseMath {
    public static void main (String[] args){
			int absolututo = Math.abs(-3);
			System.out.println(absolututo);
		
			int maximo = Math.max(5, absolututo);
			System.out.println(maximo);

			int minimo = Math.min(2, absolututo);
			System.out.println(minimo);

			double techo = Math.ceil(3.45);
			System.out.println(techo);

			double piso = Math.floor(3.45);
			System.out.println(piso);

			long entero = Math.round(3.55);
			System.out.println(entero);

			double potencia = Math.pow(2,3);
			System.out.println(potencia);

			double raiz = Math.sqrt(9);
			System.out.println(raiz);

			double grados = Math.toDegrees(1.57);
			System.out.println(grados);

			double radianes = Math.toRadians(90);
			System.out.println(radianes);

			Random random = new Random();
			int randomInt = random.nextInt();
			System.out.println(randomInt);
			//ejemplo entre 15 y 25
			int randomInt2 = 15 + random.nextInt(11);
			System.out.println(randomInt2);
 }		
}