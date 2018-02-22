
public class MyString {
	private   char[] str;
	
	public static void main(String[] args) {//Driver Class
		char [] a= new char []{'G','o','d',' ','S','a','v','e'};
		char [] b= new char []{'G','o','d',' ','d','b'};
		//char[] a = trs.toCharArray();
		MyString ilya = new MyString(a);
		MyString ben = new MyString(b);
		System.out.println("CharAt(1): "+ilya.CharAt(1));
		System.out.println("length(): "+ilya.length());
		System.out.println("substring(1,5): "+ilya.substring(1,5));
		System.out.println("toLowerCase(): "+ilya.toLowerCase());
		System.out.println("toUppercase(): "+ilya.toUpperCase());
		System.out.println("valueOf(2): "+ilya.valueOf(2));
		String i= ilya.toString();
		System.out.println("toString: "+i);
		System.out.println("getMyString: "+ilya.getMyString());
		System.out.println("compareTo(ben): "+ilya.compareTo(ben));
		

	}
	public MyString(char[] chars){
		this.str =chars;
	}

	public char CharAt(int index){
		char i= str[index];
		 return i;
	}

	public int length(){
		int n= this.str.length;
		return n;
	
	}
	public MyString substring(int begin, int end){//needwork
		int count=0;
		char sub[]=new char[str.length] ;
		for(int i=begin;i<end;i++){
			sub[count]=str[i];
			count++;
			//nig.substring(1, 2);
		}
		//System.out.println(sub);
		return new MyString(sub);
	}
	public MyString toLowerCase(){//find the number binary number and add 32 to uppercase
		//char[] test=new char []{'G','o','d','S','a','v','e'};
		int len=length();
		char sub[]=new char[str.length] ;
		for(int i=0;i<len;i++){
			sub[i]=str[i];
		}
		for(int b=0;b<len;b++){
			int ascii=(int)sub[b];
			
			if(ascii>=65&&ascii<=90){
				ascii=ascii+32;
				sub[b]=(char)ascii;
			}
		}
		return new MyString(sub);
	}
	public MyString toUpperCase(){
		int len=length();
		char sub[]=new char[str.length] ;
		for(int i=0;i<len;i++){
			sub[i]=str[i];
		}
		for(int b=0;b<len;b++){
			int ascii=(int)sub[b];
					
			if(ascii>=97&&ascii<=122){
				ascii-=32;
				sub[b]=(char)ascii;
			}
		}
		return new MyString(sub);
	}
	public int compareTo(MyString s){
		int lrg;
		if(str.length>=s.length()){
			lrg=str.length;

		}
		else{
			lrg=s.length();
			//System.out.println(lrg);
		}
		for(int b=0;b<=lrg;b++){
				if((int)s.str[b]!=(int)str[b]){
				return (int)s.str[b]-(int)str[b];
			}
		}
		return 0;
	
	}
	public MyString getMyString(){
		char[] chars;
       	chars=this.str;
       	return new MyString(str);
    }
	public String toString(){ 
		String pop=new String();
       	for(int x=0;x<this.length();x++){
       		pop= pop+this.CharAt(x);
       	}
       	return pop;
	}
	public  MyString valueOf(int i){ 
		char[] val=new char[1];
		val[0]=str[i];
		return new MyString (val);
	}

}
	
	


