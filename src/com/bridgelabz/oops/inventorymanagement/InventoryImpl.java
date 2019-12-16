package com.bridgelabz.oops.inventorymanagement;

/******************************************************************************
 * 
 * Purpose: Create a JSON file having Inventory Details for Rice, Pulses and
 * Wheats with properties name, weight, price per kg.
 ** 
 * @author : Ritesh Yadav
 * @version : 1.2
 * @since : 03-12-2019
 *
 ******************************************************************************/
import java.util.Iterator;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;

import utility.Utility;

public class InventoryImpl implements InventoryI {
	JSONObject jsonFinalObject = new JSONObject();
	JSONArray jsonArray = new JSONArray();
	int count = 0;
	Inventory inv = new Inventory();

	/**
	 * @param array
	 *            - json array
	 * @returns value of given inventory array
	 */
	double getValue(JSONArray array) {
		Iterator<?> iterator = array.iterator(); // iterator to iterate
		double value = 0; // inventory value
		while (iterator.hasNext()) {
			JSONObject obj = (JSONObject) iterator.next();
			double weight = (double) obj.get("weight");
			double price = (double) obj.get("price");
			value = value + weight * price; // adding value
		}
		return value;
	}

	/**
	 * Define Function writeData()
	 * 
	 * @param selectedOption
	 *            ->int
	 * @return void
	 */

	@SuppressWarnings("unchecked")
	@Override
	public void writeData(int selectedOption) {
		JSONObject json = InventoryRepository.readData();
		json = (JSONObject) json.get("Inventory");
		switch (selectedOption) {
		case 1:

			System.out.println("Enter How Many Types Of Rice You want To Add");
			count = Utility.inputInteger();

			jsonArray = (JSONArray) json.get("Rice");
			while (count > 0) {
				jsonArray.add(userinput());
				count--;
			}
			break;
		case 2:
			System.out.println("Enter How Many Types Of Wheat You want To Add");
			count = Utility.inputInteger();
			jsonArray = (JSONArray) json.get("Wheat");
			while (count > 0) {
				jsonArray.add(userinput());
				count--;
			}
			break;
		case 3:
			System.out.println("Enter How Many Types Of Pulses You want To Add");
			count = Utility.inputInteger();
			jsonArray = (JSONArray) json.get("Pulses");
			while (count > 0) {
				jsonArray.add(userinput());
				count--;
			}
			break;
		default:
			System.out.println("Invlaid Option");
			break;
		}
		jsonFinalObject.put("Inventory", json);

		InventoryRepository.writeData(jsonFinalObject);
	}

	/**
	 * Define function userInput()
	 * 
	 * @returns value of given JSONObject format
	 */
	@SuppressWarnings("unchecked")
	private JSONObject userinput() {
		JSONObject jsonObject = new JSONObject();
		System.out.println("Enter Name , Weight and PricePerKg : ");

		inv.setName(Utility.inputString());
		inv.setWeight(Utility.inputDouble());
		inv.setPrice(Utility.inputDouble());

		jsonObject.put("name", inv.getName());
		jsonObject.put("weight", inv.getWeight());
		jsonObject.put("price", inv.getPrice());

		return jsonObject;
	}

	/**
	 * Define Function inventoryList()
	 *
	 * @return void
	 */
	@Override
	public void inventryList() {
		jsonFinalObject = InventoryRepository.readData();
		System.out.println(jsonFinalObject);
	}

	/**
	 * Define Function calculation()
	 * 
	 * @param selected
	 *            ->int
	 * @return void
	 */

	@Override
	public void calculation(int selected) {
		jsonFinalObject = InventoryRepository.readData();
		JSONObject jsonObject = (JSONObject) jsonFinalObject.get("Inventory");
		double totalInventory = 0;

		switch (selected) {

		case 1:
			jsonArray = (JSONArray) jsonObject.get("Rice");
			System.out.println("Rice inventory value: " + getValue(jsonArray));
			break;
		case 2:
			jsonArray = (JSONArray) jsonObject.get("Wheat");
			System.out.println("Wheat inventory value: " + getValue(jsonArray));
			break;
		case 3:
			jsonArray = (JSONArray) jsonObject.get("Pulses");
			System.out.println("Pulses inventory value: " + getValue(jsonArray));
			break;
		case 4:
			jsonArray = (JSONArray) jsonObject.get("Rice");
			totalInventory = totalInventory + getValue(jsonArray);
			jsonArray = (JSONArray) jsonObject.get("Wheat");
			totalInventory = totalInventory + getValue(jsonArray);
			jsonArray = (JSONArray) jsonObject.get("Pulses");
			totalInventory = totalInventory + getValue(jsonArray);
			System.out.println("Total Inventory :" + totalInventory);
			break;
		default:
			System.out.println("Invalid Option!!!");
			break;
		}
	}
}