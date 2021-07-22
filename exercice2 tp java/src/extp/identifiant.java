package extp;

public class identifiant {
	private String NIP ;
	private String prenom;
	private String nom ;
	public String getNIP() {
		return NIP;
	}
	public void setNIP(String nIP) {
		NIP = nIP;
	}
	public String getPrenom() {
		return prenom;
	}
	public void setPrenom(String prenom) {
		this.prenom = prenom;
	}
	public String getNom() {
		return nom;
	}
	public void setNom(String nom) {
		this.nom = nom;
	}
	public identifiant(String nIP, String prenom, String nom) {
		super();
		NIP = nIP;
		this.prenom = prenom;
		this.nom = nom;
	}
	@Override
	public String toString() {
		return "identifiant [NIP=" + NIP + ", prenom=" + prenom + ", nom=" + nom + "]";
	}
	
	
}
