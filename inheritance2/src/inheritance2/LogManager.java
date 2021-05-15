package inheritance2;

public class LogManager {
	public void log(int logType) //logla anlamýnda
	{
		if(logType==1)
		{
			System.out.println("veritabanýna loglandý");
		}
		else if(logType==2)
		{
			System.out.println("dodyaya loglandý");
		}
		else
		{
			System.out.println("email gönderildi.");
		}
	}

}
//Loglama türlerim þunlar olsun
//1-Database
//2-Dosya
//3-Email