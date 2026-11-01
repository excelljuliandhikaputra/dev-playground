/*
 * Topic 02 - Variables & Data Types
 * Topik 02 - Variabel & Tipe Data
 * ==================================
 * EN: Topics covered in this lesson file.
 * ID: Topik yang dibahas di file ini.
 *
 *     1. Declaring variables               | Mendeklarasikan variabel
 *     2. Primitive data types              | Tipe data primitif
 *     3. String                            | String
 *     4. Naming rules (camelCase)          | Aturan penamaan (camelCase)
 *     5. Constants (final)                 | Konstanta (final)
 *     6. Arithmetic operators              | Operator aritmatika
 *     7. Joining text and numbers safely   | Menggabung teks dan angka dengan aman
 *     8. Type casting                      | Konversi tipe (casting)
 *     9. Basic String methods              | Method String dasar
 *    10. printf: formatting decimals       | printf: format angka desimal
 *
 * Run this file / Jalankan file ini:
 *     java VariablesBasics.java
 */
public class VariablesBasics {

    public static void main(String[] args) {

        // -------------------------------------------------------------------
        // 1. Declaring variables
        // EN: In Java you must write the TYPE before the variable name.
        //     Format:  type name = value;
        //     Once declared, a variable keeps that type forever.
        //     You can change its value, but you can't declare it twice.
        // ID: Di Java, TIPE harus ditulis sebelum nama variabel.
        //     Format:  tipe nama = nilai;
        //     Setelah dideklarasikan, tipe variabel itu tetap selamanya.
        //     Nilainya boleh diubah, tapi tidak boleh dideklarasikan dua kali.
        // -------------------------------------------------------------------
        int age = 20;
        System.out.println(age);

        age = 21;                 // OK: change the value / ubah nilainya
        System.out.println(age);

        // int age = 22;          -> ERROR: already declared / sudah dideklarasikan
        // age = "twenty";        -> ERROR: age is an int, not text / age bertipe int, bukan teks


        // -------------------------------------------------------------------
        // 2. Primitive data types
        // EN / ID:
        //   int      whole number              | bilangan bulat         20, -5
        //   long     very big whole number     | bilangan bulat besar   8_100_000_000L
        //   double   decimal number            | bilangan desimal       3.75
        //   boolean  true or false             | benar atau salah       true
        //   char     ONE character, 'single'   | SATU karakter, 'kutip tunggal'  'A'
        //
        // EN: Note: Java writes true/false in lowercase (Python: True/False).
        // ID: Catatan: Java menulis true/false dengan huruf kecil (Python: True/False).
        // -------------------------------------------------------------------
        int credits = 3;
        long worldPopulation = 8_100_000_000L;   // _ is just for readability / _ hanya agar mudah dibaca
        double gpa = 3.75;
        boolean isEnrolled = true;
        char grade = 'A';

        System.out.println(credits);
        System.out.println(worldPopulation);
        System.out.println(gpa);
        System.out.println(isEnrolled);
        System.out.println(grade);


        // -------------------------------------------------------------------
        // 3. String
        // EN: String stores text in "double quotes". It starts with a capital S
        //     because it's not a primitive type (it's a class - covered later).
        // ID: String menyimpan teks dalam "kutip ganda". Diawali huruf S kapital
        //     karena bukan tipe primitif (String adalah class - dibahas nanti).
        // -------------------------------------------------------------------
        String fullName = "Excell Juliandhika Putra";
        String campus = "UNAIR";
        System.out.println(fullName);


        // -------------------------------------------------------------------
        // 4. Naming rules
        // EN: Java uses camelCase: first word lowercase, next words start
        //     with a capital letter. (Python uses snake_case instead.)
        //     Can't start with a number, can't contain spaces.
        // ID: Java memakai camelCase: kata pertama huruf kecil, kata berikutnya
        //     diawali huruf kapital. (Python memakai snake_case.)
        //     Tidak boleh diawali angka, tidak boleh ada spasi.
        //
        //     Python:  target_gpa   is_enrolled   current_year
        //     Java:    targetGpa    isEnrolled    currentYear
        // -------------------------------------------------------------------
        int currentYear = 2026;
        double targetGpa = 3.8;


        // -------------------------------------------------------------------
        // 5. Constants (final)
        // EN: `final` means the value can NEVER change after it's set.
        //     Constants are written in UPPER_SNAKE_CASE.
        // ID: `final` berarti nilainya TIDAK BISA diubah setelah diisi.
        //     Konstanta ditulis dengan UPPER_SNAKE_CASE.
        // -------------------------------------------------------------------
        final int YEARS_TO_GRADUATE = 4;
        // YEARS_TO_GRADUATE = 5;   -> ERROR: final can't be changed / final tidak bisa diubah

        int graduationYear = currentYear + YEARS_TO_GRADUATE;
        System.out.println(graduationYear);       // 2030


        // -------------------------------------------------------------------
        // 6. Arithmetic operators
        // EN:  +  -  *  /  %  (Java has no ** - power comes in Topic 03)
        //      IMPORTANT: int / int gives an int. The decimal part is CUT.
        //      If at least one side is a double, you get a double.
        // ID:  +  -  *  /  %  (Java tidak punya ** - pangkat ada di Topik 03)
        //      PENTING: int / int hasilnya int. Bagian desimalnya DIPOTONG.
        //      Kalau salah satu sisi double, hasilnya double.
        // -------------------------------------------------------------------
        int a = 17;
        int b = 5;
        System.out.println(a + b);       // 22
        System.out.println(a - b);       // 12
        System.out.println(a * b);       // 85
        System.out.println(a / b);       // 3   (NOT 3.4! / BUKAN 3.4!)
        System.out.println(a % b);       // 2   (remainder / sisa bagi)
        System.out.println(a / 5.0);     // 3.4 (5.0 is a double / 5.0 adalah double)


        // -------------------------------------------------------------------
        // 7. Joining text and numbers safely
        // EN: Remember Topic 01: + goes left to right. Once there's text on
        //     the left, every + after it JOINS instead of adds.
        //     Use ( ) to calculate first.
        // ID: Ingat Topik 01: + dibaca dari kiri ke kanan. Begitu ada teks di
        //     kiri, setiap + sesudahnya MENGGABUNG, bukan menjumlah.
        //     Pakai ( ) supaya dihitung dulu.
        // -------------------------------------------------------------------
        System.out.println("Sum: " + a + b);      // Sum: 175  (wrong / salah)
        System.out.println("Sum: " + (a + b));    // Sum: 22   (right / benar)
        System.out.println(fullName + " studies at " + campus + ", target GPA " + targetGpa);


        // -------------------------------------------------------------------
        // 8. Type casting
        // EN: Small -> big happens automatically (int -> double).
        //     Big -> small needs (type) in front, and the decimal is CUT.
        //     Text -> number: Integer.parseInt() and Double.parseDouble().
        // ID: Kecil -> besar terjadi otomatis (int -> double).
        //     Besar -> kecil butuh (tipe) di depan, dan desimalnya DIPOTONG.
        //     Teks -> angka: Integer.parseInt() dan Double.parseDouble().
        // -------------------------------------------------------------------
        double creditsAsDouble = credits;          // 3 -> 3.0 (automatic / otomatis)
        System.out.println(creditsAsDouble);

        double hours = 9.99;
        int wholeHours = (int) hours;              // 9 (cut, not rounded / dipotong)
        System.out.println(wholeHours);

        System.out.println((double) a / b);        // 3.4 (cast a first / a di-cast dulu)

        String scoreText = "85";
        int score = Integer.parseInt(scoreText);   // "85" -> 85
        System.out.println(score + 10);            // 95

        String gpaText = "3.5";
        double parsedGpa = Double.parseDouble(gpaText);
        System.out.println(parsedGpa + 0.25);      // 3.75


        // -------------------------------------------------------------------
        // 9. Basic String methods
        // EN: A String has built-in methods you call with a dot.
        //     Index starts at 0, like Python. There's no [-1] in Java:
        //     the last character is at length() - 1.
        // ID: String punya method bawaan yang dipanggil dengan titik.
        //     Indeks dimulai dari 0, sama seperti Python. Java tidak punya
        //     [-1]: karakter terakhir ada di length() - 1.
        // -------------------------------------------------------------------
        System.out.println(fullName.toUpperCase());                  // EXCELL JULIANDHIKA PUTRA
        System.out.println(fullName.toLowerCase());                  // excell juliandhika putra
        System.out.println(fullName.length());                       // 24
        System.out.println(fullName.charAt(0));                      // E
        System.out.println(fullName.charAt(fullName.length() - 1));  // a


        // -------------------------------------------------------------------
        // 10. printf: formatting decimals
        // EN: printf prints text with placeholders:
        //     %s = String, %d = int, %.2f = double with 2 decimals, %n = new line
        //     Note: if your laptop uses Indonesian settings, %.2f may show a
        //     comma (83,46) instead of a dot (83.46). Both are the same number.
        // ID: printf mencetak teks dengan tempat isian:
        //     %s = String, %d = int, %.2f = double 2 desimal, %n = baris baru
        //     Catatan: kalau laptopmu memakai pengaturan Indonesia, %.2f bisa
        //     menampilkan koma (83,46), bukan titik (83.46). Nilainya sama saja.
        // -------------------------------------------------------------------
        double average = 83.456;
        System.out.printf("Average: %.2f%n", average);                 // Average: 83.46
        System.out.printf("%s is %d years old.%n", fullName, age);
    }
}
