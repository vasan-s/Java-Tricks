import java.io.*;    
import java.net.*;
import java.util.*;
public class HttpURLConnectionDemo{    
public static void main(String[] args){
Scanner sc = new Scanner(System.in);
System.out.println("Enter HTTP URL(eg.http://www.hostname.domainname");
String urlin = sc.nextLine();
try{    
URL url=new URL(urlin);    
HttpURLConnection huc=(HttpURLConnection)url.openConnection();  
for(int i=1;i<=8;i++){  
System.out.println(huc.getHeaderFieldKey(i)+" = "+huc.getHeaderField(i));  
}  
huc.disconnect();   
}catch(Exception e){System.out.println(e);}    
}    
}  
