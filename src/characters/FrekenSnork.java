package characters;

public class FrekenSnork extends Character{

    public FrekenSnork(String location) {
        setLocation(location);
        setName("������ �����");
        System.out.println(getName() + " ��������� � �������: " + getLocation() + ".");
    }



    @Override
    public void see(String something) throws NullException {
        if (something != null && !something.equals("")) {
            System.out.println(getName() + "  ���������� �� " + something);
        } else throw new NullException("������� ������ ��������!");
    }
}
