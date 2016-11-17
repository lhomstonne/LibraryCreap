package fr.entities;

import java.sql.Date;

public class Lecteurs {
	
	private int id;
	private String nom;
	private String prenom;
	private Date datenaissance;
	
	public Lecteurs(){}
	
	public Lecteurs(String nom, String prenom, Date datenaissance){
		this.nom = nom;
		this.prenom = prenom;
		this.datenaissance = datenaissance;
	}
	
	public Lecteurs(int id, String nom, String prenom, Date datenaissance){
		this.id = id;
		this.nom = nom;
		this.prenom = prenom;
		this.datenaissance = datenaissance;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getNom() {
		return nom;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}

	public String getPrenom() {
		return prenom;
	}

	public void setPrenom(String prenom) {
		this.prenom = prenom;
	}

	public Date getDatenaissance() {
		return datenaissance;
	}

	public void setDatenaissance(Date datenaissance) {
		this.datenaissance = datenaissance;
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Lecteurs [id=");
		builder.append(id);
		builder.append(", nom=");
		builder.append(nom);
		builder.append(", prenom=");
		builder.append(prenom);
		builder.append(", datenaissance=");
		builder.append(datenaissance);
		builder.append("]");
		return builder.toString();
	}
	
	

}
