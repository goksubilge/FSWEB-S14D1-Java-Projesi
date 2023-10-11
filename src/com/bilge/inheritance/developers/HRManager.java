package com.bilge.inheritance.developers;

import java.util.Arrays;

public class HRManager extends Employee{
    // yazdığım class 'ları array halinde kullanabilme alıştırması bu.
    private JuniorDeveloper[] juniors; // = new JuniorDeveloper[4] array size verseydim // [nul,null,null,null] ve index'te de size 'dan daha büyük bir değere atama yapsaydım ARRAYINDEXOUTOFEXCEPOIN ERROR gelirdi. Bunun için try&catch yazıyorum method 'a.
    private  MidDeveloper[] mids;
    private SeniorDeveloper[] seniors;
    public HRManager(long id, String name, JuniorDeveloper[] juniors, MidDeveloper[] mids, SeniorDeveloper[] seniors) {
        super(id, name);
        this.juniors = juniors;
        this.mids = mids;
        this.seniors = seniors;
    }

    // juniors[index] != null && juniors[index].getName().contains(juniorDeveloper.getName()); (for döngüsünün içine) ile aynı isimlerin kontrolünü yapabilirim.
    public void addEmployee(int index,JuniorDeveloper juniorDeveloper){
try{
    if(juniors[index] == null) {
        juniors[index] = juniorDeveloper;
    } else {
        System.out.println("Index is full: Junior");
    }
} catch (ArrayIndexOutOfBoundsException exception){
    exception.printStackTrace();
    System.out.println("Index is not found! JuniorDeveloper" + exception.getMessage());
}
    }
    public void addEmployee(int index,MidDeveloper midDeveloper) {
try {
    if(mids[index] == null) {
        mids[index] = midDeveloper;
    } else {
        System.out.println("Index is full: Mid");
    }
} catch (ArrayIndexOutOfBoundsException exception){
    exception.printStackTrace();
    System.out.println("Index is not found! MidDeveloper" + exception.getMessage());
    }
}
public void addEmployee(int index, SeniorDeveloper seniorDeveloper) {
    try {
        if (seniors[index] == null) {
            seniors[index] = seniorDeveloper;
        } else {
            System.out.println("Index is full: Senior");
        }
    } catch (ArrayIndexOutOfBoundsException exception) {
        exception.printStackTrace();
        System.out.println("Index is not found! SeniorDeveloper" + exception.getMessage());
    }
}

    @Override
    public void work() {
        setSalary(70000);
        System.out.println( getName() + " (HR Manager) begins to work");
    }

    @Override
    public String toString() {
        return "HRManager{ " +
                "juniors= " + Arrays.toString(juniors) +
                ", mids= " + Arrays.toString(mids) +
                ", seniors= " + Arrays.toString(seniors) +
                 " }";
    }
}
