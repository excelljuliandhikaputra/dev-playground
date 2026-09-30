"""
Topic 02 - Variables & Data Types Exercises (UNSOLVED)
Topik 02 - Latihan Variabel & Tipe Data (BELUM DIKERJAKAN)
===========================================================
EN - How to use:
    1. Under each exercise, write your own code.
    2. Run:  python variables_exercises_unsolved.py
    3. Compare your output with the "Expected output" in each exercise.
       It must match EXACTLY (spaces, punctuation, capital letters).

ID - Cara pakai:
    1. Di bawah setiap soal, tulis kodemu sendiri.
    2. Jalankan:  python variables_exercises_unsolved.py
    3. Bandingkan hasilmu dengan "Expected output" di setiap soal.
       Harus PERSIS sama (spasi, tanda baca, huruf besar/kecil).

Rules / Aturan:
    - Only use Topic 01-02 material: print(), variables, data types,
      operators, f-strings, casting, string methods.
      Hanya pakai materi Topik 01-02: print(), variabel, tipe data,
      operator, f-string, casting, method string.
    - NO HARDCODING: always print using the variables, never type the
      answer directly. print(f"Total: {total}") is right,
      print("Total: 75000") is wrong.
      JANGAN HARDCODE: selalu cetak memakai variabel, jangan ketik
      jawabannya langsung. print(f"Total: {total}") benar,
      print("Total: 75000") salah.

Self-check / Cek sendiri:
    When you're done, change the values of the given variables and run
    again. If your output doesn't change, you hardcoded something.
    Kalau sudah selesai, ganti nilai variabel yang diberikan lalu jalankan
    lagi. Kalau output-mu tidak ikut berubah, berarti ada yang di-hardcode.
"""

print("===== Exercise 1 / Soal 1 =====")
# EN: Create three variables: name, age, and campus.
#     Then print one sentence using an f-string.
# ID: Buat tiga variabel: name, age, dan campus.
#     Lalu cetak satu kalimat memakai f-string.
#
# Expected output:
# My name is Excell, I am 20 years old, I study at UNAIR.

# Write your code below / Tulis kodemu di bawah ini:



print("===== Exercise 2 / Soal 2 =====")
# EN: Print the data type of each variable below using type().
# ID: Cetak tipe data dari setiap variabel di bawah memakai type().
#
# Expected output:
# <class 'int'>
# <class 'float'>
# <class 'str'>
# <class 'bool'>

course_credits = 3
gpa = 3.75
course = "Algorithms"
is_passed = True

# Write your code below / Tulis kodemu di bawah ini:



print("===== Exercise 3 / Soal 3 =====")
# EN: Use all 7 arithmetic operators on a and b.
#     Print each result in the format shown.
# ID: Pakai ketujuh operator aritmatika pada a dan b.
#     Cetak setiap hasil dengan format seperti di bawah.
#
# Expected output:
# 17 + 5 = 22
# 17 - 5 = 12
# 17 * 5 = 85
# 17 / 5 = 3.4
# 17 // 5 = 3
# 17 % 5 = 2
# 17 ** 5 = 1419857

a = 17
b = 5

# Write your code below / Tulis kodemu di bawah ini:



print("===== Exercise 4 / Soal 4 =====")
# EN: A student buys some notebooks. Calculate the subtotal,
#     the discount amount, and the final total.
# ID: Seorang mahasiswa membeli beberapa buku tulis. Hitung subtotal,
#     besar potongan diskon, dan total akhir.
#
# Expected output:
# Subtotal: 75000
# Discount: 7500.0
# Total: 67500.0

price = 25000
quantity = 3
discount_percent = 10

# Write your code below / Tulis kodemu di bawah ini:



print("===== Exercise 5 / Soal 5 =====")
# EN: Type casting.
#     a) score_text is a str. Convert it to int, add bonus, print it.
#     b) Print "Year: " + year using + (not an f-string). You'll need str().
#     c) Convert hours (a float) to int and print it. Notice it's cut, not rounded.
# ID: Konversi tipe data.
#     a) score_text bertipe str. Ubah ke int, tambah bonus, lalu cetak.
#     b) Cetak "Year: " + year memakai + (bukan f-string). Kamu butuh str().
#     c) Ubah hours (float) ke int lalu cetak. Perhatikan: dipotong, bukan dibulatkan.
#
# Expected output:
# New score: 95
# Year: 2026
# Hours: 9

score_text = "85"
bonus = 10
year = 2026
hours = 9.99

# Write your code below / Tulis kodemu di bawah ini:



print("===== Exercise 6 / Soal 6 =====")
# EN: Use string methods on campus_name.
# ID: Pakai method string pada campus_name.
#
# Expected output:
# UNIVERSITAS AIRLANGGA
# universitas airlangga
# Length: 21
# First letter: U
# Reversed: aggnalriA satisrevinU

campus_name = "Universitas Airlangga"

# Write your code below / Tulis kodemu di bawah ini:



print("===== Exercise 7 / Soal 7 =====")
# EN: Swap the values of a and b, so a becomes 9 and b becomes 5.
#     Don't just write a = 9. Use a third variable (temp).
# ID: Tukar nilai a dan b, sehingga a menjadi 9 dan b menjadi 5.
#     Jangan langsung tulis a = 9. Pakai variabel ketiga (temp).
#
# Expected output:
# Before: a = 5, b = 9
# After: a = 9, b = 5

a = 5
b = 9

# Write your code below / Tulis kodemu di bawah ini:



print("===== Exercise 8 / Soal 8 (Challenge) =====")
# EN: Convert total_seconds into hours, minutes, and seconds.
#     Hint: 1 hour = 3600 seconds. Use // and %.
# ID: Ubah total_seconds menjadi jam, menit, dan detik.
#     Petunjuk: 1 jam = 3600 detik. Pakai // dan %.
#
# Expected output:
# 1 hours, 2 minutes, 5 seconds

total_seconds = 3725

# Write your code below / Tulis kodemu di bawah ini:



print("===== Exercise 9 / Soal 9 (Challenge) =====")
# EN: Calculate the BMI (Body Mass Index).
#     Formula: BMI = weight / (height * height)
#     Show the result with exactly 2 decimal places.
# ID: Hitung BMI (Indeks Massa Tubuh).
#     Rumus: BMI = berat / (tinggi * tinggi)
#     Tampilkan hasilnya dengan tepat 2 angka desimal.
#
# Expected output:
# BMI: 20.76

weight = 60      # kg
height = 1.70    # meters / meter

# Write your code below / Tulis kodemu di bawah ini:


