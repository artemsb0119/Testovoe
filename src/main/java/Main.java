import java.io.IOException;
import java.sql.Connection;
import java.sql.SQLException;

public class Main extends ReadExcel {
    public static void main(String[] args) throws IOException, SQLException {
        String file = "D:\\Testovoe.xlsx";
        TableInfo tableInfo;
        Total total = new Total();
        tableInfo = ReadExcel.readFromExcel(file);
        total.total_to_string(tableInfo);
        new ContactForm(tableInfo,total);
        Connection conn = ConnectMySql.getConnection();
        MySqlInsert.createTable(tableInfo, conn);
        MySqlInsert.deleteData(conn);
        MySqlInsert.insertData(tableInfo, conn);
    }
}
