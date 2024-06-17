package arvore;

import java.util.Scanner;

public class Operacoes {
	static Scanner scanner = new Scanner(System.in);
	
	public static void cadastro_Medico() {
		arvoreConvenio arvoreConvenio = new arvoreConvenio();
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
		
		arvoreMedico arvoreMedico = new arvoreMedico();
		arvoreMedico.inserir(medico);
	}
	
	public static void editar_medico() {   //não esta pronto
		arvoreMedico arvoreMedico = new arvoreMedico();
		int crm;
		boolean retorno;
		NoArvM dadosMedico;
		
		System.out.println("---EDITAR MÉDICO---");
		System.out.println("CRM do médico: ");
		crm = scanner.nextInt(); 
		retorno = arvoreMedico.pesquisar(crm);
		if (retorno == true) {
			//dadosMedico = arvoreMedico.pesquisaDireta(crm);
		} else {
			System.out.println("Médico não encotrado!");
		}
		
	}
	
	public static void remover_Medico() {
		arvoreMedico arvoreMedico = new arvoreMedico();
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
		
		arvoreConvenio arvoreConvenio = new arvoreConvenio();
		arvoreConvenio.inserir(convenio);
		
	}
	
	public static void editar_Convenio() {   //não esta pronto 
		
		arvoreConvenio arvoreConvenio = new arvoreConvenio();
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
		arvoreConvenio arvoreConvenio = new arvoreConvenio();
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
		arvoreMedico arvoreMedico = new arvoreMedico();
		
		vet = arvoreMedico.CamPosFixado();
		System.out.print("---ÁRVORE DE MÉDICOS---");
		for (int i = 0; i < vet.length; i++) {
            System.out.print(vet[i] + " ");
        }
		
		
	}
	
	public static void mostraArvore_Convenio() {    //não esta pronto 
		convenio[] vet;
		arvoreConvenio arvoreConvenio = new arvoreConvenio();
		
		vet = arvoreConvenio.CamPosFixado();
		
		System.out.print("---ÁRVORE DE CONVÊNIOS---");
		for (int i = 0; i < vet.length; i++) {
            System.out.print(vet[i] + " ");
        }
		
	}
	
	public static void pesquisa_Medico() {     //não esta pronto 
		
		arvoreMedico arvoreMedico = new arvoreMedico();
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
		arvoreConvenio arvoreConvenio = new arvoreConvenio();
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











