package arvore;

import java.util.Scanner;

public class main {

	static Scanner scanner = new Scanner(System.in);
	
	public static void main(String[] args) {
		menus munus = new menus();
		menus.menuPrincipal();
		int escolha;
		escolha = scanner.nextInt();
        
        switch (escolha) {
            case 1:
            	int escolhaCadastroMedico;
            	menus.menuMedico();
            	escolhaCadastroMedico = scanner.nextInt();
                
                switch (escolhaCadastroMedico) {
                    case 1:
                        System.out.println("Você selecionou Inserir dados em Cadastro médico.");
                        // Adicione o código para inserir dados do médico aqui
                        break;
                    case 2:
                        System.out.println("Você selecionou Alterar dados em Cadastro médico.");
                        // Adicione o código para alterar dados do médico aqui
                        break;
                    case 3:
                        System.out.println("Você selecionou Remover dados em Cadastro médico.");
                        // Adicione o código para remover dados do médico aqui
                        break;
                    case 4:
                        System.out.println("Voltando ao menu principal...");
                        break;
                    default:
                        System.out.println("Opção inválida. Por favor, tente novamente.");
                }
            case 2:
            	menus.menuConvenio();
            	int escolhaCadastroConvenio;
            	escolhaCadastroConvenio = scanner.nextInt();
                
                switch (escolhaCadastroConvenio) {
                    case 1:
                        System.out.println("Você selecionou Inserir dados em Cadastro convênio.");
                        // Adicione o código para inserir dados do convênio aqui
                        break;
                    case 2:
                        System.out.println("Você selecionou Alterar dados em Cadastro convênio.");
                        // Adicione o código para alterar dados do convênio aqui
                        break;
                    case 3:
                        System.out.println("Você selecionou Remover dados em Cadastro convênio.");
                        // Adicione o código para remover dados do convênio aqui
                        break;
                    case 4:
                        System.out.println("Voltando ao menu principal...");
                        break;
                    default:
                        System.out.println("Opção inválida. Por favor, tente novamente.");
                }
            case 3:
            	 int escolhaPesquisas;
            	 menus.menuPesquisa();
            	 escolhaPesquisas = scanner.nextInt();
            	 switch (escolhaPesquisas) {
                 case 1:
                     System.out.println("Você selecionou Mostrar árvore médico.");
                     // Adicione o código para mostrar a árvore de médicos aqui
                     break;
                 case 2:
                     System.out.println("Você selecionou Mostrar árvore convênio.");
                     // Adicione o código para mostrar a árvore de convênios aqui
                     break;
                 case 3:
                	 int escolhaConsultaEspecifica;
                	 menus.menuConsulta();
                	 escolhaConsultaEspecifica = scanner.nextInt();
                     
                     switch (escolhaConsultaEspecifica) {
                         case 1:
                             System.out.println("Você selecionou Pesquisar médicos.");
                             // Adicione o código para pesquisar médicos aqui
                             break;
                         case 2:
                             System.out.println("Você selecionou Pesquisar convênios.");
                             // Adicione o código para pesquisar convênios aqui
                             break;
                         case 3:
                             System.out.println("Você selecionou Pesquisar convênios em que o médico atua.");
                             // Adicione o código para pesquisar convênios onde o médico atua aqui
                             break;
                         case 4:
                             System.out.println("Voltando ao menu anterior...");
                             break;
                         default:
                             System.out.println("Opção inválida. Por favor, tente novamente.");
                     }
                 case 4:
                     System.out.println("Voltando ao menu principal...");
                     break;
                 default:
                     System.out.println("Opção inválida. Por favor, tente novamente.");
             }
            	 
            case 4: 
            	System.out.println("Saindo...");
                break;
            default:
                System.out.println("Opção inválida. Por favor, tente novamente.");
        }
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
