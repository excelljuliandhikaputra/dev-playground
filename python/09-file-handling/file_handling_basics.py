"""
Topic 09 - File Handling
Topik 09 - Mengolah File
=========================
EN: Topics covered in this lesson file.
ID: Topik yang dibahas di file ini.

    1. Where is my file? (pathlib)          | Di mana file-ku? (pathlib)
    2. Writing a file: open() with "w"      | Menulis file: open() dengan "w"
    3. Reading the whole file: read()       | Membaca seluruh file: read()
    4. Reading line by line                 | Membaca baris demi baris
    5. Adding to a file: "a"                | Menambah isi file: "a"
    6. Processing lines                     | Mengolah baris
    7. CSV files: csv.reader                | File CSV: csv.reader
    8. CSV files: csv.DictReader            | File CSV: csv.DictReader
    9. Writing CSV: csv.writer              | Menulis CSV: csv.writer
   10. Missing files and common mistakes    | File tidak ada dan kesalahan umum

Run this file:  python file_handling_basics.py
EN: It reads students.txt and scores.csv (same folder) and creates
    output_demo.txt and output_demo.csv. The output_ files can be deleted.
ID: File ini membaca students.txt dan scores.csv (folder yang sama) dan
    membuat output_demo.txt serta output_demo.csv. File output_ boleh dihapus.
"""

# EN: `import` loads an extra toolbox (a module) that comes with Python.
# ID: `import` memuat "kotak perkakas" tambahan (modul) bawaan Python.
import csv
from pathlib import Path


# ---------------------------------------------------------------------------
# 1. Where is my file? (pathlib)
# EN: open("students.txt") looks for the file in the folder your TERMINAL is
#     in, which is not always the folder of this .py file. In VS Code the
#     terminal often starts in a parent folder -> FileNotFoundError.
#     The pattern below always points to the folder of THIS .py file.
#     Accept it for now; you don't need to understand every part yet:
#       __file__      = the path of this .py file
#       .parent       = the folder that contains it
#       HERE / "x"    = "the file x inside that folder" (works on Windows too)
# ID: open("students.txt") mencari file di folder tempat TERMINAL-mu berada,
#     yang belum tentu sama dengan folder file .py ini. Di VS Code, terminal
#     sering dimulai dari folder induk -> FileNotFoundError.
#     Pola di bawah ini selalu menunjuk ke folder file .py INI.
#     Terima saja dulu; belum perlu paham setiap bagiannya:
#       __file__      = path file .py ini
#       .parent       = folder yang berisi file itu
#       HERE / "x"    = "file x di dalam folder itu" (berfungsi juga di Windows)
# ---------------------------------------------------------------------------
HERE = Path(__file__).parent          # the folder this .py file is in
data_file = HERE / "students.txt"

print(data_file.name)                 # students.txt
# print(HERE)                         -> the full path of your folder (different on every laptop)
#                                        path lengkap foldermu (beda di setiap laptop)


# ---------------------------------------------------------------------------
# 2. Writing a file: open() with "w"
# EN: open(path, mode) opens a file. The three modes you need:
#       "r"  read (the default)   -> error if the file doesn't exist
#       "w"  write                -> creates the file, or ERASES it first!
#       "a"  append               -> creates the file, or adds to the END
#     `with open(...) as file:` closes the file automatically when the
#     indented block ends, even if an error happens. Always use `with`.
#     write() only accepts text and does NOT add "\n" for you.
# ID: open(path, mode) membuka file. Tiga mode yang kamu butuhkan:
#       "r"  baca (default)       -> error kalau file-nya tidak ada
#       "w"  tulis                -> membuat file, atau MENGHAPUS isinya dulu!
#       "a"  tambah (append)      -> membuat file, atau menambah di AKHIR
#     `with open(...) as file:` menutup file secara otomatis saat blok yang
#     menjorok selesai, bahkan kalau terjadi error. Selalu pakai `with`.
#     write() hanya menerima teks dan TIDAK menambahkan "\n" sendiri.
# ---------------------------------------------------------------------------
demo_file = HERE / "output_demo.txt"

with open(demo_file, "w") as file:
    file.write("Algorithms\n")
    file.write("Calculus\n")
    file.write("English\n")

print(f"Saved {demo_file.name}")      # Saved output_demo.txt


# ---------------------------------------------------------------------------
# 3. Reading the whole file: read()
# EN: read() gives the whole file as ONE string, including every "\n".
#     The text already ends with "\n", so use print(..., end="") to avoid
#     an extra empty line.
# ID: read() memberikan seluruh isi file sebagai SATU string, termasuk
#     setiap "\n". Teksnya sudah diakhiri "\n", jadi pakai print(..., end="")
#     supaya tidak ada baris kosong tambahan.
# ---------------------------------------------------------------------------
with open(demo_file, "r") as file:
    content = file.read()

print(content, end="")
# Algorithms
# Calculus
# English
print(len(content))                   # 28  (25 letters + three "\n" / 25 huruf + tiga "\n")


# ---------------------------------------------------------------------------
# 4. Reading line by line
# EN: A file can be used directly in a for loop: one line per round.
#     Every line still ends with "\n", so use .strip() (Topic 07).
#     readline()  reads ONE line.
#     readlines() reads all (remaining) lines into a list.
# ID: File bisa langsung dipakai di for loop: satu baris per putaran.
#     Setiap baris masih diakhiri "\n", jadi pakai .strip() (Topik 07).
#     readline()  membaca SATU baris.
#     readlines() membaca semua baris (yang tersisa) ke dalam list.
# ---------------------------------------------------------------------------
with open(demo_file) as file:         # "r" is the default / "r" adalah default
    for line in file:
        print(f"Course: {line.strip()}")
# Course: Algorithms
# Course: Calculus
# Course: English

with open(demo_file) as file:
    first_line = file.readline()
    other_lines = file.readlines()

print(first_line.strip())             # Algorithms
print(other_lines)                    # ['Calculus\n', 'English\n']


# ---------------------------------------------------------------------------
# 5. Adding to a file: "a"
# EN: "a" keeps the old content and writes at the end.
# ID: "a" mempertahankan isi lama dan menulis di bagian akhir.
# ---------------------------------------------------------------------------
with open(demo_file, "a") as file:
    file.write("Pancasila\n")

with open(demo_file) as file:
    all_lines = file.readlines()

print(len(all_lines))                 # 4
print(all_lines[-1].strip())          # Pancasila


# ---------------------------------------------------------------------------
# 6. Processing lines
# EN: The usual recipe: open -> loop over the lines -> strip -> check or
#     convert -> collect the result in a list (or a counter).
# ID: Resep yang biasa dipakai: buka -> loop setiap baris -> strip -> cek
#     atau konversi -> kumpulkan hasilnya di list (atau penghitung).
# ---------------------------------------------------------------------------
e_names = []
with open(data_file) as file:
    for index, line in enumerate(file):
        name = line.strip()
        print(f"{index + 1}. {name}")
        if name.startswith("E"):
            e_names.append(name)
# 1. Ani
# 2. Budi
# 3. Citra
# 4. Dina
# 5. Eko
# 6. Excell
# 7. Fajar
# 8. Gita

print(e_names)                        # ['Eko', 'Excell']


# ---------------------------------------------------------------------------
# 7. CSV files: csv.reader
# EN: A CSV file is a table saved as text: one row per line, values
#     separated by commas. The first line is usually the header.
#     csv.reader gives every row as a LIST of strings.
#     next(reader) reads ONE row. Use it to take the header out first.
#     Every value is TEXT: use int(row[2]) to calculate with it.
#     Open CSV files with newline="" (the csv module handles line endings).
# ID: File CSV adalah tabel yang disimpan sebagai teks: satu baris per baris
#     tabel, nilainya dipisah koma. Baris pertama biasanya header.
#     csv.reader memberikan setiap baris sebagai LIST berisi string.
#     next(reader) membaca SATU baris. Pakai untuk mengambil header lebih dulu.
#     Semua nilai berupa TEKS: pakai int(row[2]) untuk menghitungnya.
#     Buka file CSV dengan newline="" (akhir baris diurus oleh modul csv).
# ---------------------------------------------------------------------------
scores_file = HERE / "scores.csv"

with open(scores_file, newline="") as file:
    reader = csv.reader(file)
    header = next(reader)
    print(header)                         # ['name', 'course', 'score']
    for row in reader:
        if row[1] == "Algorithms":
            print(row)
# ['Ani', 'Algorithms', '88']
# ['Budi', 'Algorithms', '62']
# ['Excell', 'Algorithms', '93']


# ---------------------------------------------------------------------------
# 8. CSV files: csv.DictReader
# EN: DictReader uses the header as keys, so every row is a DICTIONARY.
#     row["score"] is easier to read than row[2]. No next() needed:
#     the header is used automatically.
# ID: DictReader memakai header sebagai key, jadi setiap baris adalah
#     DICTIONARY. row["score"] lebih mudah dibaca daripada row[2].
#     Tidak perlu next(): header-nya otomatis dipakai.
# ---------------------------------------------------------------------------
with open(scores_file, newline="") as file:
    reader = csv.DictReader(file)
    for row in reader:
        score = int(row["score"])
        if score >= 90:
            print(f"{row['name']} got {score} in {row['course']}")
# Excell got 93 in Algorithms
# Eko got 90 in English


# ---------------------------------------------------------------------------
# 9. Writing CSV: csv.writer
# EN: writer.writerow(list) writes one row; numbers become text for you.
#     IMPORTANT: open with newline="" when writing CSV. Without it, Windows
#     puts an extra empty line after every row.
# ID: writer.writerow(list) menulis satu baris; angka otomatis jadi teks.
#     PENTING: buka dengan newline="" saat menulis CSV. Tanpa itu, di Windows
#     muncul baris kosong tambahan setelah setiap baris.
# ---------------------------------------------------------------------------
demo_csv = HERE / "output_demo.csv"
course_rows = [["Algorithms", 3], ["English", 2], ["Pancasila", 2]]

with open(demo_csv, "w", newline="") as file:
    writer = csv.writer(file)
    writer.writerow(["course", "credits"])    # header
    for course_row in course_rows:
        writer.writerow(course_row)

with open(demo_csv) as file:
    print(file.read(), end="")
# course,credits
# Algorithms,3
# English,2
# Pancasila,2


# ---------------------------------------------------------------------------
# 10. Missing files and common mistakes
# EN: Opening a file that doesn't exist with "r" raises FileNotFoundError.
#     Catch it with try/except (Topic 08).
# ID: Membuka file yang tidak ada dengan "r" memunculkan FileNotFoundError.
#     Tangkap dengan try/except (Topik 08).
#
# Python vs Java:
#   Python: with open(path) as file:  -> closes the file for you / menutup file otomatis
#   Java:   try (BufferedReader reader = new BufferedReader(new FileReader("x.txt"))) { ... }
#           ("try-with-resources", and Java forces you to handle IOException)
#           (Java mewajibkan kamu menangani IOException)
# ---------------------------------------------------------------------------
try:
    with open(HERE / "grades_2030.txt") as file:
        print(file.read())
except FileNotFoundError:
    print("File not found: grades_2030.txt")    # File not found: grades_2030.txt

# EN: Common mistakes (commented out because they are wrong):
# ID: Kesalahan umum (dijadikan komentar karena salah):

# open("students.txt")            -> only works if the terminal is in this folder,
#                                    otherwise FileNotFoundError. Use HERE / "students.txt"
#                                    hanya jalan kalau terminal ada di folder ini. Pakai HERE / "students.txt"

# file.write(90)                  -> TypeError: write() argument must be str, not int
#                                    write it as text / tulis sebagai teks: file.write(f"{90}\n")

# file.write("Algorithms")
# file.write("Calculus")          -> the file contains "AlgorithmsCalculus" (no "\n")
#                                    isinya jadi "AlgorithmsCalculus" (tanpa "\n")

# with open(scores_file, "w") as file:
#     content = file.read()       -> "w" ERASES scores.csv immediately, then read() fails
#                                    "w" langsung MENGHAPUS isi scores.csv, lalu read() gagal

# with open(demo_file) as file:
#     first = file.readline()
# second = file.readline()        -> ValueError: I/O operation on closed file
#                                    (outside the `with` block / di luar blok `with`)

# if line == "Ani":               -> always False: line is "Ani\n". Use line.strip() == "Ani"
#                                    selalu False: isinya "Ani\n". Pakai line.strip() == "Ani"
