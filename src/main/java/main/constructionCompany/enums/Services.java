package main.constructionCompany.enums;

public enum Services {
    CONSTRUCTION_OF_BATHHOSES("The construction of a sauna or a bath is carried out by " +
            "\nus according to a certain algorithm. First, taking into account" +
            "\nyour wishes, a construction project will be created, which will " +
            "\nprovide for all the little things"),
    CONSTRUCTION_OF_HIGHRISE_BUILDINGS("Most high-rises have frames made of steel or" +
            "\n steel and concrete. Their frames are constructed of columns (vertical-support" +
            "\n members) and beams (horizontal-support members). Cross-bracing or shear walls" +
            "\n may be used to provide a structural frame with greater lateral rigidity in" +
            "\n order to withstand wind stresses."),
    CONSTRUCTION_OF_HOUSES("We will make the house of your dreams."),
    OTHER_SERVICES("Please send e-mail => maincompany@gmail.com" +
            "\nOr call us => +280501112233");

    private String description;

    Services(String description) {
        this.description = description;
    }

    public String getDescription() {
        return description;
    }
}
