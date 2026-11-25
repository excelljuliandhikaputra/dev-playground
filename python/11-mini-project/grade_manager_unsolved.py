"""
Topic 11 - Mini Project: Student Grade Manager (UNSOLVED)
Topik 11 - Proyek Mini: Pengelola Nilai Mahasiswa (BELUM DIKERJAKAN)
=====================================================================
EN - What is this?
    The final project of the course. It combines Topic 01-10 into ONE
    menu-driven app for a class of students on the UNAIR grading scale.
    This file is a STARTER: the class, the function names and the
    docstrings are ready, the bodies are not. Read README.md first.

ID - Ini apa?
    Proyek akhir kursus. Semua materi Topik 01-10 digabung menjadi SATU
    aplikasi berbasis menu untuk satu kelas mahasiswa dengan skala nilai
    UNAIR. File ini adalah KERANGKA: class, nama fungsi, dan docstring
    sudah siap, isinya belum. Baca README.md dulu.

EN - How to use:
    1. Follow the build order in README.md (Part 1 -> Part 6) and replace
       every `pass` with your own code.
    2. Test your functions:   python grade_manager_unsolved.py --check
       [TODO] = not started, [FAIL] = wrong answer, [PASS] = correct
    3. Start the app:         python grade_manager_unsolved.py

ID - Cara pakai:
    1. Ikuti urutan pengerjaan di README.md (Part 1 -> Part 6) dan ganti
       setiap `pass` dengan kodemu sendiri.
    2. Uji fungsimu:          python grade_manager_unsolved.py --check
       [TODO] = belum dikerjakan, [FAIL] = jawaban salah, [PASS] = benar
    3. Jalankan aplikasinya:  python grade_manager_unsolved.py

Rules / Aturan:
    - Only use Topic 01-10 material.
      Hanya pakai materi Topik 01-10.
    - Do not rename the class, functions, methods or parameters:
      the checker calls them by name.
      Jangan ganti nama class, fungsi, method, atau parameter:
      checker memanggilnya berdasarkan nama.
    - Do not edit the CHECKER part at the bottom of the file.
      Jangan ubah bagian CHECKER di paling bawah file.
    - NO HARDCODING: every result must be calculated from the parameters.
      JANGAN HARDCODE: setiap hasil harus dihitung dari parameter.
    - Reuse your own functions (e.g. get_grade() uses score_to_grade()).
      Pakai ulang fungsimu sendiri (misal get_grade() memakai score_to_grade()).

Self-check / Cek sendiri:
    The checker only tests the functions, not the menu. Test the menu
    yourself: wrong input (letters, 150, an empty name) must NEVER crash it.
    Checker hanya menguji fungsi, bukan menu. Uji menunya sendiri: input
    yang salah (huruf, 150, nama kosong) TIDAK BOLEH membuat aplikasi error.

Save your answers as grade_manager_solved.py.
Simpan jawabanmu sebagai grade_manager_solved.py.
"""

import csv
import sys
from pathlib import Path


# ---------------------------------------------------------------------------
# SETTINGS / PENGATURAN
# EN: The courses of the class and where the data files live.
#     Don't change them while you build the app (the checker uses them).
#     HERE is the folder this .py file is in, so the CSV files are always
#     found, no matter which folder your terminal is in (accept this for now).
# ID: Daftar mata kuliah kelas ini dan lokasi file datanya.
#     Jangan diubah selama mengerjakan (checker memakainya).
#     HERE adalah folder tempat file .py ini berada, jadi file CSV selalu
#     ketemu dari folder mana pun terminalmu berada (terima saja dulu).
# ---------------------------------------------------------------------------
HERE = Path(__file__).parent                  # folder of this file / folder file ini
DATA_FILE = HERE / "students.csv"             # your saved class / kelas yang kamu simpan
SAMPLE_FILE = HERE / "students_sample.csv"    # sample data, only read / data contoh, hanya dibaca

COURSE_NAMES = ["Algorithms", "Discrete Mathematics", "English", "Pancasila"]
COURSE_CREDITS = [3, 3, 2, 2]                 # same order as COURSE_NAMES / urutannya sama


# ---------------------------------------------------------------------------
# PART 1 - The Student class (build step 1 and 2)
# EN: One Student object = one student: a name and a list of scores.
#     scores[0] belongs to COURSE_NAMES[0], scores[1] to COURSE_NAMES[1], ...
#     Step 1: write __init__ only. The other methods REUSE the Part 2
#     functions, so finish them in step 2, after Part 2.
# ID: Satu objek Student = satu mahasiswa: sebuah nama dan list nilai.
#     scores[0] milik COURSE_NAMES[0], scores[1] milik COURSE_NAMES[1], dst.
#     Langkah 1: tulis __init__ saja. Method lainnya MEMAKAI fungsi dari
#     Part 2, jadi selesaikan di langkah 2, setelah Part 2.
# ---------------------------------------------------------------------------
class Student:
    def __init__(self, name, scores):
        """
        Check 1: Save the name and the list of scores as attributes.
        EN: Use exactly these attribute names: self.name and self.scores
        ID: Simpan nama dan list nilai sebagai atribut. Pakai nama atribut
            persis seperti ini: self.name dan self.scores
        Student("Ani Wijaya", [88, 92, 85, 90]).name   -> "Ani Wijaya"
        Student("Ani Wijaya", [88, 92, 85, 90]).scores -> [88, 92, 85, 90]
        """
        pass

    def get_average(self):
        """
        Check 2: Return the average of this student's scores.
        EN: Reuse average() from Part 2.
        ID: Kembalikan rata-rata nilai mahasiswa ini. Pakai ulang average().
        Student("Ani Wijaya", [88, 92, 85, 90]).get_average() -> 88.75
        """
        pass

    def get_grade(self):
        """
        Check 3: Return the letter grade of the AVERAGE score.
        EN: Reuse get_average() and score_to_grade().
        ID: Kembalikan huruf grade dari RATA-RATA nilai.
            Pakai ulang get_average() dan score_to_grade().
        Student("Citra Lestari", [95, 58, 90, 88]).get_grade() -> "AB"
        """
        pass

    def get_gpa(self):
        """
        Check 4: Return the GPA (IPK) weighted by credits (SKS).
        EN: Reuse weighted_gpa() with COURSE_CREDITS.
        ID: Kembalikan IPK yang diberi bobot SKS.
            Pakai ulang weighted_gpa() dengan COURSE_CREDITS.
        Student("Citra Lestari", [95, 58, 90, 88]).get_gpa() -> 3.1
        """
        pass

    def has_passed(self):
        """
        Check 5: Return True if the grade of the average is C or better.
        EN: Reuse get_grade() and is_passing().
        ID: Kembalikan True jika grade dari rata-ratanya C atau lebih baik.
            Pakai ulang get_grade() dan is_passing().
        Student("Dimas Pratama", [45, 52, 60, 70]).has_passed() -> False
        """
        pass

    def __str__(self):
        """
        Check 6: Return a short description. print(student) uses it.
        EN: The average always has 2 decimals.
        ID: Kembalikan deskripsi singkat. print(student) memakainya.
            Rata-ratanya selalu 2 angka desimal.
        str(Student("Eka Putri", [80, 77, 68, 85]))
            -> "Eka Putri (average 77.50, grade B)"
        """
        pass

    def to_row(self, number):
        """
        Check 7: Return one row of the student table (menu 2).
        EN: Use f-string alignment with these widths, in this order:
                number    right, width 3
                2 spaces
                name      left, width 26
                average   right, width 7, 2 decimals
                2 spaces
                grade     left, width 5
                GPA       right, width 5, 2 decimals
                2 spaces
                "PASS" or "FAIL"
        ID: Kembalikan satu baris tabel mahasiswa (menu 2).
            Pakai perataan f-string dengan lebar dan urutan seperti di atas.
            (right = rata kanan, left = rata kiri, width = lebar)
        Student("Ani Wijaya", [88, 92, 85, 90]).to_row(1)
            -> "  1  Ani Wijaya                  88.75  A     4.00  PASS"
        """
        pass


# ---------------------------------------------------------------------------
# PART 2 - Grade functions (build step 2)
# EN: Small pure functions: they get values and RETURN a result. No print(),
#     no input(). That's why the checker can test them automatically.
# ID: Fungsi-fungsi kecil yang "murni": menerima nilai lalu MENGEMBALIKAN
#     hasil. Tanpa print() dan input(). Karena itu checker bisa mengujinya.
# ---------------------------------------------------------------------------
def score_to_grade(score):
    """
    Check 8: Convert a score (0-100, may have decimals) to a UNAIR letter grade.
    ID: Ubah nilai (0-100, boleh desimal) menjadi huruf grade UNAIR.
        85 and above -> "A"        70 - 74 -> "BC"
        80 - 84      -> "AB"       65 - 69 -> "C"
        75 - 79      -> "B"        50 - 64 -> "D"
                                   below 50 -> "E"
    EN: Compare with >= so decimals work too: 84.75 is "AB", not "A".
    ID: Bandingkan dengan >= supaya desimal juga benar: 84.75 itu "AB", bukan "A".
    score_to_grade(84.75) -> "AB"
    """
    pass


def grade_points(grade):
    """
    Check 9: Return the grade points (bobot) of a letter grade.
    ID: Kembalikan bobot nilai dari sebuah huruf grade.
        A=4.0, AB=3.5, B=3.0, BC=2.5, C=2.0, D=1.0, E=0.0
    EN: Unknown grade -> 0.0. Hint: a dictionary + .get() is perfect here.
    ID: Grade yang tidak dikenal -> 0.0. Petunjuk: dictionary + .get() cocok di sini.
    grade_points("AB") -> 3.5
    """
    pass


def is_passing(grade):
    """
    Check 10: Return True if the grade is C or better (A, AB, B, BC, C).
    ID: Kembalikan True jika grade-nya C atau lebih baik (A, AB, B, BC, C).
    is_passing("C") -> True
    is_passing("D") -> False
    """
    pass


def average(scores):
    """
    Check 11: Return the average of a list of numbers, rounded to 2 decimals.
    EN: If the list is empty, return 0.0 (don't divide by zero!).
    ID: Kembalikan rata-rata dari list angka, dibulatkan 2 angka desimal.
        Jika list-nya kosong, kembalikan 0.0 (jangan membagi dengan nol!).
    average([88, 92, 85, 90]) -> 88.75
    average([80, 85, 91])     -> 85.33
    """
    pass


def weighted_gpa(scores, credits):
    """
    Check 12: Return the GPA weighted by credits, rounded to 2 decimals.
    EN: scores[i] belongs to credits[i]. Steps:
        1. for each course: score -> grade (score_to_grade) -> points (grade_points)
        2. GPA = sum of (points * credits) / sum of credits
        If the total credits is 0, return 0.0.
    ID: Kembalikan IPK berbobot SKS, dibulatkan 2 angka desimal.
        scores[i] pasangannya credits[i]. Langkah:
        1. untuk setiap mata kuliah: nilai -> grade (score_to_grade) -> bobot (grade_points)
        2. IPK = jumlah (bobot * SKS) / jumlah SKS
        Jika total SKS-nya 0, kembalikan 0.0.
    weighted_gpa([95, 58, 90, 88], [3, 3, 2, 2]) -> 3.1
        (A*3 + D*3 + A*2 + A*2 = 12 + 3 + 8 + 8 = 31, 31 / 10 = 3.1)
    """
    pass


# ---------------------------------------------------------------------------
# PART 3 - Input validation (build step 4)
# EN: These functions check text typed by the user. If the text is wrong,
#     they RAISE a ValueError with a clear message (Topic 08). The menu then
#     catches it with try/except, prints the message, and asks again.
# ID: Fungsi-fungsi ini mengecek teks yang diketik pengguna. Kalau teksnya
#     salah, fungsi ini me-RAISE ValueError dengan pesan yang jelas (Topik 08).
#     Lalu menu menangkapnya dengan try/except, mencetak pesannya, dan
#     bertanya lagi.
# ---------------------------------------------------------------------------
def validate_score(text):
    """
    Check 13: Turn the typed text into a score (int) from 0 to 100.
    EN: - Not a whole number ("abc", "85.5", "") -> raise ValueError
        - Outside 0-100 ("150", "-5")            -> raise ValueError
        - Otherwise return the score as an int. Spaces around it are OK.
    ID: Ubah teks yang diketik menjadi nilai (int) dari 0 sampai 100.
        - Bukan bilangan bulat ("abc", "85.5", "") -> raise ValueError
        - Di luar 0-100 ("150", "-5")              -> raise ValueError
        - Selain itu kembalikan nilainya sebagai int. Spasi di sekitarnya boleh.
    validate_score(" 90 ") -> 90
    validate_score("150")  -> raises ValueError("Score must be between 0 and 100.")
    """
    pass


def validate_name(text):
    """
    Check 14: Clean the typed name and check it.
    EN: - Remove the spaces at the start and end.
        - Empty                 -> raise ValueError("Name cannot be empty.")
        - Longer than 25 chars  -> raise ValueError("Name must be at most 25 characters.")
        - Contains a digit      -> raise ValueError("Name cannot contain numbers.")
        - Otherwise return the name in Title Case.
    ID: Rapikan nama yang diketik lalu cek.
        - Buang spasi di awal dan akhir.
        - Kosong                -> raise ValueError (pesan di atas)
        - Lebih dari 25 karakter -> raise ValueError
        - Ada angkanya          -> raise ValueError
        - Selain itu kembalikan namanya dalam format Title Case.
    validate_name("  dewi lestari ") -> "Dewi Lestari"
    validate_name("Budi 2")          -> raises ValueError
    """
    pass


# ---------------------------------------------------------------------------
# PART 4 - Working with the whole class (build step 5)
# EN: `students` is a list of Student objects (Topic 10: list of objects).
# ID: `students` adalah list berisi objek Student (Topik 10: list of objects).
# ---------------------------------------------------------------------------
def find_student(students, name):
    """
    Check 15: Return the Student whose name matches, or None if not found.
    EN: Case-insensitive and ignore spaces around the typed name:
        "  ANI wijaya " finds "Ani Wijaya".
    ID: Kembalikan Student yang namanya cocok, atau None kalau tidak ada.
        Tidak peduli huruf besar/kecil dan abaikan spasi di sekitar nama:
        "  ANI wijaya " menemukan "Ani Wijaya".
    """
    pass


def best_student(students):
    """
    Check 16: Return the Student with the HIGHEST average.
    EN: Empty list -> None. If two students have the same average,
        return the one that comes first in the list.
    ID: Kembalikan Student dengan rata-rata TERTINGGI.
        List kosong -> None. Kalau ada dua mahasiswa dengan rata-rata sama,
        kembalikan yang posisinya lebih dulu di list.
    """
    pass


def worst_student(students):
    """
    Check 17: Return the Student with the LOWEST average.
    EN: Same rules as best_student().
    ID: Kembalikan Student dengan rata-rata TERENDAH. Aturannya sama
        dengan best_student().
    """
    pass


def class_average(students):
    """
    Check 18: Return the average of all the students' averages (2 decimals).
    EN: Empty list -> 0.0. Hint: build a list of averages, then reuse average().
    ID: Kembalikan rata-rata dari rata-rata semua mahasiswa (2 angka desimal).
        List kosong -> 0.0. Petunjuk: buat list berisi rata-rata, lalu
        pakai ulang average().
    """
    pass


def count_passing(students):
    """
    Check 19: Return how many students have passed (has_passed() is True).
    ID: Kembalikan jumlah mahasiswa yang lulus (has_passed() bernilai True).
    """
    pass


# ---------------------------------------------------------------------------
# PART 5 - Files (build step 6)
# EN: The class is saved as a CSV file, one student per row:
#         name,Algorithms,Discrete Mathematics,English,Pancasila
#         Ani Wijaya,88,92,85,90
#     Open the file in VS Code or Excel to see what you saved.
# ID: Kelas disimpan sebagai file CSV, satu mahasiswa per baris (lihat di
#     atas). Buka filenya di VS Code atau Excel untuk melihat isinya.
# ---------------------------------------------------------------------------
def save_students(students, file_path):
    """
    Check 20: Write all students to a CSV file and return how many were saved.
    EN: - Open the file with mode "w" and newline="" (csv needs it, otherwise
          Windows adds empty lines).
        - First row (header): "name" + the COURSE_NAMES.
        - Then one row per student: the name + the scores.
    ID: Tulis semua mahasiswa ke file CSV lalu kembalikan jumlah yang disimpan.
        - Buka file dengan mode "w" dan newline="" (csv membutuhkannya, kalau
          tidak, Windows menambahkan baris kosong).
        - Baris pertama (header): "name" + COURSE_NAMES.
        - Lalu satu baris per mahasiswa: nama + nilai-nilainya.
    """
    pass


def load_students(file_path):
    """
    Check 21: Read students from a CSV file. Return TWO values:
              (list of Student objects, number of skipped rows)
    EN: - File does not exist -> return ([], 0)   (except FileNotFoundError)
        - Skip the header row. Ignore completely empty rows.
        - A row is BROKEN if it doesn't have 1 + len(COURSE_NAMES) columns,
          or the name / a score is invalid. Reuse validate_name() and
          validate_score() and catch their ValueError.
          Broken rows are skipped and counted, the program must not crash.
    ID: Baca mahasiswa dari file CSV. Kembalikan DUA nilai:
              (list objek Student, jumlah baris yang dilewati)
        - File tidak ada -> kembalikan ([], 0)   (except FileNotFoundError)
        - Lewati baris header. Abaikan baris yang benar-benar kosong.
        - Sebuah baris RUSAK kalau jumlah kolomnya bukan 1 + len(COURSE_NAMES),
          atau nama / nilainya tidak valid. Pakai ulang validate_name() dan
          validate_score() lalu tangkap ValueError-nya.
          Baris rusak dilewati dan dihitung, program tidak boleh error.
    """
    pass


# ---------------------------------------------------------------------------
# PART 6 - The menu (build step 3 to 6)
# EN: Not tested by --check. Run the app and compare it with the
#     "Sample run" in README.md.
# ID: Tidak diuji oleh --check. Jalankan aplikasinya dan bandingkan dengan
#     "Sample run" di README.md.
# ---------------------------------------------------------------------------
def main_menu():
    """
    EN: The main loop of the app. It runs until the user chooses 0 (Exit).
    ID: Perulangan utama aplikasi. Berjalan terus sampai pengguna memilih 0 (Exit).
    """
    # TODO 1 (step 6) - Auto-load / Muat otomatis
    #   EN: If DATA_FILE exists (DATA_FILE.exists() is True), load it with
    #       load_students(). Otherwise, if SAMPLE_FILE exists, load the sample.
    #       Otherwise start with an empty list. Print how many were loaded.
    #       Until you reach step 6, simply start with: students = []
    #   ID: Kalau DATA_FILE ada (DATA_FILE.exists() bernilai True), muat dengan
    #       load_students(). Kalau tidak, dan SAMPLE_FILE ada, muat data contoh.
    #       Kalau tidak ada juga, mulai dengan list kosong. Cetak berapa yang dimuat.
    #       Sebelum sampai langkah 6, mulai saja dengan: students = []
    #
    # TODO 2 (step 3) - The loop / Perulangannya
    #   EN: while True: print the menu below, then ask "Choose (0-7): ".
    #       Compare the TEXT the user typed ("1", "2", ...) with if/elif,
    #       so you don't need int() and "abc" can't crash anything.
    #   ID: while True: cetak menu di bawah, lalu tanya "Choose (0-7): ".
    #       Bandingkan TEKS yang diketik ("1", "2", ...) dengan if/elif,
    #       jadi tidak perlu int() dan "abc" tidak bisa membuat error.
    #
    #       ===== Student Grade Manager =====
    #       1. Add a student
    #       2. List all students
    #       3. Search a student
    #       4. Class statistics
    #       5. Delete a student
    #       6. Save to file
    #       7. Load from file
    #       0. Exit
    #
    # TODO 3 (step 3) - "0" and unknown choices / "0" dan pilihan tak dikenal
    #   EN: "0" prints "Goodbye!" and stops the loop (break).
    #       Anything else prints "Unknown choice. Please type a number from 0 to 7."
    #   ID: "0" mencetak "Goodbye!" lalu menghentikan loop (break).
    #       Selain itu cetak "Unknown choice. Please type a number from 0 to 7."
    #
    # TODO 4 (step 4) - "1" Add a student / Tambah mahasiswa
    #   EN: Ask for the name until validate_name() accepts it and the name is
    #       not already in the class (find_student). Then ask a score for each
    #       course, e.g. "Score for Algorithms (3 credits): ", until
    #       validate_score() accepts it. Use try/except ValueError and print
    #       "Error: <message> Try again." Then create a Student and append it.
    #   ID: Tanya nama sampai validate_name() menerimanya dan namanya belum ada
    #       di kelas (find_student). Lalu tanya nilai setiap mata kuliah sampai
    #       validate_score() menerimanya. Pakai try/except ValueError dan cetak
    #       "Error: <pesan> Try again." Lalu buat Student dan append ke list.
    #
    # TODO 5 (step 4) - "2" List all students / Tampilkan semua mahasiswa
    #   EN: Print a header with the same widths as to_row(), then one
    #       to_row() per student (numbered from 1). Empty class -> print
    #       "No students yet. Choose 1 to add one."
    #   ID: Cetak header dengan lebar yang sama seperti to_row(), lalu satu
    #       to_row() per mahasiswa (nomor mulai dari 1). Kelas kosong ->
    #       cetak "No students yet. Choose 1 to add one."
    #
    # TODO 6 (step 5) - "3" Search / Cari
    #   EN: Ask for a name, use find_student(). Found -> print each course
    #       with credits, score and grade, then average, grade, GPA, status.
    #       Not found -> "No student named <name>."
    #   ID: Tanya nama, pakai find_student(). Ketemu -> cetak setiap mata
    #       kuliah dengan SKS, nilai, dan grade-nya, lalu rata-rata, grade,
    #       IPK, dan status. Tidak ketemu -> "No student named <name>."
    #
    # TODO 7 (step 5) - "4" Class statistics / Statistik kelas
    #   EN: Number of students, best_student(), worst_student(),
    #       class_average(), count_passing(). Empty class -> friendly message.
    #   ID: Jumlah mahasiswa, best_student(), worst_student(),
    #       class_average(), count_passing(). Kelas kosong -> pesan yang ramah.
    #
    # TODO 8 (step 5) - "5" Delete / Hapus
    #   EN: Find the student, ask "Delete <student>? (y/n): ", remove it from
    #       the list only if the answer is "y".
    #   ID: Cari mahasiswanya, tanya "Delete <student>? (y/n): ", hapus dari
    #       list hanya kalau jawabannya "y".
    #
    # TODO 9 (step 6) - "6" Save and "7" Load / Simpan dan Muat
    #   EN: "6": save_students(students, DATA_FILE) and print how many.
    #       "7": if DATA_FILE exists, replace the list with load_students();
    #       otherwise print that there is no saved file yet.
    #   ID: "6": save_students(students, DATA_FILE) lalu cetak jumlahnya.
    #       "7": kalau DATA_FILE ada, ganti list-nya dengan hasil load_students();
    #       kalau tidak, cetak bahwa belum ada file yang disimpan.
    #
    # Tip: write one small function per menu branch (e.g. def menu_add(students):)
    #      so main_menu() stays short and easy to read.
    # Tips: buat satu fungsi kecil per cabang menu (misal def menu_add(students):)
    #       supaya main_menu() tetap pendek dan mudah dibaca.

    # EN: Delete the two lines below when you start writing the menu.
    # ID: Hapus dua baris di bawah ini saat kamu mulai menulis menu.
    print("main_menu() is not implemented yet (build step 3).")
    print(f"Meanwhile, test your functions: python {Path(__file__).name} --check")


# ===========================================================================
# CHECKER - do not edit below this line / jangan ubah bagian di bawah ini
# ===========================================================================
RAISES = "raises ValueError"            # expected result for "must raise" cases
CHECK_FILE = HERE / "output_check.csv"  # temporary file, safe to delete
MISSING_FILE = HERE / "output_missing.csv"

CHECK_STUDENTS = {
    "ani": ("Ani Wijaya", [88, 92, 85, 90]),
    "budi": ("Budi Santoso", [72, 65, 80, 78]),
    "citra": ("Citra Lestari", [95, 58, 90, 88]),
    "dimas": ("Dimas Pratama", [45, 52, 60, 70]),
    "eka": ("Eka Putri", [80, 77, 68, 85]),
    "fajar": ("Fajar Nugroho", [78, 72, 80, 65]),
}


def _make(key):
    name, scores = CHECK_STUDENTS[key]
    return Student(name, scores)


def _make_list(keys):
    students = []
    for key in keys:
        students.append(_make(key))
    return students


def _name_of(student):
    if student is None:
        return None
    return student.name


def _attributes(key):
    student = _make(key)
    return (student.name, student.scores)


def _method(method, key):
    # Student.get_average(ani) does the same as ani.get_average()
    return method(_make(key))


def _row(key, number):
    return _make(key).to_row(number)


def _find_name(keys, name):
    return _name_of(find_student(_make_list(keys), name))


def _best_name(keys):
    return _name_of(best_student(_make_list(keys)))


def _worst_name(keys):
    return _name_of(worst_student(_make_list(keys)))


def _class_average_of(keys):
    return class_average(_make_list(keys))


def _count_passing_of(keys):
    return count_passing(_make_list(keys))


def _save_result(keys):
    with open(CHECK_FILE, "w") as file:   # start with an empty file
        file.write("")
    count = save_students(_make_list(keys), CHECK_FILE)
    rows = []
    with open(CHECK_FILE, "r", newline="") as file:
        for row in csv.reader(file):
            rows.append(row)
    if count is None and len(rows) == 0:
        return None
    return (count, rows)


def _load_summary(file_path):
    result = load_students(file_path)
    if result is None:
        return None
    students, skipped = result
    names = []
    for student in students:
        names.append(student.name)
    first_scores = []
    if len(students) > 0:
        first_scores = students[0].scores
    return (names, first_scores, skipped)


def _load_text(text):
    with open(CHECK_FILE, "w") as file:
        file.write(text)
    return _load_summary(CHECK_FILE)


def _try(func, args):
    """Call func(*args) without letting a crash stop the checker."""
    try:
        return func(*args)
    except ValueError:
        return RAISES
    except AttributeError:
        return None              # an attribute is missing: probably not done yet
    except Exception as error:
        return f"crashed: {type(error).__name__}: {error}"


def _case(func, args, expected, call_text=""):
    if call_text == "":
        if len(args) == 1:
            call_text = f"{func.__name__}({args[0]!r})"
        else:
            call_text = f"{func.__name__}{args!r}"
    return (call_text, _try(func, args), expected)


def _report(number, title, cases):
    started = False
    for call_text, got, expected in cases:
        if got is not None:
            started = True
    if not started:
        print(f"[TODO] {number:>2}. {title}")
        return 0
    for call_text, got, expected in cases:
        if got != expected:
            print(f"[FAIL] {number:>2}. {title}")
            print(f"         {call_text}")
            print(f"         expected: {expected!r}")
            print(f"         got:      {got!r}")
            return 0
    print(f"[PASS] {number:>2}. {title}")
    return 1


def app_is_ready():
    """True when Part 1 and Part 2 return real values, so the menu can use them."""
    try:
        student = Student("Test", [80, 80, 80, 80])
        answers = [
            student.name, student.get_average(), student.get_grade(),
            student.get_gpa(), student.has_passed(), student.__str__(),
            student.to_row(1), score_to_grade(80), grade_points("A"),
            is_passing("A"), average([80]), weighted_gpa([80], [3]),
        ]
    except Exception:
        return False
    return None not in answers


def run_checker():
    header = "name,Algorithms,Discrete Mathematics,English,Pancasila\n"
    text_1 = (header + "Ani Wijaya,88,92,85,90\n\nBudi Santoso,72,abc,80,78\n"
              + "Citra Lestari,95,58,90\nDimas Pratama,45,52,60,70\n")
    text_2 = header + "eka putri,80,77,68,85\n,70,70,70,70\nGita Ayu,101,90,90,90\n"
    saved_rows = [
        ["name", "Algorithms", "Discrete Mathematics", "English", "Pancasila"],
        ["Ani Wijaya", "88", "92", "85", "90"],
        ["Dimas Pratama", "45", "52", "60", "70"],
    ]

    checks = [
        (1, "Student.__init__", [
            _case(_attributes, ("ani",), ("Ani Wijaya", [88, 92, 85, 90]), "(ani.name, ani.scores)"),
            _case(_attributes, ("dimas",), ("Dimas Pratama", [45, 52, 60, 70]), "(dimas.name, dimas.scores)"),
        ]),
        (2, "Student.get_average", [
            _case(_method, (Student.get_average, "ani"), 88.75, "ani.get_average()"),
            _case(_method, (Student.get_average, "dimas"), 56.75, "dimas.get_average()"),
            _case(_method, (Student.get_average, "eka"), 77.5, "eka.get_average()"),
        ]),
        (3, "Student.get_grade", [
            _case(_method, (Student.get_grade, "ani"), "A", "ani.get_grade()"),
            _case(_method, (Student.get_grade, "citra"), "AB", "citra.get_grade()"),
            _case(_method, (Student.get_grade, "dimas"), "D", "dimas.get_grade()"),
        ]),
        (4, "Student.get_gpa", [
            _case(_method, (Student.get_gpa, "citra"), 3.1, "citra.get_gpa()"),
            _case(_method, (Student.get_gpa, "budi"), 2.65, "budi.get_gpa()"),
            _case(_method, (Student.get_gpa, "ani"), 4.0, "ani.get_gpa()"),
        ]),
        (5, "Student.has_passed", [
            _case(_method, (Student.has_passed, "ani"), True, "ani.has_passed()"),
            _case(_method, (Student.has_passed, "dimas"), False, "dimas.has_passed()"),
            _case(_method, (Student.has_passed, "budi"), True, "budi.has_passed()"),
        ]),
        (6, "Student.__str__", [
            _case(_method, (Student.__str__, "eka"), "Eka Putri (average 77.50, grade B)", "str(eka)"),
            _case(_method, (Student.__str__, "citra"), "Citra Lestari (average 82.75, grade AB)", "str(citra)"),
        ]),
        (7, "Student.to_row", [
            _case(_row, ("ani", 1), "  1  Ani Wijaya                  88.75  A     4.00  PASS", "ani.to_row(1)"),
            _case(_row, ("dimas", 12), " 12  Dimas Pratama               56.75  D     1.00  FAIL", "dimas.to_row(12)"),
        ]),
        (8, "score_to_grade", [
            _case(score_to_grade, (100,), "A"), _case(score_to_grade, (85,), "A"),
            _case(score_to_grade, (84.75,), "AB"), _case(score_to_grade, (80,), "AB"),
            _case(score_to_grade, (79,), "B"), _case(score_to_grade, (70,), "BC"),
            _case(score_to_grade, (65,), "C"), _case(score_to_grade, (64.5,), "D"),
            _case(score_to_grade, (50,), "D"), _case(score_to_grade, (49,), "E"),
            _case(score_to_grade, (0,), "E"),
        ]),
        (9, "grade_points", [
            _case(grade_points, ("A",), 4.0), _case(grade_points, ("AB",), 3.5),
            _case(grade_points, ("BC",), 2.5), _case(grade_points, ("D",), 1.0),
            _case(grade_points, ("E",), 0.0), _case(grade_points, ("X",), 0.0),
        ]),
        (10, "is_passing", [
            _case(is_passing, ("A",), True), _case(is_passing, ("C",), True),
            _case(is_passing, ("BC",), True), _case(is_passing, ("D",), False),
            _case(is_passing, ("E",), False),
        ]),
        (11, "average", [
            _case(average, ([88, 92, 85, 90],), 88.75),
            _case(average, ([80, 85, 91],), 85.33),
            _case(average, ([100],), 100.0),
            _case(average, ([],), 0.0),
        ]),
        (12, "weighted_gpa", [
            _case(weighted_gpa, ([95, 58, 90, 88], [3, 3, 2, 2]), 3.1),
            _case(weighted_gpa, ([72, 65, 80, 78], [3, 3, 2, 2]), 2.65),
            _case(weighted_gpa, ([90], [4]), 4.0),
            _case(weighted_gpa, ([], []), 0.0),
        ]),
        (13, "validate_score", [
            _case(validate_score, ("85",), 85), _case(validate_score, (" 90 ",), 90),
            _case(validate_score, ("0",), 0), _case(validate_score, ("100",), 100),
            _case(validate_score, ("abc",), RAISES), _case(validate_score, ("85.5",), RAISES),
            _case(validate_score, ("",), RAISES), _case(validate_score, ("150",), RAISES),
            _case(validate_score, ("-5",), RAISES),
        ]),
        (14, "validate_name", [
            _case(validate_name, ("  dewi lestari ",), "Dewi Lestari"),
            _case(validate_name, ("ANI wijaya",), "Ani Wijaya"),
            _case(validate_name, ("",), RAISES), _case(validate_name, ("   ",), RAISES),
            _case(validate_name, ("Budi 2",), RAISES),
            _case(validate_name, ("Abcdefghijklmnopqrstuvwxyz",), RAISES),
        ]),
        (15, "find_student", [
            _case(_find_name, (["budi", "ani", "dimas"], "Budi Santoso"), "Budi Santoso",
                  "find_student([budi, ani, dimas], 'Budi Santoso')"),
            _case(_find_name, (["budi", "ani", "dimas"], "ani wijaya"), "Ani Wijaya",
                  "find_student([budi, ani, dimas], 'ani wijaya')"),
            _case(_find_name, (["budi", "ani", "dimas"], "  DIMAS PRATAMA "), "Dimas Pratama",
                  "find_student([budi, ani, dimas], '  DIMAS PRATAMA ')"),
            _case(_find_name, (["budi", "ani", "dimas"], "Citra Lestari"), None,
                  "find_student([budi, ani, dimas], 'Citra Lestari')"),
        ]),
        (16, "best_student", [
            _case(_best_name, (["budi", "ani", "dimas"],), "Ani Wijaya", "best_student([budi, ani, dimas])"),
            _case(_best_name, (["budi", "fajar"],), "Budi Santoso", "best_student([budi, fajar])  (same average)"),
            _case(_best_name, (["fajar", "budi"],), "Fajar Nugroho", "best_student([fajar, budi])  (same average)"),
            _case(_best_name, ([],), None, "best_student([])"),
        ]),
        (17, "worst_student", [
            _case(_worst_name, (["budi", "dimas", "ani"],), "Dimas Pratama", "worst_student([budi, dimas, ani])"),
            _case(_worst_name, (["fajar", "budi"],), "Fajar Nugroho", "worst_student([fajar, budi])  (same average)"),
            _case(_worst_name, ([],), None, "worst_student([])"),
        ]),
        (18, "class_average", [
            _case(_class_average_of, (["budi", "ani", "dimas"],), 73.08, "class_average([budi, ani, dimas])"),
            _case(_class_average_of, (["ani", "citra"],), 85.75, "class_average([ani, citra])"),
            _case(_class_average_of, ([],), 0.0, "class_average([])"),
        ]),
        (19, "count_passing", [
            _case(_count_passing_of, (["budi", "ani", "dimas"],), 2, "count_passing([budi, ani, dimas])"),
            _case(_count_passing_of, (["dimas"],), 0, "count_passing([dimas])"),
            _case(_count_passing_of, ([],), 0, "count_passing([])"),
        ]),
        (20, "save_students", [
            _case(_save_result, (["ani", "dimas"],), (2, saved_rows),
                  "save_students([ani, dimas], CHECK_FILE)  -> (return value, rows in the file)"),
            _case(_save_result, ([],), (0, saved_rows[:1]),
                  "save_students([], CHECK_FILE)  -> (return value, rows in the file)"),
        ]),
        (21, "load_students", [
            _case(_load_text, (text_1,), (["Ani Wijaya", "Dimas Pratama"], [88, 92, 85, 90], 2),
                  f"load_students(file with {text_1!r})  -> (names, first scores, skipped)"),
            _case(_load_text, (text_2,), (["Eka Putri"], [80, 77, 68, 85], 2),
                  f"load_students(file with {text_2!r})  -> (names, first scores, skipped)"),
            _case(_load_summary, (MISSING_FILE,), ([], [], 0),
                  "load_students(a file that does not exist)  -> (names, first scores, skipped)"),
        ]),
    ]

    print("=" * 60)
    print("  Mini Project - Student Grade Manager - checker")
    print("=" * 60)
    print("Test students (functions that return a Student show its name):")
    for key, data in CHECK_STUDENTS.items():
        print(f"  {key:<6} = Student({data[0]!r}, {data[1]})")
    print("-" * 60)
    score = 0
    for number, title, cases in checks:
        score += _report(number, title, cases)
    print("=" * 60)
    print(f"  Score: {score} / {len(checks)}")
    if score == len(checks):
        print("  All checks passed. Now run the app without --check!")
    print("=" * 60)


if __name__ == "__main__":
    # EN: sys.argv is the list of words you typed to start this file.
    #     "python grade_manager_unsolved.py --check" gives
    #     ["grade_manager_unsolved.py", "--check"], so the line below is
    #     True only when you add --check.
    # ID: sys.argv adalah list berisi kata-kata yang kamu ketik untuk
    #     menjalankan file ini. "python grade_manager_unsolved.py --check"
    #     menghasilkan ["grade_manager_unsolved.py", "--check"], jadi baris
    #     di bawah ini bernilai True hanya kalau kamu menambahkan --check.
    if "--check" in sys.argv:
        run_checker()
    elif app_is_ready():
        main_menu()
    else:
        print("The app is not implemented yet.")
        print("Finish Part 1 (Student class) and Part 2 (grade functions) first.")
        print(f"See what is missing with: python {Path(__file__).name} --check")
