public class OpenSource extends Project {
	String mailingList;

	public OpenSource(String titlu, String obiectiv, long fonduri, Member manager, String mailingList) {
		super(titlu, obiectiv, fonduri, manager);
		this.mailingList = mailingList;
	}

	@Override
	public double getRisk() {
		return (double) count / getFonduri();
	}

	@Override
	public String toString() {
		return super.toString() + "\n" + "Mailing List: " + mailingList;
	}
}