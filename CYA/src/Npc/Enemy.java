package Npc;

public class Enemy {
    private String name;
    private String attacks;
 
    public void setName(String name){
        this.name = name;
    }

    public String getName(){
        return name;
    }

    public void setAttack(String attacks){
        this.attacks = attacks;
    }

    public String getAttack(){
        return attacks;
    }
}