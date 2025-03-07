package com.poly.tes1_primecheck;

class PrimeCheck {
////
//    /**
//     * Kiểm tra xem một số nguyên n có phải là số nguyên tố hay không.
//     *@param n Số nguyên cần kiểm tra (1 ≤ n ≤ 10^6)
//     * @return true nếu n là số nguyên tố, ngược lại false
//     */
//    Ngăn việc tạo instance của lớp.
    private PrimeCheck() {
        throw new UnsupportedOperationException("Utility class");
    }
    public static boolean isPrime(int n) {
        if (n < 2) return false; // Loại bỏ các số nhỏ hơn 2
        if (n == 2 || n == 3) return true; // 2 và 3 là số nguyên tố
        if (n % 2 == 0 || n % 3 == 0) return false; // Loại bỏ bội số của 2 và 3

        int sqrtN = (int) Math.sqrt(n); // Tính căn bậc hai 1 lần
        for (int i = 5; i <= sqrtN; i += 6) { // Kiểm tra các số dạng 6k ± 1
            if (n % i == 0 || n % (i + 2) == 0) return false;
        }
        return true;
    }
}
