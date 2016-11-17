package fr;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Timestamp;
import java.text.SimpleDateFormat;
import java.util.Date;

import fr.dao.OuvrageDao;
import fr.db.AccessDB;
import fr.entities.Lecteurs;
import fr.entities.Ouvrage;

public class Run {
	
	private final static String driver = "com.mysql.jdbc.Driver";
	private final static String url = "jdbc:mysql://localhost:3306/bibliotheque";
	private final static String login = "root";
	private final static String pwd = "root";

	public static void main(String[] args) {
		
		AccessDB  adb = null;
		ResultSet resultat = null;
		OuvrageDao ouvragedao = null;
		Ouvrage ouvrage = null;
		Lecteurs lecteurs = null;
		
		try{
			adb = new AccessDB(driver, url, login, pwd);
			ouvragedao = new OuvrageDao(adb);
			//Lecture d'ouvrage par id
			ouvrage = ouvragedao.read(4);
			System.out.println(ouvrage.toString());
			//transformation de la date util en date sql
			java.util.Date utilDate = new java.util.Date();
			java.sql.Date parsedDate = new java.sql.Date(utilDate.getTime());
			System.out.println(parsedDate.getTime());
			//ajout d'un ouvrage
			ouvrage = new Ouvrage("adulte", "periodique", "Voix du nord", parsedDate , 2, 1, 1, 3);
			ouvragedao.create(ouvrage);
			System.out.println(ouvrage);
			
			//modification d'un ouvrage
			ouvrage = new Ouvrage("adulte", "periodique", "Voix du nord", parsedDate , 1, 2, 6, 2, 13);
			ouvragedao.update(ouvrage);
			System.out.println(ouvrage);
		}catch(SQLException e){
			e.printStackTrace();
		}

	}

}
