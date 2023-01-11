package Wigs;

public class Closet {
    public static class Shelf { //Static nested class
        private static int amountOfClothes;

        public static void loadWig() {
            amountOfClothes += 1;
            System.out.println("����� �������� �� �����. ������ �� ����� " + amountOfClothes + " �������.");
        }

        public static void takeWig() {
            if (amountOfClothes > 0) {
                amountOfClothes -= 1;
                System.out.println("����� ����� � �����. ������ �� ����� " + amountOfClothes + " �������.");
            }
            else {
                System.out.println("�� ����� ��� �������, ����� �� �������!");
            }

        }
    }
}
