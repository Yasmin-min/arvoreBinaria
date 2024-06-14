package arvore;


public class NoArvM {
	private medico info; 
	private NoArvM esq, dir;

	public NoArvM(medico elem){
		this.info = elem;
		this.esq = null;
		this.dir = null;
	}
	public NoArvM getEsq(){
		return this.esq;
	}
	public NoArvM getDir(){
		return this.dir;
	}
	public medico getInfo(){
		return this.info;
	}
	public void setEsq(NoArvM no){
		this.esq = no;
	}
	public void setDir(NoArvM no){
		this.dir = no;
	}
	public void setInfo(medico elem){
		this.info = elem;
	}

}
