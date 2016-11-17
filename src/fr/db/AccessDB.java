package fr.db;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class AccessDB {
	
	private Connection cxt;
	
	private String driver;
	private String url;
	private String login;
	private String pwd;
	
	public AccessDB(String driver, String url, String login, String pwd) throws  SQLException{
		
		this.driver = driver;
		this.url = url;
		this.login = login;
		this.pwd = pwd;
		try {
			Class.forName(this.driver);
		} catch (Throwable cnf) {
			throw new SQLException("Impossible de charger le driver");
		}
	}
	
	public Connection open() throws SQLException{
		this.cxt = DriverManager.getConnection(this.url, this.login, this.pwd);
		return this.cxt;
	}
	

	
	public void seDeconnecter() throws SQLException{
		this.cxt.close();
	}
	
	

}
