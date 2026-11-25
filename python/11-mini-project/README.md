# Topic 11 — Mini Project: Student Grade Manager / Topik 11 — Proyek Mini: Pengelola Nilai Mahasiswa

EN: The final project: one menu-driven app that uses everything from Topic 01-10.
ID: Proyek akhir: satu aplikasi berbasis menu yang memakai semua materi Topik 01-10.

## Goal / Tujuan

EN: Build a **Student Grade Manager** for one class. The user can add students with a score
for every course, see everyone in a neat table with their average, letter grade and GPA,
search, delete, see class statistics, and save the class to a CSV file so the data is still
there next time. Wrong input must never crash the app.

ID: Buat **Pengelola Nilai Mahasiswa** untuk satu kelas. Pengguna bisa menambah mahasiswa
beserta nilai setiap mata kuliah, melihat semua mahasiswa dalam tabel yang rapi lengkap
dengan rata-rata, huruf grade, dan IPK, mencari, menghapus, melihat statistik kelas, dan
menyimpan kelas ke file CSV supaya datanya masih ada saat aplikasi dibuka lagi. Input yang
salah tidak boleh membuat aplikasi error.

## Files / File

| File | Description (EN) | Deskripsi (ID) |
|------|-------------------|----------------|
| `grade_manager_unsolved.py` | Starter skeleton: `Student` class and helper functions as stubs, menu with TODOs, built-in checker (`--check`) | Kerangka awal: class `Student` dan fungsi-fungsi pembantu masih kosong, menu berisi TODO, checker otomatis (`--check`) |
| `grade_manager_solved.py` | My own solutions | Jawaban buatan saya sendiri |
| `students_sample.csv` | 5 sample students, loaded on start while `students.csv` doesn't exist yet (never overwritten) | 5 mahasiswa contoh, dimuat saat mulai selama `students.csv` belum ada (tidak pernah ditimpa) |
| `students.csv` | Created by menu 6 (Save): your own class | Dibuat oleh menu 6 (Save): data kelasmu sendiri |
| `output_check.csv` | Temporary file written by `--check`, safe to delete | File sementara dari `--check`, boleh dihapus |

## How to Run / Cara Menjalankan

```bash
python grade_manager_unsolved.py --check   # test your functions / uji fungsimu
python grade_manager_unsolved.py           # start the app / jalankan aplikasinya
```

EN: Until Part 1 and Part 2 are done, the app only prints "The app is not implemented yet."
and until you write the menu it prints "main_menu() is not implemented yet". That's normal.
ID: Selama Part 1 dan Part 2 belum selesai, aplikasi hanya mencetak "The app is not implemented
yet." dan selama menunya belum ditulis, ia mencetak "main_menu() is not implemented yet". Itu normal.

EN: The CSV files live **in the same folder as the `.py` file**. The script finds them with
`HERE = Path(__file__).parent`, so it works no matter which folder your terminal is in.
`output_check.csv` and `students.csv` can be deleted at any time (delete `students.csv`
to start again from the sample data).
ID: File CSV ada **di folder yang sama dengan file `.py`**. Script menemukannya lewat
`HERE = Path(__file__).parent`, jadi tetap jalan dari folder mana pun terminalmu berada.
`output_check.csv` dan `students.csv` boleh dihapus kapan saja (hapus `students.csv` untuk
mulai lagi dari data contoh).

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

- [ ] **1. Add a student** — name + one score per course / nama + satu nilai per mata kuliah
- [ ] **2. List all students** — aligned table: average, grade, GPA, PASS/FAIL / tabel rapi: rata-rata, grade, IPK, PASS/FAIL
- [ ] **3. Search a student** — by name, case-insensitive, shows every course / berdasarkan nama, tidak peduli huruf besar/kecil, menampilkan setiap mata kuliah
- [ ] **4. Class statistics** — highest & lowest average, class average, number passing / rata-rata tertinggi & terendah, rata-rata kelas, jumlah yang lulus
- [ ] **5. Delete a student** — with a (y/n) confirmation / dengan konfirmasi (y/n)
- [ ] **6. Save to file** — `students.csv` next to the script / `students.csv` di samping script
- [ ] **7. Load from file** — reload `students.csv` / muat ulang `students.csv`
- [ ] **0. Exit** — the menu repeats until 0 / menu terus berulang sampai 0
- [ ] **Auto-load on start** — `students.csv` if it exists, otherwise `students_sample.csv` / `students.csv` kalau ada, kalau tidak `students_sample.csv`
- [ ] **Validation everywhere** — letters or decimals as a score, scores outside 0-100, empty or duplicate names, names with digits, unknown menu choices, broken CSV rows: an error message, never a crash / huruf atau desimal sebagai nilai, nilai di luar 0-100, nama kosong atau dobel, nama berisi angka, pilihan menu tak dikenal, baris CSV rusak: pesan error, tidak pernah crash

## Required Concepts / Konsep yang Dipakai

| Topic / Topik | Where you use it (EN) | Dipakai di (ID) |
|---|---|---|
| 01 print | the menu, messages, the table | menu, pesan, tabel |
| 02 variables, `input()`, f-strings | reading every answer, `:.2f` | membaca setiap jawaban, `:.2f` |
| 03 data structures | list of scores, list of students, grade-points dict | list nilai, list mahasiswa, dict bobot nilai |
| 04 conditionals | `score_to_grade`, menu choices, PASS/FAIL | `score_to_grade`, pilihan menu, PASS/FAIL |
| 05 loops | the menu loop, "ask again" loops, totals, searching | perulangan menu, perulangan "tanya lagi", total, pencarian |
| 06 functions | every helper, return values, reusing your own functions | semua fungsi pembantu, nilai kembalian, memakai ulang fungsi sendiri |
| 07 strings | `strip`, `lower`, `title`, `isdigit`, alignment `:<26` `:>7` | `strip`, `lower`, `title`, `isdigit`, perataan `:<26` `:>7` |
| 08 error handling | `raise ValueError` in the validators, `try/except` in the menu | `raise ValueError` di fungsi validasi, `try/except` di menu |
| 09 file handling | `csv.writer` / `csv.reader`, `with open`, `pathlib` (`HERE`) | `csv.writer` / `csv.reader`, `with open`, `pathlib` (`HERE`) |
| 10 OOP | the `Student` class, `__init__`, methods, `__str__`, list of objects | class `Student`, `__init__`, method, `__str__`, list of objects |

## Functions to Write / Fungsi yang Harus Dibuat

| # | Function | Task (EN) | Tugas (ID) | Concept / Konsep |
|---|----------|-----------|------------|------------------|
| 1 | `Student.__init__` | Store `name` and `scores` | Simpan `name` dan `scores` | `self`, attributes |
| 2-5 | `get_average`, `get_grade`, `get_gpa`, `has_passed` | Results for one student | Hasil untuk satu mahasiswa | methods reusing functions |
| 6 | `Student.__str__` | `Eka Putri (average 77.50, grade B)` | Deskripsi singkat | `__str__`, f-string |
| 7 | `Student.to_row` | One aligned table row | Satu baris tabel yang rapi | f-string alignment |
| 8 | `score_to_grade` | Score to UNAIR letter grade | Nilai ke huruf grade UNAIR | `if/elif/else` |
| 9 | `grade_points` | Letter grade to points | Huruf grade ke bobot | dict + `.get()` |
| 10 | `is_passing` | C or better? | C atau lebih baik? | `in` |
| 11 | `average` | Average, 2 decimals, empty list safe | Rata-rata, 2 desimal, aman untuk list kosong | `sum`, `len`, `round` |
| 12 | `weighted_gpa` | GPA weighted by credits | IPK berbobot SKS | loop + reuse |
| 13 | `validate_score` | Text to a score 0-100 or `ValueError` | Teks ke nilai 0-100 atau `ValueError` | `int()`, `raise` |
| 14 | `validate_name` | Clean the name or `ValueError` | Rapikan nama atau `ValueError` | `strip`, `title`, `isdigit` |
| 15 | `find_student` | Search, case-insensitive | Cari, tidak peduli huruf besar/kecil | loop + `lower()` |
| 16-17 | `best_student`, `worst_student` | Highest / lowest average | Rata-rata tertinggi / terendah | max/min by hand |
| 18 | `class_average` | Average of all averages | Rata-rata dari semua rata-rata | reuse `average()` |
| 19 | `count_passing` | How many passed | Berapa yang lulus | counter |
| 20 | `save_students` | Write the CSV, return the count | Tulis CSV, kembalikan jumlahnya | `csv.writer`, `newline=""` |
| 21 | `load_students` | Read the CSV, skip broken rows | Baca CSV, lewati baris rusak | `csv.reader`, `try/except` |
| — | `main_menu` | The menu loop (not checked) | Perulangan menu (tidak dicek) | everything / semuanya |

## Build Order / Urutan Pengerjaan

| Step | What to do (EN) | Yang dikerjakan (ID) | Done when / Selesai kalau |
|:-:|---|---|---|
| 1 | `Student` class: write `__init__` | Class `Student`: tulis `__init__` | `--check` shows `[PASS] 1` |
| 2 | Grade functions (Part 2), then the other `Student` methods that use them | Fungsi nilai (Part 2), lalu method `Student` lainnya yang memakainya | `[PASS] 1-12` |
| 3 | Menu loop: show the menu, `0` = Exit, unknown choice message | Perulangan menu: tampilkan menu, `0` = Exit, pesan pilihan tak dikenal | the app starts and exits cleanly |
| 4 | Validation (Part 3) + menu 1 (Add) + menu 2 (List) | Validasi (Part 3) + menu 1 (Add) + menu 2 (List) | `[PASS] 13-14`, add & list work |
| 5 | Class functions (Part 4) + menu 3, 4, 5 | Fungsi kelas (Part 4) + menu 3, 4, 5 | `[PASS] 15-19` |
| 6 | Files (Part 5) + menu 6, 7 + auto-load on start | File (Part 5) + menu 6, 7 + muat otomatis saat mulai | `Score: 21 / 21` |
| 7 | Test everything with the self-check list, save as `grade_manager_solved.py` | Uji semuanya dengan daftar cek sendiri, simpan sebagai `grade_manager_solved.py` | every box below is ticked |

EN: Run `--check` after EVERY function, not only at the end.
ID: Jalankan `--check` setelah SETIAP fungsi, jangan hanya di akhir.

## Sample Run / Contoh Jalannya Program

EN: A finished app on its first run (no `students.csv` yet). The text after each `: ` prompt
is what the user typed. Your output should look the same.
ID: Aplikasi yang sudah selesai saat pertama kali dijalankan (belum ada `students.csv`).
Teks setelah setiap prompt `: ` adalah yang diketik pengguna. Output-mu harus terlihat sama.

```text
Loaded 5 students from students_sample.csv (sample data).

===== Student Grade Manager =====
1. Add a student
2. List all students
3. Search a student
4. Class statistics
5. Delete a student
6. Save to file
7. Load from file
0. Exit
Choose (0-7): 2
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
6. Save to file
7. Load from file
0. Exit
Choose (0-7): 1
--- Add a student ---
Name: 
Error: Name cannot be empty. Try again.
Name: excell 2
Error: Name cannot contain numbers. Try again.
Name: ani wijaya
Error: Ani Wijaya is already in the class. Try again.
Name: excell
Score for Algorithms (3 credits): abc
Error: Score must be a whole number. Try again.
Score for Algorithms (3 credits): 105
Error: Score must be between 0 and 100. Try again.
Score for Algorithms (3 credits): 90
Score for Discrete Mathematics (3 credits): 85.5
Error: Score must be a whole number. Try again.
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
6. Save to file
7. Load from file
0. Exit
Choose (0-7): 3
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
6. Save to file
7. Load from file
0. Exit
Choose (0-7): 3
--- Search a student ---
Name to search: Fajar
No student named Fajar.

===== Student Grade Manager =====
1. Add a student
2. List all students
3. Search a student
4. Class statistics
5. Delete a student
6. Save to file
7. Load from file
0. Exit
Choose (0-7): 4
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
6. Save to file
7. Load from file
0. Exit
Choose (0-7): 5
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
6. Save to file
7. Load from file
0. Exit
Choose (0-7): 6
Saved 5 students to students.csv.

===== Student Grade Manager =====
1. Add a student
2. List all students
3. Search a student
4. Class statistics
5. Delete a student
6. Save to file
7. Load from file
0. Exit
Choose (0-7): abc
Unknown choice. Please type a number from 0 to 7.

===== Student Grade Manager =====
1. Add a student
2. List all students
3. Search a student
4. Class statistics
5. Delete a student
6. Save to file
7. Load from file
0. Exit
Choose (0-7): 0
Goodbye!
```

## Self-check / Cek Sendiri

- [ ] `python grade_manager_solved.py --check` shows `Score: 21 / 21`
- [ ] Scores `abc`, `85.5`, empty, `-5`, `150` → an error and the same question again / error lalu pertanyaan yang sama lagi
- [ ] Names: empty, only spaces, `Budi 2`, more than 25 characters, a name already in the class → rejected / ditolak
- [ ] Search and delete work with any capitals and extra spaces (`  ANI wijaya `) / pencarian dan hapus jalan dengan huruf besar/kecil apa pun dan spasi berlebih
- [ ] Menu choice `9`, `abc` or just Enter → "Unknown choice", no crash / tanpa crash
- [ ] Delete every student, then try List and Statistics → a friendly message, no crash / hapus semua mahasiswa, lalu coba List dan Statistics → pesan ramah, tanpa crash
- [ ] Save, exit, start again → your changes are still there / simpan, keluar, jalankan lagi → perubahanmu masih ada
- [ ] Add a broken row to `students.csv` by hand (e.g. `Rudi,90,abc,80,70`) → it is skipped and counted, no crash / dilewati dan dihitung, tanpa crash
- [ ] Run the app from another folder (`python 11-mini-project/grade_manager_solved.py`) → the CSV files are still found / file CSV tetap ketemu
- [ ] No hardcoding: nowhere in your code is `4` used for "number of courses" (use `len(COURSE_NAMES)`) / tidak ada angka `4` untuk "jumlah mata kuliah" (pakai `len(COURSE_NAMES)`)

## Stretch Goals / Tantangan Tambahan

1. EN: **Sort the table** by average, highest first (write the sorting loop yourself).
   ID: **Urutkan tabel** berdasarkan rata-rata, tertinggi dulu (tulis sendiri loop pengurutannya).
2. EN: **Partial search**: `ani` also finds `Ani Wijaya` and `Dani Putra` (show every match).
   ID: **Pencarian sebagian**: `ani` juga menemukan `Ani Wijaya` dan `Dani Putra` (tampilkan semua yang cocok).
3. EN: **Edit a score** of an existing student (new menu option, same validation).
   ID: **Ubah nilai** mahasiswa yang sudah ada (opsi menu baru, validasi yang sama).
4. EN: **Unsaved changes warning**: on Exit, ask "Save before exit? (y/n)" if something changed.
   ID: **Peringatan belum disimpan**: saat Exit, tanya "Save before exit? (y/n)" kalau ada yang berubah.
5. EN: **Course report**: the average and the highest score of every course.
   ID: **Laporan mata kuliah**: rata-rata dan nilai tertinggi setiap mata kuliah.
6. EN: **Add Calculus (3 credits)**: what do you have to change? If you never hardcoded `4`, only the two lists and the CSV.
   ID: **Tambah Calculus (3 SKS)**: apa saja yang harus diubah? Kalau kamu tidak pernah hardcode `4`, cukup dua list dan CSV-nya.
7. EN: **Inheritance**: `class ExchangeStudent(Student)` with a home university, overriding `__str__` with `super()`.
   ID: **Pewarisan**: `class ExchangeStudent(Student)` dengan universitas asal, meng-override `__str__` memakai `super()`.
8. EN: **Export a report** to `report.txt` (the table + the statistics).
   ID: **Ekspor laporan** ke `report.txt` (tabel + statistik).

## Key Takeaways / Poin Penting

- Build big programs from small functions you can test one by one.
  Program besar dibangun dari fungsi-fungsi kecil yang bisa diuji satu per satu.
- Keep calculations (return values) separate from the menu (input/print): only then can a checker test them.
  Pisahkan perhitungan (nilai kembalian) dari menu (input/print): hanya dengan begitu checker bisa mengujinya.
- Never trust user input: validate it, `raise` a clear error, catch it and ask again.
  Jangan pernah percaya input pengguna: validasi, `raise` error yang jelas, tangkap, lalu tanya lagi.
- A class bundles data (`name`, `scores`) with the methods that use it (`get_average()`).
  Class menggabungkan data (`name`, `scores`) dengan method yang memakainya (`get_average()`).
- Saving to a file is what makes a program remember things after it closes.
  Menyimpan ke file itulah yang membuat program bisa "ingat" setelah ditutup.
