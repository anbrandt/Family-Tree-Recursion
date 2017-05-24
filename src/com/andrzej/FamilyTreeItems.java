package com.andrzej;

import java.util.Iterator;
import java.util.Map;
import java.util.Set;

/**
 * Created by andrzej on 23.05.17.
 */
public class FamilyTreeItems {
	private Object surname;
	private Set<FamilyTreeItems> children;

	public FamilyTreeItems(Object surname) {
		this.surname = surname;

	}

	public void setSurname(Object surname) {
		this.surname = surname;
	}

	public void setChildren(Set<FamilyTreeItems> children) {
		this.children = children;
	}

	public Object getSurname() {
		return surname;
	}

	public Set<FamilyTreeItems> getChildren() {
		return children;
	}



}
