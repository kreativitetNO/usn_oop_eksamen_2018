package javakurs.usn2018.eksamen;

public class SoundClip extends MediaSource {
	
	public SoundClip(String name,
			  int length,
			  short channelCount,
			  int samplingRate,
			  int bitDepth,
			  SSamples samples)
	{
		super(name, length);
		this.channelCount = Utilities.setVariableWithinRange("channelCount", channelCount, (short)1, (short)24);
		this.samplingRate = samplingRate;
		this.bitDepth = Utilities.setVariableWithinRange("bitDepth", bitDepth, 8 , 24);
		this.samples = samples;
	}
	
	@Override
	public void play() {
		System.out.println("(S) Playing " + getName());
	}

	@Override
	public long getSize()
	{
		return channelCount * samplingRate * (bitDepth / 8 + (bitDepth % 8 > 0 ? 1 : 0)) * length;
	}
	
	@Override
	public String toString()
	{
		return "S " + name + " " + length;
	}
	
	public boolean cdKvalitet()
	{
		if (channelCount < 2 || samplingRate < 44100 || bitDepth < 16)
		{
		    return false;
		}
		return true;
	}
	
	public int getChannelCount() {
		return channelCount;
	}

	public int getSamplingRate() {
		return samplingRate;
	}

	public int getBitDepth() {
		return bitDepth;
	}

	public SSamples getSamples() {
		return samples;
	}

	private short channelCount;
	private int samplingRate;
	private int bitDepth;
	private SSamples samples;
}
