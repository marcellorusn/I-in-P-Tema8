import java.util.ArrayList;
import java.util.List;

public class InvestmentCompany {
	List<Project> proiecte = new ArrayList<>();

	public void addProject(Project p) {
		proiecte.add(p);
	}

	public Project getBestInvestment() {
		Project best = proiecte.get(0);
		for (Project p : proiecte) {
			if (p.getRisk() < best.getRisk()) {
				best = p;
			}
		}
		return best;
	}

	public static void main(String[] args) {
		Member manager1 = new Member("Amalia", 35);
		Member manager2 = new Member("Elisei", 40);
		Member manager3 = new Member("Marius", 30);

		Member m1 = new Member("Iosif", 28);
		Member m2 = new Member("Irina", 27);

		Commercial c = new Commercial("Comercial", "Vanzari", 100856, manager1, 2);
		c.addMember(m1);
		c.addMember(m2);

		Military m = new Military("Militar", "Siguranta", 80000, manager2, "parola123", "2025-04-14");
		m.addMember(m1);

		OpenSource os = new OpenSource("OpenSource", "Educatie", 204659, manager3, "mailing@list.com");
		os.addMember(m1);
		os.addMember(m2);

		InvestmentCompany firma = new InvestmentCompany();
		firma.addProject(c);
		firma.addProject(m);
		firma.addProject(os);

		Project best = firma.getBestInvestment();
		System.out.println("Cel mai bun proiect este: " + best.getTitlu() + ", risc: " + best.getRisk());
	}
}