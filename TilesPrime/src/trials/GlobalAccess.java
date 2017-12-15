package trials;

import javax.faces.bean.ApplicationScoped;
import javax.faces.bean.ManagedBean;

@ApplicationScoped
@ManagedBean(name = "globalAccess", eager = true)
public class GlobalAccess {

	private int numerOfSessions;

	public int getNumerOfSessions() {
		return numerOfSessions;
	}

	public void setNumerOfSessions(int numerOfSessions) {
		this.numerOfSessions = numerOfSessions;
	}

	public void incrementNumberOfSessions() {
		numerOfSessions++;
	}

	public GlobalAccess() {
	}

}
