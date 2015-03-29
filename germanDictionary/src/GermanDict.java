import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;


public class GermanDict {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		DictModel dict = new DictModel();
		Map<String, String> allEntries = dict.dict();
		System.out.println("The total number of entries:" +  allEntries.entrySet().size());
		Iterator<Entry<String, String>> mapIterator = allEntries.entrySet().iterator();
		while (mapIterator.hasNext()) {
			Map.Entry<String, String> mapEntry = mapIterator.next();
			System.out.println("The word: '" + mapEntry.getKey() + "' means '" + mapEntry.getValue() + "'"); 
		}
	}

}
