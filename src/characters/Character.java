package characters;

import java.util.Objects;

public abstract class Character {
    protected String name;
    protected String location;


    public String getName() {
        return name;
    }

    public String getLocation() {
        return location;
    }


    public abstract void see(String something) throws NullException;

    public void say(String speech){
        System.out.println(getName() + " �������: " + speech);
    }
    public void go(String place) throws CurrentLocationException, NullException {
        if (place != null && place != "") {
            if (location != place) {
                System.out.println(getName() + " ������� � �������: " + place);
                location = place;
            }
            else {
                throw new CurrentLocationException(name + " ��� ��������� � ���� �������!");
            }
        }
        else throw new NullException("������� ������ ��������!");

    }
    public void implement (String action) throws NullException {
        if (action != null && action != "") {
            System.out.println(getName() + " ��������� ��������: " + action);
        } else throw new NullException("������� ������ ��������!");
    }

    @Override
    public String toString() {
        return "�������� " + name +
                " ��������� � �������: " + location;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Character character)) return false;
        return name.equals(character.name) && location.equals(character.location);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, location);
    }
}
