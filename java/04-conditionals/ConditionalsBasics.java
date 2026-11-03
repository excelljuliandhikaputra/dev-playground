/*
 * Topic 04 - Conditionals
 * Topik 04 - Percabangan (Kondisi)
 * =================================
 * EN: Topics covered in this lesson file.
 * ID: Topik yang dibahas di file ini.
 *
 *     1. if / else                            | if / else
 *     2. Comparison operators                 | Operator perbandingan
 *     3. else if chain                        | Rantai else if
 *     4. Logical operators && || !            | Operator logika && || !
 *     5. Nested if                            | if bersarang
 *     6. Comparing Strings: equals, not ==    | Membandingkan String: equals, bukan ==
 *     7. Classic switch (with break)          | switch klasik (dengan break)
 *     8. Arrow switch (->)                    | switch panah (->)
 *     9. Ternary operator ? :                 | Operator ternary ? :
 *    10. Common beginner mistakes             | Kesalahan umum pemula
 *
 * Run this file / Jalankan file ini:
 *     java ConditionalsBasics.java
 */
public class ConditionalsBasics {

    public static void main(String[] args) {

        // -------------------------------------------------------------------
        // 1. if / else
        // EN: The condition goes inside ( ) and the code inside { }.
        //     If the condition is true, the if block runs. Otherwise the
        //     else block runs. Exactly ONE of the two blocks runs.
        //     Python uses a colon and indentation; Java uses ( ) and { }.
        // ID: Kondisinya ditulis di dalam ( ) dan kodenya di dalam { }.
        //     Kalau kondisinya true, blok if yang jalan. Kalau tidak, blok
        //     else yang jalan. Hanya SATU dari dua blok itu yang jalan.
        //     Python memakai titik dua dan indentasi; Java memakai ( ) dan { }.
        // -------------------------------------------------------------------
        int score = 72;

        if (score >= 65) {
            System.out.println("Passed");       // Passed
        } else {
            System.out.println("Failed");
        }

        // EN: else is optional. Without it, nothing happens when the condition is false.
        // ID: else boleh tidak ditulis. Tanpa else, tidak terjadi apa-apa kalau kondisinya false.
        if (score == 100) {
            System.out.println("Perfect score!");   // (not printed / tidak dicetak)
        }


        // -------------------------------------------------------------------
        // 2. Comparison operators
        // EN: Every comparison gives a boolean (true or false).
        //       ==  equal                 !=  not equal
        //       <   less than             >   greater than
        //       <=  less than or equal    >=  greater than or equal
        //     Remember: =  stores a value,  ==  compares two values.
        // ID: Setiap perbandingan menghasilkan boolean (true atau false).
        //       ==  sama dengan           !=  tidak sama dengan
        //       <   kurang dari           >   lebih dari
        //       <=  kurang dari/sama      >=  lebih dari/sama
        //     Ingat: =  menyimpan nilai,  ==  membandingkan dua nilai.
        // -------------------------------------------------------------------
        int credits = 3;
        System.out.println(credits == 3);       // true
        System.out.println(credits != 3);       // false
        System.out.println(credits < 2);        // false
        System.out.println(credits >= 3);       // true

        boolean isFullTime = credits >= 2;      // a comparison can be stored / hasilnya bisa disimpan
        System.out.println(isFullTime);         // true

        // EN: Characters (char) can also be compared with ==, using 'single quotes'.
        // ID: Karakter (char) juga bisa dibandingkan dengan ==, memakai 'kutip tunggal'.
        char letterGrade = 'A';
        System.out.println(letterGrade == 'A'); // true


        // -------------------------------------------------------------------
        // 3. else if chain
        // EN: Use else if to check several conditions in order.
        //     Java checks from top to bottom and runs ONLY the first block
        //     that is true, then skips the rest. So the ORDER matters.
        //     (Python writes elif, Java writes else if.)
        // ID: Pakai else if untuk mengecek beberapa kondisi secara berurutan.
        //     Java mengecek dari atas ke bawah dan HANYA menjalankan blok
        //     pertama yang true, lalu melewati sisanya. Jadi URUTAN itu penting.
        //     (Python menulis elif, Java menulis else if.)
        //
        //     UNAIR grading scale / Skala nilai UNAIR:
        //     A >= 85, AB 80-84, B 75-79, BC 70-74, C 65-69, D 50-64, E < 50
        // -------------------------------------------------------------------
        int examScore = 77;
        String grade;   // declared now, filled in by the chain / dideklarasikan dulu, diisi oleh rantai if
                        // EN: Java checks that EVERY path gives it a value (that's why the last else matters).
                        // ID: Java mengecek bahwa SETIAP jalur mengisinya (makanya else terakhir penting).

        if (examScore >= 85) {
            grade = "A";
        } else if (examScore >= 80) {
            grade = "AB";
        } else if (examScore >= 75) {
            grade = "B";        // 77 stops here / 77 berhenti di sini
        } else if (examScore >= 70) {
            grade = "BC";
        } else if (examScore >= 65) {
            grade = "C";
        } else if (examScore >= 50) {
            grade = "D";
        } else {
            grade = "E";
        }
        System.out.println("Score " + examScore + " -> " + grade);   // Score 77 -> B

        // EN: Why no "examScore >= 75 && examScore <= 79"? Because if we reach
        //     the "B" line, we ALREADY know the score is below 80.
        //     Wrong order example: if you check >= 50 first, a score of 90
        //     would get "D", because >= 50 is already true.
        // ID: Kenapa tidak perlu "examScore >= 75 && examScore <= 79"? Karena
        //     kalau sudah sampai baris "B", kita SUDAH tahu nilainya di bawah 80.
        //     Contoh urutan salah: kalau >= 50 dicek duluan, nilai 90 akan
        //     dapat "D", karena >= 50 sudah true.


        // -------------------------------------------------------------------
        // 4. Logical operators && || !
        // EN:  &&  AND: true only if BOTH sides are true
        //      ||  OR : true if AT LEAST ONE side is true
        //      !   NOT: flips true <-> false
        //     (Python writes and / or / not.)
        // ID:  &&  DAN  : true hanya kalau KEDUA sisi true
        //      ||  ATAU : true kalau MINIMAL SATU sisi true
        //      !   BUKAN: membalik true <-> false
        //     (Python menulis and / or / not.)
        // -------------------------------------------------------------------
        int attendance = 85;       // percent / persen
        boolean hasWarning = false;

        if (score >= 65 && attendance >= 75) {
            System.out.println("Allowed to take the final exam");   // printed / dicetak
        }

        boolean isWeekend = false;
        boolean isHoliday = true;
        if (isWeekend || isHoliday) {
            System.out.println("No class today");                   // printed / dicetak
        }

        if (!hasWarning) {
            System.out.println("No warning letter");                // printed / dicetak
        }

        // EN: Checking a range: Java can't write 65 <= score <= 100 like Python.
        //     Write two comparisons joined with &&.
        // ID: Mengecek rentang: Java tidak bisa menulis 65 <= score <= 100
        //     seperti Python. Tulis dua perbandingan yang digabung dengan &&.
        System.out.println(score >= 65 && score <= 100);            // true


        // -------------------------------------------------------------------
        // 5. Nested if
        // EN: An if can live inside another if. The inner one is only
        //     checked when the outer one is true.
        // ID: Sebuah if bisa berada di dalam if lain. if yang di dalam hanya
        //     dicek kalau if yang di luar bernilai true.
        // -------------------------------------------------------------------
        boolean isRegistered = true;
        int paidAmount = 0;

        if (isRegistered) {
            if (paidAmount > 0) {
                System.out.println("You can join the class.");
            } else {
                System.out.println("Registered, but please pay first.");   // printed / dicetak
            }
        } else {
            System.out.println("Please register first.");
        }


        // -------------------------------------------------------------------
        // 6. Comparing Strings: equals, not ==
        // EN: For Strings, ALWAYS use .equals() to compare the text.
        //     == checks if two variables point to the SAME object in memory,
        //     not if the text is the same. Sometimes it looks like it works,
        //     but text created while the program runs (from input, from
        //     toUpperCase(), ...) breaks it. (In Python, == on strings is fine.)
        //     .equalsIgnoreCase() compares and ignores capital letters.
        // ID: Untuk String, SELALU pakai .equals() untuk membandingkan teksnya.
        //     == mengecek apakah dua variabel menunjuk ke objek yang SAMA di
        //     memori, bukan apakah teksnya sama. Kadang kelihatannya berhasil,
        //     tapi teks yang dibuat saat program berjalan (dari input, dari
        //     toUpperCase(), ...) membuatnya gagal. (Di Python, == pada string aman.)
        //     .equalsIgnoreCase() membandingkan tanpa peduli huruf besar/kecil.
        // -------------------------------------------------------------------
        String campus = "UNAIR";
        String typedCampus = "unair".toUpperCase();     // "UNAIR", made at runtime / dibuat saat program jalan

        System.out.println(typedCampus);                         // UNAIR
        System.out.println(typedCampus == campus);               // false  (!) same text, different object
        System.out.println(typedCampus.equals(campus));          // true
        System.out.println("unair".equals(campus));              // false (case matters / huruf besar-kecil berpengaruh)
        System.out.println("unair".equalsIgnoreCase(campus));    // true

        String password = "unair2026";
        String typedPassword = "unair2026";
        if (typedPassword.equals(password)) {
            System.out.println("Login OK");                      // Login OK
        }
        if (!typedPassword.equals("admin")) {                    // "not equal" for Strings / "tidak sama" untuk String
            System.out.println("Not the admin password");        // Not the admin password
        }


        // -------------------------------------------------------------------
        // 7. Classic switch (with break)
        // EN: switch compares ONE value with many fixed cases. It works with
        //     int, char, and String. Each case must end with break, or Java
        //     keeps running into the next case ("fall-through").
        //     default runs when no case matches (like the last else).
        // ID: switch membandingkan SATU nilai dengan banyak case yang tetap.
        //     Bisa dipakai untuk int, char, dan String. Setiap case harus
        //     diakhiri break, kalau tidak Java akan lanjut menjalankan case
        //     berikutnya ("fall-through").
        //     default jalan kalau tidak ada case yang cocok (seperti else terakhir).
        // -------------------------------------------------------------------
        int dayNumber = 3;

        switch (dayNumber) {
            case 1:
                System.out.println("Monday");
                break;
            case 2:
                System.out.println("Tuesday");
                break;
            case 3:
                System.out.println("Wednesday");    // Wednesday
                break;
            default:
                System.out.println("Another day");
        }

        // EN: Forgetting break: with dayNumber = 3 and no breaks, Java would
        //     print Wednesday AND Another day.
        // ID: Lupa break: dengan dayNumber = 3 dan tanpa break, Java akan
        //     mencetak Wednesday DAN Another day.

        // EN: Cases can share code by stacking them:
        // ID: Beberapa case bisa memakai kode yang sama dengan ditumpuk:
        char gradeLetter = 'B';
        switch (gradeLetter) {
            case 'A':
            case 'B':
                System.out.println("Great job");    // Great job
                break;
            case 'C':
                System.out.println("Passed");
                break;
            default:
                System.out.println("Study harder");
        }


        // -------------------------------------------------------------------
        // 8. Arrow switch (->)
        // EN: Since Java 14 there is a shorter form with ->. No break needed:
        //     only the matching case runs. Several values can share a case
        //     with commas. (Python 3.10+ has match/case, which is similar.)
        // ID: Sejak Java 14 ada bentuk yang lebih singkat dengan ->. Tidak
        //     perlu break: hanya case yang cocok yang jalan. Beberapa nilai
        //     bisa berbagi satu case dengan koma. (Python 3.10+ punya
        //     match/case yang mirip.)
        // -------------------------------------------------------------------
        int todayNumber = 6;

        switch (todayNumber) {
            case 1, 2, 3, 4, 5 -> System.out.println("Weekday: go to campus");
            case 6, 7 -> System.out.println("Weekend: rest");        // Weekend: rest
            default -> System.out.println("Invalid day");
        }

        // EN: An arrow switch can also GIVE a value that you store in a
        //     variable. Note the ; after the closing }.
        // ID: switch panah juga bisa MENGHASILKAN nilai yang disimpan ke
        //     variabel. Perhatikan ; setelah } penutup.
        String dayName = switch (todayNumber) {
            case 1 -> "Monday";
            case 2 -> "Tuesday";
            case 3 -> "Wednesday";
            case 4 -> "Thursday";
            case 5 -> "Friday";
            case 6 -> "Saturday";
            case 7 -> "Sunday";
            default -> "Invalid day";
        };
        System.out.println(dayName);                                 // Saturday

        // EN: switch also works with Strings (it uses equals for you).
        // ID: switch juga bisa untuk String (otomatis memakai equals).
        String course = "Calculus";
        switch (course) {
            case "Algorithms", "Calculus" -> System.out.println("Room 301");   // Room 301
            case "English" -> System.out.println("Room 105");
            default -> System.out.println("Check the schedule");
        }


        // -------------------------------------------------------------------
        // 9. Ternary operator ? :
        // EN: A one-line if/else that GIVES a value:
        //         condition ? valueIfTrue : valueIfFalse
        //     Python writes it as: valueIfTrue if condition else valueIfFalse
        //     Use it for short choices only. For anything longer, use if/else.
        // ID: if/else satu baris yang MENGHASILKAN nilai:
        //         kondisi ? nilaiKalauTrue : nilaiKalauFalse
        //     Di Python ditulis: nilaiKalauTrue if kondisi else nilaiKalauFalse
        //     Pakai hanya untuk pilihan singkat. Kalau lebih panjang, pakai if/else.
        // -------------------------------------------------------------------
        String status = score >= 65 ? "PASSED" : "FAILED";
        System.out.println(status);                                  // PASSED

        int courseCount = 1;
        String word = courseCount == 1 ? "course" : "courses";
        System.out.println(courseCount + " " + word);                // 1 course

        int highest = credits > courseCount ? credits : courseCount;
        System.out.println(highest);                                 // 3


        // -------------------------------------------------------------------
        // 10. Common beginner mistakes / Kesalahan umum pemula
        // EN: Each line below is wrong. They're commented out.
        // ID: Setiap baris di bawah ini salah. Sengaja diberi komentar.
        // -------------------------------------------------------------------
        // if (score = 65) { ... }            -> ERROR: = stores, use == to compare
        //                                       = untuk menyimpan, pakai == untuk membandingkan
        // if (65 <= score <= 100) { ... }    -> ERROR: write score >= 65 && score <= 100
        // if (score >= 65 && <= 100) { ... } -> ERROR: each side needs its own variable
        //                                       setiap sisi butuh variabelnya sendiri
        // if (score >= 65); { ... }          -> NO ERROR, but the ; ends the if, so the
        //                                       { } block ALWAYS runs. Never put ; after if (...)
        //                                       TIDAK error, tapi ; mengakhiri if-nya, jadi
        //                                       blok { } SELALU jalan. Jangan taruh ; setelah if (...)
        // if (typedCampus == "UNAIR")        -> compiles, but unreliable: use .equals("UNAIR")
        //                                       bisa jalan, tapi tidak bisa diandalkan: pakai .equals("UNAIR")
        // if (score >= 65)
        //     System.out.println("Passed");
        //     System.out.println("Congrats!");   -> without { }, ONLY the first line belongs to
        //                                           the if. "Congrats!" always prints. Always use { }.
        //                                           tanpa { }, HANYA baris pertama yang ikut if.
        //                                           "Congrats!" selalu dicetak. Selalu pakai { }.
    }
}
