package arvore;

import java.util.Scanner;

public class Operacoes {
	static Scanner scanner = new Scanner(System.in);
	static arvoreMedico arvoreMedico = new arvoreMedico();
	static arvoreConvenio arvoreConvenio = new arvoreConvenio();

	
	public static void cadastro_Medico() {
		int crm, convenio;
		String nome, especialidade; 
		int [] convenios;
		convenios = new int [arvoreConvenio.getQuantNos()];
		
		System.out.println("---CADASTRO MÉDICO---");
		System.out.println("Nome: ");
		nome = scanner.next();
		System.out.println("CRM: ");
		crm = scanner.nextInt();
		System.out.println("Especialidade: ");
		especialidade = scanner.next();
		for (int i=0; i>=5; i++) {
			System.out.println("ID dos convênios que ele atua: ");
			convenio = scanner.nextInt();
			convenios[i] = convenio;
			
		}
		medico medico = new medico(crm, nome, especialidade, convenios);
		
		arvoreMedico.inserir(medico);
	}
	
	public static void editar_medico() {   //não esta pronto
		int crm, opcao;
		boolean retorno;
		NoArvM dadosMedico;
		String nome = null, especialidade = null; 
		
		System.out.println("---EDITAR MÉDICO---");
		System.out.println("CRM do médico: ");
		crm = scanner.nextInt(); 
		retorno = arvoreMedico.pesquisar(crm);
	
		//mostrar dados do medico; 
		
		if (retorno == true) {    //não esta pronto
			do {
				System.out.println("Digite o número da opção que você deseja editar: "
						+ "\n 1.Nome;"
						+ "\n 2.Especialidade;"
						+ "\n 3.Nome e Especialidade;");
				opcao = scanner.nextInt();
			}while(opcao<1 && opcao>3);
			
			if(opcao == 1) {
				System.out.println("Nome: ");
				nome = scanner.next();
				
			} else if(opcao == 2) {	
				System.out.println("Especialidade: ");
				especialidade = scanner.next();
				
			}else if (opcao == 3) {
				System.out.println("Nome: ");
				nome = scanner.next();
				System.out.println("Especialidade: ");
				especialidade = scanner.next();
			} 
			arvoreMedico.atualizarMedicoNo(crm, nome, especialidade);
			
		} else {
			System.out.println("Médico não encotrado!");
		}
		
	}
	
	public static void remover_Medico() {
		int crm;
		boolean retorno;
		System.out.println("---EXCLUIR MÉDICO---");
		System.out.println("CRM do médico: ");
		crm = scanner.nextInt(); 
		retorno = arvoreMedico.pesquisar(crm);
		if (retorno == true) {
			arvoreMedico.remover(crm);	
			System.out.println("Médico removido com sucesso!");
		} else {
			System.out.println("Médico não encotrado");	
		}
	}
	
	
	
	public static void cadastro_convenio() {
		int id;
		String nome, cep, telefone;
		
		System.out.println("---CADASTRO CONVÊNIO---");
		System.out.println("Nome: ");
		nome = scanner.next();
		System.out.println("ID: ");
		id = scanner.nextInt();
		System.out.println("Telefone: ");
		telefone = scanner.next();
		System.out.println("CEP: ");
		cep = scanner.next();
		
		convenio convenio = new convenio(nome, id, telefone, cep);
		
		arvoreConvenio.inserir(convenio);
		
	}
	
	public static void editar_Convenio() {   //não esta pronto 
		
		int id;
		boolean retorno;
		System.out.println("---EDITAR CONVÊNIO---");
		System.out.println("ID do convênio: ");
		id = scanner.nextInt(); 
		retorno = arvoreConvenio.pesquisar(id);
		if (retorno == true) {
			//editar o no
		} else {
			System.out.println("Convênio não encotrado!");
		}
		
	}
	
	public static void remover_Convenio() {
		int id;
		boolean retorno;
		System.out.println("---EXCLUIR CONVÊNIO---");
		System.out.println("ID do convênio: ");
		id = scanner.nextInt(); 
		retorno = arvoreConvenio.pesquisar(id);
		if (retorno == true) {
			arvoreConvenio.remover(id);	
			System.out.println("Convênio removido com sucesso!");
		} else {
			System.out.println("Convênio não encotrado");	
		}
	}
	
	public static void mostraArvore_Medico() {   //não esta pronto 
		medico[] vet;
		
		vet = arvoreMedico.CamPosFixado();
		System.out.print("---ÁRVORE DE MÉDICOS---");
		for (int i = 0; i < vet.length; i++) {
            System.out.print("\n"+vet[i].toString() + " ");
        }
		
		
	}
	
	public static void mostraArvore_Convenio() {    //não esta pronto 
		convenio[] vet;
		
		vet = arvoreConvenio.CamPosFixado();
		
		System.out.print("---ÁRVORE DE CONVÊNIOS---");
		for (int i = 0; i < vet.length; i++) {
            System.out.print("\n"+vet[i].toString() + " ");
        }
		
	}
	
	public static void pesquisa_Medico() {     //não esta pronto 
		
		int crm;
		boolean retorno;
		System.out.println("---DADOS DO MÉDICO---");
		System.out.println("CRM do médico: ");
		crm = scanner.nextInt();
		retorno = arvoreMedico.pesquisar(crm);
		if (retorno == true) {
			//mostrar os dados
		} else {
			System.out.println("Médico não encotrado!");
		}
		/*
		//[] dados_medicos = arvoreMedico.CamPosFixado(crm); */
	}

	
	 
	public static void pesquisa_Convenio() {     //não esta pronto 
		int id;
		boolean retorno;
		System.out.println("---DADOS DO CONVÊNIO---");
		System.out.println("ID do convêcio: ");
		id = scanner.nextInt();
		retorno = arvoreConvenio.pesquisar(id);
		if (retorno == true) {
			//mostrar os dados
		} else {
			System.out.println("Convênio não encotrado");	
		}
	
	}
	
	public static void medico_Convenios() {     //não esta pronto 
		
	
	}
	
	
	

}












