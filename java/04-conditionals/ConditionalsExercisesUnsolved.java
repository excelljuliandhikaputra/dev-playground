/*
 * Topic 04 - Conditionals Exercises (UNSOLVED)
 * Topik 04 - Latihan Percabangan (BELUM DIKERJAKAN)
 * ==================================================
 * EN - How to use:
 *     1. Under each exercise, write your own code.
 *     2. Run:  java ConditionalsExercisesUnsolved.java
 *     3. Compare your output with the "Expected output" in each exercise.
 *        It must match EXACTLY (spaces, punctuation, capital letters).
 *
 * ID - Cara pakai:
 *     1. Di bawah setiap soal, tulis kodemu sendiri.
 *     2. Jalankan:  java ConditionalsExercisesUnsolved.java
 *     3. Bandingkan hasilmu dengan "Expected output" di setiap soal.
 *        Harus PERSIS sama (spasi, tanda baca, huruf besar/kecil).
 *
 * Rules / Aturan:
 *     - Only use Topic 01-04 material. No loops yet.
 *       Hanya pakai materi Topik 01-04. Belum boleh pakai loop.
 *     - NO HARDCODING: always print using the variables. Your if/switch
 *       must DECIDE the answer from the data.
 *       JANGAN HARDCODE: selalu cetak memakai variabel. if/switch-mu harus
 *       MENENTUKAN jawabannya dari data.
 *     - A variable name can only be declared ONCE in the whole file. Where an
 *       exercise suggests names, use them, so no names clash.
 *       Nama variabel hanya boleh dideklarasikan SEKALI di seluruh file.
 *       Kalau soal menyarankan nama, pakai nama itu supaya tidak bentrok.
 *
 * Self-check / Cek sendiri:
 *     Some exercises have "More checks". Change the given values to those,
 *     run again, and compare. If your output doesn't change, you hardcoded
 *     something.
 *     Beberapa soal punya "More checks". Ganti nilai yang diberikan dengan
 *     nilai itu, jalankan lagi, lalu bandingkan. Kalau output-mu tidak ikut
 *     berubah, berarti ada yang di-hardcode.
 *
 * IMPORTANT / PENTING:
 *     EN: When you save your answers as ConditionalsExercisesSolved.java,
 *         rename the class below to ConditionalsExercisesSolved too.
 *     ID: Saat menyimpan jawaban sebagai ConditionalsExercisesSolved.java,
 *         ganti juga nama class di bawah menjadi ConditionalsExercisesSolved.
 */
public class ConditionalsExercisesUnsolved {

    public static void main(String[] args) {

        System.out.println("===== Exercise 1 / Soal 1 =====");
        // EN: A score of 65 or more is PASSED, below 65 is FAILED.
        //     Check BOTH scores with if / else.
        // ID: Nilai 65 ke atas berarti PASSED, di bawah 65 berarti FAILED.
        //     Cek KEDUA nilai dengan if / else.
        //
        // Expected output:
        // Algorithms: 72 -> PASSED
        // Calculus: 58 -> FAILED

        int algorithmsScore = 72;
        int calculusScore = 58;

        // Write your code below / Tulis kodemu di bawah ini:



        System.out.println("===== Exercise 2 / Soal 2 =====");
        // EN: Print whether each number is even or odd.
        //     Hint: a number is even when number % 2 == 0.
        // ID: Cetak apakah setiap angka genap (even) atau ganjil (odd).
        //     Petunjuk: sebuah angka genap kalau angka % 2 == 0.
        //
        // Expected output:
        // 27 is odd
        // 104 is even

        int ticketNumber = 27;
        int roomNumber = 104;

        // Write your code below / Tulis kodemu di bawah ini:



        System.out.println("===== Exercise 3 / Soal 3 =====");
        // EN: Convert the score to a UNAIR letter grade and grade point
        //     with an if / else if / else chain.
        //       A >= 85 (4.0)    AB 80-84 (3.5)   B 75-79 (3.0)   BC 70-74 (2.5)
        //       C 65-69 (2.0)    D 50-64 (1.0)    E < 50 (0.0)
        //     Suggested names: letterGrade (String), gradePoint (double).
        // ID: Ubah nilai menjadi huruf mutu dan angka mutu UNAIR dengan
        //     rantai if / else if / else.
        //     Nama yang disarankan: letterGrade (String), gradePoint (double).
        //
        // Expected output:
        // Score 81 -> AB (3.5)
        //
        // More checks (change finalExamScore and run again):
        //   85 -> A (4.0)     75 -> B (3.0)     65 -> C (2.0)     50 -> D (1.0)
        //   80 -> AB (3.5)    70 -> BC (2.5)    64 -> D (1.0)     49 -> E (0.0)

        int finalExamScore = 81;

        // Write your code below / Tulis kodemu di bawah ini:



        System.out.println("===== Exercise 4 / Soal 4 =====");
        // EN: Find the highest of the three quiz scores WITHOUT Math.max.
        //     Use if / else if and && to compare them.
        //     Suggested name: highestQuiz.
        // ID: Cari nilai tertinggi dari tiga nilai kuis TANPA Math.max.
        //     Pakai if / else if dan && untuk membandingkannya.
        //     Nama yang disarankan: highestQuiz.
        //
        // Expected output:
        // Highest quiz score: 91
        //
        // More checks (change the three scores and run again):
        //   95, 60, 70 -> 95      60, 70, 95 -> 95      80, 80, 80 -> 80

        int quizOne = 78;
        int quizTwo = 91;
        int quizThree = 85;

        // Write your code below / Tulis kodemu di bawah ini:



        System.out.println("===== Exercise 5 / Soal 5 =====");
        // EN: A simple login check, done for two attempts.
        //     - The username ignores capital letters (equalsIgnoreCase).
        //     - The password must match EXACTLY (equals).
        //     - Both must be correct (&&).
        //     Don't use == for Strings (Basics section 6).
        // ID: Cek login sederhana, untuk dua kali percobaan.
        //     - Username tidak peduli huruf besar/kecil (equalsIgnoreCase).
        //     - Password harus SAMA PERSIS (equals).
        //     - Keduanya harus benar (&&).
        //     Jangan pakai == untuk String (Basics bagian 6).
        //
        // Expected output:
        // Attempt 1: Login successful. Welcome, Excell!
        // Attempt 2: Wrong username or password.

        String savedUsername = "excell";
        String savedPassword = "unair2026";

        String firstTryUsername = "Excell";
        String firstTryPassword = "unair2026";

        String secondTryUsername = "EXCELL";
        String secondTryPassword = "Unair2026";

        // Write your code below / Tulis kodemu di bawah ini:



        System.out.println("===== Exercise 6 / Soal 6 =====");
        // EN: Turn the day number into a day name with a switch
        //     (classic or arrow form, your choice).
        //     1 = Monday ... 7 = Sunday. Any other number is "Invalid day".
        //     Suggested name: dayName.
        // ID: Ubah nomor hari menjadi nama hari dengan switch
        //     (bentuk klasik atau panah, bebas).
        //     1 = Monday ... 7 = Sunday. Angka lain berarti "Invalid day".
        //     Nama yang disarankan: dayName.
        //
        // Expected output:
        // Day 3: Wednesday
        //
        // More checks (change dayOfWeek and run again):
        //   1 -> Day 1: Monday     7 -> Day 7: Sunday     0 -> Day 0: Invalid day

        int dayOfWeek = 3;

        // Write your code below / Tulis kodemu di bawah ini:



        System.out.println("===== Exercise 7 / Soal 7 =====");
        // EN: Ticket price for the campus festival:
        //       under 5       -> Rp 0 (free)
        //       5 to 17       -> Rp 25000
        //       18 to 59      -> Rp 50000, but only Rp 35000 with a student card
        //       60 and older  -> Rp 30000
        //     Use an else if chain, and a NESTED if for the student card.
        //     Suggested name: ticketPrice.
        // ID: Harga tiket festival kampus:
        //       di bawah 5      -> Rp 0 (gratis)
        //       5 sampai 17     -> Rp 25000
        //       18 sampai 59    -> Rp 50000, tapi hanya Rp 35000 kalau punya kartu mahasiswa
        //       60 ke atas      -> Rp 30000
        //     Pakai rantai else if, dan if BERSARANG untuk kartu mahasiswa.
        //     Nama yang disarankan: ticketPrice.
        //
        // Expected output:
        // Age 20, student card: true -> Rp 35000
        //
        // More checks (change visitorAge and hasStudentCard, run again):
        //   4, false  -> Rp 0        12, true  -> Rp 25000
        //   20, false -> Rp 50000    60, true  -> Rp 30000

        int visitorAge = 20;
        boolean hasStudentCard = true;

        // Write your code below / Tulis kodemu di bawah ini:



        System.out.println("===== Exercise 8 / Soal 8 =====");
        // EN: Print the credits with the right word: "1 credit" but
        //     "3 credits". Use the ternary operator ? : to choose the word.
        //     Do the same for the total.
        // ID: Cetak jumlah SKS dengan kata yang tepat: "1 credit" tapi
        //     "3 credits". Pakai operator ternary ? : untuk memilih katanya.
        //     Lakukan juga untuk totalnya.
        //
        // Expected output:
        // Algorithms: 3 credits
        // Seminar: 1 credit
        // Total: 4 credits

        int algorithmsCredits = 3;
        int seminarCredits = 1;

        // Write your code below / Tulis kodemu di bawah ini:



        System.out.println("===== Exercise 9 / Soal 9 (Challenge) =====");
        // EN: A year is a leap year if:
        //       it is divisible by 4 AND (it is NOT divisible by 100 OR it IS divisible by 400)
        //     Write the rule as ONE condition with && and ||, then check both years.
        // ID: Sebuah tahun adalah tahun kabisat kalau:
        //       habis dibagi 4 DAN (TIDAK habis dibagi 100 ATAU habis dibagi 400)
        //     Tulis aturannya sebagai SATU kondisi dengan && dan ||, lalu cek kedua tahun.
        //
        // Expected output:
        // 2024 is a leap year
        // 1900 is not a leap year
        //
        // More checks (change the years and run again):
        //   2000 -> leap year      2026 -> not a leap year      2100 -> not a leap year

        int yearOne = 2024;
        int yearTwo = 1900;

        // Write your code below / Tulis kodemu di bawah ini:



        System.out.println("===== Exercise 10 / Soal 10 (Challenge) =====");
        // EN: A student gets the scholarship only if ALL of these are true:
        //       - no warning letter
        //       - attendance is at least 80
        //       - GPA is at least 3.50, OR GPA is at least 3.00 AND the student
        //         is active in a student organization
        //     Check Ani and Budi. Use && || ! and ( ) carefully.
        //     Suggested names: aniEligible, budiEligible (boolean).
        // ID: Mahasiswa mendapat beasiswa hanya kalau SEMUA ini benar:
        //       - tidak punya surat peringatan
        //       - kehadiran minimal 80
        //       - IPK minimal 3.50, ATAU IPK minimal 3.00 DAN mahasiswanya
        //         aktif di organisasi mahasiswa
        //     Cek Ani dan Budi. Pakai && || ! dan ( ) dengan hati-hati.
        //     Nama yang disarankan: aniEligible, budiEligible (boolean).
        //
        // Expected output:
        // Ani: ELIGIBLE
        // Budi: NOT ELIGIBLE
        //
        // More checks (change Ani's data and run again):
        //   3.90, 95, true, true   -> Ani: NOT ELIGIBLE   (warning letter)
        //   3.10, 85, false, false -> Ani: NOT ELIGIBLE   (GPA too low, not active)
        //   3.50, 80, false, false -> Ani: ELIGIBLE

        double aniGpa = 3.25;
        int aniAttendance = 92;
        boolean aniHasWarning = false;
        boolean aniIsActive = true;

        double budiGpa = 3.80;
        int budiAttendance = 78;
        boolean budiHasWarning = false;
        boolean budiIsActive = false;

        // Write your code below / Tulis kodemu di bawah ini:


    }
}
