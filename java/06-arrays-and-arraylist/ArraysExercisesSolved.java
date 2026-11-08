/*
 * Topic 06 - Arrays & ArrayList Exercises (SOLVED)
 * Topik 06 - Latihan Array & ArrayList (SUDAH DIKERJAKAN)
 * ========================================================
 * EN - How to use:
 *     1. Under each exercise, write your own code.
 *     2. Run:  java ArraysExercisesUnsolved.java
 *     3. Compare your output with the "Expected output" in each exercise.
 *        It must match EXACTLY (spaces, punctuation, brackets, capital letters).
 *
 * ID - Cara pakai:
 *     1. Di bawah setiap soal, tulis kodemu sendiri.
 *     2. Jalankan:  java ArraysExercisesUnsolved.java
 *     3. Bandingkan hasilmu dengan "Expected output" di setiap soal.
 *        Harus PERSIS sama (spasi, tanda baca, kurung, huruf besar/kecil).
 *
 * Rules / Aturan:
 *     - Only use Topic 01-06 material. Don't write your own methods yet
 *       (that's Topic 07): everything goes inside main().
 *       Hanya pakai materi Topik 01-06. Belum boleh membuat method sendiri
 *       (itu Topik 07): semuanya ditulis di dalam main().
 *     - NO HARDCODING: get every value from the given arrays/variables,
 *       using loops where the task needs them.
 *       JANGAN HARDCODE: ambil setiap nilai dari array/variabel yang
 *       diberikan, pakai perulangan kalau soalnya membutuhkan.
 *     - The imports at the top (ArrayList, Arrays) are already written for you.
 *       Import di bagian atas (ArrayList, Arrays) sudah disiapkan.
 *     - A variable name can only be declared ONCE in main(). Each exercise
 *       says which names to use for your result variables, so they don't
 *       clash. Loop variables (i, score, name, ...) are fine to reuse,
 *       because they only live inside their own loop.
 *       Nama variabel hanya boleh dideklarasikan SEKALI di main(). Setiap
 *       soal menyebutkan nama yang harus dipakai untuk variabel hasilmu,
 *       supaya tidak bentrok. Variabel loop (i, score, name, ...) boleh
 *       dipakai ulang, karena hanya hidup di dalam loop-nya sendiri.
 *
 * Self-check / Cek sendiri:
 *     When you're done, change the given data (change a number, add an item)
 *     and run again. If your output doesn't change, you hardcoded something.
 *     Kalau sudah selesai, ganti data yang diberikan (ubah angka, tambah item)
 *     lalu jalankan lagi. Kalau output-mu tidak ikut berubah, berarti ada
 *     yang di-hardcode.
 *
 * IMPORTANT / PENTING:
 *     EN: When you save your answers as ArraysExercisesSolved.java,
 *         rename the class below to ArraysExercisesSolved too.
 *     ID: Saat menyimpan jawaban sebagai ArraysExercisesSolved.java,
 *         ganti juga nama class di bawah menjadi ArraysExercisesSolved.
 */
import java.util.ArrayList;
import java.util.Arrays;

public class ArraysExercisesSolved {

    public static void main(String[] args) {

        System.out.println("===== Exercise 1 / Soal 1 =====");
        // EN: Use a loop to calculate the total and the average of examScores.
        //     Show the average with 2 decimal places (printf).
        //     Use these names: scoreSum, scoreAverage
        // ID: Pakai perulangan untuk menghitung total dan rata-rata examScores.
        //     Tampilkan rata-rata dengan 2 angka desimal (printf).
        //     Pakai nama ini: scoreSum, scoreAverage
        //
        // Expected output:
        // Total: 394
        // Average: 78.80
        //
        // (EN: "Average: 78,80" with a comma is also correct if your laptop
        //      uses Indonesian settings.)
        // (ID: "Average: 78,80" dengan koma juga benar kalau laptopmu
        //      memakai pengaturan bahasa Indonesia.)

        int[] examScores = {78, 92, 65, 88, 71};

        // Write your code below / Tulis kodemu di bawah ini:
        int scoreSum = 0;
        for (int score : examScores) {
            scoreSum += score;
        }
        double scoreAverage = (double) scoreSum / examScores.length;

        System.out.println("Total: " + scoreSum);
        System.out.printf("Average: %.2f%n",scoreAverage);


        System.out.println("===== Exercise 2 / Soal 2 =====");
        // EN: Find the highest and the lowest quiz score with a loop and if.
        //     Do NOT use Arrays.sort, Math.max, or Math.min.
        //     Hint: start both variables with the first item, quizScores[0].
        //     Use these names: highest, lowest
        // ID: Cari nilai kuis tertinggi dan terendah dengan perulangan dan if.
        //     JANGAN pakai Arrays.sort, Math.max, atau Math.min.
        //     Petunjuk: isi kedua variabel dengan item pertama, quizScores[0].
        //     Pakai nama ini: highest, lowest
        //
        // Expected output:
        // Highest: 95
        // Lowest: 58

        int[] quizScores = {72, 95, 58, 83, 61, 90};

        // Write your code below / Tulis kodemu di bawah ini:
        int highest = quizScores[0];
        int lowest = quizScores[0];

        for (int score : quizScores) {
            if (score > highest) {
                highest = score;
            }
            if (score < lowest) {
                lowest = score;
            }
        }

        System.out.println("Highest: " + highest);
        System.out.println("Lowest: " + lowest);

        System.out.println("===== Exercise 3 / Soal 3 =====");
        // EN: A score passes if it is at least PASSING_SCORE (grade C at UNAIR).
        //     Count how many scores passed and how many failed.
        //     Use these names: passedCount, failedCount
        // ID: Sebuah nilai lulus kalau minimal PASSING_SCORE (grade C di UNAIR).
        //     Hitung berapa nilai yang lulus dan berapa yang tidak lulus.
        //     Pakai nama ini: passedCount, failedCount
        //
        // Expected output:
        // Passed: 4
        // Failed: 3

        final int PASSING_SCORE = 65;
        int[] finalScores = {80, 64, 65, 92, 49, 70, 58};

        // Write your code below / Tulis kodemu di bawah ini:
        int passedCount = 0;
        int failedCount = 0;

        for (int score : finalScores) {
            if (score >= PASSING_SCORE) {
                passedCount++;
            }
            if (score < PASSING_SCORE) {
                failedCount++;
            }
        }

        System.out.println("Passed: " + passedCount);
        System.out.println("Failed: " + failedCount);


        System.out.println("===== Exercise 4 / Soal 4 =====");
        // EN: Print the prices before sorting, sort them with Arrays.sort,
        //     then print them again with Arrays.toString.
        //     After sorting, use an INDEX (no loop) to print the cheapest
        //     and the most expensive price.
        // ID: Cetak harga sebelum diurutkan, urutkan dengan Arrays.sort,
        //     lalu cetak lagi dengan Arrays.toString.
        //     Setelah diurutkan, pakai INDEKS (tanpa loop) untuk mencetak
        //     harga termurah dan termahal.
        //
        // Expected output:
        // Before: [15000, 8000, 22000, 5000, 12000]
        // After: [5000, 8000, 12000, 15000, 22000]
        // Cheapest: 5000
        // Most expensive: 22000

        int[] prices = {15000, 8000, 22000, 5000, 12000};

        // Write your code below / Tulis kodemu di bawah ini:
        System.out.println("Before: " + Arrays.toString(prices));
        Arrays.sort(prices);
        System.out.println("After: " + Arrays.toString(prices));
        System.out.println("Cheapest: " + prices[0]);
        System.out.println("Most expensive: " + prices[prices.length-1]);


        System.out.println("===== Exercise 5 / Soal 5 =====");
        // EN: For EACH course name in searchTargets, look for it in
        //     offeredCourses. If it's found, print its index. If not,
        //     print "not found". Compare Strings with .equals(), not ==.
        //     Hint: nested loops. Inside the outer loop, start with
        //     int foundIndex = -1; and change it when you find the course.
        //     Use this name: foundIndex (declared INSIDE the outer loop)
        // ID: Untuk SETIAP nama mata kuliah di searchTargets, cari di
        //     offeredCourses. Kalau ketemu, cetak indeksnya. Kalau tidak,
        //     cetak "not found". Bandingkan String dengan .equals(), bukan ==.
        //     Petunjuk: nested loop. Di dalam loop luar, mulai dengan
        //     int foundIndex = -1; lalu ubah nilainya saat mata kuliahnya ketemu.
        //     Pakai nama ini: foundIndex (dideklarasikan DI DALAM loop luar)
        //
        // Expected output:
        // English found at index 2
        // Physics not found
        // Calculus found at index 4

        String[] offeredCourses = {"Algorithms", "Discrete Mathematics", "English", "Pancasila", "Calculus"};
        String[] searchTargets = {"English", "Physics", "Calculus"};

        // Write your code below / Tulis kodemu di bawah ini:

        for (String courses : searchTargets) {
            int foundIndex = -1;
            for (int i = 0; i < offeredCourses.length; i++) {
                if (courses.equals(offeredCourses[i])) {
                    foundIndex = i;
                }
            }
            if (foundIndex < 0) {
                System.out.println(courses + " not found");
            } else {
                System.out.println(courses + " found at index " + foundIndex);
            }
        }


        System.out.println("===== Exercise 6 / Soal 6 =====");
        // EN: Make a NEW array reversedOrder with the same length as
        //     presentationOrder, and fill it in reverse order with a loop.
        //     Then print both arrays. presentationOrder must NOT change.
        //     Hint: the item at index i goes to index (length - 1 - i).
        //     Use this name: reversedOrder
        // ID: Buat array BARU reversedOrder dengan panjang yang sama seperti
        //     presentationOrder, lalu isi dengan urutan terbalik memakai loop.
        //     Lalu cetak kedua array. presentationOrder TIDAK boleh berubah.
        //     Petunjuk: item di indeks i pindah ke indeks (length - 1 - i).
        //     Pakai nama ini: reversedOrder
        //
        // Expected output:
        // Original: [Ani, Budi, Citra, Dina, Eko]
        // Reversed: [Eko, Dina, Citra, Budi, Ani]

        String[] presentationOrder = {"Ani", "Budi", "Citra", "Dina", "Eko"};

        // Write your code below / Tulis kodemu di bawah ini:
        String[] reversedOrder = new String[presentationOrder.length];
        for (int i = 0; i < presentationOrder.length; i++) {
            reversedOrder[presentationOrder.length - 1 - i] = presentationOrder[i];
        }

        System.out.println("Original: " + Arrays.toString(presentationOrder));
        System.out.println("Reversed: " + Arrays.toString(reversedOrder));


        System.out.println("===== Exercise 7 / Soal 7 =====");
        // EN: Update the shopping list step by step:
        //     1) add "bread", then "sugar", to the end
        //     2) remove "eggs"
        //     3) change the FIRST item to "brown rice" (use set)
        //     Then print the list, the number of items, and whether the
        //     list contains "milk" and "eggs" (use contains).
        // ID: Ubah daftar belanja langkah demi langkah:
        //     1) tambahkan "bread", lalu "sugar", di akhir
        //     2) hapus "eggs"
        //     3) ganti item PERTAMA menjadi "brown rice" (pakai set)
        //     Lalu cetak list-nya, jumlah item-nya, dan apakah list berisi
        //     "milk" dan "eggs" (pakai contains).
        //
        // Expected output:
        // Shopping list: [brown rice, milk, bread, sugar]
        // Items: 4
        // Has milk: true
        // Has eggs: false

        ArrayList<String> shoppingList = new ArrayList<>();
        shoppingList.add("rice");
        shoppingList.add("eggs");
        shoppingList.add("milk");

        // Write your code below / Tulis kodemu di bawah ini:
        shoppingList.add("bread");
        shoppingList.add("sugar");
        shoppingList.remove("eggs");
        shoppingList.set(0, "brown rice");

        System.out.println("Shopping list: " + shoppingList);
        System.out.println("Items: " + shoppingList.size());
        System.out.println("Has milk: " + shoppingList.contains("milk"));
        System.out.println("Has eggs: " + shoppingList.contains("eggs"));


        System.out.println("===== Exercise 8 / Soal 8 =====");
        // EN: courseScores is a table. Each ROW is one student and each
        //     COLUMN is one course (Algorithms, English, Calculus).
        //     studentNames[0] is the name for row 0, and so on.
        //     For each student, print the row total and the row average
        //     (2 decimal places). Use nested loops and printf.
        //     Hint: the number of courses is courseScores[row].length.
        //     Use these names: rowTotal, rowAverage (declared INSIDE the outer loop)
        // ID: courseScores adalah tabel. Setiap BARIS adalah satu mahasiswa
        //     dan setiap KOLOM adalah satu mata kuliah (Algorithms, English,
        //     Calculus). studentNames[0] adalah nama untuk baris 0, dan seterusnya.
        //     Untuk setiap mahasiswa, cetak total baris dan rata-rata baris
        //     (2 angka desimal). Pakai nested loop dan printf.
        //     Petunjuk: jumlah mata kuliah adalah courseScores[row].length.
        //     Pakai nama ini: rowTotal, rowAverage (dideklarasikan DI DALAM loop luar)
        //
        // Expected output:
        // Ani: total 245, average 81.67
        // Budi: total 195, average 65.00
        // Citra: total 259, average 86.33
        //
        // (EN: A comma instead of a dot (81,67) is also correct with
        //      Indonesian settings.)
        // (ID: Koma sebagai pengganti titik (81,67) juga benar dengan
        //      pengaturan bahasa Indonesia.)

        String[] studentNames = {"Ani", "Budi", "Citra"};
        int[][] courseScores = {
            {80, 75, 90},
            {65, 70, 60},
            {88, 92, 79}
        };

        // Write your code below / Tulis kodemu di bawah ini:
        for (int i = 0; i < studentNames.length; i++) {
            int rowTotal = 0;
            double rowAverage = 0.00;
            for (int j = 0; j < courseScores[i].length; j++) {
                rowTotal += courseScores[i][j];
            }
            rowAverage = (double)rowTotal / courseScores[i].length;
            System.out.printf("%s: total %d, average %.2f%n", studentNames[i], rowTotal, rowAverage);
        }
        


        System.out.println("===== Exercise 9 / Soal 9 (Challenge) =====");
        // EN: attendanceLog has duplicate names. Build an ArrayList
        //     uniqueNames that keeps each name only ONCE, in the order it
        //     first appears. Then print the list and how many names it has.
        //     Hint: before adding a name, check it with contains().
        //     Use this name: uniqueNames
        // ID: attendanceLog berisi nama yang dobel. Buat ArrayList uniqueNames
        //     yang menyimpan setiap nama hanya SEKALI, sesuai urutan pertama
        //     kali muncul. Lalu cetak list-nya dan berapa nama di dalamnya.
        //     Petunjuk: sebelum menambahkan nama, cek dulu dengan contains().
        //     Pakai nama ini: uniqueNames
        //
        // Expected output:
        // Unique names: [Budi, Ani, Dina, Citra]
        // Count: 4

        String[] attendanceLog = {"Budi", "Ani", "Dina", "Ani", "Citra", "Budi", "Ani"};

        // Write your code below / Tulis kodemu di bawah ini:
        ArrayList<String> uniqueNames = new ArrayList<>();
        for (String name : attendanceLog) {
            if (!uniqueNames.contains(name)) {
                uniqueNames.add(name);
            }
        }

        System.out.println("Unique names: " + uniqueNames);
        System.out.println("Count: " + uniqueNames.size());


        System.out.println("===== Exercise 10 / Soal 10 (Challenge) =====");
        // EN: Count how many times each grade in possibleGrades appears in
        //     letterGrades, then print which grade appears the most.
        //     (Only single-letter grades here, so AB and BC are left out.)
        //     Hint: make an int[] gradeCounts with the same length as
        //     possibleGrades. gradeCounts[0] counts 'A', gradeCounts[1]
        //     counts 'B', and so on. A char can be compared with ==.
        //     If two grades have the same count, keep the first one.
        //     Use these names: gradeCounts, maxCount, mostCommonGrade
        // ID: Hitung berapa kali setiap grade di possibleGrades muncul di
        //     letterGrades, lalu cetak grade mana yang paling sering muncul.
        //     (Di sini hanya grade satu huruf, jadi AB dan BC tidak dipakai.)
        //     Petunjuk: buat int[] gradeCounts dengan panjang yang sama seperti
        //     possibleGrades. gradeCounts[0] menghitung 'A', gradeCounts[1]
        //     menghitung 'B', dan seterusnya. char bisa dibandingkan dengan ==.
        //     Kalau ada dua grade dengan jumlah sama, ambil yang pertama.
        //     Pakai nama ini: gradeCounts, maxCount, mostCommonGrade
        //
        // Expected output:
        // A: 2
        // B: 4
        // C: 2
        // D: 0
        // E: 1
        // Most common: B

        char[] possibleGrades = {'A', 'B', 'C', 'D', 'E'};
        char[] letterGrades = {'B', 'A', 'B', 'C', 'B', 'A', 'E', 'B', 'C'};

        // Write your code below / Tulis kodemu di bawah ini:
        int[] gradeCounts = new int[possibleGrades.length];
        char mostCommonGrade = ' ';
        int maxCount = 0;
        for (int i = 0; i < possibleGrades.length; i++) {
            char grade = possibleGrades[i];
            int count = 0;
            for (char letter : letterGrades) {
                if (grade == letter) {
                    count++;
                }
            }
            gradeCounts[i] = count;
            if (gradeCounts[i] > maxCount) {
                maxCount = gradeCounts[i];
                mostCommonGrade = possibleGrades[i];
            }
            System.out.println(possibleGrades[i] + ": " + gradeCounts[i]);
        }

        System.out.println("Most common: " + mostCommonGrade);

    }
}
