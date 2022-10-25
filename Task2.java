package Lover;
import java.util.Scanner;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
public class Task2 {
    //Receive the test code
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String location  = sc.nextLine();
        int n_value = sc.nextInt();///Users/zhaoyunlong/Desktop/EE308/EE308_LAB1-2.txt
		String txtFile = location;
        String line = "";
        String line1 = "";
        String[] data = new String[100000];
        int i = 0;
        try (BufferedReader br = new BufferedReader(new FileReader(txtFile))) {

            while ((line = br.readLine()) != null) {
            	
                // use comma as separator
                data[i] = line;
                
                                i++;

            }
            
        } catch (IOException e) {
            e.printStackTrace();
        }
        if(n_value == 1) {
          level1(data,i);
        }
        else if(n_value == 2) {
          level2(data,i);
        }
        else if(n_value == 3) {
        level34(data,i);
        }
	}
	//Calculate the number of keywords in the test code
	public static void level1(String str[],int n) {
		int totalnum = 0;
		String keywords="abstract、assert、boolean、break、byte、case、"
                + "catch、char、class、continue、default、do、double、else、"
                + "enum、extends、final、finally、float、for、if、implements、"
                + "import、int、interface、instanceof、long、native、new、"
                + "package、private、protected、public、return、short、static、"
                + "strictfp、super、switch、synchronized、this、throw、throws、"
                + "transient、try、void、volatile、while";//all keywords
        String []keyArr=keywords.split("、");
        for(int  j = 0 ; j <= n - 1; j++) {
           String m = str[j];
            for(int q = 0 ; q <= keyArr.length - 1 ; q++) {
               Pattern p = Pattern.compile("[^a-z]"+keyArr[q]+"[^a-z]");
               Matcher match = p.matcher(m);
         	   if(match.find()) {
         		   totalnum++;
                    	
                    
               }                     
	        }
	    }
        System.out.println("total num: " + totalnum);
	} 
	//Calculate the number of "switch case" structure and  the number of "case" corresponding to each group
	public static void level2(String str[],int n) {
		int switchnum = 0;
		int [] num = new int [10000];
		int casenum = 0;
        for(int  j = 0 ; j <= n - 1; j++) {
           String m = str[j];
               Pattern p = Pattern.compile("[^a-z]switch[^a-z]");
               Matcher match = p.matcher(m);
               Pattern p1 = Pattern.compile("[^a-z]case[^a-z]");
               Matcher match1 = p1.matcher(m);
               Pattern p2 = Pattern.compile("[^a-z]default[^a-z]");
               Matcher match2 = p2.matcher(m);
         	  if(match.find()) {
         		    switchnum++;
         		    continue;
         	 }
         	  if(match1.find()) {
              	casenum++;
              }
              else if(match2.find()) {
              	num[switchnum - 1] = casenum;
              	casenum = 0;
              }   
             }                     
	        
	    
        System.out.println("switch num: " + switchnum);
        System.out.print("case num: " );
        for(int i = 0 ; i <= switchnum - 1 ; i++) {
        	System.out.print(num[i] + " ");
        }
        System.out.println();
        
	} 
	//Calculate the number of "if, else" structures and the number of "if, else if, else" structures
	public static void level34(String str[],int n) {
		int ifnum = 0;
		int it = 0;
		boolean [] bool = new boolean [10000];
		int ienum = 0;
		int ieenum = 0;
        for(int  j = 0 ; j <= n - 1; j++) {
           String m = str[j];
               Pattern p = Pattern.compile("[^a-z]if[^a-z]");
               Matcher match = p.matcher(m);
               Pattern p1 = Pattern.compile("[^a-z]else[^a-z]");
               Matcher match1 = p1.matcher(m);
               boolean a = match.find();
               boolean b = match1.find();
               
         	   if(a&&!b) {
         		  
         		    ifnum++;
         		    bool[it] = false;
         		    it++;
         	   }
         	   else if(a&&b) {
         		    bool[it - 1] = true;
         	   }
         	  else if(!a&&b) {
       		        if(bool[it - 1]) {
       		        	ieenum++;
       		        }
       		        else {
       		        	ienum++;
       		        }
       		        bool[it - 1] = false;
       		        it--;
         	  }
         		    
	} 
        System.out.println("if-else num: " + ienum);
        System.out.println("if-elseif-else num: " + ieenum);
          
}
}