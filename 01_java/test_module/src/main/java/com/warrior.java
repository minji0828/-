package com;

public class warrior extends character {



    public warrior(String name, int health, int attackpower) {
        super(name, health, attackpower);
    }

    @Override
    public void attack() {
   System.out.println(getName() + "가 칼로 " + getAttackpower() + "의 피해를 입혔다. ");
     }



    }