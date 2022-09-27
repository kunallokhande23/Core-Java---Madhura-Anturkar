package tester;

import static utils.FruitUtils.*;

import java.util.ArrayList;
import java.util.LinkedList;

import com.app.fruits.Apple;
import com.app.fruits.Fruit;

public class Test1 {

	public static void main(String[] args) {
		ArrayList<Apple> apples = new ArrayList<>();
		apples.add(new Apple("app1"));
		apples.add(new Apple("app2"));
		apples.add(new Apple("app3"));
		// method : List<? extends Fruit> fruits
		printFruitNames(apples);
		// Is List<Fruit> a super type of AL<Apple> ?????
		// Is List<Object> a super type of List<Emp> or List<Fruit> or List<Date> : NO
		// Is inheritance in generics working as usual ? NO
		// Will u be able to pass : LL<Alphonso> | Vector<Fruit> | HS <Fruit> | AL<
		// KashmiriApple> | AL<Object>
		// correct options : 1,2,4
		// What is the method arg : ? super Mango
//		addMango(apples);// err since u are allowed to pass a LIst of either Mango or its super type
							// type. Apple is not a super type of Mango
		LinkedList<Fruit> fruits=new LinkedList<>();
		addMango(fruits);
		//Vector<Object> objects , AL<Mango> mangoes  : both will work
		

	}

}
