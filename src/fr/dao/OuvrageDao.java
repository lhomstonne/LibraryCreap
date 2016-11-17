package fr.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import fr.db.AccessDB;
import fr.entities.Ouvrage;

public class OuvrageDao extends Dao<Ouvrage>{
	private AccessDB adb = null;
	private Connection conn = null;
	
	
	public OuvrageDao(AccessDB adb){
		this.adb = adb;
	}
	
	public Ouvrage read(int id) {
		Ouvrage ouvrage = null;
		PreparedStatement request;
		ResultSet resultat;
		String req = "SELECT * FROM ouvrage where id = ? ";
		try {
			this.conn = this.adb.open();
			request = this.conn.prepareStatement(req);
			request.setInt(1,id);
			resultat = request.executeQuery();
			while(resultat.next()){
				ouvrage = new Ouvrage(resultat.getString("section"), resultat.getString("type_ouvrage"), resultat.getString("titre"), resultat.getDate("date_edition"));
			}
			
			return ouvrage;
		} catch (SQLException e) {

			e.printStackTrace();
		}finally {
			if(conn != null){
				try {
					conn.close();
					System.out.println("Connexion fermée");
				} catch (SQLException e) {

					e.printStackTrace();
				}
			}
		}
		return null;
	}

	@Override
	public void create(Ouvrage obj) {
		Ouvrage ouvrage = null;
		PreparedStatement request;
		ResultSet resultat;
		String req = "INSERT INTO ouvrage(section, type_ouvrage, titre, date_edition, id_parution, id_collection, id_auteur, id_editeur) values( ?, ?, ?, ?, ?, ?, ?, ?) " ;
		try {
			this.conn = this.adb.open();
			request = this.conn.prepareStatement(req);
			request.setString(1, obj.getSection());
			request.setString(2, obj.getType_ouvrage());
			request.setString(3, obj.getTitre());
			request.setDate(4, obj.getDate_edition());
			request.setInt(5, obj.getId_parution());
			request.setInt(6, obj.getId_collection());
			request.setInt(7, obj.getId_auteur());
			request.setInt(8, obj.getId_editeur());
			request.executeUpdate();
			System.out.println("Requête d'insert effectué avec comme section : " + obj.getSection() + " type_ouvrage : " + obj.getType_ouvrage() + " titre : " + obj.getTitre() + " date_edition : " + obj.getDate_edition() + " id_parution : " + obj.getId_parution() + " id_collection : " + obj.getId_collection() + " id_auteur : " + obj.getId_auteur() + " id_editeur : " + obj.getId_editeur() + "");
			
			
		} catch (SQLException e) {

			e.printStackTrace();
		}finally {
			if(conn != null){
				try {
					conn.close();
					System.out.println("Connexion fermée");
				} catch (SQLException e) {

					e.printStackTrace();
				}
			}
		}
		
	}

	@Override
	public Ouvrage update(Ouvrage obj) {
		Ouvrage ouvrage = null;
		PreparedStatement request;
		ResultSet resultat;
		String req = "UPDATE ouvrage SET section = ? , type_ouvrage = ?, titre = ?, date_edition = ?, id_parution = ?, id_collection = ?, id_auteur = ?, id_editeur = ? WHERE id = ?" ;
		try {
			this.conn = this.adb.open();
			request = this.conn.prepareStatement(req);
			request.setString(1, obj.getSection());
			request.setString(2, obj.getType_ouvrage());
			request.setString(3, obj.getTitre());
			request.setDate(4, obj.getDate_edition());
			request.setInt(5, obj.getId_parution());
			request.setInt(6, obj.getId_collection());
			request.setInt(7, obj.getId_auteur());
			request.setInt(8, obj.getId_editeur());
			request.setInt(9, obj.getId());
			request.executeUpdate();
			System.out.println("Requête d'insert effectué avec comme section : " + obj.getSection() + " type_ouvrage : " + obj.getType_ouvrage() + " titre : " + obj.getTitre() + " date_edition : " + obj.getDate_edition() + " id_parution : " + obj.getId_parution() + " id_collection : " + obj.getId_collection() + " id_auteur : " + obj.getId_auteur() + " id_editeur : " + obj.getId_editeur() + "");
			
			
		} catch (SQLException e) {

			e.printStackTrace();
		}finally {
			if(conn != null){
				try {
					conn.close();
					System.out.println("Connexion fermée");
				} catch (SQLException e) {

					e.printStackTrace();
				}
			}
		}
		return null;
	}

	@Override
	public void delete(Ouvrage obj) {
		// TODO Auto-generated method stub
		
	}
}
