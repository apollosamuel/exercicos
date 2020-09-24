package series_matematicas;

public class exercicio12 {

	public static void main(String[] args) {
		double serie = 0;
		double sinal = 1;

		for (int i = 0; i < 10000; i++) {
			serie+= sinal/(2*i + 1);
			sinal*=-1;
		}
		System.out.println("Valor da série =" + 4*serie);
	}

}


