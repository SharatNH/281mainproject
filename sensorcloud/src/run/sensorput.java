package run;

import java.io.IOException;
import java.sql.DriverManager;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

import com.mysql.jdbc.Connection;
import com.mysql.jdbc.PreparedStatement;

public class sensorput {

	public static void main (String [] args) throws IOException{
	System.out.println("hello");
	//String sensorname = request.getParameter("sensorname");
	//String sensorgrp = request.getParameter("sensorgrp");
	//String sensorcity = request.getParameter("city");

	//String sensorparameter = request.getParameter("sensorparameter");
	//String sensorparacount = request.getParameter("count");
	
	//String [] typepara = null;
	//typepara = sensorparameter.split(",");
	//System.out.println(typepara[0]);
	//System.out.println(typepara[1]);
	
	Document doc = Jsoup.connect("http://www.usclimatedata.com/climate/dallas/texas/united-states/ustx1575").get(); 
       
    Elements tableElements = doc.select("table");
    

    

   Elements tableRowElements = tableElements.select(":not(thead th)");
   //tableRowElements.remove(0);
   //tableRowElements.remove(1);
   //tableRowElements.remove(2);
    //tableRowElements.remove(3);
    System.out.println(tableRowElements.size());
  /*  for (int i = 0; i < tableRowElements.size(); i=i+3) {							//while(tableElements.select(":not (/table) "))
    	System.out.println("i:"+i); 		
    	Element row = tableRowElements.get(i);
                Elements rowItems = row.select("td");
                for (int j = 0; j < rowItems.size(); j++) {
                	System.out.println(j);
                   System.out.println(rowItems.get(j).text());
                }
                System.out.println();
     }
   */
    
    //switch statement begins
    
    int count = 0;
    int i;
    int j;
    int counter=0; 
    String[] temp1 = new String[21];
    String[] temp2 = new String[21];
    String[] temp3 = new String[6];
    String[] temp4 = new String[6];
    
    String ann_htemp = null, avg_ltemp = null, avg_temp = null,avg_annrain = null,city = null, longitude = null,latitude = null,time = null,zone = null;
    
    while (count <12){
    	
    count ++; 
    switch(count){
    
    case 1 : i = 0;
    		Element row = tableRowElements.get(i);
    		Elements rowItems = row.select("td");
    		for (j = 0; j < 21; j++) {
    			
    			temp1 [j]=(rowItems.get(j).text());
    			System.out.println("temp1"+"["+j+ "]"+":" + temp1[j]);
    		}
    		counter =0;
    		for (j = 29; j < 35; j++) {
    			
    			temp3 [counter]=(rowItems.get(j).text());
    			System.out.println("temp3"+"["+counter+ "]"+":" + temp3[counter]);
    			counter = counter+1;
    		}
    		System.out.println();	
    		
    		break;
   
    case 2: i = 54;
			 row = tableRowElements.get(i);
			 rowItems = row.select("td");
			for (j = 0; j < 21; j++) {
		
				temp2 [j]=(rowItems.get(j).text());
				System.out.println("temp2"+"["+j+ "]"+":" + temp1[j]);
			}
			counter =0;
			for (j = 29; j < 35; j++) {
    			
    			temp4 [counter]=(rowItems.get(j).text());
    			System.out.println("temp4"+"["+counter+ "]"+":" + temp4[counter]);
    			counter = counter + 1;
    		}
    		System.out.println();	
			System.out.println();	
			
			
			break;
	
    case 3: i = 108;
    		j=1;
    		row = tableRowElements.get(i);
    		rowItems = row.select("td");
    		
    			ann_htemp=(rowItems.get(j).text());
    			System.out.println("annual temp" + ann_htemp);
    		
    		System.out.println();	
    	
    		break;
    
    case 4:i = 111;
			j=1;
			row = tableRowElements.get(i);
			rowItems = row.select("td");
	
			avg_ltemp=(rowItems.get(j).text());
			System.out.println("avg low temp" + avg_ltemp);
		
    		System.out.println();	
    		
    		break;
    
    case 5: i = 114;
			j=1;
			row = tableRowElements.get(i);
			rowItems = row.select("td");

			avg_temp=(rowItems.get(j).text());
			System.out.println("avg temp"+avg_temp);

			System.out.println();	
			
			break;
			
    case 6 : i = 117;
    			j=1;
    			
				row = tableRowElements.get(i);
				rowItems = row.select("td");
		
				avg_annrain=(rowItems.get(j).text());
				System.out.println("avg annual rain" + avg_annrain);
			
        		System.out.println();	
        		
        		break;
    case 7 : i = 708;
    			j = 0;
    			
				row = tableRowElements.get(i);
				rowItems = row.select("td");
		
				city =(rowItems.get(j).text());
				System.out.println("city"+city);
			
        		System.out.println();	
        		
        		break;
        		
    case 8 : i = 714;
    		j = 0;
    		
			row = tableRowElements.get(i);
			rowItems = row.select("td");
	
			longitude=(rowItems.get(j).text());
			System.out.println("longitude" + longitude);
		
    		System.out.println();	
    		
    		break;
    		
    case 9 : i = 717;
    		 j=0;
    		 
				row = tableRowElements.get(i);
				rowItems = row.select("td");
		
				latitude=(rowItems.get(j).text());
				System.out.println("latitude" + latitude);
			
     		System.out.println();	
     		
     		break;
     		
    case 10 : i = 729;
    			j=0;
    			
				row = tableRowElements.get(i);
				rowItems = row.select("td");
		
				time=(rowItems.get(j).text());
				System.out.println("time" + time);
			
        		System.out.println();	
        		
        		break;
    
    case 11 : i = 744;
    			j = 0;
    			
				row = tableRowElements.get(i);
				rowItems = row.select("td");
		
				zone=(rowItems.get(j).text());
				System.out.println("zone" + zone);
			
        		System.out.println();	
        		
        		break;
        		
        		
      default : System.out.println();
      			break;
     
    
    
    
    
    
    } //switch loop
    
    
    } //while loop     
    
    
    
    //invoke jdbc 
    // initialise 
    String ah_jan =temp1[1] ;
    String ah_feb = temp1[2] ;
    String ah_mar =temp1[3] ;
    String ah_apr = temp1[4] ;
    String ah_may = temp1[5]  ;
    String ah_june = temp1[6] ;
    String ah_july = temp2[1] ;
    String ah_aug = temp2[2] ;
    String ah_sep = temp2[3] ;
    String ah_oct = temp2[4] ;
    String ah_nov = temp2[5] ;
    String ah_dece = temp2[6] ;
    
    String al_jan = temp1[8]  ;
    String al_feb= temp1[9]  ;
    String al_mar = temp1[10] ;
    String al_apr = temp1[11] ;
    String al_may = temp1[12] ;
    String al_june = temp1[13] ;
    String al_july = temp2[8] ;
    String al_aug = temp2[9] ;
    String al_sep= temp2[10] ;
    String al_oct = temp2[11];
    String al_nov = temp2[12];
    String al_dece = temp2[13];
    
    String ap_jan = temp1[15]  ;
    String ap_feb = temp1[16] ;
    String ap_mar = temp1[17] ;
    String ap_apr = temp1[18] ;
    String ap_may = temp1[19] ;
    String ap_june = temp1[20] ;
    String ap_july = temp2[15] ;
    String ap_aug = temp2[16] ;
    String ap_sep = temp2[17] ;
    String ap_oct = temp2[18] ;
    String ap_nov = temp2[19] ;
    String ap_dece = temp2[20] ;
    
    String as_jan = temp3[0]  ;
    String as_feb = temp3[1] ;
    String as_mar = temp3[2] ;
    String as_apr = temp3[3] ;
    String as_may = temp3[4] ;
    String as_june = temp3[5] ;
    String as_july = temp4[0] ;
    String as_aug = temp4[1] ;
    String as_sep = temp4[2] ;
    String as_oct = temp4[3] ;
    String as_nov = temp4[4] ;
    String as_dece = temp4[5] ;
    
	}
}
