import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		
		FilmProgram filmProg = new FilmProgram();
		
		Scanner input = new Scanner(System.in);
		
		while (true){
		System.out.println("Give title?");
		String title = input.nextLine();
		
		System.out.println("Give director?");
		String director = input.nextLine();
		
		
		System.out.println("Give playing time?");
		int playingtime = input.nextInt();
		
		System.out.println("The film is candidate for Oscar? (true/false)");
		boolean candidacy = input.nextBoolean();
		input.nextLine(); //Clear the buffer
		
		System.out.println("Give show date? ");
		String showdate = input.nextLine();
		
		
		filmProg.addFilm(new Film(title,director,playingtime,showdate,candidacy));
		
		System.out.println("Continue? (y/n)");
		String answer = input.nextLine();
		
		if(answer.equals("n"))
			break;
		}
		System.out.println("\n");
		System.out.println("***** QUESTION b: show the list of all the films *****");
		filmProg.showFilms(filmProg.getList()); //b
		System.out.println("\n");
		System.out.println("***** QUESTION c: show the list of films that are candidate for OSCAR *****");
		filmProg.showFilms(filmProg.candidateFilms());//c
		System.out.println("\n");
		System.out.println("Give the month to see the program of films?");
		int month = input.nextInt();
		filmProg.showFilms(filmProg.monthFilms(month));
		input.nextLine(); //Clear the buffer
		System.out.println("The mean playing time of all the films in the collection is "+filmProg.filmsMeanTime());
		System.out.println("\n");
		System.out.println("***** QUESTION d: search for films *****");
		for(int i = 0; i <= 1; i++) {
			System.out.println("Give the title of the film for searching?");
			String search = input.nextLine();
			filmProg.findFilm(search);
		}
	}

	
}

