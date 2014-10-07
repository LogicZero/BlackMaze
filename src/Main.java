import com.mashape.unirest.http.HttpResponse;
import com.mashape.unirest.http.JsonNode;
import com.mashape.unirest.http.Unirest;
import com.mashape.unirest.http.exceptions.UnirestException;

public class Main {
	public static void main(String[] args) {
	
		
		String getCurrentCell=baseUri+"currentCell?mazeGuid=b093800f-7e68-434b-9921-8d5036ef99ff";
		HttpResponse<JsonNode> response=null;
	/*	try {
			response = Unirest.post(getToken).asJson();
		} catch (UnirestException e) {
			e.printStackTrace();
		}//
*/	
		try {
			response=Unirest.get(getCurrentCell).asJson();
		} catch (UnirestException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		System.out.println(response.getBody());
		
		//	.header("accept", "application/json").field("","");.asJson();
		//.field("parameter", "value").field("foo", "bar").asJson();
		System.out.println(response.toString());
	}

	
}
