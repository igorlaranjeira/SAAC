package model.dao.impl;

import model.dao.impl.*;
import java.util.Scanner;

public class Menu {
	public static void main (String[] args) {
		
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
		int nmenu = a.nextInt();
		
		switch (nmenu) {
			case 1:
				CatalogoAeronaves();
			case 2:
				CatalogoAeroportos();
			case 3:
				System.out.print("\n\n[1]Buscar Passageiros\n[2]Criar novo Passageiro\n");
				int pass = a.nextInt();
				
				switch (pass) {
					case 1:
						BuscaPassageiro();
					case 2:
						AddPassageiro();
					default:
						System.out.print("Numero Invalido");
				}
			case 4:
				RotaVoo();
			case 5:
				AnaliseRota();
			default:
				System.out.print("Numero Invalido");
		}
		a.close();
	}

	private static void AnaliseRota() {
		// TODO Auto-generated method stub
		
	}

	private static void RotaVoo() {
		// TODO Auto-generated method stub
		
	}

	private static void AddPassageiro() {
		// TODO Auto-generated method stub
		
	}

	private static void BuscaPassageiro() {
		// TODO Auto-generated method stub
		
	}

	private static void CatalogoAeroportos() {
		// TODO Auto-generated method stub
		
	}

	private static void CatalogoAeronaves() {
		// TODO Auto-generated method stub
		AeronaveDaoJDBC.findAll();
	}

}
