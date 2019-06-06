import javax.swing.*;
import java.awt.*;
public class DrinkChoice extends JPanel{
	public final double LARGE_SOFT_DRINK = 1.50;
	public final double MEDIUM_SOFT_DRINK = 1.25;
	public final double SMALL_SOFT_DRINK = 1.00;
	public final double COFFEE = 2.00;
	
	private JRadioButton largeSoftDrink;
	private JRadioButton mediumSoftDrink;
	private JRadioButton smallSoftDrink;
	private JRadioButton coffee;
	private ButtonGroup drink;
	
	public DrinkChoice() {
		setLayout(new GridLayout(4,1));
		largeSoftDrink = new JRadioButton("Large Soft Drink", true);
		mediumSoftDrink = new JRadioButton("Medium Soft Drink");
		smallSoftDrink = new JRadioButton("Small Soft Drink");
		coffee = new JRadioButton("Coffee");
		
		drink = new ButtonGroup();
		drink.add(largeSoftDrink);
		drink.add(mediumSoftDrink);
		drink.add(smallSoftDrink);
		drink.add(coffee);
		
		setBorder(BorderFactory.createTitledBorder("Drink"));
		add(largeSoftDrink);
		add(mediumSoftDrink);
		add(smallSoftDrink);
		add(coffee);
	}
	public double getDrinkCost() {
		double drinkCost = 0.0;
		if (largeSoftDrink.isSelected())
			drinkCost = LARGE_SOFT_DRINK;
		else if (mediumSoftDrink.isSelected())
			drinkCost = MEDIUM_SOFT_DRINK;
		else if (smallSoftDrink.isSelected())
			drinkCost = SMALL_SOFT_DRINK;
		else
			drinkCost = COFFEE;
		return drinkCost;
	}

}
