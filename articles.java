package tp6;

public class articles extends documents {
	 
	
	protected String nom_auteur;
	public articles(String titre, int id, int nb_page, String nom_auteur) {
		super(titre, id, nb_page);
		this.nom_auteur=nom_auteur;
	}



	public void Edition() {
		System.out.println("type : article || titre :"+titre+" || id : "+id+" || nombre de pages : "+nb_page);		
		System.out.println("nom de l'auteur : "+nom_auteur);		
		
	}
}
