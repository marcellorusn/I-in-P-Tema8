public class Commercial extends Project {
	int nrEchipe;
	long fonduriMarketing;
	String deadline;

	public Commercial(String titlu, String obiectiv, long fonduri, Member manager, int nrEchipe, String deadline) {
		super(titlu, obiectiv, fonduri, manager);
		this.nrEchipe = nrEchipe;
		this.deadline = deadline;
		this.fonduriMarketing = fonduri / 2;
	}

	@Override
	public double getRisk() {
		return (nrEchipe * 3.0) / count / getFonduri() - fonduriMarketing;
	}

	@Override
	public String toString() {

		return super.toString() + "\n" + "Numar Echipe: " + nrEchipe + "\n" + "Deadline: " + deadline + "\n"
				+ "Fonduri Marketing: " + fonduriMarketing;
	}
}