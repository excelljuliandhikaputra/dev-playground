"""
Topic 03 - Data Structures Exercises (SOLVED)
Topik 03 - Latihan Struktur Data (SUDAH DIKERJAKAN)
=====================================================
EN - How to use:
    1. Under each exercise, write your own code.
    2. Run:  python data_structures_exercises_unsolved.py
    3. Compare your output with the "Expected output" in each exercise.
       It must match EXACTLY (spaces, punctuation, brackets, quotes).

ID - Cara pakai:
    1. Di bawah setiap soal, tulis kodemu sendiri.
    2. Jalankan:  python data_structures_exercises_unsolved.py
    3. Bandingkan hasilmu dengan "Expected output" di setiap soal.
       Harus PERSIS sama (spasi, tanda baca, kurung, tanda kutip).

Rules / Aturan:
    - Only use Topic 01-03 material. No `if` and no loops yet.
      Hanya pakai materi Topik 01-03. Belum boleh pakai `if` dan loop.
    - NO HARDCODING: get every value from the given variables.
      JANGAN HARDCODE: ambil setiap nilai dari variabel yang diberikan.

Self-check / Cek sendiri:
    When you're done, change the given data and run again.
    If your output doesn't change, you hardcoded something.
    Kalau sudah selesai, ganti data yang diberikan lalu jalankan lagi.
    Kalau output-mu tidak ikut berubah, berarti ada yang di-hardcode.
"""

print("===== Exercise 1 / Soal 1 =====")
# EN: Print the first course, the last course, the number of courses,
#     and the first two courses (use slicing).
# ID: Cetak mata kuliah pertama, terakhir, jumlah mata kuliah,
#     dan dua mata kuliah pertama (pakai slicing).
#
# Expected output:
# First: Algorithms
# Last: Pancasila
# Total: 4
# First two: ['Algorithms', 'Discrete Mathematics']

courses = ["Algorithms", "Discrete Mathematics", "English", "Pancasila"]

# Write your code below / Tulis kodemu di bawah ini:
print(f"First: {courses[0]}")
print(f"Last: {courses[-1]}")
print(f"Total: {len(courses)}")
print(f"First two: {courses[:2]}")


print("===== Exercise 2 / Soal 2 =====")
# EN: Change the shopping list step by step:
#     1) add "bread" to the end
#     2) add "water" to the very beginning
#     3) remove "eggs"
#     Then print the list and the number of items.
# ID: Ubah daftar belanja langkah demi langkah:
#     1) tambahkan "bread" di akhir
#     2) tambahkan "water" di paling depan
#     3) hapus "eggs"
#     Lalu cetak list-nya dan jumlah item-nya.
#
# Expected output:
# Shopping list: ['water', 'rice', 'milk', 'bread']
# Items: 4

shopping = ["rice", "eggs", "milk"]

# Write your code below / Tulis kodemu di bawah ini:
shopping.append("bread")
shopping.insert(0, "water")
shopping.remove("eggs")
print(f"Shopping list: {shopping}")
print(f"Items: {len(shopping)}")

print("===== Exercise 3 / Soal 3 =====")
# EN: Show statistics of the scores. Average must have 2 decimal places.
#     The sorted list should go from lowest to highest.
# ID: Tampilkan statistik nilai. Rata-rata harus 2 angka desimal.
#     List yang diurutkan harus dari terkecil ke terbesar.
#
# Expected output:
# Highest: 92
# Lowest: 65
# Average: 78.80
# Sorted: [65, 71, 78, 88, 92]

scores = [78, 92, 65, 88, 71]

# Write your code below / Tulis kodemu di bawah ini:
print(f"Highest: {max(scores)}")
print(f"Lowest: {min(scores)}")
print(f"Average: {sum(scores) / len(scores):.2f}")
print(f"Sorted: {sorted(scores)}")


print("===== Exercise 4 / Soal 4 =====")
# EN: Check whether each subject is offered, using the `in` operator.
# ID: Cek apakah setiap mata kuliah tersedia, memakai operator `in`.
#
# Expected output:
# Python offered: False
# English offered: True

offered_subjects = ["Algorithms", "English", "Calculus", "Pancasila"]

# Write your code below / Tulis kodemu di bawah ini:
print(f"Python offered: {'Python' in offered_subjects}")
print(f"English offered: {'English' in offered_subjects}")


print("===== Exercise 5 / Soal 5 =====")
# EN: Unpack the tuple into three variables in ONE line,
#     then print them in the format shown.
# ID: Unpack tuple ke tiga variabel dalam SATU baris,
#     lalu cetak dengan format seperti di bawah.
#
# Expected output:
# Excell (20) - class PDB73

student = ("Excell", 20, "PDB73")

# Write your code below / Tulis kodemu di bawah ini:
name, age, class_code = student
print(f"{name} ({age}) - class {class_code}")


print("===== Exercise 6 / Soal 6 =====")
# EN: Work with the profile dictionary:
#     1) print the program
#     2) change semester to 2
#     3) add a new key "gpa" with the value 3.75
#     4) print the whole dictionary
# ID: Olah dictionary profile:
#     1) cetak program studinya
#     2) ubah semester menjadi 2
#     3) tambahkan key baru "gpa" dengan nilai 3.75
#     4) cetak seluruh dictionary
#
# Expected output:
# Program: D4 Teknik Informatika
# {'name': 'Excell', 'program': 'D4 Teknik Informatika', 'semester': 2, 'gpa': 3.75}

profile = {
    "name": "Excell",
    "program": "D4 Teknik Informatika",
    "semester": 1,
}

# Write your code below / Tulis kodemu di bawah ini:
print(f"Program: {profile['program']}")
profile["semester"] = 2
profile["gpa"] = 3.75
print(profile)

print("===== Exercise 7 / Soal 7 =====")
# EN: Look up two contacts. "Grandpa" is NOT in the dictionary,
#     so use .get() with a default value instead of crashing.
# ID: Cari dua kontak. "Grandpa" TIDAK ada di dictionary,
#     jadi pakai .get() dengan nilai default supaya tidak error.
#
# Expected output:
# Mom: 081234567890
# Grandpa: Not found

contacts = {
    "Mom": "081234567890",
    "Dad": "081987654321",
}

# Write your code below / Tulis kodemu di bawah ini:
print(f"Mom: {contacts.get('Mom', 'Not found')}")
print(f"Grandpa: {contacts.get('Grandpa', 'Not found')}")


print("===== Exercise 8 / Soal 8 (Challenge) =====")
# EN: semester is a list of dictionaries.
#     Print the name of the second course and the total credits
#     of all three courses. Get every value from `semester`.
# ID: semester adalah list berisi dictionary.
#     Cetak nama mata kuliah kedua dan total SKS dari ketiga
#     mata kuliah. Ambil setiap nilai dari `semester`.
#
# Expected output:
# Second course: Discrete Mathematics
# Total credits: 8

semester = [
    {"name": "Algorithms", "credits": 3},
    {"name": "Discrete Mathematics", "credits": 3},
    {"name": "English", "credits": 2},
]

# Write your code below / Tulis kodemu di bawah ini:
total_credits = semester[0]["credits"] + semester[1]["credits"] + semester[2]["credits"]
print(f"Second course: {semester[1]['name']}")
print(f"Total credits: {total_credits}")


print("===== Exercise 9 / Soal 9 (Challenge) =====")
# EN: The attendance list has duplicate names.
#     Count how many UNIQUE students attended, then print their names
#     sorted alphabetically and joined with ", ".
#     Hint: set(), len(), sorted(), ", ".join()
# ID: Daftar hadir berisi nama yang dobel.
#     Hitung berapa mahasiswa UNIK yang hadir, lalu cetak nama-namanya
#     urut abjad dan digabung dengan ", ".
#     Petunjuk: set(), len(), sorted(), ", ".join()
#
# Expected output:
# Unique students: 4
# Names: Ani, Budi, Citra, Dina

attendance = ["Budi", "Ani", "Dina", "Ani", "Citra", "Budi"]

# Write your code below / Tulis kodemu di bawah ini:
unique_students = set(attendance)
print(f"Unique students: {len(unique_students)}")
print(f"Names: {', '.join(sorted(unique_students))}")