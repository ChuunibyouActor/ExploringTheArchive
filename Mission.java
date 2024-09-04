import java.lang.Math;
abstract class Mission implements SelectableItem {
    protected int difficulty;
    public void onSelect(PlayerInfo p){
        setDifficult();
        int rand = p.getLevel()+(int)(Math.random() * 10) + 1;
        System.out.println(rand);
        if(rand>difficulty){
            System.out.println("Your investigation succeeded!");
            getReward(p);
        }
        else{
            System.out.println("Your investigation failed!");
            getPenalty(p);
        }
    }
    public abstract void setDifficult();
    public abstract String getDescription();
    public abstract void getReward(PlayerInfo p);
    public abstract void getPenalty(PlayerInfo p);
    public String toString(){
        return getDescription();
    }
}
class Mission1 extends Mission {
    public void setDifficult(){
        difficulty=3;
    }
    public String name="Stake out the unused classroom\n";
    public String getDescription(){
        String description="Why doesn’t anyone use this classroom anymore…Perhaps if we hid in a cabinet we could find more information\n";
        return name+description;
    }
    public void getReward(PlayerInfo p){
        p.addExp(1);
    }
    public void getPenalty(PlayerInfo p){
        p.addEvidence(-1);
    }
}
class Mission2 extends Mission {
    public void setDifficult(){
        difficulty=7;
    }
    public String name = "Break into the accounting office\n";
    public String getDescription(){
        String description="Someone... or something is stealing money and covering it up.\n";
        return name+description;
    }
    public void getReward(PlayerInfo p){
        p.addExp(7);
        p.addEvidence(4);
    }
    public void getPenalty(PlayerInfo p){
        p.addEvidence(-1);
        p.setMental(-1);
    }
}
class Mission3 extends Mission {
    public void setDifficult(){
        difficulty=9;
    }
    public String name = "Search the attic in the science building\n";
    public String getDescription(){
        String description="Strange sounds have been coming from the science building as of late\n";
        return name+description;
    }
    public void getReward(PlayerInfo p){
        p.addExp(10);
        p.addEvidence(5);
    }
    public void getPenalty(PlayerInfo p){
        p.addEvidence(-1);
        p.setMental(-2);
    }
}
class Mission4 extends Mission {
    public void setDifficult(){
        difficulty=12;
    }
    public String name = "Explore the Archeology Wing\n";
    public String getDescription(){
        String description="Strange rumors have been swirling about a new sarcophagus\n";
        return name+description;
    }
    public void getReward(PlayerInfo p){
        p.addExp(10);
        p.addEvidence(5);
    }
    public void getPenalty(PlayerInfo p){
        p.setMental(-2);
    }
}
class Mission5 extends Mission {
    public void setDifficult(){
        difficulty=15;
    }
    public String name="Enter the Archives";
    public String getDescription(){
        String description="Very few who go to the archives ever return... and none are the same";
        return name+description;
    }
    public void getReward(PlayerInfo p){
        p.addExp(15);
        p.addEvidence(10);
    }
    public void getPenalty(PlayerInfo p){
        p.addEvidence(-5);
        p.setMental(-3);
    }
}