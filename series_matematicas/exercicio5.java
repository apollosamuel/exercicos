package series_matematicas;

public class exercicio5 {

	public static void main(String[] args) {
		
		double serie = 0;
	
		
		for(int i = 1; i <= 10; i++) {
			
			serie+= ((double)(5*i -2))/(6*i + 1);
			
		}
		System.out.println(5*serie);
	}

}
