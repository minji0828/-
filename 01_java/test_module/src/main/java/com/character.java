package com;

public abstract class character {

    private String name;
    private int health;
    protected static int attackpower = (int)(Math.random() * 21) + 10; ;

    public character(String name, int health, int attackpower) {

        this.name = name;
        this.health = health;
        this.attackpower = attackpower;
    }

    public abstract void attack();
    public String getName() {
        return name;
    }
    public int getHealth() {
        return health;
    }
    public int getAttackpower() {
        return attackpower;
    }
    public void setAttackpower(int attackpower) {
        this.attackpower = attackpower;
    }
}
