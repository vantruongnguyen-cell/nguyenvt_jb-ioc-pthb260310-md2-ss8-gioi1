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