package arvore;

public class arvoreConvenio {

	private NoArvC raiz;
	private int quantNos;

	public arvoreConvenio(){
		this.quantNos=0;
		this.raiz = null;
	}
	public boolean eVazia (){
		return (this.raiz == null);
	}
	public NoArvC getRaiz(){
		return this.raiz;
	}
	public int getQuantNos(){
		return this.quantNos;
	}
	//inserir um novo n� na arvore. Sempre insere em um atributo que seja igual a null
	public boolean inserir (convenio elem){
		if (pesquisar (elem.getId())){
			return false;
		}else{
			this.raiz = inserir (elem, this.raiz);
			this.quantNos++;
			return true;
		}
	}
	public NoArvC inserir (convenio elem, NoArvC no){
		if (no == null){
			NoArvC novo = new NoArvC(elem);
			return novo;
		}else {
			if (elem.getId() < no.getInfo().getId()){
				no.setEsq(inserir(elem, no.getEsq()));
				return no;
			}else{
				no.setDir(inserir(elem, no.getDir()));
				return no;
			}
		}
	}
	//Pesquisa se um determinado valor est� na �rvore
	public boolean pesquisar (int chave){
		if (pesquisar (chave, this.raiz)!= null){
			return true;
		}else{
			return false;
		}
	}
	private NoArvC pesquisar (int chave, NoArvC no){
		if (no != null){
			if (chave < no.getInfo().getId()){
				no = pesquisar (chave, no.getEsq());
			}else{
				if (chave > no.getInfo().getId()){
					no = pesquisar (chave, no.getDir());
				}
			}
		}
		return no;
	}
//remove um determinado n� procurando pela chave. O n� pode estar em qualquer
//posi��o na �rvore
	public boolean remover (int chave){
		if (pesquisar (chave, this.raiz) != null){
			this.raiz = remover (chave, this.raiz);
			this.quantNos--;
			return true;
		}
		else {
			return false;
		}
	}
	public NoArvC remover (int chave, NoArvC arv){
		if (chave < arv.getInfo().getId()){
			arv.setEsq(remover (chave, arv.getEsq()));
		}else{
			if (chave > arv.getInfo().getId()){
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
	private NoArvC arrumar (NoArvC arv, NoArvC maior){
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
	public convenio [] CamCentral (){
		int []n= new int[1];
		n[0]=0;
		convenio [] vet = new convenio[this.quantNos];
		return (FazCamCentral (this.raiz, vet, n));
	}
	private convenio [] FazCamCentral (NoArvC arv, convenio [] vet, int []n){
		if (arv != null) {
			vet = FazCamCentral (arv.getEsq(),vet,n);
			if (arv.getInfo().getId() % 2 == 0){
				vet[n[0]] = arv.getInfo();
				n[0]++;
			}
			vet = FazCamCentral (arv.getDir(),vet,n);
		}
		return vet;
	}
	//caminhamento pr�-fixado
	public convenio [] CamPreFixado (){
		int []n= new int[1];
		n[0]=0;
		convenio [] vet = new convenio[this.quantNos];
		return (FazCamPreFixado (this.raiz, vet, n));
	}
	private convenio [] FazCamPreFixado (NoArvC arv, convenio [] vet, int []n){
		if (arv != null) {
			vet[n[0]] = arv.getInfo();
			n[0]++;
			vet = FazCamPreFixado (arv.getEsq(), vet,n);
			vet = FazCamPreFixado (arv.getDir(), vet,n);
		}
		return vet;
	}
	//caminhamento p�s-fixado
	public convenio [] CamPosFixado (){
		int []n= new int[1];
		n[0]=0;
		convenio [] vet = new convenio[this.quantNos];
		return (FazCamPosFixado (this.raiz, vet, n));
	}
	private convenio [] FazCamPosFixado (NoArvC arv, convenio[] vet, int []n){
		if (arv != null) {
			vet = FazCamPosFixado (arv.getEsq(), vet,n);
			vet = FazCamPosFixado (arv.getDir(), vet,n);
			vet[n[0]] = arv.getInfo();
			n[0]++;
		}
		return vet;
	}

}
