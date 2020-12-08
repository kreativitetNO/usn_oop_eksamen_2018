package javakurs.usn2018.eksamen;

public class Video extends MediaSource {
	public Video(String name, SoundClip soundClip, ImageSequence imageSequence) {
		// Ternary operator
//		super(name, soundClip.length > imageSequence.length ? soundClip.length : imageSequence.length);
		super(name, getLargest(soundClip.length, imageSequence.length));
	}
	
	private static int getLargest(int l1, int l2)
	{
		if (l1 > l2)
		{
			return l1;
		}
		else
		{
			return l2;
		}
	}
	
	@Override
	public void play() {
		System.out.println("(V) Playing " + getName());
	}
	
	@Override
	public long getSize() {
		return 0;
	}
	
	@Override
	public String toString()
	{
		return "V " + name + " " + length;
	}
	
	public SoundClip getSoundClip() {
		return soundClip;
	}

	public ImageSequence getImageSequence() {
		return imageSequence;
	}

	private SoundClip soundClip;
	private ImageSequence imageSequence;
}
