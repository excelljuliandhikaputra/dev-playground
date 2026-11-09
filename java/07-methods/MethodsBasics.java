/*
 * Topic 07 - Methods
 * Topik 07 - Method
 * ==================
 * EN: Topics covered in this lesson file.
 * ID: Topik yang dibahas di file ini.
 *
 *     1. What is a method?                 | Apa itu method?
 *     2. Your first method (void)          | Method pertama (void)
 *     3. Parameters                        | Parameter
 *     4. Return values                     | Nilai kembalian (return)
 *     5. Returning boolean and String      | Mengembalikan boolean dan String
 *     6. Arrays as parameters              | Array sebagai parameter
 *     7. Overloading                       | Overloading
 *     8. Scope: where a variable lives     | Scope: tempat sebuah variabel hidup
 *     9. Methods calling methods           | Method memanggil method lain
 *
 * Run this file / Jalankan file ini:
 *     java MethodsBasics.java
 */
import java.util.Arrays;

public class MethodsBasics {

    // -----------------------------------------------------------------------
    // 1. What is a method?
    // EN: A method is a named block of code. You write it ONCE and run
    //     ("call") it as many times as you want. You have been CALLING
    //     methods since Topic 01 (println, Math.max, Arrays.sort). Now you
    //     write your own. It's the Java version of Python's `def`.
    //
    //     public static  double  celsiusToFahrenheit  (double celsius)  { ... }
    //     |-----------|  |----|  |-----------------|  |--------------|
    //     accept for now return       name              parameters
    //                     type
    //
    //     `public static` = accept it for now. `static` means you can call
    //     the method directly from main() without creating an object
    //     (objects come in Topic 09).
    //
    //     In this file the methods come first and main() is at the BOTTOM.
    //     The order doesn't matter in Java: main() can call a method written
    //     above or below it. (In Python, a function must be defined before
    //     the line that calls it runs.)
    // ID: Method adalah blok kode yang punya nama. Kamu menulisnya SEKALI
    //     lalu menjalankannya ("memanggil") sesering yang kamu mau. Sejak
    //     Topik 01 kamu sudah MEMANGGIL method (println, Math.max,
    //     Arrays.sort). Sekarang kamu membuat method sendiri. Ini versi Java
    //     dari `def` di Python.
    //
    //     `public static` = terima saja dulu. `static` artinya method bisa
    //     dipanggil langsung dari main() tanpa membuat objek (objek dibahas
    //     di Topik 09).
    //
    //     Di file ini method ditulis duluan dan main() ada di PALING BAWAH.
    //     Di Java urutannya tidak penting: main() bisa memanggil method yang
    //     ditulis di atas maupun di bawahnya. (Di Python, fungsi harus sudah
    //     didefinisikan sebelum baris yang memanggilnya dijalankan.)
    // -----------------------------------------------------------------------


    // -----------------------------------------------------------------------
    // 2. Your first method (void)
    // EN: `void` means the method does something (like printing) but gives
    //     NO value back. Call it with its name and ( ).
    // ID: `void` artinya method melakukan sesuatu (misalnya mencetak) tapi
    //     TIDAK mengembalikan nilai. Panggil dengan namanya dan ( ).
    // -----------------------------------------------------------------------
    public static void printDivider() {
        System.out.println("------------------------------");
    }


    // -----------------------------------------------------------------------
    // 3. Parameters
    // EN: Parameters are the inputs of a method, written as `type name`,
    //     separated by commas. Every parameter needs its own type.
    //     When you call the method, you pass ARGUMENTS: real values in the
    //     same order and with the same types.
    // ID: Parameter adalah input dari method, ditulis `tipe nama`, dipisah
    //     koma. Setiap parameter butuh tipenya sendiri.
    //     Saat memanggil method, kamu mengirim ARGUMEN: nilai asli dengan
    //     urutan dan tipe yang sama.
    // -----------------------------------------------------------------------
    public static void printCourse(String courseName, int credits) {
        System.out.println(courseName + " (" + credits + " credits)");
    }

    // public static void printCourse(String courseName, credits)
    //   -> ERROR: every parameter needs a type / setiap parameter butuh tipe


    // -----------------------------------------------------------------------
    // 4. Return values
    // EN: Instead of `void`, write the TYPE of the value the method gives
    //     back. `return value;` sends that value back to the caller and
    //     ENDS the method right away. The caller can store it, print it,
    //     or use it in a calculation.
    // ID: Selain `void`, tulis TIPE nilai yang dikembalikan method.
    //     `return nilai;` mengirim nilai itu kembali ke pemanggil dan
    //     LANGSUNG mengakhiri method. Pemanggil bisa menyimpannya,
    //     mencetaknya, atau memakainya dalam perhitungan.
    // -----------------------------------------------------------------------
    public static double celsiusToFahrenheit(double celsius) {
        return celsius * 9 / 5 + 32;
        // return 9 / 5 * celsius + 32;   -> WRONG: 9 / 5 is int division = 1
        //                                   SALAH: 9 / 5 adalah pembagian int = 1
    }

    public static int totalPrice(int price, int quantity) {
        int total = price * quantity;
        return total;
        // System.out.println("done");   -> ERROR: unreachable, the method already ended
        //                                  ERROR: tidak terjangkau, method sudah selesai
    }


    // -----------------------------------------------------------------------
    // 5. Returning boolean and String
    // EN: A method that answers yes/no returns a boolean. Its name often
    //     starts with "is", "has", or "can". A comparison is already
    //     true/false, so you can return it directly.
    //     With if/else, EVERY possible path must reach a return. If one path
    //     has no return, Java says "missing return statement".
    // ID: Method yang menjawab ya/tidak mengembalikan boolean. Namanya sering
    //     diawali "is", "has", atau "can". Sebuah perbandingan sudah bernilai
    //     true/false, jadi bisa langsung di-return.
    //     Dengan if/else, SETIAP jalur yang mungkin harus sampai ke return.
    //     Kalau ada jalur tanpa return, Java bilang "missing return statement".
    // -----------------------------------------------------------------------
    public static boolean isPassing(int score) {
        return score >= 65;          // grade C or better at UNAIR / grade C ke atas di UNAIR
    }

    public static String creditLoad(int totalCredits) {
        if (totalCredits > 24) {
            return "Too many credits";
        } else if (totalCredits >= 18) {
            return "Normal load";
        } else {
            return "Light load";
        }
        // EN: Without the final else, the method could end with no return -> ERROR.
        // ID: Tanpa else terakhir, method bisa selesai tanpa return -> ERROR.
    }


    // -----------------------------------------------------------------------
    // 6. Arrays as parameters
    // EN: A parameter can be an array: `int[] scores`. To call it, pass an
    //     array variable, or create one on the spot: new int[] {50, 65, 90}.
    //     IMPORTANT: the method gets the SAME array (not a copy), so if it
    //     changes the items, the caller sees the change (remember Topic 06,
    //     section 6).
    // ID: Parameter bisa berupa array: `int[] scores`. Untuk memanggilnya,
    //     kirim variabel array, atau buat langsung: new int[] {50, 65, 90}.
    //     PENTING: method menerima array yang SAMA (bukan salinan), jadi kalau
    //     method mengubah isinya, pemanggil juga melihat perubahannya (ingat
    //     Topik 06, bagian 6).
    // -----------------------------------------------------------------------
    public static int countAbove(int[] scores, int limit) {
        int count = 0;
        for (int score : scores) {
            if (score > limit) {
                count++;
            }
        }
        return count;
    }

    public static void addBonus(int[] scores, int bonus) {
        for (int i = 0; i < scores.length; i++) {
            scores[i] += bonus;      // changes the caller's array / mengubah array milik pemanggil
        }
    }


    // -----------------------------------------------------------------------
    // 7. Overloading
    // EN: Several methods can share the SAME name if their parameter lists
    //     are different (different number or types of parameters). Java
    //     picks the right one from the arguments you pass.
    //     Java has no default parameters like Python's `def f(x, y=0)`.
    //     Overloading is how you get the same effect: the short version
    //     calls the long version with the default value.
    // ID: Beberapa method boleh memakai nama yang SAMA kalau daftar
    //     parameternya berbeda (jumlah atau tipe parameternya beda). Java
    //     memilih yang cocok berdasarkan argumen yang dikirim.
    //     Java tidak punya default parameter seperti `def f(x, y=0)` di Python.
    //     Overloading adalah caranya: versi pendek memanggil versi panjang
    //     dengan nilai default.
    // -----------------------------------------------------------------------
    public static int add(int a, int b) {
        return a + b;
    }

    public static int add(int a, int b, int c) {
        return a + b + c;
    }

    public static double add(double a, double b) {
        return a + b;
    }

    // public static double add(int a, int b) { ... }
    //   -> ERROR: same parameters as add(int, int). A different return type alone is NOT enough.
    //      ERROR: parameternya sama dengan add(int, int). Beda tipe return saja TIDAK cukup.

    public static void welcome(String name) {
        welcome(name, "UNAIR");      // default campus / kampus default
    }

    public static void welcome(String name, String campus) {
        System.out.println("Welcome to " + campus + ", " + name + "!");
    }


    // -----------------------------------------------------------------------
    // 8. Scope: where a variable lives
    // EN: A variable only lives inside the { } where it was declared.
    //     - Variables inside a method (and its parameters) are LOCAL: other
    //       methods, including main(), can't see them.
    //     - A variable declared inside a loop or if only lives in that block.
    //     - Two different methods may use the same variable name without
    //       any clash.
    //     - A primitive argument (int, double, ...) is COPIED into the
    //       parameter, so changing the parameter doesn't change the caller's
    //       variable. (Arrays are different, see section 6.)
    // ID: Sebuah variabel hanya hidup di dalam { } tempat ia dideklarasikan.
    //     - Variabel di dalam method (dan parameternya) bersifat LOKAL: method
    //       lain, termasuk main(), tidak bisa melihatnya.
    //     - Variabel yang dideklarasikan di dalam loop atau if hanya hidup di
    //       blok itu.
    //     - Dua method yang berbeda boleh memakai nama variabel yang sama
    //       tanpa bentrok.
    //     - Argumen primitif (int, double, ...) DISALIN ke parameter, jadi
    //       mengubah parameter tidak mengubah variabel milik pemanggil.
    //       (Array berbeda, lihat bagian 6.)
    // -----------------------------------------------------------------------
    public static void scopeDemo() {
        int count = 10;              // a different `count` from the one in countAbove()
                                     // `count` yang berbeda dari yang ada di countAbove()
        System.out.println("Inside scopeDemo: " + count);
    }

    public static void tryToChange(int number) {
        number = 999;                // changes the COPY only / hanya mengubah SALINAN
    }


    // -----------------------------------------------------------------------
    // 9. Methods calling methods
    // EN: A method can call other methods. Split a big job into small
    //     methods that each do ONE thing, then combine them. If a rule
    //     changes, you fix it in one place only.
    // ID: Sebuah method bisa memanggil method lain. Pecah pekerjaan besar
    //     menjadi method-method kecil yang masing-masing mengerjakan SATU hal,
    //     lalu gabungkan. Kalau aturannya berubah, cukup diperbaiki di satu
    //     tempat.
    // -----------------------------------------------------------------------
    public static double attendancePercent(int present, int totalMeetings) {
        return present * 100.0 / totalMeetings;
    }

    public static boolean canTakeFinalExam(int present, int totalMeetings) {
        return attendancePercent(present, totalMeetings) >= 75;   // reuses the method above
                                                                   // memakai ulang method di atas
    }

    public static void printAttendance(String name, int present, int totalMeetings) {
        System.out.printf("%s: %.2f percent, final exam allowed: %s%n",
                name, attendancePercent(present, totalMeetings),
                canTakeFinalExam(present, totalMeetings));
    }


    // =======================================================================
    // main(): calls every example above, section by section
    //         memanggil setiap contoh di atas, bagian demi bagian
    // =======================================================================
    public static void main(String[] args) {

        // 2. Your first method (void) / Method pertama (void)
        printDivider();                                // ------------------------------
        printDivider();                                // ------------------------------
        // printDivider;                -> ERROR: a call needs ( ) / pemanggilan butuh ( )


        // 3. Parameters / Parameter
        printCourse("Algorithms", 3);                  // Algorithms (3 credits)
        printCourse("English", 2);                     // English (2 credits)
        // printCourse(3, "Algorithms");  -> ERROR: wrong order/types / urutan atau tipe salah
        // printCourse("Algorithms");     -> ERROR: missing argument / argumen kurang


        // 4. Return values / Nilai kembalian
        double hotDay = celsiusToFahrenheit(35);
        System.out.println(hotDay);                          // 95.0
        System.out.println(celsiusToFahrenheit(100) + 1);    // 213.0
        System.out.println(totalPrice(12000, 3));            // 36000

        celsiusToFahrenheit(20);       // allowed, but the result is thrown away
                                       // boleh, tapi hasilnya dibuang begitu saja
        // int nothing = printDivider();   -> ERROR: a void method gives nothing back
        //                                    ERROR: method void tidak mengembalikan apa-apa


        // 5. Returning boolean and String / Mengembalikan boolean dan String
        System.out.println(isPassing(70));             // true
        System.out.println(isPassing(64));             // false
        if (isPassing(80)) {
            System.out.println("Passed!");             // Passed!
        }
        System.out.println(creditLoad(21));            // Normal load
        System.out.println(creditLoad(26));            // Too many credits


        // 6. Arrays as parameters / Array sebagai parameter
        int[] quiz = {60, 70, 80};
        System.out.println(countAbove(quiz, 65));                       // 2
        System.out.println(countAbove(new int[] {50, 65, 90, 99}, 65)); // 2

        addBonus(quiz, 5);
        System.out.println(Arrays.toString(quiz));     // [65, 75, 85]  (the original changed / array aslinya berubah)


        // 7. Overloading
        System.out.println(add(2, 3));                 // 5     -> add(int, int)
        System.out.println(add(2, 3, 4));              // 9     -> add(int, int, int)
        System.out.println(add(2.5, 0.25));            // 2.75  -> add(double, double)
        welcome("Excell");                             // Welcome to UNAIR, Excell!
        welcome("Budi", "Campus B");                   // Welcome to Campus B, Budi!


        // 8. Scope / Scope
        scopeDemo();                                   // Inside scopeDemo: 10
        // System.out.println(count);    -> ERROR: `count` only lives inside scopeDemo()
        //                                  ERROR: `count` hanya hidup di dalam scopeDemo()

        int myNumber = 5;
        tryToChange(myNumber);
        System.out.println(myNumber);                  // 5 (still 5 / tetap 5)

        for (int i = 0; i < 2; i++) {
            int insideLoop = i * 10;
            System.out.println(insideLoop);            // 0, then / lalu 10
        }
        // System.out.println(insideLoop);   -> ERROR: only lives inside the loop's { }
        //                                      ERROR: hanya hidup di dalam { } milik loop


        // 9. Methods calling methods / Method memanggil method lain
        printAttendance("Ani", 14, 16);                // Ani: 87.50 percent, final exam allowed: true
        printAttendance("Budi", 10, 16);               // Budi: 62.50 percent, final exam allowed: false
        // (EN: 87,50 with a comma is the same number on Indonesian settings.)
        // (ID: 87,50 dengan koma adalah angka yang sama di pengaturan Indonesia.)
    }
}
