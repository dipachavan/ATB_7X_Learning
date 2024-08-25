package ex_17082024;

public enum Colours {

    RED("###1100"),
    GREEN("###1300"),
    BLUE("###0000"),
    PINK("###1100");

    private String colorCode;

    Colours(String colorCode) {
        this.colorCode=colorCode;
    }

    public String getColorValue(){
        return colorCode;
    }
}
