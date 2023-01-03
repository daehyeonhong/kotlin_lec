package lec14;

public enum JavaCountry {
    KOREA("KO"),
    AMERICA("US");
    private final String code;

    JavaCountry(final String code) {
        this.code = code;
    }

    public String getCode() {
        return code;
    }
}