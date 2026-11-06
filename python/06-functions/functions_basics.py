"""
Topic 06 - Functions
Topik 06 - Fungsi
====================
EN: Topics covered in this lesson file.
ID: Topik yang dibahas di file ini.

    1. Defining and calling a function (def)  | Membuat & memanggil fungsi (def)
    2. Parameters and arguments               | Parameter & argumen
    3. return vs print                        | return vs print
    4. return stops the function              | return menghentikan fungsi
    5. Default parameters                     | Parameter default
    6. Returning multiple values              | Mengembalikan banyak nilai
    7. Scope: local vs global                 | Cakupan variabel: lokal vs global
    8. Docstrings                             | Docstring (dokumentasi fungsi)
    9. Functions calling other functions      | Fungsi memanggil fungsi lain

Run this file:  python functions_basics.py
"""


# ---------------------------------------------------------------------------
# 1. Defining and calling a function (def)
# EN: A function is a named block of code you can reuse. Define it ONCE
#     with `def name():`, then call it with `name()` as often as you need.
#     The body is indented (4 spaces), just like inside if/for.
#     Defining a function does NOT run it. Only CALLING it does.
# ID: Fungsi adalah blok kode bernama yang bisa dipakai berulang kali.
#     Definisikan SEKALI dengan `def nama():`, lalu panggil dengan `nama()`
#     sesering yang kamu mau. Isinya menjorok (4 spasi), sama seperti di
#     dalam if/for. Mendefinisikan fungsi TIDAK menjalankannya. Fungsi baru
#     berjalan saat DIPANGGIL.
#
# EN: Java calls these "methods" (Java Topic 07) and needs a type for
#     everything:  static void sayHello() { ... }
#     Python only needs `def`, no types.
# ID: Java menyebutnya "method" (Java Topik 07) dan semuanya butuh tipe:
#     static void sayHello() { ... }
#     Python cukup memakai `def`, tanpa tipe.
# ---------------------------------------------------------------------------
def say_hello():
    print("Hello, welcome to Topic 06!")


say_hello()         # Hello, welcome to Topic 06!
say_hello()         # Hello, welcome to Topic 06!  (reused / dipakai ulang)

# say_hello          -> no ( ): the function is NOT called, nothing happens
#                       tanpa ( ): fungsinya TIDAK dipanggil, tidak terjadi apa-apa
# Calling a function ABOVE its `def` line -> NameError (Python reads top to bottom)
# Memanggil fungsi DI ATAS baris `def`-nya -> NameError (Python membaca dari atas ke bawah)


# ---------------------------------------------------------------------------
# 2. Parameters and arguments
# EN: Parameters are the variable names inside ( ) in the definition.
#     Arguments are the real values you send when you call the function.
#     They are matched by POSITION: first argument -> first parameter.
# ID: Parameter adalah nama variabel di dalam ( ) pada definisi fungsi.
#     Argumen adalah nilai sungguhan yang dikirim saat fungsi dipanggil.
#     Pasangannya ditentukan oleh URUTAN: argumen pertama -> parameter pertama.
# ---------------------------------------------------------------------------
def introduce(name, program):           # name, program = parameters / parameter
    print(f"Hi, I'm {name} from {program}.")


introduce("Excell", "Informatics")      # Hi, I'm Excell from Informatics.
introduce("Budi", "Accounting")         # Hi, I'm Budi from Accounting.
introduce("Accounting", "Budi")         # Hi, I'm Accounting from Budi.  (wrong order / urutan salah)

# introduce("Excell")   -> TypeError: missing 1 required positional argument: 'program'
#                          every parameter needs a value / setiap parameter butuh nilai


# ---------------------------------------------------------------------------
# 3. return vs print
# EN: print() only SHOWS a value on the screen.
#     return SENDS the value back to the caller, so you can store it in a
#     variable and keep using it. A function without return gives back None.
# ID: print() hanya MENAMPILKAN nilai ke layar.
#     return MENGIRIM nilai kembali ke pemanggil, jadi bisa disimpan di
#     variabel dan dipakai lagi. Fungsi tanpa return mengembalikan None.
# ---------------------------------------------------------------------------
def square_print(n):
    print(n * n)            # shows the result, but gives back None
                            # menampilkan hasil, tapi mengembalikan None


def square_return(n):
    return n * n            # gives the result back to the caller
                            # mengembalikan hasil ke pemanggil


result_a = square_print(4)      # 16  (printed INSIDE the function / dicetak DI DALAM fungsi)
result_b = square_return(4)     # (nothing printed / tidak ada yang dicetak)
print(result_a)                 # None
print(result_b)                 # 16
print(square_return(4) + 1)     # 17
# square_print(4) + 1           -> TypeError: None + 1 doesn't work / None + 1 tidak bisa


def rectangle_area(length, width):
    return length * width


room = rectangle_area(5, 3)
print(f"Room area: {room} m2")              # Room area: 15 m2
print(rectangle_area(2, 4) + room)          # 23


# ---------------------------------------------------------------------------
# 4. return stops the function
# EN: The moment Python reaches `return`, the function ENDS. Lines after
#     it are skipped. Inside if/for this is useful: return the answer as
#     soon as you know it (this is called "early return").
#     A comparison like score >= 65 is already True/False, so you can
#     return it directly.
# ID: Begitu Python sampai di `return`, fungsi langsung SELESAI. Baris
#     sesudahnya dilewati. Di dalam if/for ini berguna: kembalikan jawaban
#     begitu kamu sudah tahu (disebut "early return").
#     Perbandingan seperti score >= 65 sudah bernilai True/False, jadi
#     bisa langsung di-return.
# ---------------------------------------------------------------------------
def is_passing(score):
    return score >= 65


print(is_passing(80))       # True
print(is_passing(50))       # False


def has_failing_score(scores):
    for score in scores:
        if score < 65:
            return True     # found one: stop right here / ketemu: langsung berhenti
    return False            # the loop checked EVERY score, none failed
                            # loop sudah mengecek SEMUA nilai, tidak ada yang gagal


print(has_failing_score([90, 72, 40, 88]))      # True
print(has_failing_score([90, 72, 88]))          # False

# Common mistake / Kesalahan umum:
#     for score in scores:
#         if score < 65:
#             return True
#         else:
#             return False
# EN: This stops after the FIRST score, so [90, 40] gives False. Wrong!
#     Only return False AFTER the loop has finished.
# ID: Ini berhenti di nilai PERTAMA, jadi [90, 40] hasilnya False. Salah!
#     Return False hanya SETELAH loop selesai.


# ---------------------------------------------------------------------------
# 5. Default parameters
# EN: A parameter can have a default value. If the caller doesn't send an
#     argument for it, the default is used. Parameters WITH a default must
#     come AFTER the ones without.
#     (Java has no default parameters; it uses overloading instead, Java Topic 07.)
# ID: Parameter bisa punya nilai default. Kalau pemanggil tidak mengirim
#     argumen untuk parameter itu, nilai default yang dipakai. Parameter
#     yang PUNYA default harus ditulis SETELAH parameter tanpa default.
#     (Java tidak punya parameter default; Java memakai overloading, Java Topik 07.)
# ---------------------------------------------------------------------------
def greet(name, greeting="Hello"):
    return f"{greeting}, {name}!"


print(greet("Excell"))                      # Hello, Excell!
print(greet("Excell", "Good morning"))      # Good morning, Excell!


def final_price(price, discount_percent=0):
    discount = price * discount_percent / 100
    return price - discount


print(final_price(100000))          # 100000.0  (default: no discount / tanpa diskon)
print(final_price(100000, 20))      # 80000.0

# def greet(greeting="Hello", name):   -> SyntaxError: a default parameter can't
#                                         come before one without a default
#                                         parameter default tidak boleh di depan
#                                         parameter tanpa default


# ---------------------------------------------------------------------------
# 6. Returning multiple values
# EN: Write several values after return, separated by commas. Python packs
#     them into a TUPLE (Topic 03), which you can unpack into variables.
#     (A Java method can only return ONE value.)
# ID: Tulis beberapa nilai setelah return, dipisah koma. Python mengemasnya
#     menjadi TUPLE (Topik 03), yang bisa di-unpack ke beberapa variabel.
#     (Method Java hanya bisa mengembalikan SATU nilai.)
# ---------------------------------------------------------------------------
def score_stats(scores):
    lowest = min(scores)
    highest = max(scores)
    mean = sum(scores) / len(scores)
    return lowest, highest, mean


low, high, avg = score_stats([78, 92, 65, 88])      # unpacking
print(f"Lowest: {low}, Highest: {high}, Average: {avg:.2f}")
# Lowest: 65, Highest: 92, Average: 80.75

stats = score_stats([78, 92, 65, 88])
print(stats)                # (65, 92, 80.75)  <- really a tuple / sebenarnya tuple
print(stats[1])             # 92

# low, high = score_stats([78, 92])   -> ValueError: too many values to unpack
#                                        3 values need 3 variables / 3 nilai butuh 3 variabel


# ---------------------------------------------------------------------------
# 7. Scope: local vs global
# EN: A GLOBAL variable is created outside any function and can be READ
#     anywhere. A LOCAL variable is created inside a function and only
#     exists while that function runs.
#     Assigning to a name inside a function creates a NEW local variable;
#     the global one with the same name is NOT changed.
# ID: Variabel GLOBAL dibuat di luar fungsi dan bisa DIBACA di mana saja.
#     Variabel LOKAL dibuat di dalam fungsi dan hanya ada selama fungsi
#     itu berjalan.
#     Mengisi sebuah nama di dalam fungsi membuat variabel lokal BARU;
#     variabel global dengan nama yang sama TIDAK ikut berubah.
# ---------------------------------------------------------------------------
campus = "UNAIR"                    # global


def show_campus():
    semester = 1                    # local / lokal
    print(f"I study at {campus}, semester {semester}.")


show_campus()                       # I study at UNAIR, semester 1.
# print(semester)   -> NameError: semester only exists inside show_campus()
#                      semester hanya ada di dalam show_campus()


def change_campus():
    campus = "Another campus"       # a NEW local variable / variabel lokal BARU
    print(f"Inside: {campus}")


change_campus()                     # Inside: Another campus
print(f"Outside: {campus}")         # Outside: UNAIR  (global unchanged / global tidak berubah)

# EN: Python has a `global` keyword to change a global variable from inside
#     a function, but avoid it: it makes bugs hard to find. The clean way
#     is: send values IN with parameters, get them OUT with return.
# ID: Python punya kata kunci `global` untuk mengubah variabel global dari
#     dalam fungsi, tapi hindari: bug jadi susah dicari. Cara yang rapi:
#     kirim nilai MASUK lewat parameter, ambil hasilnya KELUAR lewat return.
def add_bonus(score, bonus):
    return score + bonus


final_score = 80
final_score = add_bonus(final_score, 5)
print(final_score)                  # 85


# ---------------------------------------------------------------------------
# 8. Docstrings
# EN: A docstring is a "triple-quoted" text written as the FIRST line inside
#     a function. It explains what the function does. VS Code shows it when
#     you hover over the function name. Good habit for every function.
# ID: Docstring adalah teks dalam "tiga tanda kutip" yang ditulis di baris
#     PERTAMA di dalam fungsi. Isinya menjelaskan tugas fungsi tersebut.
#     VS Code menampilkannya saat kursor diarahkan ke nama fungsi.
#     Kebiasaan baik untuk setiap fungsi.
# ---------------------------------------------------------------------------
def average(numbers):
    """
    EN: Return the average of a list of numbers, or 0 if the list is empty.
    ID: Mengembalikan rata-rata dari list angka, atau 0 jika list kosong.
    """
    if len(numbers) == 0:
        return 0
    return sum(numbers) / len(numbers)


print(average([80, 90, 70]))        # 80.0
print(average([]))                  # 0
print(average.__doc__)              # prints the docstring / menampilkan docstring-nya


# ---------------------------------------------------------------------------
# 9. Functions calling other functions
# EN: Small functions can be combined to build bigger ones. Write a piece
#     of logic ONCE, then reuse it (DRY: Don't Repeat Yourself).
#     class_report() below reuses average() and is_passing() from above.
# ID: Fungsi-fungsi kecil bisa digabung untuk membangun fungsi yang lebih
#     besar. Tulis sebuah logika SEKALI, lalu pakai ulang (DRY: Don't
#     Repeat Yourself / jangan menulis kode yang sama berulang kali).
#     class_report() di bawah memakai ulang average() dan is_passing().
# ---------------------------------------------------------------------------
def class_report(scores):
    passed = 0
    for score in scores:
        if is_passing(score):
            passed += 1
    return f"Average: {average(scores):.1f} | Passed: {passed} of {len(scores)}"


print(class_report([90, 55, 72, 40, 88]))   # Average: 69.0 | Passed: 3 of 5
print(class_report([70, 65]))               # Average: 67.5 | Passed: 2 of 2
