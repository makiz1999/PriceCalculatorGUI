import javax.swing.*;
import java.awt.*;

public class MeatChoice extends JPanel {
	
	
	public final double CHICKEN = 3.00;
	public final double PORK = 3.50;
	public final double BEEF = 2.50;
	public final double TURKEY = 3.15;
	
	private JRadioButton chicken;
	private JRadioButton pork;
	private JRadioButton beef;
	private JRadioButton turkey;
	private ButtonGroup meat;
	
	public MeatChoice() {
		setLayout(new GridLayout(4,1));
		chicken = new JRadioButton("Chicken", true);
		pork = new JRadioButton("Pork");
		beef = new JRadioButton("Beef");
		turkey = new JRadioButton("Turkey");
		
		meat = new ButtonGroup();
		meat.add(chicken);
		meat.add(pork);
		meat.add(beef);
		meat.add(turkey);
		
		setBorder(BorderFactory.createTitledBorder("Meat"));
		add(chicken);
		add(pork);
		add(beef);
		add(turkey);
	}
	public double getMeatCost(){
		double meatCost = 0.0;
		
		if (chicken.isSelected())
			meatCost = CHICKEN;
		else if (pork.isSelected())
			meatCost = PORK;
		else if (beef.isSelected())
			meatCost = BEEF;
		else
			meatCost = TURKEY;
		
		return meatCost;
	}
}