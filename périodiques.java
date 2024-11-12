package tp6;

public class périodiques extends documents {
	
	private String fréquence;
	
	public périodiques(String titre, int id, int nb_page, String fréquence) {
		super(titre, id, nb_page);
		this.setFrequence(fréquence);
	}
	public void Edition() {
		
		System.out.println("type : périodique || titre :"+titre+" || id : "+id+" || nombre de pages : "+nb_page+"frequence"+fréquence);		
	}

	public String getFrequence() {
		return fréquence;
	}

	public void setFrequence(String fréquence) {
		this.fréquence = fréquence;
	}
	

}
