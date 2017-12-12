package coreservlets;

import java.util.Random;

import javax.faces.bean.ManagedBean;

@ManagedBean
public class Navigator {
	
	private String[] resultPages =
		{ 
		"page1"
		, 
		"page2"
		, 
		"page3"
		};
		public String choosePage() {
			System.out.println(resultPages[new Random().nextInt(3)]);
		return(resultPages[new Random().nextInt(3)]);
		}

}
