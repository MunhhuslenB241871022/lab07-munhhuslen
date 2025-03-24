class CartScreen {
    public static void showCartScreen() {
        JFrame frame = new JFrame("Таны сагс");
        frame.setSize(300, 200);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLayout(null);

        JLabel lblCart = new JLabel("Сагсанд байгаа бараанууд:");
        lblCart.setBounds(20, 20, 200, 25);
        frame.add(lblCart);

        JButton btnCheckout = new JButton("Төлбөр төлөх");
        btnCheckout.setBounds(20, 60, 150, 30);
        frame.add(btnCheckout);

        btnCheckout.addActionListener(e -> {
            System.out.println("Төлбөр төлөх товч дарагдлаа.");
            frame.dispose();
            PaymentScreen.showPaymentScreen();
        });

        frame.setVisible(true);
    }
}
