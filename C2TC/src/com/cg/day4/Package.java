package com.cg.day4;

public class Package {

	    public int data=50;
	    public void error() {
	    	System.out.println("Hello public");
	    }
		private int d=40;  
		private void msg(){
			System.out.println("Hello Private");}
		
		 protected int da=50;
		 protected void pmsg() {
		    	System.out.println("Hello protected");
		}  
		  
		public class Simple{  
		 public static void main(String args[]){  
		   Package obj=new Package();  
		   System.out.println(obj.data);//Compile Time Error  
		   obj.msg();
		   obj.error();
		   obj.pmsg(); 
		   }  
		}  

	}

