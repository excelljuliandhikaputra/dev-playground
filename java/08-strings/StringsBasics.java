/*
 * Topic 08 - Strings
 * Topik 08 - String
 * ==================
 * EN: Topics covered in this lesson file.
 * ID: Topik yang dibahas di file ini.
 *
 *     1. Strings can't change (immutable)       | String tidak bisa diubah (immutable)
 *     2. Searching: indexOf, contains, ...      | Mencari: indexOf, contains, ...
 *     3. Cutting: substring                     | Memotong: substring
 *     4. Cleaning: trim, replace, isEmpty       | Merapikan: trim, replace, isEmpty
 *     5. Comparing: equals, compareTo           | Membandingkan: equals, compareTo
 *     6. Splitting and joining                  | Memecah dan menggabung
 *     7. Characters: toCharArray, Character     | Karakter: toCharArray, Character
 *     8. StringBuilder                          | StringBuilder
 *     9. String.format and alignment            | String.format dan perataan teks
 *
 * Run this file / Jalankan file ini:
 *     java StringsBasics.java
 */
import java.util.Arrays;

public class StringsBasics {

    public static void main(String[] args) {

        // -------------------------------------------------------------------
        // 1. Strings can't change (immutable)
        // EN: A String can never be changed. Methods like toUpperCase() or
        //     replace() do NOT change the original: they RETURN a new String.
        //     If you want to keep the result, store it in a variable.
        //     (Same as Python: s.upper() also returns a new string.)
        // ID: Sebuah String tidak pernah bisa diubah. Method seperti
        //     toUpperCase() atau replace() TIDAK mengubah aslinya: method itu
        //     MENGEMBALIKAN String baru. Kalau hasilnya mau dipakai, simpan
        //     ke variabel. (Sama seperti Python: s.upper() juga menghasilkan
        //     string baru.)
        // -------------------------------------------------------------------
        String campus = "unair";
        campus.toUpperCase();                    // result thrown away / hasilnya dibuang
        System.out.println(campus);              // unair  (unchanged / tidak berubah)

        campus = campus.toUpperCase();           // store the new String / simpan String barunya
        System.out.println(campus);              // UNAIR

        // campus.charAt(0) = 'X';   -> ERROR: you can't change one character of a String
        //                              ERROR: satu karakter String tidak bisa diubah


        // -------------------------------------------------------------------
        // 2. Searching: indexOf, contains, startsWith, endsWith
        // EN: indexOf(text)    -> position of the FIRST match, or -1 if not found
        //     contains(text)   -> true / false
        //     startsWith(text) -> true if the String begins with text
        //     endsWith(text)   -> true if the String ends with text
        //     All of them are case-sensitive ("A" is not "a").
        // ID: indexOf(teks)    -> posisi kecocokan PERTAMA, atau -1 kalau tidak ada
        //     contains(teks)   -> true / false
        //     startsWith(teks) -> true kalau String diawali teks itu
        //     endsWith(teks)   -> true kalau String diakhiri teks itu
        //     Semuanya membedakan huruf besar/kecil ("A" bukan "a").
        // -------------------------------------------------------------------
        String email = "citra@student.unair.ac.id";
        System.out.println(email.indexOf("@"));          // 5
        System.out.println(email.indexOf("unair"));      // 14
        System.out.println(email.indexOf("gmail"));      // -1 (not found / tidak ketemu)
        System.out.println(email.contains("unair"));     // true
        System.out.println(email.startsWith("citra"));   // true
        System.out.println(email.endsWith(".ac.id"));    // true

        String fileName = "Report.PDF";
        System.out.println(fileName.endsWith(".pdf"));                  // false (case!)
        System.out.println(fileName.toLowerCase().endsWith(".pdf"));    // true
        // EN: Python uses `"x" in s` and s.find("x"). Java uses s.contains("x") and s.indexOf("x").
        // ID: Python memakai `"x" in s` dan s.find("x"). Java memakai s.contains("x") dan s.indexOf("x").


        // -------------------------------------------------------------------
        // 3. Cutting: substring
        // EN: substring(start, end) -> from start up to (NOT including) end.
        //                              Like Python's s[start:end].
        //     substring(start)      -> from start to the end. Like s[start:].
        //     Combine it with indexOf to cut at a character you search for.
        // ID: substring(start, end) -> dari start sampai SEBELUM end.
        //                              Seperti s[start:end] di Python.
        //     substring(start)      -> dari start sampai akhir. Seperti s[start:].
        //     Gabungkan dengan indexOf untuk memotong di karakter yang dicari.
        // -------------------------------------------------------------------
        String course = "Discrete Mathematics";
        System.out.println(course.substring(0, 8));      // Discrete
        System.out.println(course.substring(9));         // Mathematics
        System.out.println(course.substring(0, 1));      // D  (a String, not a char / String, bukan char)

        int atPosition = email.indexOf("@");
        String username = email.substring(0, atPosition);
        System.out.println(username);                    // citra

        // course.substring(5, 100)  -> CRASH: StringIndexOutOfBoundsException (too far / kejauhan)
        // course.substring(9, 3)    -> CRASH: end before start / end sebelum start
        // course[0:8]               -> ERROR: Java has no slicing with [ ] / Java tidak punya slicing [ ]


        // -------------------------------------------------------------------
        // 4. Cleaning: trim, replace, isEmpty, isBlank
        // EN: trim()           -> removes spaces at the START and END (not the middle)
        //     replace(a, b)    -> replaces EVERY a with b (case-sensitive)
        //     isEmpty()        -> true if the length is 0
        //     isBlank()        -> true if it's empty OR only spaces
        // ID: trim()           -> menghapus spasi di AWAL dan AKHIR (bukan di tengah)
        //     replace(a, b)    -> mengganti SEMUA a dengan b (membedakan huruf besar/kecil)
        //     isEmpty()        -> true kalau panjangnya 0
        //     isBlank()        -> true kalau kosong ATAU hanya berisi spasi
        // -------------------------------------------------------------------
        String typed = "   Algorithms  ";
        System.out.println("[" + typed + "]");           // [   Algorithms  ]
        System.out.println("[" + typed.trim() + "]");    // [Algorithms]

        String message = "I love Java. Java is fun.";
        System.out.println(message.replace("Java", "Python"));   // I love Python. Python is fun.
        System.out.println(message.replace("java", "Python"));   // I love Java. Java is fun. (no match / tidak cocok)
        System.out.println(message.replace(" ", ""));            // IloveJava.Javaisfun.

        String nothing = "";
        String onlySpaces = "   ";
        System.out.println(nothing.isEmpty());           // true
        System.out.println(onlySpaces.isEmpty());        // false (3 characters / 3 karakter)
        System.out.println(onlySpaces.isBlank());        // true
        System.out.println(onlySpaces.trim().isEmpty()); // true


        // -------------------------------------------------------------------
        // 5. Comparing: equals, equalsIgnoreCase, compareTo
        // EN: equals() / equalsIgnoreCase() -> same text? (never == , Topic 04)
        //     a.compareTo(b) -> alphabetical order:
        //        negative = a comes BEFORE b,  0 = same,  positive = a comes AFTER b
        //     Only the sign (-, 0, +) matters, not the exact number.
        //     Trap: ALL capital letters come before ALL small letters.
        //     Python can write a < b for strings; Java can't, it uses compareTo.
        // ID: equals() / equalsIgnoreCase() -> teksnya sama? (jangan == , Topik 04)
        //     a.compareTo(b) -> urutan abjad:
        //        negatif = a SEBELUM b,  0 = sama,  positif = a SESUDAH b
        //     Yang penting hanya tandanya (-, 0, +), bukan angka persisnya.
        //     Jebakan: SEMUA huruf kapital datang sebelum SEMUA huruf kecil.
        //     Python bisa menulis a < b untuk string; Java tidak bisa, pakai compareTo.
        // -------------------------------------------------------------------
        String inputCampus = "unair";
        System.out.println(inputCampus.equals("UNAIR"));              // false
        System.out.println(inputCampus.equalsIgnoreCase("UNAIR"));    // true

        System.out.println("Ani".compareTo("Budi") < 0);              // true  (Ani comes first / Ani duluan)
        System.out.println("Dina".compareTo("Citra") > 0);            // true  (Dina comes after / Dina belakangan)
        System.out.println("Eko".compareTo("Eko"));                   // 0     (same / sama)

        System.out.println("budi".compareTo("Citra") < 0);            // false (!) uppercase C wins
                                                                       //           C kapital menang
        String lowerA = "budi".toLowerCase();
        String lowerB = "Citra".toLowerCase();
        System.out.println(lowerA.compareTo(lowerB) < 0);             // true  (fair comparison / perbandingan adil)
        // if ("Ani" < "Budi")   -> ERROR: < doesn't work on Strings / < tidak bisa untuk String


        // -------------------------------------------------------------------
        // 6. Splitting and joining: split, String.join
        // EN: split(separator) cuts a String into a String[] at every separator.
        //     String.join(separator, array) glues the pieces back together.
        //     Trap: Python's split() skips extra spaces, but Java's split(" ")
        //     makes an EMPTY piece for every extra space. Use trim() first,
        //     and skip empty pieces (isEmpty()) when you loop.
        //     Also: avoid split(".") and split("|"). Those characters have a
        //     special meaning inside split. Stick to spaces and commas for now.
        // ID: split(pemisah) memotong String menjadi String[] di setiap pemisah.
        //     String.join(pemisah, array) menggabungkan potongannya kembali.
        //     Jebakan: split() di Python melewati spasi berlebih, tapi split(" ")
        //     di Java membuat potongan KOSONG untuk setiap spasi berlebih. Pakai
        //     trim() dulu, dan lewati potongan kosong (isEmpty()) saat looping.
        //     Juga: hindari split(".") dan split("|"). Karakter itu punya arti
        //     khusus di dalam split. Untuk sekarang pakai spasi dan koma saja.
        // -------------------------------------------------------------------
        String sentence = "Algorithms is fun";
        String[] words = sentence.split(" ");
        System.out.println(words.length);                     // 3
        System.out.println(Arrays.toString(words));           // [Algorithms, is, fun]

        String messy = "Algorithms  is fun";                  // TWO spaces after Algorithms / DUA spasi
        String[] messyWords = messy.split(" ");
        System.out.println(Arrays.toString(messyWords));      // [Algorithms, , is, fun]
        System.out.println(messyWords.length);                // 4 (not 3! / bukan 3!)

        String csvLine = "Algorithms,3,88";
        String[] parts = csvLine.split(",");
        System.out.println(parts[0] + " | " + parts[1] + " | " + parts[2]);   // Algorithms | 3 | 88
        int courseCredits = Integer.parseInt(parts[1]);       // "3" -> 3
        System.out.println(courseCredits + 1);                // 4

        String[] friends = {"Ani", "Budi", "Citra"};
        System.out.println(String.join(", ", friends));       // Ani, Budi, Citra
        System.out.println(String.join("-", words));          // Algorithms-is-fun
        // EN: Python: ", ".join(friends)   Java: String.join(", ", friends)
        // ID: Python: ", ".join(friends)   Java: String.join(", ", friends)


        // -------------------------------------------------------------------
        // 7. Characters: toCharArray, Character.isDigit, Character.isLetter
        // EN: toCharArray() turns a String into a char[], so you can use a
        //     for-each loop over its characters (like Python's `for c in s`).
        //     Character.isDigit(c)  -> true for '0' to '9'
        //     Character.isLetter(c) -> true for letters
        //     Without them, you can also write c >= '0' && c <= '9',
        //     because characters are stored in order.
        //     Remember: char uses 'single quotes', String uses "double quotes".
        // ID: toCharArray() mengubah String menjadi char[], jadi kamu bisa
        //     memakai for-each untuk setiap karakternya (seperti `for c in s`
        //     di Python).
        //     Character.isDigit(c)  -> true untuk '0' sampai '9'
        //     Character.isLetter(c) -> true untuk huruf
        //     Tanpa itu, kamu juga bisa menulis c >= '0' && c <= '9',
        //     karena karakter disimpan berurutan.
        //     Ingat: char memakai 'kutip tunggal', String memakai "kutip ganda".
        // -------------------------------------------------------------------
        String roomCode = "TI2026";
        int letterCount = 0;
        int digitCount = 0;
        for (char c : roomCode.toCharArray()) {
            if (Character.isDigit(c)) {
                digitCount++;
            } else if (Character.isLetter(c)) {
                letterCount++;
            }
        }
        System.out.println("Letters: " + letterCount + ", digits: " + digitCount);   // Letters: 2, digits: 4

        char firstChar = roomCode.charAt(0);
        System.out.println(firstChar == 'T');            // true
        System.out.println('7' >= '0' && '7' <= '9');    // true (same idea as isDigit / sama seperti isDigit)
        // firstChar == "T"   -> ERROR: char vs String. Use 'T' / pakai 'T'


        // -------------------------------------------------------------------
        // 8. StringBuilder: append, reverse, toString
        // EN: Because a String can't change, text += "x" inside a loop creates
        //     a brand-new String every time. StringBuilder is a CHANGEABLE
        //     text box:
        //       append(x)   adds x to the end (x can be text, a number, a char)
        //       reverse()   flips the text
        //       toString()  turns it back into a normal String
        //     Python has s[::-1] for reversing; Java uses StringBuilder.
        // ID: Karena String tidak bisa diubah, text += "x" di dalam loop membuat
        //     String baru setiap kali. StringBuilder adalah kotak teks yang BISA
        //     DIUBAH:
        //       append(x)   menambahkan x di akhir (x boleh teks, angka, char)
        //       reverse()   membalik teks
        //       toString()  mengubahnya kembali menjadi String biasa
        //     Python memakai s[::-1] untuk membalik; Java memakai StringBuilder.
        // -------------------------------------------------------------------
        StringBuilder builder = new StringBuilder();
        for (int i = 1; i <= 5; i++) {
            builder.append(i);
            if (i < 5) {
                builder.append("-");
            }
        }
        System.out.println(builder.toString());          // 1-2-3-4-5

        String reversedCampus = new StringBuilder("UNAIR").reverse().toString();
        System.out.println(reversedCampus);              // RIANU

        StringBuilder stars = new StringBuilder();
        for (int i = 0; i < 3; i++) {
            stars.append('*');
        }
        System.out.println(stars.toString());            // ***

        // new StringBuilder("abc").equals("abc")  -> false! Call toString() first.
        //                                            false! Panggil toString() dulu.


        // -------------------------------------------------------------------
        // 9. String.format and alignment
        // EN: String.format(...) works like printf, but it RETURNS the text
        //     instead of printing it. Add a WIDTH to line things up:
        //       %-12s  text, 12 wide, LEFT-aligned  (spaces added on the right)
        //       %12s   text, 12 wide, RIGHT-aligned (spaces added on the left)
        //       %5d    whole number, 5 wide, right-aligned
        //     A value longer than the width is NOT cut, it just pushes the rest.
        //     Python: f"{name:<12}" and f"{credits:>5}"
        // ID: String.format(...) mirip printf, tapi MENGEMBALIKAN teks, bukan
        //     mencetaknya. Tambahkan LEBAR supaya rapi:
        //       %-12s  teks, lebar 12, rata KIRI    (spasi ditambah di kanan)
        //       %12s   teks, lebar 12, rata KANAN   (spasi ditambah di kiri)
        //       %5d    bilangan bulat, lebar 5, rata kanan
        //     Nilai yang lebih panjang dari lebarnya TIDAK dipotong, hanya
        //     mendorong teks sesudahnya.
        //     Python: f"{name:<12}" dan f"{credits:>5}"
        // -------------------------------------------------------------------
        String label = String.format("%s has %d credits", "Algorithms", 3);
        System.out.println(label);                                    // Algorithms has 3 credits

        System.out.println(String.format("[%-10s]", "UNAIR"));        // [UNAIR     ]
        System.out.println(String.format("[%10s]", "UNAIR"));         // [     UNAIR]
        System.out.println(String.format("[%5d]", 42));               // [   42]
        System.out.println(String.format("[%5s]", "Calculus"));       // [Calculus]  (not cut / tidak dipotong)

        String[] courseNames = {"Algorithms", "English", "Pancasila"};
        int[] creditList = {3, 2, 2};
        for (int i = 0; i < courseNames.length; i++) {
            System.out.println(String.format("%-12s%3d credits", courseNames[i], creditList[i]));
        }
        // Algorithms    3 credits
        // English       2 credits
        // Pancasila     2 credits
    }
}
