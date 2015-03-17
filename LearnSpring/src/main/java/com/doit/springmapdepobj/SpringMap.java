package com.doit.springmapdepobj;

import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

import com.doit.springlistdepobj.Answer;

public class SpringMap {
	int id;
	String question;
	Map<User,Answer> answers;
	public SpringMap(int id, String question, Map<User, Answer> answers) {
		super();
		this.id = id;
		this.question = question;
		this.answers = answers;
	}

	
		
	
	public Map<User, Answer> getAnswers() {
		return answers;
	}
	public void setAnswers(Map<User, Answer> answers) {
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
	public String getQuestion() {
		return question;
	}
	public void setQuestion(String question) {
		this.question = question;
	}
	
	public void displayInfo()
	{
		System.out.println("inside displayinnfo");
		Set<Entry<User, Answer>> entries= answers.entrySet();
		Iterator<Entry<User, Answer>> iterator = entries.iterator();
		while(iterator.hasNext())
		{
			Entry<User, Answer> entry= iterator.next();
			Answer answer= entry.getValue();
			User user= entry.getKey();
			System.out.println("answer :" + answer);
			System.out.println("user:" + user);
		}
	}

}
