import java.util.ArrayList;

public class FilmProgram {
private ArrayList<Film> list;
	
	public FilmProgram() {
		list = new ArrayList<Film>();
	}
	
	public void addFilm(Film theFilm)
    {
        list.add(theFilm);
    }
	
	public ArrayList<Film> getList(){
		return list;
	}
	
	public ArrayList<Film> candidateFilms(){
		ArrayList<Film> oscarList = new ArrayList<Film>(); 
		for (Film f:list) {
			if(f.isCandicay()) {
				oscarList.add(f);
			}
		}
		return oscarList;
	}
	
	public ArrayList<Film> monthFilms(int month){
		ArrayList<Film> monthList = new ArrayList<Film>();
		for (Film f:list) {
			String subMonth = f.getShowDate().substring(3,5);
			if(Integer.parseInt(subMonth)==month) {
				monthList.add(f);
			}
		}	
		return monthList;
	}
	
	public float filmsMeanTime() {
		float avg = 0 ;
		int sum = 0;
		int lenght = 0;
		for (Film f:list) {
			lenght++;
			sum += f.getPlayingTime();
			
		}
		avg = sum/lenght;
		return avg;
	}
	
	public void findFilm(String search) {
		boolean found = false;
		for (Film f:list) {
			if (search.equals(f.getTitle())) {
				f.showFilm();
				found = true;
				break;
			}
		}
		if(!found){
			System.out.println("The film "+search+" does not belong to the collection");
		}
	}
	
	public void showFilms(ArrayList<Film> alist) {
		for (Film f:alist) {
			f.showFilm();
		}
	}
}
