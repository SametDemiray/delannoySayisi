package org.example;
/*
Delannoy sayıları, combinatorics (kombinatoryal matematik) alanında kullanılan bir tür sayı dizisidir. Adını Fransız matematikçi
Henri Delannoy'den alır. Delannoy sayıları, iki boyutlu bir kare tablo üzerinde başlangıç noktasından hedef noktaya ulaşmanın farklı
yollarını sayar. Her adımda yatay, dikey veya çapraz hareket edilebilir ve her noktaya sadece bir kez geçilebilir.

Delannoy sayıları, iki parametre ile tanımlanır: m ve n.m ve n parametreleri, başlangıç noktasından hedef noktaya ulaşmak için izin
verilen yatay, dikey ve çapraz adımların sayısını belirtir. Delannoy sayısı,m ve n parametrelerine bağlı olarak hesaplanır ve bu sayı
dizisi birçok matematiksel ve bilimsel alanda kullanılır, özellikle kombinatoryal problemlerde ve algoritmaların analizinde.
*/

public class Main {
    public static void main(String[] args) {
        int m = 4; // Delannoy sayısının m parametresi
        int n = 4; // Delannoy sayısının n parametresi

        System.out.println("Delannoy(" + m + ", " + n + ") = " + delannoy(m, n));
    }
    // Delannoy sayısı hesaplama metodu
    static int delannoy(int m, int n) {
        // İlk önce baz durumları kontrol ediyoruz
        if (m == 0 || n == 0)
            return 1;
        // Sonra Delannoy sayısını hesaplıyoruz
        return delannoy(m - 1, n) + delannoy(m, n - 1) + delannoy(m - 1, n - 1);
    }
    // Faktöriyel hesaplama metodu
    static int factorial(int n) {
        int fact = 1;
        for (int i = 2; i <= n; i++)
            fact *= i;
        return fact;
    }
}