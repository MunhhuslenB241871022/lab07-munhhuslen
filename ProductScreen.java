class ProductScreen {
    public static void showProductScreen() {
        JFrame frame = new JFrame("Онлайн дэлгүүр");
        frame.setSize(400, 300);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLayout(null);

        JLabel lblTitle = new JLabel("Барааны жагсаалт:");
        lblTitle.setBounds(20, 20, 200, 25);
        frame.add(lblTitle);

        JButton btnItem1 = new JButton("iPhone - 3,000,000₮");
        btnItem1.setBounds(20, 60, 200, 30);
        frame.add(btnItem1);

        JButton btnItem2 = new JButton("Laptop - 4,500,000₮");
        btnItem2.setBounds(20, 100, 200, 30);
        frame.add(btnItem2);

        JButton btnCart = new JButton("Сагс руу очих");
        btnCart.setBounds(20, 160, 150, 30);
        frame.add(btnCart);

        btnItem1.addActionListener(e -> System.out.println("iPhone сагсанд нэмэгдлээ."));
        btnItem2.addActionListener(e -> System.out.println("Laptop сагсанд нэмэгдлээ."));
        btnCart.addActionListener(e -> {
            System.out.println("Сагс руу шилжлээ.");
            frame.dispose();
            CartScreen.showCartScreen();
        });

        frame.setVisible(true);
    }
}
