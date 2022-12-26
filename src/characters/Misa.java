package characters;

import Interface.TakeOff;
import Interface.TryOn;
import Wigs.Color;
import Wigs.Wig;

public class Misa extends Character implements TryOn, TakeOff {
    public Misa (String location) {
        this.location = location;
        name = "����";
        System.out.println(name + " ����� � �������������.");
    }


    protected Color currentWig = Color.NOWIG;

    @Override
    public void see(String something) {
        System.out.println(getName() + "  ���������� �� " + something );
    }



    public void tryOn(Wig wig){
        currentWig = Color.valueOf(wig.getColor());
        System.out.println(getName() + " ������ " + currentWig + " �����.");
    }

    public void takeOff(){
        System.out.println(getName() + " ����� �����.");
    }


}