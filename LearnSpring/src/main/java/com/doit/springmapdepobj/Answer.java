package com.doit.springmapdepobj;

public class Answer {
	int id;
	String name;
	String ans;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	@Override
	public String toString() {
		return "Answer [id=" + id + ", name=" + name + ", ans=" + ans
				+ ", getId()=" + getId() + ", getName()=" + getName()
				+ ", getAns()=" + getAns() + ", getClass()=" + getClass()
				+ ", hashCode()=" + hashCode() + ", toString()="
				+ super.toString() + "]";
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getAns() {
		return ans;
	}
	public void setAns(String ans) {
		this.ans = ans;
	}
	public Answer()
	{
		
	}
	public Answer(int id, String name, String ans) {
		super();
		this.id = id;
		this.name = name;
		this.ans = ans;
	}

}
