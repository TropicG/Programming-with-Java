package enums;

public enum Day {

    SUNDAY("Sun."),
    MONDAY("Mon."),
    TUESDAY("Tu."),
    WEDNESDAY("Wed."),
    THURSDAY("Th."),
    FRIDAY("Fr."),
    SATURDAY("Sat.");

    private String abbreviation;

    Day(String abbreviation){
        this.abbreviation = abbreviation;
    }

    public String getAbbreviation(){
        return abbreviation;
    }
}
