"""
Topic 02 - Variables & Data Types
Topik 02 - Variabel & Tipe Data
==================================
EN: Topics covered in this lesson file.
ID: Topik yang dibahas di file ini.

    1. Creating variables                  | Membuat variabel
    2. Naming rules (snake_case)           | Aturan penamaan (snake_case)
    3. Data types + type()                 | Tipe data + type()
    4. Arithmetic operators                | Operator aritmatika
    5. f-strings + formatting decimals     | f-string + format angka desimal
    6. Type casting                        | Konversi tipe data (casting)
    7. String methods                      | Method pada string
    8. input() (reading user input)        | input() (membaca input pengguna)

Run this file:  python variables_basics.py
"""


# ---------------------------------------------------------------------------
# 1. Creating variables
# EN: A variable is a name that stores a value. Use = to assign it.
#     The value can be changed later (reassignment).
# ID: Variabel adalah nama yang menyimpan sebuah nilai. Pakai = untuk
#     mengisinya. Nilainya bisa diganti belakangan (reassignment).
# ---------------------------------------------------------------------------
name = "Excell"
age = 20
print(name)
print(age)

age = 21          # reassignment: the old value (20) is replaced
print(age)


# ---------------------------------------------------------------------------
# 2. Naming rules
# EN: - Use lowercase words joined with underscores: snake_case
#     - Can't start with a number, can't contain spaces
#     - Names are case-sensitive: Name and name are DIFFERENT variables
#     - Pick names that explain the value (target_gpa, not x)
# ID: - Pakai huruf kecil yang disambung garis bawah: snake_case
#     - Tidak boleh diawali angka, tidak boleh ada spasi
#     - Huruf besar/kecil dibedakan: Name dan name adalah variabel BERBEDA
#     - Pilih nama yang menjelaskan isinya (target_gpa, bukan x)
# ---------------------------------------------------------------------------
full_name = "Excell Juliandhika Putra"   # good / bagus
current_year = 2026                       # good / bagus
# 2nd_year = 2027     -> error: starts with a number / diawali angka
# full name = "..."   -> error: contains a space / ada spasi


# ---------------------------------------------------------------------------
# 3. Data types + type()
# EN: The 4 basic types:
#     int   = whole number        (20, -5, 2026)
#     float = decimal number      (3.8, 0.5)
#     str   = text, inside quotes ("UNAIR")
#     bool  = True or False
#     type() tells you the type of a value.
# ID: 4 tipe dasar:
#     int   = bilangan bulat      (20, -5, 2026)
#     float = bilangan desimal    (3.8, 0.5)
#     str   = teks, di dalam tanda kutip ("UNAIR")
#     bool  = True atau False
#     type() memberi tahu tipe dari sebuah nilai.
# ---------------------------------------------------------------------------
target_gpa = 3.8
campus = "UNAIR"
is_enrolled = True

print(type(age))          # <class 'int'>
print(type(target_gpa))   # <class 'float'>
print(type(campus))       # <class 'str'>
print(type(is_enrolled))  # <class 'bool'>


# ---------------------------------------------------------------------------
# 4. Arithmetic operators
# EN:  +  add          -  subtract      *  multiply
#      /  divide (always gives a float)
#      // floor division (divide, drop the decimal part)
#      %  modulus (the remainder of a division)
#      ** power
# ID:  +  tambah        -  kurang        *  kali
#      /  bagi (hasilnya selalu float)
#      // bagi bulat (hasil bagi tanpa desimal)
#      %  modulus (sisa hasil bagi)
#      ** pangkat
# ---------------------------------------------------------------------------
a = 17
b = 5
print(a + b)    # 22
print(a - b)    # 12
print(a * b)    # 85
print(a / b)    # 3.4
print(a // b)   # 3
print(a % b)    # 2
print(a ** 2)   # 289

graduation_year = current_year + 4
retirement_year = current_year + (60 - age)
print(graduation_year)
print(retirement_year)


# ---------------------------------------------------------------------------
# 5. f-strings + formatting decimals
# EN: Put f before the quotes, then write variables inside { }.
#     {value:.2f} shows a float with exactly 2 decimal places.
# ID: Tulis f sebelum tanda kutip, lalu taruh variabel di dalam { }.
#     {value:.2f} menampilkan float dengan tepat 2 angka desimal.
# ---------------------------------------------------------------------------
print(f"Name: {name}, Age: {age}")
print(f"Graduation year: {graduation_year}")

average_score = 83.456
print(f"Average: {average_score:.2f}")   # Average: 83.46


# ---------------------------------------------------------------------------
# 6. Type casting
# EN: Convert a value from one type to another:
#     int("85")  -> 85       float("3.8") -> 3.8
#     str(2026)  -> "2026"   int(3.9)     -> 3 (decimal is cut, not rounded)
#     You can't join a str and an int with + without casting first.
# ID: Mengubah nilai dari satu tipe ke tipe lain:
#     int("85")  -> 85       float("3.8") -> 3.8
#     str(2026)  -> "2026"   int(3.9)     -> 3 (desimal dipotong, bukan dibulatkan)
#     str dan int tidak bisa digabung dengan + tanpa casting dulu.
# ---------------------------------------------------------------------------
score_text = "85"
score = int(score_text)
print(score + 10)                    # 95

# print("Year: " + current_year)     -> TypeError: can't join str and int
print("Year: " + str(current_year))  # Year: 2026
print(int(3.9))                      # 3


# ---------------------------------------------------------------------------
# 7. String methods
# EN: Strings have built-in tools (methods) you call with a dot.
# ID: String punya alat bawaan (method) yang dipanggil dengan titik.
# ---------------------------------------------------------------------------
print(full_name.upper())        # EXCELL JULIANDHIKA PUTRA
print(full_name.lower())        # excell juliandhika putra
print(len(full_name))           # 24 (counts spaces too / spasi ikut dihitung)
print(full_name[0])             # E  (first character / karakter pertama)
print(full_name[-1])            # a  (last character / karakter terakhir)
print(full_name[0:6])           # Excell (slicing: index 0 up to, not including, 6)
print(full_name[::-1])          # reversed / dibalik


# ---------------------------------------------------------------------------
# 8. input()
# EN: input() waits for the user to type something, and ALWAYS returns
#     a str. Cast it if you need a number.
#     (Commented out so this file runs without waiting. Remove the # to try.)
# ID: input() menunggu pengguna mengetik sesuatu, dan hasilnya SELALU str.
#     Lakukan casting kalau butuh angka.
#     (Diberi # supaya file ini tidak berhenti menunggu. Hapus # untuk mencoba.)
# ---------------------------------------------------------------------------
# user_name = input("Enter your name: ")
# user_age = int(input("Enter your age: "))
# print(f"Hi {user_name}, next year you will be {user_age + 1}.")
