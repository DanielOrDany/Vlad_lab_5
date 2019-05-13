package ua.lviv.iot.managers;

import java.util.List;

import ua.lviv.iot.models.FruitShop;
import ua.lviv.iot.models.SummerBerries;
import ua.lviv.iot.models.SummerCitrusFruits;

public interface IFruitShopManager<F> {
    List<FruitShop> getFruitShopList();

    List<FruitShop> sortByFruitColor(List<FruitShop> list, boolean sortOrder);

    List<FruitShop> sortByPrice(List<FruitShop> list, boolean sortOrder);

    void addFruit(FruitShop fruit);

    List<FruitShop> searchBySummerCitrusFruits(List<FruitShop> list, SummerCitrusFruits summerCitrusFruits);

    List<FruitShop> searchBySummerBerries(List<FruitShop> list, SummerBerries summerBerries);

    void printList();
}