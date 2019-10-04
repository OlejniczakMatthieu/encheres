package vues;

import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;


public class VueHotelDesVentes implements ActionListener {

    private JFrame frame = new JFrame("Bidder");
    private JTextField textField = new JTextField();
    private JButton bidButton = new JButton("Bid");
    private JLabel articleName = new JLabel("Article: ");
    private JLabel articlePrice = new JLabel("Price: ");
    private JLabel articleDepot = new JLabel("Depot: ");
    private JLabel lastBid = new JLabel("Last bid: ");

    public VueHotelDesVentes() {
        buildFrame();
    }

    private void buildFrame() {

        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JPanel contentPane = (JPanel) frame.getContentPane();

//        articleName.setText("  Article: " + auction.getArticleName());
        articleName.setText("  Article: " + " pieces");
        contentPane.add(articleName);

        articlePrice.setText("  Price: ");
        contentPane.add(articlePrice);

        lastBid.setText("  Last bid: " );
        contentPane.add(lastBid);

        textField.setColumns(5);
        textField.setText("");
        textField.setHorizontalAlignment(JTextField.RIGHT);
        contentPane.add(textField);

        bidButton.addActionListener(this);
        contentPane.add(bidButton);

        contentPane.setLayout(new GridLayout(6, 1));

        frame.pack();
        frame.setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent ae) {
    }
}
