package fr.dao;

import java.sql.Connection;

public abstract class Dao<T> {
	
	public abstract T read(int id);
	
	public abstract void create(T obj);
	
	public abstract T update(T obj);
	
	public abstract void delete(T obj);

}
