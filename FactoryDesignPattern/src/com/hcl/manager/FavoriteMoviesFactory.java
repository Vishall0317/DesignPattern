package com.hcl.manager;

import java.util.ArrayList;
import java.util.Scanner;
import java.util.TreeMap;

public class FavoriteMoviesFactory implements FavoriteMovies{

	static Scanner scanner = new Scanner(System.in);
	
	/**
	 * create tree-map for storing the favorite movies
	 */
	
	static TreeMap<Integer, String> m=new TreeMap<>();
	
	/**
	 * create method to add the movie into favorites list
	 */
	
	public void addMovieInFevourite(ArrayList<Movies> movies) {
		
		System.out.println("Enter movie id which you want to add in fevourite");
		int id=scanner.nextInt();
		
		m.put(movies.get(id-1).getId, movies.get(id-1).getName );
		
		System.out.println("*******movie added successfully!*****");
		
	}

	/**
	 * create method to view my favorite list.
	 */

	public void viewMovieInFevourite() {
		
		System.out.println(m);
		
	}
	
	/**
	 * create method to remove a movie from the favorite list.
	 */
	
	public void removeMovieFromFevourite() {
		
		System.out.println("Enter movie id which you want to remove from fevourite");
		int id=scanner.nextInt();
	
		m.remove(id);
		
		System.out.println("*******movie removed successfully!*****");

	}

}

