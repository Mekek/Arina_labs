package characters;

public class FrekenSnork extends Character{

    public FrekenSnork(String location) {
        this.location = location;
        name = "������ �����";
        System.out.println(name + " ���������.");
    }



    @Override
    public void see(String something) throws NullException {
        if (something != null && !something.equals("")) {
            System.out.println(getName() + "  ���������� �� " + something);
        } else throw new NullException("������� ������ ��������!");
    }
}
