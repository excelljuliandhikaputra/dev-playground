# Topic 11 — Mini Project: Student Grade Manager / Topik 11 — Proyek Mini: Pengelola Nilai Mahasiswa

EN: The final project: one menu-driven app that uses everything from Topic 01-10.
ID: Proyek akhir: satu aplikasi berbasis menu yang memakai semua materi Topik 01-10.

## Goal / Tujuan

EN: Build a **Student Grade Manager** for one class. The app starts with 5 sample students.
The user can add students with a score for every course, see everyone in a neat table with
their average, letter grade and GPA, search, delete, and see class statistics. Wrong input
must never crash the app. The Java course has no file topic, so the data lives in memory
only: every start begins with the same 5 sample students again.

ID: Buat **Pengelola Nilai Mahasiswa** untuk satu kelas. Aplikasi dimulai dengan 5 mahasiswa
contoh. Pengguna bisa menambah mahasiswa beserta nilai setiap mata kuliah, melihat semua
mahasiswa dalam tabel yang rapi lengkap dengan rata-rata, huruf grade, dan IPK, mencari,
menghapus, dan melihat statistik kelas. Input yang salah tidak boleh membuat aplikasi crash.
Kursus Java tidak membahas file, jadi datanya hanya ada di memori: setiap kali dijalankan,
aplikasi mulai lagi dengan 5 mahasiswa contoh yang sama.

## Files / File

| File | Description (EN) | Deskripsi (ID) |
|------|-------------------|----------------|
| `GradeManagerUnsolved.java` | Starter skeleton: `Student` class and static helper methods as stubs, menu with TODOs, built-in checker (`--check`) | Kerangka awal: class `Student` dan method static pembantu masih kosong, menu berisi TODO, checker otomatis (`--check`) |
| `GradeManagerSolved.java` | My own solutions | Jawaban buatan saya sendiri |

## How to Run / Cara Menjalankan

```bash
java GradeManagerUnsolved.java --check   # test your methods / uji method-mu
java GradeManagerUnsolved.java           # start the app / jalankan aplikasinya
```

EN: Until Part 1 and Part 2 are done, the app only prints "The app is not implemented yet."
and until you write the menu it prints "runMenu() is not implemented yet". That's normal.
ID: Selama Part 1 dan Part 2 belum selesai, aplikasi hanya mencetak "The app is not implemented
yet." dan selama menunya belum ditulis, ia mencetak "runMenu() is not implemented yet". Itu normal.

> [!IMPORTANT]
> EN: The class name must match the file name. When saving as `GradeManagerSolved.java`, rename the class too. Easiest: in VS Code press Ctrl+H and replace ALL `GradeManagerUnsolved` with `GradeManagerSolved` (that also fixes the run hints the app prints).
>
> ID: Nama class harus sama dengan nama file. Saat disimpan sebagai `GradeManagerSolved.java`, ganti juga nama class-nya. Paling gampang: di VS Code tekan Ctrl+H lalu ganti SEMUA `GradeManagerUnsolved` menjadi `GradeManagerSolved` (petunjuk cara menjalankan yang dicetak aplikasi juga ikut benar).

### Why is `Student` inside the main class? / Kenapa `Student` ada di dalam class utama?

EN: In this course every class lives inside the main class as `static class ...`, so each
file is self-contained. That's why `GradeManagerUnsolved.java` and `GradeManagerSolved.java`
(or the `Student` of another topic) can sit in the same folder without VS Code complaining
"The type Student is already defined". In real projects each class gets its own file and
`static` isn't needed. Because `Student` is inside the main class, Java technically lets the
rest of the file read a private field like `student.name`, but don't: always use the getters.

ID: Di kursus ini setiap class ditulis di dalam class utama sebagai `static class ...`, jadi
setiap file berdiri sendiri. Karena itu `GradeManagerUnsolved.java` dan `GradeManagerSolved.java`
(atau `Student` dari topik lain) bisa ada di folder yang sama tanpa VS Code protes
"The type Student is already defined". Di proyek sungguhan setiap class punya file sendiri dan
`static` tidak diperlukan. Karena `Student` ada di dalam class utama, secara teknis Java
membolehkan bagian lain file membaca field private seperti `student.name`, tapi jangan:
selalu pakai getter-nya.

## Grading Scale & Courses / Skala Nilai & Mata Kuliah

| Score / Nilai | Grade | Points / Bobot | | Course / Mata Kuliah | Credits / SKS |
|---|:-:|:-:|---|---|:-:|
| 85 - 100 | A | 4.0 | | Algorithms | 3 |
| 80 - 84 | AB | 3.5 | | Discrete Mathematics | 3 |
| 75 - 79 | B | 3.0 | | English | 2 |
| 70 - 74 | BC | 2.5 | | Pancasila | 2 |
| 65 - 69 | C | 2.0 | | | |
| 50 - 64 | D | 1.0 | | | |
| 0 - 49 | E | 0.0 | | | |

EN: Pass = C or better. The letter grade of a student comes from the **average** score;
the GPA is weighted by credits.
ID: Lulus = C atau lebih baik. Huruf grade mahasiswa diambil dari nilai **rata-rata**;
IPK-nya diberi bobot SKS.

## Features / Fitur

- [ ] **Start with 5 sample students** (`sampleStudents()` is already written) / **Mulai dengan 5 mahasiswa contoh** (`sampleStudents()` sudah ditulis)
- [ ] **1. Add a student** — name + one score per course / nama + satu nilai per mata kuliah
- [ ] **2. List all students** — aligned table: average, grade, GPA, PASS/FAIL / tabel rapi: rata-rata, grade, IPK, PASS/FAIL
- [ ] **3. Search a student** — by name, case-insensitive, shows every course / berdasarkan nama, tidak peduli huruf besar/kecil, menampilkan setiap mata kuliah
- [ ] **4. Class statistics** — highest & lowest average, class average, number passing / rata-rata tertinggi & terendah, rata-rata kelas, jumlah yang lulus
- [ ] **5. Delete a student** — with a (y/n) confirmation / dengan konfirmasi (y/n)
- [ ] **0. Exit** — the menu repeats until 0 / menu terus berulang sampai 0
- [ ] **Validation everywhere** — letters or decimals as a score, scores outside 0-100, empty or duplicate names, names with digits, unknown menu choices: an error message, never a crash / huruf atau desimal sebagai nilai, nilai di luar 0-100, nama kosong atau dobel, nama berisi angka, pilihan menu tak dikenal: pesan error, tidak pernah crash

## Required Concepts / Konsep yang Dipakai

| Topic / Topik | Where you use it (EN) | Dipakai di (ID) |
|---|---|---|
| 01 output | the menu and every message | menu dan semua pesan |
| 02 variables & data types | `int` scores, `double` averages, casting, `printf` / `String.format` | nilai `int`, rata-rata `double`, casting, `printf` / `String.format` |
| 03 input & math | one `Scanner`, `nextLine()`, `Math.round` | satu `Scanner`, `nextLine()`, `Math.round` |
| 04 conditionals | `scoreToGrade`, `switch` on the menu choice, `equalsIgnoreCase` | `scoreToGrade`, `switch` pada pilihan menu, `equalsIgnoreCase` |
| 05 loops | the menu loop, "ask again" loops, totals, searching | perulangan menu, perulangan "tanya lagi", total, pencarian |
| 06 arrays & ArrayList | `int[] scores`, `COURSE_NAMES`, `ArrayList<Student>` | `int[] scores`, `COURSE_NAMES`, `ArrayList<Student>` |
| 07 methods | every static helper, return values, reusing your methods | semua method static pembantu, nilai kembalian, memakai ulang method sendiri |
| 08 strings | `trim`, `split`, `substring`, `toCharArray`, `String.format` widths | `trim`, `split`, `substring`, `toCharArray`, lebar di `String.format` |
| 09 OOP basics | the `Student` class, constructor, `this`, `toString()`, list of objects | class `Student`, constructor, `this`, `toString()`, list berisi object |
| 10 OOP advanced | `private` fields + getters, `static final` constants, static methods, `@Override` | field `private` + getter, konstanta `static final`, method static, `@Override` |

## Methods to Write / Method yang Harus Dibuat

| # | Method | Task (EN) | Tugas (ID) | Concept / Konsep |
|---|--------|-----------|------------|------------------|
| 1 | `Student(...)`, `getName`, `getScore` | Store and return the data | Simpan dan kembalikan datanya | constructor, `this`, getters |
| 2-5 | `getAverage`, `getGrade`, `getGpa`, `hasPassed` | Results for one student | Hasil untuk satu mahasiswa | methods reusing methods |
| 6 | `toString` | `Eka Putri (average 77.50, grade B)` | Deskripsi singkat | `@Override`, `String.format` |
| 7 | `toRow` | One aligned table row | Satu baris tabel yang rapi | `String.format` widths |
| 8 | `scoreToGrade` | Score to UNAIR letter grade | Nilai ke huruf grade UNAIR | `if / else if` |
| 9 | `gradePoints` | Letter grade to points | Huruf grade ke bobot | `switch` |
| 10 | `isPassing` | C or better? | C atau lebih baik? | `equals`, `\|\|` |
| 11 | `average` | Average, 2 decimals, empty array safe | Rata-rata, 2 desimal, aman untuk array kosong | loop, casting, `Math.round` |
| 12 | `weightedGpa` | GPA weighted by credits | IPK berbobot SKS | loop + reuse |
| 13 | `validateScore` | Text to a score 0-100, or `-1` | Teks ke nilai 0-100, atau `-1` | `toCharArray`, `parseInt` |
| 14 | `validateName` | Clean name (Title Case), or `""` | Nama rapi (Title Case), atau `""` | `trim`, `split`, `substring` |
| 15 | `findStudent` | Search, case-insensitive, or `null` | Cari, tidak peduli huruf besar/kecil, atau `null` | `equalsIgnoreCase` |
| 16-17 | `bestStudent`, `worstStudent` | Highest / lowest average | Rata-rata tertinggi / terendah | max/min by hand |
| 18 | `classAverage` | Average of all averages | Rata-rata dari semua rata-rata | `ArrayList` loop |
| 19 | `countPassing` | How many passed | Berapa yang lulus | counter |
| — | `runMenu` | The menu loop (not checked) | Perulangan menu (tidak dicek) | everything / semuanya |

## Build Order / Urutan Pengerjaan

| Step | What to do (EN) | Yang dikerjakan (ID) | Done when / Selesai kalau |
|:-:|---|---|---|
| 1 | `Student` class (PART 1, right after `main`): constructor, `getName`, `getScore` | Class `Student` (PART 1, tepat setelah `main`): constructor, `getName`, `getScore` | `--check` shows `[PASS] 1` |
| 2 | Grade methods (Part 2), then the other `Student` methods that use them | Method nilai (Part 2), lalu method `Student` lainnya yang memakainya | `[PASS] 1-12` |
| 3 | Menu loop: show the menu, `0` = Exit, unknown choice message | Perulangan menu: tampilkan menu, `0` = Exit, pesan pilihan tak dikenal | the app starts and exits cleanly |
| 4 | Validation (Part 3) + menu 1 (Add) + menu 2 (List) | Validasi (Part 3) + menu 1 (Add) + menu 2 (List) | `[PASS] 13-14`, add & list work |
| 5 | Class methods (Part 4) + menu 3, 4, 5 | Method kelas (Part 4) + menu 3, 4, 5 | `Score: 19 / 19` |
| 6 | Test everything with the self-check list, save as `GradeManagerSolved.java` | Uji semuanya dengan daftar cek sendiri, simpan sebagai `GradeManagerSolved.java` | every box below is ticked |

EN: Run `--check` after EVERY method, not only at the end.
ID: Jalankan `--check` setelah SETIAP method, jangan hanya di akhir.

## Sample Run / Contoh Jalannya Program

EN: A finished app. The text after each `: ` prompt is what the user typed. Your output
should look the same. On a laptop with Indonesian settings, `printf` / `String.format` may
show `88,75` instead of `88.75`: that's fine (the checker accepts both).
ID: Aplikasi yang sudah selesai. Teks setelah setiap prompt `: ` adalah yang diketik
pengguna. Output-mu harus terlihat sama. Di laptop dengan pengaturan bahasa Indonesia,
`printf` / `String.format` bisa menampilkan `88,75`, bukan `88.75`: itu tidak apa-apa
(checker menerima keduanya).

```text
Loaded 5 sample students (kept in memory only).

===== Student Grade Manager =====
1. Add a student
2. List all students
3. Search a student
4. Class statistics
5. Delete a student
0. Exit
Choose (0-5): 2
--- All students (5) ---
 No  Name                          Avg  Grade  GPA  Status
--------------------------------------------------------
  1  Ani Wijaya                  88.75  A     4.00  PASS
  2  Budi Santoso                73.75  BC    2.65  PASS
  3  Citra Lestari               82.75  AB    3.10  PASS
  4  Dimas Pratama               56.75  D     1.00  FAIL
  5  Eka Putri                   77.50  B     3.15  PASS

===== Student Grade Manager =====
1. Add a student
2. List all students
3. Search a student
4. Class statistics
5. Delete a student
0. Exit
Choose (0-5): 1
--- Add a student ---
Name: 
Error: Name must be 1-25 characters without numbers. Try again.
Name: excell 2
Error: Name must be 1-25 characters without numbers. Try again.
Name: ani wijaya
Error: Ani Wijaya is already in the class. Try again.
Name: excell
Score for Algorithms (3 credits): abc
Error: Score must be a whole number from 0 to 100. Try again.
Score for Algorithms (3 credits): 105
Error: Score must be a whole number from 0 to 100. Try again.
Score for Algorithms (3 credits): 90
Score for Discrete Mathematics (3 credits): 85.5
Error: Score must be a whole number from 0 to 100. Try again.
Score for Discrete Mathematics (3 credits): 86
Score for English (2 credits): 88
Score for Pancasila (2 credits): 82
Added Excell (average 86.50, grade A).

===== Student Grade Manager =====
1. Add a student
2. List all students
3. Search a student
4. Class statistics
5. Delete a student
0. Exit
Choose (0-5): 3
--- Search a student ---
Name to search: CITRA lestari
Citra Lestari
  Course                Credits  Score  Grade
  Algorithms                  3     95  A
  Discrete Mathematics        3     58  D
  English                     2     90  A
  Pancasila                   2     88  A
  Average 82.75 | Grade AB | GPA 3.10 | PASS

===== Student Grade Manager =====
1. Add a student
2. List all students
3. Search a student
4. Class statistics
5. Delete a student
0. Exit
Choose (0-5): 3
--- Search a student ---
Name to search: Fajar
No student named Fajar.

===== Student Grade Manager =====
1. Add a student
2. List all students
3. Search a student
4. Class statistics
5. Delete a student
0. Exit
Choose (0-5): 4
--- Class statistics ---
Students        : 6
Highest average : Ani Wijaya (average 88.75, grade A)
Lowest average  : Dimas Pratama (average 56.75, grade D)
Class average   : 77.67
Passing (>= C)  : 5 of 6

===== Student Grade Manager =====
1. Add a student
2. List all students
3. Search a student
4. Class statistics
5. Delete a student
0. Exit
Choose (0-5): 5
--- Delete a student ---
Name to delete: dimas pratama
Delete Dimas Pratama (average 56.75, grade D)? (y/n): y
Deleted Dimas Pratama.

===== Student Grade Manager =====
1. Add a student
2. List all students
3. Search a student
4. Class statistics
5. Delete a student
0. Exit
Choose (0-5): abc
Unknown choice. Please type a number from 0 to 5.

===== Student Grade Manager =====
1. Add a student
2. List all students
3. Search a student
4. Class statistics
5. Delete a student
0. Exit
Choose (0-5): 0
Goodbye!
```

## Self-check / Cek Sendiri

- [ ] `java GradeManagerSolved.java --check` shows `Score: 19 / 19`
- [ ] Scores `abc`, `85.5`, empty, `-5`, `150`, `99999999999` → an error and the same question again / error lalu pertanyaan yang sama lagi
- [ ] Names: empty, only spaces, `Budi 2`, more than 25 characters, a name already in the class → rejected / ditolak
- [ ] Search and delete work with any capitals and extra spaces (`  ANI wijaya `) / pencarian dan hapus jalan dengan huruf besar/kecil apa pun dan spasi berlebih
- [ ] Menu choice `9`, `abc` or just Enter → "Unknown choice", no crash / tanpa crash
- [ ] Delete every student, then try List and Statistics → a friendly message, no crash / hapus semua mahasiswa, lalu coba List dan Statistics → pesan ramah, tanpa crash
- [ ] You only used ONE `Scanner` and only `nextLine()` (no `nextInt()` pitfall) / hanya SATU `Scanner` dan hanya `nextLine()` (tanpa jebakan `nextInt()`)
- [ ] Outside `Student`, you never read `student.name` directly, only `getName()` / di luar `Student`, tidak pernah membaca `student.name` langsung, hanya `getName()`
- [ ] No hardcoding: nowhere in your code is `4` used for "number of courses" (use `COURSE_NAMES.length`) / tidak ada angka `4` untuk "jumlah mata kuliah" (pakai `COURSE_NAMES.length`)

## Stretch Goals / Tantangan Tambahan

1. EN: **Sort the table** by average, highest first (write the sorting loop yourself).
   ID: **Urutkan tabel** berdasarkan rata-rata, tertinggi dulu (tulis sendiri loop pengurutannya).
2. EN: **Partial search**: `ani` also finds `Ani Wijaya` and `Dani Putra` (use `contains`).
   ID: **Pencarian sebagian**: `ani` juga menemukan `Ani Wijaya` dan `Dani Putra` (pakai `contains`).
3. EN: **Edit a score** with a setter that validates: `boolean setScore(int index, int score)` returns `false` for a wrong index or score.
   ID: **Ubah nilai** dengan setter yang memvalidasi: `boolean setScore(int index, int score)` mengembalikan `false` untuk indeks atau nilai yang salah.
4. EN: **Course report**: the average and the highest score of every course.
   ID: **Laporan mata kuliah**: rata-rata dan nilai tertinggi setiap mata kuliah.
5. EN: **Add Calculus (3 credits)**: what do you have to change? If you never hardcoded `4`, only the two arrays and `sampleStudents()`.
   ID: **Tambah Calculus (3 SKS)**: apa saja yang harus diubah? Kalau kamu tidak pernah hardcode `4`, cukup dua array dan `sampleStudents()`.
6. EN: **Inheritance + polymorphism**: `static class ExchangeStudent extends Student` with a home university and an `@Override` of `toString()`; keep both kinds in the same `ArrayList<Student>`.
   ID: **Pewarisan + polimorfisme**: `static class ExchangeStudent extends Student` dengan universitas asal dan `@Override` pada `toString()`; simpan keduanya di `ArrayList<Student>` yang sama.
7. EN: **Static counter**: `Student.getTotalCreated()` counts how many `Student` objects were ever made.
   ID: **Penghitung static**: `Student.getTotalCreated()` menghitung berapa object `Student` yang pernah dibuat.

## Python vs Java

| | Python | Java |
|---|---|---|
| Run the checker | `python grade_manager_unsolved.py --check` | `java GradeManagerUnsolved.java --check` |
| Read `--check` | `"--check" in sys.argv` | `args.length > 0 && args[0].equals("--check")` |
| Where `Student` lives | its own class at the top of the file | `static class Student` inside the main class |
| Data | saved in `students.csv` | in memory only (sample students every start) |
| Invalid input | `raise ValueError("...")` + `try/except` | return `-1` / `""` and check it (no try/catch in this course) |
| "Not found" | `None` | `null` |
| List of students | `students = []`, `.append()` | `ArrayList<Student>`, `.add()` |
| Scores | list `[88, 92, 85, 90]` | array `new int[] {88, 92, 85, 90}` |
| Description | `def __str__(self)` | `@Override public String toString()` |
| Table row | f-string `{name:<26}{avg:>7.2f}` | `String.format("%-26s%7.2f", name, avg)` |
| Round to 2 decimals | `round(x, 2)` | `Math.round(x * 100) / 100.0` |
| Menu choice | `if choice == "1": ... elif ...` | `switch (choice) { case "1" -> ... }` |

## Key Takeaways / Poin Penting

- Build big programs from small methods you can test one by one.
  Program besar dibangun dari method-method kecil yang bisa diuji satu per satu.
- Keep calculations (return values) separate from the menu (Scanner/println): only then can a checker test them.
  Pisahkan perhitungan (nilai kembalian) dari menu (Scanner/println): hanya dengan begitu checker bisa mengujinya.
- Never trust user input: read it as text with `nextLine()`, check it, and only then convert it.
  Jangan pernah percaya input pengguna: baca sebagai teks dengan `nextLine()`, cek, baru setelah itu diubah.
- A class bundles private data (`name`, `scores`) with the methods that use it (`getAverage()`).
  Class menggabungkan data private (`name`, `scores`) dengan method yang memakainya (`getAverage()`).
- `null` means "nothing found": always check `!= null` before you use the result.
  `null` artinya "tidak ketemu": selalu cek `!= null` sebelum memakai hasilnya.
