package hu.nive.ujratervezes.zarovizsga.workhours;

import java.time.LocalDate;

public class Worker {
    private String name;
    private int work;
    private LocalDate date;

    public Worker(String name, int work, LocalDate date) {
        this.name = name;
        this.work = work;
        this.date = date;
    }

    public String getName() {
        return name;
    }

    public int getWork() {
        return work;
    }

    public LocalDate getDate() {
        return date;
    }
}
