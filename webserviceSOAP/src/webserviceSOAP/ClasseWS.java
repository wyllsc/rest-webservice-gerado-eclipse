package webserviceSOAP;

public class ClasseWS {

	public String retornaString(String parametro) {
		return "Mêtodo passando String como Parâmetro: "+parametro;
	}
	
	public int soma(int valor1, int valor2){
		return valor1+valor2;
	}

	public int multiplicacao(int valor1, int valor2){
		return valor1*valor2;
	}

}
