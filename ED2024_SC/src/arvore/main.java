package arvore;

import java.util.Scanner;

public class main {

	static Scanner scanner = new Scanner(System.in);
	
	public static void main(String[] args) {
		

	}
	
	public static void menu_Principal() {
		
	}
	
	public static void cadastro_Medico() {
		int crm;
		String nome, especialidade; 
		
		System.out.println("---CADASTRO MÉDICO---");
		System.out.println("Nome: ");
		nome = scanner.next();
		System.out.println("CRM: ");
		crm = scanner.nextInt();
		System.out.println("Especialidade");
		especialidade = scanner.next();
		
		medico medico = new medico(crm, nome, especialidade);
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
		
	}
	
	public static void menu_Pesquisa() {
		
		
		
	}
	
	public static void mostraArvore_Medico() {
		medico[] vet;
		arvoreMedico arvoreMedico = new arvoreMedico();
		
		vet = arvoreMedico.CamPosFixado();
		for (int i = 0; i < vet.length; i++) {
            System.out.print(vet[i] + " ");
        }
		
		
	}
	public static void mostraArvore_Convenio() {
		convenio[] vet;
		arvoreConvenio arvoreConvenio = new arvoreConvenio();
		
		vet = arvoreConvenio.CamPosFixado();
		
		System.out.print("---ÁRVORE DE CONVÊNIO---");
		for (int i = 0; i < vet.length; i++) {
            System.out.print(vet[i] + " ");
        }
		
	}
	
	public static void pesquisa_Medico() {
		arvoreMedico arvoreMedico = new arvoreMedico();
		int crm;
		
		System.out.print("CRM do médico: ");
		crm = scanner.nextInt();
		
		arvoreMedico.pesquisar(crm);
		
		
		
	}

	
	
	
	
	
	
	
	
	
	
	
	
	
}
