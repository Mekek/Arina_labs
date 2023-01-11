package characters;

import Interface.UseWig;
import Wigs.Closet;
import Wigs.Color;
import Wigs.Wig;


public class Misa extends Character implements UseWig {
    public Misa (String location) {
        setLocation(location);
        setName("����");
        System.out.println(getName() + " ����� � ������������� � ��������� � �������: " + getLocation() + ".");
    }
    protected Color currentWig = Color.NORMAL;

    @Override
    public void see(String something, boolean closerLook) throws NullException {
        class Entity { //Local class
            void touch(){
                System.out.println("��������� ������: " + something);
            }
            void takeACloserLook(){
                System.out.println(getName() + " ����� ������������� " + something);
            }
        }
        if (something != null && !something.equals("") && closerLook) {
            Entity entity = new Entity();
            entity.takeACloserLook();
        } else if (something != null && !something.equals("")) {
            System.out.println(getName() + "  ���������� �� " + something);
        } else throw new NullException("������� ������ ��������!");
    }

    public void go(String place) throws CurrentLocationException, NullException {

        if (place != null && !place.equals("")) {
            if (!getLocation().equals(place)) {
                System.out.println(getName() + " ������� � �������: " + place);
                setLocation(place);
            }
            else {
                throw new CurrentLocationException(getName() + " ��� ��������� � ���� �������!");
            }
        }
        else throw new NullException("������� ������ ��������!");

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

    @Override
    public String toString() {
        return "�������� " + getName() +
                " ��������� � �������: " + getLocation();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Character person = (Character) o;
//        return getName().equals(person.getName());
        return getName().equals(person.getName()) && getLocation().equals(person.getLocation());
    }


}
