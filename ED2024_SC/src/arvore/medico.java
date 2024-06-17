package arvore;

public class medico {

    private int crm;
    private String nome;
    private String especialidade;
    private int [] convenios;

    public medico(int crm, String nome, String especialidade, int [] convenios) {
        this.crm = crm;
        this.nome = nome;
        this.especialidade = especialidade;
        this.convenios = convenios; 
    }
    
    public medico() {
    	this.crm = 0;
    	this.nome = "";
    	this.especialidade = "";
    	this.convenios = null;
    }

    public int getCrm() {
        return crm;
    }

    public void setCrm(int crm) {
        this.crm = crm;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEspecialidade() {
        return especialidade;
    }

    public void setEspecialidade(String especialidade) {
        this.especialidade = especialidade;
    }
    
    public int [] getConvenios() {
        return convenios;
    }

    public void getConvenios(int [] convenios) {
        this.convenios = convenios;
    }

}
