package Wigs;

import java.util.Objects;

public class Wig {
    private String color;
    private String type;
    private String decorationDescription = "��������� �����������";

    public Wig (String color, String type) {
        this.color = color;
        this.type = type;
        System.out.println(color + " ����� �������� � ������� ����.");
        Closet.Shelf.loadWig();

    }

    public class Decoration { // Inner nested class
        public void setDescription(String textDescription) {
            boolean decorationExistence = true;
            decorationDescription = textDescription;
        }
    }

    public void suit() {
        switch (color) {
            case "������" ->
                    System.out.println("����� ����. ������-������ ������, ��� �������� �����, ��� ���� �������� �������� ���������, �����������, ������ ��������.");
            case "����������" ->
                    System.out.println("����� ����. ������� ���������� ������ ��������� �� ����������� ����.");
            case "�����" -> System.out.println("����� ������ ������ �� �������� ��.");
            default -> System.out.println("�������� �����.");
        }
    }

    public String getColor() {
        return switch (color) {
            case "������" -> String.valueOf(Color.BLACK);
            case "����������" -> String.valueOf(Color.GOLD);
            case "�����" -> String.valueOf(Color.RED);
            default -> String.valueOf(Color.NORMAL);
        };
    }

    public void setColor(String color) {
        this.color = color;
    }

    public void setType(String type) {
        this.type = type;
    }

    @Override
    public String toString() {
        return "����� " +
                "����� '" + color + '\'' +
                ", ���� '" + type + '\'' +
                ", � ���������� '" + decorationDescription + '\'';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Wig wig = (Wig) o;
        return color.equals(wig.color) && type.equals(wig.type);
    }

    @Override
    public int hashCode() {
        return Objects.hash(color, type, decorationDescription);
    }
}
