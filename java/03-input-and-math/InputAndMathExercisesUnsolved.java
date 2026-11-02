/*
 * Topic 03 - Input & Math Exercises (UNSOLVED)
 * Topik 03 - Latihan Input & Matematika (BELUM DIKERJAKAN)
 * =========================================================
 * EN - How to use:
 *     1. Under each exercise, write your own code.
 *     2. Run:  java InputAndMathExercisesUnsolved.java
 *     3. Compare your output with the "Expected output" in each exercise.
 *        It must match EXACTLY (spaces, punctuation, capital letters).
 *     4. Exercises 1-7 use the given variables. Exercises 8-10 read from
 *        the keyboard, so the program will stop and wait for you to type.
 *        Type the values from the "Sample run" and press Enter after each.
 *
 * ID - Cara pakai:
 *     1. Di bawah setiap soal, tulis kodemu sendiri.
 *     2. Jalankan:  java InputAndMathExercisesUnsolved.java
 *     3. Bandingkan hasilmu dengan "Expected output" di setiap soal.
 *        Harus PERSIS sama (spasi, tanda baca, huruf besar/kecil).
 *     4. Soal 1-7 memakai variabel yang sudah diberikan. Soal 8-10 membaca
 *        dari keyboard, jadi program akan berhenti dan menunggu kamu mengetik.
 *        Ketik nilai dari "Sample run" lalu tekan Enter setiap selesai satu nilai.
 *
 * Rules / Aturan:
 *     - Only use Topic 01-03 material. No if and no loops yet.
 *       Hanya pakai materi Topik 01-03. Belum boleh pakai if dan loop.
 *     - NO HARDCODING: always print using the variables.
 *       JANGAN HARDCODE: selalu cetak memakai variabel.
 *     - A variable name can only be declared ONCE in the whole file, so
 *       every exercise uses different names.
 *       Nama variabel hanya boleh dideklarasikan SEKALI di seluruh file,
 *       jadi setiap soal memakai nama yang berbeda.
 *     - Exercises 8-10 share the ONE Scanner called `input` (already given
 *       before Exercise 8). Do not create another Scanner.
 *       Soal 8-10 memakai SATU Scanner bernama `input` (sudah disediakan
 *       sebelum Soal 8). Jangan membuat Scanner lain.
 *
 * Self-check / Cek sendiri:
 *     Change the given values (or type different input) and run again.
 *     If your output doesn't change, you hardcoded something.
 *     Ganti nilai yang diberikan (atau ketik input yang berbeda) lalu
 *     jalankan lagi. Kalau output-mu tidak ikut berubah, berarti ada yang
 *     di-hardcode.
 *
 * IMPORTANT / PENTING:
 *     EN: When you save your answers as InputAndMathExercisesSolved.java,
 *         rename the class below to InputAndMathExercisesSolved too.
 *     ID: Saat menyimpan jawaban sebagai InputAndMathExercisesSolved.java,
 *         ganti juga nama class di bawah menjadi InputAndMathExercisesSolved.
 */
import java.util.Scanner;

public class InputAndMathExercisesUnsolved {

    public static void main(String[] args) {

        System.out.println("===== Exercise 1 / Soal 1 =====");
        // EN: Excell wants to cross a rectangular field. Calculate:
        //       - the distance walking around the edge (length + width)
        //       - the distance walking diagonally (Pythagoras):
        //             diagonal = square root of (length^2 + width^2)
        //       - how many meters he saves by walking diagonally
        //     Use Math.pow and Math.sqrt.
        // ID: Excell ingin menyeberangi lapangan berbentuk persegi panjang. Hitung:
        //       - jarak kalau berjalan lewat pinggir (panjang + lebar)
        //       - jarak kalau berjalan diagonal (Pythagoras):
        //             diagonal = akar dari (panjang^2 + lebar^2)
        //       - berapa meter yang dihemat dengan berjalan diagonal
        //     Pakai Math.pow dan Math.sqrt.
        //
        // Expected output:
        // Around the edge: 210.0 m
        // Diagonal: 150.0 m
        // Distance saved: 60.0 m

        double fieldLength = 120;    // meters / meter
        double fieldWidth = 90;      // meters / meter

        // Write your code below / Tulis kodemu di bawah ini:



        System.out.println("===== Exercise 2 / Soal 2 =====");
        // EN: Round finalScore in four different ways.
        //     For 2 decimals use the trick: Math.round(x * 100) / 100.0
        // ID: Bulatkan finalScore dengan empat cara berbeda.
        //     Untuk 2 desimal pakai trik: Math.round(x * 100) / 100.0
        //
        // Expected output:
        // Score: 78.4567
        // Rounded: 78
        // Rounded to 2 decimals: 78.46
        // Rounded down (floor): 78.0
        // Rounded up (ceil): 79.0

        double finalScore = 78.4567;

        // Write your code below / Tulis kodemu di bawah ini:



        System.out.println("===== Exercise 3 / Soal 3 =====");
        // EN: Use Math.max, Math.min, and Math.abs on the three quiz scores.
        //     - Highest and lowest of ALL THREE (put one Math.max inside another).
        //     - Gap = highest - lowest.
        //     - The difference between quiz 2 and quiz 3, always positive.
        // ID: Pakai Math.max, Math.min, dan Math.abs pada tiga nilai kuis.
        //     - Tertinggi dan terendah dari KETIGANYA (taruh Math.max di dalam Math.max).
        //     - Gap = tertinggi - terendah.
        //     - Selisih kuis 2 dan kuis 3, selalu positif.
        //
        // Expected output:
        // Highest: 91
        // Lowest: 72
        // Gap: 19
        // Difference between quiz 2 and quiz 3: 6

        int quizOne = 72;
        int quizTwo = 91;
        int quizThree = 85;

        // Write your code below / Tulis kodemu di bawah ini:



        System.out.println("===== Exercise 4 / Soal 4 =====");
        // EN: A class trip to campus B. How many buses are needed, and how
        //     many seats stay empty?
        //     Careful: totalStudents / busCapacity is int division (130 / 40 = 3),
        //     and 3 buses are NOT enough. Divide as double, use Math.ceil,
        //     then cast the result to int.
        // ID: Kunjungan kelas ke kampus B. Butuh berapa bus, dan berapa kursi
        //     yang kosong?
        //     Hati-hati: totalStudents / busCapacity adalah pembagian int (130 / 40 = 3),
        //     dan 3 bus TIDAK cukup. Bagi sebagai double, pakai Math.ceil,
        //     lalu cast hasilnya ke int.
        //
        // Expected output:
        // Buses needed: 4
        // Empty seats: 30

        int totalStudents = 130;
        int busCapacity = 40;

        // Write your code below / Tulis kodemu di bawah ini:



        System.out.println("===== Exercise 5 / Soal 5 =====");
        // EN: Build a running total. Create  int cartTotal = 0;  and update it
        //     ONLY with compound assignment (+=  -=  *=). Print after each step.
        //       1) add the book                       (+=)
        //       2) add the pens (penPrice * penCount)  (+=)
        //       3) use the voucher                    (-=)
        //       4) the same order is made for every student (*= studentCount)
        // ID: Buat total berjalan. Buat  int cartTotal = 0;  lalu ubah nilainya
        //     HANYA dengan operator gabungan (+=  -=  *=). Cetak setiap langkah.
        //       1) tambahkan buku                        (+=)
        //       2) tambahkan pulpen (penPrice * penCount) (+=)
        //       3) pakai voucher                         (-=)
        //       4) pesanan yang sama dibuat untuk setiap mahasiswa (*= studentCount)
        //
        // Expected output:
        // After book: 45000
        // After pens: 59000
        // After voucher: 49000
        // For 2 students: 98000

        int bookPrice = 45000;
        int penPrice = 3500;
        int penCount = 4;
        int voucher = 10000;
        int studentCount = 2;

        // Write your code below / Tulis kodemu di bawah ini:



        System.out.println("===== Exercise 6 / Soal 6 =====");
        // EN: Excell attends 3 more meetings: use ++ on attendedMeetings three
        //     times. Then one meeting is cancelled: use -- on totalMeetings.
        //     Print the result and the attendance percentage rounded to
        //     2 decimals (the trick from Exercise 2).
        //     Percentage = attended * 100.0 / total
        // ID: Excell hadir di 3 pertemuan lagi: pakai ++ pada attendedMeetings
        //     tiga kali. Lalu satu pertemuan dibatalkan: pakai -- pada totalMeetings.
        //     Cetak hasilnya dan persentase kehadiran yang dibulatkan
        //     2 desimal (trik dari Soal 2).
        //     Persentase = hadir * 100.0 / total
        //
        // Expected output:
        // Attended: 13 of 15
        // Attendance: 86.67%

        int attendedMeetings = 10;
        int totalMeetings = 16;

        // Write your code below / Tulis kodemu di bawah ini:



        System.out.println("===== Exercise 7 / Soal 7 =====");
        // EN: The faculty has a round garden. Calculate its area (PI * r^2)
        //     and circumference (2 * PI * r). Use Math.PI and Math.pow.
        //     Print with printf and %.2f.
        // ID: Fakultas punya taman berbentuk lingkaran. Hitung luasnya (PI * r^2)
        //     dan kelilingnya (2 * PI * r). Pakai Math.PI dan Math.pow.
        //     Cetak dengan printf dan %.2f.
        //
        // Expected output:
        // Area: 176.71 square meters
        // Circumference: 47.12 meters
        //
        // (EN: A comma (176,71) is also correct if your laptop uses
        //      Indonesian settings.)
        // (ID: Koma (176,71) juga benar kalau laptopmu memakai
        //      pengaturan bahasa Indonesia.)

        double gardenRadius = 7.5;   // meters / meter

        // Write your code below / Tulis kodemu di bawah ini:



        // ===================================================================
        // EN: Exercises 8-10 read from the keyboard with this ONE Scanner.
        //     - Ask with System.out.print (not println), so the user types on
        //       the same line as the question.
        //     - Tip: after every input.nextInt(), add  input.nextLine();  to
        //       throw away the leftover Enter (Basics section 5). Then every
        //       exercise starts clean.
        //     - To test all three in one run, type the inputs in this order:
        //       Excell, 2006, 1, Discrete Mathematics, 3, 125000, 3
        // ID: Soal 8-10 membaca dari keyboard dengan SATU Scanner ini.
        //     - Bertanya dengan System.out.print (bukan println), supaya user
        //       mengetik di baris yang sama dengan pertanyaannya.
        //     - Tips: setelah setiap input.nextInt(), tambahkan  input.nextLine();
        //       untuk membuang sisa Enter (Basics bagian 5). Dengan begitu setiap
        //       soal mulai dalam keadaan bersih.
        //     - Untuk menguji ketiganya sekaligus, ketik input dengan urutan ini:
        //       Excell, 2006, 1, Discrete Mathematics, 3, 125000, 3
        // ===================================================================
        Scanner input = new Scanner(System.in);


        System.out.println("===== Exercise 8 / Soal 8 =====");
        // EN: Ask for a name (nextLine) and a birth year (nextInt).
        //     Print a greeting and the age they reach in CURRENT_YEAR.
        // ID: Tanyakan nama (nextLine) dan tahun lahir (nextInt).
        //     Cetak sapaan dan umur yang dicapai pada CURRENT_YEAR.
        //
        // Sample run (input: Excell, then 2006):
        // Enter your name: Excell
        // Enter your birth year: 2006
        // Hello, Excell! In 2026 you turn 20.

        final int CURRENT_YEAR = 2026;

        // Write your code below / Tulis kodemu di bawah ini:



        System.out.println("===== Exercise 9 / Soal 9 (Challenge) =====");
        // EN: Ask for the semester (number), the favorite course (a full line
        //     with spaces), and its credits (number).
        //     Then show the weekly study time. Each credit means
        //     MINUTES_PER_CREDIT minutes of study per week. Show it in hours
        //     and minutes (Topic 02: / and %).
        //     Watch out for the nextInt() + nextLine() trap!
        // ID: Tanyakan semester (angka), mata kuliah favorit (satu baris penuh
        //     yang ada spasinya), dan jumlah SKS-nya (angka).
        //     Lalu tampilkan waktu belajar per minggu. Setiap 1 SKS berarti
        //     MINUTES_PER_CREDIT menit belajar per minggu. Tampilkan dalam jam
        //     dan menit (Topik 02: / dan %).
        //     Awas jebakan nextInt() + nextLine()!
        //
        // Sample run (input: 1, then Discrete Mathematics, then 3):
        // Enter your semester: 1
        // Enter your favorite course: Discrete Mathematics
        // Enter its credits: 3
        // Semester 1: Discrete Mathematics
        // Weekly study time: 8 hours 30 minutes

        final int MINUTES_PER_CREDIT = 170;

        // Write your code below / Tulis kodemu di bawah ini:



        System.out.println("===== Exercise 10 / Soal 10 (Challenge) =====");
        // EN: Split a restaurant bill between friends. Ask for the total bill
        //     and the number of friends. Each person pays the same amount,
        //     rounded UP to the nearest ROUNDING_UNIT (1000), so nobody has to
        //     pay with coins. Then show how much is collected and the extra.
        //     Hint: divide as double, divide by ROUNDING_UNIT, Math.ceil,
        //     multiply by ROUNDING_UNIT, cast to int.
        // ID: Bagi tagihan restoran di antara teman-teman. Tanyakan total tagihan
        //     dan jumlah teman. Setiap orang membayar jumlah yang sama, dibulatkan
        //     ke ATAS ke kelipatan ROUNDING_UNIT (1000) terdekat, supaya tidak ada
        //     yang bayar pakai koin. Lalu tampilkan total uang yang terkumpul dan
        //     kelebihannya.
        //     Petunjuk: bagi sebagai double, bagi dengan ROUNDING_UNIT, Math.ceil,
        //     kalikan dengan ROUNDING_UNIT, cast ke int.
        //
        // Sample run (input: 125000, then 3):
        // Enter the total bill: 125000
        // Enter the number of friends: 3
        // Each person pays: Rp 42000
        // Total collected: Rp 126000
        // Extra money: Rp 1000

        final int ROUNDING_UNIT = 1000;

        // Write your code below / Tulis kodemu di bawah ini:



        input.close();   // given: close the Scanner at the very end / tutup Scanner di paling akhir
    }
}
