package Lover;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class Task1 {

	public static void main(String[] args) {
		String txtFile = "/Users/zhaoyunlong/Desktop/EE308/EE308_LAB1-2.txt";
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
        int totalnum = 0;
        int switchnum = 0;
        int casenum = 0;
        int intnum = 0;
        int doublenum = 0;
        int longnum = 0;
        int ifnum = 0;
        int elsenum = 0;
        int breaknum = 0;
        int returnnum = 0;
        int defaultnum = 0;
        int ienum = 0;
        int ieenum = 0;
        int ift = 0;
        int switcht = 0;
        int [] sw = new int [10000];
        //int eit = 0;
        //int x = 0;
        boolean [] array = new boolean [10000];
        for(int  j = 0 ; j <= i - 1; j++) {
               String m = data[j];
        	   if(m!=null) {
               for(int q = 0 ; q <= m.length() - 1 ; q++) {
            	   if(q + 6 <= m.length() - 1) {
            		   String l = m.substring(q, q+6);
            		   
            		   if(l.equals("switch")) {
            			   switchnum++;
            		   }
            		   else if(l.equals("double")) {
            			   doublenum++;
            		   }
            		   else if(l.equals("return")) {
            			   returnnum++;
            		   }
            	   }
            	   if(q + 4 <= m.length() - 1) {
            		   String l = m.substring(q, q+4);

            		   if(l.equals("case")) {
            			   casenum++;
            			   switcht++;
            		   }
            		   else if(l.equals("long")) {
            			   longnum++;
            		   }
            		   else if(l.equals("else")) {
            			   String u = m.substring(q+5,q+7);
            			   if(!(u.equals("if"))) {
            			        elsenum++;
            			        if(array[ift - 1] == true) {
            			           ieenum++;
            			        }
            			        else {
            			        	ienum++;
            			        }
            			        ift--;
            			        
            			   }
            			   else {
            				   
            				   array[ift - 1] = true;
            				   ifnum++;
            				   elsenum++;
            			   }
            			   break;
            		   }
            	   }
            	   if(q + 2 <= m.length() - 1) {
            		   String l = m.substring(q, q+2);
             
            		   if(l.equals("if")) {
            			   array[ift] = false;
            			   ift++;
            			   ifnum++;
            		   }
            	   }
            	   if(q + 5 <= m.length() - 1) {
            		   String l = m.substring(q, q+5);
             
            		   if(l.equals("break")) {
            			   breaknum++;
            		   }
            	   }
            	   if(q + 7 <= m.length() - 1) {
            		   String l = m.substring(q, q+7);
             
            		   if(l.equals("default")) {
            			   defaultnum++;
            			   sw[switchnum - 1] = switcht;
            			   switcht = 0;
            		   }
            	   }
            	   if(q + 3 <= m.length() - 1) {
            		   String l = m.substring(q, q+3);
             
            		   if(l.equals("int")) {
            			   intnum++;
            		   }
            	   }
            	  
               }
        	   }
        }                     
        totalnum = switchnum + casenum + intnum + doublenum + longnum + defaultnum + breaknum + returnnum + ifnum + elsenum;
            System.out.println("total num: " + totalnum);
            System.out.println("switch num: " + switchnum);
            System.out.print("case num: ");
            for(int k = 0 ; k <= switchnum - 1 ; k++) {
        	System.out.print(sw[k]+" ");
            }
            System.out.println();
            System.out.println("if-else num: " + ienum);
            System.out.println("if-elseif-else num: " + ieenum);
	}

}
