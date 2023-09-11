package services;

public class Cell {
    private StaticMovers staticMovers;
    public Cell(StaticMovers staticMovers) {
        this.staticMovers = staticMovers;
    }
    public void add(StaticMovers staticMovers) {
        this.staticMovers = staticMovers;
    }
    public int getEnd() {
        return staticMovers.getEnd();
    }
    public StaticMovers getStaticMovers() {
        return this.staticMovers;
    }
}
