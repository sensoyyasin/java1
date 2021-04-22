package intro;

public class Main {

	public static void main(String[] args) {
		
		
		String internetSubeButonu ="İnternet Şubesi";
		double dolarDun = 8.15;
		double dolarBugun = 8.18;
		int vade = 36;
		boolean dustuMu = false;
		
		
		System.out.println(internetSubeButonu);
		System.out.println(dolarDun);
		System.out.println(dustuMu);
		
		if(dolarBugun<dolarDun) {
			
			System.out.println("Dolar düştü icon");
		}
		else if(dolarDun == dolarBugun){
			
			System.out.println("Dolar eşitlendi icon");
		}
		else{
			System.out.println("Dolar yükseldi icon");
			
		}
		
		String kredi1 = "Hızlı Kredi";
		String kredi2 = "Çiftçi Kredisi";
		String kredi3 = "Mutlu Kredisi";
		String kredi4 = "Konut Kredisi";
		String kredi5 = "Msb kredisi";
		String kredi6 = "Meb kredisi";
		
		System.out.println(kredi1);
		System.out.println(kredi2);
		System.out.println(kredi3);
		System.out.println(kredi4);
		System.out.println(kredi5);
		System.out.println(kredi6);
		
		String[] krediler = {"Hızlı Kredi","Çiftçi Kredisi","Mutlu Kredisi"};
		
		//foreach
		for(String kredi :krediler) {
			System.out.println(kredi);
			
		}
		
		for(int i = 0; i<krediler.length;i++)
		{
			System.out.println(krediler[0]);
		}
	}

}
