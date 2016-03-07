import java.util.ArrayList;
import java.util.List;

class Conduct
{
	public static void main(String [] args)
	{		
		
		Instrument musicConductViolin = new MusicConductor("Violin", "Strings", 2.34f);				
		Instrument musicConductClarinet = new MusicConductor("Clarinet", "Woodwind", 1.45f);				
		Instrument musicConductFrenchHorn = new MusicConductor("French Horn", "Brass", 5.43f);
				
		List<Instrument> musicConducts = new ArrayList<>();
		
		musicConducts.add(musicConductViolin);
		musicConducts.add(musicConductClarinet);
		musicConducts.add(musicConductFrenchHorn);
		
		for(Instrument musicConductor : musicConducts)
		{
			System.out.println(musicConductor.play(musicConductor.getName()));
		}
	}
}

/*
Violin playing the four seasons by Vivaldi
Clarinet playing the four seasons by Vivaldi
French Horn playing the four seasons by Vivaldi
*/