import javax.swing.*;
import java.awt.*;
public class SidesChoice extends JPanel{
	public final double MACARONI = 2.00;
	public final double MASHED_POTATOS = 1.70;
	public final double FRENCH_FRIES = 2.15;
	public final double CORN = 1.00;
	public final double GARLIC_BREAD = 1.35;
	public final double SALAD = 1.50;
	public final double VEGETABLES = 1.40;
	public final double RICE = 1.25;
	
	private JCheckBox macaroni;
	private JCheckBox mashedPotatos;
	private JCheckBox frenchFries;
	private JCheckBox corn;
	private JCheckBox garlicBread;
	private JCheckBox salad;
	private JCheckBox vegetables;
	private JCheckBox rice;
	
	public SidesChoice() {
		setLayout(new GridLayout(4,2));
		macaroni = new JCheckBox("Macaroni");
		mashedPotatos = new JCheckBox("Mashed Potatos");
		frenchFries = new JCheckBox("French Fries");
		corn = new JCheckBox("Corn");
		garlicBread = new JCheckBox("Gralic Bread");
		salad = new JCheckBox("Salad");
		vegetables = new JCheckBox("Vegetables");
		rice = new JCheckBox("Rice");
		
		setBorder(BorderFactory.createTitledBorder("Sides"));
		add(macaroni);
		add(mashedPotatos);
		add(frenchFries);
		add(corn);
		add(garlicBread);
		add(salad);
		add(vegetables);
		add(rice);
	}
	public double getSidesCost() {
		double sidesCost = 0.0;
		
		if (macaroni.isSelected())
			sidesCost += MACARONI;
		if (mashedPotatos.isSelected())
			sidesCost += MASHED_POTATOS;
		if (frenchFries.isSelected())
			sidesCost += FRENCH_FRIES;
		if (corn.isSelected())
			sidesCost += CORN;
		if (garlicBread.isSelected())
			sidesCost += GARLIC_BREAD;
		if (salad.isSelected())
			sidesCost += SALAD;
		if (vegetables.isSelected())
			sidesCost += VEGETABLES;
		if (rice.isSelected())
			sidesCost += RICE;
		
		return sidesCost;		
	}
}

