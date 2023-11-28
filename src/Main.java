
public class Main {
	public static void main(String[] args)
	{
		long startingWorldPop = 150000000L;
		long endingWorldPop = 7700000000L;
		
		System.out.println("Average Population Growth " + AverageGrowth(startingWorldPop,endingWorldPop,2021));
		System.out.println("Exponential Population Growth " + ExponentialGrowth(startingWorldPop,endingWorldPop,2021));
		
		long startingBelieverPop = 13L;
		long endingBelieverPop = 2380000000L;
		
		System.out.println("Average Population Growth " + AverageGrowth(startingBelieverPop,endingBelieverPop,2021));
		System.out.println("Exponential Population Growth " + ExponentialGrowth(startingBelieverPop,endingBelieverPop,2021));
	}
	
	public static long AverageGrowth(long startingPop, long endingPop, int years)
	{
		long DifferenceInPop = endingPop - startingPop;
		return (DifferenceInPop / years);
	}
	public static long ExponentialGrowth(long startingPop, long endingPop, int years)
	{
		int targetYears = years;
		int yearsTaken = years + 1;
		int growthMultiplyRate = 2;
		while(yearsTaken > targetYears)
		{
			yearsTaken = 0;
			long currentPop = startingPop;
			while(currentPop < endingPop)
			{
				currentPop = currentPop + currentPop * growthMultiplyRate;
				yearsTaken++;
			}
		}
		return yearsTaken;
	}
}
