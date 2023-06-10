// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        PhoneOrderTemp offlineStore = new OfflineStore();
        //offlineStore.createOrder();

        PhoneOrderTemp onlineStore = new OnlineStore();
        onlineStore.createOrder();
    }
}