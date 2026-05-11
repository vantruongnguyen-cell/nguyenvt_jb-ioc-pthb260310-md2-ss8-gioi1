package BaiGioi1;

public class CurrencyConverter {
    // Thuộc tính tĩnh lưu tỉ giá (mặc định ví dụ: 1 USD = 25000 VND)
    private static double exchangeRate = 25000.0;

    // Phương thức tĩnh để cập nhật tỉ giá
    public static void setRate(double r) {
        if (r > 0) {
            exchangeRate = r;
            System.out.println("Cập nhật tỉ giá thành công: 1 USD = " + r + " VND");
        } else {
            System.out.println("Lỗi: Tỉ giá phải lớn hơn 0!");
        }
    }

    public static double getRate() {
        return exchangeRate;
    }

    // Chuyển đổi VND sang USD
    public static double toUSD(int vnd) {
        if (vnd < 0) {
            System.out.println("Số tiền không hợp lệ!");
            return 0;
        }
        return (double) vnd / exchangeRate;
    }

    // (Khuyến khích) Định dạng hiển thị USD
    public static String formatUSD(double usd) {
        return String.format("$%.2f", usd);
    }
}
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
