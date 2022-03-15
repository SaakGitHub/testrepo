package com.saak.maven.MavenTest;

import java.util.Iterator;
import java.util.Set;

public class SampleBean {

	private Set s;

	public Set getS() {
		return s;
	}

	public void setS(Set s) {
		this.s = s;
	}
	
	public void pritSet() {
		Iterator itr = s.iterator();
		while (itr.hasNext()) {
			System.out.println(itr.next());
			
		}
	}
	
	
}
