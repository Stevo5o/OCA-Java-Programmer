import java.util.ArrayList;
import java.util.List;

class Conduct
{
	public static void main(String [] args)
	{		
		List<Playable> orchestra = new ArrayList<Playable>();
		
		orchestra.add(new MusicConductor("Violin", "Strings", 2.34f));
		orchestra.add(new Clarinet("Clarinet", "Woodwind", 1.45f));
		orchestra.add(new FrenchHorn("French Horn", "Brass", 5.43f));
		
		MusicConductor musicConductor = new MusicConductor();
		
		for(Playable play: orchestra)
		{
			System.out.println(musicConductor.conductInstrument(play));
		}
	}
}

/*
MusicConductor: Violin The Four Seasons by Vivaldi
Clarinet playing The Four Seasons by Vivaldi.
French Horn playing The Four Seasons by Vivaldi.
*/