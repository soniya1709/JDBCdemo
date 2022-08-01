import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;


public class JdbcCrudDemo {
	/*
	 * C-create R-read U-update D-delete
	 */

	public boolean createStudent(Student student) throws SQLException {
		Connection con = Dbutil.getDbConnectio();
		PreparedStatement ptst = con.prepareStatement("insert into Student values(?,?,?)");
		ptst.setInt(1, student.getRoll());
		ptst.setString(2, student.getName());
		ptst.setString(3, student.getCollegename());
		int insert = ptst.executeUpdate();
		Dbutil.closeDbConnection();
		if (insert > 0) {
			return true;
		} else

			return false;

	}

	public Student getStudentRoll(int roll) throws SQLException {
		Connection con = Dbutil.getDbConnectio();
		PreparedStatement stmt = con.prepareStatement("select * from Student where roll=?");
        stmt.setInt(1,roll);
       // stmt.setString(2, "name");
        //stmt.setString(3, "collegename");
        ResultSet rs=stmt.executeQuery();
		
		while(rs.next()) {
			System.out.println(rs.getInt(1)+ " : "+rs.getString("name")+" : "+rs.getString("collegename"));

		}
		
		
         Dbutil.closeDbConnection();
		return null;

	}

	public boolean updateStudent(int roll) throws SQLException {
		Connection con=Dbutil.getDbConnectio();
		PreparedStatement ptst=con.prepareStatement("update Student set name=?,collegename=? where roll=?");
		ptst.setString(1,"Soniya");
		ptst.setString(2,"koregaon");
		ptst.setInt(3,roll);
		int res=ptst.executeUpdate();
		System.out.println(res);
		Dbutil.closeDbConnection();
		if(res>0) {
			return true;
		}
		else
		return false;

	}

	public boolean deleteStudentByRoll(int roll) throws SQLException {
		Connection con=Dbutil.getDbConnectio();
		PreparedStatement ptst=con.prepareStatement("delete from Student where roll=?");
		ptst.setInt(1, roll);
		 int res=ptst.executeUpdate();
		 System.out.println(res);
		 Dbutil.closeDbConnection();
		return false;

	}
}
