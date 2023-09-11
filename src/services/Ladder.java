package services;

public class Ladder implements StaticMovers{
    int start;
    int end;
    public Ladder(int start,int end) {
        this.start = start;
        this.end = end;
    }
    @Override
    public int getEnd() {
        return this.end;
    }
    @Override
    public int getStart() {
        return this.start;
    }
}
