package r;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.rosuda.REngine.RList;
import org.rosuda.REngine.Rserve.RConnection;
import org.rosuda.REngine.Rserve.RserveException;

public class RTest4 {

	public static void main(String[] args) {
		RConnection rconn =null;
		try {
			//rconn = new RConnection("70.12.114.136"); 저 IP로 들어가는 방법
			rconn = new RConnection();
		} catch (RserveException e) {
			System.out.println("R Connection Error");
			e.printStackTrace();
		}
		System.out.println("R Connection okay");
		
		try {
	         //eval : R의 문장을 실행하겠다
	         rconn.setStringEncoding("utf8");
	         rconn.eval("source('C:/rproject/day09/r1.R',encoding='UTF-8')");
	         	         
	         RList list= rconn.eval("r3()").asList();
	         System.out.println(list.size());
	         String time []=list.at("time").asStrings();
	         double line2 []=list.at("line2").asDoubles();
	         double line3 []=list.at("line3").asDoubles();
	         double line4 []=list.at("line4").asDoubles();
	        
	         System.out.println(time.length);
	         System.out.println("time"+"	"+"line2"+"	"+"line3"+"	"+"line4");
	         JSONArray data_Array =new JSONArray();
		 		JSONObject data_Object =new JSONObject();
		 	
		 		JSONArray ja =new JSONArray();
		 		JSONArray ja_clone =new JSONArray();
		 		
	         for(int i=0;i<time.length;i++) {
	        	 ja.add(time[i]);
	        	 
	        	// System.out.println(time[i]+"	"+(int)line2[i]+"	"+(int)line3[i]+"	"+(int)line4[i]);
	         }
	         ja_clone = (JSONArray)ja.clone();
	         data_Object.put("time", ja_clone);
	         ja.clear();
	       
	         //System.out.println(data_Object);
	         
	         
	         for(int i=0;i<time.length;i++) {
	        	 ja.add((int)line2[i]);
	        	 
	        	// System.out.println(time[i]+"	"+(int)line2[i]+"	"+(int)line3[i]+"	"+(int)line4[i]);
	         }
	         ja_clone = (JSONArray)ja.clone();
	         data_Object.put("line2", ja_clone);
	         ja.clear();
	         
	         //System.out.println(data_Object);
	         
	         
	         for(int i=0;i<time.length;i++) {
	        	 ja.add((int)line3[i]);
	        	 
	        	// System.out.println(time[i]+"	"+(int)line2[i]+"	"+(int)line3[i]+"	"+(int)line4[i]);
	         }
	         ja_clone = (JSONArray)ja.clone();
	         data_Object.put("line3", ja_clone);
	         ja.clear();
	       
	         //System.out.println(data_Object);
	         
	         
	         for(int i=0;i<time.length;i++) {
	        	 ja.add((int)line4[i]);
	        	 
	        	// System.out.println(time[i]+"	"+(int)line2[i]+"	"+(int)line3[i]+"	"+(int)line4[i]);
	         }
	         ja_clone = (JSONArray)ja.clone();
	         data_Object.put("line4", ja_clone);
	         ja.clear();
	         data_Array.add(data_Object);
	         System.out.println(data_Array);
	         
	      } catch (Exception e) {
	         e.printStackTrace();
	      }
	}

}
