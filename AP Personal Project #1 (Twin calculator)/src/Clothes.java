import java.util.Scanner;
import java.util.ArrayList;
import java.text.*;

public class Clothes
	{
	private static String topColor, bottomColor;
	private static double totalOutfitCombos, totalFreshTwins, totalSophTwins, totalJuniTwins, totalSenioTwins, presentFreshTwins, presentSophTwins, presentJuniTwins, presentSenioTwins, totalTwins, presentTwins;
	private static ArrayList<Clothes> outfit = new ArrayList<Clothes>();
	private static ArrayList<String> topColors = new ArrayList<String>();
	private static ArrayList<String> bottomColors = new ArrayList<String>();
	private static DecimalFormat decFor = new DecimalFormat("0");

	public Clothes(String t, String b)
		{
		topColor = t;
		bottomColor = b;
		}

	public static String getTopColor()
		{
		return topColor;
		}

	public static void setTopColor(String topColor)
		{
		Clothes.topColor = topColor;
		}

	public static String getBottomColor()
		{
		return bottomColor;
		}

	public static void setBottomColor(String bottomColor)
		{
		Clothes.bottomColor = bottomColor;
		}

	public String toString()
		{
		return "A " + topColor + " top and a " + bottomColor + " bottom.";
		}

	public static void askForUniformTopColors()
		{
		for (int i = 0; i < User.getNumberOfUniformTopColors(); i++)
			{
			System.out.println();
			System.out.println("Top color number " + (i + 1) + ": ");
			Scanner inputBlock = new Scanner(System.in);
			topColor = inputBlock.nextLine();
			topColors.add(topColor);
			}
		}

	public static void askForUniformBottomColors()
		{
		for (int i = 0; i < User.getNumberOfUniformBottomColors(); i++)
			{
			System.out.println();
			System.out.println("Bottom color number " + (i + 1) + ": ");
			Scanner inputBlock = new Scanner(System.in);
			bottomColor = inputBlock.nextLine();
			bottomColors.add(bottomColor);
			}
		}

	public static void createOutfitsAndCount()
		{
		if (User.getNumberOfUniformTopColors() < User.getNumberOfUniformBottomColors())
			{
			System.out.println();
			System.out.println("These are all of the possible outfit combinations:");
			System.out.println();
			for (int i = 0; i < User.getNumberOfUniformTopColors(); i++)
				{
				for (int j = 0; j < User.getNumberOfUniformBottomColors(); j++)
					{
					totalOutfitCombos++;
					outfit.add(new Clothes(topColors.get(i), bottomColors.get(j)));
					System.out.println(outfit.get(0));
					}
				}
			}
		if (User.getNumberOfUniformBottomColors() < User.getNumberOfUniformTopColors())
			{
			System.out.println();
			System.out.println("These are all of the possible outfit combinations:");
			System.out.println();
			for (int i = 0; i < User.getNumberOfUniformBottomColors(); i++)
				{
				for (int j = 0; j < User.getNumberOfUniformTopColors(); j++)
					{
					totalOutfitCombos++;
					outfit.add(new Clothes(topColors.get(j), bottomColors.get(i)));
					System.out.println(outfit.get(0));
					}
				}
			} 
		else
			{
			System.out.println();
			System.out.println("These are all of the possible outfit combinations:");
			System.out.println();
			for (int i = 0; i < User.getNumberOfUniformTopColors(); i++)
				{
				for (int j = 0; j < User.getNumberOfUniformBottomColors(); j++)
					{
					totalOutfitCombos++;
					outfit.add(new Clothes(topColors.get(j), bottomColors.get(i)));
					System.out.println(outfit.get(0));
					}
				}
			}
		System.out.println();
		System.out.println("This means that there are " + totalOutfitCombos + " different combinations of your school's uniform colors.");
		}
	
	public static void calculateTwinningOddsWithUniforms()
		{
		totalFreshTwins = ((1 / totalOutfitCombos) * User.getFreshNumber());
		totalSophTwins = ((1 / totalOutfitCombos) * User.getSophNumber());
		totalJuniTwins = ((1 / totalOutfitCombos) * User.getJuniNumber());
		totalSenioTwins = ((1 / totalOutfitCombos) * User.getSenioNumber());
		totalTwins = ((1 / totalOutfitCombos) * Attendance.getTotalStudents());
		presentFreshTwins = ((1 / totalOutfitCombos) * Attendance.getFreshPresent());
		presentSophTwins = ((1 / totalOutfitCombos) * Attendance.getSophPresent());
		presentJuniTwins = ((1 / totalOutfitCombos) * Attendance.getJuniPresent());
		presentSenioTwins = ((1 / totalOutfitCombos) * Attendance.getSenioPresent());
		presentTwins = ((1 / totalOutfitCombos) * Attendance.getTotalPresent());
		System.out.println();
		System.out.println("With " + decFor.format(totalOutfitCombos) + " different outfit combinations, in a school of " + Attendance.getTotalStudents() + " students,");
		System.out.println("on a day where every student is present, you are likely to be twinning with:");
		System.out.println(decFor.format(totalFreshTwins) + " freshmen,");
		System.out.println(decFor.format(totalSophTwins) + " sophomores,");
		System.out.println(decFor.format(totalJuniTwins) + " juniors,");
		System.out.println("and " + decFor.format(totalSenioTwins) + " seniors,");
		System.out.println("giving you a probability of twinning with " + decFor.format(totalTwins) + " students total.");
		System.out.println();
		System.out.println("Today, you are likely to be twinning with:");
		System.out.println(decFor.format(presentFreshTwins) + " freshmen,");
		System.out.println(decFor.format(presentSophTwins) + " sophomores,");
		System.out.println(decFor.format(presentJuniTwins) + " juniors,");
		System.out.println("and " + decFor.format(presentSenioTwins) + " seniors,");
		System.out.println("giving you a probability of twinning with " + decFor.format(presentTwins) + " students total.");
		}

	public static void informUserOfColorOptions()
		{
		System.out.println();
		System.out.println("Since your school does not require you to wear uniforms,");
		System.out.println("we will calculate your odds of twinning based on a set palette of colors.");
		System.out.println("We will assume that there are ten colors for both top and bottom because there are 7 colors in the rainbow, plus black, white, and brown.");
		}
	
	public static void calculateTwinningOddsWithoutUniforms()
		{
		System.out.println("This gives you a total of 100 possible outfit combinations at your school.");
		totalOutfitCombos = 100;
		totalFreshTwins = ((1 / totalOutfitCombos) * User.getFreshNumber());
		totalSophTwins = ((1 / totalOutfitCombos) * User.getSophNumber());
		totalJuniTwins = ((1 / totalOutfitCombos) * User.getJuniNumber());
		totalSenioTwins = ((1 / totalOutfitCombos) * User.getSenioNumber());
		totalTwins = 1 / totalOutfitCombos * Attendance.getTotalStudents();
		presentFreshTwins = ((1 / totalOutfitCombos) * Attendance.getFreshPresent());
		presentSophTwins = ((1 / totalOutfitCombos) * Attendance.getSophPresent());
		presentJuniTwins = ((1 / totalOutfitCombos) * Attendance.getJuniPresent());
		presentSenioTwins = ((1 / totalOutfitCombos) * Attendance.getSenioPresent());
		presentTwins = ((1 / totalOutfitCombos) * Attendance.getTotalPresent());
		System.out.println();
		System.out.println("With " + decFor.format(totalOutfitCombos) + " different outfit combinations, in a school of " + Attendance.getTotalStudents() + " students,");
		System.out.println("on a day where every student is present, you are likely to be twinning with:");
		System.out.println(decFor.format(totalFreshTwins) + " freshmen,");
		System.out.println(decFor.format(totalSophTwins) + " sophomores,");
		System.out.println(decFor.format(totalJuniTwins) + " juniors,");
		System.out.println("and " + decFor.format(totalSenioTwins) + " seniors,");
		System.out.println("giving you a probability of twinning with " + decFor.format(totalTwins) + " students total.");
		System.out.println();
		System.out.println("Today, you are likely to be twinning with:");
		System.out.println(decFor.format(presentFreshTwins) + " freshmen,");
		System.out.println(decFor.format(presentSophTwins) + " sophomores,");
		System.out.println(decFor.format(presentJuniTwins) + " juniors,");
		System.out.println("and " + decFor.format(presentSenioTwins) + " seniors,");
		System.out.println("giving you a probability of twinning with " + decFor.format(presentTwins) + " students total.");
		}
	}