package day13_practice_tasks.state_task;

public class State {
    private String name, abbreviation, politicalParty, governor, senator;
    private int population;

    public State(String name, String abbreviation, String governor, String senator, String politicalParty, int population) {
        setName(name);
        this.abbreviation = abbreviation;
        this.governor = governor;
        this.senator = senator;
        this.politicalParty = politicalParty;
        this.population = population;
    }

    public void setAbbreviation(String abbreviation) {
        if (abbreviation!=null && !abbreviation.trim().isEmpty()){
            this.abbreviation = abbreviation;
        }

    }

    public void setGovernor(String governor) {
        if (governor!=null && !governor.trim().isEmpty()){
            this.governor = governor;
        }

    }

    public void setName(String name) {
        if (name!=null && !name.trim().isEmpty()){
            this.name = name;
        }

    }

    public void setPoliticalParty(String politicalParty) {
        if (politicalParty!=null && !politicalParty.trim().isEmpty()){
            this.politicalParty = politicalParty;
        }

    }

    public void setPopulation(int population) {
        if (population >0){
            this.population = population;
        }

    }

    public void setSenator(String senator) {
        if (senator!=null && !senator.trim().isEmpty()){
            this.senator = senator;
        }
    }

    public String getAbbreviation() {
        return abbreviation;
    }

    public String getGovernor() {
        return governor;
    }

    public String getName() {
        return name;
    }

    public String getPoliticalParty() {
        return politicalParty;
    }

    public int getPopulation() {
        return population;
    }

    public String getSenator() {
        return senator;
    }

    @Override
    public String toString() {
        return getClass().getSimpleName()+"{" +
                "abbreviation='" + abbreviation + '\'' +
                ", name='" + name + '\'' +
                ", politicalParty='" + politicalParty + '\'' +
                ", governor='" + governor + '\'' +
                ", senator='" + senator + '\'' +
                ", population=" + population +
                '}';
    }
}
