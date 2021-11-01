package se.lexicon.g37_jpa_assignment.model;

public enum Measurement {


    MSK("Matsked"), TSK("Tesked"), KRM ("Kryddmått"), G("Gram"), HG("Hekto"),
    KG("Kilo"), ML("Milliliter"), CL("Centiliter"), DL("Deciliter"), L("Liter");

    private final String type;

    Measurement(String type) {
        this.type = type;
    }

    public String getType() {
        return type;
    }

}
