package inheritance2;

public class FileLogger extends Logger {//override etme , �zerine yazma
	@Override
	public void log()//log operasyonu
	{
		System.out.println("Dosya logland�.");
	}

}
