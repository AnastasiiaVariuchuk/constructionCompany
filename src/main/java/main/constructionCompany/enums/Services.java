package main.constructionCompany.enums;

public enum Services {
    CONSTRUCTION_OF_BATHHOSES("The construction of a sauna or a bath is carried out by us according to a certain" +
            " algorithm. First, taking into account your wishes, a construction project will be created, which will " +
            "provide for all the little things"),
    CONSTRUCTION_OF_HIGHRISE_BUILDINGS(""),
    CONSTRUCTION_OF_HOUSES(""),
    OTHER_SERVICES("");

    private String description;

    Services(String description) {
        this.description = description;
    }

    public String getDescription() {
        return description;
    }
}
