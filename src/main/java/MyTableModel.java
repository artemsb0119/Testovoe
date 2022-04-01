import javax.swing.table.AbstractTableModel;
//Настройка и заполнение таблицы Jtable
public class MyTableModel extends AbstractTableModel {
    private TableInfo data;
    private Total sum;

    private String fact_qliq = "fact_qliq_%s";
    private String fact_qoil = "fact_qoil_%s";
    private String forecact_qliq = "forecact_qliq_%s";
    private String forecact_qoil = "forecact_qoil_%s";

    public MyTableModel(TableInfo tableInfo, Total total) {
        this.data = tableInfo;
        this.sum = total;
    }

    @Override
    public int getRowCount() {
        return data.getColumn1().size() +2;
    }

    @Override
    public int getColumnCount() {
        return data.getRowDate().size();
    }

    @Override
    public Object getValueAt(int rowIndex, int columnIndex) {
        if (rowIndex == 0){
            if (columnIndex < 2){
                return data.getRowDate().get(columnIndex);
            }
            if (columnIndex>=2&&columnIndex<4){
                return String.format(fact_qliq,data.getRowDate().get(columnIndex));
            }
            if (columnIndex>=4&&columnIndex<6){
                return String.format(fact_qoil,data.getRowDate().get(columnIndex));
            }
            if (columnIndex>=6&&columnIndex<8){
                return String.format(forecact_qliq,data.getRowDate().get(columnIndex));
            }
            if (columnIndex>=8&&columnIndex<10){
                return String.format(forecact_qoil,data.getRowDate().get(columnIndex));
            }
        }
        if (rowIndex>=1&&rowIndex<=data.getColumn1().size()){
            if (columnIndex==0){
                return data.getColumn1().get(rowIndex-1);
            }
            if (columnIndex==1){
                return data.getColumn2().get(rowIndex-1);
            }
            if (columnIndex==2){
                return data.getColumn3().get(rowIndex-1);
            }
            if (columnIndex==3){
                return data.getColumn4().get(rowIndex-1);
            }
            if (columnIndex==4){
                return data.getColumn5().get(rowIndex-1);
            }
            if (columnIndex==5){
                return data.getColumn6().get(rowIndex-1);
            }
            if (columnIndex==6){
                return data.getColumn7().get(rowIndex-1);
            }
            if (columnIndex==7){
                return data.getColumn8().get(rowIndex-1);
            }
            if (columnIndex==8){
                return data.getColumn9().get(rowIndex-1);
            }
            if (columnIndex==9){
                return data.getColumn10().get(rowIndex-1);
            }
        }
        if (rowIndex == data.getColumn1().size() + 1){
            if (columnIndex==1){
                return "Total";
            }
            if (columnIndex>=2){
                return sum.getTotals(data).get(columnIndex-2);
            }
        }
        return "";
    }
}
