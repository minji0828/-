package com;

public class ach extends character {

    public ach(String name, int health, int attackpower) {
        super(name, health, attackpower);
    }

    @Override
    public void attack() {
        System.out.println(getName() + "가 마법으로 " + getAttackpower() + "의 피해를 입혔다. ");
    }



}

}
