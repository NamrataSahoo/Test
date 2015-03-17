package com.doit.springlistdepobj;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class SpringList {
	int id;
	String question;
	List<Answer> answers;
	
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
	
	
	public List<Answer> getAnswers() {
		return answers;
	}
	public void setAnswers(List<Answer> answers) {
		this.answers = answers;
	}
	public SpringList()
	{
		
	}
	
	public SpringList(int id, String question, List<Answer> answers) {
		super();
		this.id = id;
		this.question = question;
		this.answers = answers;
	}
	public void displayInfo()
	{
		System.out.println("inside DI");
		//List<Answer> answers;
		Iterator iterator= answers.iterator();
		for(int i=0; i<answers.size();i++)
		{
			System.out.println("value answer:  " + answers.get(i).ans + "value name:   "+ answers.get(i).name + "value id:  " + answers.get(i).id);
		}
		while(iterator.hasNext())
		{
			System.out.println("inside displayinnfo" + iterator.next());
			//System.out.println("DI"+ (Answer)iterator.next());
		}
	}

}
