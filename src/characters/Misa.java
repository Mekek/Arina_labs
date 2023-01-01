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
    public void see(String something) throws NullException {
        if (something != null && something != "") {
            System.out.println(getName() + "  ���������� �� " + something);
        } else throw new NullException("������� ������ ��������!");
    }



    public void tryOn(Wig wig){
        currentWig = Color.valueOf(wig.getColor());
        System.out.println(getName() + " ������ " + currentWig.getColor() + " �����.");
    }

    public void takeOff(){
        System.out.println(getName() + " ����� �����.");
    }


}
