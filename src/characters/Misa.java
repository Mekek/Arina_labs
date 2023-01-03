package characters;

import Interface.TakeOff;
import Interface.TryOn;
import Wigs.Closet;
import Wigs.Color;
import Wigs.Wig;

public class Misa extends Character implements TryOn, TakeOff {
    public Misa (String location) {
        setLocation(location);
        setName("����");
        System.out.println(getName() + " ����� � ������������� � ��������� � �������: " + getLocation() + ".");
    }
    protected Color currentWig = Color.NOWIG;

    @Override
    public void see(String something) throws NullException {
        class Entity {
            void touch(){
                System.out.println("���������.");
            }
            void takeACloserLook(){
                System.out.println("������������.");
            }
        }
        if (something != null && !something.equals("")) {
            System.out.println(getName() + "  ���������� �� " + something);
        } else throw new NullException("������� ������ ��������!");
    }



    public void tryOn(Wig wig){
        currentWig = Color.valueOf(wig.getColor());
        Closet.Shelf.takeWig();
        System.out.println(getName() + " ������ " + currentWig.getColor() + " �����.");
    }

    public void takeOff(){
        System.out.println(getName() + " ����� �����.");
        Closet.Shelf.loadWig();
    }


}
