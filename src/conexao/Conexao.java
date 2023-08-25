package conexao;

import java.sql.Connection;
import java.sql.DriverManager;

public class Conexao {

    private static final String DATABASE = "jdbc:mysql://localhost:3308/biblioteca";
    private static final String USER = "root";
    private static final String PASSWORD = "";

    public static Connection conexaoComOBanco () throws Exception {

        Connection connection = DriverManager.getConnection(DATABASE, USER, PASSWORD);

        return connection;

    }

    public static void main(String[] args) throws Exception{

        Connection connection = conexaoComOBanco();

        if (connection!=null){
            System.out.println("Conexão realizada com sucesso");
            connection.close();
        }
    }


}
