package ru.geekbrains.lesson7.observer;

public class Master implements Observer{

    private String name;
    private int salary = 80000;
    private String searchingJob;

    public Master(String name) {
        this.name = name;
        this.searchingJob = searchingJob;
    }

    @Override
    public void receiveOffer(String nameCompany, int salary, Vacancy vacancy) {
        if (this.salary <= salary && searchingJob == vacancy.getName()){
            System.out.printf("Специалист %s: Мне нужна эта работа! (компания: %s; заработная плата: %d)\n",
                    name, nameCompany, salary, vacancy);
            this.salary = salary;
        }
        else {
            System.out.printf("Специалист %s: Я найду работу получше! (компания: %s; заработная плата: %d)\n",
                    name, nameCompany, salary);
        }
    }
}
