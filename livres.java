package tp6;

public class livres extends articles {

		public String nom_edit;
		
		
		public livres(String titre, int id, int nb_page, String nom_auteur, String nom_edit) {
			super(titre, id, nb_page, nom_auteur);
			this.nom_edit=nom_edit;
		}
		public void Edition() {
			System.out.println("type : livre || titre :"+titre+" || id : "+id+" || nombre de pages : "+nb_page+"nom de l'auteur : "+nom_auteur);		
			System.out.println("nom de l'editeur : "+nom_edit);		
			
		}
}
