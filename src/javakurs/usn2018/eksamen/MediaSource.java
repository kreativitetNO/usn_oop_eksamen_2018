package javakurs.usn2018.eksamen;

public abstract class MediaSource { // implements Comparable<MediaSource> {
	public MediaSource(String name, int length)
	{
		this.name = name;
		this.length = length;
	}
	
	public abstract long getSize();
	
//	@Override
//	public int compareTo(MediaSource other)
//	{
//		return this.name.compareTo(other.name);
//	}
	
	public void play() {
		System.out.println("(?) Playing " + getName());
	}
		
	public String getName() {
		return name;
	}

	public int getLength() {
		return length;
	}
	
	protected String name;
	protected int length;
}
