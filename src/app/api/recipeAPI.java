package app.api;

import java.util.ArrayList;
import org.json.JSONException;
import entity.Recipe;

public interface recipeAPI {

    ArrayList<Recipe> getResults(String keyword) throws JSONException;

}
