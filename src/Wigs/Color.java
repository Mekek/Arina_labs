package Wigs;

public enum Color {
    GOLD ("����������"),
    RED ("�����"),
    BLACK ("������-������"),
    NOWIG ("����������� (�������������)");

    Color (String color) {
        this.color = color;
    }

    public String getColor(){
        return color;
    }

    private final String color;


}
