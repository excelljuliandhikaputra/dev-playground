/*
 * Topic 01 - Output Exercises (SOLVED)
 * Topik 01 - Latihan Output (SUDAH DIKERJAKAN)
 * =============================================
 * EN - How to use:
 *     1. Under each exercise, write your own code.
 *     2. Run:  java OutputExercisesUnsolved.java
 *     3. Compare your output with the "Expected output" in each exercise.
 *        It must match EXACTLY (spaces, punctuation, capital letters).
 *
 * ID - Cara pakai:
 *     1. Di bawah setiap soal, tulis kodemu sendiri.
 *     2. Jalankan:  java OutputExercisesUnsolved.java
 *     3. Bandingkan hasilmu dengan "Expected output" di setiap soal.
 *        Harus PERSIS sama (spasi, tanda baca, huruf besar/kecil).
 *
 * Rules / Aturan:
 *     Only use Topic 01 material: println, print, +, escape characters.
 *     Hanya pakai materi Topik 01: println, print, +, karakter escape.
 *
 * IMPORTANT / PENTING:
 *     EN: When you save your answers as OutputExercisesSolved.java, you must
 *         ALSO rename the class below to OutputExercisesSolved. In Java, the
 *         class name and the file name must always match.
 *     ID: Saat menyimpan jawabanmu sebagai OutputExercisesSolved.java, kamu
 *         JUGA harus mengganti nama class di bawah menjadi OutputExercisesSolved.
 *         Di Java, nama class dan nama file harus selalu sama.
 */
public class OutputExercisesSolved {

    public static void main(String[] args) {

        System.out.println("===== Exercise 1 / Soal 1 =====");
        // EN: Print a greeting to yourself.
        // ID: Cetak sapaan untuk dirimu sendiri.
        //
        // Expected output:
        // Hello, Excell!

        // Write your code below / Tulis kodemu di bawah ini:
        System.out.println("Hello, Excell!");


        System.out.println("===== Exercise 2 / Soal 2 =====");
        // EN: Print A, B, C separated by " | ". Use ONE println and the + operator
        //     to join "A", "B", and "C" with the separator.
        // ID: Cetak A, B, C dipisah " | ". Pakai SATU println dan operator +
        //     untuk menggabungkan "A", "B", dan "C" dengan pemisahnya.
        //
        // Expected output:
        // A | B | C

        // Write your code below / Tulis kodemu di bawah ini:
        System.out.println("A" + " | " + "B" + " | " + "C");


        System.out.println("===== Exercise 3 / Soal 3 =====");
        // EN: Print "Loading" and "Done!" on the SAME line using TWO statements.
        //     Hint: print vs println.
        // ID: Cetak "Loading" dan "Done!" di baris yang SAMA memakai DUA perintah.
        //     Petunjuk: print vs println.
        //
        // Expected output:
        // Loading Done!

        // Write your code below / Tulis kodemu di bawah ini:
        System.out.print("Loading ");
        System.out.println("Done!");


        System.out.println("===== Exercise 4 / Soal 4 =====");
        // EN: Print two lines using only ONE println and \n.
        // ID: Cetak dua baris hanya dengan SATU println dan \n.
        //
        // Expected output:
        // Line 1
        // Line 2

        // Write your code below / Tulis kodemu di bawah ini:
        System.out.println("Line 1\nLine 2");


        System.out.println("===== Exercise 5 / Soal 5 =====");
        // EN: Print a small ID card. Use \t (tab) between the label and the value.
        // ID: Cetak kartu identitas kecil. Pakai \t (tab) di antara label dan isinya.
        //
        // Expected output:
        // Name:   Excell
        // Campus: UNAIR

        // Write your code below / Tulis kodemu di bawah ini:
        System.out.println("Name:\tExcell");
        System.out.println("Campus:\tUNAIR");


        System.out.println("===== Exercise 6 / Soal 6 =====");
        // EN: Print a sentence that contains double quotes.
        // ID: Cetak kalimat yang berisi tanda kutip ganda.
        //
        // Expected output:
        // Lecturer said: "Don't forget to submit!"

        // Write your code below / Tulis kodemu di bawah ini:
        System.out.println("Lecturer said: \"Don't forget to submit!\"");


        System.out.println("===== Exercise 7 / Soal 7 =====");
        // EN: Print this Windows folder path. Watch out for the backslashes.
        // ID: Cetak alamat folder Windows ini. Hati-hati dengan backslash-nya.
        //
        // Expected output:
        // C:\Users\excel\GitHub\dev-playground

        // Write your code below / Tulis kodemu di bawah ini:
        System.out.println("C:\\Users\\excel\\GitHub\\dev-playground");


        System.out.println("===== Exercise 8 / Soal 8 (Challenge) =====");
        // EN: Print this box using as FEW statements as you can.
        //     Bonus: can you do it with just ONE println?
        // ID: Cetak kotak ini dengan perintah sesedikit mungkin.
        //     Bonus: bisakah dengan SATU println saja?
        //
        // Expected output:
        // +--------+
        // |  JAVA  |
        // +--------+

        // Write your code below / Tulis kodemu di bawah ini:
        System.out.println("+--------+\n|  JAVA  |\n+--------+");

    }
}
