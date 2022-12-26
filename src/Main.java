import characters.*;
import Wigs.*;
import characters.Character;

public class Main {
    public static void main (String [] args){
        Misa misa = new Misa("������� ����");
        FrekenSnork snork = new FrekenSnork("�������");
        BlackWig blackWig = new BlackWig();
        GoldWig goldWig = new GoldWig();
        RedWig redWig = new RedWig();
        System.out.println();

        System.out.println("�������� equals, hashCode, toString ��� ����������. ");
        System.out.println(misa.equals(snork));
        System.out.println(misa.hashCode());
        System.out.println(misa);
        System.out.println();


        snork.see("����� ������� �����, ������������� ������ ������������ �����.");
        snork.go("������� ����.");
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


    }
}
