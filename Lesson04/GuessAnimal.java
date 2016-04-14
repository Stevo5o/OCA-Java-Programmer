class GuessAnimal
{
	public static void main(String [] args)
	{
		String animal = "Unknown";
		int weight = 700;
		char sex = 'm';
		double colorWaveLength = 1.630;
		if(weight >= 500){ animal = "elephant"; }
		if(colorWaveLength >= 1.621){ animal = "grey " + animal; }
		if(sex <= 'f'){ animal = "female " + animal; }
		System.out.println("The animal is a " + animal);
	}
}

// The animal is a grey elephant