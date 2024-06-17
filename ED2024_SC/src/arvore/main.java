package arvore;

import java.util.Scanner;

public class main {

	static Scanner scanner = new Scanner(System.in);
	
	public static void main(String[] args) {
		Operacoes operacoes = new Operacoes();
		menus menus = new menus();
		int escolha;
	
	    do {
	    	
	    	menus.menuPrincipal();
	        
	        escolha = scanner.nextInt();
	        
	        switch (escolha) {
	            case 1:
	                int escolhaCadastroMedico;
	                do {
	                	
	                    menus.menuMedico();
	                    
	                    escolhaCadastroMedico = scanner.nextInt();
	                    
	                    switch (escolhaCadastroMedico) {
	                        case 1:
	                        	operacoes.cadastro_Medico();
	                            break;
	                        case 2:operacoes.editar_medico();
	                            break;
	                        case 3:
	                        	operacoes.remover_Medico();
	                            break;
	                        case 4:
	                            System.out.println("Voltando ao menu principal...");
	                            break;
	                        default:
	                            System.out.println("Opção inválida. Por favor, tente novamente.");
	                    }
	                    System.out.println();
	                } while (escolhaCadastroMedico != 4);
	                break;
	            case 2:
	                int escolhaCadastroConvenio;
	                do {
	                	
	                    menus.menuConvenio();
	                    
	                    escolhaCadastroConvenio = scanner.nextInt();
	                    
	                    switch (escolhaCadastroConvenio) {
	                        case 1:
	                            operacoes.cadastro_convenio();
	                            break;
	                        case 2:
	                            operacoes.editar_Convenio();
	                            break;
	                        case 3:
	                            operacoes.remover_Convenio();
	                            break;
	                        case 4:
	                            System.out.println("Voltando ao menu principal...");
	                            break;
	                        default:
	                            System.out.println("Opção inválida. Por favor, tente novamente.");
	                    }
	                    System.out.println();
	                } while (escolhaCadastroConvenio != 4);
	                break;
	            case 3:
	                int escolhaPesquisas;
	                do {
	                    
	                	menus.menuPesquisa();
	                    
	                    escolhaPesquisas = scanner.nextInt();
	                    
	                    switch (escolhaPesquisas) {
	                        case 1:
	                            operacoes.mostraArvore_Medico();
	                            break;
	                        case 2:
	                            operacoes.mostraArvore_Convenio();
	                            break;
	                        case 3:
	                            int escolhaConsultaEspecifica;
	                            do {
	                                
	                            	menus.menuConsulta();
	                                
	                                escolhaConsultaEspecifica = scanner.nextInt();
	                                
	                                switch (escolhaConsultaEspecifica) {
	                                    case 1:
	                                        operacoes.pesquisa_Medico();
	                                        break;
	                                    case 2:
	                                        operacoes.pesquisa_Convenio();
	                                        break;
	                                    case 3:
	                                    	operacoes.medico_Convenios();
	                                        break;
	                                    case 4:
	                                        System.out.println("Voltando ao menu anterior...");
	                                        break;
	                                    default:
	                                        System.out.println("Opção inválida. Por favor, tente novamente.");
	                                }
	                                System.out.println();
	                            } while (escolhaConsultaEspecifica != 4);
	                            break;
	                        case 4:
	                            System.out.println("Voltando ao menu principal...");
	                            break;
	                        default:
	                            System.out.println("Opção inválida. Por favor, tente novamente.");
	                    }
	                    System.out.println();
	                } while (escolhaPesquisas != 4);
	                break;
	            case 4:
	                System.out.println("Saindo...");
	                break;
	            default:
	                System.out.println("Opção inválida. Por favor, tente novamente.");
	        }
	        
	        System.out.println();
	    } while (escolha != 4);
	    
	    System.out.println("\nPrograma finalizado! \nFeito por Yasmin Neumann e Yasmin Sousa");
	    scanner.close();
	}
}

