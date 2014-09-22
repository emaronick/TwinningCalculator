import java.util.Scanner;


public class User
	{
	private static String userSchool, confirmationYesOrNoNumbers, confirmationYesOrNoUniform;
	private static int freshNumber, sophNumber, juniNumber, senioNumber, freshAbs, sophAbs, juniAbs, senioAbs;
	private static boolean acceptNumbers = false;
	private static boolean acceptableResponse = false;

	public static String getUserSchool()
		{
		return userSchool;
		}

	public static void setUserSchool(String userSchool)
		{
		User.userSchool = userSchool;
		}

	public static String getConfirmationYesOrNoNumbers()
		{
		return confirmationYesOrNoNumbers;
		}

	public static void setConfirmationYesOrNoNumbers(String confirmationYesOrNoNumbers)
		{
		User.confirmationYesOrNoNumbers = confirmationYesOrNoNumbers;
		}

	public static String getConfirmationYesOrNoUniform()
		{
		return confirmationYesOrNoUniform;
		}

	public static void setConfirmationYesOrNoUniform(String confirmationYesOrNoUniform)
		{
		User.confirmationYesOrNoUniform = confirmationYesOrNoUniform;
		}

	public static int getFreshNumber()
		{
		return freshNumber;
		}

	public static void setFreshNumber(int freshNumber)
		{
		User.freshNumber = freshNumber;
		}

	public static int getSophNumber()
		{
		return sophNumber;
		}

	public static void setSophNumber(int sophNumber)
		{
		User.sophNumber = sophNumber;
		}

	public static int getJuniNumber()
		{
		return juniNumber;
		}

	public static void setJuniNumber(int juniNumber)
		{
		User.juniNumber = juniNumber;
		}

	public static int getSenioNumber()
		{
		return senioNumber;
		}

	public static void setSenioNumber(int senioNumber)
		{
		User.senioNumber = senioNumber;
		}

	public static int getFreshAbs()
		{
		return freshAbs;
		}

	public static void setFreshAbs(int freshAbs)
		{
		User.freshAbs = freshAbs;
		}

	public static int getSophAbs()
		{
		return sophAbs;
		}

	public static void setSophAbs(int sophAbs)
		{
		User.sophAbs = sophAbs;
		}

	public static int getJuniAbs()
		{
		return juniAbs;
		}

	public static void setJuniAbs(int juniAbs)
		{
		User.juniAbs = juniAbs;
		}

	public static int getSenioAbs()
		{
		return senioAbs;
		}

	public static void setSenioAbs(int senioAbs)
		{
		User.senioAbs = senioAbs;
		}

	public static boolean isAcceptNumbers()
		{
		return acceptNumbers;
		}

	public static void setAcceptNumbers(boolean acceptNumbers)
		{
		User.acceptNumbers = acceptNumbers;
		}

	public static boolean isAcceptableResponse()
		{
		return acceptableResponse;
		}

	public static void setAcceptableResponse(boolean acceptableResponse)
		{
		User.acceptableResponse = acceptableResponse;
		}

	public static void startGame()
		{
		System.out.println("Want to know your chance of \"twinning\" with someone else at your school today?");
		System.out.println("Obviously!");
		}
	
	public static void askForSchoolName()
		{
		System.out.println();
		System.out.println("First off, what is the name of your school?");
		Scanner inputBlock = new Scanner (System.in);
		userSchool = inputBlock.nextLine();
		}
	
	public static void askForNumberOfFreshmen()
		{
		System.out.println();
		System.out.println("How many freshmen attend your school?");
		Scanner inputBlock = new Scanner (System.in);
		freshNumber = inputBlock.nextInt();
		}
	
	public static void askForNumberOfSophomores()
		{
		System.out.println();
		System.out.println("How many sophomores?");
		Scanner inputBlock = new Scanner (System.in);
		sophNumber = inputBlock.nextInt();
		}
	
	public static void askForNumberOfJuniors()
		{
		System.out.println();
		System.out.println("How many juniors?");
		Scanner inputBlock = new Scanner (System.in);
		juniNumber = inputBlock.nextInt();
		}
	
	public static void askForNumberOfSeniors()
		{
		System.out.println();
		System.out.println("How many seniors?");
		Scanner inputBlock = new Scanner (System.in);
		senioNumber = inputBlock.nextInt();
		}
	
	public static void askForAbsentFreshmen()
		{
		System.out.println();
		System.out.println("How many freshmen are absent today?");
		Scanner inputBlock = new Scanner (System.in);
		freshAbs = inputBlock.nextInt();
		}
	
	public static void askForAbsentSophomores()
		{
		System.out.println();
		System.out.println("How many sophomores?");
		Scanner inputBlock = new Scanner (System.in);
		sophAbs = inputBlock.nextInt();
		}
	
	public static void askForAbsentJuniors()
		{
		System.out.println();
		System.out.println("How many juniors?");
		Scanner inputBlock = new Scanner (System.in);
		juniAbs = inputBlock.nextInt();
		}
	
	public static void askForAbsentSeniors()
		{
		System.out.println();
		System.out.println("How many seniors?");
		Scanner inputBlock = new Scanner (System.in);
		senioAbs = inputBlock.nextInt();
		}
	
	public static void reportInputValuesAndCalculationResults()
		{
		System.out.println();
		System.out.println("Your school's name is " + userSchool + ".");
		System.out.println("If you have " + freshNumber + " freshmen and " + freshAbs + " freshmen are absent, then there are " + Attendance.getFreshPresent() + " freshmen present today.");
		System.out.println("If you have " + sophNumber + " sophomores and " + sophAbs + " sophomores are absent, then there are " + Attendance.getSophPresent() + " sophomores present today.");
		System.out.println("If you have " + juniNumber + " juniors and " + juniAbs + " juniors are absent, then there are " + Attendance.getJuniPresent() + " juniors present today.");
		System.out.println("If you have " + senioNumber + " seniors and " + senioAbs + " seniors are absent, then there are " + Attendance.getSenioPresent() + " sophomores present today.");
		System.out.println("Assuming the above numbers are correct, that means that there are " + Attendance.getTotalStudents() + " total students at your school.");
		System.out.println("This also means that there are " + Attendance.getTotalPresent() + " students in school today.");
		}
	
	public static void askToCheckIfNumbersAreCorrect()
		{
		System.out.println();
		System.out.println("Are these numbers correct?");
		Scanner inputBlock = new Scanner (System.in);
		confirmationYesOrNoNumbers = inputBlock.nextLine();
		}
	
	public static void reactToNumberCheck()
		{
		System.out.println();
		switch(confirmationYesOrNoNumbers)
			{
			case "yes":
			case "Yes":
				{
				System.out.println("OK, let's continue.");
				acceptNumbers = true;
				}
				break;
			case "no":
			case "No":
				{
				System.out.println("OK, we'll go back and try again.");
				System.out.println();
				acceptNumbers = false;
				}
				break;
			default:
				{
				System.out.println("I'm sorry, but \"" + confirmationYesOrNoNumbers + "\" is not a valid answer. Please respond with a yes or a no.");
				System.out.println("Please resubmit your answers.");
				acceptNumbers = false;
				}
				break;
			}
		}
	
	public static void askAboutExistanceOfUniforms()
		{
		System.out.println();
		System.out.println("Are students at your school required to wear uniforms?");
		Scanner inputBlock = new Scanner (System.in);
		confirmationYesOrNoUniform = inputBlock.nextLine();
		}
	
	public static void reactToUniformQuestion()
		{
		System.out.println();
		switch(confirmationYesOrNoUniform)
			{
			case "yes":
			case "Yes":
				{
				confirmationYesOrNoUniform = "Yes";
				System.out.println("OK, let's continue.");
				System.out.println();
				acceptableResponse = true;
				}
				break;
			case "no":
			case "No":
				{
				confirmationYesOrNoUniform = "No";
				System.out.println("OK, let's continue.");
				System.out.println();
				acceptableResponse = true;
				}
				break;
			default:
				{
				System.out.println("I'm sorry, but \"" + confirmationYesOrNoUniform + "\" is not a valid answer. Please respond with a yes or a no.");
				System.out.println("Please resubmit your answer.");
				System.out.println();
				acceptableResponse = false;
				}
				break;
			}
		}
	
	}
