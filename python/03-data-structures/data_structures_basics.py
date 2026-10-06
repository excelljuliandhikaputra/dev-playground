"""
Topic 03 - Data Structures
Topik 03 - Struktur Data
==========================
EN: Topics covered in this lesson file.
ID: Topik yang dibahas di file ini.

    1. List: creating, indexing, slicing    | List: membuat, indeks, slicing
    2. List: changing items                 | List: mengubah isi
    3. List: useful helpers                 | List: fungsi bantu yang berguna
    4. Tuple                                | Tuple
    5. Dictionary                           | Dictionary
    6. Nested data (list of dictionaries)   | Data bersarang (list berisi dictionary)
    7. Set                                  | Set
    8. Which one should I use?              | Kapan pakai yang mana?

Run this file:  python data_structures_basics.py
"""


# ---------------------------------------------------------------------------
# 1. List: creating, indexing, slicing
# EN: A list stores many values in order, inside [ ].
#     Index starts at 0. Negative index counts from the end (-1 = last).
#     Slicing [start:end] takes items from start up to (NOT including) end.
# ID: List menyimpan banyak nilai secara berurutan, di dalam [ ].
#     Indeks dimulai dari 0. Indeks negatif dihitung dari belakang (-1 = terakhir).
#     Slicing [start:end] mengambil item dari start sampai SEBELUM end.
# ---------------------------------------------------------------------------
courses = ["Algorithms", "Discrete Mathematics", "English", "Pancasila"]

print(courses[0])       # Algorithms
print(courses[-1])      # Pancasila
print(courses[1:3])     # ['Discrete Mathematics', 'English']
print(len(courses))     # 4


# ---------------------------------------------------------------------------
# 2. List: changing items
# EN: Lists are MUTABLE: you can change, add, and remove items.
# ID: List bersifat MUTABLE: isinya bisa diubah, ditambah, dan dihapus.
# ---------------------------------------------------------------------------
courses[2] = "Academic English"     # replace an item / ganti item
courses.append("Calculus")          # add to the END / tambah di AKHIR
courses.insert(0, "Intro to IT")    # add at a position / tambah di posisi tertentu
courses.remove("Pancasila")         # remove by value / hapus berdasarkan nilai
last_course = courses.pop()         # remove the LAST item and return it
                                    # hapus item TERAKHIR dan kembalikan nilainya
print(courses)
print(f"Popped: {last_course}")

numbers = [42, 7, 19, 3]
numbers.sort()                      # sort in place / urutkan langsung
print(numbers)                      # [3, 7, 19, 42]
numbers.reverse()                   # reverse in place / balik urutan
print(numbers)                      # [42, 19, 7, 3]


# ---------------------------------------------------------------------------
# 3. List: useful helpers
# EN: sum(), min(), max() work on lists of numbers.
#     `in` checks if a value exists and gives True/False.
#     sorted() returns a NEW sorted list (the original stays the same).
#     ", ".join(list) glues a list of strings into one string.
# ID: sum(), min(), max() bisa dipakai pada list berisi angka.
#     `in` mengecek apakah sebuah nilai ada, hasilnya True/False.
#     sorted() menghasilkan list BARU yang terurut (list asli tidak berubah).
#     ", ".join(list) menggabungkan list berisi string menjadi satu string.
# ---------------------------------------------------------------------------
scores = [78, 92, 65, 88]
print(sum(scores))                  # 323
print(min(scores), max(scores))     # 65 92
print(f"Average: {sum(scores) / len(scores):.2f}")

print(92 in scores)                 # True
print(100 in scores)                # False

print(sorted(scores))               # [65, 78, 88, 92]
print(scores)                       # [78, 92, 65, 88] (unchanged / tidak berubah)

grades = ["A", "B", "A", "C", "A"]
print(grades.count("A"))            # 3
print(grades.index("C"))            # 3 (position of the first "C" / posisi "C" pertama)

friends = ["Ani", "Budi", "Citra"]
print(", ".join(friends))           # Ani, Budi, Citra


# ---------------------------------------------------------------------------
# 4. Tuple
# EN: A tuple is like a list but uses ( ) and is IMMUTABLE: once created,
#     it can't be changed. Good for data that should stay fixed.
#     "Unpacking" puts each item into its own variable in one line.
# ID: Tuple mirip list tapi memakai ( ) dan bersifat IMMUTABLE: setelah
#     dibuat, isinya tidak bisa diubah. Cocok untuk data yang harus tetap.
#     "Unpacking" memasukkan setiap item ke variabelnya masing-masing
#     dalam satu baris.
# ---------------------------------------------------------------------------
coordinates = (67, 212)
print(f"X: {coordinates[0]}, Y: {coordinates[1]}")
# coordinates[0] = 10    -> TypeError: tuples can't be changed / tuple tidak bisa diubah

x, y = coordinates       # unpacking
print(x)                 # 67
print(y)                 # 212


# ---------------------------------------------------------------------------
# 5. Dictionary
# EN: A dictionary stores KEY: VALUE pairs inside { }.
#     You look values up by key, not by position.
#     dict["key"]       -> crashes (KeyError) if the key doesn't exist
#     dict.get("key", default) -> returns the default instead of crashing
# ID: Dictionary menyimpan pasangan KEY: VALUE di dalam { }.
#     Nilai dicari berdasarkan key, bukan posisi.
#     dict["key"]       -> error (KeyError) kalau key tidak ada
#     dict.get("key", default) -> mengembalikan default, tidak error
# ---------------------------------------------------------------------------
contacts = {
    "Mom": "081234567890",
    "Dad": "081987654321",
    "Older Sibling": "081122334455",
}

print(contacts["Mom"])                          # 081234567890
print(contacts.get("Grandpa", "Not found"))     # Not found

contacts["Younger Sibling"] = "081223344556"    # add a new key / tambah key baru
contacts["Dad"] = "089999999999"                # update an existing key / ubah key yang ada
del contacts["Older Sibling"]                   # delete a key / hapus key

print(contacts)
print(len(contacts))                            # 3
print("Mom" in contacts)                        # True (checks KEYS / mengecek KEY)
print(list(contacts.keys()))                    # ['Mom', 'Dad', 'Younger Sibling']
print(list(contacts.values()))


# ---------------------------------------------------------------------------
# 6. Nested data (list of dictionaries)
# EN: Real data is often a list where each item is a dictionary.
#     Read it step by step: first pick the item [index], then the ["key"].
# ID: Data nyata sering berupa list yang tiap itemnya adalah dictionary.
#     Bacanya bertahap: pilih item [indeks] dulu, lalu ["key"]-nya.
# ---------------------------------------------------------------------------
semester_courses = [
    {"name": "Algorithms", "credits": 3},
    {"name": "English", "credits": 2},
]
print(semester_courses[0]["name"])      # Algorithms
print(semester_courses[1]["credits"])   # 2


# ---------------------------------------------------------------------------
# 7. Set
# EN: A set stores UNIQUE values inside { } with no order and no duplicates.
#     The fastest way to remove duplicates from a list: set(list).
# ID: Set menyimpan nilai UNIK di dalam { }, tanpa urutan dan tanpa duplikat.
#     Cara tercepat menghapus duplikat dari list: set(list).
# ---------------------------------------------------------------------------
visitors = ["Ani", "Budi", "Ani", "Citra", "Budi"]
unique_visitors = set(visitors)
print(len(unique_visitors))             # 3
print(sorted(unique_visitors))          # ['Ani', 'Budi', 'Citra']


# ---------------------------------------------------------------------------
# 8. Which one should I use?
# EN / ID:
#   list  [ ]  ordered, changeable, allows duplicates
#              berurutan, bisa diubah, boleh duplikat       -> course list
#   tuple ( )  ordered, NOT changeable
#              berurutan, TIDAK bisa diubah                  -> coordinates
#   dict  { }  key: value pairs, look up by key
#              pasangan key: value, dicari lewat key        -> contacts, profile
#   set   { }  unique values only, no order
#              hanya nilai unik, tanpa urutan               -> remove duplicates
# ---------------------------------------------------------------------------
