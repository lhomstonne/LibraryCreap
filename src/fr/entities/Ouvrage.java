package fr.entities;

import java.sql.Date;

public class Ouvrage {
	
	private int id;
	private String section;
	private String type_ouvrage;
	private String titre;
	private Date date_edition;
	private int id_parution;
	private int id_collection;
	private int id_auteur;
	private int id_editeur;
	
	
	public Ouvrage(){
		
	}
	
	public Ouvrage(String section, String type_ouvrage, String titre, Date date_edition){
		this.section = section;
		this.type_ouvrage = type_ouvrage;
		this.titre = titre;
		this.date_edition = date_edition;
	}
	
	public Ouvrage(String section, String type_ouvrage, String titre, Date date_edition, int id_parution, int id_collection, int id_auteur, int id_editeur){
		this.section = section;
		this.type_ouvrage = type_ouvrage;
		this.titre = titre;
		this.date_edition = date_edition;
		this.id_parution = id_parution;
		this.id_collection = id_collection;
		this.id_auteur = id_auteur;
		this.id_editeur =id_editeur;
	}
	
	public Ouvrage(String section, String type_ouvrage, String titre, Date date_edition, int id_parution, int id_collection, int id_auteur, int id_editeur, int id){
		this.section = section;
		this.type_ouvrage = type_ouvrage;
		this.titre = titre;
		this.date_edition = date_edition;
		this.id_parution = id_parution;
		this.id_collection = id_collection;
		this.id_auteur = id_auteur;
		this.id_editeur =id_editeur;
		this.id = id;
	}

	public Ouvrage(int id, String section, String type_ouvrage, String titre, Date date_edition){
		this.id = id;
		this.section = section;
		this.type_ouvrage = type_ouvrage;
		this.titre = titre;
		this.date_edition = date_edition;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getSection() {
		return section;
	}

	public void setSection(String section) {
		this.section = section;
	}

	public String getType_ouvrage() {
		return type_ouvrage;
	}

	public void setType_ouvrage(String type_ouvrage) {
		this.type_ouvrage = type_ouvrage;
	}

	public String getTitre() {
		return titre;
	}

	public void setTitre(String titre) {
		this.titre = titre;
	}

	public Date getDate_edition() {
		return date_edition;
	}

	public void setDate_edition(Date date_edition) {
		this.date_edition = date_edition;
	}

	public int getId_parution() {
		return id_parution;
	}

	public void setId_parution(int id_parution) {
		this.id_parution = id_parution;
	}

	public int getId_collection() {
		return id_collection;
	}

	public void setId_collection(int id_collection) {
		this.id_collection = id_collection;
	}

	public int getId_auteur() {
		return id_auteur;
	}

	public void setId_auteur(int id_auteur) {
		this.id_auteur = id_auteur;
	}

	public int getId_editeur() {
		return id_editeur;
	}

	public void setId_editeur(int id_editeur) {
		this.id_editeur = id_editeur;
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Ouvrage [id=");
		builder.append(id);
		builder.append(", section=");
		builder.append(section);
		builder.append(", type_ouvrage=");
		builder.append(type_ouvrage);
		builder.append(", titre=");
		builder.append(titre);
		builder.append(", date_edition=");
		builder.append(date_edition);
		builder.append(", builder=");
		builder.append(builder);
		builder.append("]");
		return builder.toString();
	}
	
	

}
