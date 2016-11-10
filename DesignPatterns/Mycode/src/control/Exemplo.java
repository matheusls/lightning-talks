package control;

import model.Frete;
import java.util.*;
public class Exemplo {
	
	public static void main(String[] args){
		double distancia;
		int tipo;
		Scanner entrada = new Scanner(System.in);	
		System.out.println("infrome a distância");
		distancia = entrada.nextDouble();
		System.out.println("infrome o tipo de frete (1) Normal (2) Sedex");
		tipo = entrada.nextInt();
		Frete frete = new Frete(tipo, distancia);
		System.out.println("o Resultado será" + frete.calcularFrete());
		entrada.close();
	}

}
