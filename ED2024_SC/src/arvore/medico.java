package arvore;

public class medico {

    private int crm;
    private String nome;
    private String especialidade;

    public medico(int crm, String nome, String especialidade) {
        this.crm = crm;
        this.nome = nome;
        this.especialidade = especialidade;
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

}
