package Wigs;

public class BlackWig extends Wig{

    public BlackWig() {
        color = "������-������";
        type = "������";
        Closet.Shelf.loadWig();
    }



    @Override
    public void suit() {
        System.out.println("����� ����. ������-������ ������, ��� �������� �����, ��� ���� �������� �������� ���������, �����������, ������ ��������.");
    }

    @Override
    public String getColor() {
        return String.valueOf(Color.BLACK);
    }
}
