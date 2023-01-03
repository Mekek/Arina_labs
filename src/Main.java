import Interface.Existence;
import characters.*;
import Wigs.*;


public class Main {
    public static void main (String [] args) throws NullException {

        Existence universe = new Existence() {
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
        BlackWig blackWig = new BlackWig();
        BlackWig.Decoration blackWigDecoration = blackWig.new Decoration();
        blackWigDecoration.setDescription("������� �������");
        GoldWig goldWig = new GoldWig();
        RedWig redWig = new RedWig();
        RedWig anotherRedWig = new RedWig();
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


        snork.see("����� ������� �����, ������������� ������ ������������ �����.");
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
            misa.see("���� � �������.");
            blackWig.suit();
            misa.implement("���������.");
            misa.takeOff();
            misa.tryOn(redWig);
            redWig.suit();
            misa.takeOff();
            misa.tryOn(blackWig);
            blackWig.suit();
            misa.see("���� � �������.");
            misa.takeOff();
            misa.implement("���������� � ���.");
        } catch (CurrentLocationException | NullException e1) {
            System.err.println(e1.getMessage());
        }
    }
}
