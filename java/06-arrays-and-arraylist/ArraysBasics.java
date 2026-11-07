/*
 * Topic 06 - Arrays & ArrayList
 * Topik 06 - Array & ArrayList
 * ==============================
 * EN: Topics covered in this lesson file.
 * ID: Topik yang dibahas di file ini.
 *
 *     1. Creating an array                  | Membuat array
 *     2. Index and .length                  | Indeks dan .length
 *     3. Looping: for and for-each          | Perulangan: for dan for-each
 *     4. Common loop patterns               | Pola perulangan yang sering dipakai
 *     5. Printing and sorting (Arrays)      | Mencetak dan mengurutkan (Arrays)
 *     6. Copying an array                   | Menyalin array
 *     7. 2D arrays                          | Array 2 dimensi
 *     8. ArrayList                          | ArrayList
 *     9. Wrapper types: Integer, Double     | Tipe wrapper: Integer, Double
 *    10. Array or ArrayList?                | Array atau ArrayList?
 *
 * Run this file / Jalankan file ini:
 *     java ArraysBasics.java
 */

// EN: Like Scanner in Topic 03, these tools live outside java.lang,
//     so we import them at the very top of the file.
// ID: Sama seperti Scanner di Topik 03, alat-alat ini ada di luar java.lang,
//     jadi kita import di paling atas file.
import java.util.ArrayList;
import java.util.Arrays;

public class ArraysBasics {

    public static void main(String[] args) {

        // -------------------------------------------------------------------
        // 1. Creating an array
        // EN: An array stores many values of the SAME type in one variable.
        //     Its size is FIXED: once created, it can't grow or shrink.
        //     Way 1: you already know the values   -> type[] name = { ... };
        //     Way 2: you only know the size         -> new type[size]
        //            Empty slots get a default value: 0 (int), 0.0 (double),
        //            false (boolean), null (String, means "nothing yet").
        //     Way 3: new type[] { ... }  (same as Way 1, also works later
        //            when you pass an array straight into a method)
        // ID: Array menyimpan banyak nilai dengan tipe yang SAMA dalam satu variabel.
        //     Ukurannya TETAP: setelah dibuat, tidak bisa bertambah atau berkurang.
        //     Cara 1: nilainya sudah diketahui      -> tipe[] nama = { ... };
        //     Cara 2: hanya ukurannya yang diketahui -> new tipe[ukuran]
        //             Slot kosong berisi nilai default: 0 (int), 0.0 (double),
        //             false (boolean), null (String, artinya "belum ada isi").
        //     Cara 3: new tipe[] { ... }  (sama dengan Cara 1, nanti juga bisa
        //             dipakai saat mengirim array langsung ke method)
        // -------------------------------------------------------------------
        int[] scores = {78, 92, 65, 88};
        String[] courses = {"Algorithms", "Discrete Mathematics", "English", "Pancasila"};

        double[] studyHours = new double[3];     // [0.0, 0.0, 0.0]
        studyHours[0] = 4.5;
        studyHours[1] = 6.0;
        studyHours[2] = 3.5;

        char[] letters = new char[] {'U', 'N', 'A', 'I', 'R'};

        // int[] wrong = {78, "92"};      -> ERROR: every item must be an int / semua item harus int
        // int[] alsoWrong = new int[];   -> ERROR: the size is required / ukurannya wajib ditulis


        // -------------------------------------------------------------------
        // 2. Index and .length
        // EN: Index starts at 0, so the LAST index is length - 1.
        //     Arrays use .length WITHOUT ( ). (A String uses .length() WITH ( ).)
        //     Java has no negative index like Python's [-1].
        // ID: Indeks dimulai dari 0, jadi indeks TERAKHIR adalah length - 1.
        //     Array memakai .length TANPA ( ). (String memakai .length() DENGAN ( ).)
        //     Java tidak punya indeks negatif seperti [-1] di Python.
        // -------------------------------------------------------------------
        System.out.println(courses[0]);                    // Algorithms
        System.out.println(courses.length);                // 4
        System.out.println(courses[courses.length - 1]);   // Pancasila
        System.out.println(letters[2]);                    // A

        scores[1] = 95;                                    // change an item / ubah item
        System.out.println(scores[1]);                     // 95

        // System.out.println(courses[4]);   -> CRASH: ArrayIndexOutOfBoundsException
        //                                      (valid index: 0 to 3 / indeks valid: 0 sampai 3)
        // System.out.println(courses[-1]);  -> CRASH: no negative index in Java / Java tidak punya indeks negatif
        // courses.length()                  -> ERROR: arrays use .length without ( ) / array pakai .length tanpa ( )


        // -------------------------------------------------------------------
        // 3. Looping: for and for-each
        // EN: Use a normal for loop when you need the INDEX (position).
        //     Use for-each when you only need the VALUES. Read it as
        //     "for each course in courses". It's like Python's `for x in list`.
        // ID: Pakai for biasa kalau kamu butuh INDEKS (posisi).
        //     Pakai for-each kalau kamu hanya butuh NILAINYA. Bacanya:
        //     "untuk setiap course di courses". Mirip `for x in list` di Python.
        // -------------------------------------------------------------------
        for (int i = 0; i < courses.length; i++) {
            System.out.println((i + 1) + ". " + courses[i]);
        }
        // 1. Algorithms
        // 2. Discrete Mathematics
        // 3. English
        // 4. Pancasila

        for (double hours : studyHours) {
            System.out.println(hours + " hours");
        }
        // 4.5 hours
        // 6.0 hours
        // 3.5 hours

        // for (int i = 0; i <= courses.length; i++)   -> CRASH: <= goes one step too far
        //                                                 <= kelewatan satu langkah
        // EN: for-each can READ items but can't change them in the array.
        //     To change items, use a normal for loop with the index.
        // ID: for-each bisa MEMBACA item tapi tidak bisa mengubah isi array.
        //     Untuk mengubah item, pakai for biasa dengan indeks.


        // -------------------------------------------------------------------
        // 4. Common loop patterns
        // EN: Almost every array task is one of these four patterns
        //     (you already know the accumulator and counter from Topic 05).
        // ID: Hampir semua tugas array adalah salah satu dari empat pola ini
        //     (akumulator dan counter sudah kamu kenal dari Topik 05).
        // -------------------------------------------------------------------
        int[] quizScores = {72, 95, 58, 83};

        // a) Sum and average / Total dan rata-rata
        int sum = 0;
        for (int score : quizScores) {
            sum += score;
        }
        double average = (double) sum / quizScores.length;   // cast so the decimal isn't cut
                                                              // di-cast supaya desimal tidak hilang
        System.out.println("Sum: " + sum);                    // Sum: 308
        System.out.printf("Average: %.2f%n", average);        // Average: 77.00

        // b) Highest value / Nilai tertinggi
        // EN: Start with the FIRST item, not 0. If every value were negative,
        //     starting at 0 would give a wrong answer.
        // ID: Mulai dari item PERTAMA, bukan 0. Kalau semua nilainya negatif,
        //     mulai dari 0 akan memberi jawaban yang salah.
        int highest = quizScores[0];
        for (int score : quizScores) {
            if (score > highest) {
                highest = score;
            }
        }
        System.out.println("Highest: " + highest);            // Highest: 95

        // c) Counting / Menghitung
        int passedCount = 0;
        for (int score : quizScores) {
            if (score >= 65) {
                passedCount++;
            }
        }
        System.out.println("Passed: " + passedCount);         // Passed: 3

        // d) Searching: remember the index, -1 means "not found"
        //    Mencari: simpan indeksnya, -1 artinya "tidak ketemu"
        String target = "English";
        int foundIndex = -1;
        for (int i = 0; i < courses.length; i++) {
            if (courses[i].equals(target)) {    // .equals(), NOT == (Topic 04)
                foundIndex = i;
                break;                           // stop searching / berhenti mencari
            }
        }
        System.out.println(target + " is at index " + foundIndex);   // English is at index 2


        // -------------------------------------------------------------------
        // 5. Printing and sorting (Arrays)
        // EN: println(array) prints something like [I@1b6d3586 (a memory
        //     address), NOT the items. Use Arrays.toString(array) instead.
        //     Arrays.sort(array) sorts from small to big (text: A to Z).
        //     It changes the ORIGINAL array, like Python's list.sort().
        // ID: println(array) mencetak sesuatu seperti [I@1b6d3586 (alamat
        //     memori), BUKAN isinya. Pakai Arrays.toString(array).
        //     Arrays.sort(array) mengurutkan dari kecil ke besar (teks: A ke Z).
        //     Array ASLINYA yang berubah, seperti list.sort() di Python.
        // -------------------------------------------------------------------
        int[] prices = {15000, 8000, 22000, 5000};
        // System.out.println(prices);   -> prints [I@... (not useful / tidak berguna)
        System.out.println(Arrays.toString(prices));        // [15000, 8000, 22000, 5000]

        Arrays.sort(prices);
        System.out.println(Arrays.toString(prices));        // [5000, 8000, 15000, 22000]
        System.out.println("Cheapest: " + prices[0]);                       // Cheapest: 5000
        System.out.println("Most expensive: " + prices[prices.length - 1]); // Most expensive: 22000

        String[] names = {"Citra", "ani", "Budi"};
        Arrays.sort(names);
        System.out.println(Arrays.toString(names));         // [Budi, Citra, ani]
        // EN: Capital letters are sorted BEFORE small letters.
        // ID: Huruf kapital diurutkan SEBELUM huruf kecil.


        // -------------------------------------------------------------------
        // 6. Copying an array
        // EN: `=` does NOT copy an array. Both variables point to the SAME
        //     array, so changing one also changes the other.
        //     For a real copy, create a new array and copy item by item.
        // ID: `=` TIDAK menyalin array. Kedua variabel menunjuk ke array yang
        //     SAMA, jadi mengubah yang satu juga mengubah yang lain.
        //     Untuk salinan asli, buat array baru lalu salin satu per satu.
        // -------------------------------------------------------------------
        int[] original = {1, 2, 3};
        int[] sameArray = original;          // NOT a copy / BUKAN salinan
        sameArray[0] = 99;
        System.out.println(Arrays.toString(original));    // [99, 2, 3]  (surprise! / kaget!)

        int[] realCopy = new int[original.length];
        for (int i = 0; i < original.length; i++) {
            realCopy[i] = original[i];
        }
        realCopy[1] = 50;
        System.out.println(Arrays.toString(original));    // [99, 2, 3]   (unchanged / tidak berubah)
        System.out.println(Arrays.toString(realCopy));    // [99, 50, 3]


        // -------------------------------------------------------------------
        // 7. 2D arrays
        // EN: A 2D array is an array of arrays, like a table.
        //     table[row][column]
        //     table.length       = number of rows
        //     table[row].length  = number of columns in that row
        //     Use nested loops (Topic 05) to visit every cell.
        // ID: Array 2D adalah array berisi array, seperti tabel.
        //     tabel[baris][kolom]
        //     tabel.length        = jumlah baris
        //     tabel[baris].length = jumlah kolom di baris itu
        //     Pakai nested loop (Topik 05) untuk mengunjungi setiap sel.
        // -------------------------------------------------------------------
        // rows = students, columns = Algorithms, English, Calculus
        // baris = mahasiswa, kolom = Algorithms, English, Calculus
        int[][] scoreTable = {
            {80, 75, 90},
            {65, 70, 60}
        };
        System.out.println(scoreTable[0][2]);       // 90 (row 0, column 2 / baris 0, kolom 2)
        System.out.println(scoreTable.length);      // 2  (rows / baris)
        System.out.println(scoreTable[0].length);   // 3  (columns / kolom)

        int tableTotal = 0;
        for (int row = 0; row < scoreTable.length; row++) {
            for (int col = 0; col < scoreTable[row].length; col++) {
                System.out.print(scoreTable[row][col] + " ");
                tableTotal += scoreTable[row][col];
            }
            System.out.println();                   // next row / baris berikutnya
        }
        // 80 75 90
        // 65 70 60
        System.out.println("All cells: " + tableTotal);   // All cells: 440

        // System.out.println(Arrays.toString(scoreTable));
        //   -> prints [[I@..., [I@...] because each row is an array. Use nested loops.
        //      mencetak [[I@..., [I@...] karena tiap baris adalah array. Pakai nested loop.


        // -------------------------------------------------------------------
        // 8. ArrayList
        // EN: An ArrayList is like an array that can GROW and SHRINK.
        //     It's the closest thing to a Python list.
        //     The item type goes inside < >. The empty <> on the right means
        //     "same type as on the left".
        //       add(value)          add to the end
        //       add(index, value)   insert at a position
        //       get(index)          read an item       (NOT list[index])
        //       set(index, value)   replace an item
        //       remove(...)         remove by index or by value
        //       size()              number of items    (NOT .length)
        //       contains(value)     true / false
        //       isEmpty()           true if there are no items
        // ID: ArrayList mirip array tapi bisa BERTAMBAH dan BERKURANG.
        //     Paling mirip dengan list di Python.
        //     Tipe item ditulis di dalam < >. <> kosong di kanan artinya
        //     "tipenya sama dengan yang di kiri".
        //       add(nilai)          tambah di akhir
        //       add(indeks, nilai)  sisipkan di posisi tertentu
        //       get(indeks)         baca item          (BUKAN list[indeks])
        //       set(indeks, nilai)  ganti item
        //       remove(...)         hapus berdasarkan indeks atau nilai
        //       size()              jumlah item        (BUKAN .length)
        //       contains(nilai)     true / false
        //       isEmpty()           true kalau tidak ada item
        // -------------------------------------------------------------------
        ArrayList<String> todo = new ArrayList<>();
        System.out.println(todo.isEmpty());          // true

        todo.add("Algorithms homework");
        todo.add("Buy rice");
        todo.add("Gym");
        todo.add(1, "Read English notes");           // insert at index 1 / sisipkan di indeks 1
        System.out.println(todo);
        // [Algorithms homework, Read English notes, Buy rice, Gym]
        // EN: println works directly on an ArrayList (no Arrays.toString needed).
        // ID: println langsung bisa dipakai untuk ArrayList (tidak perlu Arrays.toString).

        System.out.println(todo.size());             // 4
        System.out.println(todo.get(0));             // Algorithms homework

        todo.set(3, "Gym (leg day)");                // replace index 3 / ganti indeks 3
        todo.remove("Buy rice");                     // remove by value / hapus berdasarkan nilai
        todo.remove(0);                              // remove by index / hapus berdasarkan indeks
        System.out.println(todo);                    // [Read English notes, Gym (leg day)]
        System.out.println(todo.contains("Buy rice"));   // false

        for (String task : todo) {
            System.out.println("- " + task);
        }
        // - Read English notes
        // - Gym (leg day)

        // todo[0]        -> ERROR: use todo.get(0) / pakai todo.get(0)
        // todo.length    -> ERROR: use todo.size() / pakai todo.size()
        // todo.get(5)    -> CRASH: IndexOutOfBoundsException (only 2 items / hanya 2 item)


        // -------------------------------------------------------------------
        // 9. Wrapper types: Integer, Double
        // EN: An ArrayList can only hold OBJECTS, not primitive types.
        //     So we use the "wrapper" class of each primitive:
        //       int -> Integer    double -> Double
        //       char -> Character boolean -> Boolean
        //     Java converts between int and Integer automatically.
        // ID: ArrayList hanya bisa menyimpan OBJEK, bukan tipe primitif.
        //     Jadi kita pakai class "wrapper" dari tiap tipe primitif:
        //       int -> Integer    double -> Double
        //       char -> Character boolean -> Boolean
        //     Java mengubah int <-> Integer secara otomatis.
        // -------------------------------------------------------------------
        // ArrayList<int> wrongList = new ArrayList<>();   -> ERROR: use Integer / pakai Integer
        ArrayList<Integer> dailySteps = new ArrayList<>();
        dailySteps.add(5200);
        dailySteps.add(8100);
        dailySteps.add(3900);

        int totalSteps = 0;
        for (int steps : dailySteps) {               // Integer -> int automatically / otomatis
            totalSteps += steps;
        }
        System.out.println("Total steps: " + totalSteps);   // Total steps: 17200

        // EN: Careful with remove() on ArrayList<Integer>:
        //     remove(1) removes INDEX 1, not the number 1.
        //     To remove a VALUE, wrap it: remove(Integer.valueOf(8100)).
        // ID: Hati-hati dengan remove() pada ArrayList<Integer>:
        //     remove(1) menghapus INDEKS 1, bukan angka 1.
        //     Untuk menghapus NILAI, bungkus dulu: remove(Integer.valueOf(8100)).
        dailySteps.remove(Integer.valueOf(8100));
        System.out.println(dailySteps);              // [5200, 3900]
        dailySteps.remove(0);
        System.out.println(dailySteps);              // [3900]

        ArrayList<Double> weightLog = new ArrayList<>();
        weightLog.add(55.5);
        weightLog.add(56.2);
        System.out.println(weightLog);               // [55.5, 56.2]


        // -------------------------------------------------------------------
        // 10. Array or ArrayList?
        // EN / ID:
        //   Array      int[] a = {1, 2};            fixed size, a.length, a[i]
        //                                            ukuran tetap, a.length, a[i]
        //                                            works with int, double, char directly
        //                                            bisa langsung pakai int, double, char
        //   ArrayList  ArrayList<Integer> list;      grows/shrinks, list.size(), list.get(i)
        //                                            bisa bertambah/berkurang, list.size(), list.get(i)
        //                                            needs wrapper types (Integer, Double)
        //                                            butuh tipe wrapper (Integer, Double)
        //
        //   Size known and fixed (7 days, 3 courses)  -> array
        //   Ukuran sudah pasti (7 hari, 3 matkul)     -> array
        //   Items come and go (shopping, to-do list)  -> ArrayList
        //   Item datang dan pergi (belanja, to-do)    -> ArrayList
        // -------------------------------------------------------------------
    }
}
