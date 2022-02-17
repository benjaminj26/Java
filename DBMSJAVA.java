import 	java.sql.*;
import java.util.Scanner;

public class MyDBf1 {
	
	static Connection conn;
	public static void main(String[] args) throws SQLException {
		Scanner sc = new Scanner(System.in);
		do {
			System.out.println("1.Create");
			System.out.println("2.Write");
			System.out.println("3.Read");
			System.out.println("4.Update");
			System.out.println("5.Delete");
			System.out.println("6.Exit");
			System.out.print("Enter your choice: ");
			
			int choice = sc.nextInt();
			sc.nextLine();
				
				switch(choice) {
				case 1: 
					System.out.println("Enter the name of the table: ");
					String tName = sc.nextLine();
					createTable(tName, establishConnection());
					break;
				case 2: 
					System.out.println("Enter the name of the table: ");
					tName = sc.nextLine();
					writeTable(tName, establishConnection());
					break;
				case 3: 
					System.out.println("Enter the name of the table: ");
					tName = sc.nextLine();
					readTable(tName, establishConnection());
					break;
				case 5:
					System.exit(0);
				default:
					System.out.println("Invalid Input!!");
			}
		}while(true);
	}
	
	private static void createTable(String tName, Connection conn) throws SQLException {
		Statement stmt= conn.createStatement();
		String sql="create table " +
					tName +
				" (stdid int not null, "+
				"stdn varchar(57),"+
				"marks int, "+
				"grade char, "+
				"primary key (stdid))";
		stmt.executeUpdate(sql);
	}
	
	private static void writeTable(String tName, Connection conn) throws SQLException {
		Statement stmt= conn.createStatement();
		System.out.print("Enter the stdid:");
		Scanner sc = new Scanner(System.in);
		int stdid=sc.nextInt();
		sc.nextLine();
		System.out.print("Enter the stdn:");
		String stdn=sc.nextLine();
		System.out.print("Enter the marks:");
		int marks=sc.nextInt();
		sc.nextLine();
		System.out.print("Enter the grade:");
		char grade=sc.next().charAt(0);
		String sql="insert into "+
					tName + " values"+
				"("+stdid+",\""+stdn+"\","+marks+",\""+grade+"\")";
		stmt.executeUpdate(sql);
	}
	
	private static void readTable(String tName,Connection conn) throws SQLException {
		Statement stmt= conn.createStatement();
		String sql="select * from "+tName;
		ResultSet rs = stmt.executeQuery(sql);
		try {
			while(rs.next()) {
				System.out.println("Roll no: "+rs.getString(1));
				System.out.println("Name: "+rs.getString(2));
				System.out.println("Marks: "+rs.getString(3));
				System.out.println("Grade: "+rs.getString(4));
			}
		}catch(Exception e) {
            System.out.println(e);
		}
	}
	
	private static Connection establishConnection() {
		try {
			String userName = "bin";
			String password = "paayal";
			String url = "jdbc:mysql://localhost/bin";
			Connection conn = DriverManager.getConnection(url, userName, password);
			Class.forName("com.mysql.cj.jdbc.Driver");
			System.out.println("Connection Established");
			return conn;
		}catch(Exception e) {
			System.out.println(e);
			return conn;
		}
		
	}	

}
