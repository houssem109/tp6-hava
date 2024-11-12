package tp6;

public class documents {
	
	protected String  titre ;
	protected int id;
	protected int nb_page;
	
	public void Edition() {
		
		System.out.println("type : document || titre :"+titre+" || id : "+id+" || nombre de pages : "+nb_page);		
	}
	public documents(String titre,int id,int nb_page) {
		this.titre=titre;
		this.id=id;
		this.nb_page=nb_page;
	}
	
}
