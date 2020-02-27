import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;

public class JsonUtil {

  private JsonUtil() {
  }
  private static final ObjectMapper objectMapper = new ObjectMapper();

  public static String convertToJson(Object object)  {
    String json= null;
    try {
      json = objectMapper.writeValueAsString(object);
    } catch (ValueReadException e) {
      e.getMessage();
    } catch (JsonProcessingException e) {
      e.printStackTrace();
    }
    return json;


  }

}
