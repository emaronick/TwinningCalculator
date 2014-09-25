public class Attendance
	{
	private static int freshPresent, sophPresent, juniPresent, senioPresent,
			totalPresent, totalStudents;

	public static void calculatePresentStudents()
		{
		freshPresent = User.getFreshNumber() - User.getFreshAbs();
		sophPresent = User.getSophNumber() - User.getSophAbs();
		juniPresent = User.getJuniNumber() - User.getJuniAbs();
		senioPresent = User.getSenioNumber() - User.getSenioAbs();
		}

	public static void calculateTotalPresentStudentsAndTotalOverallStudents()
		{
		totalPresent = freshPresent + sophPresent + juniPresent + senioPresent;
		totalStudents = User.getFreshNumber() + User.getSophNumber() + User.getJuniNumber() + User.getSenioNumber();
		}

	public static int getFreshPresent()
		{
		return freshPresent;
		}

	public static void setFreshPresent(int freshPresent)
		{
		Attendance.freshPresent = freshPresent;
		}

	public static int getSophPresent()
		{
		return sophPresent;
		}

	public static void setSophPresent(int sophPresent)
		{
		Attendance.sophPresent = sophPresent;
		}

	public static int getJuniPresent()
		{
		return juniPresent;
		}

	public static void setJuniPresent(int juniPresent)
		{
		Attendance.juniPresent = juniPresent;
		}

	public static int getSenioPresent()
		{
		return senioPresent;
		}

	public static void setSenioPresent(int senioPresent)
		{
		Attendance.senioPresent = senioPresent;
		}

	public static int getTotalPresent()
		{
		return totalPresent;
		}

	public static void setTotalPresent(int totalPresent)
		{
		Attendance.totalPresent = totalPresent;
		}

	public static int getTotalStudents()
		{
		return totalStudents;
		}

	public static void setTotalStudents(int totalStudents)
		{
		Attendance.totalStudents = totalStudents;
		}
	}