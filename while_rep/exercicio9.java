package while_rep;

import java.util.Scanner;

public class exercicio9 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int registro = 0;
		int gerencia = 0;
		int adm = 0;
		int pesquisa = 0;
		int obras = 0;
		int adm10 = 0;
		String funcionarioAntigo = "";
		String funcionarioNovo = "";
		int anoAntigo = 0;
		int anoNovo = 1000;
		int numeroAntigo = 0;
		int numeroNovo = 1000;
		String nome = "";
	
		do {

			System.out.println("Digite o Registro Funcional: ");
			registro = input.nextInt(); input.nextLine();
			


			if (registro != -1) {
				
				if((registro < 100000 || registro > 999999) || (registro/10000 < 10 || registro/10000 > 14) || (registro/1000%10 < 1 || registro/1000%10 > 4 )) {
					System.err.println("REGISTRO INVÁLIDO");
				}
				
				System.out.println("Digite o nome do funcionário: ");
				nome = input.nextLine();
				
				if(registro/1000%10 == 1) {
					gerencia++;
				}else if(registro/1000%10 == 2) {
					adm++;
					if(registro/10000 == 10) {
						adm10++;
					}
				}else if(registro/1000%10 == 3) {
					pesquisa++;
				}else if(registro/1000%10 == 4) {
					obras++;
				}
				
			}


		}while(registro != -1);

		if(gerencia > adm && gerencia > obras && gerencia > pesquisa) {
			System.out.println("Setor com mais funcionários é a Gerência");
		}else if(adm > gerencia && adm > obras && adm > pesquisa) {
			System.out.println("Setor com mais funcionários é a Administração");	
		}else if(pesquisa > gerencia && pesquisa > obras && pesquisa > adm) {
			System.out.println("Setor com mais funcionários é a Pesquisa");	
		}else if(obras > gerencia && obras > adm && obras > pesquisa) {
			System.out.println("Setor com mais funcionários é a Obras");	
		}
		
		if(registro/10000 > anoAntigo) {
			if(registro%1000 > numeroAntigo) {
				anoAntigo = registro/10000;
				numeroAntigo = registro%1000;
				funcionarioAntigo = nome; 
			}
		}
		
		if(registro/10000 < anoNovo) {
			if(registro%1000 < numeroNovo) {
				anoNovo = registro/10000;
				numeroNovo = registro%1000;
				funcionarioNovo = nome; 
			}
		}
		
		
		
		System.out.println("Quantidade de funcionários por setor: \nGerência = " + gerencia + "\nAdministração = " + adm + "\nPesquisa = " + pesquisa + "\nObras = " + obras);
		System.out.println("Quantidade de funcionários que foram admitidos em 2010 e trabalham na administração = " + adm10);
		System.out.println("Funcionário mais antigo = " + funcionarioAntigo);
		System.out.println("Funcionário mais novo = " + funcionarioNovo);
		
		input.close();
	}

}
