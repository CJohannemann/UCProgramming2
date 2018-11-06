package pizza.order.gui;

import java.awt.BorderLayout;
import java.text.DecimalFormat;
import javax.swing.*;
import javax.swing.border.EtchedBorder;
import javax.swing.border.TitledBorder;

public class PizzaOrderFrame extends JFrame {

    private static final int FRAME_WIDTH = 500;
    private static final int FRAME_HEIGHT = 500;
    private JRadioButton thinCrust, regularCrust, deepDishCrust;
    private JComboBox<String> sizes;
    private JCheckBox cheese, pepporoni, sausage, bacon, ham, pineapple;
    private JTextArea orderArea;
    private JButton order, clear, quit;
    private int toppingCounter = 0;
    private int toppingTotal;
    private double pizzaPrice;
    private double subTotal;
    private double tax = .07;
    private double taxBill;
    private String crust = "";
    private double totBill;
    ButtonGroup bg = new ButtonGroup();

    public PizzaOrderFrame() {

        createMasterPanel();
        setSize(FRAME_WIDTH, FRAME_HEIGHT);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setTitle("Pizza Ordering GUI");
        setVisible(true);
    }

    private void createMasterPanel() {
        JPanel crustTypePanel = crustRadioButton();
        JPanel pizzaSizePanel = pizzaSizeCombobox();
        JPanel toppingPanel = toppingCheckbox();
        JPanel receiptPanel = receiptTextArea();
        JPanel buttonPanel = controlButtons();

        JPanel panel = new JPanel();
        panel.add(crustTypePanel);
        panel.add(pizzaSizePanel);
        panel.add(toppingPanel);
        panel.add(receiptPanel);
        add(panel, BorderLayout.CENTER);
        JPanel panel2 = new JPanel();
        panel2.add(buttonPanel);
        add(panel2, BorderLayout.SOUTH);
    }

    private JPanel crustRadioButton() {
        thinCrust = new JRadioButton("Thin");
        thinCrust.addActionListener((e) -> {
            crust = "Thin";
        });
        regularCrust = new JRadioButton("Regular");
        regularCrust.addActionListener((e) -> {
            crust = "Regular";
        });
        deepDishCrust = new JRadioButton("Deep-Dish");
        deepDishCrust.addActionListener((e) -> {
            crust = "Deep-Dish";
        });
        
        bg.add(thinCrust);
        bg.add(regularCrust);
        bg.add(deepDishCrust);

        JPanel panel = new JPanel();
        panel.add(thinCrust);
        panel.add(regularCrust);
        panel.add(deepDishCrust);
        panel.setBorder(new TitledBorder(new EtchedBorder(), "Crust Style"));
        return panel;
    }

    private JPanel pizzaSizeCombobox() {
        sizes = new JComboBox();
        String[] pizzaSizes = {"---Select---", "Small", "Medium", "Large", "Super"};
        for (String pizzaSize : pizzaSizes) {
            sizes.addItem(pizzaSize);
        }
        sizes.addActionListener((e) -> {
            String choice = (String) sizes.getSelectedItem();
            if (choice.equalsIgnoreCase("Small")) {
                pizzaPrice = 8.00;
            }
            if (choice.equalsIgnoreCase("Medium")) {
                pizzaPrice = 12.00;
            }
            if (choice.equalsIgnoreCase("Large")) {
                pizzaPrice = 16.00;
            }
            if (choice.equalsIgnoreCase("Super")) {
                pizzaPrice = 20.00;
            }
        });

        JPanel panel = new JPanel();
        panel.setBorder(new TitledBorder(new EtchedBorder(), "Sizes"));
        panel.add(sizes);
        return panel;
    }

    private JPanel toppingCheckbox() {
        cheese = new JCheckBox("Cheese");
        cheese.addActionListener((e) -> {
            if (cheese.isSelected()) {
                toppingCounter++;
                toppingTotal = toppingCounter;
            } else {
                toppingCounter--;
                toppingTotal = toppingCounter;
            }
        });
        pepporoni = new JCheckBox("Pepporoni");
        pepporoni.addActionListener((e) -> {
            if (pepporoni.isSelected()) {
                toppingCounter++;
                toppingTotal = toppingCounter;
            } else {
                toppingCounter--;
                toppingTotal = toppingCounter;
            }
        });

        sausage = new JCheckBox("Sausage");
        sausage.addActionListener((e) -> {
            if (sausage.isSelected()) {
                toppingCounter++;
                toppingTotal = toppingCounter;
            } else {
                toppingCounter--;
                toppingTotal = toppingCounter;
            }
        });

        bacon = new JCheckBox("Bacon");
        bacon.addActionListener((e) -> {
            if (bacon.isSelected()) {
                toppingCounter++;
                toppingTotal = toppingCounter;
            } else {
                toppingCounter--;
                toppingTotal = toppingCounter;
            }
        });

        ham = new JCheckBox("Ham");
        ham.addActionListener((e) -> {
            if (ham.isSelected()) {
                toppingCounter++;
                toppingTotal = toppingCounter;
            } else {
                toppingCounter--;
                toppingTotal = toppingCounter;
            }
        });

        pineapple = new JCheckBox("Pineapple");
        pineapple.addActionListener((e) -> {
            if (pineapple.isSelected()) {
                toppingCounter++;
                toppingTotal = toppingCounter;
            } else {
                toppingCounter--;
                toppingTotal = toppingCounter;
            }
        });

        JPanel panel = new JPanel();
        panel.add(cheese);
        panel.add(pepporoni);
        panel.add(sausage);
        panel.add(bacon);
        panel.add(ham);
        panel.add(pineapple);
        panel.setBorder(new TitledBorder(new EtchedBorder(), "Toppings"));

        return panel;
    }

    private JPanel receiptTextArea() {
        orderArea = new JTextArea(20, 40);
        orderArea.setEditable(false);
        JPanel panel = new JPanel();
        panel.add(orderArea);
        return panel;
    }

    private JPanel controlButtons() {
        order = new JButton("Order");
        order.addActionListener((e) -> {
            orderTotalPrintout();
        });

        clear = new JButton("Clear");
        clear.addActionListener((e) -> {
            clearTotalPrintOut();
        });

        quit = new JButton("Quit");
        quit.addActionListener((e) -> {
            System.exit(0);
        });

        JPanel panel = new JPanel();
        panel.add(order);
        panel.add(clear);
        panel.add(quit);

        return panel;
    }

    private void orderTotalPrintout() {
        DecimalFormat f = new DecimalFormat("0.00");
        String sTotal = "Sub-Total                   ";
        orderArea.append("===========================\n");
        orderArea.append("Crust style:                " + crust + "\n");
        orderArea.append("Topping total:              " + f.format(toppingTotal) + "\n");
        orderArea.append("Pizza price                   " + f.format(pizzaPrice) + "\n");
        orderArea.append("\n");
        orderArea.append("\n");
        orderArea.append("\n");
        orderArea.append("\n");
        totalAmt();
        orderArea.append("Sub-Total                   " + f.format(subTotal) + "\n");
        totalTax();
        orderArea.append(sTotal + f.format(taxBill) + "\n");
        orderArea.append("----------------------------------------------\n");
        totalBill();
        orderArea.append("Total:                          " + f.format(totBill));
    }
    
    private void clearTotalPrintOut(){
        orderArea.setText("");
        bg.clearSelection();
        cheese.setSelected(false);
        pepporoni.setSelected(false);
        sausage.setSelected(false);
        bacon.setSelected(false);
        ham.setSelected(false);
        pineapple.setSelected(false);
        sizes.setSelectedItem("---Select---");
    }
    
    private void totalAmt(){
        subTotal = (toppingTotal + pizzaPrice);
    }
    private void totalTax(){
        taxBill = (this.subTotal * .07);
    }
    private void totalBill(){
        totBill = subTotal + taxBill;
    }

}