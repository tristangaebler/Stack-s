package stack.controller;

import java.util.Stack;
import stack.model.Dish;

public class Controller 
{
	private Stack<Dish>dishes;
	public void start()
	{
		dishStuff();
	}
	private void dishStuff()
	{
		dishes = new Stack<Dish>();
		dishes.add(new Dish(true, java.awt.Color.WHITE, 6));
		System.out.println(dishes.size());
		dishes.pop();
		dishes.push(new Dish(false, java.awt.Color.CYAN, 3));
		dishes.push(new Dish(false, java.awt.Color.RED, 7));
		dishes.add(new Dish(true, java.awt.Color.GREEN, 12));
		dishes.pop();
		dishes.peek();
		dishes.pop();
		System.out.println(dishes.size());
		
	}
}
