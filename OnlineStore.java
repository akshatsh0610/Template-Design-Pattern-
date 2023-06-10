public class OnlineStore extends PhoneOrderTemp
{
    @Override
    void selectProduct()
    {
        System.out.println("selecting the product in online store");
    }

    @Override
    void makePayment() {
        System.out.println("making the payment in online store");
    }

    @Override
    void deliverProduct() {
        System.out.println("product delivered at home of the client");
    }
}
