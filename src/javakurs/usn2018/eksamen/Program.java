package javakurs.usn2018.eksamen;

public class Program {
	public static void main(String[] args)
	{
		MediaDatabase md = MediaDatabase.getInstance();
		
		for (MediaSource mediaSource : md.getMediaSources())
		{
			System.out.println(mediaSource);
		}

		md.sortMediaSources();

		System.out.println();
		
		for (MediaSource mediaSource : md.getMediaSources())
		{
			System.out.println(mediaSource);
		}
		
		System.out.println();
		
		MediaDatabase.processMediaSources(ms -> {
			System.out.println(ms.getName().toUpperCase());
		});
		
		System.out.println();
		
		MediaDatabase.processMediaSources(ms -> {
			System.out.println(ms.getName().toLowerCase());
		});

		System.out.println();

		MediaDatabase.processMediaSources(ms -> {
			String name = ms.getName();
			System.out.println(name);
		});
	}
}
