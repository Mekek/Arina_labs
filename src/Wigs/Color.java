package Wigs;

public enum Color {
    GOLD ("����������"),
    RED ("�����"),
    BLACK ("������-������"),
    NORMAL ("�������");

    Color (String color) {
        this.color = color;
    }

    public String getColor(){
        return color;
    }

    private final String color;


}
