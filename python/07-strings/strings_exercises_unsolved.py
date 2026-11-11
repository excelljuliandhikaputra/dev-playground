"""
Topic 07 - Strings Exercises (UNSOLVED)
Topik 07 - Latihan String (BELUM DIKERJAKAN)
=============================================
EN - How to use:
    1. Replace every `pass` with your own code.
    2. Run:  python strings_exercises_unsolved.py
    3. The checker at the bottom tests every function with several
       different inputs and shows the result:
       [TODO] = not started yet (the function still returns None)
       [FAIL] = wrong answer (it shows the input, the expected value and yours)
       [PASS] = correct
       Wrote code but still see [TODO]? Check that you used return, not print().

ID - Cara pakai:
    1. Ganti setiap `pass` dengan kodemu sendiri.
    2. Jalankan:  python strings_exercises_unsolved.py
    3. Checker di bagian bawah menguji setiap fungsi dengan beberapa
       input berbeda lalu menampilkan hasilnya:
       [TODO] = belum dikerjakan (fungsinya masih mengembalikan None)
       [FAIL] = jawaban salah (ditampilkan input, nilai yang diharapkan, dan hasilmu)
       [PASS] = benar
       Sudah menulis kode tapi masih [TODO]? Cek apakah kamu memakai return, bukan print().

Rules / Aturan:
    - Only use Topic 01-07 material.
      Hanya pakai materi Topik 01-07.
    - Use `return`, not print(). The checker reads what your function returns.
      Pakai `return`, bukan print(). Checker membaca nilai yang di-return fungsimu.
    - NO HARDCODING: your function must work for ANY input, not only the
      examples in the docstring. The checker also uses other inputs.
      JANGAN HARDCODE: fungsimu harus benar untuk input APA PUN, bukan
      hanya contoh di docstring. Checker juga memakai input lain.
    - Only edit the function bodies. Do not change the checker.
      Ubah hanya isi fungsi. Jangan ubah bagian checker.
    - Exercise 6: do not use split().  Exercise 10: do not use title() or capitalize().
      Soal 6: jangan pakai split().    Soal 10: jangan pakai title() atau capitalize().

Self-check / Cek sendiri:
    Call your functions yourself with new values in the "TRY IT YOURSELF"
    area (for example print(get_initials("Dina Ayu Lestari"))) and check the
    answer by hand. If a function is only right for the docstring examples,
    you hardcoded it.
    Panggil sendiri fungsimu dengan nilai baru di bagian "TRY IT YOURSELF"
    (misalnya print(get_initials("Dina Ayu Lestari"))) lalu cek jawabannya
    secara manual. Kalau fungsimu hanya benar untuk contoh di docstring,
    berarti ada yang di-hardcode.
"""


# ---------------------------------------------------------------------------
# LEVEL 1 - WARM UP / PEMANASAN
# ---------------------------------------------------------------------------

def count_words(sentence):
    """
    Exercise 1 / Soal 1
    EN: Return how many words are in the sentence. Words are separated by
        one or more spaces. An empty sentence has 0 words.
    ID: Kembalikan jumlah kata di dalam kalimat. Kata dipisah oleh satu
        spasi atau lebih. Kalimat kosong berisi 0 kata.

    Examples / Contoh:
        count_words("I study at UNAIR")      -> 4
        count_words("  Python   is   fun  ") -> 3
    """
    pass


def clean_name(raw_name):
    """
    Exercise 2 / Soal 2
    EN: People often type names messily. Remove the spaces, tabs and new
        lines at the start and end, then make the first letter of every
        word uppercase and the other letters lowercase.
    ID: Orang sering mengetik nama dengan berantakan. Hapus spasi, tab, dan
        baris baru di awal dan akhir, lalu buat huruf pertama setiap kata
        menjadi kapital dan huruf lainnya menjadi kecil.

    Examples / Contoh:
        clean_name("   eXCELL juliandhika  ") -> "Excell Juliandhika"
        clean_name("BUDI")                    -> "Budi"
    """
    pass


def count_letter(text, letter):
    """
    Exercise 3 / Soal 3
    EN: Return how many times `letter` appears in `text`, ignoring
        uppercase/lowercase ("A" and "a" count as the same letter).
    ID: Kembalikan berapa kali `letter` muncul di dalam `text`, tanpa
        membedakan huruf besar/kecil ("A" dan "a" dihitung huruf yang sama).

    Examples / Contoh:
        count_letter("Airlangga", "a") -> 3
        count_letter("Banana", "N")    -> 2
    """
    pass


# ---------------------------------------------------------------------------
# LEVEL 2 - CORE PRACTICE / LATIHAN INTI
# ---------------------------------------------------------------------------

def censor_word(sentence, bad_word):
    """
    Exercise 4 / Soal 4
    EN: Replace every `bad_word` in the sentence with stars "*".
        The number of stars equals the length of bad_word.
        Only exact matches are replaced (uppercase/lowercase matters).
    ID: Ganti setiap `bad_word` di dalam kalimat dengan bintang "*".
        Jumlah bintangnya sama dengan panjang bad_word.
        Hanya yang sama persis yang diganti (huruf besar/kecil dibedakan).

    Examples / Contoh:
        censor_word("This exam is stupid", "stupid") -> "This exam is ******"
        censor_word("bad bad day", "bad")            -> "*** *** day"
    """
    pass


def get_initials(full_name):
    """
    Exercise 5 / Soal 5
    EN: Return the initials of a full name: the first letter of every word,
        in uppercase, each followed by a dot. The name may contain extra spaces.
    ID: Kembalikan inisial dari nama lengkap: huruf pertama setiap kata,
        dalam huruf kapital, masing-masing diikuti titik. Namanya bisa
        mengandung spasi berlebih.

    Examples / Contoh:
        get_initials("Excell Juliandhika Putra") -> "E.J.P."
        get_initials("budi santoso")             -> "B.S."
    """
    pass


def get_email_domain(email):
    """
    Exercise 6 / Soal 6
    EN: Return the part of the email AFTER the "@".
        If there is no "@" in the email, return an empty string "".
        RULE: use find() and slicing. Do NOT use split().
    ID: Kembalikan bagian email SETELAH "@".
        Kalau tidak ada "@" di dalam email, kembalikan string kosong "".
        ATURAN: pakai find() dan slicing. JANGAN pakai split().

    Examples / Contoh:
        get_email_domain("excell@unair.ac.id")     -> "unair.ac.id"
        get_email_domain("budi.santoso@gmail.com") -> "gmail.com"
        get_email_domain("not-an-email")           -> ""
    """
    pass


def is_valid_student_id(student_id, length=12):
    """
    Exercise 7 / Soal 7
    EN: A student ID (NIM) is valid when it contains ONLY digits and has
        exactly `length` characters. `length` has a default value of 12.
        Return True or False.
    ID: NIM dianggap valid kalau isinya HANYA angka dan panjangnya tepat
        `length` karakter. `length` punya nilai default 12.
        Kembalikan True atau False.

    Examples / Contoh:
        is_valid_student_id("123456789012")   -> True
        is_valid_student_id("12345678901")    -> False   (11 characters / 11 karakter)
        is_valid_student_id("12345678901A")   -> False   (has a letter / ada huruf)
        is_valid_student_id("1234567890", 10) -> True
    """
    pass


def is_palindrome(text):
    """
    Exercise 8 / Soal 8
    EN: Return True if the text reads the same forwards and backwards,
        ignoring uppercase/lowercase and spaces. Otherwise return False.
    ID: Kembalikan True kalau teksnya sama saat dibaca dari depan maupun
        dari belakang, tanpa membedakan huruf besar/kecil dan tanpa
        menghitung spasi. Selain itu kembalikan False.

    Examples / Contoh:
        is_palindrome("Kasur ini rusak") -> True
        is_palindrome("UNAIR")           -> False
    """
    pass


# ---------------------------------------------------------------------------
# LEVEL 3 - CHALLENGE / TANTANGAN
# ---------------------------------------------------------------------------

def receipt_line(item, quantity, unit_price):
    """
    Exercise 9 / Soal 9 (Challenge)
    EN: Return ONE line of a shop receipt as a string. It has 3 columns:
          - item name: left-aligned, 15 characters wide. If the name is
            longer than 15 characters, cut it to its first 15 characters.
          - quantity: right-aligned, 5 characters wide
          - subtotal (quantity * unit_price): right-aligned, 10 characters wide
        So every line is exactly 30 characters long.
    ID: Kembalikan SATU baris struk belanja sebagai string. Ada 3 kolom:
          - nama barang: rata kiri, lebar 15 karakter. Kalau namanya lebih
            dari 15 karakter, potong menjadi 15 karakter pertamanya.
          - jumlah (quantity): rata kanan, lebar 5 karakter
          - subtotal (quantity * unit_price): rata kanan, lebar 10 karakter
        Jadi setiap baris panjangnya tepat 30 karakter.

    Examples / Contoh:
        receipt_line("Notebook", 3, 5000)
            -> "Notebook           3     15000"
                <---- name ---><qty><subtotal>

        receipt_line("Algorithms Textbook", 1, 125000)
            -> "Algorithms Text    1    125000"
    """
    pass


def capitalize_words(text):
    """
    Exercise 10 / Soal 10 (Challenge)
    EN: Return the text with the first letter of every word in uppercase
        and all the other letters in lowercase. Words are separated by
        single spaces.
        RULE: do NOT use title() or capitalize(). Build it yourself.
        (Why? title() gets "it's" wrong: it gives "It'S".)
    ID: Kembalikan teks dengan huruf pertama setiap kata menjadi kapital
        dan semua huruf lainnya menjadi kecil. Kata dipisah oleh satu spasi.
        ATURAN: JANGAN pakai title() atau capitalize(). Buat sendiri.
        (Kenapa? title() salah untuk "it's": hasilnya "It'S".)

    Examples / Contoh:
        capitalize_words("excell juliandhika putra") -> "Excell Juliandhika Putra"
        capitalize_words("it's d4 INFORMATICS")      -> "It's D4 Informatics"
    """
    pass


# ---------------------------------------------------------------------------
# TRY IT YOURSELF / COBA SENDIRI (optional / opsional)
# EN: Call your functions here with your own values and check the answers
#     by hand. Remove the # to try.
# ID: Panggil fungsimu di sini dengan nilaimu sendiri lalu cek jawabannya
#     secara manual. Hapus tanda # untuk mencoba.
# ---------------------------------------------------------------------------
# print(get_initials("Dina Ayu Lestari"))
# print(f"[{receipt_line('Eraser', 2, 3000)}]")


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
    print("=" * 50)
    print("  Topic 07 - Strings Exercises")
    print("=" * 50)
    score = 0
    score += _check(1, "count_words", count_words, [
        (("I study at UNAIR",), 4),
        (("  Python   is   fun  ",), 3),
        (("Algorithms",), 1),
        (("Excell studies Informatics at Universitas Airlangga",), 6),
        (("",), 0),
    ])
    score += _check(2, "clean_name", clean_name, [
        (("   eXCELL juliandhika  ",), "Excell Juliandhika"),
        (("BUDI",), "Budi"),
        (("\tciTRA dewi\n",), "Citra Dewi"),
        (("ani",), "Ani"),
    ])
    score += _check(3, "count_letter", count_letter, [
        (("Airlangga", "a"), 3),
        (("Banana", "N"), 2),
        (("UNAIR", "x"), 0),
        (("Mississippi", "S"), 4),
        (("Discrete Mathematics", "t"), 3),
    ])
    score += _check(4, "censor_word", censor_word, [
        (("This exam is stupid", "stupid"), "This exam is ******"),
        (("bad bad day", "bad"), "*** *** day"),
        (("Nice work", "bad"), "Nice work"),
        (("Java? Java!", "Java"), "****? ****!"),
        (("Lazy? Not lazy!", "lazy"), "Lazy? Not ****!"),
    ])
    score += _check(5, "get_initials", get_initials, [
        (("Excell Juliandhika Putra",), "E.J.P."),
        (("budi santoso",), "B.S."),
        (("Citra",), "C."),
        (("  ani   wijaya ",), "A.W."),
        (("dina ayu lestari putri",), "D.A.L.P."),
    ])
    score += _check(6, "get_email_domain", get_email_domain, [
        (("excell@unair.ac.id",), "unair.ac.id"),
        (("budi.santoso@gmail.com",), "gmail.com"),
        (("not-an-email",), ""),
        (("a@b.co",), "b.co"),
    ], banned=["split("])
    score += _check(7, "is_valid_student_id", is_valid_student_id, [
        (("123456789012",), True),
        (("12345678901",), False),
        (("12345678901A",), False),
        (("1234567890", 10), True),
        (("1234 5678901",), False),
        (("",), False),
        (("123456789012", 10), False),
        (("987654321098",), True),
    ])
    score += _check(8, "is_palindrome", is_palindrome, [
        (("Kasur ini rusak",), True),
        (("UNAIR",), False),
        (("Racecar",), True),
        (("Never odd or even",), True),
        (("Python",), False),
        (("A",), True),
    ])
    score += _check(9, "receipt_line", receipt_line, [
        (("Notebook", 3, 5000), "Notebook           3     15000"),
        (("Algorithms Textbook", 1, 125000), "Algorithms Text    1    125000"),
        (("Pen", 10, 2500), "Pen               10     25000"),
        (("USB Flash Drive", 1, 85000), "USB Flash Drive    1     85000"),
        (("Mineral Water", 12, 3500), "Mineral Water     12     42000"),
    ])
    score += _check(10, "capitalize_words", capitalize_words, [
        (("excell juliandhika putra",), "Excell Juliandhika Putra"),
        (("it's d4 INFORMATICS",), "It's D4 Informatics"),
        (("uNAIR",), "Unair"),
        (("a b c",), "A B C"),
        (("",), ""),
    ], banned=[".title(", ".capitalize("])
    print("=" * 50)
    print(f"  Score: {score} / 10")
    if score == 10:
        print("  All exercises passed. Save it as strings_exercises_solved.py!")
    print("=" * 50)


_run_checker()
