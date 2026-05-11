package BaiGioi1;

public class Main {
    public static void main(String[] args) {
        // 1. Hiển thị tỉ giá mặc định
        System.out.println("Tỉ giá hiện tại: " + CurrencyConverter.getRate());

        // 2. Chuyển đổi thử nghiệm
        int myVnd = 500000;
        double usd = CurrencyConverter.toUSD(myVnd);
        System.out.println(myVnd + " VND quy đổi được: " + CurrencyConverter.formatUSD(usd));

        // 3. Thay đổi tỉ giá và quy đổi lại
        CurrencyConverter.setRate(23500.5);
        double newUsd = CurrencyConverter.toUSD(myVnd);
        System.out.println(myVnd + " VND với tỉ giá mới là: " + CurrencyConverter.formatUSD(newUsd));

        // 4. Test validation
        CurrencyConverter.setRate(-100);
    }
}
