package com.personalfinance;

public class Notice {
		 
	    //private variables
	    int nid;
	    String date;
	    String contents;
	    String cat;
	    String fr;
	   
	 
	    // Empty constructor
	    public Notice(){
	 
	    }
	    // constructor
	    public Notice(int id, String dt, String con,String ffr,String cate){
	        this.nid = id;
	        this.contents = con;
	        this.cat = cate;
	        this.fr=ffr;
	        this.date=dt;
	    }
	    public Notice(String dt, String con,String ffr,String cate){
	       // this.nid = id;
	        this.contents = con;
	        this.cat = cate;
	        this.fr=ffr;
	        this.date=dt;
	    }
	 
	    // constructor
	    public Notice(String dt, String con){
	      this.contents = con;
	       this.date = dt;
	    }
	    // getting ID
	    public int getID(){
	        return this.nid;
	    }
	 
	    // setting id
	    public void setID(int id){
	        this.nid = id;
	    }
	 
	    // getting name
	    public String getContents(){
	        return this.contents;
	    }
	 
	    // setting name
	    public void setContents(String name){
	        this.contents = name;
	    }
	 
	 // getting name
	    public String getDate(){
	        return this.date;
	    }
	 
	    // setting name
	    public void setDate(String name){
	        this.date = name;
	    }
	    
	    public String getFor(){
	        return this.fr;
	    }
	 
	    // setting id
	    public void setFor(String id){
	        this.fr = id;
	    }
	    public String getCat(){
	        return this.cat;
	    }
	 
	    // setting id
	    public void setCat(String id){
	        this.cat = id;
	    }

}
