package Fixer_IO_Example;

import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;

public class JSONFactory {

    private JSONObject latestRatesJSON;

    //getter
    public JSONObject getLatestRatesJSON() {
        return latestRatesJSON;
    }
    //setter
    public void setLatestRatesJSON(String latestRatesJSONString) { ;
        try {
            JSONParser jsonParser = new JSONParser ();
            this.latestRatesJSON = (JSONObject) jsonParser.parse(latestRatesJSONString);
        } catch (ParseException e) {
            e.printStackTrace ();
        }
    }
}
