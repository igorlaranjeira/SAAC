package interfaces;

import java.util.Scanner;

import model.dao.AeronaveDao;
import model.dao.AeroportoDao;
import model.dao.DaoFactory;
import model.dao.PassageiroDao;
import model.entities.Aeronave;
import model.entities.Aeroporto;
import model.entities.Passageiro;

public interface Menu {

public static void IniciarMenu() {
		Scanner a = new Scanner(System.in);
		
		System.out.println(" ____________________________________________________________\r\n" + 
						 "|                                                            | \r\n" + 
						 "|      _______                                   ________    |\r\n" + 
						 "|     |                /\\             /\\        |            |\r\n" + 
						 "|     |               /  \\           /  \\       |            |\r\n" + 
						 "|     |_______       /___ \\         /____\\      |            |\r\n" + 
						 "|             |     /      \\       /      \\     |            |\r\n" + 
						 "|             |    /        \\     /        \\    |            |\r\n" + 
						 "|     ________| o /          \\ o /          \\ o |________ o  |\r\n" + 
						 "|                                                            |\r\n" + 
						 "|____________________________________________________________|\n" + 
						 "          Sistema de Auxilio a Aeronaves conectadas\n" + 
						 "                       Versao - 1.0.0\n\n\n");
		System.out.println("Digite o numero do que deseja fazer no programa:\n\n" + 
						 	"[1]Catalogo de Aeronaves\n" + 
							"[2]Catalogo de Aeroportos\n" + 
						 	"[3]Passageiros\n" + 
							"[4]Rota de Voo\n" + 
						 	"[5]Analise de Rota\n" +
				  			"[6]Sair");
		System.out.print("\nSelecione um numero: ");
		
		try {
			int nmenu = a.nextInt();
			
			if (nmenu == 1) {
				CatalogoAeronaves();
			}
			else if(nmenu == 2) {
				CatalogoAeroportos();
			}
			else if (nmenu == 3) {
				System.out.print("\n\n[1]Buscar Passageiros\n[2]Criar novo Passageiro\n");
				int pass = a.nextInt();
				if (pass == 1) {	
					BuscaPassageiro();
				}	
				else if(pass == 2) {
					AddPassageiro();
				}
				else {		
					System.out.print("Numero Invalido");
				}
			}	
			else if(nmenu == 3) {
				RotaVoo();
			}
			else if(nmenu == 5) {
				AnaliseRota();
			}
			else if(nmenu == 6) {
				System.exit(0);
			}
			else {
				System.out.print("Numero Invalido");
			}
			a.close();
		}catch (Exception e) {
			IniciarMenu();
		}
}

	public static void AnaliseRota() {
		// TODO Auto-generated method stub
		
	}

	public static void RotaVoo() {
		Scanner r = new Scanner(System.in);
		
		//Busca de país de origem
		System.out.println("Digite o local de origem:");
		String orig = r.nextLine();
		
		//busca de país de destino
		System.out.println("Digite o local de destino:");
		String dest = r.nextLine();
		
		//Busca de aeronave
		System.out.println("Digite a aeronave utilizada:");
		String au = r.nextLine();
		
		r.close();
		
	}

	public static void AddPassageiro() {
		// Insert new Passageiro
		
	}

	public static void BuscaPassageiro() {
		Scanner p = new Scanner(System.in);
		PassageiroDao passageiro = DaoFactory.createPassageiroDao();
		System.out.println("Insira o id do passageiro");
		int id = p.nextInt();
		Passageiro pas = passageiro.findById(id);
		System.out.print(pas);
		p.close();
	}

	public static void CatalogoAeroportos() {
		AeroportoDao aeroporto = DaoFactory.createAeroportoDao();
		Aeroporto aerop = aeroporto.findById(2);
		System.out.print(aerop);
		
	}

	public static void CatalogoAeronaves() {
		AeronaveDao aeronave = DaoFactory.createAeronaveDao();
		Aeronave aero = aeronave.findById(2);
		System.out.print(aero);
	}

}
