import java.util.ArrayList;
import java.util.List;
//Вычисление результирующего тотала по столбцам Qliq и Qoil, сгруппированного по датам
public class Total {
    private int total_column3;
    private int total_column4;
    private int total_column5;
    private int total_column6;
    private int total_column7;
    private int total_column8;
    private int total_column9;
    private int total_column10;

    private List<Integer> totals = new ArrayList<>();

    public List<Integer> getTotals(TableInfo tableInfo) {
        totals.clear();
        total_column3(tableInfo);
        total_column4(tableInfo);
        total_column5(tableInfo);
        total_column6(tableInfo);
        total_column7(tableInfo);
        total_column8(tableInfo);
        total_column9(tableInfo);
        total_column10(tableInfo);
        return totals;
    }

    public void total_column3(TableInfo tableInfo) {
        total_column3 = 0;
        for (int i = 0; i < tableInfo.getColumn3().size(); i++) {
            total_column3 += (int) tableInfo.getColumn3().get(i);
        }
        totals.add(total_column3);
    }

    public void total_column4(TableInfo tableInfo) {
        total_column4 = 0;
        for (int i = 0; i < tableInfo.getColumn4().size(); i++) {
            total_column4 += tableInfo.getColumn4().get(i);
        }
        totals.add(total_column4);
    }

    public void total_column5(TableInfo tableInfo) {
        total_column5 = 0;
        for (int i = 0; i < tableInfo.getColumn5().size(); i++) {
            total_column5 += tableInfo.getColumn5().get(i);
        }
        totals.add(total_column5);
    }

    public void total_column6(TableInfo tableInfo) {
        total_column6 = 0;
        for (int i = 0; i < tableInfo.getColumn6().size(); i++) {
            total_column6 += tableInfo.getColumn6().get(i);
        }
        totals.add(total_column6);
    }

    public void total_column7(TableInfo tableInfo) {
        total_column7 = 0;
        for (int i = 0; i < tableInfo.getColumn7().size(); i++) {
            total_column7 += tableInfo.getColumn7().get(i);
        }
        totals.add(total_column7);
    }

    public void total_column8(TableInfo tableInfo) {
        total_column8 = 0;
        for (int i = 0; i < tableInfo.getColumn8().size(); i++) {
            total_column8 += tableInfo.getColumn8().get(i);
        }
        totals.add(total_column8);
    }

    public void total_column9(TableInfo tableInfo) {
        total_column9 = 0;
        for (int i = 0; i < tableInfo.getColumn9().size(); i++) {
            total_column9 += tableInfo.getColumn9().get(i);
        }
        totals.add(total_column9);
    }

    public void total_column10(TableInfo tableInfo) {
        total_column10 = 0;
        for (int i = 0; i < tableInfo.getColumn10().size(); i++) {
            total_column10 += tableInfo.getColumn10().get(i);
        }
        totals.add(total_column10);
    }

    public void total_to_string(TableInfo tableInfo) {
        getTotals(tableInfo);
        System.out.print("\tTotal");
        for (int total : totals) {
            System.out.print("\t\t\t\t" + total);
        }
        System.out.println();
    }
}
