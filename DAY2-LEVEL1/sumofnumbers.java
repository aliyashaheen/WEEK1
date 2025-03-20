import  java.util.Scanner; 
public  class  sumofnumbers { 
public  static  void  main  (String[] args) { 
Scanner sc=  new  Scanner(System.in); 
int  ogNumber=sc.nextInt(); 
int  number=ogNumber; 
if  (number>=  0  ){ 
int  sum=  0  ; 
while  (number>  0  ){ 
sum+=number; 
number--;}
}
}
}