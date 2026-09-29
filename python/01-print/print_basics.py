"""
Topic 01 - print()
Topik 01 - print()
====================
EN: Topics covered in this lesson file.
ID: Topik yang dibahas di file ini.

    1. Printing text                       | Menampilkan teks
    2. Printing multiple values + sep       | Menampilkan beberapa nilai + sep
    3. end parameter (staying on one line)  | Parameter end (tetap di baris yang sama)
    4. Escape characters (\\n, \\t)          | Karakter escape (\\n, \\t)

Run this file:  python print_basics.py
"""


# ---------------------------------------------------------------------------
# 1. Printing text
# EN: print() writes text (and a newline) to the screen.
# ID: print() menampilkan teks (dan baris baru) ke layar.
# ---------------------------------------------------------------------------
print("Hello, World!")


# ---------------------------------------------------------------------------
# 2. Printing multiple values + sep
# EN: print() can take several values at once. By default they're joined
#     with a space; `sep` changes that separator.
# ID: print() bisa menerima beberapa nilai sekaligus. Secara default
#     dipisah dengan spasi; `sep` mengubah pemisah itu.
# ---------------------------------------------------------------------------
print("Course:", "Algorithms", "Score:", 88)
print("2026", "09", "28", sep="-")   # 2026-09-28


# ---------------------------------------------------------------------------
# 3. end parameter
# EN: By default, print() adds a newline (\n) after each call. `end`
#     changes what gets added instead.
# ID: Secara default, print() menambahkan baris baru (\n) setiap kali
#     dipanggil. `end` mengubah apa yang ditambahkan sebagai gantinya.
# ---------------------------------------------------------------------------
print("Loading", end="")
print("...", end="")
print(" Done!")   # all three prints appear on the SAME line


# ---------------------------------------------------------------------------
# 4. Escape characters
# EN: \n = new line, \t = tab space. Useful for formatting output.
# ID: \n = baris baru, \t = spasi tab. Berguna untuk merapikan tampilan.
# ---------------------------------------------------------------------------
print("Name:\tExcell")
print("Campus:\tUNAIR")
print("Line 1\nLine 2")
