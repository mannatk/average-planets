package planets;

public class MassAverager 
{
	// Complete this. Retrieve the array of planets, then compute average mass.
	public float getMeanPlanetaryMass()
	{
		float average = 0; 
		Planet[] allPlanets = Planet.getAll();
		if(allPlanets.length > 0) {
			float totalMass = 0; 
			for(int i = 0; i < allPlanets.length; i++) {
				totalMass += allPlanets[i].getMass();
			}
			average = totalMass / allPlanets.length; 
		}
		return average;
	}
	
	
	//
	// In almost all classes in almost all 46B homework assignments, the main()
	// method is for you to test your code. The autograder doesn't look at the
	// output from main().
	//
	// Since this assignment is simple, there's really only 1 useful version of
	// main(), and it's provided here. Later, when your assignments are more
	// complicated, your main() will change several or many times as you develop
	// different pieces of your assignment.
	public static void main(String[] args)
	{
		MassAverager averager = new MassAverager();
		System.out.println(averager.getMeanPlanetaryMass());
	}
}
