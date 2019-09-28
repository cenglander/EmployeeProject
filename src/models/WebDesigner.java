package models;

import java.util.ArrayList;
import utilities.GenderType;

public class WebDesigner extends Employee {

    private final ArrayList<String> websites = new ArrayList<>();

    public WebDesigner(double salary, String name, String birthdate, GenderType gender) {
        super(salary, name, birthdate, gender);
    }

    public ArrayList<String> getWebsites() {
        return websites;
    }

    @Override
    public double bonus() {
        double bonus = employeeBonusBase + websites.size() * 100;
        return bonus;
    }

    public void printExtraInfo() {
        System.out.println("       Number of websites: " + websites.size());
        System.out.println("       List of web sites: ");
        for (String website : websites) {
            System.out.println("       " + website);
        }
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
