package intro;

public class Main {

	public static void main(String[] args) {
		
		//camelCase
		//Don't repeat yourself
		String internetSubeButonu ="�nternet �ubesi";
		double dolarDun = 8.15;
		double dolarBugun = 8.18;
		int vade = 36;
		boolean dustuMu = false;
		
		
		System.out.println(internetSubeButonu);
		System.out.println(dolarDun);
		System.out.println(dustuMu);
		
		if(dolarBugun<dolarDun) {
			
			System.out.println("Dolar d��t� icon");
		}
		else if(dolarDun == dolarBugun){
			
			System.out.println("Dolar e�itlendi icon");
		}
		else{
			System.out.println("Dolar y�kseldi icon");
			
		}
		
		String kredi1 = "H�zl� Kredi";
		String kredi2 = "�ift�i Kredisi";
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
		
		String[] krediler = {"H�zl� Kredi","�ift�i Kredisi","Mutlu Kredisi"};
		
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
