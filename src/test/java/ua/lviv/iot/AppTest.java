package ua.lviv.iot;

import static org.junit.jupiter.api.Assertions.assertTrue;

import java.io.File;
import java.util.Comparator;
import java.util.LinkedList;
import java.util.List;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import ua.lviv.iot.managers.FSWriter;
import ua.lviv.iot.managers.FruitShopManagerImpl;
import ua.lviv.iot.managers.IFruitShopManager;
import ua.lviv.iot.models.CitrusFruits;
import ua.lviv.iot.models.Color;
import ua.lviv.iot.models.FruitShop;
import ua.lviv.iot.models.SummerCitrusFruits;
import ua.lviv.iot.models.Vitamin;

public class AppTest {
	 static IFruitShopManager<FruitShop> manager;
	 
	@BeforeAll
	public static void setUp() {
		manager = new FruitShopManagerImpl();
		  manager.addFruit(new CitrusFruits("Blueberry", Color.BLUE, 12.0, true, Vitamin.A, 0.175,
	                SummerCitrusFruits.Lemon, true));
	        manager.addFruit(
	                new CitrusFruits("Cherry", Color.RED, 22.0, false, Vitamin.D, 0.205, SummerCitrusFruits.Lime, false));
	        manager.addFruit(
	                new CitrusFruits("C2", Color.RED, 2.0, true, Vitamin.B, 0.235, SummerCitrusFruits.Lemon, false));
	        
	        File file = new File("D:\\Projects\\Java\\FruitShopByDany\\fruits.csv");
			FSWriter.writeToFile(manager.getFruitShopList());
			assertTrue(file.exists());
	}
	
	@Test
	@DisplayName("Sort fruit test by color  in ascending order")
	void testSortByFruitColorAs() {
		 manager.sortByFruitColor(manager.getFruitShopList(), true);
		 List<FruitShop> newList = new LinkedList<FruitShop>();
		  newList.add(new CitrusFruits("Cherry", Color.RED, 22.0, false, Vitamin.D, 0.205, SummerCitrusFruits.Lime, false));
		  newList.add(new CitrusFruits("C2", Color.RED, 2.0, true, Vitamin.B, 0.235, SummerCitrusFruits.Lemon, false));
		  newList.add(new CitrusFruits("Blueberry", Color.BLUE, 12.0, true, Vitamin.A, 0.175, SummerCitrusFruits.Lemon, true));
		  Assertions.assertEquals(manager.getFruitShopList().get(0).getName(),newList.get(0).getName());	
		  Assertions.assertEquals(manager.getFruitShopList().get(1).getName(),newList.get(1).getName());	
		  Assertions.assertEquals(manager.getFruitShopList().get(2).getName(),newList.get(2).getName());	
	}

	@Test
	@DisplayName("Sort fruit by color test in descending order")
	void testSortByFruitColorDes() {
		manager.sortByFruitColor(manager.getFruitShopList(), false);
		 List<FruitShop> newList = new LinkedList<FruitShop>();
		 newList.add(new CitrusFruits("Blueberry", Color.BLUE, 12.0, true, Vitamin.A, 0.175, SummerCitrusFruits.Lemon, true));
		 newList.add(new CitrusFruits("Cherry", Color.RED, 22.0, false, Vitamin.D, 0.205, SummerCitrusFruits.Lime, false));
		 newList.add(new CitrusFruits("C2", Color.RED, 2.0, true, Vitamin.B, 0.235, SummerCitrusFruits.Lemon, false));
		  Assertions.assertEquals(manager.getFruitShopList().get(0).getName(),newList.get(0).getName());	
		  Assertions.assertEquals(manager.getFruitShopList().get(1).getName(),newList.get(1).getName());	
		  Assertions.assertEquals(manager.getFruitShopList().get(2).getName(),newList.get(2).getName());	
	}
	
	@Test
	@DisplayName("Sort fruit by price test in ascending order")
	void testsortByPriceAs() {
		 manager.sortByPrice(manager.getFruitShopList(), true);
		 List<FruitShop> newList = new LinkedList<FruitShop>();
		  newList.add(new CitrusFruits("C2", Color.RED, 2.0, true, Vitamin.B, 0.235, SummerCitrusFruits.Lemon, false));
		  newList.add(new CitrusFruits("Blueberry", Color.BLUE, 12.0, true, Vitamin.A, 0.175, SummerCitrusFruits.Lemon, true));
		  newList.add(new CitrusFruits("Cherry", Color.RED, 22.0, false, Vitamin.D, 0.205, SummerCitrusFruits.Lime, false));
		  Assertions.assertEquals(manager.getFruitShopList().get(0).getName(),newList.get(0).getName());
		  Assertions.assertEquals(manager.getFruitShopList().get(1).getName(),newList.get(1).getName());
		  Assertions.assertEquals(manager.getFruitShopList().get(2).getName(),newList.get(2).getName());
	}
	
	@Test
	@DisplayName("Sort fruit by price test in descending order")
	void testsortByPriceDes() {
		 manager.sortByPrice(manager.getFruitShopList(), false);
		 List<FruitShop> newList = new LinkedList<FruitShop>();
		  newList.add(new CitrusFruits("Cherry", Color.RED, 22.0, false, Vitamin.D, 0.205, SummerCitrusFruits.Lime, false));
		  newList.add(new CitrusFruits("Blueberry", Color.BLUE, 12.0, true, Vitamin.A, 0.175, SummerCitrusFruits.Lemon, true));
		  newList.add(new CitrusFruits("C2", Color.RED, 2.0, true, Vitamin.B, 0.235, SummerCitrusFruits.Lemon, false));
		 Assertions.assertEquals(manager.getFruitShopList().get(0).getName(),newList.get(0).getName());			
		 Assertions.assertEquals(manager.getFruitShopList().get(1).getName(),newList.get(1).getName());			
		 Assertions.assertEquals(manager.getFruitShopList().get(2).getName(),newList.get(2).getName());			
	}
		
}
