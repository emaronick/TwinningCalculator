public class TwinCalculatorRunner
	{
	
	public static void main(String[] args)
		{
		User.startGame();
		while (User.isAcceptNumbers() == false)
			{
			User.askForSchoolName();
			User.askForNumberOfFreshmen();
			User.askForNumberOfSophomores();
			User.askForNumberOfJuniors();
			User.askForNumberOfSeniors();
			User.askForAbsentFreshmen();
			User.askForAbsentSophomores();
			User.askForAbsentJuniors();
			User.askForAbsentSeniors();
			Attendance.calculatePresentStudents();
			Attendance.calculateTotalPresentStudentsAndTotalOverallStudents();
			User.reportInputValuesAndCalculationResults();
			User.askToCheckIfNumbersAreCorrect();
			User.reactToNumberCheck();
			}
		while (User.isAcceptableResponse() == false)
			{
			User.askAboutExistanceOfUniforms();
			User.reactToUniformQuestion();
			}
		if (User.getConfirmationYesOrNoUniform() == "Yes")
			{
			User.askForNumberOfTopUniformColors();
			User.askForNumberOfBottomUiformColors();
			Clothes.askForUniformTopColors();
			Clothes.askForUniformBottomColors();
			Clothes.createOutfitsAndCount();
			Clothes.calculateTwinningOddsWithUniforms();
			}
		if (User.getConfirmationYesOrNoUniform() == "No")
			{
			Clothes.informUserOfColorOptions();
			Clothes.calculateTwinningOddsWithoutUniforms();
			}
		User.announceDisclaimer();
		}
	}