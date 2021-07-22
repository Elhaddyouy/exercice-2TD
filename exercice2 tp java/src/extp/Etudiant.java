package extp;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;


public class Etudiant {
	extp.identifiant identite ;
	extp.Formationex formation ;
	Map<String, ArrayList<Integer>> note = new HashMap<String , ArrayList<Integer>>();
	public Etudiant(identifiant identite, Formationex formation) {
		super();
		this.identite = identite;
		this.formation = formation;
		this.note = note;
	}
	public extp.identifiant getIdentite() {
		return identite;
	}
	public void setIdentite(extp.identifiant identite) {
		this.identite = identite;
	}
	public extp.Formationex getFormation() {
		return formation;
	}
	public void setFormation(extp.Formationex formation) {
		this.formation = formation;
	}
	public Map<String, ArrayList<Integer>> getNote() {
		return note;
	}
	public void setNote(Map<String, ArrayList<Integer>> note) {
		this.note = note;
	}
	public void ajouter_matiere(String matiere) {
		//tester si la matiere existe deja
		if(this.note.containsKey(matiere)) {
			System.out.println("impossibe d'ajouter cette matiére existe déja");
		}
		else {
		ArrayList<Integer> n= new ArrayList<>();
	
		n.add((int) 0F);
		this.note.put(matiere, n);
	}}
	
	
	
	public void ajouterNote(int  not, String matiere) {
		
			ArrayList<Integer> n = note.get(matiere);
			n=this.note.get(matiere);
			
			  n.add(not);
			  this.note.replace(matiere, n);
			   }
	public float moyennematiere(String matiere) {
		ArrayList<Integer> n = note.get(matiere);
		n=this.note.get(matiere);
        float s=0,moy;
       for(int i=0;i<n.size();i++) {
    	   s+=n.get(i);
       }
       moy=s/(n.size()-1);
		return moy;
	}
	
	public float moyenne_generale() {
        float s=0,moyg;
       int i;int somcof=0;
		 Set<Map.Entry<String, ArrayList<Integer>>> setEntry=note.entrySet();
            
	       Iterator<Map.Entry<String, ArrayList<Integer>>> itEntry=setEntry.iterator();
	       while (itEntry.hasNext()) {
	    	Map.Entry<String, ArrayList<Integer>> entry=itEntry.next();
		   for(i=0;i<entry.getValue().size();i++) {
            s+=moyennematiere(entry.getKey())*this.formation.getCoff(entry.getKey());
            somcof+=this.formation.getCoff(entry.getKey());
		   }}
	       moyg=s/somcof;
	       
	return moyg;
	 
	}
	@Override
	public String toString() {
		return "Etudiant [identite=" + identite + ", formation=" + formation + ", note=" + note + "]";
	}
	public static boolean contains(Etudiant e) {
		// TODO Auto-generated method stub
		return false;
	}
	public static void add(Etudiant e) {
		// TODO Auto-generated method stub
		
	}

}
	