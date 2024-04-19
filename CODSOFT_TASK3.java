/*CODSOFT PROJECT 3: ATM INTERFACE USING AWT */

import java.awt.*;
import java.awt.event.*;

class SimpleATM extends Frame implements ActionListener {
    private double balance;
    private TextField amountField;
    private Label messageLabel;

    public SimpleATM() {
        balance = 0;  
        setTitle("ATM Interface");
        setSize(250, 120);
        setLayout(new GridLayout(3, 2));

        
        add(new Label("Amount:"));
        amountField = new TextField();
        add(amountField);

        Button checkBalanceButton = new Button("Check");
        Button withdrawButton = new Button("Withdraw");
        Button depositButton = new Button("Deposit");

        checkBalanceButton.addActionListener(this);
        withdrawButton.addActionListener(this);
        depositButton.addActionListener(this);

        add(checkBalanceButton);
        add(withdrawButton);
        add(depositButton);

        messageLabel = new Label();
        add(messageLabel);

        
        addWindowListener(new WindowAdapter() {
            public void windowClosing(WindowEvent e) {
                System.exit(0);
            }
        });
    }

    @Override
    public void actionPerformed(ActionEvent e) 
    {
        String command = e.getActionCommand();
        double amount = 0;

        try 
        {
            amount = Double.parseDouble(amountField.getText());
        } 
        catch (NumberFormatException ex) 
        {
            messageLabel.setText("Invalid input.");
            return;
        }

        switch (command) {
            case "Check":
                messageLabel.setText(String.format("Balance: $%.2f", balance));
                break;
            case "Withdraw":
                if (amount > 0 && amount <= balance) 
                {
                    balance -= amount;
                    messageLabel.setText(String.format("Withdrew: $%.2f", amount));
                } 
                else
                {
                    messageLabel.setText("Insufficient funds or invalid amount.");
                }
                break;
            case "Deposit":
                if (amount > 0) 
                {
                    balance += amount;
                    messageLabel.setText(String.format("Deposited: $%.2f", amount));
                } 
                else 
                {
                    messageLabel.setText("Invalid deposit amount.");
                }
                break;
        }
    }

    public static void main(String[] args) 
    {
        SimpleATM atm = new SimpleATM();
        atm.setVisible(true);
    }
}
