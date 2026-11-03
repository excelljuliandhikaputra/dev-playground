"""
Topic 04 - Conditionals Exercises (SOLVED)
Topik 04 - Latihan Percabangan (SUDAH DIKERJAKAN)
==================================================
EN - How to use:
    1. Under each exercise, write your own code.
    2. Run:  python conditionals_exercises_unsolved.py
    3. Compare your output with the "Expected output" in each exercise.
       It must match EXACTLY (spaces, punctuation, capital letters).

ID - Cara pakai:
    1. Di bawah setiap soal, tulis kodemu sendiri.
    2. Jalankan:  python conditionals_exercises_unsolved.py
    3. Bandingkan hasilmu dengan "Expected output" di setiap soal.
       Harus PERSIS sama (spasi, tanda baca, huruf besar/kecil).

Rules / Aturan:
    - Only use Topic 01-04 material. No loops and no def (functions) yet.
      Hanya pakai materi Topik 01-04. Belum boleh pakai loop dan def (fungsi).
    - NO HARDCODING: get every value from the given variables, and let
      if / elif / else decide which message is printed.
      JANGAN HARDCODE: ambil setiap nilai dari variabel yang diberikan, dan
      biarkan if / elif / else yang menentukan pesan mana yang dicetak.
    - Most exercises give two or three data sets (e.g. score_a and score_b).
      Write the if block for EACH of them. Feels repetitive? Loops (Topic 05)
      and functions (Topic 06) will fix that later.
      Sebagian besar soal memberi dua atau tiga set data (misalnya score_a dan
      score_b). Tulis blok if untuk MASING-MASING. Terasa berulang? Loop
      (Topik 05) dan fungsi (Topik 06) nanti akan mengatasinya.

Self-check / Cek sendiri:
    When you're done, change the given data and run again.
    If your output doesn't change, you hardcoded something.
    Some exercises have a "Try it" line with extra data to test.
    Kalau sudah selesai, ganti data yang diberikan lalu jalankan lagi.
    Kalau output-mu tidak ikut berubah, berarti ada yang di-hardcode.
    Beberapa soal punya baris "Try it" berisi data tambahan untuk dicoba.
"""

print("===== Exercise 1 / Soal 1 =====")
# EN: A score of 65 or more is a PASS, anything below is a FAIL.
#     Print the result for both scores.
# ID: Nilai 65 ke atas berarti PASS, di bawah itu FAIL.
#     Cetak hasilnya untuk kedua nilai.
#
# Expected output:
# Score 72: PASS
# Score 58: FAIL

score_a = 72
score_b = 58

# Write your code below / Tulis kodemu di bawah ini:
if score_a >= 65:
    print(f"Score {score_a}: PASS")
else:
    print(f"Score {score_a}: FAIL")

if score_b >= 65:
    print(f"Score {score_b}: PASS")
else:
    print(f"Score {score_b}: FAIL")


print("===== Exercise 2 / Soal 2 =====")
# EN: Convert each score into a UNAIR letter grade and its grade point.
#     Use an if / elif / else chain.
#         A  >= 85 (4.0)    AB 80-84 (3.5)    B 75-79 (3.0)    BC 70-74 (2.5)
#         C  65-69 (2.0)    D  50-64 (1.0)    E < 50  (0.0)
#     Store the grade point as a float (4.0, 3.5, ...) so it prints like 1.0, not 1.
# ID: Ubah setiap nilai menjadi huruf mutu UNAIR beserta bobotnya.
#     Pakai rantai if / elif / else.
#     Simpan bobotnya sebagai float (4.0, 3.5, ...) supaya tercetak 1.0, bukan 1.
#
# Expected output:
# Algorithms: 80 -> AB (3.5)
# Calculus: 64 -> D (1.0)

algorithms_score = 80
calculus_score = 64

# Write your code below / Tulis kodemu di bawah ini:
if algorithms_score >= 85:
    grade_a = "A"
    grade_point_a = float(4.0)
elif 84 >= algorithms_score >= 80:
    grade_a = "AB"
    grade_point_a = float(3.5)
elif 79 >= algorithms_score >= 75:
    grade_a = "B"
    grade_point_a = float(3.0)
elif 74 >= algorithms_score >= 70:
    grade_a = "BC"
    grade_point_a = float(2.5)
elif 69 >= algorithms_score >= 65:
    grade_a = "C"
    grade_point_a = float(2.0)
elif 64 >= algorithms_score >= 50:
    grade_a = "D"
    grade_point_a = float(1.0)
else:
    grade_a = "E"
    grade_point_a = float(0.0)

print(f"Algorithms: {algorithms_score} -> {grade_a} ({grade_point_a})" )

if calculus_score >= 85:
    grade_b = "A"
    grade_point_b = float(4.0)
elif 84 >= calculus_score >= 80:
    grade_b = "AB"
    grade_point_b = float(3.5)
elif 79 >= calculus_score >= 75:
    grade_b = "B"
    grade_point_b = float(3.0)
elif 74 >= calculus_score >= 70:
    grade_b = "BC"
    grade_point_b = float(2.5)
elif 69 >= calculus_score >= 65:
    grade_b = "C"
    grade_point_b = float(2.0)
elif 64 >= calculus_score >= 50:
    grade_b = "D"
    grade_point_b = float(1.0)
else:
    grade_b = "E"
    grade_point_b = float(0.0)

print(f"Calculus: {calculus_score} -> {grade_b} ({grade_point_b})" )

print("===== Exercise 3 / Soal 3 =====")
# EN: Use % to decide whether each number is even or odd.
#     For number_a, use a normal if / else.
#     For number_b, use a conditional expression in ONE line:
#         value_if_true if condition else value_if_false
# ID: Pakai % untuk menentukan apakah setiap angka genap (even) atau ganjil (odd).
#     Untuk number_a, pakai if / else biasa.
#     Untuk number_b, pakai ekspresi kondisional dalam SATU baris:
#         nilai_kalau_true if kondisi else nilai_kalau_false
#
# Expected output:
# 17 is odd
# 42 is even

number_a = 17
number_b = 42

# Write your code below / Tulis kodemu di bawah ini:
parity_a = "even" if number_a % 2 == 0 else "odd"
print(f"{number_a} is {parity_a}")

parity_b = "even" if number_b % 2 == 0 else "odd"
print(f"{number_b} is {parity_b}")


print("===== Exercise 4 / Soal 4 =====")
# EN: Find the largest of the three numbers in each tuple.
#     Rule: do NOT use max() or sorted(). Compare them with if.
#     Hint: unpack the tuple first (Topic 03):  first, second, third = values_a
# ID: Cari angka terbesar dari tiga angka di setiap tuple.
#     Aturan: JANGAN pakai max() atau sorted(). Bandingkan dengan if.
#     Petunjuk: unpack tuple-nya dulu (Topik 03):  first, second, third = values_a
#
# Expected output:
# Largest of (48, 91, 63): 91
# Largest of (75, 12, 80): 80

values_a = (48, 91, 63)
values_b = (75, 12, 80)

# Write your code below / Tulis kodemu di bawah ini:
first_a, second_a, third_a = values_a

largest_a = first_a
if second_a > largest_a:
    largest_a = second_a
if third_a > largest_a:
    largest_a = third_a

print(f"Largest of {values_a}: {largest_a}")

first_b, second_b, third_b = values_b

largest_b = first_b
if second_b > largest_b:
    largest_b = second_b
if third_b > largest_b:
    largest_b = third_b

print(f"Largest of {values_b}: {largest_b}")


print("===== Exercise 5 / Soal 5 =====")
# EN: A student needs at least 75% attendance to take the final exam.
#     Calculate the attendance percentage (attended / meetings * 100) for
#     each course, show it with 2 decimal places, and print whether the
#     student is allowed. Exactly 75% is still allowed.
# ID: Mahasiswa butuh kehadiran minimal 75% untuk ikut ujian akhir (UAS).
#     Hitung persentase kehadiran (attended / meetings * 100) untuk setiap
#     mata kuliah, tampilkan dengan 2 angka desimal, lalu cetak apakah
#     mahasiswa boleh ikut. Tepat 75% masih boleh.
#
# Expected output:
# Algorithms: 71.43% -> NOT allowed to take the final exam
# Pancasila: 75.00% -> allowed to take the final exam

course_a = "Algorithms"
attended_a = 10
meetings_a = 14

course_b = "Pancasila"
attended_b = 12
meetings_b = 16

# Write your code below / Tulis kodemu di bawah ini:
attendance_percentage_a = attended_a / meetings_a * 100
attendance_percentage_b = attended_b / meetings_b * 100

if attendance_percentage_a >= 75:
    print(f"{course_a}: {attendance_percentage_a:.2f}% -> allowed to take the final exam")
else:
    print(f"{course_a}: {attendance_percentage_a:.2f}% -> NOT allowed to take the final exam")

if attendance_percentage_b >= 75:
    print(f"{course_b}: {attendance_percentage_b:.2f}% -> allowed to take the final exam")
else:
    print(f"{course_b}: {attendance_percentage_b:.2f}% -> NOT allowed to take the final exam")

print("===== Exercise 6 / Soal 6 =====")
# EN: Check three login attempts against the saved account.
#     - The username is NOT case-sensitive ("EXCELL" is fine). Use .lower().
#     - The password IS case-sensitive ("unair2026" is wrong).
#     Check the username first. Only if it is correct, check the password
#     INSIDE it (nested if).
#         username wrong              -> Username not found.
#         username ok, password wrong -> Wrong password.
#         both ok                     -> Login successful. Welcome, <saved_username>!
# ID: Cek tiga percobaan login terhadap akun yang tersimpan.
#     - Username TIDAK peka huruf besar/kecil ("EXCELL" tetap benar). Pakai .lower().
#     - Password PEKA huruf besar/kecil ("unair2026" salah).
#     Cek username dulu. Hanya kalau username benar, cek password-nya
#     DI DALAM if tersebut (if bersarang).
#
# Expected output:
# Attempt 1: Username not found.
# Attempt 2: Wrong password.
# Attempt 3: Login successful. Welcome, excell!

saved_username = "excell"
saved_password = "Unair2026"

username_1 = "excel"
password_1 = "Unair2026"

username_2 = "Excell"
password_2 = "unair2026"

username_3 = "EXCELL"
password_3 = "Unair2026"

# Write your code below / Tulis kodemu di bawah ini:
print("Attempt 1: ", end="")
if username_1.lower() == saved_username:
    if password_1 == saved_password:
        print(f"Login successful. Welcome, {saved_username}!")
    else:
        print("Wrong password.")
else:
    print("Username not found.")

print("Attempt 2: ", end="")
if username_2.lower() == saved_username:
    if password_2 == saved_password:
        print(f"Login successful. Welcome, {saved_username}!")
    else:
        print("Wrong password.")
else:
    print("Username not found.")

print("Attempt 3: ", end="")
if username_3.lower() == saved_username:
    if password_3 == saved_password:
        print(f"Login successful. Welcome, {saved_username}!")
    else:
        print("Wrong password.")
else:
    print("Username not found.")


print("===== Exercise 7 / Soal 7 =====")
# EN: seats_left shows how many seats are still open in each class.
#     For each request, print one of these messages:
#         not a key in seats_left -> <course>: not offered this semester
#         0 seats left            -> <course>: class is full
#         otherwise               -> <course>: registered (seats left: <seats - 1>)
#     Check with `in` FIRST, before reading seats_left[...], otherwise
#     "Data Science" crashes the program with a KeyError.
# ID: seats_left berisi jumlah kursi yang masih tersedia di setiap kelas.
#     Untuk setiap permintaan, cetak salah satu pesan di atas.
#     Cek dengan `in` DULUAN, sebelum membaca seats_left[...], kalau tidak
#     "Data Science" akan membuat program error (KeyError).
#
# Expected output:
# Calculus: registered (seats left: 4)
# Data Science: not offered this semester
# Algorithms: class is full

seats_left = {"Algorithms": 0, "Calculus": 5, "English": 2}

request_a = "Calculus"
request_b = "Data Science"
request_c = "Algorithms"

# Write your code below / Tulis kodemu di bawah ini:
if request_a not in seats_left:
    print(f"{request_a}: not offered this semester")
elif seats_left[request_a] == 0:
    print(f"{request_a}: class is full")
else:
    print(f"{request_a}: registered (seats left: {seats_left[request_a] - 1})")

if request_b not in seats_left:
    print(f"{request_b}: not offered this semester")
elif seats_left[request_b] == 0:
    print(f"{request_b}: class is full")
else:
    print(f"{request_b}: registered (seats left: {seats_left[request_b] - 1})")

if request_c not in seats_left:
    print(f"{request_c}: not offered this semester")
elif seats_left[request_c] == 0:
    print(f"{request_c}: class is full")
else:
    print(f"{request_c}: registered (seats left: {seats_left[request_c] - 1})")


print("===== Exercise 8 / Soal 8 =====")
# EN: Online campus store rules:
#     - Member discount: 10% of the subtotal, ONLY if the buyer is a member
#       AND the subtotal is at least 200000. Use // so it stays an int:
#       subtotal * 10 // 100
#     - Shipping is free (0) if the subtotal is at least 100000 OR the buyer
#       is a member. Otherwise shipping is 15000.
#     - total = subtotal - discount + shipping
# ID: Aturan toko online kampus:
#     - Diskon member: 10% dari subtotal, HANYA kalau pembeli adalah member
#       DAN subtotal minimal 200000. Pakai // supaya tetap int:
#       subtotal * 10 // 100
#     - Ongkir gratis (0) kalau subtotal minimal 100000 ATAU pembeli adalah
#       member. Selain itu ongkirnya 15000.
#     - total = subtotal - diskon + ongkir
#
# Expected output:
# Order A -> discount: 22000, shipping: 0, total: 198000
# Order B -> discount: 0, shipping: 15000, total: 95000
#
# Try it: set is_member_b = True and run again. Order B should get free
#         shipping (total: 80000) but still no discount.
# Coba:   ubah is_member_b = True lalu jalankan lagi. Order B harus dapat
#         ongkir gratis (total: 80000) tapi tetap tanpa diskon.

subtotal_a = 220000
is_member_a = True

subtotal_b = 80000
is_member_b = False

# Write your code below / Tulis kodemu di bawah ini:
if is_member_a and subtotal_a >= 200000:
    discount_a = subtotal_a * 10 // 100
else:
    discount_a = 0

if is_member_a or subtotal_a >= 100000:
    shipping_a = 0
else:
    shipping_a = 15000

total_a = subtotal_a - discount_a + shipping_a
print(f"Order A -> discount: {discount_a}, shipping: {shipping_a}, total: {total_a}")

if is_member_b and subtotal_b >= 200000:
    discount_b = subtotal_b * 10 // 100
else:
    discount_b = 0

if is_member_b or subtotal_b >= 100000:
    shipping_b = 0
else:
    shipping_b = 15000

total_b = subtotal_b - discount_b + shipping_b
print(f"Order B -> discount: {discount_b}, shipping: {shipping_b}, total: {total_b}")


print("===== Exercise 9 / Soal 9 (Challenge) =====")
# EN: Decide whether each year is a leap year (366 days) or not (365 days).
#     The rule has three parts:
#         - divisible by 4            -> leap year
#         - BUT divisible by 100      -> NOT a leap year
#         - BUT divisible by 400      -> leap year after all
#     Hint: "divisible by 4" means  year % 4 == 0
#     Hint: it fits in one condition with and / or, or you can use nested if.
# ID: Tentukan apakah setiap tahun adalah tahun kabisat (366 hari) atau
#     bukan (365 hari). Aturannya ada tiga bagian:
#         - habis dibagi 4            -> kabisat
#         - TAPI habis dibagi 100     -> BUKAN kabisat
#         - TAPI habis dibagi 400     -> tetap kabisat
#     Petunjuk: "habis dibagi 4" artinya  year % 4 == 0
#     Petunjuk: bisa ditulis dalam satu kondisi dengan and / or, atau pakai if bersarang.
#
# Expected output:
# 2024: leap year (366 days)
# 1900: not a leap year (365 days)
# 2000: leap year (366 days)

year_a = 2024
year_b = 1900
year_c = 2000

# Write your code below / Tulis kodemu di bawah ini:
if  (year_a % 4 == 0) and (year_a % 100 != 0) or (year_a % 400 == 0):
    print(f"{year_a}: leap year (366 days)")
else:
    print(f"{year_a}: not a leap year (365 days)")

if  (year_b % 4 == 0) and (year_b % 100 != 0) or (year_b % 400 == 0):
    print(f"{year_b}: leap year (366 days)")
else:
    print(f"{year_b}: not a leap year (365 days)")

if  (year_c % 4 == 0) and (year_c % 100 != 0) or (year_c % 400 == 0):
    print(f"{year_c}: leap year (366 days)")
else:
    print(f"{year_c}: not a leap year (365 days)")


print("===== Exercise 10 / Soal 10 (Challenge) =====")
# EN: Calculate each person's BMI = weight / height ** 2, then find the category:
#         below 18.5        -> Underweight
#         18.5 to below 25  -> Normal
#         25 to below 30    -> Overweight
#         30 and above      -> Obese
#     Then add advice:
#         Underweight          -> gain <kg> kg to reach BMI 18.5
#                                 (kg = 18.5 * height ** 2 - weight)
#         Overweight or Obese  -> lose <kg> kg to reach BMI 24.9
#                                 (kg = weight - 24.9 * height ** 2)
#         Normal               -> keep it up!
#     Compare the REAL BMI value. Only round when printing (:.2f).
# ID: Hitung BMI setiap orang = weight / height ** 2, lalu tentukan kategorinya
#     (lihat tabel di atas). Lalu tambahkan saran (rumus kg ada di atas):
#         Underweight           -> naikkan <kg> kg supaya BMI menjadi 18.5
#         Overweight atau Obese -> turunkan <kg> kg supaya BMI menjadi 24.9
#         Normal                -> keep it up!
#     Bandingkan nilai BMI ASLI. Bulatkan hanya saat mencetak (:.2f).
#
# Expected output:
# Person A: BMI 16.98 (Underweight) -> gain 4.66 kg to reach BMI 18.5
# Person B: BMI 20.76 (Normal) -> keep it up!
#
# Try it: set weight_b = 80 and run again. You should see:
# Coba:   ubah weight_b = 80 lalu jalankan lagi. Hasilnya harus:
#         Person B: BMI 27.68 (Overweight) -> lose 8.04 kg to reach BMI 24.9

weight_a = 52       # kg
height_a = 1.75     # meters / meter

weight_b = 60       # kg
height_b = 1.70     # meters / meter

# Write your code below / Tulis kodemu di bawah ini:
bmi_a = weight_a / (height_a ** 2)
if bmi_a >= 30:
    bmi_category_a = "Obese"
elif 30 > bmi_a >= 25:
    bmi_category_a = "Overweight"
elif 25 > bmi_a >= 18.5:
    bmi_category_a = "Normal"
else:
    bmi_category_a = "Underweight"

if bmi_category_a == "Obese" or bmi_category_a == "Overweight":
    normal_bmi =  weight_a - (24.9 * height_a ** 2)
    advice_a = f"lose {normal_bmi:.2f} kg to reach BMI 24.9"
elif bmi_category_a == "Underweight":
    normal_bmi = 18.5 * height_a ** 2 - weight_a
    advice_a = f"gain {normal_bmi:.2f} kg to reach BMI 18.5"
else:
    advice_a = "keep it up!"

print(f"Person A: BMI {bmi_a:.2f} ({bmi_category_a}) -> {advice_a}")

bmi_b = weight_b / (height_b ** 2)
if bmi_b >= 30:
    bmi_category_b = "Obese"
elif 30 > bmi_b >= 25:
    bmi_category_b = "Overweight"
elif 25 > bmi_b >= 18.5:
    bmi_category_b = "Normal"
else:
    bmi_category_b = "Underweight"

if bmi_category_b == "Obese" or bmi_category_b == "Overweight":
    normal_bmi_b = weight_b - (24.9 * height_b ** 2)
    advice_b = f"lose {normal_bmi_b:.2f} kg to reach BMI 24.9"
elif bmi_category_b == "Underweight":
    normal_bmi_b = 18.5 * height_b ** 2 - weight_b
    advice_b = f"gain {normal_bmi_b:.2f} kg to reach BMI 18.5"
else:
    advice_b = "keep it up!"

print(f"Person B: BMI {bmi_b:.2f} ({bmi_category_b}) -> {advice_b}")