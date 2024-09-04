abstract class Item implements SelectableItem {
    public void onSelect(PlayerInfo p){
        getReward(p);
    }
    public abstract String getDescription();
    public abstract void getReward(PlayerInfo p);
    public String toString(){
        return getDescription();
    }
}
class item1 extends Item {
    public String name = "Tattered Note\n";
    public String getDescription(){
        String description="a strange note found\n";
        return name+description;
    }
    public void getReward(PlayerInfo p){
        p.addEvidence(1);
    }
}
class item2 extends Item {
    public String name = "Strange Statue\n";
    public String getDescription(){
        String description="A strange, octopus like statue...\n";
        return name+description;
    }
    public void getReward(PlayerInfo p){
        p.addEvidence(2);
    }
}
class item3 extends Item {
    public String name = "Campus Coffee\n";
    public String getDescription(){
        String description="Nothing like a quick break\n";
        return name+description;
    }
    public void getReward(PlayerInfo p){
        p.setMental(1);
    }
}

