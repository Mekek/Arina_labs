package Wigs;

public class RedWig extends Wig{

    public RedWig() {
        color = "������-������";
        type = "������";
        decoration = "������� �������";
    }

    @Override
    public void suit() {
        System.out.println("����� ������ ������ �� �������� ��.");
    }

    @Override
    public String getColor() {
        return String.valueOf(Color.RED);
    }
}
