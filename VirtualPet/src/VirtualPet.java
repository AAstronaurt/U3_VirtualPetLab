// Part A

public class VirtualPet {
    private String name;
    private int energyLevels;
    private int happinessLevel;
    private int weight;
    private int ageYears;
    private int ageMonths;

    public VirtualPet(String petName){
        this.name = name;
        this.weight = 5;
    }

    public void setName(String n){
        this.name = n;
    }

    public String getName(){
        return name;
    }

    public void setAgeYears(int ageY){
        this.ageYears = ageY;
    }

    public int ageYears(){
        return ageYears;
    }

    public void setAgeMonths(int ageM){
        this.ageMonths = ageM;
    }

    public int ageMonths(){
        return ageMonths;
    }

    public void setEnergyLevels(int energyL){
        this.energyLevels = energyL;
    }

    public int getEnergyLevels(){
        return energyLevels;
    }

    public void setHappinessLevel(int happinessL){
        this.happinessLevel = happinessL;
    }

    public int getHappinessLevel(){
        return happinessLevel;
    }

    public String toString(){
        String result = "";
        result += name + "'s information: \n Energy: " + energyLevels + "\n Happiness: " + happinessLevel;
        result += "\n Weight: " + weight + "\n Age: " + ageMonths + " months and " + ageYears + " years";
        return result;
    }

    public void feed(){
        weight++;
        if(energyLevels > 0 && energyLevels < 10) {
            energyLevels++;
        }
    }

    public void play(){
        if(happinessLevel > 0 && happinessLevel < 10) {
            happinessLevel++;
        }
        weight--;
        if(weight < 5) {
            this.weight = 5;
        }
    }

    public void updateStatus(){
        if((happinessLevel > 0 && happinessLevel < 10) && (energyLevels > 0 && energyLevels < 10)){
            happinessLevel--;
            energyLevels--;
        }
        ageMonths++;
        if(ageMonths == 12){
            ageYears++;
            this.ageMonths = 0;
        }
    }
}
