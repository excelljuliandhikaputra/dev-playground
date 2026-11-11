"""
Topic 07 - Strings
Topik 07 - String
==================
EN: Topics covered in this lesson file.
ID: Topik yang dibahas di file ini.

    1. Quick review: index, slicing, + and *   | Ulasan singkat: indeks, slicing, + dan *
    2. Strings are immutable                   | String tidak bisa diubah (immutable)
    3. Cleaning text: strip, title, capitalize | Merapikan teks: strip, title, capitalize
    4. split() and join()                      | split() dan join()
    5. Searching: find, startswith, endswith,  | Mencari: find, startswith, endswith,
       count                                   | count
    6. replace()                               | replace()
    7. Checking content: isdigit, isalpha      | Mengecek isi: isdigit, isalpha
    8. Looping over characters                 | Perulangan per karakter
    9. f-string alignment                      | Perataan teks dengan f-string
   10. Multi-line strings                      | String multi-baris

Run this file:  python strings_basics.py
"""


# ---------------------------------------------------------------------------
# 1. Quick review: index, slicing, + and *
# EN: From Topic 02: a string is a sequence of characters. Index starts at 0,
#     -1 is the last character, [start:end] stops BEFORE end. Leave out a
#     number to go to the start/end of the text. `in` checks if a piece of
#     text is inside another one.
#     New: + joins two strings, * repeats a string.
# ID: Dari Topik 02: string adalah deretan karakter. Indeks dimulai dari 0,
#     -1 adalah karakter terakhir, [start:end] berhenti SEBELUM end. Kalau
#     salah satu angka dikosongkan, artinya sampai awal/akhir teks. `in`
#     mengecek apakah sepotong teks ada di dalam teks lain.
#     Baru: + menggabung dua string, * mengulang string.
# ---------------------------------------------------------------------------
campus = "Universitas Airlangga"

print(campus[0])            # U
print(campus[-1])           # a
print(campus[:11])          # Universitas
print(campus[12:])          # Airlangga
print(len(campus))          # 21
print("Air" in campus)      # True
print("air" in campus)      # False (capital letters matter / huruf besar-kecil dibedakan)

print("UNAIR" + " " + "Surabaya")   # UNAIR Surabaya
print("-" * 20)                     # --------------------
print("ha" * 3)                     # hahaha


# ---------------------------------------------------------------------------
# 2. Strings are immutable
# EN: You can NOT change a character inside a string. String methods never
#     change the original; they return a NEW string. To keep the result,
#     save it into a variable (often the same one).
#     (Java strings are immutable too.)
# ID: Karakter di dalam string TIDAK bisa diubah. Method string tidak pernah
#     mengubah aslinya; method mengembalikan string BARU. Supaya hasilnya
#     tersimpan, simpan ke variabel (sering ke variabel yang sama).
#     (String di Java juga immutable.)
# ---------------------------------------------------------------------------
nickname = "excell"
# nickname[0] = "E"           -> TypeError: a string can't be changed / string tidak bisa diubah

nickname.upper()                # makes "EXCELL"... but it's NOT saved / TIDAK disimpan
print(nickname)                 # excell

nickname = nickname.upper()     # save the new string / simpan string barunya
print(nickname)                 # EXCELL

fixed = "E" + "excell"[1:]      # build a new string instead / buat string baru saja
print(fixed)                    # Excell


# ---------------------------------------------------------------------------
# 3. Cleaning text: strip, title, capitalize
# EN: strip()      removes spaces, tabs (\t) and new lines (\n) at the START
#                  and END only (not in the middle).
#     title()      makes the first letter of EVERY word uppercase.
#     capitalize() makes only the FIRST letter of the text uppercase.
#     Both title() and capitalize() make all other letters lowercase.
#     You can chain methods: text.strip().title()
#     (Java uses trim() / strip() too, but has no title().)
# ID: strip()      menghapus spasi, tab (\t) dan baris baru (\n) di AWAL
#                  dan AKHIR saja (bukan di tengah).
#     title()      membuat huruf pertama SETIAP kata menjadi kapital.
#     capitalize() hanya membuat huruf PERTAMA teks menjadi kapital.
#     title() dan capitalize() membuat huruf lainnya menjadi kecil.
#     Method bisa dirangkai: text.strip().title()
#     (Java juga memakai trim() / strip(), tapi tidak punya title().)
# ---------------------------------------------------------------------------
raw_course = "   discrete MATHEMATICS  "
print(f"[{raw_course}]")                    # [   discrete MATHEMATICS  ]
print(f"[{raw_course.strip()}]")            # [discrete MATHEMATICS]
print(raw_course.strip().title())           # Discrete Mathematics
print(raw_course.strip().capitalize())      # Discrete mathematics

typed_answer = "\tPancasila\n"
print(f"[{typed_answer.strip()}]")          # [Pancasila]

# EN: Careful: title() treats every non-letter as a word break.
# ID: Hati-hati: title() menganggap setiap karakter bukan huruf sebagai batas kata.
print("it's d4 informatics".title())        # It'S D4 Informatics  (the 'S is wrong / 'S salah)


# ---------------------------------------------------------------------------
# 4. split() and join()
# EN: split() cuts a string into a LIST of words.
#       text.split()     -> splits on any spaces (extra spaces are ignored)
#       text.split(",")  -> splits on commas (or any separator you choose)
#     join() does the opposite: glues a list of strings into one string.
# ID: split() memotong string menjadi LIST berisi kata.
#       text.split()     -> memotong di setiap spasi (spasi berlebih diabaikan)
#       text.split(",")  -> memotong di setiap koma (atau pemisah lain pilihanmu)
#     join() kebalikannya: menggabung list berisi string menjadi satu string.
# ---------------------------------------------------------------------------
sentence = "I study Informatics at UNAIR"
words = sentence.split()
print(words)                    # ['I', 'study', 'Informatics', 'at', 'UNAIR']
print(words[2])                 # Informatics
print(" ".join(words))          # I study Informatics at UNAIR
print("-".join(words))          # I-study-Informatics-at-UNAIR

course_line = "Algorithms,3,88"
parts = course_line.split(",")
print(parts)                    # ['Algorithms', '3', '88']
course_name, credits_text, score_text = parts       # unpacking (Topic 03)
print(f"{course_name}: {int(score_text) + 2}")      # Algorithms: 90

messy = "Python   is  fun"
print(messy.split())            # ['Python', 'is', 'fun']
print(messy.split(" "))         # ['Python', '', '', 'is', '', 'fun']  (empty strings! / string kosong!)


# ---------------------------------------------------------------------------
# 5. Searching: find, startswith, endswith, count
# EN: find(x)        position of the FIRST x, or -1 if it's not there
#     index(x)       like find(), but CRASHES if x is not there (Topic 02)
#     startswith(x)  True if the text begins with x
#     endswith(x)    True if the text ends with x
#     count(x)       how many times x appears
#     (Java: indexOf(), startsWith(), endsWith(), contains().)
# ID: find(x)        posisi x yang PERTAMA, atau -1 kalau tidak ada
#     index(x)       mirip find(), tapi ERROR kalau x tidak ada (Topik 02)
#     startswith(x)  True kalau teks diawali x
#     endswith(x)    True kalau teks diakhiri x
#     count(x)       berapa kali x muncul
#     (Java: indexOf(), startsWith(), endsWith(), contains().)
# ---------------------------------------------------------------------------
address = "Kampus C, Surabaya"
comma = address.find(",")
print(comma)                        # 8
print(address[:comma])              # Kampus C
print(address[comma + 2:])          # Surabaya
print(address.find("Jakarta"))      # -1
# address.index("Jakarta")          -> ValueError: substring not found / tidak ditemukan

file_name = "report_algorithms.pdf"
print(file_name.startswith("report"))   # True
print(file_name.endswith(".docx"))      # False

print("banana".count("a"))              # 3
print("Airlangga".count("a"))           # 2  (the capital A is not counted / A kapital tidak dihitung)
print("Airlangga".lower().count("a"))   # 3


# ---------------------------------------------------------------------------
# 6. replace()
# EN: replace(old, new) returns a NEW string where every `old` becomes `new`.
#     Replacing with "" removes it.
# ID: replace(lama, baru) mengembalikan string BARU di mana setiap `lama`
#     diganti `baru`. Mengganti dengan "" berarti menghapusnya.
# ---------------------------------------------------------------------------
message = "I love Java. Java is fun."
print(message.replace("Java", "Python"))    # I love Python. Python is fun.
print(message)                              # I love Java. Java is fun.  (unchanged / tidak berubah)

phone = "0812-3456-7890"
print(phone.replace("-", ""))               # 081234567890
print("U N A I R".replace(" ", ""))         # UNAIR


# ---------------------------------------------------------------------------
# 7. Checking content: isdigit, isalpha
# EN: isdigit() -> True if EVERY character is a digit 0-9 (and it's not empty).
#     isalpha() -> True if EVERY character is a letter (spaces don't count!).
#     Useful to check text BEFORE casting it with int().
#     (Topic 08 shows another way: try/except.)
# ID: isdigit() -> True kalau SEMUA karakternya angka 0-9 (dan tidak kosong).
#     isalpha() -> True kalau SEMUA karakternya huruf (spasi tidak termasuk!).
#     Berguna untuk mengecek teks SEBELUM di-casting dengan int().
#     (Topik 08 menunjukkan cara lain: try/except.)
# ---------------------------------------------------------------------------
print("2026".isdigit())             # True
print("20.5".isdigit())             # False (the dot / titiknya)
print("-5".isdigit())               # False (the minus / tanda minusnya)
print("".isdigit())                 # False (empty / kosong)
print("Excell".isalpha())           # True
print("Excell Putra".isalpha())     # False (the space / spasinya)
print("D4".isalpha())               # False (the 4 / angka 4-nya)

age_text = "20"
if age_text.isdigit():
    age = int(age_text)
    print(f"Next year you will be {age + 1}.")      # Next year you will be 21.
else:
    print("Please type numbers only.")
# int("twenty")   -> ValueError: that's why we check with isdigit() first
#                    karena itu kita cek dulu dengan isdigit()


# ---------------------------------------------------------------------------
# 8. Looping over characters
# EN: A for loop over a string gives you one character at a time.
#     Combine it with counting (Topic 05) or build a NEW string with +=.
#     enumerate() also gives the position of each character.
# ID: Loop for pada string memberikan satu karakter setiap putaran.
#     Gabungkan dengan menghitung (Topik 05) atau susun string BARU dengan +=.
#     enumerate() juga memberikan posisi setiap karakter.
# ---------------------------------------------------------------------------
password = "Unair2026"
digit_count = 0
letter_count = 0
for character in password:
    if character.isdigit():
        digit_count += 1
    elif character.isalpha():
        letter_count += 1
print(f"Letters: {letter_count}, digits: {digit_count}")   # Letters: 5, digits: 4

only_digits = ""                        # start with an EMPTY string / mulai dari string KOSONG
for character in "0812-3456":
    if character.isdigit():
        only_digits += character        # add one character / tambah satu karakter
print(only_digits)                      # 08123456

for position, character in enumerate("UNAIR"):
    print(position, character, end=" | ")
print()                                 # 0 U | 1 N | 2 A | 3 I | 4 R |


# ---------------------------------------------------------------------------
# 9. f-string alignment
# EN: Inside { }, after a colon, you can set a WIDTH and an alignment:
#       {text:<10}  left-aligned in 10 characters
#       {text:>10}  right-aligned in 10 characters
#       {text:^10}  centered in 10 characters
#       {price:>10.2f}  right-aligned AND 2 decimals
#     The width is a MINIMUM: longer text is NOT cut (slice it yourself).
#     Great for printing tables and receipts.
#     (Java: String.format("%-10s", text) and "%10s".)
# ID: Di dalam { }, setelah titik dua, kamu bisa mengatur LEBAR dan perataan:
#       {text:<10}  rata kiri dalam 10 karakter
#       {text:>10}  rata kanan dalam 10 karakter
#       {text:^10}  rata tengah dalam 10 karakter
#       {price:>10.2f}  rata kanan DAN 2 desimal
#     Lebar itu MINIMUM: teks yang lebih panjang TIDAK dipotong (potong
#     sendiri dengan slicing). Cocok untuk mencetak tabel dan struk.
#     (Java: String.format("%-10s", text) dan "%10s".)
# ---------------------------------------------------------------------------
label = "UNAIR"
print(f"[{label:<10}]")         # [UNAIR     ]
print(f"[{label:>10}]")         # [     UNAIR]
print(f"[{label:^10}]")         # [  UNAIR   ]
print(f"[{label:<3}]")          # [UNAIR]  (not cut / tidak dipotong)

semester_courses = [
    {"name": "Algorithms", "credits": 3, "score": 88.5},
    {"name": "Discrete Mathematics", "credits": 3, "score": 72.25},
    {"name": "English", "credits": 2, "score": 81},
]
print(f"{'Course':<22}{'Credits':>8}{'Score':>8}")
print("-" * 38)
for course in semester_courses:
    print(f"{course['name']:<22}{course['credits']:>8}{course['score']:>8.2f}")
# Course                 Credits   Score
# --------------------------------------
# Algorithms                   3   88.50
# Discrete Mathematics         3   72.25
# English                      2   81.00


# ---------------------------------------------------------------------------
# 10. Multi-line strings
# EN: Three quotes (""" or ''') let a string span several lines. The line
#     breaks become \n characters. Docstrings (Topic 06) are multi-line
#     strings too. split("\n") turns the text into a list of lines.
#     strip() first, to remove the empty line at the start/end.
# ID: Tiga tanda kutip (""" atau ''') membuat string bisa beberapa baris.
#     Pindah barisnya menjadi karakter \n. Docstring (Topik 06) juga string
#     multi-baris. split("\n") mengubah teks menjadi list berisi baris.
#     strip() dulu, supaya baris kosong di awal/akhir hilang.
# ---------------------------------------------------------------------------
attendance_text = """
Ani
Budi
Citra
"""
print(attendance_text.split("\n"))          # ['', 'Ani', 'Budi', 'Citra', '']
names = attendance_text.strip().split("\n")
print(names)                                # ['Ani', 'Budi', 'Citra']
print(f"Present: {len(names)}")             # Present: 3

menu = """Menu:
1. Add course
2. Show courses"""
print(menu)
# Menu:
# 1. Add course
# 2. Show courses
print("Menu:\n1. Add course\n2. Show courses" == menu)     # True (same text / teks yang sama)
