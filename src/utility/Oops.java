package utility;

/** *****************************************************************************
 *	  Purpose: OOPS Utility class.
 *  @author  :  Ritesh Yadav
 *  @version :  1.2
 *  @since   :  15-11-2019
 *
 ***************************************************************************** */
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;
import org.codehaus.jackson.map.JsonMappingException;
import org.codehaus.jackson.map.ObjectMapper;
import org.codehaus.jackson.map.type.CollectionType;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;

public class Oops {
	static ObjectMapper objectMapper = new ObjectMapper();

	/**
	 * Define static function readJsonFile()
	 * 
	 * @param fileName
	 *            --> String
	 * @return String
	 */
	public static String readJsonFile(String filename) throws IOException {
		FileReader fileReader = new FileReader(filename);
		BufferedReader bufferedReader = new BufferedReader(fileReader);
		String str = "";
		String line = "";
		while ((line = bufferedReader.readLine()) != null) {
			str += line;
		}
		bufferedReader.close();
		return str;
	}

	/**
	 * Define static function writeFile()
	 * 
	 * @param json
	 *            --> String
	 * @param fileName
	 *            --> String
	 * @return void
	 */

	public static void writeFile(String json, String filename) throws IOException {
		FileWriter fw = new FileWriter(filename);
		BufferedWriter bw = new BufferedWriter(fw);
		bw.write(json);
		bw.close();
	}

	public static void writeFile1(JSONObject json, String filename) throws IOException {
		FileWriter fw = new FileWriter(filename);
		fw.write(json.toJSONString());
		fw.flush();
		fw.close();
	}

	/**
	 * Define static function userWriteValueString()
	 * 
	 * @param list
	 *            --> <T> Generic Type
	 * @return <T> String
	 */

	public static <T> String userWriteValueAsString(List<T> list) throws JsonMappingException, IOException {
		return objectMapper.writeValueAsString(list);
	}

	/**
	 * Define static function writeToFile()
	 * 
	 * @param list
	 *            --> <T> Generic Type
	 * @param fileName
	 *            --> String
	 * @return <T> void
	 */
//	public static <T> void writeToFile(String filename, List<T> list) throws JsonMappingException, IOException {
//		String jsonString = userWriteValueAsString(list);
//		writeFile(jsonString, filename);
//	}

	/**
	 * Define static function deckQueueStore()
	 * 
	 * @param deck
	 *            [] --> String
	 * @return Queue
	 */

	public static Queue deckQueueStore(String[] deck) {
		Queue mainQueue = new Queue();
		Queue Queue = new Queue();
		System.out.println("Total number of deck of cards are " + deck.length);
		for (int i = 0; i < 4; i++) {
			String[] demo = new String[9];
			for (int j = 0; j < 9; j++) {
				demo[j] = deck[i + j * 4];
			}
			String[] str2 = Algorithms.bubbleSort(demo, demo.length);
			for (int k = 0; k < str2.length; k++) {
				Queue.insert(str2[k]);
			}
			mainQueue.insert(Queue);
			Queue = new Queue();
			continue;
		}
		return mainQueue;
	}

	/**
	 * Define static function readJsonFile()
	 * 
	 * @param mainQueue
	 *            --> Queue
	 * @return void
	 */

	public static void displayDeck(Queue mainQueue) {
		for (int i = 0; i < mainQueue.getSize(); i++) {
			Queue queue2 = (Queue) mainQueue.remove();
			System.out.println("---------------------------------------- Person " + (i + 1)
					+ " -------------------------------------------");
			for (int j = 0; j < queue2.getSize(); j++) {
				System.out.print(queue2.remove() + " ");
			}
			System.out.println();
		}
	}

	/**
	 * Define static function userReadValue()
	 * 
	 * @param clazz
	 *            --> <> Generic Type
	 * @param str
	 *            --> String
	 * @return <T> List
	 */
	public static <T> List userReadValue(String str, Class<?> clazz) throws JsonMappingException, IOException {
		CollectionType colletion = objectMapper.getTypeFactory().constructCollectionType(ArrayList.class, clazz);
		return objectMapper.readValue(str, colletion);
	}

	/**
	 * Define static function getDate()
	 * 
	 * @return String
	 */
	public static String getDate() {
		DateTimeFormatter dtf = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm:ss");
		LocalDateTime now = LocalDateTime.now();
		String date = dtf.format(now);
		return date;
	}

	public static JSONObject readFile1(String fileName) {
		JSONObject object = new JSONObject();
		FileReader reader;
		try {
			reader = new FileReader(fileName);

			JSONParser parser = new JSONParser();
			object = (JSONObject) parser.parse(reader);
			reader.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
		return object;

	}
}