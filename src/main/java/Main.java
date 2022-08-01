import java.sql.SQLException;

public class Main {
	public static void main(String[] args) {
		JdbcCrudDemo crud = new JdbcCrudDemo();
		Student stud = new Student(50, "Saurabh", "Shrigonda");
		try {
//		crud.createStudent(stud);
			crud.getStudentRoll(20);
			crud.updateStudent(20);
			//crud.deleteStudentByRoll(50);
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
}
