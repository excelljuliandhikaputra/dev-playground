/*
 * Topic 02 - Variables & Data Types Exercises (UNSOLVED)
 * Topik 02 - Latihan Variabel & Tipe Data (BELUM DIKERJAKAN)
 * ===========================================================
 * EN - How to use:
 *     1. Under each exercise, write your own code.
 *     2. Run:  java VariablesExercisesUnsolved.java
 *     3. Compare your output with the "Expected output" in each exercise.
 *        It must match EXACTLY (spaces, punctuation, capital letters).
 *
 * ID - Cara pakai:
 *     1. Di bawah setiap soal, tulis kodemu sendiri.
 *     2. Jalankan:  java VariablesExercisesUnsolved.java
 *     3. Bandingkan hasilmu dengan "Expected output" di setiap soal.
 *        Harus PERSIS sama (spasi, tanda baca, huruf besar/kecil).
 *
 * Rules / Aturan:
 *     - Only use Topic 01-02 material.
 *       Hanya pakai materi Topik 01-02.
 *     - NO HARDCODING: always print using the variables.
 *       JANGAN HARDCODE: selalu cetak memakai variabel.
 *     - Use camelCase for your variable names.
 *       Pakai camelCase untuk nama variabelmu.
 *     - A variable name can only be declared ONCE in the whole file, so
 *       every exercise uses different names.
 *       Nama variabel hanya boleh dideklarasikan SEKALI di seluruh file,
 *       jadi setiap soal memakai nama yang berbeda.
 *
 * Self-check / Cek sendiri:
 *     Change the given values and run again. If your output doesn't
 *     change, you hardcoded something.
 *     Ganti nilai yang diberikan lalu jalankan lagi. Kalau output-mu tidak
 *     ikut berubah, berarti ada yang di-hardcode.
 *
 * IMPORTANT / PENTING:
 *     EN: When you save your answers as VariablesExercisesSolved.java,
 *         rename the class below to VariablesExercisesSolved too.
 *     ID: Saat menyimpan jawaban sebagai VariablesExercisesSolved.java,
 *         ganti juga nama class di bawah menjadi VariablesExercisesSolved.
 */
public class VariablesExercisesUnsolved {

    public static void main(String[] args) {

        System.out.println("===== Exercise 1 / Soal 1 =====");
        // EN: Declare three variables: name (String), age (int), campus (String).
        //     Then print one sentence using +.
        // ID: Deklarasikan tiga variabel: name (String), age (int), campus (String).
        //     Lalu cetak satu kalimat memakai +.
        //
        // Expected output:
        // My name is Excell, I am 20 years old, I study at UNAIR.

        // Write your code below / Tulis kodemu di bawah ini:



        System.out.println("===== Exercise 2 / Soal 2 =====");
        // EN: Declare each variable below with the CORRECT type, then print
        //     them in the format shown. You choose the types!
        //       courseCredits -> 3
        //       courseGpa     -> 3.75
        //       courseName    -> Algorithms
        //       isPassed      -> true
        //       letterGrade   -> A   (a single character)
        // ID: Deklarasikan setiap variabel di bawah dengan tipe yang BENAR,
        //     lalu cetak dengan format seperti di bawah. Kamu yang memilih tipenya!
        //
        // Expected output:
        // Credits: 3
        // GPA: 3.75
        // Course: Algorithms
        // Passed: true
        // Grade: A

        // Write your code below / Tulis kodemu di bawah ini:



        System.out.println("===== Exercise 3 / Soal 3 =====");
        // EN: Use the operators on a and b. Print in the format shown.
        //     Watch out: "17 + 5 = " + a + b gives 175. Use ( ).
        //     The last line needs a double result. Use casting.
        // ID: Pakai operator pada a dan b. Cetak dengan format seperti di bawah.
        //     Hati-hati: "17 + 5 = " + a + b hasilnya 175. Pakai ( ).
        //     Baris terakhir butuh hasil double. Pakai casting.
        //
        // Expected output:
        // 17 + 5 = 22
        // 17 - 5 = 12
        // 17 * 5 = 85
        // 17 / 5 = 3
        // 17 % 5 = 2
        // 17 / 5 as double = 3.4

        int a = 17;
        int b = 5;

        // Write your code below / Tulis kodemu di bawah ini:



        System.out.println("===== Exercise 4 / Soal 4 =====");
        // EN: A student buys notebooks. Calculate subtotal (int),
        //     discount (double), and total (double).
        //     Hint: divide by 100.0, not 100, so the decimal isn't cut.
        // ID: Seorang mahasiswa membeli buku tulis. Hitung subtotal (int),
        //     diskon (double), dan total (double).
        //     Petunjuk: bagi dengan 100.0, bukan 100, supaya desimalnya tidak hilang.
        //
        // Expected output:
        // Subtotal: 75000
        // Discount: 7500.0
        // Total: 67500.0

        int price = 25000;
        int quantity = 3;
        int discountPercent = 10;

        // Write your code below / Tulis kodemu di bawah ini:



        System.out.println("===== Exercise 5 / Soal 5 =====");
        // EN: Type casting.
        //     a) scoreText is a String. Convert it to int, add bonus, print it.
        //     b) Convert studyHours (double) to int and print it.
        //     c) gpaText is a String. Convert it to double, add 0.25, print it.
        // ID: Konversi tipe.
        //     a) scoreText bertipe String. Ubah ke int, tambah bonus, cetak.
        //     b) Ubah studyHours (double) ke int lalu cetak.
        //     c) gpaText bertipe String. Ubah ke double, tambah 0.25, cetak.
        //
        // Expected output:
        // New score: 95
        // Hours: 9
        // New GPA: 4.0

        String scoreText = "85";
        int bonus = 10;
        double studyHours = 9.99;
        String gpaText = "3.75";

        // Write your code below / Tulis kodemu di bawah ini:



        System.out.println("===== Exercise 6 / Soal 6 =====");
        // EN: Use String methods on campusName.
        // ID: Pakai method String pada campusName.
        //
        // Expected output:
        // UNIVERSITAS AIRLANGGA
        // universitas airlangga
        // Length: 21
        // First letter: U
        // Last letter: a

        String campusName = "Universitas Airlangga";

        // Write your code below / Tulis kodemu di bawah ini:



        System.out.println("===== Exercise 7 / Soal 7 =====");
        // EN: Swap the values of first and second using a third variable (temp).
        //     Don't just write first = 9.
        // ID: Tukar nilai first dan second memakai variabel ketiga (temp).
        //     Jangan langsung tulis first = 9.
        //
        // Expected output:
        // Before: first = 5, second = 9
        // After: first = 9, second = 5

        int first = 5;
        int second = 9;

        // Write your code below / Tulis kodemu di bawah ini:



        System.out.println("===== Exercise 8 / Soal 8 (Challenge) =====");
        // EN: Convert totalSeconds into hours, minutes, and seconds.
        //     Hint: int / int cuts the decimal, which is exactly what you need here.
        // ID: Ubah totalSeconds menjadi jam, menit, dan detik.
        //     Petunjuk: int / int memotong desimal, dan itu justru yang kamu butuhkan.
        //
        // Expected output:
        // 1 hours, 2 minutes, 5 seconds

        int totalSeconds = 3725;

        // Write your code below / Tulis kodemu di bawah ini:



        System.out.println("===== Exercise 9 / Soal 9 (Challenge) =====");
        // EN: Calculate the BMI: weight / (height * height).
        //     Show it with 2 decimal places using printf.
        // ID: Hitung BMI: berat / (tinggi * tinggi).
        //     Tampilkan dengan 2 angka desimal memakai printf.
        //
        // Expected output:
        // BMI: 20.76
        //
        // (EN: "BMI: 20,76" with a comma is also correct if your laptop
        //      uses Indonesian settings.)
        // (ID: "BMI: 20,76" dengan koma juga benar kalau laptopmu
        //      memakai pengaturan bahasa Indonesia.)

        double weight = 60;      // kg
        double height = 1.70;    // meters / meter

        // Write your code below / Tulis kodemu di bawah ini:


    }
}
