package com.exam.model.exams;


import com.fasterxml.jackson.annotation.JsonIgnore;

import javax.persistence.*;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

@Entity
public class Quiz {
	// dead enum
	//begin
	enum Options{
		ONE(1),
	    TWO(2),
	    THREE(3),
	    FOUR(4);
		private final int value;

	    Options(int value) {
	        this.value = value;
	    }

	    public int getValue() {
	        return value;
	    }
	}
	//end
	
	//unused inner class
	//begin
	private class innerClass{
		private int a;
		public innerClass(int x) {
			this.a = x;
		}
	}
	//end

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private  long qid;
    private  String title;
    private  String description;
    private  boolean active=false;
    private String maxMarks;
    private  String noOfQuestions;
    @ManyToOne(fetch = FetchType.EAGER)
    private  Category category;
    
    @OneToMany(mappedBy = "quiz",cascade = CascadeType.ALL)
    @JsonIgnore
    private List<Result>results=new ArrayList<>();

    public List<Result> getResults() {
		return results;
	}

	public void setResults(List<Result> results) {
		this.results = results;
	}

	public Set<Question> getQuestions() {
        return questions;
    }

    public void setQuestions(Set<Question> questions) {
        this.questions = questions;
    }

    @OneToMany(mappedBy = "quiz",cascade = CascadeType.ALL)
    @JsonIgnore
    private Set<Question>questions =new HashSet<>();

    public long getQid() {
        return qid;
    }

    public void setQid(long qid) {
        this.qid = qid;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public boolean isActive() {
        return active;
    }

    public void setActive(boolean active) {
        this.active = active;
    }

    public String getMaxMarks() {
        return maxMarks;
    }

    public void setMaxMarks(String maxMarks,int marks){ //unused parameter 'marks'
        //unused local variables

        // Primitive types
        byte b = 1;
        short s = 2;
        int i = 10;
        long l = 1000L;
        float f = 3.14f;
        double d = 10.10;
        char c = 'A';
        boolean bool = true;

        // Wrapper classes
        Byte bw = 1;
        Short sw = 2;
        Integer iw = 100;
        Long lw = 1000L;
        Float fw = 3.14f;
        Double dw = 20.20;
        Character cw = 'Z';
        Boolean boolw = false;

        // String
        String str = "Hello";

        // Arrays
        int[] intArray = {1, 2, 3};
        long[] longArray = {100L, 200L};
        double[] doubleArray = {1.1, 2.2};
        char[] charArray = {'a', 'b'};
        boolean[] boolArray = {true, false};
        String[] stringArray = {"abc", "def"};

        // Object references
        Object obj = new Object();
        Quiz ref = new Quiz();

        // Collections
        java.util.List<Integer> list = new java.util.ArrayList<>();
        java.util.Map<String, Integer> map = new java.util.HashMap<>();
        java.util.Set<String> set = new java.util.HashSet<>();
    	
    	this.maxMarks = maxMarks;
    }

    public String getNoOfQuestions() {
        return noOfQuestions;
    }

    public void setNoOfQuestions(String noOfQuestions) {
        this.noOfQuestions = noOfQuestions;
    }

    public Category getCategory() {
        return category;
    }

    public void setCategory(Category category) {
        this.category = category;
    }

    public Quiz() {
    }

    public Quiz(String title, String description, boolean active, String maxMarks, String noOfQuestions, Category category) {
        this.title = title;
        this.description = description;
        this.active = active;
        this.maxMarks = maxMarks;
        this.noOfQuestions = noOfQuestions;
        this.category = category;
    }

    public Quiz(long qid, String title, String description, boolean active, String maxMarks, String noOfQuestions, Category category) {
        this.qid = qid;
        this.title = title;
        this.description = description;
        this.active = active;
        this.maxMarks = maxMarks;
        this.noOfQuestions = noOfQuestions;
        this.category = category;
    }
    
    //unused constructor
    //begin
    private Quiz(String abc) {
    	this.noOfQuestions = abc;
    }
    //end
}
