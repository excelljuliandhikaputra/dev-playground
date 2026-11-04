"""
Topic 05 - Loops Exercises (UNSOLVED)
Topik 05 - Latihan Perulangan (BELUM DIKERJAKAN)
=================================================
EN - How to use:
    1. Under each exercise, write your own code.
    2. Run:  python loops_exercises_unsolved.py
    3. Compare your output with the "Expected output" in each exercise.
       It must match EXACTLY (spaces, punctuation, brackets, capital letters).

ID - Cara pakai:
    1. Di bawah setiap soal, tulis kodemu sendiri.
    2. Jalankan:  python loops_exercises_unsolved.py
    3. Bandingkan hasilmu dengan "Expected output" di setiap soal.
       Harus PERSIS sama (spasi, tanda baca, kurung, huruf besar/kecil).

Rules / Aturan:
    - Only use Topic 01-05 material. No def (functions) yet.
      Hanya pakai materi Topik 01-05. Belum boleh pakai def (fungsi).
    - NO HARDCODING: get every value from the given variables and let the
      loop do the work.
      JANGAN HARDCODE: ambil setiap nilai dari variabel yang diberikan dan
      biarkan loop yang bekerja.
    - Some exercises ban a shortcut (sum(), max(), [::-1], ...). Respect it:
      the point is to practise the loop.
      Beberapa soal melarang jalan pintas (sum(), max(), [::-1], ...). Ikuti
      aturannya: tujuannya adalah berlatih loop.
    - Don't name your variables sum, max, min, list, or str. Those names
      belong to Python's built-in tools.
      Jangan beri nama variabel sum, max, min, list, atau str. Nama-nama itu
      milik fungsi bawaan Python.
    - All exercises share one file. Reusing loop names (i, score, ...) is
      fine, but create your accumulators again (total = 0) inside EACH
      exercise, right before its loop.
      Semua soal ada di satu file. Memakai ulang nama variabel loop (i,
      score, ...) tidak masalah, tapi buat ulang akumulatormu (total = 0)
      di SETIAP soal, tepat sebelum loop-nya.

Self-check / Cek sendiri:
    When you're done, change the given data and run again.
    If your output doesn't change, you hardcoded something.
    Kalau sudah selesai, ganti data yang diberikan lalu jalankan lagi.
    Kalau output-mu tidak ikut berubah, berarti ada yang di-hardcode.
"""

print("===== Exercise 1 / Soal 1 =====")
# EN: Print the multiplication table of table_number, from 1 up to and
#     including table_limit. Use a for loop with range().
# ID: Cetak tabel perkalian table_number, dari 1 sampai table_limit
#     (table_limit ikut dicetak). Pakai for loop dengan range().
#
# Expected output:
# 7 x 1 = 7
# 7 x 2 = 14
# 7 x 3 = 21
# 7 x 4 = 28
# 7 x 5 = 35
# 7 x 6 = 42
# 7 x 7 = 49
# 7 x 8 = 56
# 7 x 9 = 63
# 7 x 10 = 70

table_number = 7
table_limit = 10

# Write your code below / Tulis kodemu di bawah ini:



print("===== Exercise 2 / Soal 2 =====")
# EN: Count the quizzes, add up the scores, and show the average with
#     2 decimal places.
#     Rule: do NOT use sum() or len(). Use an accumulator and a counter.
# ID: Hitung jumlah kuis, jumlahkan nilainya, dan tampilkan rata-ratanya
#     dengan 2 angka desimal.
#     Aturan: JANGAN pakai sum() atau len(). Pakai akumulator dan penghitung.
#
# Expected output:
# Quizzes: 6
# Total: 490
# Average: 81.67

quiz_scores = [80, 75, 92, 68, 85, 90]

# Write your code below / Tulis kodemu di bawah ini:



print("===== Exercise 3 / Soal 3 =====")
# EN: -1 means the student was absent. For every result:
#         -1        -> count it as absent, then use `continue` to skip the rest
#         65 or more -> it passes: count it AND append it to a new list
#         otherwise -> count it as failed
#     Print the list of passing scores and the three counters.
# ID: -1 berarti mahasiswa tidak hadir. Untuk setiap hasil:
#         -1        -> hitung sebagai absen, lalu pakai `continue` untuk melewati sisanya
#         65 ke atas -> lulus: hitung DAN tambahkan ke list baru
#         selain itu -> hitung sebagai gagal
#     Cetak list nilai yang lulus dan ketiga penghitungnya.
#
# Expected output:
# Passing scores: [72, 90, 65, 81]
# Passed: 4
# Failed: 3
# Absent: 2

exam_results = [72, 58, -1, 90, 64, 65, -1, 81, 49]

# Write your code below / Tulis kodemu di bawah ini:



print("===== Exercise 4 / Soal 4 =====")
# EN: FizzBuzz. For every number from 1 up to and including fizz_limit:
#         divisible by 3 AND 5 -> print FizzBuzz
#         divisible by 3 only  -> print Fizz
#         divisible by 5 only  -> print Buzz
#         otherwise            -> print the number
#     Hint: think about which check has to come FIRST.
# ID: FizzBuzz. Untuk setiap angka dari 1 sampai fizz_limit (ikut dicetak):
#         habis dibagi 3 DAN 5 -> cetak FizzBuzz
#         habis dibagi 3 saja  -> cetak Fizz
#         habis dibagi 5 saja  -> cetak Buzz
#         selain itu           -> cetak angkanya
#     Petunjuk: pikirkan pengecekan mana yang harus ditaruh PALING AWAL.
#
# Expected output:
# 1
# 2
# Fizz
# 4
# Buzz
# Fizz
# 7
# 8
# Fizz
# Buzz
# 11
# Fizz
# 13
# 14
# FizzBuzz

fizz_limit = 15

# Write your code below / Tulis kodemu di bawah ini:



print("===== Exercise 5 / Soal 5 =====")
# EN: Find the highest and the lowest score, and which quiz number they
#     came from (quiz numbers start at 1). Do it in ONE loop with enumerate().
#     Rule: do NOT use max(), min(), sorted(), or .index().
#     Hint: start with the first score as both the highest and the lowest.
# ID: Cari nilai tertinggi dan terendah, beserta nomor kuisnya (nomor kuis
#     dimulai dari 1). Kerjakan dalam SATU loop dengan enumerate().
#     Aturan: JANGAN pakai max(), min(), sorted(), atau .index().
#     Petunjuk: mulai dengan nilai pertama sebagai nilai tertinggi sekaligus terendah.
#
# Expected output:
# Highest: 92 (quiz 4)
# Lowest: 64 (quiz 3)

weekly_quiz = [70, 85, 64, 92, 88, 79]

# Write your code below / Tulis kodemu di bawah ini:



print("===== Exercise 6 / Soal 6 =====")
# EN: Loop over the dictionary with .items(). Print every course with its
#     credits, then the total credits.
#     Rule: do NOT use sum().
# ID: Loop dictionary-nya dengan .items(). Cetak setiap mata kuliah beserta
#     SKS-nya, lalu total SKS-nya.
#     Aturan: JANGAN pakai sum().
#
# Expected output:
# Algorithms: 3 credits
# Discrete Mathematics: 3 credits
# English: 2 credits
# Pancasila: 2 credits
# Calculus: 3 credits
# Total credits: 13

semester_plan = {
    "Algorithms": 3,
    "Discrete Mathematics": 3,
    "English": 2,
    "Pancasila": 2,
    "Calculus": 3,
}

# Write your code below / Tulis kodemu di bawah ini:



print("===== Exercise 7 / Soal 7 =====")
# EN: You are saving for a new phone. You start with starting_savings and
#     add monthly_saving every month. Use a while loop: keep adding until
#     your savings reach phone_price (or more). Print the savings each month,
#     then how many months it took.
# ID: Kamu sedang menabung untuk HP baru. Tabunganmu dimulai dari
#     starting_savings dan bertambah monthly_saving setiap bulan. Pakai while
#     loop: terus tambahkan sampai tabunganmu mencapai phone_price (atau lebih).
#     Cetak tabungan setiap bulan, lalu berapa bulan yang dibutuhkan.
#
# Expected output:
# Month 1: Rp1300000
# Month 2: Rp2100000
# Month 3: Rp2900000
# Month 4: Rp3700000
# Goal reached in 4 months!

phone_price = 3500000
starting_savings = 500000
monthly_saving = 800000

# Write your code below / Tulis kodemu di bawah ini:



print("===== Exercise 8 / Soal 8 =====")
# EN: Use ONE for loop over the characters of secret_word to:
#     1) build the word in reverse
#     2) count the vowels (a, e, i, o, u). Capital letters count too.
#     Rule: do NOT use [::-1] or .count().
#     Hint: start with an empty string "". What happens if you add each new
#     character to the FRONT instead of the back?
# ID: Pakai SATU for loop pada karakter-karakter secret_word untuk:
#     1) menyusun kata tersebut secara terbalik
#     2) menghitung huruf vokal (a, e, i, o, u). Huruf kapital juga dihitung.
#     Aturan: JANGAN pakai [::-1] atau .count().
#     Petunjuk: mulai dengan string kosong "". Apa yang terjadi kalau setiap
#     karakter baru ditambahkan di DEPAN, bukan di belakang?
#
# Expected output:
# Reversed: aggnalriA
# Vowels: 4

secret_word = "Airlangga"

# Write your code below / Tulis kodemu di bawah ini:



print("===== Exercise 9 / Soal 9 (Challenge) =====")
# EN: Draw two patterns with pattern_height rows using NESTED loops.
#     Print ONE character at a time with print(..., end=""), then an empty
#     print() at the end of each row. No spaces after the last star.
#     Hint for the pyramid: on row r (1, 2, 3, ...) there are
#     (pattern_height - r) spaces, then (2 * r - 1) stars.
# ID: Gambar dua pola dengan pattern_height baris memakai loop BERSARANG.
#     Cetak SATU karakter setiap kali dengan print(..., end=""), lalu print()
#     kosong di akhir setiap baris. Tidak boleh ada spasi setelah bintang terakhir.
#     Petunjuk untuk piramida: di baris r (1, 2, 3, ...) ada
#     (pattern_height - r) spasi, lalu (2 * r - 1) bintang.
#
# Expected output:
# Triangle:
# *
# **
# ***
# ****
# Pyramid:
#    *
#   ***
#  *****
# *******

pattern_height = 4

# Write your code below / Tulis kodemu di bawah ini:



print("===== Exercise 10 / Soal 10 (Challenge) =====")
# EN: Build a list of all prime numbers from 2 up to and including
#     prime_limit. A prime number is only divisible by 1 and itself.
#     Hint: for each number, try every divisor from 2 to number - 1.
#     If number % divisor == 0, it is NOT prime: set a flag variable
#     (e.g. is_prime = False) and break out of the inner loop.
#     After the inner loop, append the number if the flag is still True.
# ID: Buat list berisi semua bilangan prima dari 2 sampai prime_limit
#     (prime_limit ikut dicek). Bilangan prima hanya habis dibagi 1 dan
#     dirinya sendiri.
#     Petunjuk: untuk setiap angka, coba semua pembagi dari 2 sampai angka - 1.
#     Kalau angka % pembagi == 0, berarti BUKAN prima: ubah variabel penanda
#     (misalnya is_prime = False) lalu break dari loop dalam.
#     Setelah loop dalam selesai, append angkanya kalau penandanya masih True.
#
# Expected output:
# Primes up to 30: [2, 3, 5, 7, 11, 13, 17, 19, 23, 29]
# Count: 10

prime_limit = 30

# Write your code below / Tulis kodemu di bawah ini:


