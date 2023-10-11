package com.bilge.inheritance.developers;

public class Main {
    public static void main(String[] args) {
        JuniorDeveloper juniorDeveloper1 = new JuniorDeveloper(1, "Ahmet");
        JuniorDeveloper juniorDeveloper2 = new JuniorDeveloper(2, "Mehmet");
        juniorDeveloper1.work();
        juniorDeveloper2.work();


        MidDeveloper midDeveloper1 = new MidDeveloper(3, "ali");
        MidDeveloper midDeveloper2 = new MidDeveloper(4, "veli");
        midDeveloper1.work();
        midDeveloper2.work();

        SeniorDeveloper seniorDeveloper1 = new SeniorDeveloper(5, "Gül");
        SeniorDeveloper seniorDeveloper2 = new SeniorDeveloper(6, "Fatos");
        seniorDeveloper1.work();
        seniorDeveloper2.work();

        System.out.println("Senior default salary: " + seniorDeveloper1.getSalary());

        System.out.println("***---  HR MANAGER  ---***");

        HRManager hrManager = new HRManager(1, "Dogancan", new JuniorDeveloper[2], new MidDeveloper[2], new SeniorDeveloper[2]);
        hrManager.work();

        hrManager.addEmployee(0, juniorDeveloper1); // Dogancan (HR Manager) begins to work
        //hrManager.addEmployee(0,juniorDeveloper2); // Index is full: Junior
        hrManager.addEmployee(1, juniorDeveloper2); // HRManager{ juniors= [Employee{id= 1, name= Ahmet, salary= 30000.0}, Employee{id= 2, name= Mehmet, salary= 30000.0}], mids= [null, null], seniors= [null, null] }
        //hrManager.addEmployee(2, juniorDeveloper2); // Index is not found! JuniorDeveloperIndex 2 out of bounds for length 2 + .ArrayIndexOutOfBoundsException
        hrManager.addEmployee(0, midDeveloper1);
        hrManager.addEmployee(1, midDeveloper2);
        hrManager.addEmployee(0, seniorDeveloper1);
        hrManager.addEmployee(1, seniorDeveloper2);


        System.out.println(hrManager);


    }
}
