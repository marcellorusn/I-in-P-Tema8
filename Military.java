public class Military extends Project {
	String parola;
	String deadline;

	public Military(String titlu, String obiectiv, long fonduri, Member manager, String parola, String deadline) {
		super(titlu, obiectiv, fonduri, manager);
		this.parola = parola;
		this.deadline = deadline;
	}

	public String toString() {
		return super.toString() + "\n" + "Parola: " + parola + "\n" + "Deadline: " + deadline;
	}

	@Override
	public double getRisk() {
		return (double) count / parola.length() / getFonduri();
	}
}