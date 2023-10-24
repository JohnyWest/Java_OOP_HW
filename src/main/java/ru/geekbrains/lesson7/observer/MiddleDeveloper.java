package ru.geekbrains.lesson7.observer;

public class MiddleDeveloper implements Observer{

    private String name;
    private int salary = 20000;
    private String searchingJob;
    public MiddleDeveloper(String name, String searchingJob) {
        this.name = name;
        this.searchingJob = searchingJob;
    }

    @Override
    public void receiveOffer(String nameCompany, int salary, Vacancy vacancy) {
        if (this.salary <= salary && this.searchingJob.equals(vacancy.getName())){
            System.out.printf("Разработчик %s: Мне нужна эта работа! (компания: %s; заработная плата: %d)\n",
                    name, nameCompany, salary, vacancy);
            this.salary = salary;
        }
        else {
            System.out.printf("Разработчик %s: Я найду работу получше! (компания: %s; заработная плата: %d)\n",
                    name, nameCompany, salary);
        }
    }
}
