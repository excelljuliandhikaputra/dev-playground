"""
Topic 08 - Error Handling Exercises (UNSOLVED)
Topik 08 - Latihan Penanganan Error (BELUM DIKERJAKAN)
=======================================================
EN - How to use:
    1. Replace every `pass` with your own code.
    2. Run:  python error_handling_exercises_unsolved.py
    3. The checker at the bottom tests every function with several inputs.
       [TODO] = not started, [FAIL] = wrong answer, [PASS] = correct,
       [RULE] = right answer, but the required tool (try/except, raise...) is missing

ID - Cara pakai:
    1. Ganti setiap `pass` dengan kodemu sendiri.
    2. Jalankan:  python error_handling_exercises_unsolved.py
    3. Checker di bagian bawah menguji setiap fungsi dengan beberapa input.
       [TODO] = belum dikerjakan, [FAIL] = jawaban salah, [PASS] = benar,
       [RULE] = jawaban benar, tapi alat yang diwajibkan (try/except, raise...) tidak dipakai

Rules / Aturan:
    - Only use Topic 01-08 material.
      Hanya pakai materi Topik 01-08.
    - Use try/except in every exercise (Exercise 7 uses raise instead).
      Checking with `if` alone is not the point of this topic.
      Pakai try/except di setiap soal (Soal 7 memakai raise).
      Mengecek dengan `if` saja bukan tujuan topik ini.
    - NO HARDCODING: work with the parameters, never return fixed answers.
      JANGAN HARDCODE: olah parameternya, jangan mengembalikan jawaban tetap.
    - Only edit the function bodies. Do not change the checker.
      Ubah hanya isi fungsi. Jangan ubah bagian checker.

Self-check / Cek sendiri:
    The checker calls every function with different inputs, so a hardcoded
    answer fails. You can also try your own values by adding lines like
    print(safe_int("12")) at the very bottom of the file.
    Checker memanggil setiap fungsi dengan input yang berbeda-beda, jadi
    jawaban hardcode pasti gagal. Kamu juga bisa mencoba nilai sendiri dengan
    menambahkan baris seperti print(safe_int("12")) di paling bawah file.
"""


# ---------------------------------------------------------------------------
# LEVEL 1 - WARM UP
# ---------------------------------------------------------------------------

def safe_int(text):
    """
    Exercise 1 / Soal 1: Convert text to an int without crashing.
    EN: Return the text as an int. If the text is not a whole number,
        catch the ValueError and return None.
    ID: Kembalikan teks sebagai int. Kalau teksnya bukan bilangan bulat,
        tangkap ValueError lalu kembalikan None.
    Examples / Contoh:
        safe_int("85")   -> 85
        safe_int("-7")   -> -7
        safe_int("abc")  -> None
        safe_int("3.5")  -> None
    """
    pass


def safe_divide(a, b):
    """
    Exercise 2 / Soal 2: Divide without crashing.
    EN: Return a / b. If b is 0, catch the ZeroDivisionError and return
        the text "Cannot divide by zero". Don't check b with `if`.
    ID: Kembalikan a / b. Kalau b bernilai 0, tangkap ZeroDivisionError lalu
        kembalikan teks "Cannot divide by zero". Jangan cek b pakai `if`.
    Examples / Contoh:
        safe_divide(10, 4)  -> 2.5
        safe_divide(7, 0)   -> "Cannot divide by zero"
    """
    pass


def get_credits(course_credits, course_name):
    """
    Exercise 3 / Soal 3: Look up the credits (SKS) of a course.
    EN: course_credits is a dict like {"Algorithms": 3, "English": 2}.
        Return the credits of course_name. If the course isn't in the dict,
        catch the KeyError and return "<course_name> not found".
        Don't use .get() or `in` here: practise try/except.
    ID: course_credits adalah dict seperti {"Algorithms": 3, "English": 2}.
        Kembalikan SKS dari course_name. Kalau mata kuliahnya tidak ada di
        dict, tangkap KeyError lalu kembalikan "<course_name> not found".
        Jangan pakai .get() atau `in` di sini: latih try/except.
    Examples / Contoh:
        get_credits({"Algorithms": 3, "English": 2}, "English")  -> 2
        get_credits({"Algorithms": 3, "English": 2}, "Biology")  -> "Biology not found"
    """
    pass


def get_item(items, index):
    """
    Exercise 4 / Soal 4: Get a list item safely.
    EN: Return items[index]. If that index doesn't exist, catch the
        IndexError and return "No item at index <index>".
    ID: Kembalikan items[index]. Kalau indeks itu tidak ada, tangkap
        IndexError lalu kembalikan "No item at index <index>".
    Examples / Contoh:
        get_item(["Algorithms", "Calculus", "English"], 1)   -> "Calculus"
        get_item(["Algorithms", "Calculus", "English"], -1)  -> "English"
        get_item(["Algorithms", "Calculus", "English"], 5)   -> "No item at index 5"
    """
    pass


# ---------------------------------------------------------------------------
# LEVEL 2 - CORE PRACTICE
# ---------------------------------------------------------------------------

def total_credits(credit_list):
    """
    Exercise 5 / Soal 5: Add up credits, but some were typed as text.
    EN: Return the sum of credit_list. If the list contains something that
        isn't a number (like "2" or None), sum() raises a TypeError:
        catch it and return "Error: credits must be numbers".
    ID: Kembalikan jumlah dari credit_list. Kalau list-nya berisi sesuatu
        yang bukan angka (misalnya "2" atau None), sum() memunculkan
        TypeError: tangkap lalu kembalikan "Error: credits must be numbers".
    Examples / Contoh:
        total_credits([3, 3, 2])    -> 8
        total_credits([3, "2", 4])  -> "Error: credits must be numbers"
        total_credits([])           -> 0
    """
    pass


def divide_texts(top_text, bottom_text):
    """
    Exercise 6 / Soal 6: Two possible errors, two except blocks.
    EN: Both parameters are text (like the result of input()).
        Convert both to int and divide top by bottom.
          success            -> "Result: <answer>"
          not a number       -> "Error: not a number"       (ValueError)
          bottom is zero     -> "Error: division by zero"   (ZeroDivisionError)
    ID: Kedua parameter berupa teks (seperti hasil input()).
        Ubah keduanya ke int lalu bagi top dengan bottom.
          berhasil           -> "Result: <hasil>"
          bukan angka        -> "Error: not a number"       (ValueError)
          pembaginya nol     -> "Error: division by zero"   (ZeroDivisionError)
    Examples / Contoh:
        divide_texts("10", "4")   -> "Result: 2.5"
        divide_texts("ten", "2")  -> "Error: not a number"
        divide_texts("10", "0")   -> "Error: division by zero"
    """
    pass


def parse_score(text):
    """
    Exercise 7 / Soal 7: RAISE an error yourself.
    EN: Convert text to an int and return it, but only if it's 0-100.
        - If the score is below 0 or above 100:
              raise ValueError("Score must be between 0 and 100")
        - If the text isn't a number, int() already raises ValueError.
          Let it happen: do NOT catch it in this function.
        The checker calls your function inside try/except and expects the
        ValueError to come out of it.
    ID: Ubah teks menjadi int lalu kembalikan, tapi hanya kalau nilainya 0-100.
        - Kalau nilainya di bawah 0 atau di atas 100:
              raise ValueError("Score must be between 0 and 100")
        - Kalau teksnya bukan angka, int() sudah memunculkan ValueError
          sendiri. Biarkan saja: JANGAN ditangkap di fungsi ini.
        Checker memanggil fungsimu di dalam try/except dan mengharapkan
        ValueError itu keluar dari fungsimu.
    Examples / Contoh:
        parse_score("85")   -> 85
        parse_score("100")  -> 100
        parse_score("150")  -> raises ValueError / memunculkan ValueError
        parse_score("abc")  -> raises ValueError / memunculkan ValueError
    """
    pass


def average_of_strings(values):
    """
    Exercise 8 / Soal 8: The average of messy data.
    EN: values is a list of texts, e.g. scores typed in by students.
        Convert each one to int. Skip the ones that fail (ValueError)
        and count how many you skipped.
        Return TWO values: (average, skipped)
          - average = total of the valid numbers / number of valid numbers
          - if there are no valid numbers, average is 0
    ID: values adalah list berisi teks, misalnya nilai yang diketik mahasiswa.
        Ubah masing-masing menjadi int. Lewati yang gagal (ValueError)
        dan hitung berapa yang dilewati.
        Kembalikan DUA nilai: (average, skipped)
          - average = total angka yang valid / banyaknya angka yang valid
          - kalau tidak ada angka yang valid, average bernilai 0
    Examples / Contoh:
        average_of_strings(["80", "x", "90"])  -> (85.0, 1)
        average_of_strings(["a", "b"])         -> (0, 2)
    """
    pass


# ---------------------------------------------------------------------------
# LEVEL 3 - CHALLENGE
# ---------------------------------------------------------------------------

def validate_registration(form):
    """
    Exercise 9 / Soal 9 (Challenge): Check a whole registration form.
    EN: form is a dict where every value is text, for example:
            {"name": "Excell", "age": "20", "gpa": "3.75"}
        Check the three fields IN THIS ORDER (name, age, gpa) and collect
        the error messages in a list. Return the list.
        An empty list [] means everything is fine.
          name:  key missing            -> "name: missing"
                 empty or only spaces   -> "name: empty"
          age:   key missing            -> "age: missing"
                 not a whole number     -> "age: not a number"
                 below 16 or above 60   -> "age: out of range"
          gpa:   key missing            -> "gpa: missing"
                 not a number (float)   -> "gpa: not a number"
                 below 0 or above 4     -> "gpa: out of range"
        Each field gives at most ONE message.
        Use try/except for missing keys (KeyError) and bad numbers (ValueError).
    ID: form adalah dict yang semua nilainya berupa teks, contohnya di atas.
        Cek ketiga field SESUAI URUTAN INI (name, age, gpa) dan kumpulkan
        pesan error-nya ke dalam list. Kembalikan list tersebut.
        List kosong [] berarti semuanya sudah benar.
          name:  key tidak ada          -> "name: missing"
                 kosong / hanya spasi   -> "name: empty"
          age:   key tidak ada          -> "age: missing"
                 bukan bilangan bulat   -> "age: not a number"
                 di bawah 16 / di atas 60 -> "age: out of range"
          gpa:   key tidak ada          -> "gpa: missing"
                 bukan angka (float)    -> "gpa: not a number"
                 di bawah 0 / di atas 4 -> "gpa: out of range"
        Setiap field menghasilkan paling banyak SATU pesan.
        Pakai try/except untuk key yang tidak ada (KeyError) dan angka yang
        salah (ValueError).
    Examples / Contoh:
        validate_registration({"name": "Excell", "age": "20", "gpa": "3.75"})
            -> []
        validate_registration({"name": "  ", "age": "abc", "gpa": "4.5"})
            -> ["name: empty", "age: not a number", "gpa: out of range"]
        validate_registration({"age": "15"})
            -> ["name: missing", "age: out of range", "gpa: missing"]
    """
    pass


def split_fee_log(total_fee, people_text):
    """
    Exercise 10 / Soal 10 (Challenge): Watch try/except/else/finally run.
    EN: A group wants to split a fee (total_fee, an int) equally.
        people_text is text. Make a list called log and add one message
        from each block that runs:
          try:                       first add "try: started", then convert
                                     people_text to int and compute
                                     share = total_fee // people
          except ValueError:         add "except: people is not a number"
          except ZeroDivisionError:  add "except: cannot split between 0 people"
          else:                      add "else: each pays <share>"
          finally:                   add "finally: done"
        Return log AFTER the whole try statement (not inside finally).
    ID: Sekelompok orang ingin membagi biaya (total_fee, sebuah int) sama rata.
        people_text berupa teks. Buat list bernama log dan tambahkan satu
        pesan dari setiap blok yang dijalankan:
          try:                       tambahkan "try: started" dulu, lalu ubah
                                     people_text ke int dan hitung
                                     share = total_fee // people
          except ValueError:         tambahkan "except: people is not a number"
          except ZeroDivisionError:  tambahkan "except: cannot split between 0 people"
          else:                      tambahkan "else: each pays <share>"
          finally:                   tambahkan "finally: done"
        Kembalikan log SETELAH seluruh blok try selesai (bukan di dalam finally).
    Examples / Contoh:
        split_fee_log(90000, "3")
            -> ["try: started", "else: each pays 30000", "finally: done"]
        split_fee_log(90000, "three")
            -> ["try: started", "except: people is not a number", "finally: done"]
        split_fee_log(50000, "0")
            -> ["try: started", "except: cannot split between 0 people", "finally: done"]
    """
    pass


# ---------------------------------------------------------------------------
# CHECKER - do not edit below this line / jangan ubah bagian di bawah ini
# ---------------------------------------------------------------------------
import inspect


def _body(func):
    """The code of a function after its docstring."""
    try:
        return inspect.getsource(func).split('"""')[-1]
    except (OSError, TypeError):
        return ""


def _call(func, args):
    """Call func(*args). If it raises an error, return 'raised <ErrorType>'."""
    try:
        return func(*args)
    except Exception as error:
        return f"raised {type(error).__name__}"


def _show(value):
    if type(value) == str and value.startswith("raised "):
        return value
    return repr(value)


def _uses(func, keyword):
    """True if a line of the function body starts with keyword (e.g. except)."""
    for line in _body(func).split("\n"):
        if line.strip().startswith(keyword):
            return True
    return False


def _same(expected, result):
    if type(expected) == int and type(result) != int:
        return False                # e.g. 85.0 or "85" instead of 85
    return result == expected


def _check(number, title, func, cases, must_use):
    if _body(func).strip() == "pass":
        print(f"[TODO] Exercise {number:>2}: {title}")
        return 0
    for args, expected in cases:
        result = _call(func, args)
        if not _same(expected, result):
            call = f"{func.__name__}{args}" if len(args) > 1 else f"{func.__name__}({args[0]!r})"
            print(f"[FAIL] Exercise {number:>2}: {title}")
            print(f"         {call}")
            print(f"         expected: {_show(expected)}")
            print(f"         got:      {_show(result)}")
            return 0
    for word in must_use:
        if not _uses(func, word):
            print(f"[RULE] Exercise {number:>2}: {title} - correct, but you must use `{word}` here")
            return 0
    print(f"[PASS] Exercise {number:>2}: {title}")
    return 1


if __name__ == "__main__":
    credit_table = {"Algorithms": 3, "Discrete Mathematics": 3, "English": 2, "Pancasila": 2}
    course_list = ["Algorithms", "Calculus", "English"]
    fee_ok = ["try: started", "else: each pays 30000", "finally: done"]

    checks = [
        (1, "safe_int", safe_int, [
            (("85",), 85),
            (("-7",), -7),
            (("abc",), None),
            (("3.5",), None),
            (("",), None),
        ], ["except"]),
        (2, "safe_divide", safe_divide, [
            ((10, 4), 2.5),
            ((9, 3), 3.0),
            ((7, 0), "Cannot divide by zero"),
            ((0, 5), 0.0),
        ], ["except"]),
        (3, "get_credits", get_credits, [
            ((credit_table, "English"), 2),
            ((credit_table, "Discrete Mathematics"), 3),
            ((credit_table, "Biology"), "Biology not found"),
            (({}, "Calculus"), "Calculus not found"),
        ], ["except"]),
        (4, "get_item", get_item, [
            ((course_list, 1), "Calculus"),
            ((course_list, -1), "English"),
            ((course_list, 5), "No item at index 5"),
            (([], 0), "No item at index 0"),
        ], ["except"]),
        (5, "total_credits", total_credits, [
            (([3, 3, 2],), 8),
            (([2, 4],), 6),
            (([3, "2", 4],), "Error: credits must be numbers"),
            (([2, None],), "Error: credits must be numbers"),
            (([],), 0),
        ], ["except"]),
        (6, "divide_texts", divide_texts, [
            (("10", "4"), "Result: 2.5"),
            (("9", "3"), "Result: 3.0"),
            (("ten", "2"), "Error: not a number"),
            (("10", "0"), "Error: division by zero"),
            (("7", "x"), "Error: not a number"),
            (("abc", "0"), "Error: not a number"),
        ], ["except"]),
        (7, "parse_score", parse_score, [
            (("85",), 85),
            (("0",), 0),
            (("100",), 100),
            (("150",), "raised ValueError"),
            (("-5",), "raised ValueError"),
            (("101",), "raised ValueError"),
            (("abc",), "raised ValueError"),
        ], ["raise"]),
        (8, "average_of_strings", average_of_strings, [
            ((["80", "x", "90"],), (85.0, 1)),
            ((["70", "75", "abc", "", "95"],), (80.0, 2)),
            ((["100"],), (100.0, 0)),
            ((["a", "b"],), (0, 2)),
            (([],), (0, 0)),
        ], ["except"]),
        (9, "validate_registration", validate_registration, [
            (({"name": "Excell", "age": "20", "gpa": "3.75"},), []),
            (({"name": "  ", "age": "abc", "gpa": "4.5"},),
             ["name: empty", "age: not a number", "gpa: out of range"]),
            (({"age": "15"},), ["name: missing", "age: out of range", "gpa: missing"]),
            (({"name": "Budi", "age": "20", "gpa": "three"},), ["gpa: not a number"]),
            (({"name": "Ani", "age": "60", "gpa": "0"},), []),
            (({"name": "Citra", "age": "61", "gpa": "4.0"},), ["age: out of range"]),
            (({},), ["name: missing", "age: missing", "gpa: missing"]),
        ], ["except"]),
        (10, "split_fee_log", split_fee_log, [
            ((90000, "3"), fee_ok),
            ((90000, "three"), ["try: started", "except: people is not a number", "finally: done"]),
            ((50000, "0"), ["try: started", "except: cannot split between 0 people", "finally: done"]),
            ((100000, "4"), ["try: started", "else: each pays 25000", "finally: done"]),
        ], ["except", "else", "finally"]),
    ]

    print("=" * 45)
    print("  Topic 08 - Error Handling Exercises")
    print("=" * 45)
    score = 0
    for number, title, func, cases, must_use in checks:
        score += _check(number, title, func, cases, must_use)
    print("=" * 45)
    print(f"  Score: {score} / {len(checks)}")
    if score == len(checks):
        print("  All exercises passed. Push it to GitHub!")
    print("=" * 45)
