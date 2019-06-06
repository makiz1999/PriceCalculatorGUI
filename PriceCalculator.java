import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
public class PriceCalculator extends JFrame {
	private MeatChoice meat;
	private SidesChoice side;
	private DrinkChoice drink;
	private JPanel buttonPanel;
	private JButton calculate;
	private JButton exit;
	private final double TAX = 0.07;
	
	public PriceCalculator() {
		setTitle("Price Calculator");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setLayout(new BorderLayout());
		
		meat = new MeatChoice();
		side = new SidesChoice();
		drink = new DrinkChoice();
		
		buttons();
		add(meat, BorderLayout.WEST);
		add(side, BorderLayout.CENTER);
		add(drink, BorderLayout.EAST);
		add(buttonPanel, BorderLayout.SOUTH);
		
		pack();
		setVisible(true);	
	}
	private void buttons(){
		buttonPanel = new JPanel();
		calculate = new JButton("Calculate");
		exit = new JButton("Exit");
		calculate.addActionListener(new CalcListener());
		exit.addActionListener(new ExitListener());
		buttonPanel.add(calculate);
		buttonPanel.add(exit);
	}
	private class CalcListener implements ActionListener {
		public void actionPerformed(ActionEvent e) {
			double price, tax, total;
			price = meat.getMeatCost() + drink.getDrinkCost() + side.getSidesCost();
			tax = price * TAX;
			total = price + tax;
			
			JOptionPane.showMessageDialog(null, String.format("Price: %.2f\nTax: %.2f\nTotal: %.2f", price, tax, total));
		}
	}
	private class ExitListener implements ActionListener{
		public void actionPerformed(ActionEvent e) {
			System.exit(0);
		}
	}
	
	

	public static void main(String[] args) {
		new PriceCalculator();

	}

}
