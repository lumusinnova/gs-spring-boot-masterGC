package com.websystique.springboot.model;
	
public class Ngram {

	private String ngram;
	
	private int numberRepetition;
	
	
	public Ngram( String uni, String bi, String tri){
		this.ngram = uni +"||"+ bi+"||"+tri;
		this.numberRepetition = 0;
	}

	public Ngram( String uni, String bi){
		this.ngram = uni +"||"+ bi;
		this.numberRepetition = 0;
	}

	public Ngram(String uni){
		this.ngram = uni;
		this.numberRepetition = 0;
	}
	
	
	public String getNgram() {
		return this.ngram;
	}

	public void addnumberRepetition() {
	  this.numberRepetition =  this.numberRepetition + 1;
	}

	public int getnumberRepetition(){
		return this.numberRepetition;
	}





}
