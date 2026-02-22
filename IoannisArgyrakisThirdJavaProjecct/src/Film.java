public class Film {
	private String title;
	private String director;
	private int playingTime;
	private boolean candidacy;
	private String showDate;
	
	public Film (String title, String director,
			int playingTime, String showDate,boolean candidacy) {
		this.title=title;
		this.director=director;
		this.playingTime=playingTime;
		this.candidacy=candidacy;
		this.showDate=showDate;
	}
	
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getDirector() {
		return director;
	}
	public void setDirector(String director) {
		this.director = director;
	}
	public int getPlayingTime() {
		return playingTime;
	}
	public void setPlayingTime(int playingTime) {
		playingTime = playingTime;
	}
	public boolean isCandicay() {
		return candidacy;
	}
	public void setcCndidacy(boolean candidacy) {
		this.candidacy = candidacy;
	}
	public String getShowDate() {
		return showDate;
	}
	public void setShowDate(String showDate) {
		this.showDate = showDate;
	}
	
	public void showFilm () {
		System.out.println(title+", Director "+director);
		System.out.println(playingTime+" minutes");
		System.out.println(showDate);
		if (candidacy) {
			System.out.println("Candidatefor Oscar!");
		}
	}
}
