import java.io.IOException;
import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;
//Заполнение базы данных
public class MySqlInsert {

    private static final String createTable="CREATE TABLE IF NOT EXISTS ExcelTable ("
            + "id INT NOT NULL AUTO_INCREMENT,"
            + "company VARCHAR(20),"
            + "fact_qliq_%s INT NOT NULL,"
            + "fact_qliq_%s INT NOT NULL,"
            + "fact_qoil_%s INT NOT NULL,"
            + "fact_qoil_%s INT NOT NULL,"
            + "forecast_qliq_%s INT NOT NULL,"
            + "forecast_qliq_%s INT NOT NULL,"
            + "forecast_qoil_%s INT NOT NULL,"
            + "forecast_qoil_%s INT NOT NULL,"
            + "PRIMARY KEY(id))";

    private static final String truncate = "TRUNCATE test.ExcelTable";

    private static final String insert = "INSERT INTO ExcelTable (id, company, fact_qliq_%s, fact_qliq_%s, fact_qoil_%s, fact_qoil_%s, forecast_qliq_%s, forecast_qliq_%s, forecast_qoil_%s, forecast_qoil_%s)"
                            + "VALUES (%d, '%s', %d, %d, %d, %d, %d, %d, %d, %d)";

    public static void createTable(TableInfo tableInfo, Connection conn) throws SQLException, IOException {
        Statement statement = conn.createStatement();
        statement.executeUpdate(String.format(createTable, tableInfo.getRowDate().get(2),
                tableInfo.getRowDate().get(3),
                tableInfo.getRowDate().get(4),
                tableInfo.getRowDate().get(5),
                tableInfo.getRowDate().get(6),
                tableInfo.getRowDate().get(7),
                tableInfo.getRowDate().get(8),
                tableInfo.getRowDate().get(9)));
        System.out.println("Table created");
    }

    public static void deleteData(Connection conn) throws SQLException {
        Statement statement = conn.createStatement();
        statement.executeUpdate(truncate);
        System.out.println("Table is cleared");
    }

    public static void insertData(TableInfo tableInfo, Connection conn) throws SQLException, IOException {
        Statement statement = conn.createStatement();
        for (int i = 0; i < tableInfo.getColumn1().size(); i++) {
            statement.executeUpdate(String.format(insert, tableInfo.getRowDate().get(2),
                    tableInfo.getRowDate().get(3),
                    tableInfo.getRowDate().get(4),
                    tableInfo.getRowDate().get(5),
                    tableInfo.getRowDate().get(6),
                    tableInfo.getRowDate().get(7),
                    tableInfo.getRowDate().get(8),
                    tableInfo.getRowDate().get(9),
                    tableInfo.getColumn1().get(i),
                    tableInfo.getColumn2().get(i),
                    tableInfo.getColumn3().get(i),
                    tableInfo.getColumn4().get(i),
                    tableInfo.getColumn5().get(i),
                    tableInfo.getColumn6().get(i),
                    tableInfo.getColumn7().get(i),
                    tableInfo.getColumn8().get(i),
                    tableInfo.getColumn9().get(i),
                    tableInfo.getColumn10().get(i)));
        }
        System.out.println("Data entered");
    }
}