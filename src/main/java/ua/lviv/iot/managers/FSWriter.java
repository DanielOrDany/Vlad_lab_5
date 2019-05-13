package ua.lviv.iot.managers;

import java.util.List;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;

import ua.lviv.iot.models.FruitShop;

public class FSWriter {
	
	public static void writeToFile(List <FruitShop> listOfFruits) {
		try (PrintWriter writer = new PrintWriter(
				new File("D:\\Projects\\Java\\FruitShopByDany\\fruits.csv"))) {
			
			StringBuilder sb = new StringBuilder();
			for (int i = 0; i < listOfFruits.size(); i++) {
				String adding ;
				if (listOfFruits.size() - 1 == i) {
					adding = "";
				}else {
					adding = "            |            ";
				}				
				FruitShop element = listOfFruits.get(i);
				sb.append(element.getHeaders()+" = ");
			    sb.append("("+element.toCSV()+")" + adding );
			}
			
			writer.write(sb.toString());

			System.out.println("done!");

		} catch (FileNotFoundException e) {
			System.out.println(e.getMessage());
		}
	}
	
}
