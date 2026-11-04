"""
Topic 05 - Loops
Topik 05 - Perulangan (Loop)
============================
EN: Topics covered in this lesson file.
ID: Topik yang dibahas di file ini.

    1. for loop over a list                 | for loop pada list
    2. range()                              | range()
    3. Looping over a string and a dict     | Loop pada string dan dictionary
    4. Accumulator and counter (+=)         | Akumulator dan penghitung (+=)
    5. Loop + if: filter and build a list   | Loop + if: menyaring dan membuat list
    6. while loop                           | while loop
    7. break and continue                   | break dan continue
    8. enumerate(): position + item         | enumerate(): posisi + item
    9. Nested loops                         | Loop bersarang
   10. Common mistakes                      | Kesalahan umum

Run this file:  python loops_basics.py
"""


# ---------------------------------------------------------------------------
# 1. for loop over a list
# EN: A for loop repeats a block once for EACH item in a list.
#     In every round, the loop variable (here: course) holds the next item.
#     Like if, the line ends with : and the block is indented.
#     Code that is NOT indented runs once, after the loop is finished.
# ID: for loop mengulang sebuah blok sekali untuk SETIAP item di dalam list.
#     Di setiap putaran, variabel loop (di sini: course) berisi item berikutnya.
#     Sama seperti if, barisnya diakhiri : dan bloknya menjorok.
#     Kode yang TIDAK menjorok dijalankan sekali, setelah loop selesai.
# ---------------------------------------------------------------------------
courses = ["Algorithms", "Calculus", "English"]

for course in courses:
    print(f"Studying {course}")
print("All done!")
# Studying Algorithms
# Studying Calculus
# Studying English
# All done!


# ---------------------------------------------------------------------------
# 2. range()
# EN: range() makes a sequence of numbers. The END number is NOT included.
#     range(5)           -> 0, 1, 2, 3, 4
#     range(1, 6)        -> 1, 2, 3, 4, 5
#     range(0, 11, 5)    -> 0, 5, 10      (third number = step)
#     range(3, 0, -1)    -> 3, 2, 1       (negative step counts down)
#     Java:  for (int i = 1; i <= 5; i++)   ==   Python:  for i in range(1, 6)
# ID: range() membuat deretan angka. Angka AKHIR TIDAK ikut.
#     range(5)           -> 0, 1, 2, 3, 4
#     range(1, 6)        -> 1, 2, 3, 4, 5
#     range(0, 11, 5)    -> 0, 5, 10      (angka ketiga = langkah)
#     range(3, 0, -1)    -> 3, 2, 1       (langkah negatif menghitung mundur)
#     Java:  for (int i = 1; i <= 5; i++)   ==   Python:  for i in range(1, 6)
# ---------------------------------------------------------------------------
for i in range(1, 6):
    print(i, end=" ")
print()                         # 1 2 3 4 5   (print() alone = new line / pindah baris)

for i in range(3, 0, -1):
    print(i, end=" ")
print("Go!")                    # 3 2 1 Go!

print(list(range(0, 11, 5)))    # [0, 5, 10]

# EN: The loop variable is often called i when it's just a counter.
# ID: Variabel loop sering dinamai i kalau hanya berfungsi sebagai penghitung.
for i in range(3):
    print("Hip hip hooray!")    # printed 3 times / dicetak 3 kali


# ---------------------------------------------------------------------------
# 3. Looping over a string and a dict
# EN: A for loop over a string gives one CHARACTER per round.
#     A for loop over a dict gives the KEYS.
#     Use .items() to get the key AND the value in each round
#     (this is unpacking from Topic 03, done inside the for line).
# ID: for loop pada string memberi satu KARAKTER per putaran.
#     for loop pada dict memberi KEY-nya.
#     Pakai .items() untuk mendapat key DAN value di setiap putaran
#     (ini unpacking dari Topik 03, dilakukan langsung di baris for).
# ---------------------------------------------------------------------------
for letter in "UNAIR":
    print(letter, end="-")
print()                         # U-N-A-I-R-

course_credits = {"Algorithms": 3, "English": 2, "Pancasila": 2}

for course in course_credits:
    print(course, end=" | ")
print()                         # Algorithms | English | Pancasila |

for course, credit in course_credits.items():
    print(f"{course}: {credit} credits")
# Algorithms: 3 credits
# English: 2 credits
# Pancasila: 2 credits


# ---------------------------------------------------------------------------
# 4. Accumulator and counter (+=)
# EN: ACCUMULATOR: create it with 0 BEFORE the loop, add to it INSIDE the loop,
#     use the result AFTER the loop.
#     COUNTER: the same idea, but you add 1 every time something happens.
#     Shortcut:  total = total + score   can be written as   total += score
#     (-=, *= and /= work the same way). Java has them too, plus count++,
#     but Python has NO ++, so write count += 1.
# ID: AKUMULATOR: buat dengan nilai 0 SEBELUM loop, tambahkan DI DALAM loop,
#     pakai hasilnya SETELAH loop.
#     PENGHITUNG (counter): idenya sama, tapi tambah 1 setiap kali sesuatu terjadi.
#     Singkatan:  total = total + score   bisa ditulis   total += score
#     (-=, *=, dan /= bekerja dengan cara yang sama). Java juga punya, plus
#     count++, tapi Python TIDAK punya ++, jadi tulis count += 1.
# ---------------------------------------------------------------------------
scores = [78, 92, 65, 88]

total = 0
for score in scores:
    total += score              # same as / sama dengan: total = total + score
print(f"Total: {total}")                            # Total: 323
print(f"Average: {total / len(scores):.2f}")        # Average: 80.75

count_above_80 = 0
for score in scores:
    if score > 80:
        count_above_80 += 1
print(f"Scores above 80: {count_above_80}")         # Scores above 80: 2


# ---------------------------------------------------------------------------
# 5. Loop + if: filter and build a list
# EN: Start with an EMPTY list before the loop, then .append() the items you
#     want to keep. After the loop, the new list is ready.
# ID: Mulai dengan list KOSONG sebelum loop, lalu .append() item yang ingin
#     disimpan. Setelah loop selesai, list barunya sudah jadi.
# ---------------------------------------------------------------------------
all_scores = [72, 58, 90, 64, 81]
high_scores = []
for score in all_scores:
    if score >= 80:
        high_scores.append(score)
print(high_scores)              # [90, 81]

names = ["ani", "budi", "citra"]
loud_names = []
for name in names:
    loud_names.append(name.upper())
print(loud_names)               # ['ANI', 'BUDI', 'CITRA']


# ---------------------------------------------------------------------------
# 6. while loop
# EN: while repeats AS LONG AS its condition is True. Use it when you don't
#     know in advance how many rounds you need.
#     Something inside the loop MUST change the condition, otherwise it runs
#     forever (an infinite loop). Stop a stuck program with Ctrl + C.
#     Java also has do-while (runs at least once). Python doesn't have it.
# ID: while mengulang SELAMA kondisinya True. Pakai while kalau jumlah
#     putarannya belum diketahui di awal.
#     Harus ada sesuatu di dalam loop yang mengubah kondisinya, kalau tidak
#     loop berjalan selamanya (infinite loop). Hentikan program yang macet
#     dengan Ctrl + C.
#     Java juga punya do-while (minimal jalan sekali). Python tidak punya.
# ---------------------------------------------------------------------------
file_size_mb = 500
downloaded_mb = 0
minutes = 0

while downloaded_mb < file_size_mb:
    minutes += 1
    downloaded_mb += 120
    print(f"Minute {minutes}: {downloaded_mb} MB")
print(f"Download finished in {minutes} minutes.")
# Minute 1: 120 MB
# Minute 2: 240 MB
# Minute 3: 360 MB
# Minute 4: 480 MB
# Minute 5: 600 MB
# Download finished in 5 minutes.

countdown = 3
while countdown > 0:
    print(countdown, end=" ")
    countdown -= 1
print("Lift off!")              # 3 2 1 Lift off!


# ---------------------------------------------------------------------------
# 7. break and continue
# EN: break    -> stop the WHOLE loop immediately
#     continue -> skip the REST of this round and jump to the next round
#     Both are normally placed inside an if.
# ID: break    -> hentikan SELURUH loop saat itu juga
#     continue -> lewati SISA putaran ini dan langsung lompat ke putaran berikutnya
#     Keduanya biasanya ditaruh di dalam if.
# ---------------------------------------------------------------------------
quiz_results = [80, 75, -1, 90]         # -1 = absent / tidak hadir
for result in quiz_results:
    if result == -1:
        continue                        # skip the absent one / lewati yang absen
    print(result, end=" ")
print()                                 # 80 75 90

queue = ["Ani", "Budi", "Citra", "Dina"]
for name in queue:
    print(f"Checking {name}...")
    if name == "Budi":
        print("Found Budi!")
        break                           # Citra and Dina are never checked
                                        # Citra dan Dina tidak pernah dicek
# Checking Ani...
# Checking Budi...
# Found Budi!

# EN: `while True` repeats forever, so it MUST contain a break.
#     A common use: keep asking until the input is valid.
#     (Commented out so this file runs without waiting. Remove the # to try.)
# ID: `while True` mengulang selamanya, jadi WAJIB ada break di dalamnya.
#     Contoh umum: terus bertanya sampai input-nya benar.
#     (Diberi # supaya file ini tidak berhenti menunggu. Hapus # untuk mencoba.)
# while True:
#     answer = input("Type yes to continue: ")
#     if answer.lower() == "yes":
#         break
#     print("Please type yes.")
# print("Continuing...")


# ---------------------------------------------------------------------------
# 8. enumerate(): position + item
# EN: enumerate() gives you the position AND the item in each round.
#     It counts from 0. Add start=1 to count from 1 like humans do.
# ID: enumerate() memberi posisi DAN item di setiap putaran.
#     Hitungannya mulai dari 0. Tambahkan start=1 supaya mulai dari 1
#     seperti cara manusia menghitung.
# ---------------------------------------------------------------------------
podium = ["Citra", "Ani", "Budi"]
for position, name in enumerate(podium, start=1):
    print(f"{position}. {name}")
# 1. Citra
# 2. Ani
# 3. Budi


# ---------------------------------------------------------------------------
# 9. Nested loops
# EN: A loop inside another loop. For EACH round of the outer loop, the
#     inner loop runs ALL of its rounds. 3 rows x 4 columns = 12 prints.
#     print(..., end="") keeps printing on the same line; an empty print()
#     after the inner loop moves to the next line.
# ID: Loop di dalam loop lain. Untuk SETIAP putaran loop luar, loop dalam
#     menjalankan SEMUA putarannya. 3 baris x 4 kolom = 12 kali cetak.
#     print(..., end="") tetap mencetak di baris yang sama; print() kosong
#     setelah loop dalam membuat pindah ke baris berikutnya.
# ---------------------------------------------------------------------------
for row in range(1, 4):
    for col in range(1, 5):
        print(row * col, end="\t")
    print()
# 1   2   3   4
# 2   4   6   8
# 3   6   9   12

for row in range(3):
    for col in range(5):
        print("*", end="")
    print()
# *****
# *****
# *****


# ---------------------------------------------------------------------------
# 10. Common mistakes
# EN: Each line below is a mistake beginners often make, with the reason.
# ID: Setiap baris di bawah adalah kesalahan yang sering dibuat pemula,
#     beserta alasannya.
# ---------------------------------------------------------------------------
# for i in range(1, 10):     -> stops at 9, not 10 (the end is NOT included)
#                               berhenti di 9, bukan 10 (angka akhir TIDAK ikut)
#
# for score in scores:
#     total = 0              -> total is reset to 0 in EVERY round.
#     total += score            Create it BEFORE the loop.
#                               total di-reset ke 0 di SETIAP putaran.
#                               Buat SEBELUM loop.
#
# for score in scores:
#     total += score
#     print(total)           -> indented: prints in EVERY round.
#                               Un-indent it to print once after the loop.
#                               menjorok: dicetak di SETIAP putaran.
#                               Hapus indentasinya supaya dicetak sekali setelah loop.
#
# count = 0
# while count < 5:
#     print(count)           -> count never changes: infinite loop!
#                               count tidak pernah berubah: infinite loop!
#
# count++                    -> SyntaxError: Python has no ++, use count += 1
#                               Python tidak punya ++, pakai count += 1
#
# sum = 0                    -> works, but now the built-in sum() is broken
# max = 0                       for the rest of the file. Pick other names
#                               (total, highest).
#                               bisa jalan, tapi sum() bawaan jadi rusak untuk
#                               sisa file. Pakai nama lain (total, highest).
