package arvore;

public class menus {
	public  static void menuPrincipal(){
    	System.out.println("---MENU PRINCIPAL---");
        System.out.println("1. Cadastro médico");
        System.out.println("2. Cadastro convênio");
        System.out.println("3. Pesquisas");
        System.out.println("4. Sair");
        System.out.print("Escolha uma opção: ");
    }
    
    public static void menuMedico() {
    	System.out.println("\n---CADASTRO MÉDICO---");  
        System.out.println("1. Inserir dados");
        System.out.println("2. Alterar dados");
        System.out.println("3. Remover dados");
        System.out.println("4. Voltar ao menu principal");
        System.out.print("Escolha uma opção: ");
        
    }
    
    public  static void menuConvenio() {
    	System.out.println("\n---CADASTRO CONVÊNIO---");
        System.out.println("1. Inserir dados");
        System.out.println("2. Alterar dados");
        System.out.println("3. Remover dados");
        System.out.println("4. Voltar ao menu principal");
        System.out.print("Escolha uma opção: ");
    }
    
    public  static void menuPesquisa() {
    	System.out.println("\n---PESQUISAS---"); 
        System.out.println("1. Mostrar árvore médico");
        System.out.println("2. Mostrar árvore convênio");
        System.out.println("3. Consulta específica");
        System.out.println("4. Voltar ao menu principal");
        System.out.print("Escolha uma opção: ");
        
    }
    
    public  static void menuConsulta() {
    	System.out.println("\n---CONSULTAS ESPECÍFICAS---");
        System.out.println("1. Pesquisar médicos");
        System.out.println("2. Pesquisar convênios");
        System.out.println("3. Pesquisar convênios em que o médico atua");
        System.out.println("4. Voltar ao menu anterior");
        System.out.print("Escolha uma opção: ");
    }
 
       
}
