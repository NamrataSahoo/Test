package com.doit.springmap;

import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class SpringMap {
	int id;
	
	public SpringMap(int id, String question, Map<String, String> answers) {
		super();
		this.id = id;
		this.question = question;
		this.answers = answers;
	}
	public SpringMap()
	{
		
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	String question;
	Map<String,String> answers;
	public String getQuestion() {
		return question;
	}
	public void setQuestion(String question) {
		this.question = question;
	}
	
	public Map<String, String> getAnswers() {
		return answers;
	}
	public void setAnswers(Map<String, String> answers) {
		this.answers = answers;
	}
	public void displayInfo()
	{
		System.out.println("inside displayinnfo");
		Set<Entry<String, String>> entries= answers.entrySet();
		Iterator<Entry<String, String>> iterator=entries.iterator();
		while(iterator.hasNext())
		{
			Entry<String,String> entry= iterator.next();
			System.out.println(entry.getKey() + "  " + entry.getValue()) ;
		}
	}

}
