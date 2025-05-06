import java.util.ArrayList;
import java.util.List;

public abstract class Project implements Risky {
	private String titlu;
	private String obiectiv;
	private long fonduri;
	private Member manager;
	private List<Member> membri = new ArrayList<>();
	int count = 0;

	public Project(String titlu, String obiectiv, long fonduri, Member manager) {
		this.titlu = titlu;
		this.obiectiv = obiectiv;
		this.fonduri = fonduri;
		this.manager = manager;
	}

	public void addMember(Member m) {
		if (count < 15) {
			membri.add(m);
			count++;
		}
	}

	public String getTitlu() {
		return titlu;
	}

	public long getFonduri() {
		return fonduri;
	}

	public Member getManager() {
		return manager;
	}

	@Override
	public abstract double getRisk();
}