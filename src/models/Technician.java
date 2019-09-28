package models;

import utilities.GenderType;

public class Technician extends Employee {

    private int nServers;

    public Technician(int nServers, double salary, String name, String birthdate, GenderType gender) {
        super(salary, name, birthdate, gender);
        this.nServers = nServers;
    }

    public int getnServers() {
        return nServers;
    }

    public void setnServers(int nServers) {
        this.nServers = nServers;
    }

    @Override
    public double bonus() {
        double bonus = employeeBonusBase + nServers * 50;
        return bonus;
    }

    @Override
    public void printExtraInfo() {
        System.out.println("       Responsible of: " + nServers + " servers");
    }

    @Override
    public String toString() {
        return super.toString();
    }

    @Override
    public int compareTo(Employee em) {
        return (int) (this.getSalary() - em.getSalary());
    }

}
