/*
 * Topic 11 - Mini Project: Student Grade Manager (UNSOLVED)
 * Topik 11 - Proyek Mini: Pengelola Nilai Mahasiswa (BELUM DIKERJAKAN)
 * =====================================================================
 * EN - What is this?
 *     The final project of the course. It combines Topic 01-10 into ONE
 *     menu-driven app for a class of students on the UNAIR grading scale.
 *     This file is a STARTER: the classes, method names and comments are
 *     ready, the bodies are not. Read README.md first.
 *
 * ID - Ini apa?
 *     Proyek akhir kursus. Semua materi Topik 01-10 digabung menjadi SATU
 *     aplikasi berbasis menu untuk satu kelas mahasiswa dengan skala nilai
 *     UNAIR. File ini adalah KERANGKA: class, nama method, dan komentarnya
 *     sudah siap, isinya belum. Baca README.md dulu.
 *
 * EN - How to use:
 *     1. Follow the build order in README.md and replace every part marked
 *        // TODO (and its "return <default>;") with your own code.
 *     2. Test your methods:  java GradeManagerUnsolved.java --check
 *        [TODO] = not started, [FAIL] = wrong answer, [PASS] = correct
 *     3. Start the app:      java GradeManagerUnsolved.java
 *
 * ID - Cara pakai:
 *     1. Ikuti urutan pengerjaan di README.md dan ganti setiap bagian yang
 *        bertanda // TODO (beserta "return <default>;"-nya) dengan kodemu.
 *     2. Uji method-mu:          java GradeManagerUnsolved.java --check
 *        [TODO] = belum dikerjakan, [FAIL] = jawaban salah, [PASS] = benar
 *     3. Jalankan aplikasinya:   java GradeManagerUnsolved.java
 *
 * Where is what? / Apa ada di mana?
 *     main()  ->  PART 1 Student class  ->  PART 2 grade methods  ->
 *     PART 3 input validation  ->  PART 4 whole-class methods  ->
 *     PART 5 the menu  ->  CHECKER (at the bottom, don't edit)
 *     EN: Everything is INSIDE the public class GradeManagerUnsolved, even
 *         the Student class (read the note above PART 1).
 *     ID: Semuanya ada DI DALAM public class GradeManagerUnsolved, termasuk
 *         class Student (baca catatan di atas PART 1).
 *
 * Rules / Aturan:
 *     - Only use Topic 01-10 material. There is no try/catch in this course,
 *       so check the text BEFORE calling Integer.parseInt().
 *       Hanya pakai materi Topik 01-10. Kursus ini tidak membahas try/catch,
 *       jadi cek teksnya SEBELUM memanggil Integer.parseInt().
 *     - Don't rename the classes, methods or parameters: the checker calls
 *       them. Keep the fields private. You MAY add your own extra methods.
 *       Jangan ganti nama class, method, atau parameter: checker memanggilnya.
 *       Field tetap private. Kamu BOLEH menambah method sendiri.
 *     - Don't edit the CHECKER part.
 *       Jangan ubah bagian CHECKER.
 *     - NO HARDCODING: every result must be calculated from the parameters.
 *       JANGAN HARDCODE: setiap hasil harus dihitung dari parameter.
 *     - Reuse your own methods (e.g. getGrade() uses scoreToGrade()).
 *       Pakai ulang method-mu sendiri (misal getGrade() memakai scoreToGrade()).
 *
 * Data / Data:
 *     EN: The Java course has no file topic, so the class lives in memory
 *         only. Every start begins with the same 5 sample students.
 *     ID: Kursus Java tidak membahas file, jadi data kelas hanya ada di
 *         memori. Setiap kali dijalankan, mulai lagi dengan 5 mahasiswa contoh.
 *
 * Self-check / Cek sendiri:
 *     EN: The checker only tests the methods, not the menu. Test the menu
 *         yourself: wrong input (letters, 150, an empty name) must NEVER
 *         crash it. If it crashes, read the line number in the error message.
 *     ID: Checker hanya menguji method, bukan menu. Uji menunya sendiri:
 *         input yang salah (huruf, 150, nama kosong) TIDAK BOLEH membuat
 *         program crash. Kalau crash, baca nomor baris di pesan error-nya.
 *
 * IMPORTANT / PENTING:
 *     EN: When you save your answers as GradeManagerSolved.java, rename the
 *         public class to GradeManagerSolved too. Easiest: in VS Code press
 *         Ctrl+H and replace ALL "GradeManagerUnsolved" with
 *         "GradeManagerSolved" (that also fixes the run hints the app prints).
 *     ID: Saat menyimpan jawaban sebagai GradeManagerSolved.java, ganti juga
 *         nama public class menjadi GradeManagerSolved. Paling gampang: di
 *         VS Code tekan Ctrl+H lalu ganti SEMUA "GradeManagerUnsolved" menjadi
 *         "GradeManagerSolved" (petunjuk cara menjalankan yang dicetak
 *         aplikasi juga ikut benar).
 */
import java.util.ArrayList;
import java.util.Scanner;

public class GradeManagerUnsolved {

    // -----------------------------------------------------------------------
    // SETTINGS / PENGATURAN
    // EN: The courses of this class. Don't change them while you build the
    //     app (the checker uses them). COURSE_CREDITS[i] belongs to
    //     COURSE_NAMES[i].
    // ID: Daftar mata kuliah kelas ini. Jangan diubah selama mengerjakan
    //     (checker memakainya). COURSE_CREDITS[i] pasangannya COURSE_NAMES[i].
    // -----------------------------------------------------------------------
    static final String[] COURSE_NAMES = {"Algorithms", "Discrete Mathematics", "English", "Pancasila"};
    static final int[] COURSE_CREDITS = {3, 3, 2, 2};

    public static void main(String[] args) {
        // EN: args holds the extra words typed after the file name.
        //     "java GradeManagerUnsolved.java --check" -> args[0] is "--check".
        //     Without --check, args is empty (args.length is 0).
        // ID: args berisi kata-kata tambahan yang diketik setelah nama file.
        //     "java GradeManagerUnsolved.java --check" -> args[0] berisi "--check".
        //     Tanpa --check, args kosong (args.length bernilai 0).
        if (args.length > 0 && args[0].equals("--check")) {
            runChecker();
        } else if (!appIsReady()) {
            System.out.println("The app is not implemented yet.");
            System.out.println("Finish Part 1 (Student class) and Part 2 (grade methods) first.");
            System.out.println("See what is missing with: java GradeManagerUnsolved.java --check");
        } else {
            ArrayList<Student> students = sampleStudents();
            System.out.println("Loaded " + students.size() + " sample students (kept in memory only).");
            runMenu(students);
        }
    }


    // =======================================================================
    // PART 1 - The Student class (build step 1 and 2)
    // EN: One Student object = one student: a name and an array of scores.
    //     scores[0] belongs to COURSE_NAMES[0], scores[1] to COURSE_NAMES[1], ...
    //     Step 1: the constructor, getName() and getScore().
    //     Step 2: the other methods. They REUSE the Part 2 methods below
    //     (average, scoreToGrade, ...): just call them by their name.
    // ID: Satu object Student = satu mahasiswa: sebuah nama dan array nilai.
    //     scores[0] milik COURSE_NAMES[0], scores[1] milik COURSE_NAMES[1], dst.
    //     Langkah 1: constructor, getName(), dan getScore().
    //     Langkah 2: method lainnya. Method ini MEMAKAI method Part 2 di bawah
    //     (average, scoreToGrade, ...): cukup panggil dengan namanya.
    //
    // Why "static class" INSIDE GradeManagerUnsolved?
    // Kenapa "static class" DI DALAM GradeManagerUnsolved?
    // EN: In this course every class lives inside the main class as
    //     `static class ...`, so each file is self-contained. Your
    //     GradeManagerUnsolved.java and GradeManagerSolved.java can sit in the
    //     same folder without VS Code complaining "The type Student is already
    //     defined". In real projects each class gets its own file and
    //     `static` isn't needed.
    // ID: Di kursus ini setiap class ditulis di dalam class utama sebagai
    //     `static class ...`, jadi setiap file berdiri sendiri. File
    //     GradeManagerUnsolved.java dan GradeManagerSolved.java bisa ada di
    //     folder yang sama tanpa VS Code protes "The type Student is already
    //     defined". Di proyek sungguhan setiap class punya file sendiri dan
    //     `static` tidak diperlukan.
    // EN: Note: because Student is inside this class, Java technically lets
    //     the rest of this file read a private field like student.name
    //     directly. Don't do that: always use the getters (getName(), getScore()).
    // ID: Catatan: karena Student ada di dalam class ini, secara teknis Java
    //     membolehkan bagian lain file ini membaca field private seperti
    //     student.name secara langsung. Jangan lakukan itu: selalu pakai
    //     getter-nya (getName(), getScore()).
    // =======================================================================
    static class Student {
        private String name;
        private int[] scores;

        // Check 1: Save both parameters into the fields (use this.).
        // ID: Simpan kedua parameter ke dalam field (pakai this.).
        public Student(String name, int[] scores) {
            // TODO
        }

        // Check 1: Return the name.
        // ID: Kembalikan namanya.
        public String getName() {
            // TODO
            return "";
        }

        // Check 1: Return the score at this index (0 = Algorithms, 1 = Discrete Mathematics, ...).
        // ID: Kembalikan nilai pada indeks ini (0 = Algorithms, 1 = Discrete Mathematics, ...).
        public int getScore(int index) {
            // TODO
            return 0;
        }

        // Check 2: Return the average of the scores.
        // EN: Reuse average() from Part 2.
        // ID: Kembalikan rata-rata nilainya. Pakai ulang average() dari Part 2.
        // new Student("Ani Wijaya", new int[] {88, 92, 85, 90}).getAverage() -> 88.75
        public double getAverage() {
            // TODO
            return 0.0;
        }

        // Check 3: Return the letter grade of the AVERAGE score.
        // EN: Reuse getAverage() and scoreToGrade().
        // ID: Kembalikan huruf grade dari RATA-RATA nilai.
        //     Pakai ulang getAverage() dan scoreToGrade().
        // new Student("Citra Lestari", new int[] {95, 58, 90, 88}).getGrade() -> "AB"
        public String getGrade() {
            // TODO
            return "";
        }

        // Check 4: Return the GPA (IPK) weighted by credits (SKS).
        // EN: Reuse weightedGpa() with COURSE_CREDITS.
        // ID: Kembalikan IPK berbobot SKS. Pakai ulang weightedGpa() dengan
        //     COURSE_CREDITS.
        // new Student("Citra Lestari", new int[] {95, 58, 90, 88}).getGpa() -> 3.1
        public double getGpa() {
            // TODO
            return 0.0;
        }

        // Check 5: Return true if the grade of the average is C or better.
        // EN: Reuse getGrade() and isPassing().
        // ID: Kembalikan true jika grade dari rata-ratanya C atau lebih baik.
        //     Pakai ulang getGrade() dan isPassing().
        // new Student("Dimas Pratama", new int[] {45, 52, 60, 70}).hasPassed() -> false
        public boolean hasPassed() {
            // TODO
            return false;
        }

        // Check 6: A short description, used by println(student) and "text" + student.
        // EN: The average always has 2 decimals. Hint: String.format("%.2f", ...)
        // ID: Deskripsi singkat, dipakai oleh println(student) dan "teks" + student.
        //     Rata-ratanya selalu 2 angka desimal. Petunjuk: String.format("%.2f", ...)
        // new Student("Eka Putri", new int[] {80, 77, 68, 85}).toString()
        //     -> "Eka Putri (average 77.50, grade B)"
        @Override
        public String toString() {
            // TODO
            return "";
        }

        // Check 7: Return one row of the student table (menu 2).
        // EN: Use String.format with these widths, in this order:
        //         number    right, width 3                 %3d
        //         2 spaces
        //         name      left, width 26                 %-26s
        //         average   right, width 7, 2 decimals     %7.2f
        //         2 spaces
        //         grade     left, width 5                  %-5s
        //         GPA       right, width 5, 2 decimals     %5.2f
        //         2 spaces
        //         "PASS" or "FAIL"
        // ID: Kembalikan satu baris tabel mahasiswa (menu 2). Pakai String.format
        //     dengan lebar dan urutan seperti di atas.
        //     (right = rata kanan, left = rata kiri, width = lebar)
        // new Student("Ani Wijaya", new int[] {88, 92, 85, 90}).toRow(1)
        //     -> "  1  Ani Wijaya                  88.75  A     4.00  PASS"
        public String toRow(int number) {
            // TODO
            return "";
        }
    }


    // -----------------------------------------------------------------------
    // PART 2 - Grade methods (build step 2)
    // EN: Small static methods: they get values and RETURN a result.
    //     No println, no Scanner. That's why the checker can test them.
    // ID: Method static kecil: menerima nilai lalu MENGEMBALIKAN hasil.
    //     Tanpa println dan Scanner. Karena itu checker bisa mengujinya.
    // -----------------------------------------------------------------------

    // Check 8: Convert a score (0-100, may have decimals) to a UNAIR letter grade.
    // ID: Ubah nilai (0-100, boleh desimal) menjadi huruf grade UNAIR.
    //     85 and above -> "A"        70 - 74 -> "BC"
    //     80 - 84      -> "AB"       65 - 69 -> "C"
    //     75 - 79      -> "B"        50 - 64 -> "D"
    //                                below 50 -> "E"
    // EN: Compare with >= so decimals work too: 84.75 is "AB", not "A".
    // ID: Bandingkan dengan >= supaya desimal juga benar: 84.75 itu "AB", bukan "A".
    // scoreToGrade(84.75) -> "AB"
    public static String scoreToGrade(double score) {
        // TODO
        return "";
    }

    // Check 9: Return the grade points (bobot) of a letter grade.
    // ID: Kembalikan bobot nilai dari sebuah huruf grade.
    //     A=4.0, AB=3.5, B=3.0, BC=2.5, C=2.0, D=1.0, E=0.0, unknown -> 0.0
    // EN: Hint: a switch on the String is perfect here.
    // ID: Petunjuk: switch pada String cocok di sini.
    // gradePoints("AB") -> 3.5
    public static double gradePoints(String grade) {
        // TODO
        return 0.0;
    }

    // Check 10: Return true if the grade is C or better (A, AB, B, BC, C).
    // ID: Kembalikan true jika grade-nya C atau lebih baik (A, AB, B, BC, C).
    // isPassing("C") -> true, isPassing("D") -> false
    public static boolean isPassing(String grade) {
        // TODO
        return false;
    }

    // Check 11: Return the average of the scores, rounded to 2 decimals.
    // EN: Empty array -> 0.0. Round with Math.round(x * 100) / 100.0
    // ID: Kembalikan rata-rata nilai, dibulatkan 2 angka desimal.
    //     Array kosong -> 0.0. Bulatkan dengan Math.round(x * 100) / 100.0
    // average(new int[] {88, 92, 85, 90}) -> 88.75
    // average(new int[] {80, 85, 91})     -> 85.33
    public static double average(int[] scores) {
        // TODO
        return 0.0;
    }

    // Check 12: Return the GPA weighted by credits, rounded to 2 decimals.
    // EN: scores[i] belongs to credits[i]. Steps:
    //     1. for each course: score -> grade (scoreToGrade) -> points (gradePoints)
    //     2. GPA = sum of (points * credits) / sum of credits
    //     If the total credits is 0, return 0.0.
    // ID: Kembalikan IPK berbobot SKS, dibulatkan 2 angka desimal.
    //     scores[i] pasangannya credits[i]. Langkah:
    //     1. untuk setiap mata kuliah: nilai -> grade (scoreToGrade) -> bobot (gradePoints)
    //     2. IPK = jumlah (bobot * SKS) / jumlah SKS
    //     Jika total SKS-nya 0, kembalikan 0.0.
    // weightedGpa(new int[] {95, 58, 90, 88}, new int[] {3, 3, 2, 2}) -> 3.1
    //     (A*3 + D*3 + A*2 + A*2 = 12 + 3 + 8 + 8 = 31, 31 / 10 = 3.1)
    public static double weightedGpa(int[] scores, int[] credits) {
        // TODO
        return 0.0;
    }


    // -----------------------------------------------------------------------
    // PART 3 - Input validation (build step 4)
    // EN: These methods check text typed by the user. Invalid text gives a
    //     special "wrong" result (-1 or ""), so the menu can print an error
    //     and ask again. Java needs try/catch to survive a bad parseInt, and
    //     that's not in this course, so CHECK THE TEXT FIRST.
    // ID: Method-method ini mengecek teks yang diketik pengguna. Teks yang
    //     tidak valid menghasilkan nilai "salah" khusus (-1 atau ""), jadi menu
    //     bisa mencetak error lalu bertanya lagi. Java butuh try/catch supaya
    //     parseInt yang gagal tidak crash, dan itu tidak ada di kursus ini,
    //     jadi CEK TEKSNYA DULU.
    // -----------------------------------------------------------------------

    // Check 13: Turn the typed text into a score from 0 to 100, or -1 if invalid.
    // EN: Remove the spaces around it (trim). Then it is valid only if it is
    //     not empty, has at most 3 characters, every char is between '0' and
    //     '9', and the number is at most 100. Only then call Integer.parseInt.
    // ID: Buang spasi di sekitarnya (trim). Teksnya valid hanya kalau tidak
    //     kosong, paling banyak 3 karakter, setiap karakternya antara '0' dan
    //     '9', dan angkanya paling besar 100. Baru setelah itu Integer.parseInt.
    // validateScore(" 90 ") -> 90     validateScore("abc") -> -1
    // validateScore("150")  -> -1     validateScore("-5")  -> -1
    public static int validateScore(String text) {
        // TODO
        return 0;
    }

    // Check 14: Clean the typed name, or return "" if it is invalid.
    // EN: - trim() the spaces at the start and end.
    //     - Invalid: empty, longer than 25 characters, or contains a digit.
    //     - Valid: return it with each word capitalized ("dewi lestari" ->
    //       "Dewi Lestari"). Hint: split(" "), skip empty words,
    //       substring(0, 1).toUpperCase() + substring(1).toLowerCase().
    // ID: - trim() spasi di awal dan akhir.
    //     - Tidak valid: kosong, lebih dari 25 karakter, atau ada angkanya.
    //     - Valid: kembalikan dengan huruf pertama setiap kata kapital.
    //       Petunjuk: split(" "), lewati kata kosong,
    //       substring(0, 1).toUpperCase() + substring(1).toLowerCase().
    // validateName("  dewi lestari ") -> "Dewi Lestari"
    // validateName("Budi 2")          -> ""
    public static String validateName(String text) {
        // TODO
        return "";
    }


    // -----------------------------------------------------------------------
    // PART 4 - Working with the whole class (build step 5)
    // EN: `students` is an ArrayList of Student objects.
    // ID: `students` adalah ArrayList berisi object Student.
    // -----------------------------------------------------------------------

    // Check 15: Return the Student whose name matches, or null if not found.
    // EN: Ignore upper/lower case and the spaces around the typed name:
    //     "  ANI wijaya " finds "Ani Wijaya". (equalsIgnoreCase, trim)
    // ID: Kembalikan Student yang namanya cocok, atau null kalau tidak ada.
    //     Abaikan huruf besar/kecil dan spasi di sekitar nama:
    //     "  ANI wijaya " menemukan "Ani Wijaya". (equalsIgnoreCase, trim)
    public static Student findStudent(ArrayList<Student> students, String name) {
        // TODO
        return null;
    }

    // Check 16: Return the Student with the HIGHEST average.
    // EN: Empty list -> null. If two students have the same average,
    //     return the one that comes first in the list.
    // ID: Kembalikan Student dengan rata-rata TERTINGGI. List kosong -> null.
    //     Kalau dua mahasiswa rata-ratanya sama, kembalikan yang lebih dulu.
    public static Student bestStudent(ArrayList<Student> students) {
        // TODO
        return null;
    }

    // Check 17: Return the Student with the LOWEST average (same rules).
    // ID: Kembalikan Student dengan rata-rata TERENDAH (aturannya sama).
    public static Student worstStudent(ArrayList<Student> students) {
        // TODO
        return null;
    }

    // Check 18: Return the average of all the students' averages, 2 decimals.
    // EN: Empty list -> 0.0. Round with Math.round(x * 100) / 100.0
    // ID: Kembalikan rata-rata dari rata-rata semua mahasiswa, 2 angka desimal.
    //     List kosong -> 0.0. Bulatkan dengan Math.round(x * 100) / 100.0
    public static double classAverage(ArrayList<Student> students) {
        // TODO
        return 0.0;
    }

    // Check 19: Return how many students have passed (hasPassed() is true).
    // ID: Kembalikan jumlah mahasiswa yang lulus (hasPassed() bernilai true).
    public static int countPassing(ArrayList<Student> students) {
        // TODO
        return 0;
    }


    // -----------------------------------------------------------------------
    // PART 5 - The menu (build step 3 to 5)
    // EN: Not tested by --check. Run the app and compare it with the
    //     "Sample run" in README.md.
    // ID: Tidak diuji oleh --check. Jalankan aplikasinya dan bandingkan
    //     dengan "Sample run" di README.md.
    // -----------------------------------------------------------------------
    public static void runMenu(ArrayList<Student> students) {
        // TODO 1 (step 3) - The loop / Perulangannya
        //   EN: Make ONE Scanner. Repeat until the user chooses 0: print the
        //       menu below, ask "Choose (0-5): " and read the answer with
        //       nextLine().trim(). Use a switch on the TEXT ("1", "2", ...),
        //       so you don't need parseInt and "abc" can't crash anything.
        //       Tip: boolean running = true; while (running) { ... }
        //   ID: Buat SATU Scanner. Ulangi sampai pengguna memilih 0: cetak
        //       menu di bawah, tanya "Choose (0-5): " lalu baca jawabannya
        //       dengan nextLine().trim(). Pakai switch pada TEKS ("1", "2", ...),
        //       jadi tidak perlu parseInt dan "abc" tidak bisa membuat crash.
        //       Tips: boolean running = true; while (running) { ... }
        //
        //       ===== Student Grade Manager =====
        //       1. Add a student
        //       2. List all students
        //       3. Search a student
        //       4. Class statistics
        //       5. Delete a student
        //       0. Exit
        //
        // TODO 2 (step 3) - "0" and unknown choices / "0" dan pilihan tak dikenal
        //   EN: "0" prints "Goodbye!" and stops the loop. Anything else
        //       (default) prints "Unknown choice. Please type a number from 0 to 5."
        //   ID: "0" mencetak "Goodbye!" lalu menghentikan loop. Selain itu
        //       (default) cetak "Unknown choice. Please type a number from 0 to 5."
        //
        // TODO 3 (step 4) - "1" Add a student / Tambah mahasiswa
        //   EN: Ask "Name: " until validateName() gives a non-empty result and
        //       the name is not in the class yet (findStudent). Then ask each
        //       score, e.g. "Score for Algorithms (3 credits): ", until
        //       validateScore() is not -1. Print an "Error: ... Try again."
        //       line for every wrong input. Then add a new Student to the list.
        //   ID: Tanya "Name: " sampai validateName() memberi hasil yang tidak
        //       kosong dan namanya belum ada di kelas (findStudent). Lalu tanya
        //       setiap nilai sampai validateScore() bukan -1. Cetak baris
        //       "Error: ... Try again." untuk setiap input yang salah. Lalu
        //       tambahkan Student baru ke list.
        //
        // TODO 4 (step 4) - "2" List all students / Tampilkan semua mahasiswa
        //   EN: Print a header with the same widths as toRow(), then one
        //       toRow() per student (numbered from 1). Empty class -> print
        //       "No students yet. Choose 1 to add one."
        //   ID: Cetak header dengan lebar yang sama seperti toRow(), lalu satu
        //       toRow() per mahasiswa (nomor mulai dari 1). Kelas kosong ->
        //       cetak "No students yet. Choose 1 to add one."
        //
        // TODO 5 (step 5) - "3" Search / Cari
        //   EN: Ask a name, use findStudent(). Found -> print every course with
        //       credits, score and grade, then average, grade, GPA and status.
        //       Not found -> "No student named <name>."
        //   ID: Tanya nama, pakai findStudent(). Ketemu -> cetak setiap mata
        //       kuliah dengan SKS, nilai, dan grade-nya, lalu rata-rata, grade,
        //       IPK, dan status. Tidak ketemu -> "No student named <name>."
        //
        // TODO 6 (step 5) - "4" Class statistics / Statistik kelas
        //   EN: Number of students, bestStudent(), worstStudent(),
        //       classAverage(), countPassing(). Empty class -> friendly message.
        //   ID: Jumlah mahasiswa, bestStudent(), worstStudent(),
        //       classAverage(), countPassing(). Kelas kosong -> pesan yang ramah.
        //
        // TODO 7 (step 5) - "5" Delete / Hapus
        //   EN: Find the student, ask "Delete <student>? (y/n): " and remove
        //       it from the list only if the answer is "y".
        //   ID: Cari mahasiswanya, tanya "Delete <student>? (y/n): " lalu hapus
        //       dari list hanya kalau jawabannya "y".
        //
        // Tip: write one small static method per menu branch, e.g.
        //      static void menuAdd(ArrayList<Student> students, Scanner scanner)
        // Tips: buat satu method static kecil per cabang menu, misalnya
        //      static void menuAdd(ArrayList<Student> students, Scanner scanner)

        // EN: Delete the two lines below when you start writing the menu.
        // ID: Hapus dua baris di bawah ini saat kamu mulai menulis menu.
        System.out.println("runMenu() is not implemented yet (build step 3).");
        System.out.println("Meanwhile, test your methods: java GradeManagerUnsolved.java --check");
    }

    // EN: The 5 students the app starts with. Already done for you.
    // ID: 5 mahasiswa yang dimuat saat aplikasi mulai. Sudah jadi.
    public static ArrayList<Student> sampleStudents() {
        ArrayList<Student> students = new ArrayList<>();
        students.add(new Student("Ani Wijaya", new int[] {88, 92, 85, 90}));
        students.add(new Student("Budi Santoso", new int[] {72, 65, 80, 78}));
        students.add(new Student("Citra Lestari", new int[] {95, 58, 90, 88}));
        students.add(new Student("Dimas Pratama", new int[] {45, 52, 60, 70}));
        students.add(new Student("Eka Putri", new int[] {80, 77, 68, 85}));
        return students;
    }


    // =======================================================================
    // CHECKER - do not edit below this line / jangan ubah bagian di bawah ini
    // =======================================================================

    // EN: true when Part 1 and Part 2 give real answers, so the menu can use them.
    // ID: true kalau Part 1 dan Part 2 sudah memberi jawaban asli.
    static boolean appIsReady() {
        Student test = new Student("Test", new int[] {80, 80, 80, 80});
        return !isMissing(test.getName()) && !isMissing(test.getGrade())
                && !isMissing(test.toString()) && !isMissing(test.toRow(1))
                && test.getAverage() > 0 && test.getGpa() > 0 && test.hasPassed()
                && !isMissing(scoreToGrade(80)) && gradePoints("A") > 0 && isPassing("A")
                && average(new int[] {80}) > 0 && weightedGpa(new int[] {80}, new int[] {3}) > 0;
    }

    static boolean isMissing(String text) {
        return text == null || text.isEmpty();
    }

    static void runChecker() {
        Student ani = new Student("Ani Wijaya", new int[] {88, 92, 85, 90});
        Student budi = new Student("Budi Santoso", new int[] {72, 65, 80, 78});
        Student citra = new Student("Citra Lestari", new int[] {95, 58, 90, 88});
        Student dimas = new Student("Dimas Pratama", new int[] {45, 52, 60, 70});
        Student eka = new Student("Eka Putri", new int[] {80, 77, 68, 85});
        Student fajar = new Student("Fajar Nugroho", new int[] {78, 72, 80, 65});

        ArrayList<Student> threeStudents = listOf(new Student[] {budi, ani, dimas});
        ArrayList<Student> threeStudents2 = listOf(new Student[] {budi, dimas, ani});
        ArrayList<Student> budiFajar = listOf(new Student[] {budi, fajar});
        ArrayList<Student> fajarBudi = listOf(new Student[] {fajar, budi});
        ArrayList<Student> aniCitra = listOf(new Student[] {ani, citra});
        ArrayList<Student> onlyDimas = listOf(new Student[] {dimas});
        ArrayList<Student> empty = new ArrayList<>();

        System.out.println("============================================================");
        System.out.println("  Mini Project - Student Grade Manager - checker");
        System.out.println("============================================================");
        System.out.println("Test students (methods that return a Student show its name):");
        System.out.println("  ani   = Ani Wijaya     {88, 92, 85, 90}");
        System.out.println("  budi  = Budi Santoso   {72, 65, 80, 78}");
        System.out.println("  citra = Citra Lestari  {95, 58, 90, 88}");
        System.out.println("  dimas = Dimas Pratama  {45, 52, 60, 70}");
        System.out.println("  eka   = Eka Putri      {80, 77, 68, 85}");
        System.out.println("  fajar = Fajar Nugroho  {78, 72, 80, 65}");
        System.out.println("------------------------------------------------------------");

        int score = 0;
        score += check(1, "Student constructor + getName + getScore", new String[][] {
            { "ani.getName()", "" + ani.getName(), "Ani Wijaya" },
            { "ani.getScore(0)", "" + ani.getScore(0), "88" },
            { "ani.getScore(3)", "" + ani.getScore(3), "90" },
            { "dimas.getName()", "" + dimas.getName(), "Dimas Pratama" },
            { "dimas.getScore(1)", "" + dimas.getScore(1), "52" },
        });
        score += check(2, "Student.getAverage", new String[][] {
            { "ani.getAverage()", "" + ani.getAverage(), "88.75" },
            { "dimas.getAverage()", "" + dimas.getAverage(), "56.75" },
            { "eka.getAverage()", "" + eka.getAverage(), "77.5" },
        });
        score += check(3, "Student.getGrade", new String[][] {
            { "ani.getGrade()", "" + ani.getGrade(), "A" },
            { "citra.getGrade()", "" + citra.getGrade(), "AB" },
            { "dimas.getGrade()", "" + dimas.getGrade(), "D" },
        });
        score += check(4, "Student.getGpa", new String[][] {
            { "citra.getGpa()", "" + citra.getGpa(), "3.1" },
            { "budi.getGpa()", "" + budi.getGpa(), "2.65" },
            { "ani.getGpa()", "" + ani.getGpa(), "4.0" },
        });
        score += check(5, "Student.hasPassed", new String[][] {
            { "ani.hasPassed()", "" + ani.hasPassed(), "true" },
            { "dimas.hasPassed()", "" + dimas.hasPassed(), "false" },
            { "budi.hasPassed()", "" + budi.hasPassed(), "true" },
        });
        score += check(6, "Student.toString", new String[][] {
            { "eka.toString()", "" + eka.toString(), "Eka Putri (average 77.50, grade B)" },
            { "citra.toString()", "" + citra.toString(), "Citra Lestari (average 82.75, grade AB)" },
        });
        score += check(7, "Student.toRow", new String[][] {
            { "ani.toRow(1)", "" + ani.toRow(1), "  1  Ani Wijaya                  88.75  A     4.00  PASS" },
            { "dimas.toRow(12)", "" + dimas.toRow(12), " 12  Dimas Pratama               56.75  D     1.00  FAIL" },
        });
        score += check(8, "scoreToGrade", new String[][] {
            { "scoreToGrade(100)", "" + scoreToGrade(100), "A" },
            { "scoreToGrade(85)", "" + scoreToGrade(85), "A" },
            { "scoreToGrade(84.75)", "" + scoreToGrade(84.75), "AB" },
            { "scoreToGrade(80)", "" + scoreToGrade(80), "AB" },
            { "scoreToGrade(79)", "" + scoreToGrade(79), "B" },
            { "scoreToGrade(70)", "" + scoreToGrade(70), "BC" },
            { "scoreToGrade(65)", "" + scoreToGrade(65), "C" },
            { "scoreToGrade(64.5)", "" + scoreToGrade(64.5), "D" },
            { "scoreToGrade(50)", "" + scoreToGrade(50), "D" },
            { "scoreToGrade(49)", "" + scoreToGrade(49), "E" },
            { "scoreToGrade(0)", "" + scoreToGrade(0), "E" },
        });
        score += check(9, "gradePoints", new String[][] {
            { "gradePoints(\"A\")", "" + gradePoints("A"), "4.0" },
            { "gradePoints(\"AB\")", "" + gradePoints("AB"), "3.5" },
            { "gradePoints(\"BC\")", "" + gradePoints("BC"), "2.5" },
            { "gradePoints(\"D\")", "" + gradePoints("D"), "1.0" },
            { "gradePoints(\"E\")", "" + gradePoints("E"), "0.0" },
            { "gradePoints(\"X\")", "" + gradePoints("X"), "0.0" },
        });
        score += check(10, "isPassing", new String[][] {
            { "isPassing(\"A\")", "" + isPassing("A"), "true" },
            { "isPassing(\"C\")", "" + isPassing("C"), "true" },
            { "isPassing(\"BC\")", "" + isPassing("BC"), "true" },
            { "isPassing(\"D\")", "" + isPassing("D"), "false" },
            { "isPassing(\"E\")", "" + isPassing("E"), "false" },
        });
        score += check(11, "average", new String[][] {
            { "average({88, 92, 85, 90})", "" + average(new int[] {88, 92, 85, 90}), "88.75" },
            { "average({80, 85, 91})", "" + average(new int[] {80, 85, 91}), "85.33" },
            { "average({100})", "" + average(new int[] {100}), "100.0" },
            { "average({})", "" + average(new int[] {}), "0.0" },
        });
        score += check(12, "weightedGpa", new String[][] {
            { "weightedGpa({95, 58, 90, 88}, {3, 3, 2, 2})",
                "" + weightedGpa(new int[] {95, 58, 90, 88}, new int[] {3, 3, 2, 2}), "3.1" },
            { "weightedGpa({72, 65, 80, 78}, {3, 3, 2, 2})",
                "" + weightedGpa(new int[] {72, 65, 80, 78}, new int[] {3, 3, 2, 2}), "2.65" },
            { "weightedGpa({90}, {4})", "" + weightedGpa(new int[] {90}, new int[] {4}), "4.0" },
            { "weightedGpa({}, {})", "" + weightedGpa(new int[] {}, new int[] {}), "0.0" },
        });
        score += check(13, "validateScore", new String[][] {
            { "validateScore(\"85\")", "" + validateScore("85"), "85" },
            { "validateScore(\" 90 \")", "" + validateScore(" 90 "), "90" },
            { "validateScore(\"0\")", "" + validateScore("0"), "0" },
            { "validateScore(\"100\")", "" + validateScore("100"), "100" },
            { "validateScore(\"abc\")", "" + validateScore("abc"), "-1" },
            { "validateScore(\"85.5\")", "" + validateScore("85.5"), "-1" },
            { "validateScore(\"\")", "" + validateScore(""), "-1" },
            { "validateScore(\"150\")", "" + validateScore("150"), "-1" },
            { "validateScore(\"-5\")", "" + validateScore("-5"), "-1" },
            { "validateScore(\"99999999999\")", "" + validateScore("99999999999"), "-1" },
        });
        score += check(14, "validateName", new String[][] {
            { "validateName(\"  dewi lestari \")", "" + validateName("  dewi lestari "), "Dewi Lestari" },
            { "validateName(\"ANI   wijaya\")", "" + validateName("ANI   wijaya"), "Ani Wijaya" },
            { "validateName(\"\")", "" + validateName(""), "" },
            { "validateName(\"   \")", "" + validateName("   "), "" },
            { "validateName(\"Budi 2\")", "" + validateName("Budi 2"), "" },
            { "validateName(\"Abcdefghijklmnopqrstuvwxyz\")", "" + validateName("Abcdefghijklmnopqrstuvwxyz"), "" },
        });
        score += check(15, "findStudent", new String[][] {
            { "findStudent([budi, ani, dimas], \"Budi Santoso\")",
                nameOf(findStudent(threeStudents, "Budi Santoso")), "Budi Santoso" },
            { "findStudent([budi, ani, dimas], \"ani wijaya\")",
                nameOf(findStudent(threeStudents, "ani wijaya")), "Ani Wijaya" },
            { "findStudent([budi, ani, dimas], \"  DIMAS PRATAMA \")",
                nameOf(findStudent(threeStudents, "  DIMAS PRATAMA ")), "Dimas Pratama" },
            { "findStudent([budi, ani, dimas], \"Citra Lestari\")",
                nameOf(findStudent(threeStudents, "Citra Lestari")), "null" },
        });
        score += check(16, "bestStudent", new String[][] {
            { "bestStudent([budi, ani, dimas])", nameOf(bestStudent(threeStudents)), "Ani Wijaya" },
            { "bestStudent([budi, fajar])  (same average)", nameOf(bestStudent(budiFajar)), "Budi Santoso" },
            { "bestStudent([fajar, budi])  (same average)", nameOf(bestStudent(fajarBudi)), "Fajar Nugroho" },
            { "bestStudent([])", nameOf(bestStudent(empty)), "null" },
        });
        score += check(17, "worstStudent", new String[][] {
            { "worstStudent([budi, dimas, ani])", nameOf(worstStudent(threeStudents2)), "Dimas Pratama" },
            { "worstStudent([fajar, budi])  (same average)", nameOf(worstStudent(fajarBudi)), "Fajar Nugroho" },
            { "worstStudent([])", nameOf(worstStudent(empty)), "null" },
        });
        score += check(18, "classAverage", new String[][] {
            { "classAverage([budi, ani, dimas])", "" + classAverage(threeStudents), "73.08" },
            { "classAverage([ani, citra])", "" + classAverage(aniCitra), "85.75" },
            { "classAverage([])", "" + classAverage(empty), "0.0" },
        });
        score += check(19, "countPassing", new String[][] {
            { "countPassing([budi, ani, dimas])", "" + countPassing(threeStudents), "2" },
            { "countPassing([dimas])", "" + countPassing(onlyDimas), "0" },
            { "countPassing([])", "" + countPassing(empty), "0" },
        });

        System.out.println("============================================================");
        System.out.println("  Score: " + score + " / 19");
        if (score == 19) {
            System.out.println("  All checks passed. Now run the app without --check!");
        }
        System.out.println("============================================================");
    }

    // EN: Compares every row: { call, got, expected }.
    //     If ALL results still look like an empty stub (0, 0.0, false, null, "")
    //     the check is [TODO]. Otherwise every row must match for [PASS].
    // ID: Membandingkan setiap baris: { panggilan, hasil, harapan }.
    //     Kalau SEMUA hasil masih seperti stub kosong (0, 0.0, false, null, "")
    //     check-nya [TODO]. Selain itu semua baris harus cocok supaya [PASS].
    static int check(int number, String title, String[][] cases) {
        boolean untouched = true;
        for (String[] row : cases) {
            if (!isStubValue(row[1])) {
                untouched = false;
            }
        }
        if (untouched) {
            System.out.printf("[TODO] %2d. %s%n", number, title);
            return 0;
        }
        for (String[] row : cases) {
            String got = dotDecimal(row[1]);
            if (!got.equals(row[2])) {
                System.out.printf("[FAIL] %2d. %s%n", number, title);
                System.out.println("         " + row[0]);
                System.out.println("         expected: " + row[2]);
                System.out.println("         got:      " + got);
                return 0;
            }
        }
        System.out.printf("[PASS] %2d. %s%n", number, title);
        return 1;
    }

    static boolean isStubValue(String value) {
        return value.equals("") || value.equals("null") || value.equals("0")
                || value.equals("0.0") || value.equals("false");
    }

    // EN: Laptops with Indonesian settings print 88,75 instead of 88.75.
    //     This turns a comma BETWEEN two digits into a dot, so both pass.
    // ID: Laptop dengan pengaturan Indonesia mencetak 88,75, bukan 88.75.
    //     Ini mengubah koma yang ada DI ANTARA dua angka menjadi titik.
    static String dotDecimal(String text) {
        char[] chars = text.toCharArray();
        StringBuilder result = new StringBuilder();
        for (int i = 0; i < chars.length; i++) {
            boolean digitBefore = i > 0 && chars[i - 1] >= '0' && chars[i - 1] <= '9';
            boolean digitAfter = i < chars.length - 1 && chars[i + 1] >= '0' && chars[i + 1] <= '9';
            if (chars[i] == ',' && digitBefore && digitAfter) {
                result.append('.');
            } else {
                result.append(chars[i]);
            }
        }
        return result.toString();
    }

    static String nameOf(Student student) {
        if (student == null) {
            return "null";
        }
        return "" + student.getName();
    }

    static ArrayList<Student> listOf(Student[] items) {
        ArrayList<Student> list = new ArrayList<>();
        for (Student item : items) {
            list.add(item);
        }
        return list;
    }
}
