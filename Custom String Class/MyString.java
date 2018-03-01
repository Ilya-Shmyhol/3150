
public class MyString {
	private  char[] str;
	
	
public MyString(char[] chars){
		this.str =chars;
		System.out.println(str);
		System.out.println("change");
	}

public char CharAt(int index){
		char i= str[index];
		 return i;
	}

public int length(){
	int n= this.str.length;
	return n;
	/*int i=1;
	while(str[i]!='d'){
		i++;
		}
	//System.out.println( i);
	return i;
	
	//return str.length;
		*/
	}
	public MyString substring(int begin, int end){//needwork
		int count=0;
		char sub[]=new char[str.length] ;
		for(int i=begin;i<end;i++){
			sub[count]=str[i];
			count++;
			//nig.substring(1, 2);
		}
		System.out.println(sub);
		return new MyString(sub);
	}
	public MyString toLowerCase(){//find the number binary number and add 32 to uppercase
		//char[] test=new char []{'G','o','d','S','a','v','e'};
		int len=length();
		for(int b=0;b<len;b++){
			int ascii=(int)str[b];
			//System.out.println(ascii+"at "+str[b]);
			
			if(ascii>=65&&ascii<=90){
				ascii=ascii+32;
				str[b]=(char)ascii;
			}
		}
		return new MyString(str);
	}
	public MyString toUpperCase(){
		int len=length();
		
		for(int b=0;b<len;b++){
			int ascii=(int)str[b];
					
			if(ascii>=97&&ascii<=122){
				ascii-=32;
				str[b]=(char)ascii;
			}
		}
		return new MyString(str);
	}
	public int compareTo(MyString s){
		System.out.println("here"+s);
		int lrg;
		if(str.length>=s.length()){
			lrg=str.length;
		}
		else{
			lrg=s.length();
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
		String str=new String();
       	for(int x=0;x<this.length();x++){
       		str= str+this.CharAt(x);
       	}
       	return str;
	}
	/*public static MyString valueOf(int i){ 
		char[] val=new char[1];
		val[0]=str[i];
		return new MyString (val);
	}*/

}
	
	


