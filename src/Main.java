import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;


public class Main {


	public static void main(String[] args) {

		
		System.out.println("Podaj słowo po polsku: ");
		Scanner scanner = new Scanner(System.in); 
		String polishword = scanner.next();
		
		List<String> users = new ArrayList<>();
		users.add("Stefan");
		users.add("Stefan1");
		users.add("Stefan2");
		users.add("Stefan3");
		users.add("Stefan4");
		users.add("Stefan5");
		users.add("Stefan6");
		users.add("Stefan7");
		
		System.out.println(users);
		
		for(String x:users){
			
			System.out.println(x);
			
		}
		
		
		Map<String,String> dictionary = new HashMap<>();
		
		//w ListArray dodajemy elemnt poprzez add a w HashMap poprzez put
		
		dictionary.put("kot","cat");
		dictionary.put("dom","house");
		dictionary.put("tata","father");
		dictionary.put("pies","dog");
		dictionary.put("cześć","hi");
		dictionary.put("palec","finger");
		dictionary.put("mama","mother");
		
		if(dictionary.containsKey(polishword.toLowerCase())){
			
			//w mapie get wyszukuje po kluczu
			
			System.out.println("Słowo po angielsku to: "+dictionary.get(polishword.toLowerCase()));
			
		}
		else 
		{
			System.out.println("nie znaleziono takiego słowa w słowniku");
			
		}
		
		
		
		System.out.println(dictionary);
		
		System.out.println(users.size());
		System.out.println(users.get(5));
		
		
		Set<String> uzytkownicy = new HashSet<>();
		uzytkownicy.add("małpa");
		uzytkownicy.add("kon");
		uzytkownicy.add("słoń");
		uzytkownicy.add("słoń");
		uzytkownicy.add("słoń");
		
		System.out.println(uzytkownicy.size());
		System.out.println(uzytkownicy);

		
		for(String x:uzytkownicy){
			
			System.out.println(x);
		}
		


	}

}
