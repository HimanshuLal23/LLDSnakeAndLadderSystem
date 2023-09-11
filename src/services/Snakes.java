package services;

public class Snakes implements StaticMovers{
    int start;
    int end;
    public Snakes(int start,int end) {
        this.start = start;
        this.end = end;
    }
    @Override
    public int getEnd() {
        return this.end;
    }

    @Override
    public int getStart() {
        return start;
    }
}
