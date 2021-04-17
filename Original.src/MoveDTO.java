public class MoveDTO {
    private String name;
    private int startCol;
    private int endCol;
    private int startRow;
    private int endRow;

    public String getName() {
        return name;
    }

    public int getEndRow() {
        return endRow;
    }

    public void setEndRow(int endRow) {
        this.endRow = endRow;
    }

    public int getStartRow() {
        return startRow;
    }

    public void setStartRow(int startRow) {
        this.startRow = startRow;
    }

    public int getEndCol() {
        return endCol;
    }

    public void setEndCol(int endCol) {
        this.endCol = endCol;
    }

    public int getStartCol() {
        return startCol;
    }

    public void setStartCol(int startCol) {
        this.startCol = startCol;
    }

    public void setName(String name) {
        this.name = name;
    }

    public MoveDTO(String name, int startCol, int endCol, int startRow, int endRow){
        super();
        this.name = name;
        this.startCol = startCol;
        this.endCol = endCol;
        this.startRow = startRow;
        this.endRow = endRow;
    }

}