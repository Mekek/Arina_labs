package Wigs;

public class GoldWig extends Wig {

    public GoldWig() {
        setColor("������-������");
        setType("������");
        Closet.Shelf.loadWig();
    }

    @Override
    public void suit() {
        System.out.println("����� ����. ������� ���������� ������ ��������� �� ����������� ����.");
    }

    @Override
    public String getColor() {
        return String.valueOf(Color.GOLD);
    }
}
