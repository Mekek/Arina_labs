package Wigs;

public class GoldWig extends Wig {

    protected final String color = "������-������";
    protected final String type = "������";
    protected final String decoration = "������� �������";

    @Override
    public void suit() {
        System.out.println("����� ����. ������� ���������� ������ ��������� �� ����������� ����.");
    }

    @Override
    public String getColor() {
        return String.valueOf(Color.GOLD);
    }
}
