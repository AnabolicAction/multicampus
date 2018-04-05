package r;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.rosuda.REngine.Rserve.RConnection;
import org.rosuda.REngine.Rserve.RserveException;

public class RTest2 {

	public static void main(String[] args) {
		RConnection rconn =null;
		try {
			//rconn = new RConnection("70.12.114.136"); �� IP�� ���� ���
			rconn = new RConnection();
		} catch (RserveException e) {
			System.out.println("R Connection Error");
			e.printStackTrace();
		}
		System.out.println("R Connection okay");
		
		try {
	         //eval : R�� ������ �����ϰڴ�
	         rconn.setStringEncoding("utf8");
	         rconn.eval("source('C:/rproject/day09/r1.R',encoding='UTF-8')");
	         	         
	         double data []= rconn.eval("r2()").asDoubles();
	         //[{name:"data",datas:[1,2,3,4,5,6,7,8,,9,10]}]
	         
	 		JSONArray data_Array =new JSONArray();
	 		JSONObject data_Object =new JSONObject();
	 		data_Object.put("name", "data");
	 		JSONArray ja =new JSONArray();
	 		
	 		for(double d : data) {
	 			ja.add((int)d);
	 		}
	 		//[]�ϳ� ������ش�.
	 		data_Object.put("datas",ja);
	 		data_Array.add(data_Object);
	 		
	         System.out.println(data_Array.toJSONString());
	      } catch (Exception e) {
	         e.printStackTrace();
	      }
	}

}
