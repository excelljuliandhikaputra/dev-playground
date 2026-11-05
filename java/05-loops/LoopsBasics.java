/*
 * Topic 05 - Loops
 * Topik 05 - Perulangan (Loop)
 * =============================
 * EN: Topics covered in this lesson file.
 * ID: Topik yang dibahas di file ini.
 *
 *     1. The for loop                         | Loop for
 *     2. Counting down and other steps        | Menghitung mundur dan langkah lain
 *     3. Accumulator and counter              | Akumulator dan penghitung
 *     4. Looping over a String (charAt)       | Loop pada String (charAt)
 *     5. The while loop                       | Loop while
 *     6. The do-while loop                    | Loop do-while
 *     7. break and continue                   | break dan continue
 *     8. Nested loops                         | Loop bersarang
 *     9. Printing patterns                    | Mencetak pola
 *    10. Common beginner mistakes             | Kesalahan umum pemula
 *
 * Run this file / Jalankan file ini:
 *     java LoopsBasics.java
 */
import java.util.Scanner;

public class LoopsBasics {

    public static void main(String[] args) {

        // -------------------------------------------------------------------
        // 1. The for loop
        // EN: Use for when you know how many times to repeat.
        //         for (start; condition; update) { ... }
        //     1) start runs ONCE:            int i = 1
        //     2) condition checked each time: i <= 3   (false -> loop ends)
        //     3) body runs
        //     4) update runs:                i++       then back to step 2
        //     Python: for i in range(1, 4)   (Java includes the end with <=)
        // ID: Pakai for kalau kamu tahu berapa kali harus mengulang.
        //         for (awal; kondisi; perubahan) { ... }
        //     1) awal dijalankan SEKALI:      int i = 1
        //     2) kondisi dicek setiap putaran: i <= 3   (false -> loop selesai)
        //     3) isi loop dijalankan
        //     4) perubahan dijalankan:        i++       lalu kembali ke langkah 2
        //     Python: for i in range(1, 4)   (Java ikut menghitung ujungnya dengan <=)
        // -------------------------------------------------------------------
        for (int i = 1; i <= 3; i++) {
            System.out.println("Meeting " + i);
        }
        // Meeting 1
        // Meeting 2
        // Meeting 3

        // EN: Starting from 0 with < is also very common (like range(5)).
        // ID: Mulai dari 0 dengan < juga sangat umum (seperti range(5)).
        for (int i = 0; i < 5; i++) {
            System.out.print(i);
        }
        System.out.println();       // 01234


        // -------------------------------------------------------------------
        // 2. Counting down and other steps
        // EN: The update can be anything: i-- counts down, i += 5 jumps by 5.
        // ID: Bagian perubahan bisa apa saja: i-- menghitung mundur,
        //     i += 5 melompat 5.
        // -------------------------------------------------------------------
        for (int i = 5; i >= 1; i--) {
            System.out.print(i + " ");
        }
        System.out.println("Go!");  // 5 4 3 2 1 Go!

        for (int i = 0; i <= 20; i += 5) {
            System.out.print(i + " ");
        }
        System.out.println();       // 0 5 10 15 20

        // EN: Printing a list with commas but NO comma at the end:
        //     print the separator BEFORE every item except the first one.
        // ID: Mencetak daftar dengan koma tapi TANPA koma di akhir:
        //     cetak pemisahnya SEBELUM setiap item kecuali item pertama.
        for (int i = 1; i <= 4; i++) {
            if (i > 1) {
                System.out.print(", ");
            }
            System.out.print(i * 10);
        }
        System.out.println();       // 10, 20, 30, 40


        // -------------------------------------------------------------------
        // 3. Accumulator and counter
        // EN: Accumulator: a variable that starts at 0 and COLLECTS a total.
        //     Counter: a variable that starts at 0 and goes up by 1 each
        //     time something happens. Declare both BEFORE the loop.
        // ID: Akumulator: variabel yang mulai dari 0 dan MENGUMPULKAN total.
        //     Penghitung (counter): variabel yang mulai dari 0 dan naik 1
        //     setiap kali sesuatu terjadi. Deklarasikan keduanya SEBELUM loop.
        // -------------------------------------------------------------------
        int total = 0;
        int evenCount = 0;
        for (int i = 1; i <= 10; i++) {
            total += i;                 // accumulator / akumulator
            if (i % 2 == 0) {
                evenCount++;            // counter / penghitung
            }
        }
        System.out.println("Sum of 1 to 10: " + total);          // Sum of 1 to 10: 55
        System.out.println("Even numbers: " + evenCount);        // Even numbers: 5
        System.out.println("Average: " + total / 10.0);          // Average: 5.5


        // -------------------------------------------------------------------
        // 4. Looping over a String (charAt)
        // EN: Indexes go from 0 to length() - 1, so the condition is
        //     i < text.length(). charAt(i) gives one char.
        //     Compare chars with == and 'single quotes'.
        //     Python: for ch in text    (Java has no direct way yet; we use the index)
        // ID: Indeks berjalan dari 0 sampai length() - 1, jadi kondisinya
        //     i < text.length(). charAt(i) menghasilkan satu char.
        //     Bandingkan char dengan == dan 'kutip tunggal'.
        //     Python: for ch in text    (di Java kita pakai indeks dulu)
        // -------------------------------------------------------------------
        String campusName = "universitas airlangga";
        int letterACount = 0;
        for (int i = 0; i < campusName.length(); i++) {
            char letter = campusName.charAt(i);
            if (letter == 'a') {
                letterACount++;
            }
        }
        System.out.println("Letter a: " + letterACount);         // Letter a: 4

        // EN: Building a new String: start with "" and add to it in the loop.
        // ID: Membuat String baru: mulai dari "" lalu tambahkan isinya di dalam loop.
        String shortName = "UNAIR";
        String withDots = "";
        for (int i = 0; i < shortName.length(); i++) {
            withDots += shortName.charAt(i) + ".";
        }
        System.out.println(withDots);                            // U.N.A.I.R.


        // -------------------------------------------------------------------
        // 5. The while loop
        // EN: Use while when you DON'T know how many times to repeat, only
        //     WHEN to stop. The condition is checked BEFORE each round, so
        //     the body may run 0 times. (Same idea as Python's while.)
        //     Something inside must change, or the loop never ends.
        // ID: Pakai while kalau kamu TIDAK tahu berapa kali harus mengulang,
        //     hanya tahu KAPAN harus berhenti. Kondisinya dicek SEBELUM setiap
        //     putaran, jadi isinya bisa saja jalan 0 kali. (Sama seperti while
        //     di Python.) Harus ada yang berubah di dalamnya, kalau tidak
        //     loop-nya tidak pernah berhenti.
        // -------------------------------------------------------------------
        int followers = 10;
        int weeks = 0;
        while (followers < 1000) {
            followers *= 2;             // doubles every week / jadi dua kali lipat tiap minggu
            weeks++;
        }
        System.out.println(weeks + " weeks, " + followers + " followers");   // 7 weeks, 1280 followers


        // -------------------------------------------------------------------
        // 6. The do-while loop
        // EN: Like while, but the condition is checked AFTER the body, so the
        //     body ALWAYS runs at least once. Don't forget the ; at the end.
        //     Python has no do-while.
        // ID: Mirip while, tapi kondisinya dicek SETELAH isi loop, jadi isinya
        //     SELALU jalan minimal sekali. Jangan lupa ; di akhir.
        //     Python tidak punya do-while.
        // -------------------------------------------------------------------
        int attempts = 0;
        do {
            attempts++;
            System.out.println("Attempt " + attempts);           // Attempt 1
        } while (attempts < 0);     // false right away, but the body already ran once
                                    // langsung false, tapi isinya sudah jalan sekali

        // EN: A typical use: a menu that repeats until the user picks 0.
        //     We use the Topic 03 trick (a Scanner reading a String) so the
        //     file doesn't wait. The "user" picks 1, then 2, then 0.
        // ID: Contoh pemakaian umum: menu yang diulang sampai user memilih 0.
        //     Kita pakai trik Topik 03 (Scanner yang membaca String) supaya
        //     file ini tidak menunggu. "User" memilih 1, lalu 2, lalu 0.
        Scanner menuInput = new Scanner("1\n2\n0\n");
        int choice;
        do {
            System.out.println("[1] Schedule  [2] Grades  [0] Exit");
            choice = menuInput.nextInt();
            if (choice == 1) {
                System.out.println("-> Algorithms, Monday 08:00");
            } else if (choice == 2) {
                System.out.println("-> Algorithms: A");
            }
        } while (choice != 0);
        System.out.println("Bye!");
        menuInput.close();
        // [1] Schedule  [2] Grades  [0] Exit
        // -> Algorithms, Monday 08:00
        // [1] Schedule  [2] Grades  [0] Exit
        // -> Algorithms: A
        // [1] Schedule  [2] Grades  [0] Exit
        // Bye!


        // -------------------------------------------------------------------
        // 7. break and continue
        // EN: break    -> stop the loop completely, right now.
        //     continue -> skip the rest of THIS round, go to the next round.
        //     (Same as Python.)
        // ID: break    -> hentikan loop sepenuhnya, saat itu juga.
        //     continue -> lewati sisa putaran INI, lanjut ke putaran berikutnya.
        //     (Sama seperti Python.)
        // -------------------------------------------------------------------
        for (int i = 1; i <= 10; i++) {
            if (i == 4) {
                continue;               // skip 4 / lewati 4
            }
            if (i == 7) {
                break;                  // stop at 7 / berhenti di 7
            }
            System.out.print(i + " ");
        }
        System.out.println();           // 1 2 3 5 6

        for (int number = 51; number <= 100; number++) {
            if (number % 7 == 0) {
                System.out.println("First multiple of 7 after 50: " + number);   // First multiple of 7 after 50: 56
                break;                  // no need to check the rest / tidak perlu cek sisanya
            }
        }


        // -------------------------------------------------------------------
        // 8. Nested loops
        // EN: A loop inside a loop. For EVERY round of the outer loop, the
        //     inner loop runs completely. Think rows (outer) and columns (inner).
        //     Use different names for the two loop variables (row, col).
        // ID: Loop di dalam loop. Untuk SETIAP putaran loop luar, loop dalam
        //     dijalankan sampai selesai. Bayangkan baris (luar) dan kolom (dalam).
        //     Pakai nama berbeda untuk dua variabel loop-nya (row, col).
        // -------------------------------------------------------------------
        for (int row = 1; row <= 3; row++) {
            for (int col = 1; col <= 4; col++) {
                System.out.print(row * col + "\t");
            }
            System.out.println();       // new line after each row / baris baru setelah setiap baris
        }
        // 1    2    3    4
        // 2    4    6    8
        // 3    6    9    12


        // -------------------------------------------------------------------
        // 9. Printing patterns
        // EN: The trick: write down how many characters each row needs,
        //     using the row number. Row 3 of a triangle needs 3 stars,
        //     so the inner loop goes up to row.
        // ID: Triknya: tulis berapa karakter yang dibutuhkan setiap baris,
        //     memakai nomor barisnya. Baris ke-3 segitiga butuh 3 bintang,
        //     jadi loop dalamnya berjalan sampai row.
        // -------------------------------------------------------------------
        int triangleHeight = 4;
        for (int row = 1; row <= triangleHeight; row++) {
            for (int star = 1; star <= row; star++) {
                System.out.print("*");
            }
            System.out.println();
        }
        // *
        // **
        // ***
        // ****

        // EN: Right-aligned: first (height - row) spaces, then row stars.
        // ID: Rata kanan: pertama (height - row) spasi, lalu row bintang.
        for (int row = 1; row <= triangleHeight; row++) {
            for (int space = 1; space <= triangleHeight - row; space++) {
                System.out.print(" ");
            }
            for (int star = 1; star <= row; star++) {
                System.out.print("*");
            }
            System.out.println();
        }
        //    *
        //   **
        //  ***
        // ****


        // -------------------------------------------------------------------
        // 10. Common beginner mistakes / Kesalahan umum pemula
        // EN: Each example below is wrong. They're commented out.
        // ID: Setiap contoh di bawah ini salah. Sengaja diberi komentar.
        // -------------------------------------------------------------------
        // while (weeks < 10) { System.out.println(weeks); }
        //     -> INFINITE LOOP: weeks never changes. Stop it with Ctrl + C.
        //        LOOP TANPA AKHIR: weeks tidak pernah berubah. Hentikan dengan Ctrl + C.
        //
        // for (int i = 1; i <= 5; i--) { ... }
        //     -> INFINITE LOOP: i goes down, so i <= 5 is always true.
        //        LOOP TANPA AKHIR: i turun terus, jadi i <= 5 selalu true.
        //
        // for (int i = 0; i <= shortName.length(); i++) { shortName.charAt(i); }
        //     -> CRASH (StringIndexOutOfBoundsException): the last index is
        //        length() - 1. Use < not <=.
        //        ERROR: indeks terakhir adalah length() - 1. Pakai < bukan <=.
        //
        // for (int i = 1; i <= 5; i++); { System.out.println(i); }
        //     -> ERROR: the ; ends the loop, so the { } is not part of it.
        //        ; mengakhiri loop-nya, jadi { } bukan bagian dari loop.
        //
        // for (int i = 1; i <= 3; i++) { ... }
        // System.out.println(i);
        //     -> ERROR: i only exists INSIDE the loop.
        //        i hanya ada di DALAM loop.
        //
        // String pair = shortName.charAt(0) + shortName.charAt(1);
        //     -> ERROR: char + char gives a NUMBER ('U' + 'N' = 163), not "UN".
        //        Start with a String: "" + shortName.charAt(0) + shortName.charAt(1)
        //        char + char menghasilkan ANGKA, bukan "UN". Mulai dengan String.
        //
        // do { ... } while (attempts < 3)
        //     -> ERROR: missing ; after while (...) in a do-while.
        //        lupa ; setelah while (...) di do-while.
    }
}
