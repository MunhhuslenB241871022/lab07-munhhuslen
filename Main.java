public class Main {
    public static void main(String[] args) {
        
        LoginScreen loginScreen = new LoginScreen();
        loginScreen.setVisible(true);

       
        ProductScreen productScreen = new ProductScreen();
        productScreen.setVisible(true);

    
        CartScreen cartScreen = new CartScreen();
        cartScreen.setVisible(true);

        
        PaymentScreen paymentScreen = new PaymentScreen();
        paymentScreen.setVisible(true);
    }
}

