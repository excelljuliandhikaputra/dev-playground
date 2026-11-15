/*
 * Topic 08 - Strings Exercises (UNSOLVED)
 * Topik 08 - Latihan String (BELUM DIKERJAKAN)
 * =============================================
 * EN - How to use:
 *     1. Every exercise is a method. Replace the line marked // TODO
 *        with your own code (keep the method name and parameters).
 *     2. Run:  java StringsExercisesUnsolved.java
 *     3. The checker in main() at the bottom tests every method:
 *        [TODO] = not started, [FAIL] = wrong answer, [PASS] = correct
 *
 * ID - Cara pakai:
 *     1. Setiap soal adalah sebuah method. Ganti baris bertanda // TODO
 *        dengan kodemu sendiri (nama method dan parameternya jangan diubah).
 *     2. Jalankan:  java StringsExercisesUnsolved.java
 *     3. Checker di main() bagian bawah menguji setiap method:
 *        [TODO] = belum dikerjakan, [FAIL] = jawaban salah, [PASS] = benar
 *
 * Rules / Aturan:
 *     - Only use Topic 01-08 material.
 *       Hanya pakai materi Topik 01-08.
 *     - Only edit the method bodies. Do not change the checker.
 *       Ubah hanya isi method. Jangan ubah bagian checker.
 *     - NO HARDCODING: every method is tested with several different
 *       inputs, so returning a fixed answer will FAIL.
 *       JANGAN HARDCODE: setiap method diuji dengan beberapa input berbeda,
 *       jadi mengembalikan jawaban tetap pasti FAIL.
 *     - You may add your own helper methods.
 *       Kamu boleh menambah method bantuan sendiri.
 *
 * Notes / Catatan:
 *     - A method that returns its default value (0, false, "") for EVERY
 *       test is shown as [TODO], even if you already wrote code.
 *       Method yang mengembalikan nilai default (0, false, "") untuk SEMUA
 *       tes ditampilkan sebagai [TODO], walaupun kodenya sudah ditulis.
 *     - String results are shown in "quotes" so you can see extra spaces.
 *       Hasil String ditampilkan dalam "kutip" supaya spasi berlebih terlihat.
 *     - If the program crashes, read the error message: it shows the
 *       method name and line number where the problem is.
 *       Kalau programnya crash, baca pesan error-nya: di situ tertulis
 *       nama method dan nomor baris tempat masalahnya.
 *
 * Self-check / Cek sendiri:
 *     Try your methods with your own inputs too. Add a temporary line at
 *     the TOP of main(), e.g.  System.out.println(initials("Ani Nur Hidayah"));
 *     then delete it when you're done.
 *     Coba juga method-mu dengan input buatanmu sendiri. Tambahkan baris
 *     sementara di BAGIAN ATAS main(), misalnya
 *     System.out.println(initials("Ani Nur Hidayah"));  lalu hapus kalau sudah selesai.
 *
 * IMPORTANT / PENTING:
 *     EN: When you save your answers as StringsExercisesSolved.java,
 *         rename the class below to StringsExercisesSolved too.
 *     ID: Saat menyimpan jawaban sebagai StringsExercisesSolved.java,
 *         ganti juga nama class di bawah menjadi StringsExercisesSolved.
 */
public class StringsExercisesUnsolved {

    // -----------------------------------------------------------------------
    // LEVEL 1 - WARM UP
    // -----------------------------------------------------------------------

    // Exercise 1 / Soal 1: countWords
    // EN: Return how many words are in the sentence. Words are separated by
    //     spaces, but there may be EXTRA spaces anywhere (start, end, or
    //     several in a row). An empty or blank sentence has 0 words.
    //     Hint: trim(), split(" "), and skip the empty pieces.
    // ID: Kembalikan jumlah kata dalam kalimat. Kata dipisah spasi, tapi bisa
    //     ada spasi BERLEBIH di mana saja (awal, akhir, atau beberapa
    //     berturut-turut). Kalimat kosong atau hanya spasi berisi 0 kata.
    //     Petunjuk: trim(), split(" "), lalu lewati potongan yang kosong.
    //     countWords("I study at UNAIR")          -> 4
    //     countWords("  Algorithms   is   fun  ") -> 3
    //     countWords("   ")                       -> 0
    public static int countWords(String sentence) {
        return 0;   // TODO: replace with your code / ganti dengan kodemu
    }


    // Exercise 2 / Soal 2: initials
    // EN: Return the initials of a full name: the first letter of every
    //     word in UPPERCASE, each followed by a dot. Words are separated by
    //     ONE space.
    // ID: Kembalikan inisial dari nama lengkap: huruf pertama setiap kata
    //     dalam huruf KAPITAL, masing-masing diikuti titik. Kata dipisah
    //     SATU spasi.
    //     initials("Excell Juliandhika Putra") -> "E.J.P."
    //     initials("budi santoso")             -> "B.S."
    public static String initials(String fullName) {
        return "";   // TODO: replace with your code / ganti dengan kodemu
    }


    // Exercise 3 / Soal 3: isPalindrome
    // EN: Return true if the text reads the same forwards and backwards,
    //     IGNORING spaces and upper/lower case.
    //     Hint: remove the spaces with replace, make it lowercase, then
    //     compare it with its StringBuilder reverse.
    // ID: Kembalikan true kalau teksnya sama dibaca dari depan maupun dari
    //     belakang, dengan MENGABAIKAN spasi dan huruf besar/kecil.
    //     Petunjuk: hapus spasi dengan replace, jadikan huruf kecil, lalu
    //     bandingkan dengan hasil reverse dari StringBuilder.
    //     isPalindrome("Kasur ini rusak") -> true
    //     isPalindrome("UNAIR")           -> false
    public static boolean isPalindrome(String text) {
        return false;   // TODO: replace with your code / ganti dengan kodemu
    }


    // -----------------------------------------------------------------------
    // LEVEL 2 - CORE PRACTICE
    // -----------------------------------------------------------------------

    // Exercise 4 / Soal 4: censor
    // EN: Replace EVERY occurrence of badWord in the text with stars ('*').
    //     The number of stars equals the length of badWord.
    //     Matching is case-sensitive (like replace).
    // ID: Ganti SETIAP kemunculan badWord di dalam teks dengan bintang ('*').
    //     Jumlah bintangnya sama dengan panjang badWord.
    //     Pencocokannya membedakan huruf besar/kecil (seperti replace).
    //     censor("This game is bad, so bad", "bad") -> "This game is ***, so ***"
    //     censor("You noob", "noob")                -> "You ****"
    public static String censor(String text, String badWord) {
        return "";   // TODO: replace with your code / ganti dengan kodemu
    }


    // Exercise 5 / Soal 5: getDomain
    // EN: Return the part of the email AFTER the "@".
    //     If there is no "@", return "" (an empty String).
    //     Hint: indexOf and substring.
    // ID: Kembalikan bagian email SESUDAH "@".
    //     Kalau tidak ada "@", kembalikan "" (String kosong).
    //     Petunjuk: indexOf dan substring.
    //     getDomain("budi@gmail.com") -> "gmail.com"
    //     getDomain("not-an-email")   -> ""
    public static String getDomain(String email) {
        return "";   // TODO: replace with your code / ganti dengan kodemu
    }


    // Exercise 6 / Soal 6: isValidStudentId
    // EN: A valid student ID (NIM) in this exercise has EXACTLY 12
    //     characters and every character is a digit.
    //     Hint: check the length first, then loop over toCharArray()
    //     with Character.isDigit().
    // ID: NIM yang valid di soal ini panjangnya TEPAT 12 karakter dan
    //     semua karakternya angka.
    //     Petunjuk: cek panjangnya dulu, lalu loop toCharArray() dengan
    //     Character.isDigit().
    //     isValidStudentId("123456789012") -> true
    //     isValidStudentId("12345678901A") -> false
    //     isValidStudentId("12345")        -> false
    public static boolean isValidStudentId(String studentId) {
        return false;   // TODO: replace with your code / ganti dengan kodemu
    }


    // Exercise 7 / Soal 7: toTitleCase
    // EN: Make the first letter of every word UPPERCASE and the rest
    //     lowercase. Words are separated by ONE space.
    //     Hint: split(" "), substring(0, 1) and substring(1), then
    //     String.join or StringBuilder.
    // ID: Jadikan huruf pertama setiap kata KAPITAL dan sisanya huruf kecil.
    //     Kata dipisah SATU spasi.
    //     Petunjuk: split(" "), substring(0, 1) dan substring(1), lalu
    //     String.join atau StringBuilder.
    //     toTitleCase("discrete mathematics") -> "Discrete Mathematics"
    //     toTitleCase("uNAIR cAMPUS b")       -> "Unair Campus B"
    public static String toTitleCase(String text) {
        return "";   // TODO: replace with your code / ganti dengan kodemu
    }


    // Exercise 8 / Soal 8: sortTwoNames
    // EN: Return both names in alphabetical order, joined with ", ".
    //     Compare them IGNORING upper/lower case (use compareTo on the
    //     lowercase versions), but return the names exactly as given.
    // ID: Kembalikan kedua nama sesuai urutan abjad, digabung dengan ", ".
    //     Bandingkan dengan MENGABAIKAN huruf besar/kecil (pakai compareTo
    //     pada versi huruf kecilnya), tapi kembalikan nama persis seperti
    //     yang diberikan.
    //     sortTwoNames("Budi", "Ani") -> "Ani, Budi"
    //     sortTwoNames("ani", "Budi") -> "ani, Budi"
    public static String sortTwoNames(String nameA, String nameB) {
        return "";   // TODO: replace with your code / ganti dengan kodemu
    }


    // -----------------------------------------------------------------------
    // LEVEL 3 - CHALLENGE
    // -----------------------------------------------------------------------

    // Exercise 9 / Soal 9 (Challenge): compress
    // EN: Shorten the text by writing each group of the SAME character
    //     next to each other as: the character + how many times it repeats.
    //     Use a StringBuilder. An empty text gives "".
    // ID: Perpendek teks dengan menulis setiap kelompok karakter yang SAMA
    //     dan berdampingan sebagai: karakternya + berapa kali ia berulang.
    //     Pakai StringBuilder. Teks kosong menghasilkan "".
    //     compress("aaabbc")      -> "a3b2c1"
    //     compress("aabcccccaaa") -> "a2b1c5a3"
    //     compress("abcd")        -> "a1b1c1d1"
    public static String compress(String text) {
        return "";   // TODO: replace with your code / ganti dengan kodemu
    }


    // Exercise 10 / Soal 10 (Challenge): receiptLine
    // EN: Build ONE line of a shopping receipt with String.format.
    //     The line has these parts, in this order:
    //       1. item name   : 12 wide, LEFT-aligned. If the name is longer
    //                        than 12 characters, cut it to the first 12.
    //       2. quantity    : 3 wide, right-aligned
    //       3. the text " x "
    //       4. unit price  : 7 wide, right-aligned
    //       5. the text " = "
    //       6. total       : 8 wide, right-aligned (quantity * unitPrice)
    // ID: Buat SATU baris struk belanja dengan String.format.
    //     Barisnya terdiri dari bagian-bagian ini, dengan urutan ini:
    //       1. nama barang : lebar 12, rata KIRI. Kalau namanya lebih dari
    //                        12 karakter, potong menjadi 12 karakter pertama.
    //       2. jumlah      : lebar 3, rata kanan
    //       3. teks " x "
    //       4. harga satuan: lebar 7, rata kanan
    //       5. teks " = "
    //       6. total       : lebar 8, rata kanan (jumlah * harga satuan)
    //
    //     receiptLine("Rice", 2, 15000)
    //       -> "Rice          2 x   15000 =    30000"
    //     receiptLine("Instant Noodles", 10, 3500)
    //       -> "Instant Nood 10 x    3500 =    35000"
    public static String receiptLine(String item, int quantity, int unitPrice) {
        return "";   // TODO: replace with your code / ganti dengan kodemu
    }


    // =======================================================================
    // CHECKER - do not edit below this line / jangan ubah bagian di bawah ini
    // =======================================================================

    public static void main(String[] args) {
        System.out.println("=============================================");
        System.out.println("  Topic 08 - Strings Exercises");
        System.out.println("=============================================");

        int score = 0;

        score += check(1, "countWords",
                new String[] {"countWords(\"I study at UNAIR\")",
                        "countWords(\"  Algorithms   is   fun  \")",
                        "countWords(\"Hello\")", "countWords(\"\")", "countWords(\"   \")"},
                new int[] {countWords("I study at UNAIR"),
                        countWords("  Algorithms   is   fun  "),
                        countWords("Hello"), countWords(""), countWords("   ")},
                new int[] {4, 3, 1, 0, 0});

        score += check(2, "initials",
                new String[] {"initials(\"Excell Juliandhika Putra\")", "initials(\"budi santoso\")",
                        "initials(\"Citra\")", "initials(\"ani nur hidayah\")"},
                new String[] {initials("Excell Juliandhika Putra"), initials("budi santoso"),
                        initials("Citra"), initials("ani nur hidayah")},
                new String[] {"E.J.P.", "B.S.", "C.", "A.N.H."});

        score += check(3, "isPalindrome",
                new String[] {"isPalindrome(\"Kasur ini rusak\")", "isPalindrome(\"Never odd or even\")",
                        "isPalindrome(\"Level\")", "isPalindrome(\"UNAIR\")",
                        "isPalindrome(\"Algorithms\")"},
                new boolean[] {isPalindrome("Kasur ini rusak"), isPalindrome("Never odd or even"),
                        isPalindrome("Level"), isPalindrome("UNAIR"),
                        isPalindrome("Algorithms")},
                new boolean[] {true, true, true, false, false});

        score += check(4, "censor",
                new String[] {"censor(\"This game is bad, so bad\", \"bad\")",
                        "censor(\"You noob\", \"noob\")",
                        "censor(\"All good here\", \"bad\")"},
                new String[] {censor("This game is bad, so bad", "bad"),
                        censor("You noob", "noob"),
                        censor("All good here", "bad")},
                new String[] {"This game is ***, so ***", "You ****", "All good here"});

        score += check(5, "getDomain",
                new String[] {"getDomain(\"ani@student.unair.ac.id\")", "getDomain(\"budi@gmail.com\")",
                        "getDomain(\"not-an-email\")"},
                new String[] {getDomain("ani@student.unair.ac.id"), getDomain("budi@gmail.com"),
                        getDomain("not-an-email")},
                new String[] {"student.unair.ac.id", "gmail.com", ""});

        score += check(6, "isValidStudentId",
                new String[] {"isValidStudentId(\"123456789012\")", "isValidStudentId(\"987654321098\")",
                        "isValidStudentId(\"12345678901\")", "isValidStudentId(\"1234567890123\")",
                        "isValidStudentId(\"12345678901A\")", "isValidStudentId(\"1234 6789012\")",
                        "isValidStudentId(\"\")"},
                new boolean[] {isValidStudentId("123456789012"), isValidStudentId("987654321098"),
                        isValidStudentId("12345678901"), isValidStudentId("1234567890123"),
                        isValidStudentId("12345678901A"), isValidStudentId("1234 6789012"),
                        isValidStudentId("")},
                new boolean[] {true, true, false, false, false, false, false});

        score += check(7, "toTitleCase",
                new String[] {"toTitleCase(\"discrete mathematics\")", "toTitleCase(\"uNAIR cAMPUS b\")",
                        "toTitleCase(\"pancasila\")",
                        "toTitleCase(\"ALGORITHMS AND DATA STRUCTURES\")"},
                new String[] {toTitleCase("discrete mathematics"), toTitleCase("uNAIR cAMPUS b"),
                        toTitleCase("pancasila"),
                        toTitleCase("ALGORITHMS AND DATA STRUCTURES")},
                new String[] {"Discrete Mathematics", "Unair Campus B", "Pancasila",
                        "Algorithms And Data Structures"});

        score += check(8, "sortTwoNames",
                new String[] {"sortTwoNames(\"Budi\", \"Ani\")", "sortTwoNames(\"Citra\", \"Dina\")",
                        "sortTwoNames(\"budi\", \"Ani\")", "sortTwoNames(\"ani\", \"Budi\")"},
                new String[] {sortTwoNames("Budi", "Ani"), sortTwoNames("Citra", "Dina"),
                        sortTwoNames("budi", "Ani"), sortTwoNames("ani", "Budi")},
                new String[] {"Ani, Budi", "Citra, Dina", "Ani, budi", "ani, Budi"});

        score += check(9, "compress",
                new String[] {"compress(\"aaabbc\")", "compress(\"abcd\")", "compress(\"zzzzzzzzzzzz\")",
                        "compress(\"aabcccccaaa\")", "compress(\"\")"},
                new String[] {compress("aaabbc"), compress("abcd"), compress("zzzzzzzzzzzz"),
                        compress("aabcccccaaa"), compress("")},
                new String[] {"a3b2c1", "a1b1c1d1", "z12", "a2b1c5a3", ""});

        score += check(10, "receiptLine",
                new String[] {"receiptLine(\"Rice\", 2, 15000)",
                        "receiptLine(\"Instant Noodles\", 10, 3500)",
                        "receiptLine(\"Pen\", 3, 2500)"},
                new String[] {receiptLine("Rice", 2, 15000),
                        receiptLine("Instant Noodles", 10, 3500),
                        receiptLine("Pen", 3, 2500)},
                new String[] {"Rice          2 x   15000 =    30000",
                        "Instant Nood 10 x    3500 =    35000",
                        "Pen           3 x    2500 =     7500"});

        System.out.println("=============================================");
        System.out.println("  Score: " + score + " / 10");
        if (score == 10) {
            System.out.println("  All exercises passed. Push it to GitHub!");
        }
        System.out.println("=============================================");
    }

    // EN: Builds "Exercise  N: title" with the numbers lined up.
    // ID: Membuat "Exercise  N: judul" dengan nomor yang rata.
    public static String label(int number, String title) {
        return String.format("Exercise %2d: %s", number, title);
    }

    // EN: The three check() methods below are OVERLOADED (Topic 07): one for
    //     int, boolean, and String results. Each returns 1 for [PASS] and 0
    //     for [TODO] or [FAIL].
    // ID: Ketiga method check() di bawah ini di-OVERLOAD (Topik 07): untuk
    //     hasil int, boolean, dan String. Masing-masing mengembalikan 1 untuk
    //     [PASS] dan 0 untuk [TODO] atau [FAIL].

    public static int check(int number, String title, String[] calls, int[] got, int[] expected) {
        boolean allDefault = true;
        for (int value : got) {
            if (value != 0) {
                allDefault = false;
            }
        }
        if (allDefault) {
            System.out.println("[TODO] " + label(number, title));
            return 0;
        }
        for (int i = 0; i < got.length; i++) {
            if (got[i] != expected[i]) {
                System.out.println("[FAIL] " + label(number, title));
                System.out.println("         " + calls[i]);
                System.out.println("         expected: " + expected[i]);
                System.out.println("         got:      " + got[i]);
                return 0;
            }
        }
        System.out.println("[PASS] " + label(number, title));
        return 1;
    }

    public static int check(int number, String title, String[] calls, boolean[] got, boolean[] expected) {
        boolean allDefault = true;
        for (boolean value : got) {
            if (value) {
                allDefault = false;
            }
        }
        if (allDefault) {
            System.out.println("[TODO] " + label(number, title));
            return 0;
        }
        for (int i = 0; i < got.length; i++) {
            if (got[i] != expected[i]) {
                System.out.println("[FAIL] " + label(number, title));
                System.out.println("         " + calls[i]);
                System.out.println("         expected: " + expected[i]);
                System.out.println("         got:      " + got[i]);
                return 0;
            }
        }
        System.out.println("[PASS] " + label(number, title));
        return 1;
    }

    public static int check(int number, String title, String[] calls, String[] got, String[] expected) {
        boolean allDefault = true;
        for (String value : got) {
            if (!"".equals(value)) {
                allDefault = false;
            }
        }
        if (allDefault) {
            System.out.println("[TODO] " + label(number, title));
            return 0;
        }
        for (int i = 0; i < got.length; i++) {
            if (!expected[i].equals(got[i])) {
                System.out.println("[FAIL] " + label(number, title));
                System.out.println("         " + calls[i]);
                System.out.println("         expected: \"" + expected[i] + "\"");
                System.out.println("         got:      \"" + got[i] + "\"");
                return 0;
            }
        }
        System.out.println("[PASS] " + label(number, title));
        return 1;
    }
}
