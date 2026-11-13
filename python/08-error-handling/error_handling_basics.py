"""
Topic 08 - Error Handling
Topik 08 - Penanganan Error
============================
EN: Topics covered in this lesson file.
ID: Topik yang dibahas di file ini.

    1. What is an error (exception)?        | Apa itu error (exception)?
    2. try / except                         | try / except
    3. Common error types                   | Jenis error yang sering muncul
    4. Several except blocks, `as error`    | Beberapa blok except, `as error`
    5. else and finally                     | else dan finally
    6. raise: creating your own error       | raise: membuat error sendiri
    7. Error handling inside functions      | Penanganan error di dalam fungsi
    8. Validation loop (ask until valid)    | Loop validasi (tanya sampai benar)
    9. Good habits and common mistakes      | Kebiasaan baik dan kesalahan umum

Run this file:  python error_handling_basics.py
"""


# ---------------------------------------------------------------------------
# 1. What is an error (exception)?
# EN: When Python can't do something while the program runs, it STOPS the
#     program and shows a "Traceback". The LAST line is the important one:
#         ValueError: invalid literal for int() with base 10: 'abc'
#         ^ error type  ^ the reason
#     Read a traceback from the bottom up: error type -> message -> line number.
#     Errors that happen while the program runs are called EXCEPTIONS.
#     A SyntaxError is different: the code itself is written wrong, so
#     Python can't even start. try/except can't fix that one.
# ID: Kalau Python tidak bisa menjalankan sesuatu saat program berjalan,
#     program BERHENTI dan muncul "Traceback". Baris TERAKHIR yang penting:
#     jenis error dan alasannya.
#     Baca traceback dari bawah ke atas: jenis error -> pesan -> nomor baris.
#     Error yang terjadi saat program berjalan disebut EXCEPTION.
#     SyntaxError berbeda: penulisan kodenya yang salah, jadi Python bahkan
#     tidak bisa mulai. Yang satu itu tidak bisa diatasi dengan try/except.
# ---------------------------------------------------------------------------
print("Step 1: before the risky line")      # Step 1: before the risky line

# EN: The two lines below are commented out because they would CRASH this file.
#     Everything after a crash never runs.
# ID: Dua baris di bawah dijadikan komentar karena akan membuat file ini CRASH.
#     Semua baris setelah crash tidak akan pernah dijalankan.
# number = int("abc")                -> ValueError: invalid literal for int() with base 10: 'abc'
# print("Step 2: never printed")     -> never runs / tidak pernah jalan


# ---------------------------------------------------------------------------
# 2. try / except
# EN: Put the risky code inside `try:`. If an error happens there, Python
#     jumps straight to `except` instead of crashing, and the program goes on.
#     If no error happens, the except block is skipped.
# ID: Taruh kode yang berisiko di dalam `try:`. Kalau terjadi error di sana,
#     Python langsung lompat ke `except` (tidak crash), lalu program lanjut.
#     Kalau tidak ada error, blok except dilewati.
# ---------------------------------------------------------------------------
score_text = "85"
try:
    score = int(score_text)
    print(f"Score: {score}")                # Score: 85
except ValueError:
    print("That is not a number.")          # (skipped / dilewati)

score_text = "eighty"
try:
    score = int(score_text)
    print(f"Score: {score}")                # (skipped: the line above failed / dilewati)
except ValueError:
    print("That is not a number.")          # That is not a number.

print("The program is still running.")      # The program is still running.


# ---------------------------------------------------------------------------
# 3. Common error types
# EN / ID:
#   ValueError         right type, wrong value          int("abc")
#                      tipe benar, nilainya salah
#   ZeroDivisionError  dividing by zero                 10 / 0
#                      pembagian dengan nol
#   KeyError           the dict key doesn't exist       profile["gpa"]
#                      key dictionary tidak ada
#   IndexError         the list index doesn't exist     courses[10]
#                      indeks list tidak ada
#   TypeError          wrong type for the operation     "Score: " + 90
#                      tipe tidak cocok untuk operasinya
# ---------------------------------------------------------------------------
try:
    print(10 / 0)
except ZeroDivisionError:
    print("Can't divide by zero.")              # Can't divide by zero.

profile = {"name": "Excell", "campus": "UNAIR"}
try:
    print(profile["gpa"])
except KeyError:
    print("No 'gpa' key in the profile.")       # No 'gpa' key in the profile.

courses = ["Algorithms", "Calculus", "English"]
try:
    print(courses[10])
except IndexError:
    print("There is no course at index 10.")    # There is no course at index 10.

try:
    print("Score: " + 90)
except TypeError:
    print("Can't join str and int with +.")     # Can't join str and int with +.


# ---------------------------------------------------------------------------
# 4. Several except blocks, `as error`
# EN: One try can have several except blocks. Python runs the FIRST one
#     whose error type matches.
#     `except ValueError as error:` keeps the error in a variable, so you
#     can show Python's own message with {error}.
#     Catch two types with one block: except (ValueError, TypeError):
# ID: Satu try boleh punya beberapa blok except. Python menjalankan blok
#     PERTAMA yang jenis error-nya cocok.
#     `except ValueError as error:` menyimpan error ke sebuah variabel,
#     jadi pesan asli dari Python bisa ditampilkan dengan {error}.
#     Menangkap dua jenis sekaligus: except (ValueError, TypeError):
# ---------------------------------------------------------------------------
test_pairs = [("10", "4"), ("10", "0"), ("ten", "2")]
for top_text, bottom_text in test_pairs:
    try:
        result = int(top_text) / int(bottom_text)
        print(f"{top_text} / {bottom_text} = {result}")
    except ValueError:
        print(f"'{top_text}' or '{bottom_text}' is not a number")
    except ZeroDivisionError:
        print("Can't divide by zero")
# 10 / 4 = 2.5
# Can't divide by zero
# 'ten' or '2' is not a number

try:
    credit_count = int("three")
except ValueError as error:
    print(f"Error message: {error}")
# Error message: invalid literal for int() with base 10: 'three'

try:
    total_credits = 3 + "2"
except (ValueError, TypeError) as error:
    print(f"Something went wrong: {error}")
# Something went wrong: unsupported operand type(s) for +: 'int' and 'str'


# ---------------------------------------------------------------------------
# 5. else and finally
# EN: else    -> runs ONLY if the try block had NO error.
#     finally -> runs ALWAYS, error or not. Good for "clean up" steps,
#                like closing something or printing "done".
#     Order: try -> except (if error) OR else (if no error) -> finally
#     Why else? Keep ONLY the risky line inside try. The code that should run
#     after a success goes to else, so its own mistakes aren't caught by accident.
# ID: else    -> HANYA jalan kalau blok try TIDAK error.
#     finally -> SELALU jalan, error ataupun tidak. Cocok untuk langkah
#                "beres-beres", misalnya menutup sesuatu atau mencetak "selesai".
#     Urutan: try -> except (kalau error) ATAU else (kalau tidak error) -> finally
#     Kenapa pakai else? Di dalam try cukup baris yang berisiko saja. Kode yang
#     jalan setelah berhasil ditaruh di else, supaya kesalahannya sendiri tidak
#     ikut tertangkap tanpa sengaja.
# ---------------------------------------------------------------------------
for text in ["90", "ninety"]:
    print(f"Input: {text}")
    try:
        value = int(text)
    except ValueError:
        print("  except: not a number")
    else:
        print(f"  else: converted to {value}")
    finally:
        print("  finally: always runs")
# Input: 90
#   else: converted to 90
#   finally: always runs
# Input: ninety
#   except: not a number
#   finally: always runs


# ---------------------------------------------------------------------------
# 6. raise: creating your own error
# EN: Sometimes a value has the right TYPE but makes no sense, like a score
#     of 150. Python won't complain, so YOU raise the error:
#         raise ValueError("a clear message")
#     raise stops the function right there, just like a built-in error.
#     Whoever CALLS the function decides what to do, using try/except.
# ID: Kadang nilainya bertipe benar tapi tidak masuk akal, misalnya nilai
#     150. Python tidak protes, jadi KAMU sendiri yang memunculkan error:
#         raise ValueError("pesan yang jelas")
#     raise menghentikan fungsi saat itu juga, sama seperti error bawaan.
#     Yang MEMANGGIL fungsi itulah yang memutuskan harus bagaimana, lewat try/except.
# ---------------------------------------------------------------------------
def check_attendance(percent):
    """
    EN: Return the percent if it's valid (0-100), otherwise raise ValueError.
    ID: Kembalikan persennya kalau valid (0-100), selain itu raise ValueError.
    """
    if percent < 0 or percent > 100:
        raise ValueError(f"attendance must be 0-100, got {percent}")
    return percent


for test_percent in [80, 120]:
    try:
        valid_percent = check_attendance(test_percent)
        print(f"Saved attendance: {valid_percent}%")
    except ValueError as error:
        print(f"Invalid: {error}")
# Saved attendance: 80%
# Invalid: attendance must be 0-100, got 120

# check_attendance(120)   -> crashes without try/except / crash kalau tanpa try/except:
#                            ValueError: attendance must be 0-100, got 120


# ---------------------------------------------------------------------------
# 7. Error handling inside functions
# EN: A common pattern: a small "safe" function that returns a default
#     value instead of crashing. `return` inside try/except works normally.
#     Another pattern: try/except INSIDE a loop, so one bad item is skipped
#     and the loop keeps going.
# ID: Pola yang sering dipakai: fungsi kecil yang "aman", mengembalikan nilai
#     default alih-alih crash. `return` di dalam try/except bekerja seperti biasa.
#     Pola lain: try/except DI DALAM loop, supaya satu item yang rusak
#     dilewati dan loop tetap lanjut.
# ---------------------------------------------------------------------------
def to_float(text, default=0.0):
    """
    EN: Convert text to a float. Return `default` if the text isn't a number.
    ID: Ubah teks menjadi float. Kembalikan `default` kalau teksnya bukan angka.
    """
    try:
        return float(text)
    except ValueError:
        return default


print(to_float("3.75"))             # 3.75
print(to_float("abc"))              # 0.0
print(to_float("abc", -1.0))        # -1.0

prices_text = ["15000", "free", "8000", "", "12000"]
valid_prices = []
bad_items = []
for item in prices_text:
    try:
        valid_prices.append(int(item))
    except ValueError:
        bad_items.append(item)
print(valid_prices)                 # [15000, 8000, 12000]
print(bad_items)                    # ['free', '']


# ---------------------------------------------------------------------------
# 8. Validation loop (ask until valid)
# EN: With input(), the user can type anything. The classic pattern is:
#     keep asking inside `while True` and only `break` when the value is
#     valid. The real version is commented out so this file doesn't wait:
# ID: Dengan input(), pengguna bisa mengetik apa saja. Pola klasiknya:
#     terus bertanya di dalam `while True` dan baru `break` kalau nilainya
#     valid. Versi aslinya dijadikan komentar supaya file ini tidak menunggu:
#
#     while True:
#         text = input("Enter your score (0-100): ")
#         try:
#             score = int(text)
#         except ValueError:
#             print("Please type a whole number.")
#             continue
#         if score >= 0 and score <= 100:
#             break
#         print("The score must be between 0 and 100.")
#     print(f"Saved: {score}")
#
# EN: Below, a list pretends to be what the user typed, one try at a time.
# ID: Di bawah ini, sebuah list berpura-pura menjadi ketikan pengguna, satu per satu.
# ---------------------------------------------------------------------------
fake_inputs = ["abc", "150", "", "85"]
attempt = 0
while True:
    text = fake_inputs[attempt]
    attempt += 1
    print(f"Typed: '{text}'")
    try:
        score = int(text)
    except ValueError:
        print("  Please type a whole number.")
        continue
    if score >= 0 and score <= 100:
        break
    print("  The score must be between 0 and 100.")
print(f"Saved: {score} (after {attempt} tries)")
# Typed: 'abc'
#   Please type a whole number.
# Typed: '150'
#   The score must be between 0 and 100.
# Typed: ''
#   Please type a whole number.
# Typed: '85'
# Saved: 85 (after 4 tries)


# ---------------------------------------------------------------------------
# 9. Good habits and common mistakes
# EN:
#   1. Catch a SPECIFIC error (except ValueError), not everything.
#   2. Keep the try block SMALL: only the line(s) that can fail.
#   3. Don't hide errors with `except: pass`. At least print a message.
#   4. If a simple `if` can prevent the error (like `if name in prices:`),
#      that's fine too. try/except shines when you can't easily check first,
#      for example: does this text convert to int?
# ID:
#   1. Tangkap error yang SPESIFIK (except ValueError), bukan semuanya.
#   2. Blok try harus KECIL: hanya baris yang bisa gagal.
#   3. Jangan sembunyikan error dengan `except: pass`. Minimal cetak pesan.
#   4. Kalau `if` sederhana bisa mencegah error (seperti `if name in prices:`),
#      itu juga boleh. try/except paling berguna kalau sulit dicek duluan,
#      misalnya: apakah teks ini bisa diubah ke int?
#
# Python vs Java:
#   Python: try: ... except ValueError as error: ... finally: ...
#   Java:   try { ... } catch (NumberFormatException e) { ... } finally { ... }
#   Python: raise ValueError("message")
#   Java:   throw new IllegalArgumentException("message");
# ---------------------------------------------------------------------------

# EN: Common mistakes (commented out because they are wrong):
# ID: Kesalahan umum (dijadikan komentar karena salah):

# try:
#     score = int(score_txt)
# except:                       -> catches EVERYTHING, even the typo score_txt (NameError)
#     pass                         menangkap SEMUA error, bahkan salah ketik score_txt (NameError)
#                               -> and `pass` hides it: you never see the bug
#                                  dan `pass` menyembunyikannya: bug-nya tidak pernah kelihatan

# except ValueError             -> SyntaxError: missing colon / kurang titik dua

# try:
#     print("hello")            -> SyntaxError: a try needs at least one except or finally
#                                  try wajib punya minimal satu except atau finally

# except valueerror:            -> NameError: names are case-sensitive, write ValueError
#                                  nama peka huruf besar/kecil, tulis ValueError
