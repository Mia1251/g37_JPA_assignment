package se.lexicon.g37_jpa_assignment.model;

public enum Measurement {

    TBSP("Tablespoon"), TSP("Teaspoon"), G("Gram"), HG("Hectogram"),
    KG("Kilogram"), ML("Millilitre"), CL("Centilitre"), DL("Decilitre");

    private String type;

    Measurement(String type) {
        this.type = type;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }
}
