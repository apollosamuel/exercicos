package testeExecutavel;
import javax.swing.JOptionPane;
import java.util.Random;

public class adivinhacao {

	public static void main(String[] args) {
		int cont = 0;
		int numero = 0;
		Random gerador = new Random();
		int randomInt = gerador.nextInt(100) + 1;
		
		
		JOptionPane.showMessageDialog(null, "Bem vindo ao jogo de Adivinhação", "Jogo de Adivinhação" , 1);
		
		do {

			numero = Integer.parseInt(JOptionPane.showInputDialog (null, "Digite um número"));
			cont++;
			
			if(numero == randomInt) {
				JOptionPane.showMessageDialog(null, "Acertou!!!", "Jogo de Adivinhação" , 1);
				JOptionPane.showMessageDialog(null, "Você acertou em " + cont + " tentativas.", "Jogo de Adivinhação" , 1);
				numero = -1;
			}else if (numero > randomInt) {
				JOptionPane.showMessageDialog(null, "Você errou! O seu chute foi maior do que o número secreto.", "Jogo de Adivinhação" , 2);
			}else if(numero < randomInt) {
				JOptionPane.showMessageDialog(null, "Você errou! O seu chute foi menor do que o número secreto.", "Jogo de Adivinhação" , 2);
			}
			
		}while(numero != -1);


	}

	}


