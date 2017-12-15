package secured;

import java.io.IOException;

import javax.faces.bean.ManagedBean;
import javax.faces.context.FacesContext;

@ManagedBean
public class AccessChecker {
	
	private int id;
	
	public void check() {
	    if (id ==0) {
	        FacesContext context = FacesContext.getCurrentInstance();
	        try {
				context.getExternalContext().responseSendError(401, "Foo parameter is required");
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
	        context.responseComplete();
	    }
		
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

}
