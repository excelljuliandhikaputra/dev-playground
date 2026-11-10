/*
 * Topic 07 - Methods Exercises (SOLVED)
 * Topik 07 - Latihan Method (SUDAH DIKERJAKAN)
 * =============================================
 * EN - How to use:
 *     1. Every exercise is a method. Replace the line marked // TODO
 *        with your own code (keep the method name and parameters).
 *     2. Run:  java MethodsExercisesUnsolved.java
 *     3. The checker in main() at the bottom tests every method:
 *        [TODO] = not started, [FAIL] = wrong answer, [PASS] = correct
 *
 * ID - Cara pakai:
 *     1. Setiap soal adalah sebuah method. Ganti baris bertanda // TODO
 *        dengan kodemu sendiri (nama method dan parameternya jangan diubah).
 *     2. Jalankan:  java MethodsExercisesUnsolved.java
 *     3. Checker di main() bagian bawah menguji setiap method:
 *        [TODO] = belum dikerjakan, [FAIL] = jawaban salah, [PASS] = benar
 *
 * Rules / Aturan:
 *     - Only use Topic 01-07 material.
 *       Hanya pakai materi Topik 01-07.
 *     - Only edit the method bodies. Do not change the checker.
 *       Ubah hanya isi method. Jangan ubah bagian checker.
 *     - NO HARDCODING: every method is tested with several different
 *       inputs, so returning a fixed answer will FAIL.
 *       JANGAN HARDCODE: setiap method diuji dengan beberapa input berbeda,
 *       jadi mengembalikan jawaban tetap pasti FAIL.
 *     - You may add your own helper methods (for example in Exercise 10).
 *       Kamu boleh menambah method bantuan sendiri (misalnya di Soal 10).
 *     - Exercise 3 has a "no Math.max" rule. Respect it.
 *       Soal 3 punya aturan "tidak boleh pakai Math.max". Ikuti aturannya.
 *
 * Notes / Catatan:
 *     - A method that returns its default value (0, 0.0, false, "") for
 *       EVERY test is shown as [TODO], even if you already wrote code.
 *       Method yang mengembalikan nilai default (0, 0.0, false, "") untuk
 *       SEMUA tes ditampilkan sebagai [TODO], walaupun kodenya sudah ditulis.
 *     - If the program crashes, read the error message: it shows the
 *       method name and line number where the problem is.
 *       Kalau programnya crash, baca pesan error-nya: di situ tertulis
 *       nama method dan nomor baris tempat masalahnya.
 *
 * Self-check / Cek sendiri:
 *     Try your methods with your own inputs too. Add a temporary line at
 *     the TOP of main(), e.g.  System.out.println(greet("Ani"));
 *     then delete it when you're done.
 *     Coba juga method-mu dengan input buatanmu sendiri. Tambahkan baris
 *     sementara di BAGIAN ATAS main(), misalnya
 *     System.out.println(greet("Ani"));  lalu hapus kalau sudah selesai.
 *
 * IMPORTANT / PENTING:
 *     EN: When you save your answers as MethodsExercisesSolved.java,
 *         rename the class below to MethodsExercisesSolved too.
 *     ID: Saat menyimpan jawaban sebagai MethodsExercisesSolved.java,
 *         ganti juga nama class di bawah menjadi MethodsExercisesSolved.
 */
public class MethodsExercisesSolved {

    // -----------------------------------------------------------------------
    // LEVEL 1 - WARM UP
    // -----------------------------------------------------------------------

    // Exercise 1 / Soal 1: greet
    // EN: Return a greeting for the given name.
    // ID: Kembalikan kalimat sapaan untuk nama yang diberikan.
    //     greet("Excell") -> "Hello, Excell!"
    //     greet("Budi")   -> "Hello, Budi!"
    public static String greet(String name) {
        return "Hello, " + name + "!";
    }


    // Exercise 2 / Soal 2: isEven
    // EN: Return true if the number is even, otherwise false.
    //     Careful: in Java, -3 % 2 is -1 (not 1).
    // ID: Kembalikan true jika angkanya genap, selain itu false.
    //     Hati-hati: di Java, -3 % 2 hasilnya -1 (bukan 1).
    //     isEven(4)  -> true
    //     isEven(7)  -> false
    //     isEven(-3) -> false
    public static boolean isEven(int number) {
        return number % 2 == 0;
    }


    // -----------------------------------------------------------------------
    // LEVEL 2 - CORE PRACTICE
    // -----------------------------------------------------------------------

    // Exercise 3 / Soal 3: maxOfThree
    // EN: Return the largest of three numbers.
    //     Rule: do NOT use Math.max. Use if / else if / else.
    // ID: Kembalikan angka terbesar dari tiga angka.
    //     Aturan: JANGAN pakai Math.max. Pakai if / else if / else.
    //     maxOfThree(3, 9, 5)    -> 9
    //     maxOfThree(-5, -2, -9) -> -2
    public static int maxOfThree(int a, int b, int c) {
        int max = a;
        if (b > max) {
            max = b;
        }
        if (c > max) {
            max = c;
        }
        return max;
    }


    // Exercise 4 / Soal 4: scoreToGrade
    // EN: Convert a score (0-100) to a letter grade (UNAIR scale).
    // ID: Ubah nilai (0-100) menjadi huruf grade sesuai skala UNAIR.
    //     85-100 -> "A"
    //     80-84  -> "AB"
    //     75-79  -> "B"
    //     70-74  -> "BC"
    //     65-69  -> "C"
    //     50-64  -> "D"
    //     0-49   -> "E"
    //     scoreToGrade(82) -> "AB"
    public static String scoreToGrade(int score) {
        if (score >= 85 && score <= 100) {
            return "A";
        } else if (score >= 80 && score <= 84) {
            return "AB";
        } else if (score >= 75 && score <= 79) {
            return "B";
        } else if (score >= 70 && score <= 74) {
            return "BC";
        } else if (score >= 65 && score <= 69) {
            return "C";
        } else if (score >= 50 && score <= 64) {
            return "D";
        } else if (score >= 0 && score <= 49) {
            return "E";
        } else {
            return "";
        }
    }


    // Exercise 5 / Soal 5: calculatePrice (overloading)
    // EN: Write BOTH versions of calculatePrice.
    //     a) calculatePrice(price, discountPercent): return the price after
    //        the discount. Watch out for int division: use 100.0, not 100.
    //     b) calculatePrice(price): no discount. Java has no default
    //        parameters, so make this version CALL version a) with 0.
    // ID: Tulis KEDUA versi calculatePrice.
    //     a) calculatePrice(price, discountPercent): kembalikan harga setelah
    //        diskon. Hati-hati pembagian int: pakai 100.0, bukan 100.
    //     b) calculatePrice(price): tanpa diskon. Java tidak punya default
    //        parameter, jadi versi ini harus MEMANGGIL versi a) dengan 0.
    //     calculatePrice(100000)     -> 100000.0
    //     calculatePrice(100000, 25) -> 75000.0
    public static double calculatePrice(int price, int discountPercent) {
        return price - (price * discountPercent / 100.0);
    }

    public static double calculatePrice(int price) {
        return calculatePrice(price, 0);
    }


    // Exercise 6 / Soal 6: countVowels
    // EN: Count the vowels (a, e, i, o, u) in the text.
    //     Uppercase letters count too. Hint: toLowerCase() and charAt().
    // ID: Hitung jumlah huruf vokal (a, e, i, o, u) dalam teks.
    //     Huruf kapital juga dihitung. Petunjuk: toLowerCase() dan charAt().
    //     countVowels("Airlangga") -> 4
    //     countVowels("PYTHON")    -> 1
    public static int countVowels(String text) {
        int countVowels = 0;

        String lower = text.toLowerCase();
        for (int i = 0; i < lower.length(); i++) {
            char c = lower.charAt(i);
            if (c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u') {
                countVowels++;
            }
        }
        return countVowels;
    }


    // Exercise 7 / Soal 7: sumArray
    // EN: Return the sum of all numbers in the array. An empty array gives 0.
    // ID: Kembalikan jumlah semua angka di dalam array. Array kosong hasilnya 0.
    //     sumArray(new int[] {80, 90, 70}) -> 240
    public static int sumArray(int[] numbers) {
        int total = 0;
        for (int number : numbers) {
            total += number;
        }
        return total;
    }


    // Exercise 8 / Soal 8: average
    // EN: Return the average of the numbers. REUSE your sumArray() method.
    //     If the array is empty, return 0.0 (you can't divide by 0).
    //     Don't round the result.
    // ID: Kembalikan rata-rata dari angka-angkanya. PAKAI ULANG method
    //     sumArray() buatanmu. Kalau array-nya kosong, kembalikan 0.0
    //     (tidak bisa membagi dengan 0). Hasilnya jangan dibulatkan.
    //     average(new int[] {85, 78}) -> 81.5
    public static double average(int[] numbers) {
        if (numbers.length == 0) {
            return 0.0;
        }
        double average = (double)sumArray(numbers) / numbers.length;
        return average;
    }


    // -----------------------------------------------------------------------
    // LEVEL 3 - CHALLENGE
    // -----------------------------------------------------------------------

    // Exercise 9 / Soal 9 (Challenge): isPrime
    // EN: Return true if the number is prime, otherwise false.
    //     A prime number is greater than 1 and can only be divided by 1
    //     and itself.
    // ID: Kembalikan true jika angkanya bilangan prima, selain itu false.
    //     Bilangan prima adalah bilangan lebih dari 1 yang hanya habis
    //     dibagi oleh 1 dan dirinya sendiri.
    //     Hint / Petunjuk: don't forget to test 2, 1, 0, 4 and 9 in your head.
    //                      jangan lupa uji 2, 1, 0, 4 dan 9 di kepalamu.
    //     isPrime(17) -> true
    //     isPrime(1)  -> false
    //     isPrime(9)  -> false
    public static boolean isPrime(int number) {
        if (number <= 1) {
            return false;
        };

        for (int i = 2; i < number; i++) {
            if (number % i == 0) {
                return false;
            }
        }
        return true;
    }


    // Exercise 10 / Soal 10 (Challenge): calculateGpa
    // EN: credits[i] and scores[i] belong to the same course.
    //     Steps:
    //       1. Convert each score to a grade with YOUR scoreToGrade().
    //       2. Convert the grade to grade points:
    //          A=4.0, AB=3.5, B=3.0, BC=2.5, C=2.0, D=1.0, E=0.0
    //          (tip: a small helper method gradePoint(String grade) with a switch)
    //       3. GPA = sum of (grade points * credits) / total credits
    //       4. Round to 2 decimals: Math.round(gpa * 100) / 100.0
    //     If there are no courses (empty arrays), return 0.0.
    // ID: credits[i] dan scores[i] milik mata kuliah yang sama.
    //     Langkah:
    //       1. Ubah setiap nilai menjadi grade dengan scoreToGrade() BUATANMU.
    //       2. Ubah grade menjadi bobot nilai:
    //          A=4.0, AB=3.5, B=3.0, BC=2.5, C=2.0, D=1.0, E=0.0
    //          (tips: buat method bantuan kecil gradePoint(String grade) dengan switch)
    //       3. IPK = jumlah (bobot * SKS) / total SKS
    //       4. Bulatkan 2 desimal: Math.round(ipk * 100) / 100.0
    //     Kalau tidak ada mata kuliah (array kosong), kembalikan 0.0.
    //
    //     Example / Contoh:
    //       Algorithms            3 credits  88 -> A  (4.0)
    //       Discrete Mathematics  3 credits  72 -> BC (2.5)
    //       English               2 credits  81 -> AB (3.5)
    //       Pancasila             2 credits  60 -> D  (1.0)
    //       calculateGpa(new int[] {3, 3, 2, 2}, new int[] {88, 72, 81, 60}) -> 2.85
    public static double calculateGpa(int[] credits, int[] scores) {
        if (credits.length == 0) {
            return 0.0;
        }
        double total = 0;
        double totalCredits = 0;
        for (int i = 0; i < credits.length; i++) {
            double gradePoint = 0;
            switch (scoreToGrade(scores[i])) {
                case "A":
                    gradePoint = 4.0;
                    break;
                case "AB":
                    gradePoint = 3.5;
                    break;
                case "B":
                    gradePoint = 3.0;
                    break;
                case "BC":
                    gradePoint = 2.5;
                    break;
                case "C":
                    gradePoint = 2.0;
                    break;
                case "D":
                    gradePoint = 1.0;
                    break;
                case "E":
                    gradePoint = 0.0;
                    break;
                default:
                    break;
            }
            totalCredits += credits[i];
            total += gradePoint * credits[i];
        }
        double gpa = total / totalCredits;
        double result = Math.round(gpa * 100) / 100.0;
        return result;
    }


    // =======================================================================
    // CHECKER - do not edit below this line / jangan ubah bagian di bawah ini
    // =======================================================================

    public static void main(String[] args) {
        System.out.println("=============================================");
        System.out.println("  Topic 07 - Methods Exercises");
        System.out.println("=============================================");

        int score = 0;

        score += check(1, "greet",
                new String[] {"greet(\"Excell\")", "greet(\"UNAIR\")", "greet(\"Budi\")"},
                new String[] {greet("Excell"), greet("UNAIR"), greet("Budi")},
                new String[] {"Hello, Excell!", "Hello, UNAIR!", "Hello, Budi!"});

        score += check(2, "isEven",
                new String[] {"isEven(4)", "isEven(7)", "isEven(0)", "isEven(-3)", "isEven(-8)"},
                new boolean[] {isEven(4), isEven(7), isEven(0), isEven(-3), isEven(-8)},
                new boolean[] {true, false, true, false, true});

        score += check(3, "maxOfThree",
                new String[] {"maxOfThree(3, 9, 5)", "maxOfThree(10, 2, 7)", "maxOfThree(1, 1, 4)",
                        "maxOfThree(-5, -2, -9)", "maxOfThree(6, 6, 6)"},
                new int[] {maxOfThree(3, 9, 5), maxOfThree(10, 2, 7), maxOfThree(1, 1, 4),
                        maxOfThree(-5, -2, -9), maxOfThree(6, 6, 6)},
                new int[] {9, 10, 4, -2, 6});

        score += check(4, "scoreToGrade",
                new String[] {"scoreToGrade(100)", "scoreToGrade(85)", "scoreToGrade(84)",
                        "scoreToGrade(80)", "scoreToGrade(77)", "scoreToGrade(74)",
                        "scoreToGrade(65)", "scoreToGrade(64)", "scoreToGrade(50)",
                        "scoreToGrade(49)", "scoreToGrade(0)"},
                new String[] {scoreToGrade(100), scoreToGrade(85), scoreToGrade(84),
                        scoreToGrade(80), scoreToGrade(77), scoreToGrade(74),
                        scoreToGrade(65), scoreToGrade(64), scoreToGrade(50),
                        scoreToGrade(49), scoreToGrade(0)},
                new String[] {"A", "A", "AB", "AB", "B", "BC", "C", "D", "D", "E", "E"});

        score += check(5, "calculatePrice",
                new String[] {"calculatePrice(100000)", "calculatePrice(100000, 25)",
                        "calculatePrice(19999, 15)", "calculatePrice(50000)"},
                new double[] {calculatePrice(100000), calculatePrice(100000, 25),
                        calculatePrice(19999, 15), calculatePrice(50000)},
                new double[] {100000.0, 75000.0, 16999.15, 50000.0});

        score += check(6, "countVowels",
                new String[] {"countVowels(\"Airlangga\")", "countVowels(\"PYTHON\")",
                        "countVowels(\"xyz\")", "countVowels(\"Universitas Airlangga\")"},
                new int[] {countVowels("Airlangga"), countVowels("PYTHON"),
                        countVowels("xyz"), countVowels("Universitas Airlangga")},
                new int[] {4, 1, 0, 9});

        score += check(7, "sumArray",
                new String[] {"sumArray({80, 90, 70})", "sumArray({5, -3, 10, 0})",
                        "sumArray({42})", "sumArray({})"},
                new int[] {sumArray(new int[] {80, 90, 70}), sumArray(new int[] {5, -3, 10, 0}),
                        sumArray(new int[] {42}), sumArray(new int[] {})},
                new int[] {240, 12, 42, 0});

        score += check(8, "average",
                new String[] {"average({80, 90, 70})", "average({85, 78})",
                        "average({77})", "average({})"},
                new double[] {average(new int[] {80, 90, 70}), average(new int[] {85, 78}),
                        average(new int[] {77}), average(new int[] {})},
                new double[] {80.0, 81.5, 77.0, 0.0});

        score += check(9, "isPrime",
                new String[] {"isPrime(2)", "isPrime(17)", "isPrime(97)", "isPrime(1)",
                        "isPrime(0)", "isPrime(4)", "isPrime(9)", "isPrime(15)"},
                new boolean[] {isPrime(2), isPrime(17), isPrime(97), isPrime(1),
                        isPrime(0), isPrime(4), isPrime(9), isPrime(15)},
                new boolean[] {true, true, true, false, false, false, false, false});

        score += check(10, "calculateGpa",
                new String[] {"calculateGpa({3, 3, 2, 2}, {88, 72, 81, 60})",
                        "calculateGpa({3, 2, 3}, {77, 66, 84})",
                        "calculateGpa({4}, {90})",
                        "calculateGpa({}, {})"},
                new double[] {calculateGpa(new int[] {3, 3, 2, 2}, new int[] {88, 72, 81, 60}),
                        calculateGpa(new int[] {3, 2, 3}, new int[] {77, 66, 84}),
                        calculateGpa(new int[] {4}, new int[] {90}),
                        calculateGpa(new int[] {}, new int[] {})},
                new double[] {2.85, 2.94, 4.0, 0.0});

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
        String space = (number < 10) ? " " : "";
        return "Exercise " + space + number + ": " + title;
    }

    // EN: The four check() methods below are OVERLOADED (same name, different
    //     parameter types): one for int, double, boolean, and String results.
    //     Each one returns 1 for [PASS] and 0 for [TODO] or [FAIL].
    // ID: Keempat method check() di bawah ini di-OVERLOAD (nama sama, tipe
    //     parameter beda): untuk hasil int, double, boolean, dan String.
    //     Masing-masing mengembalikan 1 untuk [PASS] dan 0 untuk [TODO] atau [FAIL].

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

    public static int check(int number, String title, String[] calls, double[] got, double[] expected) {
        boolean allDefault = true;
        for (double value : got) {
            if (value != 0.0) {
                allDefault = false;
            }
        }
        if (allDefault) {
            System.out.println("[TODO] " + label(number, title));
            return 0;
        }
        for (int i = 0; i < got.length; i++) {
            // EN: doubles are compared with a tiny tolerance (0.001). Written as
            //     !(... <= 0.001) so that NaN (the result of 0.0 / 0) also fails.
            // ID: double dibandingkan dengan toleransi kecil (0.001). Ditulis
            //     !(... <= 0.001) supaya NaN (hasil dari 0.0 / 0) juga gagal.
            if (!(Math.abs(got[i] - expected[i]) <= 0.001)) {
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
