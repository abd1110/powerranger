public class ingame {
    public static void main(String[] args) {

        PowerRanger powerranger1 = new PowerRanger("Azdar", "Blue", "Staff", 100, 50);

        System.out.println(powerranger1.name);
        System.out.println(powerranger1.color);
        powerranger1.attack();
        powerranger1.defend();

    }

}

