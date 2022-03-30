package com.hcl.manager;

import java.util.ArrayList;
import java.util.Scanner;

public class User {

	@SuppressWarnings({ "resource" })
	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		Movies movie1 = new Movies("commingSoonMovies", 1,"Game Night","2011","comedy, drama");
		Movies movie2 = new Movies("commingSoonMovies", 2, "The Lodgers","2012","action, thriller");
		Movies movie3 = new Movies("commingSoonMovies", 3,"sultan","2011","action");
		Movies movie4 = new Movies("commingSoonMovies", 4,"The Chamber","2013","horror");
		Movies movie5 = new Movies("moviesInTheater", 5," Bangalore Days","2010","drama");
		Movies movie6 = new Movies("moviesInTheater", 6, "haider","2010","drama");
		Movies movie7 = new Movies("moviesInTheater", 7,"Lage Raho Munna Bhai","2010","comedy");
		Movies movie8 = new Movies("moviesInTheater", 8,"barfi","2010","adventure");
		Movies movie9 = new Movies("topRatedIndian",9,"My Name Is Khan","2010","drama");
		Movies movie10 = new Movies("topRatedIndian",10, "laksya","2010","war");
		Movies movie11 = new Movies("topRatedIndian",11,"Zindagi Na Milegi Dobara","2010","comedy");
		Movies movie12 = new Movies("topRatedIndian",12,"Rock On","2010","music");
		Movies movie13 = new Movies("topRatedMovies",13,"Fargo","2010","drama");
		Movies movie14 = new Movies("topRatedMovies",14, "Harry Potter ","2010","adventure");
		Movies movie15 = new Movies("topRatedMovies",15,"English Vinglish","2010","comedy");
		Movies movie16 = new Movies("topRatedMovies",16,"sarkar","2010","politics");
		
		ArrayList<Movies> movies=new ArrayList<>();
	
		movies.add(movie1);
		movies.add(movie2);
		movies.add(movie3);
		movies.add(movie4);	
		movies.add(movie5);
		movies.add(movie6);
		movies.add(movie7);
		movies.add(movie8);
		movies.add(movie9);
		movies.add(movie10);
		movies.add(movie11);
		movies.add(movie12);
		movies.add(movie13);
		movies.add(movie14);
		movies.add(movie15);
		movies.add(movie16);		
		
		while(true) {
			
			System.out.println("1. Search the movies type\n"
					+ "2. see all the movies basic information\n"
					+ "3. add the movie into favorites list\n"
					+ "4. view my favorite list\n"
					+ "5. remove a movie from the favorite list\n");
			
			System.out.println("enter your choice:");
			int choice=scanner.nextInt();
			FavoriteMoviesFactory favorite=new FavoriteMoviesFactory();
			
			switch(choice) {
			case 1:
				System.out.println("1. Coming soon\r\n"
						+ "2. Movies in theaters\r\n"
						+ "3. top rated Indian\r\n"
						+ "4. top rated movies\r\n");
				
				System.out.println("enter your nextchoice");
				int nextchoice=scanner.nextInt();
				
				switch(nextchoice) {
				case 1:
					System.out.println("List of comming soon movies");
					int index=0;
					for (Movies m : movies) {
						if(movies.get(index).moviesType.equals("commingSoonMovies")) {
							m.moviesInfo();
							index++;
						}
					}
					break;
				case 2:
					System.out.println("List of movies In Theater");
					int index1=0;
					for (Movies m : movies) {
						if(movies.get(index1).moviesType.equals("moviesInTheater")) {
							m.moviesInfo();
							index1++;
						}
					}
					break;
				case 3:
					System.out.println("List of top Rated Indian movies");
					int index3=0;
					for (Movies m : movies) {
						if(movies.get(index3).moviesType.equals("topRatedIndian")) {
						   m.moviesInfo();
						   index3++;
						}
					}
					break;
				case 4:
					System.out.println("List of top Rated Movies movies");
					int index4=0;
					for (Movies m : movies) {
						if(movies.get(index4).moviesType.equals("topRatedMovies")) {
							m.moviesInfo();
							index4++;
						}
					}
					break;
				default:
					System.out.println("entered wrong choice.!");
				}
				break;
				
			case 2:
				System.out.println("List of all movies");
				for (Movies m : movies) {
					m.moviesInfo();
				}
				break;
			case 3:
				favorite.addMovieInFevourite(movies);
				break;
			case 4:
				favorite.viewMovieInFevourite();
				break;
			case 5:
				favorite.removeMovieFromFevourite();
				break;
			default:
				System.out.println("entered wrong choice.!");
			}
			System.out.println();
		}

	}

}



