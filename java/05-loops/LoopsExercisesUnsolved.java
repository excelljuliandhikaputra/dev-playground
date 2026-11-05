/*
 * Topic 05 - Loops Exercises (UNSOLVED)
 * Topik 05 - Latihan Perulangan (BELUM DIKERJAKAN)
 * =================================================
 * EN - How to use:
 *     1. Under each exercise, write your own code.
 *     2. Run:  java LoopsExercisesUnsolved.java
 *     3. Compare your output with the "Expected output" in each exercise.
 *        It must match EXACTLY (spaces, punctuation, capital letters).
 *
 * ID - Cara pakai:
 *     1. Di bawah setiap soal, tulis kodemu sendiri.
 *     2. Jalankan:  java LoopsExercisesUnsolved.java
 *     3. Bandingkan hasilmu dengan "Expected output" di setiap soal.
 *        Harus PERSIS sama (spasi, tanda baca, huruf besar/kecil).
 *
 * Rules / Aturan:
 *     - Only use Topic 01-05 material. No arrays yet.
 *       Hanya pakai materi Topik 01-05. Belum boleh pakai array.
 *     - NO HARDCODING: the loop must PRODUCE the output from the given data.
 *       Don't type the expected lines yourself, and don't use a math formula
 *       instead of the loop.
 *       JANGAN HARDCODE: loop-nya yang harus MENGHASILKAN output dari data
 *       yang diberikan. Jangan mengetik sendiri baris-baris hasilnya, dan
 *       jangan pakai rumus matematika sebagai pengganti loop.
 *     - Variable names:
 *       * A variable declared in a for header (int i) or inside a loop's { }
 *         only exists inside that loop, so you CAN reuse it later (i, row, letter).
 *       * A variable declared directly in main can only be declared ONCE in
 *         the whole file. Use the suggested names in each exercise.
 *       Nama variabel:
 *       * Variabel yang dideklarasikan di header for (int i) atau di dalam { }
 *         loop hanya ada di dalam loop itu, jadi BOLEH dipakai lagi nanti
 *         (i, row, letter).
 *       * Variabel yang dideklarasikan langsung di main hanya boleh
 *         dideklarasikan SEKALI di seluruh file. Pakai nama yang disarankan
 *         di setiap soal.
 *
 * Self-check / Cek sendiri:
 *     Some exercises have "More checks". Change the given values to those,
 *     run again, and compare. If your output doesn't change, you hardcoded
 *     something.
 *     Beberapa soal punya "More checks". Ganti nilai yang diberikan dengan
 *     nilai itu, jalankan lagi, lalu bandingkan. Kalau output-mu tidak ikut
 *     berubah, berarti ada yang di-hardcode.
 *     If the program never stops, you have an infinite loop: press Ctrl + C.
 *     Kalau program tidak pernah berhenti, ada loop tanpa akhir: tekan Ctrl + C.
 *
 * IMPORTANT / PENTING:
 *     EN: When you save your answers as LoopsExercisesSolved.java,
 *         rename the class below to LoopsExercisesSolved too.
 *     ID: Saat menyimpan jawaban sebagai LoopsExercisesSolved.java,
 *         ganti juga nama class di bawah menjadi LoopsExercisesSolved.
 */
public class LoopsExercisesUnsolved {

    public static void main(String[] args) {

        System.out.println("===== Exercise 1 / Soal 1 =====");
        // EN: Print the multiplication table of tableNumber, from 1 to 10,
        //     with a for loop.
        // ID: Cetak tabel perkalian tableNumber, dari 1 sampai 10,
        //     dengan loop for.
        //
        // Expected output:
        // 7 x 1 = 7
        // 7 x 2 = 14
        // 7 x 3 = 21
        // 7 x 4 = 28
        // 7 x 5 = 35
        // 7 x 6 = 42
        // 7 x 7 = 49
        // 7 x 8 = 56
        // 7 x 9 = 63
        // 7 x 10 = 70

        int tableNumber = 7;

        // Write your code below / Tulis kodemu di bawah ini:



        System.out.println("===== Exercise 2 / Soal 2 =====");
        // EN: Loop through every number from rangeStart to rangeEnd (both
        //     included) and calculate:
        //       - the sum (accumulator)
        //       - how many numbers there are (counter)
        //       - the average (sum / count, as a double)
        //       - the sum of only the EVEN numbers
        //     Suggested names: rangeSum, rangeCount, evenSum.
        // ID: Telusuri setiap angka dari rangeStart sampai rangeEnd (keduanya
        //     ikut dihitung) lalu hitung:
        //       - jumlahnya (akumulator)
        //       - banyaknya angka (penghitung)
        //       - rata-ratanya (jumlah / banyak, sebagai double)
        //       - jumlah angka GENAP saja
        //     Nama yang disarankan: rangeSum, rangeCount, evenSum.
        //
        // Expected output:
        // Sum of 1 to 20: 210
        // Count: 20
        // Average: 10.5
        // Sum of even numbers: 110
        //
        // More checks (change the range and run again):
        //   5 to 15 -> Sum 110, Count 11, Average 10.0, Even sum 50

        int rangeStart = 1;
        int rangeEnd = 20;

        // Write your code below / Tulis kodemu di bawah ini:



        System.out.println("===== Exercise 3 / Soal 3 =====");
        // EN: FizzBuzz from 1 to fizzBuzzLimit. For each number print:
        //       "FizzBuzz" if it is divisible by 3 AND by 5
        //       "Fizz"     if it is divisible by 3
        //       "Buzz"     if it is divisible by 5
        //       the number itself otherwise
        //     Hint: which check must come FIRST? (Topic 04: order matters.)
        // ID: FizzBuzz dari 1 sampai fizzBuzzLimit. Untuk setiap angka cetak:
        //       "FizzBuzz" kalau habis dibagi 3 DAN 5
        //       "Fizz"     kalau habis dibagi 3
        //       "Buzz"     kalau habis dibagi 5
        //       angkanya sendiri kalau tidak
        //     Petunjuk: pengecekan mana yang harus PERTAMA? (Topik 04: urutan penting.)
        //
        // Expected output:
        // 1
        // 2
        // Fizz
        // 4
        // Buzz
        // Fizz
        // 7
        // 8
        // Fizz
        // Buzz
        // 11
        // Fizz
        // 13
        // 14
        // FizzBuzz

        int fizzBuzzLimit = 15;

        // Write your code below / Tulis kodemu di bawah ini:



        System.out.println("===== Exercise 4 / Soal 4 =====");
        // EN: Count the vowels (a, e, i, o, u) in vowelText. Capital letters
        //     count too, so make the text lowercase first. Loop over the
        //     characters with charAt and compare with == and 'a', 'e', ...
        //     Suggested names: lowerVowelText, vowelCount.
        // ID: Hitung huruf vokal (a, e, i, o, u) di vowelText. Huruf kapital
        //     juga dihitung, jadi ubah teksnya ke huruf kecil dulu. Telusuri
        //     karakternya dengan charAt lalu bandingkan dengan == dan 'a', 'e', ...
        //     Nama yang disarankan: lowerVowelText, vowelCount.
        //
        // Expected output:
        // Text: Universitas Airlangga
        // Vowels: 9
        //
        // More checks (change vowelText and run again):
        //   "PROGRAMMING" -> Vowels: 3      "xyz" -> Vowels: 0

        String vowelText = "Universitas Airlangga";

        // Write your code below / Tulis kodemu di bawah ini:



        System.out.println("===== Exercise 5 / Soal 5 =====");
        // EN: Build the reversed word with a loop that goes BACKWARDS
        //     (from the last index down to 0), adding one char at a time.
        //     Then check if the word is a palindrome (same forwards and
        //     backwards), ignoring capital letters (Topic 04: equalsIgnoreCase).
        //     Suggested name: reversedWord.
        // ID: Buat kata terbalik dengan loop yang berjalan MUNDUR (dari indeks
        //     terakhir sampai 0), menambahkan satu char setiap putaran.
        //     Lalu cek apakah kata itu palindrom (sama dibaca dari depan dan
        //     belakang), tanpa peduli huruf besar/kecil (Topik 04: equalsIgnoreCase).
        //     Nama yang disarankan: reversedWord.
        //
        // Expected output:
        // Reversed: aggnalriA
        // Palindrome: false
        //
        // More checks (change wordToReverse and run again):
        //   "katak" -> Reversed: katak, Palindrome: true
        //   "Kodok" -> Reversed: kodoK, Palindrome: true

        String wordToReverse = "Airlangga";

        // Write your code below / Tulis kodemu di bawah ini:



        System.out.println("===== Exercise 6 / Soal 6 =====");
        // EN: Excell is saving for a new phone. He already has startingBalance
        //     and saves monthlySaving every month. Use a WHILE loop (you don't
        //     know the number of months in advance) and print the balance each
        //     month until it reaches savingsGoal or more.
        //     Suggested names: savingsBalance, monthCount.
        // ID: Excell menabung untuk HP baru. Dia sudah punya startingBalance dan
        //     menabung monthlySaving setiap bulan. Pakai loop WHILE (jumlah
        //     bulannya belum diketahui) dan cetak saldonya setiap bulan sampai
        //     mencapai savingsGoal atau lebih.
        //     Nama yang disarankan: savingsBalance, monthCount.
        //
        // Expected output:
        // Month 1: Rp 300000
        // Month 2: Rp 500000
        // Month 3: Rp 700000
        // Month 4: Rp 900000
        // Month 5: Rp 1100000
        // Month 6: Rp 1300000
        // Goal reached in 6 months.
        //
        // More checks (change startingBalance and run again):
        //   1250000 -> only "Goal reached in 0 months." (the loop body never runs)

        int savingsGoal = 1250000;
        int monthlySaving = 200000;
        int startingBalance = 100000;

        // Write your code below / Tulis kodemu di bawah ini:



        System.out.println("===== Exercise 7 / Soal 7 =====");
        // EN: Count the digits of digitNumber and add them up, using a
        //     DO-WHILE loop:
        //       last digit        -> number % 10
        //       remove last digit -> number /= 10
        //     Work on a copy (remainingDigits) so digitNumber keeps its value.
        //     Why do-while? The number 0 still has 1 digit, so the body must
        //     run at least once.
        //     Suggested names: remainingDigits, digitCount, digitSum.
        // ID: Hitung banyak digit digitNumber dan jumlahkan digit-digitnya,
        //     memakai loop DO-WHILE:
        //       digit terakhir        -> angka % 10
        //       buang digit terakhir  -> angka /= 10
        //     Kerjakan pada salinannya (remainingDigits) supaya digitNumber
        //     tetap. Kenapa do-while? Angka 0 tetap punya 1 digit, jadi isi
        //     loop harus jalan minimal sekali.
        //     Nama yang disarankan: remainingDigits, digitCount, digitSum.
        //
        // Expected output:
        // Number: 2026
        // Digit count: 4
        // Digit sum: 10
        //
        // More checks (change digitNumber and run again):
        //   0 -> count 1, sum 0      7 -> count 1, sum 7      99999 -> count 5, sum 45

        int digitNumber = 2026;

        // Write your code below / Tulis kodemu di bawah ini:



        System.out.println("===== Exercise 8 / Soal 8 =====");
        // EN: Clean up a class code typed by a student. Go through the
        //     characters one by one and build cleanCode:
        //       - a space ' '  -> skip it (continue)
        //       - a '#'        -> everything after it is a comment: stop (break)
        //       - anything else -> add it to cleanCode
        //     Suggested name: cleanCode.
        // ID: Rapikan kode kelas yang diketik seorang mahasiswa. Telusuri
        //     karakternya satu per satu lalu bentuk cleanCode:
        //       - spasi ' '    -> lewati (continue)
        //       - '#'          -> semua setelahnya adalah komentar: berhenti (break)
        //       - selain itu   -> tambahkan ke cleanCode
        //     Nama yang disarankan: cleanCode.
        //
        // Expected output:
        // Clean code: D4TI-A2026
        //
        // More checks (change rawClassCode and run again):
        //   "  UNAIR  # campus" -> Clean code: UNAIR
        //   "No comment here"   -> Clean code: Nocommenthere

        String rawClassCode = "D4 TI-A 2026#old code";

        // Write your code below / Tulis kodemu di bawah ini:



        System.out.println("===== Exercise 9 / Soal 9 (Challenge) =====");
        // EN: Print a pyramid of stars with pyramidHeight rows, using nested
        //     loops. For each row, first print the spaces, then the stars.
        //     Find the rule: how many spaces and how many stars does row 1,
        //     row 2, row 3 need? (No spaces after the stars.)
        // ID: Cetak piramida bintang dengan pyramidHeight baris, memakai loop
        //     bersarang. Untuk setiap baris, cetak spasinya dulu, lalu bintangnya.
        //     Cari polanya: baris 1, baris 2, baris 3 butuh berapa spasi dan
        //     berapa bintang? (Tidak ada spasi setelah bintang.)
        //
        // Expected output:
        //     *
        //    ***
        //   *****
        //  *******
        // *********
        //
        // More checks (change pyramidHeight to 3):
        //   *
        //  ***
        // *****

        int pyramidHeight = 5;

        // Write your code below / Tulis kodemu di bawah ini:



        System.out.println("===== Exercise 10 / Soal 10 (Challenge) =====");
        // EN: Print every prime number from 2 to primeLimit, separated by ", ",
        //     then how many there are.
        //     A number is prime if it is at least 2 and NO number from 2 up to
        //     (number - 1) divides it.
        //     Hints:
        //       - outer loop: each candidate number; inner loop: each divisor
        //       - boolean isPrime = true; set it to false and break when a
        //         divisor is found
        //       - print ", " BEFORE every prime except the first one
        //         (Basics section 2), using your counter
        //     Suggested name: primeCount.
        // ID: Cetak semua bilangan prima dari 2 sampai primeLimit, dipisah ", ",
        //     lalu berapa banyaknya.
        //     Sebuah angka adalah prima kalau minimal 2 dan TIDAK ADA angka dari
        //     2 sampai (angka - 1) yang habis membaginya.
        //     Petunjuk:
        //       - loop luar: setiap angka kandidat; loop dalam: setiap pembagi
        //       - boolean isPrime = true; ubah jadi false lalu break kalau
        //         ketemu pembagi
        //       - cetak ", " SEBELUM setiap bilangan prima kecuali yang pertama
        //         (Basics bagian 2), memakai penghitungmu
        //     Nama yang disarankan: primeCount.
        //
        // Expected output:
        // Primes up to 30: 2, 3, 5, 7, 11, 13, 17, 19, 23, 29
        // Count: 10
        //
        // More checks (change primeLimit and run again):
        //   10 -> Primes up to 10: 2, 3, 5, 7       Count: 4
        //   2  -> Primes up to 2: 2                 Count: 1

        int primeLimit = 30;

        // Write your code below / Tulis kodemu di bawah ini:


    }
}
