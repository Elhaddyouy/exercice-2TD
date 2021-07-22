package extp;

import java.util.ArrayList;
import java.util.HashMap;

public class testmain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	
		 identifiant i=new identifiant("L1234567", "ayoub","kenzi");
		identifiant i1=new identifiant("L1987654", "ossama", "elhaddyouy");
		Formationex  f=new Formationex(1);
		 HashMap<String,Integer> m;
		 
		 f.Ajoutermatiere("algebre",4);
		 f.Ajoutermatiere("analyse",3);
		 
		 Etudiant e1=new Etudiant(i , f);
         Etudiant e2=new Etudiant (i1, f);
        
		 e1.ajouter_matiere("anglais");    
		 e1.ajouter_matiere("francais");
		 e2.ajouter_matiere("anglais");
		 e2.ajouter_matiere("francais");
		  
        e1.ajouterNote(10 ,"anglais");
        e1.ajouterNote(15, "francais" );
        e1.ajouterNote( 19,"francais");
        e1.ajouterNote( 15,"francais");
        e1.ajouterNote(11,"anglais");
        e2.ajouterNote(18, "francais");
        e2.ajouterNote(10 , "francais");
        e2.ajouterNote( 10, "francais");
        e2.ajouterNote( 11 , "anglais");
         
         System.out.println(" La moyenne de l'etudiant 1 est ="+e1.moyennematiere("anglais"));
         System.out.println("La moyenne de l'etudiant 2 est ="+e2.moyennematiere("anglais"));
        
         ArrayList<Etudiant> n= new ArrayList<>();
      n.add(e1); 
       n.add(e2);
        
        Group grp=new Group(n, f);
        System.out.println("la moyenne generale de group"+grp.moyennegenerale());
        
       System.out.println( "tri par merite est :" +grp.Tri_merite());
       
      

	}

}
