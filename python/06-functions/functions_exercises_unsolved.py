"""
Topic 06 - Functions Exercises (UNSOLVED)
Topik 06 - Latihan Fungsi (BELUM DIKERJAKAN)
=============================================
EN - How to use:
    1. Replace every `pass` with your own code.
    2. Run:  python functions_exercises_unsolved.py
    3. The checker at the bottom tests every function with several
       different inputs and shows the result:
       [TODO] = not started yet (the function still returns None)
       [FAIL] = wrong answer (it shows the input, the expected value and yours)
       [PASS] = correct
       Wrote code but still see [TODO]? Check that you used return, not print().

ID - Cara pakai:
    1. Ganti setiap `pass` dengan kodemu sendiri.
    2. Jalankan:  python functions_exercises_unsolved.py
    3. Checker di bagian bawah menguji setiap fungsi dengan beberapa
       input berbeda lalu menampilkan hasilnya:
       [TODO] = belum dikerjakan (fungsinya masih mengembalikan None)
       [FAIL] = jawaban salah (ditampilkan input, nilai yang diharapkan, dan hasilmu)
       [PASS] = benar
       Sudah menulis kode tapi masih [TODO]? Cek apakah kamu memakai return, bukan print().

Rules / Aturan:
    - Only use Topic 01-06 material.
      Hanya pakai materi Topik 01-06.
    - Use `return`, not print(). The checker reads what your function returns.
      Pakai `return`, bukan print(). Checker membaca nilai yang di-return fungsimu.
    - NO HARDCODING: your function must work for ANY input, not only the
      examples in the docstring. The checker also uses other inputs.
      JANGAN HARDCODE: fungsimu harus benar untuk input APA PUN, bukan
      hanya contoh di docstring. Checker juga memakai input lain.
    - Only edit the function bodies. Do not change the checker.
      Ubah hanya isi fungsi. Jangan ubah bagian checker.
    - Exercise 4: do not use max().  Exercise 10: reuse score_to_grade().
      Soal 4: jangan pakai max().    Soal 10: pakai ulang score_to_grade().

Self-check / Cek sendiri:
    Call your functions yourself with new values in the "TRY IT YOURSELF"
    area (for example print(is_prime(21))) and check the answer by hand.
    If a function is only right for the docstring examples, you hardcoded it.
    Panggil sendiri fungsimu dengan nilai baru di bagian "TRY IT YOURSELF"
    (misalnya print(is_prime(21))) lalu cek jawabannya secara manual.
    Kalau fungsimu hanya benar untuk contoh di docstring, berarti ada yang
    di-hardcode.
"""


# ---------------------------------------------------------------------------
# LEVEL 1 - WARM UP / PEMANASAN
# ---------------------------------------------------------------------------

def make_username(name, year):
    """
    Exercise 1 / Soal 1
    EN: Return a username made of the name in lowercase, followed by the year.
    ID: Kembalikan username berupa nama dalam huruf kecil, diikuti tahunnya.

    Examples / Contoh:
        make_username("Excell", 2026) -> "excell2026"
        make_username("BUDI", 2025)   -> "budi2025"
    """
    pass


def celsius_to_fahrenheit(celsius):
    """
    Exercise 2 / Soal 2
    EN: Convert a temperature from Celsius to Fahrenheit.
        Formula: F = C * 9 / 5 + 32
    ID: Ubah suhu dari Celsius ke Fahrenheit.
        Rumus: F = C * 9 / 5 + 32

    Examples / Contoh:
        celsius_to_fahrenheit(100) -> 212.0
        celsius_to_fahrenheit(0)   -> 32.0
    """
    pass


def is_even(number):
    """
    Exercise 3 / Soal 3
    EN: Return True if the number is even, otherwise return False.
        Hint: an even number has a remainder of 0 when divided by 2.
    ID: Kembalikan True jika angkanya genap, selain itu kembalikan False.
        Petunjuk: bilangan genap bersisa 0 jika dibagi 2.

    Examples / Contoh:
        is_even(4) -> True
        is_even(7) -> False
    """
    pass


# ---------------------------------------------------------------------------
# LEVEL 2 - CORE PRACTICE / LATIHAN INTI
# ---------------------------------------------------------------------------

def max_of_three(a, b, c):
    """
    Exercise 4 / Soal 4
    EN: Return the largest of the three numbers.
        RULE: do NOT use the built-in max(). Use if/elif/else.
    ID: Kembalikan angka terbesar dari ketiga angka.
        ATURAN: JANGAN pakai fungsi bawaan max(). Pakai if/elif/else.

    Examples / Contoh:
        max_of_three(3, 9, 5)    -> 9
        max_of_three(-5, -2, -9) -> -2
    """
    pass


def score_to_grade(score):
    """
    Exercise 5 / Soal 5
    EN: Convert a score (0-100) to a letter grade using the UNAIR scale.
    ID: Ubah nilai (0-100) menjadi huruf mutu sesuai skala UNAIR.

        85-100 -> "A"
        80-84  -> "AB"
        75-79  -> "B"
        70-74  -> "BC"
        65-69  -> "C"
        50-64  -> "D"
        0-49   -> "E"

    Examples / Contoh:
        score_to_grade(82) -> "AB"
        score_to_grade(65) -> "C"
    """
    pass


def calculate_price(price, discount_percent=0):
    """
    Exercise 6 / Soal 6
    EN: Return the price after the discount.
        discount = price * discount_percent / 100
        discount_percent has a DEFAULT value of 0, so calling the function
        with only the price means "no discount".
    ID: Kembalikan harga setelah diskon.
        diskon = price * discount_percent / 100
        discount_percent punya nilai DEFAULT 0, jadi kalau fungsi dipanggil
        hanya dengan harga, artinya "tanpa diskon".

    Examples / Contoh:
        calculate_price(100000)     -> 100000.0
        calculate_price(100000, 25) -> 75000.0
    """
    pass


def count_vowels(text):
    """
    Exercise 7 / Soal 7
    EN: Count how many vowels (a, e, i, o, u) are in the text.
        Uppercase vowels count too.
    ID: Hitung berapa huruf vokal (a, e, i, o, u) di dalam teks.
        Huruf vokal kapital juga ikut dihitung.

    Examples / Contoh:
        count_vowels("Airlangga") -> 4
        count_vowels("PYTHON")    -> 1
    """
    pass


def attendance_status(records):
    """
    Exercise 8 / Soal 8
    EN: `records` is a list of 1 (present) and 0 (absent), one per meeting.
        Return TWO values: percentage, is_eligible
          - percentage = present meetings / all meetings * 100 (don't round it)
          - is_eligible is True if percentage >= 75, otherwise False
        If the list is empty, return 0.0, False
    ID: `records` adalah list berisi 1 (hadir) dan 0 (absen), satu per pertemuan.
        Kembalikan DUA nilai: percentage, is_eligible
          - percentage = pertemuan hadir / semua pertemuan * 100 (tidak perlu dibulatkan)
          - is_eligible bernilai True jika percentage >= 75, selain itu False
        Jika list-nya kosong, kembalikan 0.0, False

    Examples / Contoh:
        attendance_status([1, 1, 0, 1]) -> (75.0, True)
        attendance_status([1, 0, 0, 0]) -> (25.0, False)
    """
    pass


# ---------------------------------------------------------------------------
# LEVEL 3 - CHALLENGE / TANTANGAN
# ---------------------------------------------------------------------------

def is_prime(number):
    """
    Exercise 9 / Soal 9 (Challenge)
    EN: Return True if the number is prime, otherwise return False.
        A prime number is greater than 1 and can only be divided evenly
        by 1 and by itself.
        Hint: test possible divisors with a loop. Think carefully about
              WHEN you are allowed to return True (basics, section 4).
    ID: Kembalikan True jika angkanya bilangan prima, selain itu False.
        Bilangan prima lebih besar dari 1 dan hanya habis dibagi oleh 1
        dan oleh dirinya sendiri.
        Petunjuk: uji calon pembagi dengan loop. Pikirkan baik-baik KAPAN
                  kamu boleh me-return True (basics, bagian 4).

    Examples / Contoh:
        is_prime(17) -> True
        is_prime(1)  -> False
        is_prime(9)  -> False
    """
    pass


def calculate_gpa(courses):
    """
    Exercise 10 / Soal 10 (Challenge)
    EN: Calculate a GPA weighted by credits.
    ID: Hitung IPK yang dibobot dengan SKS.

    `courses` is a list of dictionaries / `courses` adalah list berisi dictionary:
        [
            {"name": "Algorithms", "credits": 3, "score": 88},
            {"name": "English", "credits": 2, "score": 76},
        ]

    Steps / Langkah:
        1. Convert each score to a grade with YOUR score_to_grade().
           Ubah setiap nilai menjadi huruf mutu dengan score_to_grade() BUATANMU.
        2. Convert the grade to grade points:
           Ubah huruf mutu menjadi angka mutu:
           A=4.0, AB=3.5, B=3.0, BC=2.5, C=2.0, D=1.0, E=0.0
        3. GPA = sum of (grade points * credits) / total credits
           IPK = jumlah (angka mutu * SKS) / total SKS
        4. Return the GPA (don't round it). If the list is empty, return 0.0
           Kembalikan IPK-nya (tidak perlu dibulatkan). Jika list kosong, kembalikan 0.0

    Example / Contoh:
        The example list above -> (4.0 * 3 + 3.0 * 2) / 5 = 3.6
        List contoh di atas    -> (4.0 * 3 + 3.0 * 2) / 5 = 3.6
    """
    pass


# ---------------------------------------------------------------------------
# TRY IT YOURSELF / COBA SENDIRI (optional / opsional)
# EN: Call your functions here with your own values and check the answers
#     by hand. Remove the # to try.
# ID: Panggil fungsimu di sini dengan nilaimu sendiri lalu cek jawabannya
#     secara manual. Hapus tanda # untuk mencoba.
# ---------------------------------------------------------------------------
# print(make_username("Citra", 2024))
# print(is_prime(21))


# ---------------------------------------------------------------------------
# CHECKER - do not edit below this line / jangan ubah bagian di bawah ini
# EN: You don't need to understand this code yet. Just run the file and
#     read the result at the bottom of the output.
# ID: Kamu belum perlu memahami kode ini. Cukup jalankan file-nya dan baca
#     hasilnya di bagian bawah output.
# ---------------------------------------------------------------------------
import inspect


def _same(result, expected):
    if isinstance(expected, bool) or isinstance(result, bool):
        return type(result) == type(expected) and result == expected
    if isinstance(expected, (int, float)) and isinstance(result, (int, float)):
        return abs(result - expected) < 1e-9
    if isinstance(expected, tuple) and isinstance(result, tuple):
        if len(result) != len(expected):
            return False
        for got_item, expected_item in zip(result, expected):
            if not _same(got_item, expected_item):
                return False
        return True
    return type(result) == type(expected) and result == expected


def _code_of(func):
    try:
        source = inspect.getsource(func)
    except (OSError, TypeError):
        return None
    body = source.split('"""')[-1]
    lines = []
    for line in body.split("\n"):
        lines.append(line.split("#")[0])
    return "\n".join(lines)


def _check(number, title, func, cases, banned=(), required=()):
    label = f"Exercise {number:>2}: {title}"
    for index, (args, expected) in enumerate(cases):
        call = f"{func.__name__}({', '.join(repr(arg) for arg in args)})"
        try:
            result = func(*args)
        except Exception as error:
            print(f"[FAIL] {label}")
            print(f"         {call}")
            print(f"         crashed:  {type(error).__name__}: {error}")
            return 0
        if result is None and index == 0:
            print(f"[TODO] {label}")
            return 0
        if not _same(result, expected):
            print(f"[FAIL] {label}")
            print(f"         {call}")
            print(f"         expected: {expected!r}")
            print(f"         got:      {result!r}")
            if result is None:
                print("         (did you forget `return`? / lupa `return`?)")
            return 0
    code = _code_of(func)
    if code is not None:
        for text in banned:
            if text in code:
                print(f"[FAIL] {label}")
                print(f"         rule: do not use {text}) / aturan: jangan pakai {text})")
                return 0
        for text in required:
            if text not in code:
                print(f"[FAIL] {label}")
                print(f"         rule: you must use {text}) / aturan: wajib pakai {text})")
                return 0
    print(f"[PASS] {label}")
    return 1


def _run_checker():
    sample_courses = [
        {"name": "Algorithms", "credits": 3, "score": 88},
        {"name": "Discrete Mathematics", "credits": 3, "score": 72},
        {"name": "English", "credits": 2, "score": 81},
        {"name": "Pancasila", "credits": 2, "score": 60},
    ]

    print("=" * 50)
    print("  Topic 06 - Functions Exercises")
    print("=" * 50)
    score = 0
    score += _check(1, "make_username", make_username, [
        (("Excell", 2026), "excell2026"),
        (("BUDI", 2025), "budi2025"),
        (("cItRa", 2024), "citra2024"),
    ])
    score += _check(2, "celsius_to_fahrenheit", celsius_to_fahrenheit, [
        ((100,), 212.0),
        ((0,), 32.0),
        ((37,), 98.6),
        ((-40,), -40.0),
    ])
    score += _check(3, "is_even", is_even, [
        ((4,), True),
        ((7,), False),
        ((0,), True),
        ((15,), False),
        ((-2,), True),
    ])
    score += _check(4, "max_of_three", max_of_three, [
        ((3, 9, 5), 9),
        ((10, 2, 7), 10),
        ((1, 1, 4), 4),
        ((-5, -2, -9), -2),
        ((6, 6, 6), 6),
        ((8, 8, 3), 8),
    ], banned=["max("])
    score += _check(5, "score_to_grade", score_to_grade, [
        ((82,), "AB"), ((100,), "A"), ((85,), "A"), ((84,), "AB"),
        ((80,), "AB"), ((79,), "B"), ((75,), "B"), ((74,), "BC"),
        ((70,), "BC"), ((69,), "C"), ((65,), "C"), ((64,), "D"),
        ((50,), "D"), ((49,), "E"), ((0,), "E"),
    ])
    score += _check(6, "calculate_price", calculate_price, [
        ((100000,), 100000.0),
        ((100000, 25), 75000.0),
        ((50000, 10), 45000.0),
        ((80000, 15), 68000.0),
        ((35000,), 35000.0),
    ])
    score += _check(7, "count_vowels", count_vowels, [
        (("Airlangga",), 4),
        (("PYTHON",), 1),
        (("xyz",), 0),
        (("Universitas Airlangga",), 9),
        (("",), 0),
    ])
    score += _check(8, "attendance_status", attendance_status, [
        (([1, 1, 0, 1],), (75.0, True)),
        (([1, 0, 0, 0],), (25.0, False)),
        (([1, 1, 1, 1, 1, 1, 1, 0],), (87.5, True)),
        (([1, 1, 0, 0],), (50.0, False)),
        (([],), (0.0, False)),
    ])
    score += _check(9, "is_prime", is_prime, [
        ((17,), True), ((1,), False), ((9,), False),
        ((2,), True), ((3,), True), ((97,), True),
        ((0,), False), ((4,), False), ((15,), False),
        ((21,), False), ((25,), False), ((49,), False),
    ])
    score += _check(10, "calculate_gpa", calculate_gpa, [
        (([{"name": "Algorithms", "credits": 3, "score": 88},
           {"name": "English", "credits": 2, "score": 76}],), 3.6),
        ((sample_courses,), 2.85),
        (([{"name": "Calculus", "credits": 4, "score": 90}],), 4.0),
        (([{"name": "English", "credits": 2, "score": 77},
           {"name": "Pancasila", "credits": 2, "score": 66}],), 2.5),
        (([{"name": "Algorithms", "credits": 3, "score": 45},
           {"name": "English", "credits": 1, "score": 100}],), 1.0),
        (([],), 0.0),
    ], required=["score_to_grade("])
    print("=" * 50)
    print(f"  Score: {score} / 10")
    if score == 10:
        print("  All exercises passed. Save it as functions_exercises_solved.py!")
    print("=" * 50)


_run_checker()
