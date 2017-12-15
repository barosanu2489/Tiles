package trials;

import javax.annotation.PostConstruct;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ManagedProperty;

@ManagedBean(name="someSession")
public class SomeSession {
	

	@ManagedProperty(value="#{globalAccess}")
	private GlobalAccess globalAccess;
	
	public void setGlobalAccess(GlobalAccess globalAccess) {
		this.globalAccess = globalAccess;
	}

	public SomeSession() {
	}
	
	@PostConstruct
	public void init() {
		globalAccess.incrementNumberOfSessions();
		setNumberOfSessions(globalAccess.getNumerOfSessions());
	}
	
	public int getNumberOfSessions() {
		return numberOfSessions;
	}

	public void setNumberOfSessions(int numberOfSessions) {
		this.numberOfSessions = numberOfSessions;
	}

	private int numberOfSessions;
}
