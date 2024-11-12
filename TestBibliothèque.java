package tp6;

public class TestBibliothèque {
    public static void main(String[] args) {
		
    	bibliothèque bi =new bibliothèque(100);
    	
    	articles a1=new articles("idk",1,2,"idk");
    	articles a2=new articles("fi",2,5,"fi");
    	documents d1=new documents("iset", 3, 999999);
    	documents d2=new documents("isetnabeul", 4, 999);
    	périodiques p= new périodiques("istc", 5, 10, "sesson");
    	livres l=new livres("fa", 6, 20, "fo", "fi");
    	
    	bi.Ajout_doc(a1);
    	bi.Ajout_doc(a2);
    	bi.Ajout_doc(d1);
    	bi.Ajout_doc(d2);
    	bi.Ajout_doc(p);
    	bi.Ajout_doc(l);

        System.out.println(bi.getNombre_documents());
        System.out.println(bi.getCapacité());

        System.out.println("------------------------------------------------");
        bi.Inventaire_doc();        
        System.out.println("------------------------------------------------");

        bibliothèque li=bi.liste_livre();
        bibliothèque per=bi.liste_périodiques();
        bibliothèque art=bi.liste_article();
        bibliothèque doc=bi.liste_documentsimple();
        li.Inventaire_doc();  
        System.out.println("------------------------------------------------");
        per.Inventaire_doc();  
        System.out.println("------------------------------------------------");
        art.Inventaire_doc();  
        System.out.println("------------------------------------------------");
        doc.Inventaire_doc();  
        System.out.println("------------------------------------------------");

	}
}
