package com.ironhack.w2.d3;

public class Country {
    private String countryName;
    private String capital;
    private long population;
    private String leader;

    public Country(String countryName, String capital, long population, String leader) {
        this.countryName = countryName;
        this.capital = capital;
        this.population = population;
        this.leader = leader;
    }

    public String getCountryName() {
        return countryName;
    }

    public void setCountryName(String countryName) {
        this.countryName = countryName;
    }

    public String getCapital() {
        return capital;
    }

    public void setCapital(String capital) {
        this.capital = capital;
    }

    public long getPopulation() {
        return population;
    }

    public void setPopulation(long population) {
        this.population = population;
    }

    public String getLeader() {
        return leader;
    }

    public void setLeader(String leader) {
        this.leader = leader;
    }

    @Override
    public String toString() {
        return "Country{" +
                "countryName='" + countryName + '\'' +
                ", capital='" + capital + '\'' +
                ", population=" + population +
                ", leader='" + leader + '\'' +
                '}';
    }
}
