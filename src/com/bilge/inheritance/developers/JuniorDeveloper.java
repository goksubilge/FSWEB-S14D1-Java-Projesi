package com.bilge.inheritance.developers;

public class JuniorDeveloper extends Employee {

    public JuniorDeveloper(long id, String name) {
        super(id, name);
    }

    @Override
    public void work() {
        super.setSalary(30000);
        System.out.println(super.getName() + " (junior dev) begins to work !");
    }
    public void work(double salary) {
        super.setSalary(salary);
        System.out.println(super.getName() + " (junior dev) begins to work (it's not default salary)");
    }
}
/**
 * HRManager addEmployee isimli bir metoda sahip olmalı. Bu metod için gerekli Overload edilmiş hallerini tanımlamalısınız.
 * Bu metodun amacı JuniorDeveloper gelirse ilgili developeri juniorDevelopers dizisine eklemeli.
 * MidDeveloper gelirse ilgili developeri midDevelopers dizisine eklemeli.
 * SeniorDeveloper gelirse ilgili developeri seniorDevelopers dizisine eklemeli.
 * Bu eklemeler yapılırken ilgili dizide index alanı dolu mu diye bakılmalı. Doluysa içerdeki veri ezilmemeli. Bir uyarı verilmeli.
 * Aynı zamanda indexin hiç var olmadığı durum da göz önünde bulundurulmalı.
 */