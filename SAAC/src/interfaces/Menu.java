package interfaces;

import java.util.Scanner;

import db.DB;
import model.dao.AeronaveDao;
import model.dao.AeroportoDao;
import model.dao.DaoFactory;
import model.dao.impl.AeronaveDaoJDBC;
import model.entities.Aeronave;
import model.entities.Aeroporto;

public interface Menu {

public static void IniciarMenu() {
	
	DB.getConnection();
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
						 	"[5]Analise de Rota");
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
		// TODO Auto-generated method stub
		
	}

	public static void AddPassageiro() {
		// TODO Auto-generated method stub
		
	}

	public static void BuscaPassageiro() {
		
		
	}

	public static void CatalogoAeroportos() {
		AeroportoDao aeroporto = DaoFactory.createAeroportoDao();
		aeroporto.findTudo();
		voltarMenu();
	}

	public static void CatalogoAeronaves() {
		System.out.println("\n\nCatalogo Completo:\n\n");
		AeronaveDao aeronave = DaoFactory.createAeronaveDao();
		aeronave.findTudo();
		voltarMenu();
		
	}
	public static void voltarMenu() {
		Scanner a = new Scanner(System.in);
		System.out.print("Deseja Voltar ao Menu?(Digite 1): ");
		try {
			int voltar = a.nextInt();
			if(voltar == 1) {
				IniciarMenu();
			}
		}catch (Exception e) {
			e.fillInStackTrace();
		}
	}
	public static void limparLinha() {
		for(int i=0;i<200;i++) {
			System.out.println("\n");
		}
	}

}
