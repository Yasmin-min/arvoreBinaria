package arvore;

import java.util.Scanner;

public class Operacoes {
	static Scanner scanner = new Scanner(System.in);
	static arvoreMedico arvoreMedico = new arvoreMedico();
	static arvoreConvenio arvoreConvenio = new arvoreConvenio();
	
	public static void cadastro_Medico() {
		int crm, convenio;
		String nome, especialidade; 
		boolean retorno;
		int [] convenios = new int [arvoreConvenio.getQuantNos()];
		convenios = new int [arvoreConvenio.getQuantNos()];
		
		System.out.println("---CADASTRO MÉDICO---");
		System.out.println("Nome: ");
		nome = scanner.next();
		System.out.println("CRM: ");
		crm = scanner.nextInt();
		System.out.println("Especialidade: ");
		
		  int numConvenios = arvoreConvenio.getQuantNos();
		   convenios = new int[numConvenios];
		especialidade = scanner.next();
		int x=1;
		
		System.out.println("Desenha cadastrar um id de convênio:"
        		+ "\n1.SIM"
        		+ "\n2.NÃO");
        x = scanner.nextInt();
		while (x==1) {
			int i=0;
			
			
	        do {
	        	System.out.println("ID do convênio que ele atua: ");
	        	convenio = scanner.nextInt();
		        retorno = arvoreConvenio.pesquisar(convenio);
		        if (retorno==true) {
		        	convenios[i] = convenio;
		        	i++;
		        	System.out.println("Desenha tentar outro id de convênio?"
		            		+ "\n1.SIM"
		            		+ "\n2.NÃO");
		            x = scanner.nextInt();
		            break;
		        	
		        } else {
		        	System.out.println("Id de convenio não encontrado, tente um id já cadastrado!");
		        	System.out.println("Desenha tentar outro id de convênio?"
		            		+ "\n1.SIM"
		            		+ "\n2.NÃO");
		            x = scanner.nextInt();
		            if (x==2) {
		            	break;
		            }
		        }
	        }while(retorno==false);
	        
		}
		
		medico medico = new medico(crm, nome, especialidade, convenios);
		
		arvoreMedico.inserir(medico);
		System.out.println("\n Médico cadastrado con sucesso!");
	}
	
	public static void editar_medico() {
		int crm, opcao = 0;
	    boolean retorno, retornoC;
	    
	    System.out.println("---EDITAR MÉDICO---");
	    System.out.println("CRM do médico: ");
	    crm = scanner.nextInt();
	    
	    retorno = arvoreMedico.pesquisar(crm);
	    if (retorno) {
	        medico medicoaux = arvoreMedico.pesquisarMedico(crm);
	        String nome = medicoaux.getNome();
	        String especialidade = medicoaux.getEspecialidade();
	        int[] idaux = medicoaux.getConvenios();
	        
	        int[] id = new int[idaux.length];
	        for (int i = 0; i < idaux.length; i++) {
	            id[i] = idaux[i];
	        }
	        
	        System.out.println(arvoreMedico.pesquisarMedico(crm).toString());
	        
	        do {
	            System.out.println("Digite o número da opção que você deseja editar:");
	            System.out.println("1. Nome");
	            System.out.println("2. Especialidade");
	            System.out.println("3. Adicionar Convênio");
	            System.out.println("4. Sair");
	            opcao = scanner.nextInt();
	            
	            switch (opcao) {
	                case 1:
	                    System.out.println("Novo nome: ");
	                    nome = scanner.next();
	                    break;
	                case 2:
	                    System.out.println("Nova especialidade: ");
	                    especialidade = scanner.next();
	                    break;
	                case 3:
	                	int[] novoId = new int[id.length + 1];
	                	do {
		                    System.out.println("ID do convênio a adicionar: ");
		                    int novoConvenio = scanner.nextInt();
		                    retornoC = arvoreConvenio.pesquisar(novoConvenio);
		                    
		                    
		                    for (int i = 0; i < id.length; i++) {
		                        novoId[i] = id[i];
		                    }
		                    novoId[id.length] = novoConvenio;
		                    id = novoId;
		                    if(retornoC==false) {
		                    	System.out.println("Convenio não encontrado, tente um já cadastrado!");
		                    	
		                    	System.out.println("Desenha tentar outro id de convênio?"
		                        		+ "\n1.SIM"
		                        		+ "\n2.NÃO");
		                       int  x = scanner.nextInt();
		                       if (x==2) {
		                    	   break;
		                       }
		                    }
	                	} while(retornoC==false);
	                	// Atualiza as informações do médico na árvore
	        	        arvoreMedico.atualizarMedicoNo(crm, nome, especialidade, novoId);
	                    break;
	                
	                case 4: 
	                	System.out.println("Voltando ao menu principal...");
	                	break;
	                default:
	                    System.out.println("Opção inválida.");
	                    break;
	            }
	            
	        } while (opcao >= 1 && opcao <= 3);
	        
	        
		
	        
	    } else {
	        System.out.println("Médico não encontrado!");
	    }
	    System.out.println("Médico editado com socesso!");
		
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
			System.out.println("Médico removido com sucesso!");
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
		
		System.out.println("Convênio cadastrado com sucesso!");
		
	}
	
	public static void editar_Convenio() { 
		
		int id, opcao;
		boolean retorno;
		System.out.println("---EDITAR CONVÊNIO---");
		System.out.println("ID do convênio: ");
		id = scanner.nextInt(); 
		retorno = arvoreConvenio.pesquisar(id);
		
		if (retorno == true) {
			convenio convenioaux = arvoreConvenio.pesquisarConvenio(id);
			String nome = convenioaux.getNome(), telefone = convenioaux.getTelefone(), cep = convenioaux.getCep();
			System.out.println(arvoreConvenio.pesquisarConvenio(id)); 
			do {
				System.out.println("Digite o número da opção que você deseja editar: "
						+ "\n 1.Nome;"
						+ "\n 2.Telefone;"
						+ "\n 3.Cep;");
				opcao = scanner.nextInt();
			}while(opcao<1 && opcao>3);
			
			if(opcao == 1) {
				System.out.println("Nome: ");
				nome = scanner.next();
			} else if(opcao == 2) {	
				System.out.println("Telefone: ");
				telefone = scanner.next();
				
			}else if (opcao == 3) {
				System.out.println("CEP: ");
				cep = scanner.next();
			} 
			arvoreConvenio.atualizarConvenioNo(id, nome, telefone, cep);
		} else {
			System.out.println("Convênio não encotrado!");
		}
		System.out.println("Convênio editado com sucesso!");
		
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
		System.out.println("Convênio removido com sucesso!");
	}
	
	public static void mostraArvore_Medico() { 
		medico[] vet;
		
		vet = arvoreMedico.CamPreFixado();
		System.out.print("---ÁRVORE DE MÉDICOS---");
		for (int i = 0; i < vet.length; i++) {
            System.out.print("\n"+vet[i].toString() + " ");
        }
		
		
	}
	
	public static void mostraArvore_Convenio() {  
		convenio[] vet;
		
		vet = arvoreConvenio.CamPreFixado();
		
		System.out.print("---ÁRVORE DE CONVÊNIOS---");
		for (int i = 0; i < vet.length; i++) {
            System.out.print("\n"+vet[i].toString() + " ");
        }
		
	}
	
	public static void pesquisa_Medico() {    
		
		int crm;
		boolean retorno;
		System.out.println("---DADOS DO MÉDICO---");
		System.out.println("CRM do médico: ");
		crm = scanner.nextInt();
		retorno = arvoreMedico.pesquisar(crm);
		if (retorno == true) {
			System.out.println(arvoreMedico.pesquisarMedico(crm));
		} else {
			System.out.println("Médico não encotrado!");
		}
	}

	
	 
	public static void pesquisa_Convenio() { 
		int id;
		boolean retorno;
		System.out.println("---DADOS DO CONVÊNIO---");
		System.out.println("ID do convêcio: ");
		id = scanner.nextInt();
		retorno = arvoreConvenio.pesquisar(id);
		if (retorno == true) {
			System.out.println(arvoreConvenio.pesquisarConvenio(id));
		} else {
			System.out.println("Convênio não encotrado");	
		}
	
	}
	
	public static void medico_Convenios() {     
	    int crm;
	    boolean retorno;
	    
	    System.out.println("---CONVÊNIOS QUE ATUA---");
	    System.out.println("Digite o CRM do médico que deseja: ");
	    crm = scanner.nextInt();
	    
	    medico medicoaux = arvoreMedico.pesquisarMedico(crm);
	    retorno = medicoaux != null; // Verifica se o médico foi encontrado
	    
	    if (retorno) {    
	        int[] vet = medicoaux.getConvenios();
	        int tamanho = vet.length;
	        convenio[] vet2 = new convenio[tamanho];
	        
	        for (int i = 0; i < tamanho; i++) {
	            vet2[i] = arvoreConvenio.pesquisarConvenio(vet[i]);
	        }
	        
	        System.out.println(medicoaux.getNome());
	        System.out.println("Convenios: ");
	        for (int i = 0; i < tamanho; i++) {
	            System.out.println(vet2[i]);
	        }
	        
	    } else {
	        System.out.println("Médico não encontrado!");
	    }
	}
	
}
