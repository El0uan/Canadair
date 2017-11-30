package util;

import org.json.JSONArray;
import org.json.JSONException;

public class JSON {

    public static int chercheKeyJSONArray(JSONArray json, String key) {
        try {
            for (int i=0; i < json.length(); i++)
                if (json.get(i).getClass().getSimpleName().equals("JSONObject"))
                    if (json.getJSONObject(i).names().toString().contains(key))
                        return i;

            return -1;
        } catch (JSONException e) {
            e.printStackTrace();
            return -1;
        }
    }
}
