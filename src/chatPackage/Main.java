package chatPackage;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		File fileA = new File("Donut[AFK].log");
		File fileB = new File("Eukarte.log");
		File fileC = new File("friends.list");
		
		List <String> list1 = new ArrayList<>();
		List <String> list2 = new ArrayList<>();
		List <String> list3 = new ArrayList<>();
		
		List <String> friendlist = new ArrayList<>();
		
		Scanner scanner = new Scanner(System.in) ;
			try {
				FileWriter fileWriterA = new FileWriter(fileA,true); 
				FileWriter fileWriterB = new FileWriter(fileB,true);
				FileWriter fileWriterC = new FileWriter(fileC,true);
			    FileReader fileReaderA = new FileReader(fileA);
				FileReader fileReaderB = new FileReader(fileB);
				FileReader fileReaderC = new FileReader(fileC);
				
				BufferedReader readerA = new BufferedReader(fileReaderA);
				BufferedReader readerB = new BufferedReader(fileReaderB);
				BufferedReader readerC = new BufferedReader(fileReaderC);
			
				String A = "";
				String B = "";
				int Num =0;
				
		while(Num !=7) {
				 
		  System.out.println(" ********  ENTER NUMBER FOR  WHAT YOU WANT *********** ");
		  System.out.println(" 1 private writing            2 private reading ");
		  System.out.println(" 3 public writing             4 public reading ");
		  System.out.println(" 5 freindList writing         6 freindList reading ");
		  System.out.println(" 7 for exit ");
		  System.out.println(" ************************************ ");
		   
		  Num =scanner.nextInt();
		   
		  switch(Num) {
			
			case 1 :   
			  System.out.println("<Donut[AFK]>:  ");
			  A = scanner.next();
			  fileWriterA.write("\n <Donut[AFK]>: "+ A);
			  fileWriterB.write("\n <Donut[AFK]>: "+ A);
			  list1.add(A);
			  break;
		
		    case 2 :
			  String read1="";
			  while((read1=readerA.readLine()) != null) {	
			    System.out.println(read1); 
			    System.out.println();
			  }
			  break;
			   
			case 3 : 
			  System.out.println("<Eukarte.log>:  \n");
			  B = scanner.next();
			  fileWriterB.write("\n <Eukarte.log>: "+ B);
			  fileWriterB.write("\n <Donut[AFK]>: "+A);
			  list2.add(B);
			  break;
			
		    case 4 :
		      String read2 ="";
			  while((read2=readerA.readLine()) != null) {
			    // fileWriterB.write(read2);
			    System.out.println(read2);
			  }
			  System.out.println();
		      break; 
		    
			case 5 : 
	          System.out.println("Enter Full name : ");
			  String fName = scanner.next();
			  System.out.println("Enter Ip : ");
			  int ip = scanner.nextInt();
				    
			  fileWriterC.write("\n [FULL NAME]"+fName);
			  fileWriterC.write("\n [LASTIP]"+ip);
			  fileWriterC.write("\n [IMAGE]");
			
			  friendlist.add("\n [FULL NAME]"+fName);
			  friendlist.add("\n [LASTIP]"+ip);
			  friendlist.add("\n [IMAGE]");
					
		      list3.addAll(friendlist);
			  break;
			
		    case 6 :
		      String read3 = "";
			  while((read3= readerC.readLine()) != null) {				  
			    // fileWriterB.write(read3);
			    // fileWriterB.write(read3);
				   System.out.println(read3);
			   }
			  System.out.println();
			    break; 
			    
		    case 7 :
				// System.out.println(" you enter invalid number, please enter valid number \n");
				break;			
		  }		
		}
		fileWriterA.close();
		fileWriterB.close();
		fileWriterC.close();
		readerA.close();
		readerB.close();
		readerC.close();	
	}		
	catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
				scanner.close();
	}					
  }	
}

