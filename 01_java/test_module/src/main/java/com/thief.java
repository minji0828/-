package com;

public class thief extends character{

    public thief(String name, int health, int attackpower) {
        super(name, health, attackpower);
    }

    @Override
    public void attack() {
        System.out.println(getName() + "가 마법으로 " + getAttackpower() + "의 피해를 입혔다. ");
    }



}

}
