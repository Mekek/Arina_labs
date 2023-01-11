import Interface.Existence;
import characters.*;
import Wigs.*;


public class Main {
    public static void main (String [] args) throws NullException {

        Existence universe = new Existence() { // Anonymous class
            boolean existence = false;
            @Override
            public void exist() {
                System.out.println("������ ��������� � �������� �������������...");
                existence = true;
            }
        };

        universe.exist();

        Misa misa = new Misa("������� ����");

        FrekenSnork snork = new FrekenSnork("�������");

        Wig blackWig = new Wig("������", "������");
        Wig.Decoration blackWigDecoration = blackWig.new Decoration();
        blackWigDecoration.setDescription("������� �������");
        Wig goldWig = new Wig("����������", "������");
        Wig redWig = new Wig("�����", "�����");
        Wig anotherRedWig = new Wig("�����", "�����");
        System.out.println();

        System.out.println("�������� equals, hashCode, toString ��� ����������. ");
        System.out.println(misa.equals(snork));
        System.out.println(misa.hashCode());
        System.out.println(misa);
        System.out.println();

        System.out.println("�������� equals, hashCode, toString ��� �������. ");
        System.out.println(redWig.equals(anotherRedWig));
        System.out.println(redWig.hashCode());
        System.out.println(blackWig);
        System.out.println();


        snork.see("����� ������� �����, ������������� ������ ������������ �����.", false);
        snork.go("������� ����.");
        try {
            snork.go("������� ����.");
        }
        catch (CurrentLocationException e) {
            System.out.println(e.getMessage());
        }
        try {
            misa.implement("������ �� �����.");
            misa.tryOn(blackWig);
            misa.see("���� � �������.", false);
            blackWig.suit();
            misa.implement("���������.");
            misa.takeOff();
            misa.tryOn(redWig);
            redWig.suit();
            misa.takeOff();
            misa.tryOn(blackWig);
            blackWig.suit();
            misa.see("���� � �������.", true);
            misa.takeOff();
            misa.implement("���������� � ���.");
        } catch (CurrentLocationException | NullException e1) {
            System.err.println(e1.getMessage());
        }
    }
}
