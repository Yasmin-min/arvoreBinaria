package arvore;


public class NoArvC {
	private convenio info; 
	private NoArvC esq, dir;

	public NoArvC(convenio elem){
		this.info = elem;
		this.esq = null;
		this.dir = null;
	}
	
	public NoArvC getEsq(){
		return this.esq;
	}
	public NoArvC getDir(){
		return this.dir;
	}
	public convenio getInfo(){
		return this.info;
	}
	public void setEsq(NoArvC no){
		this.esq = no;
	}
	public void setDir(NoArvC no){
		this.dir = no;
	}
	public void setInfo(convenio elem){
		this.info = elem;
	}

}
