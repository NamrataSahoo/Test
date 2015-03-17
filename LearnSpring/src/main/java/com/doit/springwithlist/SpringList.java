package com.doit.springwithlist;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import com.doit.springlistdepobj.Answer;

public class SpringList {
	int id;
	public SpringList(int id, String question, List<String> answers) {
		super();
		this.id = id;
		this.question = question;
		this.answers = answers;
	}
	public SpringList()
	{
		
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	String question;
	List<String> answers;
	public String getQuestion() {
		return question;
	}
	public void setQuestion(String question) {
		this.question = question;
	}
	public List<String> getAnswers() {
		return answers;
	}
	public void setAnswers(List<String> answers) {
		this.answers = answers;
	}
	public void displayInfo()
	{
		System.out.println("inside displayinnfo");
		//List<String> answers= new ArrayList<>();
		Iterator iterator= answers.iterator();
		while(iterator.hasNext())
		{
			System.out.println("inside displayinnfo" + iterator.next());
			
		}
	}

}
