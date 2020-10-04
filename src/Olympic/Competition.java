package Olympic;

public class Competition <competitionType> {
    private competitionType type;

    public void add( competitionType t){
        this.type = t;
    }
    public competitionType get(){
        return type;
    }
}
