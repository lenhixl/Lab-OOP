import javax.swing.JOptionPane;
public class Calculation {
        public static void main(String[] args) {
            String strNum1, strNum2;
            double num1, num2;

            strNum1 = JOptionPane.showInputDialog(null, "Please input the first number: ", "Input the first number", JOptionPane.INFORMATION_MESSAGE);
            strNum2 = JOptionPane.showInputDialog(null, "Please input the second number: ", "Input the second number", JOptionPane.INFORMATION_MESSAGE);

            num1 = Double.parseDouble(strNum1);
            num2 = Double.parseDouble(strNum2);

            JOptionPane.showMessageDialog(null, "Sum of two number is: " + (num1 + num2), "The sum", JOptionPane.INFORMATION_MESSAGE);
            JOptionPane.showMessageDialog(null, "Difference of two number is: " + (num1 - num2), "The difference", JOptionPane.INFORMATION_MESSAGE);
            JOptionPane.showMessageDialog(null, "Product of two number is: " + (num1 * num2), "The product", JOptionPane.INFORMATION_MESSAGE);

            if(num2 != 0) {
                JOptionPane.showMessageDialog(null, "Quotient of two number is: " + (num1 / num2), "The quotient", JOptionPane.INFORMATION_MESSAGE);
            } else {
                JOptionPane.showMessageDialog(null, "Can't find quotient", "Input error", JOptionPane.INFORMATION_MESSAGE);
            }
            System.exit(0);
        }
    }

