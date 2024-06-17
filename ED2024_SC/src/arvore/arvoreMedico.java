package arvore;

public class arvoreMedico {
	
	private NoArvM raiz;
	private int quantNos;
	
	public arvoreMedico(){
		this.quantNos=0;
		this.raiz = null;
	}
	public boolean eVazia (){
		return (this.raiz == null);
	}
	public NoArvM getRaiz(){
		return this.raiz;
	}
	public int getQuantNos(){
		return this.quantNos;
	}
	//inserir um novo no na arvore. Sempre insere em um atributo que seja igual a null
	public boolean inserir (medico elem){
		if (pesquisar (elem.getCrm())){ 
			return false;
		}else{
			this.raiz = inserir (elem, this.raiz);
			this.quantNos++;
			return true;
		}
	}
	public NoArvM inserir (medico elem, NoArvM no){
		if (no == null){
			NoArvM novo = new NoArvM(elem);
			return novo;
		}else {
			if (elem.getCrm() < no.getInfo().getCrm()){  
				no.setEsq(inserir(elem, no.getEsq()));
				return no;
			}else{
				no.setDir(inserir(elem, no.getDir()));
				return no;
			}
		}
	}
	//Pesquisa se um determinado valor esta na arvore
	public boolean pesquisar (int chave){
		if (pesquisar (chave, this.raiz)!= null){
			return true;
		}else{
			return false;
		}
	}
	private NoArvM pesquisar (int chave, NoArvM no){
		if (no != null){
			if (chave < no.getInfo().getCrm()){
				no = pesquisar (chave, no.getEsq());
			}else{
				if (chave > no.getInfo().getCrm()){
					no = pesquisar (chave, no.getDir());
				}
			}
		}
		return no;
	}
//remove um determinado no procurando pela chave. O no pode estar em qualquer
//posicao na arvore
	public NoArvM remover (int chave){
		if (pesquisar (chave, this.raiz) != null){
			this.raiz = remover (chave, this.raiz);
			this.quantNos--;
			return this.raiz;
		}
		else {
			return this.raiz;
		}
	}
	public NoArvM remover (int chave, NoArvM arv){
		if (chave < arv.getInfo().getCrm()){
			arv.setEsq(remover (chave, arv.getEsq()));
		}else{
			if (chave > arv.getInfo().getCrm()){
				arv.setDir(remover (chave, arv.getDir()));
			}else{
				if (arv.getDir()== null){
					return arv.getEsq();
				}else{
					if (arv.getEsq() == null){ 
						return arv.getDir();
					}else{
						arv.setEsq(arrumar(arv, arv.getEsq()));
					}
				}
			}
		}
		return arv;
	}
	private NoArvM arrumar (NoArvM arv, NoArvM maior){
		if (maior.getDir() != null){
			maior.setDir(arrumar (arv, maior.getDir()));
		}
		else{
			arv.setInfo(maior.getInfo());
			maior = maior.getEsq();
		}
		return maior;
	}
	//caminhamento central
	public medico [] CamCentral (){
		int []n= new int[1];
		n[0]=0;
		medico [] vet = new medico[this.quantNos];
		return (FazCamCentral (this.raiz, vet, n));
	}
	private medico [] FazCamCentral (NoArvM arv, medico [] vet, int []n){
		if (arv != null) {
			vet = FazCamCentral (arv.getEsq(),vet,n);
			if (arv.getInfo().getCrm() % 2 == 0){
				vet[n[0]] = arv.getInfo();
				n[0]++;
			}
			vet = FazCamCentral (arv.getDir(),vet,n);
		}
		return vet;
	}
	//caminhamento pre-fixado
	public medico [] CamPreFixado (){
		int []n= new int[1];
		n[0]=0;
		medico [] vet = new medico[this.quantNos];
		return (FazCamPreFixado (this.raiz, vet, n));
	}
	private medico [] FazCamPreFixado (NoArvM arv, medico [] vet, int []n){
		if (arv != null) {
			vet[n[0]] = arv.getInfo();
			n[0]++;
			vet = FazCamPreFixado (arv.getEsq(), vet,n);
			vet = FazCamPreFixado (arv.getDir(), vet,n);
		}
		return vet;
	}
	//caminhamento pos-fixado
	public medico [] CamPosFixado (){
		int []n= new int[1];
		n[0]=0;
		medico [] vet = new medico[this.quantNos];
		return (FazCamPosFixado (this.raiz, vet, n));
	}
	private medico [] FazCamPosFixado (NoArvM arv, medico[] vet, int []n){
		if (arv != null) {
			vet = FazCamPosFixado (arv.getEsq(), vet,n);
			vet = FazCamPosFixado (arv.getDir(), vet,n);
			vet[n[0]] = arv.getInfo();
			n[0]++;
		}
		return vet;
	}
	
	
	public medico [] CamPreFixado1 (int crm){
		int []n= new int[1];
		n[0]=0;
		medico [] vet = new medico[this.quantNos];
		return (FazCamPreFixado1 (this.raiz, vet, n, crm));
	}
	private medico [] FazCamPreFixado1 (NoArvM arv, medico [] vet, int []n, int crm){
		
		if (arv != null) {
			vet[n[0]] = arv.getInfo();
			n[0]++;
			vet = FazCamPreFixado (arv.getEsq(), vet,n);
			vet = FazCamPreFixado (arv.getDir(), vet,n);
		}
		return vet;
	}
	
	
	public void pesquisaDireta (int crm) {
		NoArvM no= this.raiz;
		medico medicotemp = new medico();
		if (no != null){
			if (crm < no.getInfo().getCrm()){
				no = pesquisar (crm, no.getEsq());
				medicotemp = no.getInfo();
				
				medicotemp.setNome(null);
				medicotemp.setEspecialidade(null);
				no.setInfo(medicotemp);
			}else{
				if (crm > no.getInfo().getCrm()){
					no = pesquisar (crm, no.getDir());
				}
			}
		}
	}
}

















