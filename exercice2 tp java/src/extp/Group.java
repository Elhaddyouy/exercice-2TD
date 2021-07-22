package extp;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

import extp.Etudiant;

public class Group {
	ArrayList<Etudiant>tab=new ArrayList<Etudiant>();
	extp.Formationex formation ;
	
	
	public ArrayList<Etudiant> getTab() {
		return tab;
	}
	public void setTab(ArrayList<Etudiant> tab) {
		this.tab = tab;
	}
	public extp.Formationex getFormation() {
		return formation;
	}
	public void setFormation(extp.Formationex formation) {
		this.formation = formation;
	}
	
	
	public Group(ArrayList<Etudiant> tab, Formationex formation) {
		super();
		this.tab = tab;
		this.formation = formation;
	}
	@Override
	public String toString() {
		return "Group [tab=" + tab + ", formation=" + formation + "]";
	}
	public void AjouterEtudiant(Etudiant e) {
		
		if(!(Etudiant.contains(e))) {
			tab.add(e);
	}else {System.out.println("il exist deja dans le tableau des etudiants"); }

	}
	public void supprimer_etudiant(Etudiant e) {
		if(!(Etudiant.contains(e))) {
		this.tab.remove(e);
		}else {System.out.println("il n'exist pas dans le tableau des etudiants"); }
	}
	public float moyennematiere(String matiere) {
		float m=0;
	    for(int i=0;i<this.tab.size();i++) {
		m+=this.tab.get(i).moyennematiere(matiere);
		
	}
	return m/this.tab.size();
	}
	public float moyennegenerale() {
		float mg=0;
	    for(int i=0;i<this.tab.size();i++) {
		mg+=this.tab.get(i).moyenne_generale();
		
	}
	    return mg/this.tab.size();
	}
	
	
	
	public ArrayList<Etudiant>Tri_merite(){
		Collections.sort(this.tab,new Comparator<Etudiant>() {
			public int compare(Etudiant e1, Etudiant e2) {
				// TODO Auto-generated method stub
				
				if(e1.moyenne_generale()>e2.moyenne_generale())
					return 1;
				 else 
					 if(e1.moyenne_generale()<e2.moyenne_generale())
				return -1;
				   return 0;
			}
			
		});
		return this.tab;
	}
		

}

