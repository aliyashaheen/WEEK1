import  java.util.Scanner; 
public  class  powerwhile  { 
public  static  void  main  (String[]args){ 
Scanner input =  new  Scanner(System.in); 
int  num = input.nextInt (); 
int  power=input.nextInt(); 
int  result=  1  ; 
int  counter =  1  ; 
while  ( counter<=power) 
{ 
result=result*num; 
counter++; 
} 
System.out.println(  "Result = "  + result); 
input.close(); 
} 
} 