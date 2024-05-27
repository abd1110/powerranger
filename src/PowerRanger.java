//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class PowerRanger {

    String name;

    String color;

    String weapon;

    int hitpoints;

    int range;

    PowerRanger(String name,String color, String weapon,int hitpoints, int range){

        this.name=name;
        this.color=color;
        this.weapon=weapon;
        this.hitpoints=hitpoints;
        this.range=range;
    }

    void attack () {
        System.out.println(name + " can attack");
    }
    void defend () {
        System.out.println(name + " can defend");
    }
    void dodge () {
        System.out.println(name + " can dodge");
    }
    void finishing_move () {
        System.out.println(name + " can perform the finishing move");
    }
}