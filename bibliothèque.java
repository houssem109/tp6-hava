package tp6;

public class bibliothèque {
	public documents [] listdoc;
	private int Nombre_documents=0;
	private int Capacité;
	public bibliothèque() {
		this.listdoc= new documents[Capacité];
		this.Nombre_documents=0;
		this.Capacité=1000;
	}
	public bibliothèque(int Capacité) {
		this.listdoc= new documents[Capacité];
		this.Nombre_documents=0;
		this.Capacité=Capacité;
	}
	public int getCapacité() {
		return Capacité;
	}
	void Ajout_doc (documents d) {
		if (Nombre_documents<Capacité){
			listdoc[ Nombre_documents]=d;
			 Nombre_documents++;
			}
			else {
				System.out.println("tu depasser le limite");
			}
	}
	void Supprim_doc (int num) {
		boolean test=false;
		int i=0;
		while (test==false && i<getNombre_documents()-1 ) {
			if (listdoc[i].id==num) {
				test=true;
		}
			else {
				i++;
			}
	}
		if (test==true) {
			for (int j=i; j<getNombre_documents();j++) {
				listdoc[j]=listdoc[j+1];
			}
			listdoc[getNombre_documents()-1] = null;
			setNombre_documents(getNombre_documents() - 1);	}
	}
	public int getNombre_documents() {
		return Nombre_documents;
	}
	void Inventaire_doc ( ) {
		for (int i=0;i<getNombre_documents();i++) {
			this.listdoc[i].Edition();
		}
	}
	bibliothèque liste_livre() {
		bibliothèque livrebi= new bibliothèque(Capacité);
		for (int i=0;i<getNombre_documents();i++)
		if (listdoc[i] instanceof livres) {
			livres liv = (livres) listdoc[i];
			livrebi.Ajout_doc(liv);
		}
		return livrebi;
		
	}
	bibliothèque liste_article() {
		bibliothèque articlebi= new bibliothèque(Capacité);
		for (int i=0;i<getNombre_documents();i++)
		if (listdoc[i] instanceof articles) {
			articles art = (articles) listdoc[i];
			articlebi.Ajout_doc(art);
		}
		return articlebi;
		
	}
	bibliothèque liste_périodiques() {
		bibliothèque periobi= new bibliothèque(Capacité);
		for (int i=0;i<getNombre_documents();i++)
		if (listdoc[i] instanceof périodiques) {
			périodiques art = (périodiques) listdoc[i];
			periobi.Ajout_doc(art);
		}
		return periobi;
		
	}
	bibliothèque liste_documentsimple() {
		bibliothèque docbi= new bibliothèque(Capacité);
		for (int i=0;i<getNombre_documents();i++)
		if (listdoc[i] instanceof documents) {
			documents art = (documents) listdoc[i];
			docbi.Ajout_doc(art);
		}
		return docbi;
		
	}
	public void setNombre_documents(int nombre_documents) {
		Nombre_documents = nombre_documents;
	}
}
	
