package characters;

import java.util.Objects;

public class FrekenSnork extends Character{

    public FrekenSnork(String location) {
        setLocation(location);
        setName("������ �����");
        System.out.println(getName() + " ��������� � �������: " + getLocation() + ".");
    }

    @Override
    public void see(String something, boolean closerLook) throws NullException {
        if (something != null && !something.equals("")) {
            System.out.println(getName() + "  ������� " + something);
        } else throw new NullException("������� ������ ��������!");
    }

    public void go(String place) throws CurrentLocationException, NullException {

        if (place != null && !place.equals("")) {
            if (!getLocation().equals(place)) {
                System.out.println(getName() + " ����� �� �������� � ���������: " + place);
                setLocation(place);
            }
            else {
                throw new CurrentLocationException(getName() + " ��� ��������� � ���� �������!");
            }
        }
        else throw new NullException("������� ������ ��������!");

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

    @Override
    public int hashCode() {
        return Objects.hash(getName(), getLocation());
    }
}
