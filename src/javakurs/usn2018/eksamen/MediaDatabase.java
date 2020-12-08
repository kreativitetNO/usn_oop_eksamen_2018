package javakurs.usn2018.eksamen;

import java.util.ArrayList;
import java.util.Arrays;

public class MediaDatabase {
	private MediaDatabase()
	{
		ImageSequence imageSequence = new ImageSequence();
		SoundClip soundTrack = new SoundClip("VideoSound.mp3", 8, (short)2, 44100, 16, null);
		
		MediaSource[] mediaSourceArray = new MediaSource[] {
			new SoundClip("Test.wmb", 10, (short)2, 44100, 16, null),
			new Video("Tfst.wmb", soundTrack, imageSequence)
		};
		
		mediaSources = new ArrayList<>(Arrays.asList(mediaSourceArray));
	}
	
	public static MediaDatabase getInstance()
	{
		if (mediaDatabase == null) {
			mediaDatabase = new MediaDatabase();
		}
		return mediaDatabase;
	}
	
	public ArrayList<MediaSource> getMediaSources() {
		return mediaSources;
	}
	
	public static void processMediaSources(DoSomethingWithMediaSource doSomething)
	{
		for (MediaSource mediaSource : MediaDatabase.getInstance().getMediaSources())
		{
			doSomething.doIt(mediaSource);
		}
	}
		
	public void sortMediaSources()
	{
//		Collections.sort(mediaSources);

//		mediaSources.sort((MediaSource m1, MediaSource m2) -> {
//			return m1.getLength() - m2.getLength();
//		});
		
		mediaSources.sort((MediaSource m1, MediaSource m2) -> {
			return m1.getName().compareTo(m2.getName());
		});		
	}

	private static MediaDatabase mediaDatabase;
	
	private ArrayList<MediaSource> mediaSources;
}
