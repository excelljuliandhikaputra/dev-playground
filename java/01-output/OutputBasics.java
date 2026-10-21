/*
 * Topic 01 - Output (println & print)
 * Topik 01 - Output (println & print)
 * ====================================
 * EN: Topics covered in this lesson file.
 * ID: Topik yang dibahas di file ini.
 *
 *     1. Structure of a Java program        | Struktur program Java
 *     2. println vs print                   | println vs print
 *     3. Joining text with +                | Menggabungkan teks dengan +
 *     4. Escape characters                  | Karakter escape
 *     5. Comments                           | Komentar
 *     6. Common beginner mistakes           | Kesalahan umum pemula
 *
 * Run this file / Jalankan file ini:
 *     java OutputBasics.java
 */

// ---------------------------------------------------------------------------
// 1. Structure of a Java program
// EN: Every Java program lives inside a CLASS. The class name must be
//     EXACTLY the same as the file name (OutputBasics -> OutputBasics.java).
//     The program starts running from the `main` method.
//     For now, just accept `public static void main(String[] args)` as
//     "the starting point". Each word will make sense in later topics.
// ID: Setiap program Java berada di dalam sebuah CLASS. Nama class harus
//     SAMA PERSIS dengan nama file (OutputBasics -> OutputBasics.java).
//     Program mulai berjalan dari method `main`.
//     Untuk sekarang, anggap saja `public static void main(String[] args)`
//     sebagai "titik awal program". Arti tiap katanya dibahas di topik nanti.
// ---------------------------------------------------------------------------
public class OutputBasics {

    public static void main(String[] args) {

        // -------------------------------------------------------------------
        // 2. println vs print
        // EN: println() prints text, then moves to a NEW line.
        //     print()   prints text and STAYS on the same line.
        //     Every statement ends with a semicolon ;
        // ID: println() mencetak teks, lalu pindah ke baris BARU.
        //     print()   mencetak teks dan TETAP di baris yang sama.
        //     Setiap perintah diakhiri titik koma ;
        // -------------------------------------------------------------------
        System.out.println("Hello, World!");

        System.out.print("Loading");
        System.out.print("...");
        System.out.println(" Done!");     // all on ONE line / semuanya di SATU baris

        System.out.println();             // empty line / baris kosong


        // -------------------------------------------------------------------
        // 3. Joining text with +
        // EN: Java has no `sep` like Python. Use + to join pieces of text.
        //     Text + number also works: the number becomes text.
        // ID: Java tidak punya `sep` seperti Python. Pakai + untuk
        //     menggabungkan potongan teks. Teks + angka juga bisa:
        //     angkanya otomatis jadi teks.
        // -------------------------------------------------------------------
        System.out.println("Course: " + "Algorithms");
        System.out.println("Score: " + 88);
        System.out.println("2026" + "-" + "10" + "-" + "12");   // 2026-10-12

        // EN: Careful! Java reads + from left to right. Numbers that come
        //     BEFORE any text are added together first.
        // ID: Hati-hati! Java membaca + dari kiri ke kanan. Angka yang
        //     muncul SEBELUM teks akan dijumlahkan dulu.
        System.out.println(1 + 2 + " apples");    // 3 apples
        System.out.println("apples " + 1 + 2);    // apples 12


        // -------------------------------------------------------------------
        // 4. Escape characters
        // EN: \n  = new line
        //     \t  = tab
        //     \"  = a double quote inside text
        //     \\  = a backslash
        // ID: \n  = baris baru
        //     \t  = tab
        //     \"  = tanda kutip ganda di dalam teks
        //     \\  = garis miring terbalik (backslash)
        // -------------------------------------------------------------------
        System.out.println("Line 1\nLine 2");
        System.out.println("Name:\tExcell");
        System.out.println("Campus:\tUNAIR");
        System.out.println("She said \"Hi!\"");
        System.out.println("C:\\Users\\excel");


        // -------------------------------------------------------------------
        // 5. Comments
        // EN: // = a one-line comment
        //     /* ... */ = a comment that can span many lines
        //     Comments are ignored by Java. Use them to explain your code.
        // ID: // = komentar satu baris
        //     /* ... */ = komentar beberapa baris
        //     Komentar diabaikan Java. Pakai untuk menjelaskan kodemu.
        // -------------------------------------------------------------------
        /*
         * This line is ignored.
         * Baris ini diabaikan.
         */


        // -------------------------------------------------------------------
        // 6. Common beginner mistakes / Kesalahan umum pemula
        // EN: Each line below would cause an ERROR. They're commented out.
        // ID: Setiap baris di bawah akan ERROR. Sengaja diberi komentar.
        // -------------------------------------------------------------------
        // System.out.println("Hi")       -> missing ; / lupa titik koma
        // system.out.println("Hi");      -> must be System (capital S) / harus S besar
        // System.out.Println("Hi");      -> must be println (small p) / harus p kecil
        // System.out.println('Hi');      -> text needs "double quotes" / teks harus kutip ganda
    }
}
