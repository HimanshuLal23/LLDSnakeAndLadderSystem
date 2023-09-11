package services;

public class Board {
    private Cell cells[];
    public Board() {
        cells = new Cell[101];
        for(int i=0;i<101;i++) {
            cells[i] = new Cell(null);
        }
    }
    public Cell getCell(int pos) {
        return cells[pos];
    }
}
