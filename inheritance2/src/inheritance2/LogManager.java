package inheritance2;

public class LogManager {
	public void log(int logType) //logla anlam�nda
	{
		if(logType==1)
		{
			System.out.println("veritaban�na logland�");
		}
		else if(logType==2)
		{
			System.out.println("dodyaya logland�");
		}
		else
		{
			System.out.println("email g�nderildi.");
		}
	}

}
//Loglama t�rlerim �unlar olsun
//1-Database
//2-Dosya
//3-Email