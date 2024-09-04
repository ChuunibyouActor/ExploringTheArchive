public class PlayerInfo {
    private int exp;
    private int level=1;
    private int evidence;
    private int mental;
    public PlayerInfo() {
        
    }
        public void addExp(int e){
            exp+=e;
            if (exp>(level*10)){
                exp=-(level*10);
                level++;
            }
        }
        public int getLevel(){
            return level;
        }
        public int getEvidence(){
            return evidence;
        }
        public void addEvidence(int a){
            evidence+=a;
        }
        public int getMental(){
            return mental;
        }
        public void setMental(int h){
            mental+=h;
        }
}


