package entity;
import java.util.ArrayList;



import java.util.ArrayList;

public class Recipe {


    private String name;
    private ArrayList<Ingredient> ingredients;
    private ArrayList<Nutrient> nutrients;
    private Float calories;
    private String culture;
    private Integer portion;
    private String url;

    public Recipe(String name, ArrayList<Ingredient> ingredients, ArrayList<Nutrient> nutrients, Float calories, String culture, Integer portion, String url) {
        this.name = name;
        this.ingredients = ingredients;
        this.nutrients = nutrients;
        this.calories = calories;
        this.culture = culture;
        this.portion = portion;
        this.url = url;
    }
  
      public Recipe(){
    }

    public String getName() {
        return name;
    }

    public ArrayList<Ingredient> getIngredients() {
        return ingredients;
    }

    public ArrayList<Nutrient> getNutrients() {
        return nutrients;
    }

    public Float getCalories() {
        return calories;
    }

    public String getCulture() {
        return culture;
    }

    public Integer getPortion() {
        return portion;
    }

    public String getUrl() {
        return url;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setIngredients(ArrayList<Ingredient> ingredients) {
        this.ingredients = ingredients;
    }

    public void setNutrients(ArrayList<Nutrient> nutrients) {
        this.nutrients = nutrients;
    }

    public void setCalories(Float calories) {
        this.calories = calories;
    }

    public void setCulture(String culture) {
        this.culture = culture;
    }

    public void setPortion(Integer portion) {
        this.portion = portion;
    }

    public void setUrl(String url) {
        this.url = url;
    }
}
