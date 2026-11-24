// Part B

public class VirtualPetB {
    // Part A
    private String petName;
    private int energyLevel;
    private int happinessLevel;
    private int weight;
    private int ageYears;
    private int ageMonths;

    public VirtualPetB(String petName){
        this.petName = petName;
        this.weight = 5;
    }

    public void setName(String n){
        this.petName = n;
    }

    public String getName(){
        return petName;
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
        this.energyLevel = energyL;
    }

    public int getEnergyLevel(){
        return energyLevel;
    }

    public void setHappinessLevel(int happinessL){
        this.happinessLevel = happinessL;
    }

    public int getHappinessLevel(){
        return happinessLevel;
    }

    public String toString(){
        String result = "";
        result += petName + "'s information: \n Energy: " + energyLevel + "\n Happiness: " + happinessLevel;
        result += "\n Weight: " + weight + "\n Age: " + ageMonths + " months and " + ageYears + " years";
        return result;
    }

    public void feed(Food food){
        if(weight < 5){
            weight = 5;
        }
        else{
            weight+=food.getWeightGain();
        }

        if(energyLevel >= 0 && energyLevel < 10) {
            energyLevel+=food.getEnergyIncrease();
            if (energyLevel > 10){
                energyLevel = 10;
            }
        }
        if(happinessLevel >= 0 && happinessLevel < 10) {
            happinessLevel += food.getHappinessIncrease();
            if(happinessLevel > 10){
                happinessLevel = 10;
            }
        }
    }

    public boolean play(Game game){
        if(game.isWinner()){
            if(happinessLevel >= 0 && happinessLevel < 10) {
                happinessLevel+=game.getHappinessIncr();
            }
            if(happinessLevel > 10){
                happinessLevel = 10;
            }
            return true;
        }
        else{
            // Don't check the game but the virtual pets thingy
            if(happinessLevel > 0 && happinessLevel < 10) {
                happinessLevel-=game.getHappinessIncr();
                if(happinessLevel < 0){
                    happinessLevel = 0;
                }
            }
        }

        if(weight < 5) {
            weight = 5;
        }
        else{
            weight-=game.getWeightDecr();
            if(weight < 5){
                weight = 5;
            }
        }
        return false;
    }

    public void updateStatus(){
        if((happinessLevel > 0 && happinessLevel < 10) && (energyLevel > 0 && energyLevel < 10)){
            happinessLevel--;
            energyLevel--;
        }

        ageMonths++;

        if(ageMonths >= 12){
            ageYears++;
            this.ageMonths = 0;
        }
    }
}