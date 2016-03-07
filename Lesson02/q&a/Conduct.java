import java.util.ArrayList;
import java.util.List;

class Conduct
{
	public static void main(String [] args)
	{		
		
		Instrument violin = new MusicConductor("Violin", "Strings", 2.34f);				
		Instrument clarinet = new MusicConductor("Clarinet", "Woodwind", 1.45f);				
		Instrument frenchHorn = new MusicConductor("French Horn", "Brass", 5.43f);
				
		List<Instrument> instruments = new ArrayList<>();
		
		instruments.add(violin);
		instruments.add(clarinet);
		instruments.add(frenchHorn);
		
		for(Instrument instrument: instruments)
		{
			System.out.println(instrument.play(" The Four Seasons by Vivaldi"));
		}
	}
}

/*
Violin The Four Seasons by Vivaldi
Clarinet The Four Seasons by Vivaldi
French Horn The Four Seasons by Vivaldi
*/