package extp;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class Formationex {
	private String identfor ;
	Map<String, Integer> matiere = new HashMap<String , Integer>();
	public String getIdentfor() {
		return identfor;
	}
	public void setIdentfor(String identfor) {
		this.identfor = identfor;
	}
	

	public Map<String, Integer> getMatiere() {
		return matiere;
	}
	public void setMatiere(Map<String, Integer> matiere) {
		this.matiere = matiere;
	}
	
	public Formationex(String identfor, Map<String, Integer> matiere) {
		super();
		this.identfor = identfor;
		this.matiere = matiere;
	}
	public Formationex(int i) {
		// TODO Auto-generated constructor stub
	}
	public void Ajoutermatiere(String m, Integer n) {

		if(!(matiere.containsKey(m))) 
			{this.matiere.put(m, n);}
			
	else {System.out.println("il exist deja dans la liste des matieres");
		
	}
	}
		
	public void supprimermatiere(String  m , Integer n) {
		
		if (matiere.containsKey(m)) {matiere.remove(m, n);}
		}


	
	public int getCoff(String m) {
    	
	    int c=0;
	    	Set<Entry<String,Integer>> s=this.matiere.entrySet();
	    	 Iterator<Map.Entry<String,Integer>> i=s.iterator();
	                	while (i.hasNext()) {
	                		   Map.Entry<String,Integer> entry=i.next(); 
	                		   if(entry.getKey()==m) {
	                	        c=entry.getValue();}
	    }
	    	 return c;

	    }
}
