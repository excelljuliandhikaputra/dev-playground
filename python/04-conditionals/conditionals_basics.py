"""
Topic 04 - Conditionals
Topik 04 - Percabangan (Kondisi)
================================
EN: Topics covered in this lesson file.
ID: Topik yang dibahas di file ini.

    1. Comparison operators -> True/False   | Operator perbandingan -> True/False
    2. if                                   | if
    3. if / else                            | if / else
    4. if / elif / else                     | if / elif / else
    5. Logical operators: and, or, not      | Operator logika: and, or, not
    6. Nested if                            | if bersarang
    7. `in` inside an if                    | `in` di dalam if
    8. Conditional expression (one line)    | Ekspresi kondisional (satu baris)
    9. Conditions with input()              | Kondisi dengan input()
   10. Common mistakes                      | Kesalahan umum

Run this file:  python conditionals_basics.py
"""


# ---------------------------------------------------------------------------
# 1. Comparison operators -> True/False
# EN: A comparison asks a yes/no question. The answer is a bool (True/False).
#     ==  equal to                 !=  not equal to
#     >   greater than             <   less than
#     >=  greater than or equal    <=  less than or equal
#     Careful: =  STORES a value,  ==  COMPARES two values.
# ID: Perbandingan mengajukan pertanyaan ya/tidak. Jawabannya bool (True/False).
#     ==  sama dengan              !=  tidak sama dengan
#     >   lebih besar dari         <   lebih kecil dari
#     >=  lebih besar atau sama    <=  lebih kecil atau sama
#     Hati-hati: =  MENYIMPAN nilai,  ==  MEMBANDINGKAN dua nilai.
# ---------------------------------------------------------------------------
score = 78
print(score >= 65)                  # True
print(score == 100)                 # False
print(score != 100)                 # True

campus = "UNAIR"
print(campus == "UNAIR")            # True
print(campus == "unair")            # False (capital letters matter / huruf besar-kecil berpengaruh)
print(campus.lower() == "unair")    # True  (compare in lowercase / bandingkan dalam huruf kecil)

# EN: Python lets you chain comparisons like in math (Java can't do this).
# ID: Python boleh merangkai perbandingan seperti di matematika (Java tidak bisa).
print(0 <= score <= 100)            # True


# ---------------------------------------------------------------------------
# 2. if
# EN: `if` runs a block of code ONLY when its condition is True.
#     - The if line ends with a colon  :
#     - The block under it is indented (4 spaces). The indentation IS the block.
#     - Code that is NOT indented runs no matter what.
#     Java puts the condition in ( ) and the block in { }.
#     Python uses : and indentation instead.
# ID: `if` menjalankan blok kode HANYA kalau kondisinya True.
#     - Baris if diakhiri titik dua  :
#     - Blok di bawahnya menjorok ke dalam (4 spasi). Indentasi itulah bloknya.
#     - Kode yang TIDAK menjorok tetap dijalankan apa pun kondisinya.
#     Java menaruh kondisi di dalam ( ) dan bloknya di dalam { }.
#     Python memakai : dan indentasi sebagai gantinya.
# ---------------------------------------------------------------------------
attendance_percent = 80

if attendance_percent >= 75:
    print("You may take the final exam.")       # printed / dicetak
    print("Good luck!")                         # printed / dicetak

if attendance_percent < 75:
    print("You may NOT take the final exam.")   # skipped / dilewati

print("Attendance check done.")                 # always printed / selalu dicetak


# ---------------------------------------------------------------------------
# 3. if / else
# EN: `else` is the "otherwise" part. It runs when the condition is False.
#     Exactly ONE of the two blocks runs, never both.
#     else has no condition of its own, it just ends with a colon.
# ID: `else` adalah bagian "kalau tidak". Dijalankan saat kondisinya False.
#     Tepat SATU dari dua blok yang jalan, tidak pernah keduanya.
#     else tidak punya kondisi sendiri, cukup diakhiri titik dua.
# ---------------------------------------------------------------------------
balance = 50000
book_price = 75000

if balance >= book_price:
    print("Payment successful.")
else:
    print(f"Not enough balance. You need Rp{book_price - balance} more.")
# Not enough balance. You need Rp25000 more.


# ---------------------------------------------------------------------------
# 4. if / elif / else
# EN: Use elif ("else if") when there are more than two possibilities.
#     Python checks from TOP to BOTTOM and runs only the FIRST block whose
#     condition is True. Everything after that is skipped.
#     So when you use >=, start from the HIGHEST value.
#     The final else (optional) catches everything that didn't match.
#     Java writes `else if`; Python shortens it to `elif`.
# ID: Pakai elif ("else if") kalau kemungkinannya lebih dari dua.
#     Python mengecek dari ATAS ke BAWAH dan hanya menjalankan blok PERTAMA
#     yang kondisinya True. Sisanya dilewati.
#     Jadi kalau memakai >=, mulailah dari nilai TERTINGGI.
#     else di akhir (opsional) menangkap semua yang tidak cocok.
#     Java menulis `else if`; Python menyingkatnya menjadi `elif`.
# ---------------------------------------------------------------------------
battery_percent = 35

if battery_percent >= 80:
    battery_status = "Full enough for a whole day of classes"
elif battery_percent >= 40:
    battery_status = "OK for a few hours"
elif battery_percent >= 15:
    battery_status = "Low, charge it soon"
else:
    battery_status = "Critical! Find a socket now"

print(f"Battery {battery_percent}%: {battery_status}")
# Battery 35%: Low, charge it soon

# EN: Wrong order: 90 is also >= 15, so Python would stop at the FIRST check.
# ID: Urutan salah: 90 juga >= 15, jadi Python akan berhenti di cek PERTAMA.
# if battery_percent >= 15:
#     battery_status = "Low, charge it soon"     <- 90% would end up here / 90% malah masuk ke sini
# elif battery_percent >= 80:
#     battery_status = "Full enough ..."          <- never reached / tidak pernah tercapai

# EN: Separate ifs are ALL checked. An elif chain stops at the first match.
# ID: if yang terpisah SEMUANYA dicek. Rantai elif berhenti di kecocokan pertama.
quiz_score = 90
if quiz_score >= 85:
    print("Excellent")      # printed / dicetak
if quiz_score >= 65:
    print("Passed")         # ALSO printed (separate if) / IKUT dicetak (if terpisah)

if quiz_score >= 85:
    print("Excellent")      # printed / dicetak
elif quiz_score >= 65:
    print("Passed")         # skipped (elif) / dilewati (elif)


# ---------------------------------------------------------------------------
# 5. Logical operators: and, or, not
# EN: and -> True only if BOTH sides are True
#     or  -> True if AT LEAST ONE side is True
#     not -> flips the value: True becomes False, False becomes True
#     Java writes them as  &&  ||  !  ; Python uses plain English words.
# ID: and -> True hanya kalau KEDUA sisi True
#     or  -> True kalau MINIMAL SATU sisi True
#     not -> membalik nilai: True jadi False, False jadi True
#     Java menulisnya  &&  ||  !  ; Python memakai kata bahasa Inggris biasa.
# ---------------------------------------------------------------------------
print(True and False)       # False
print(True or False)        # True
print(not True)             # False

assignments_done = True
if attendance_percent >= 75 and assignments_done:
    print("All requirements complete.")         # printed / dicetak

is_weekend = False
is_holiday = True
if is_weekend or is_holiday:
    print("No classes today.")                  # printed / dicetak

is_raining = False
if not is_raining:
    print("Walk to campus.")                    # printed / dicetak


# ---------------------------------------------------------------------------
# 6. Nested if
# EN: An if can live inside another if. The inner if is only checked when
#     the outer condition is True. Each level adds 4 more spaces.
#     Don't nest too deep: 2-3 levels is still easy to read.
# ID: Sebuah if boleh berada di dalam if lain. if bagian dalam hanya dicek
#     kalau kondisi luarnya True. Setiap level menambah 4 spasi lagi.
#     Jangan terlalu dalam: 2-3 level masih mudah dibaca.
# ---------------------------------------------------------------------------
has_student_card = True     # KTM (Kartu Tanda Mahasiswa)
library_fine = 5000

if has_student_card:
    if library_fine == 0:
        print("You can borrow books.")
    else:
        print(f"Please pay your library fine first: Rp{library_fine}")   # printed / dicetak
else:
    print("Please bring your student card.")


# ---------------------------------------------------------------------------
# 7. `in` inside an if
# EN: You met `in` in Topic 03. It gives True/False, so it fits right into an if.
#     `not in` is the opposite.
#     With a dictionary, `in` checks the KEYS. Check with `in` BEFORE you
#     read dict[key], so a missing key doesn't crash the program.
# ID: Kamu sudah kenal `in` di Topik 03. Hasilnya True/False, jadi pas
#     dipakai di dalam if. `not in` adalah kebalikannya.
#     Pada dictionary, `in` mengecek KEY-nya. Cek dengan `in` SEBELUM membaca
#     dict[key], supaya key yang tidak ada tidak membuat program error.
# ---------------------------------------------------------------------------
my_courses = ["Algorithms", "Calculus", "English"]

if "Calculus" in my_courses:
    print("Calculus is in your schedule.")          # printed / dicetak

if "Pancasila" not in my_courses:
    print("You haven't taken Pancasila yet.")       # printed / dicetak

course_credits = {"Algorithms": 3, "English": 2}
search_course = "Calculus"
if search_course in course_credits:
    print(f"{search_course}: {course_credits[search_course]} credits")
else:
    print(f"{search_course} is not in the dictionary.")   # printed / dicetak

letter = "E"
if letter.lower() in "aeiou":
    print(f"{letter} is a vowel")                   # E is a vowel


# ---------------------------------------------------------------------------
# 8. Conditional expression (one line)
# EN: A short if/else that picks one of two VALUES, written in one line:
#         value_if_true if condition else value_if_false
#     Use it only for simple choices. For anything longer, use a normal if.
#     Java has the same idea with a different shape:  condition ? a : b
# ID: if/else pendek yang memilih salah satu dari dua NILAI, ditulis satu baris:
#         nilai_kalau_true if kondisi else nilai_kalau_false
#     Pakai hanya untuk pilihan sederhana. Kalau lebih panjang, pakai if biasa.
#     Java punya ide yang sama dengan bentuk berbeda:  kondisi ? a : b
# ---------------------------------------------------------------------------
temperature = 33
weather = "hot" if temperature >= 30 else "comfortable"
print(f"Surabaya today: {weather}")         # Surabaya today: hot

items_in_cart = 1
item_word = "item" if items_in_cart == 1 else "items"
print(f"You have {items_in_cart} {item_word} in your cart.")   # You have 1 item in your cart.


# ---------------------------------------------------------------------------
# 9. Conditions with input()
# EN: Remember Topic 02: input() ALWAYS gives a str. Cast it to int BEFORE
#     you compare it with a number, otherwise Python raises a TypeError.
#     For yes/no answers, use .lower() so "YES", "Yes" and "yes" all work.
#     (Commented out so this file runs without waiting. Remove the # to try.)
# ID: Ingat Topik 02: input() SELALU menghasilkan str. Ubah ke int SEBELUM
#     dibandingkan dengan angka, kalau tidak Python akan memunculkan TypeError.
#     Untuk jawaban yes/no, pakai .lower() supaya "YES", "Yes", dan "yes" semua bisa.
#     (Diberi # supaya file ini tidak berhenti menunggu. Hapus # untuk mencoba.)
# ---------------------------------------------------------------------------
# user_score = int(input("Enter your score: "))
# if user_score >= 65:
#     print("PASS")
# else:
#     print("FAIL")
#
# answer = input("Join the study group? (yes/no): ")
# if answer.lower() == "yes":
#     print("See you in the library!")
# else:
#     print("Maybe next time.")


# ---------------------------------------------------------------------------
# 10. Common mistakes
# EN: Each line below is a mistake beginners often make, with the reason.
# ID: Setiap baris di bawah adalah kesalahan yang sering dibuat pemula,
#     beserta alasannya.
# ---------------------------------------------------------------------------
# if score = 100:              -> SyntaxError: = stores, == compares
#                                 = menyimpan, == membandingkan
# if score >= 65               -> SyntaxError: the colon : is missing
#                                 titik dua : lupa ditulis
# if score >= 65:
# print("PASS")                -> IndentationError: the block must be indented
#                                 bloknya harus menjorok ke dalam
# if "85" >= 65:               -> TypeError: can't compare str with int (cast first)
#                                 str tidak bisa dibandingkan dengan int (casting dulu)
# if day == "Saturday" or "Sunday":
#                              -> ALWAYS True! The right side is just "Sunday",
#                                 and a non-empty string counts as True.
#                                 SELALU True! Sisi kanannya hanya "Sunday",
#                                 dan string yang tidak kosong dianggap True.

# EN: The correct way: write the full comparison on BOTH sides of `or`.
# ID: Cara yang benar: tulis perbandingan lengkap di KEDUA sisi `or`.
day = "Monday"
if day == "Saturday" or day == "Sunday":
    print("Weekend!")
else:
    print("Weekday, time for class.")       # Weekday, time for class.
