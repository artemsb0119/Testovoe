import javax.swing.*;
import javax.swing.table.DefaultTableCellRenderer;
import javax.swing.table.TableColumnModel;
import java.awt.*;
//Вывод Excel таблицы в JTable
public class ContactForm extends JFrame {
    public ContactForm(TableInfo tableInfo, Total total) {
        super("Read Excel");
        super.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        JTable table = new JTable();
        table.setModel(new MyTableModel(tableInfo, total));
        this.add(table);
        table.setDefaultRenderer(Object.class, new DefaultTableCellRenderer() {
            @Override
            public Component getTableCellRendererComponent(JTable table, Object value, boolean isSelected, boolean hasFocus, int row, int column) {
                final Component c = super.getTableCellRendererComponent(table, value, isSelected, hasFocus, row, column);
                c.setBackground(row == 0 ? Color.LIGHT_GRAY : Color.WHITE);
                return c;
            }
        });
        TableColumnModel colMdl = table.getColumnModel();
        colMdl.getColumn(0).setPreferredWidth(20);
        colMdl.getColumn(1).setPreferredWidth(70);
        for (int i = 0; i < tableInfo.getRowDate().size() - 2; i++) {
            colMdl.getColumn(i+2).setPreferredWidth(150);
        }
        this.pack();
        this.setLocationRelativeTo(null);
        this.setVisible(true);
    }
}
