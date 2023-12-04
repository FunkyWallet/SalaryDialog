// Page 85 Chapter 2 example
import javax.swing.JOptionPane;

public class SalaryDialog{
    public static void main(String[] args) {
        // Variables and Constants
        String wageString;
        String dependentsString;
        double wage;
        double weeklyPay;
        int dependents;
        final double HOURS_IN_WEEK = 37.5; // "final" makes this bad boy a constant, yo. Plus, it's all caps.

        // Input Phase
        wageString = JOptionPane.showInputDialog(null, "How much coin per hour?", "First Question", JOptionPane.INFORMATION_MESSAGE);
        wage = Double.parseDouble(wageString);
        dependentsString = JOptionPane.showInputDialog(null, "Now, enter the number of dependents:", "Second Question", JOptionPane.WARNING_MESSAGE);
        dependents = Integer.parseInt(dependentsString);
        
        // Processing phase
        weeklyPay = wage * HOURS_IN_WEEK;

        // Output phase
        JOptionPane.showMessageDialog(null, "Weekly Salary is $" + weeklyPay + "\nDedictions will be made for " + dependents + " dependents");
    }
}