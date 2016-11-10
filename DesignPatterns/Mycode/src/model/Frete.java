package model;

public class Frete {
	private int tipo;
	private double distancia;
	private double preco;
	
	public Frete(int tipo, double distancia){
		this.tipo = tipo;
		this.distancia = distancia;
	}
	public double calcularFrete(){
		
		if (tipo == 1){
			preco = distancia *1.25 +10;
		}
		else if(tipo == 2 )
		{
			preco = distancia *1.45 +12;
		}		
		return preco;
	}	
	public int getTipo() {
		return tipo;
	}
}
