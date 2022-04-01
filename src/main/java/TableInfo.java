import java.util.List;
//Хранение информации о таблице
public class TableInfo {
    private String tableName;

    private List<String> titles;
    private List<String> q_info;
    private List<String> rowDate;
    private List<Integer> column1;
    private List<String> column2;
    private List<Integer> column3;
    private List<Integer> column4;
    private List<Integer> column5;
    private List<Integer> column6;
    private List<Integer> column7;
    private List<Integer> column8;
    private List<Integer> column9;
    private List<Integer> column10;

    private int total_column3;
    private int total_column4;
    private int total_column5;
    private int total_column6;
    private int total_column7;
    private int total_column8;
    private int total_column9;
    private int total_column10;

    private List<Integer> totals;

    public void setTableName(String tableName) {
        this.tableName = tableName;
    }

    public void setTitles(List<String> titles) {
        this.titles = titles;
    }

    public void setQ_info(List<String> q_info) {
        this.q_info = q_info;
    }

    public void setRowDate(List<String> rowDate) {
        this.rowDate = rowDate;
    }

    public void setColumn1(List<Integer> column1) {
        this.column1 = column1;
    }

    public void setColumn2(List<String> column2) {
        this.column2 = column2;
    }

    public void setColumn3(List<Integer> column3) {
        this.column3 = column3;
    }

    public void setColumn4(List<Integer> column4) {
        this.column4 = column4;
    }

    public void setColumn5(List<Integer> column5) {
        this.column5 = column5;
    }

    public void setColumn6(List<Integer> column6) {
        this.column6 = column6;
    }

    public void setColumn7(List<Integer> column7) {
        this.column7 = column7;
    }

    public void setColumn8(List<Integer> column8) {
        this.column8 = column8;
    }

    public void setColumn9(List<Integer> column9) {
        this.column9 = column9;
    }

    public void setColumn10(List<Integer> column10) {
        this.column10 = column10;
    }

    public String getTableName() {
        return tableName;
    }

    public List<String> getTitles() {
        return titles;
    }

    public List<String> getQ_info() {
        return q_info;
    }

    public List<String> getRowDate() {
        return rowDate;
    }

    public List<Integer> getColumn1() {
        return column1;
    }

    public List<String> getColumn2() {
        return column2;
    }

    public List<Integer> getColumn3() {
        return column3;
    }

    public List<Integer> getColumn4() {
        return column4;
    }

    public List<Integer> getColumn5() {
        return column5;
    }

    public List<Integer> getColumn6() {
        return column6;
    }

    public List<Integer> getColumn7() {
        return column7;
    }

    public List<Integer> getColumn8() {
        return column8;
    }

    public List<Integer> getColumn9() {
        return column9;
    }

    public List<Integer> getColumn10() {
        return column10;
    }
}
