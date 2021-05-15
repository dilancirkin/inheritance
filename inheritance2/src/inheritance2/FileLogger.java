package inheritance2;

public class FileLogger extends Logger {//override etme , üzerine yazma
	@Override
	public void log()//log operasyonu
	{
		System.out.println("Dosya loglandý.");
	}

}
