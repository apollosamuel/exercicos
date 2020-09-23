package series_matematicas;

public class exercicio9 {

	public static void main(String[] args) {

		double serie = 0;

		for(int i = 1; i <= 30; i++) {
			
			serie += Math.pow(3, i+1)/((9+i)*Math.sqrt(Math.pow(i,4)));

		}
		System.out.println(100-(Math.pow(serie, 3)));
	}

}
