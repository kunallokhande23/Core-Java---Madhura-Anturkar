package utils;

import java.util.List;

import com.app.fruits.Alphonso;
import com.app.fruits.Apple;
import com.app.fruits.Fruit;
import com.app.fruits.Mango;

public class FruitUtils {
	/*
	 * Write a method to display names of the fruits from List of ANY fruits (i.e it
	 * can be List of Apples / Mangoes / Alphonsos....)
	 * 
	 */
	public static void printFruitNames(List<? extends Fruit> fruits) //=> co variance
	//List<Fruit> => in variance : not variable !
	//? extends Fruit => Fruit or it's sub type
	//eg : ? extends Comparable => Comparable or it's sub type (imple class of Comparable)
	//extends in generics => upper bound
	{
		for(Fruit f : fruits)
			System.out.println(f.getName()); 
//		fruits.add(new Apple("app0"));
//		fruits.add(new Fruit("some fruit"));
//		fruits.add(new Object());
		
	}
	//PECS : Producer extends Consumer super
	//add a static method to add a Mango  to the basket
	//Basket(collection) : consumer  -- super
	//? super Mango => Mango or any of its super types (Fruit or Object)
	public static void addMango(List<? super Mango> basket) //contra variance
	//
	{
		basket.add(new Mango("mango1"));
//		basket.add(new Apple("app1"));
		//What all will u be able to add to such a basket ? Object , Fruit ,Apple, KashApple,Mango , Alphonso
		//Ans : Mango , Alphonso
//		basket.add(new Fruit("abc"));
//		basket.add(new Object());
		basket.add(new Alphonso("sdf"));		
	}
}
