package arvore;

public class convenio {
	
	    private String nome;
	    private int id;
	    private String telefone;
	    private String cep;
	    
	    
	    public convenio(String nome, int id, String telefone, String cep) {
	        this.nome = nome;
	        this.id = id;
	        this.telefone = telefone;
	        this.cep = cep;
	    }

	    public String getNome() {
	        return nome;
	    }

	    public void setNome(String nome) {
	        this.nome = nome;
	    }

	    public int getId() {
	        return id;
	    }

	    public void setId(int id) {
	        this.id = id;
	    }

	    public String getTelefone() {
	        return telefone;
	    }

	    public void setTelefone(String telefone) {
	        this.telefone = telefone;
	    }

	    public String getCep() {
	        return cep;
	    }

	    public void setCep(String cep) {
	        this.cep = cep;
	    }
	   
}
