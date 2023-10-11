package com.bilge.inheritance.developers;

public class MidDeveloper extends Employee{
    public MidDeveloper(long id, String name) {
        super(id, name);
    }

    @Override
    public void work() {
        super.setSalary(40000);
        System.out.println(getName() + " (mid dev) begins to work !");
    }
}
