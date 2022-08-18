package main.constructionCompany.enums;

public enum PhoneCode {
    UKRAINE("+380"), LITHUANIA("+370"), LATVIA("+371"), ESTONIA("+372"), AUSTRIA("+43");

    private String code;

    PhoneCode(String code) {
        this.code = code;
    }

    public String getCode() {
        return code;
    }
}
