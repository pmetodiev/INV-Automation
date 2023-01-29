package api.dto;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

public class Item {

    private String Id;
    private String name;
    private String currency;
    private String quantity_unit;
    private Double price_for_quantity;

    public Item(String name, String currency, String quantity_unit, Double price_for_quantity) {
        this.name = name;
        this.currency = currency;
        this.quantity_unit = quantity_unit;
        this.price_for_quantity = price_for_quantity;
    }

    public String getName() {
        return name;
    }

    public static void main(String[] args) {
        Item coffee=new Item("lavaza","BGN","kg",10.50);
        Gson gson= new GsonBuilder().setPrettyPrinting().create();
        System.out.println(gson.toJson(coffee));

    }

    public String getId() {
        return Id;
    }
}
