class PaymentScreen {
    public static void showPaymentScreen() {
        JFrame frame = new JFrame("Төлбөр хийх");
        frame.setSize(300, 200);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLayout(null);

        JLabel lblPay = new JLabel("Төлбөрийн мэдээллээ оруулна уу:");
        lblPay.setBounds(20, 20, 250, 25);
        frame.add(lblPay);

        JButton btnConfirm = new JButton("Төлбөр хийх");
        btnConfirm.setBounds(20, 60, 150, 30);
        frame.add(btnConfirm);

        btnConfirm.addActionListener(e -> {
            System.out.println("Төлбөр амжилттай хийгдлээ!");
            frame.dispose();
        });

        frame.setVisible(true);
    }
}
