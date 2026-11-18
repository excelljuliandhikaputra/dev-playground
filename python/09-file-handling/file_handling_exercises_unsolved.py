"""
Topic 09 - File Handling Exercises (UNSOLVED)
Topik 09 - Latihan Mengolah File (BELUM DIKERJAKAN)
====================================================
EN - How to use:
    1. Replace every `pass` with your own code.
    2. Run:  python file_handling_exercises_unsolved.py
    3. The checker at the bottom tests every function with several files.
       [TODO] = not started, [FAIL] = wrong answer, [PASS] = correct,
       [RULE] = right answer, but the required tool (csv.reader...) is missing

ID - Cara pakai:
    1. Ganti setiap `pass` dengan kodemu sendiri.
    2. Jalankan:  python file_handling_exercises_unsolved.py
    3. Checker di bagian bawah menguji setiap fungsi dengan beberapa file.
       [TODO] = belum dikerjakan, [FAIL] = jawaban salah, [PASS] = benar,
       [RULE] = jawaban benar, tapi alat yang diwajibkan (csv.reader...) tidak dipakai

Files / File:
    EN: students.txt, new_students.txt and scores.csv must be in the SAME
        folder as this file. The exercises and the checker create files whose
        names start with output_ in this folder. They are temporary: they are
        rewritten on every run and you can delete them any time.
    ID: students.txt, new_students.txt dan scores.csv harus ada di folder
        yang SAMA dengan file ini. Latihan dan checker membuat file yang
        namanya diawali output_ di folder ini. File itu sementara: ditulis
        ulang setiap kali dijalankan dan boleh dihapus kapan saja.

Rules / Aturan:
    - Only use Topic 01-09 material.
      Hanya pakai materi Topik 01-09.
    - Always open files with `with open(...)`, and use the `path`
      parameter. Never type a file name inside a function.
      Selalu buka file dengan `with open(...)`, dan pakai parameter `path`.
      Jangan menulis nama file di dalam fungsi.
    - NO HARDCODING: read every value from the file.
      JANGAN HARDCODE: baca setiap nilai dari file-nya.
    - Only edit the function bodies. Do not change the checker.
      Ubah hanya isi fungsi. Jangan ubah bagian checker.

Self-check / Cek sendiri:
    The checker also creates its own test files with different data, so a
    hardcoded answer fails. You can also edit scores.csv (keep the header),
    run again, and check that your answers change with it.
    Checker juga membuat file uji sendiri dengan data berbeda, jadi jawaban
    hardcode pasti gagal. Kamu juga bisa mengubah isi scores.csv (header-nya
    jangan diubah), jalankan lagi, dan cek apakah jawabanmu ikut berubah.
"""

import csv
from pathlib import Path

HERE = Path(__file__).parent                    # the folder this file is in / folder tempat file ini berada
students_file = HERE / "students.txt"           # 8 names, one per line / 8 nama, satu per baris
new_students_file = HERE / "new_students.txt"   # 5 names / 5 nama
scores_file = HERE / "scores.csv"               # header name,course,score + 9 rows / header + 9 baris


# ---------------------------------------------------------------------------
# LEVEL 1 - WARM UP
# ---------------------------------------------------------------------------

def count_lines(path):
    """
    Exercise 1 / Soal 1: Count the lines in a file.
    EN: Open the file at `path` and return how many lines it has.
        Empty lines count too.
    ID: Buka file di `path` lalu kembalikan berapa banyak barisnya.
        Baris kosong juga dihitung.
    Examples / Contoh:
        count_lines(students_file)  -> 8
        count_lines(scores_file)    -> 10   (header + 9 rows / header + 9 baris)
    """
    pass


def read_names(path):
    """
    Exercise 2 / Soal 2: Read names into a list.
    EN: The file has one name per line. Return a list of the names
        without the "\n" and without spaces around them.
        Skip empty lines.
    ID: File-nya berisi satu nama per baris. Kembalikan list berisi
        nama-nama itu tanpa "\n" dan tanpa spasi di sekitarnya.
        Lewati baris yang kosong.
    Examples / Contoh:
        read_names(students_file)
            -> ['Ani', 'Budi', 'Citra', 'Dina', 'Eko', 'Excell', 'Fajar', 'Gita']
        read_names(new_students_file)
            -> ['Hana', 'Citra', 'Indra', 'Budi', 'Joko']
    """
    pass


def total_and_average(path):
    """
    Exercise 3 / Soal 3: Total and average score from a CSV file.
    EN: `path` is a CSV file with the header name,course,score.
        Use csv.reader, skip the header with next(), and add up the score
        column (convert it to int!).
        Return TWO values: (total, average)
        If the file has no data rows (only the header), return (0, 0).
    ID: `path` adalah file CSV dengan header name,course,score.
        Pakai csv.reader, lewati header dengan next(), lalu jumlahkan kolom
        score (ubah ke int dulu!).
        Kembalikan DUA nilai: (total, average)
        Kalau file-nya tidak punya baris data (hanya header), kembalikan (0, 0).
    Examples / Contoh:
        total_and_average(scores_file)  -> (684, 76.0)
    """
    pass


def below_passing(path, passing=65):
    """
    Exercise 4 / Soal 4: Who scored below the passing score?
    EN: `path` is a score CSV like scores.csv. Return a list of the names
        whose score is BELOW `passing`, in the same order as the file.
    ID: `path` adalah file CSV nilai seperti scores.csv. Kembalikan list
        nama yang nilainya DI BAWAH `passing`, urut sesuai isi file.
    Examples / Contoh:
        below_passing(scores_file)      -> ['Budi', 'Dina', 'Gita']
        below_passing(scores_file, 80)  -> ['Budi', 'Citra', 'Dina', 'Fajar', 'Gita']
    """
    pass


# ---------------------------------------------------------------------------
# LEVEL 2 - CORE PRACTICE
# ---------------------------------------------------------------------------

def write_lines(path, lines):
    """
    Exercise 5 / Soal 5: Write a list to a file, then read it back.
    EN: Write every item of `lines` to the file at `path`, one item per
        line (mode "w", so any old content is replaced).
        Then open the file AGAIN, read all of it, and return that text.
    ID: Tulis setiap item dari `lines` ke file di `path`, satu item per
        baris (mode "w", jadi isi lama diganti).
        Lalu buka file itu LAGI, baca seluruh isinya, dan kembalikan teksnya.
    Examples / Contoh:
        write_lines(HERE / "output_lines.txt", ["Algorithms", "Calculus"])
            -> "Algorithms\nCalculus\n"
    """
    pass


def append_line(path, line):
    """
    Exercise 6 / Soal 6: Add one line to the end of a file.
    EN: Add `line` plus "\n" to the END of the file (mode "a").
        Then return how many lines the file has now.
        Tip: you may reuse count_lines().
    ID: Tambahkan `line` beserta "\n" ke AKHIR file (mode "a").
        Lalu kembalikan berapa banyak baris file itu sekarang.
        Tips: boleh memakai ulang count_lines().
    Examples / Contoh:
        (output_log.txt already has 2 lines / sudah berisi 2 baris)
        append_line(HERE / "output_log.txt", "Day 3: English")  -> 3
    """
    pass


def course_averages(path):
    """
    Exercise 7 / Soal 7: Average score per course with csv.DictReader.
    EN: Use csv.DictReader. Return a dict: course -> average score of
        that course.
        Hint: keep two dicts while reading, one for the totals and one for
        the counts, then build the averages at the end.
    ID: Pakai csv.DictReader. Kembalikan dict: mata kuliah -> rata-rata
        nilai mata kuliah itu.
        Petunjuk: simpan dua dict selama membaca, satu untuk total dan satu
        untuk jumlah data, lalu hitung rata-ratanya di akhir.
    Examples / Contoh:
        course_averages(scores_file)
            -> {'Algorithms': 81.0, 'Calculus': 66.5, 'English': 80.0,
                'Pancasila': 64.0, 'Discrete Mathematics': 84.0}
    """
    pass


def save_passed(source_path, output_path, passing=65):
    """
    Exercise 8 / Soal 8: Save the students who passed into a new CSV.
    EN: Read the score CSV at source_path. Write a NEW CSV at output_path
        with the same header (name,course,score) and only the rows whose
        score is >= passing. Use csv.writer and open the output file with
        newline="".
        Return how many students you wrote (the header doesn't count).
    ID: Baca file CSV nilai di source_path. Tulis file CSV BARU di
        output_path dengan header yang sama (name,course,score) dan hanya
        baris yang nilainya >= passing. Pakai csv.writer dan buka file
        output-nya dengan newline="".
        Kembalikan berapa mahasiswa yang kamu tulis (header tidak dihitung).
    Examples / Contoh:
        save_passed(scores_file, HERE / "output_passed.csv")  -> 6
        output_passed.csv then starts with / lalu isinya diawali:
            name,course,score
            Ani,Algorithms,88
            Excell,Algorithms,93
    """
    pass


# ---------------------------------------------------------------------------
# LEVEL 3 - CHALLENGE
# ---------------------------------------------------------------------------

def write_report(source_path, report_path):
    """
    Exercise 9 / Soal 9 (Challenge): Write a summary report file.
    EN: Read the score CSV at source_path and write a report to report_path
        in EXACTLY this format (every line ends with "\n"):
            SCORE REPORT
            Students: 9
            Average: 76.00
            Highest: Excell (93)
            Lowest: Dina (58)
            Passed: 6
            Failed: 3
        - Average has 2 decimals. Passed = score >= 65.
        - On a tie for highest/lowest, keep the first one in the file.
        - You can assume the file has at least one student.
        Then read the report file back and return its whole text.
    ID: Baca file CSV nilai di source_path lalu tulis laporan ke report_path
        dengan format PERSIS seperti di atas (setiap baris diakhiri "\n").
        - Average 2 angka desimal. Lulus (Passed) = nilai >= 65.
        - Kalau ada nilai tertinggi/terendah yang sama, ambil yang pertama
          di file.
        - Anggap saja file-nya selalu berisi minimal satu mahasiswa.
        Lalu baca kembali file laporan itu dan kembalikan seluruh teksnya.
    Examples / Contoh:
        write_report(scores_file, HERE / "output_report.txt")
            -> "SCORE REPORT\nStudents: 9\nAverage: 76.00\n...Failed: 3\n"
    """
    pass


def merge_files(path_a, path_b, output_path):
    """
    Exercise 10 / Soal 10 (Challenge): Merge two name files without duplicates.
    EN: Read the names from both files (stripped, empty lines skipped).
        Make ONE list without duplicates that keeps the order in which each
        name first appears: all names of file A first, then the new names
        from file B.
        Write that list to output_path, one name per line, and return it.
        Tip: reuse read_names().
    ID: Baca nama-nama dari kedua file (sudah di-strip, baris kosong dilewati).
        Buat SATU list tanpa duplikat yang mempertahankan urutan kemunculan
        pertama setiap nama: semua nama dari file A dulu, lalu nama-nama
        baru dari file B.
        Tulis list itu ke output_path, satu nama per baris, lalu kembalikan.
        Tips: pakai ulang read_names().
    Examples / Contoh:
        merge_files(students_file, new_students_file, HERE / "output_merged.txt")
            -> ['Ani', 'Budi', 'Citra', 'Dina', 'Eko', 'Excell', 'Fajar',
                'Gita', 'Hana', 'Indra', 'Joko']
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


def _write(path, text):
    with open(path, "w") as file:
        file.write(text)


def _read(path):
    try:
        with open(path) as file:
            return file.read()
    except FileNotFoundError:
        return "(file not found)"


def _call(runner, args):
    try:
        return runner(*args)
    except Exception as error:
        return f"raised {type(error).__name__}: {error}"


def _same(expected, result):
    if type(expected) == int and type(result) != int:
        return False                # e.g. 8.0 or "8" instead of 8
    return result == expected


def _show_args(args):
    parts = []
    for arg in args:
        if isinstance(arg, Path):
            parts.append(repr(arg.name))
        else:
            parts.append(repr(arg))
    return ", ".join(parts)


def _check(number, title, func, cases, must_use=(), runner=None):
    if _body(func).strip() == "pass":
        print(f"[TODO] Exercise {number:>2}: {title}")
        return 0
    if runner is None:
        runner = func
    for args, expected in cases:
        result = _call(runner, args)
        if not _same(expected, result):
            print(f"[FAIL] Exercise {number:>2}: {title}")
            print(f"         {func.__name__}({_show_args(args)})")
            if runner != func:
                print("         (return value, text inside the output file)")
            print(f"         expected: {expected!r}")
            print(f"         got:      {result!r}")
            return 0
    for word in must_use:
        if word not in _body(func):
            print(f"[RULE] Exercise {number:>2}: {title} - correct, but you must use `{word}` here")
            return 0
    print(f"[PASS] Exercise {number:>2}: {title}")
    return 1


def _run_write_lines(path, lines):
    return write_lines(path, lines), _read(path)


def _run_append_line(path, line):
    return append_line(path, line), _read(path)


def _run_save_passed(source_path, output_path, passing=65):
    return save_passed(source_path, output_path, passing), _read(output_path)


def _run_write_report(source_path, report_path):
    return write_report(source_path, report_path), _read(report_path)


def _run_merge_files(path_a, path_b, output_path):
    return merge_files(path_a, path_b, output_path), _read(output_path)


if __name__ == "__main__":
    # EN: Test files made by the checker (deleted at the end).
    # ID: File uji buatan checker (dihapus di akhir).
    check_names = HERE / "output_check_names.txt"
    check_empty = HERE / "output_check_empty.txt"
    check_dupes = HERE / "output_check_dupes.txt"
    check_scores = HERE / "output_check_scores.csv"
    check_header = HERE / "output_check_header_only.csv"
    check_new_log = HERE / "output_check_new_log.txt"
    _write(check_names, "Hana\n\n  Indra  \nJoko\nLina\n")
    _write(check_empty, "")
    _write(check_dupes, "Budi\nAni\nBudi\n")
    _write(check_scores, "name,course,score\nRina,Calculus,70\nSari,Calculus,55\n"
                         "Tono,English,95\nUmar,Algorithms,63\n")
    _write(check_header, "name,course,score\n")
    check_new_log.unlink(missing_ok=True)

    # EN: Output files the learner's functions write (kept so you can open them).
    # ID: File output yang ditulis fungsimu (tidak dihapus supaya bisa kamu buka).
    lines_out = HERE / "output_lines.txt"
    log_out = HERE / "output_log.txt"
    passed_out = HERE / "output_passed.csv"
    report_out = HERE / "output_report.txt"
    merged_out = HERE / "output_merged.txt"
    if _body(append_line).strip() != "pass":
        _write(log_out, "Day 1: Algorithms\nDay 2: Calculus\n")

    all_students = ["Ani", "Budi", "Citra", "Dina", "Eko", "Excell", "Fajar", "Gita"]
    merged_main = all_students + ["Hana", "Indra", "Joko"]
    merged_new = ["Hana", "Citra", "Indra", "Budi", "Joko", "Lina"]
    report_main = ("SCORE REPORT\nStudents: 9\nAverage: 76.00\nHighest: Excell (93)\n"
                   "Lowest: Dina (58)\nPassed: 6\nFailed: 3\n")
    report_check = ("SCORE REPORT\nStudents: 4\nAverage: 70.75\nHighest: Tono (95)\n"
                    "Lowest: Sari (55)\nPassed: 2\nFailed: 2\n")
    passed_main = ("name,course,score\nAni,Algorithms,88\nExcell,Algorithms,93\n"
                   "Citra,Calculus,75\nEko,English,90\nFajar,English,70\n"
                   "Hana,Discrete Mathematics,84\n")

    checks = [
        (1, "count_lines", count_lines, [
            ((students_file,), 8),
            ((scores_file,), 10),
            ((check_names,), 5),
            ((check_empty,), 0),
        ], (), None),
        (2, "read_names", read_names, [
            ((students_file,), all_students),
            ((new_students_file,), ["Hana", "Citra", "Indra", "Budi", "Joko"]),
            ((check_names,), ["Hana", "Indra", "Joko", "Lina"]),
            ((check_empty,), []),
        ], (), None),
        (3, "total_and_average", total_and_average, [
            ((scores_file,), (684, 76.0)),
            ((check_scores,), (283, 70.75)),
            ((check_header,), (0, 0)),
        ], ("csv.reader", "next("), None),
        (4, "below_passing", below_passing, [
            ((scores_file,), ["Budi", "Dina", "Gita"]),
            ((scores_file, 80), ["Budi", "Citra", "Dina", "Fajar", "Gita"]),
            ((check_scores,), ["Sari", "Umar"]),
            ((check_header,), []),
        ], (), None),
        (5, "write_lines", write_lines, [
            ((lines_out, ["Algorithms", "Calculus", "English"]),
             ("Algorithms\nCalculus\nEnglish\n", "Algorithms\nCalculus\nEnglish\n")),
            ((lines_out, ["Pancasila"]), ("Pancasila\n", "Pancasila\n")),
            ((lines_out, []), ("", "")),
        ], (), _run_write_lines),
        (6, "append_line", append_line, [
            ((log_out, "Day 3: English"),
             (3, "Day 1: Algorithms\nDay 2: Calculus\nDay 3: English\n")),
            ((log_out, "Day 4: Pancasila"),
             (4, "Day 1: Algorithms\nDay 2: Calculus\nDay 3: English\nDay 4: Pancasila\n")),
            ((check_new_log, "First line"), (1, "First line\n")),
        ], (), _run_append_line),
        (7, "course_averages", course_averages, [
            ((scores_file,), {"Algorithms": 81.0, "Calculus": 66.5, "English": 80.0,
                              "Pancasila": 64.0, "Discrete Mathematics": 84.0}),
            ((check_scores,), {"Calculus": 62.5, "English": 95.0, "Algorithms": 63.0}),
            ((check_header,), {}),
        ], ("DictReader",), None),
        (8, "save_passed", save_passed, [
            ((scores_file, passed_out), (6, passed_main)),
            ((scores_file, passed_out, 85),
             (3, "name,course,score\nAni,Algorithms,88\nExcell,Algorithms,93\nEko,English,90\n")),
            ((check_scores, passed_out),
             (2, "name,course,score\nRina,Calculus,70\nTono,English,95\n")),
        ], ("csv.writer",), _run_save_passed),
        (9, "write_report", write_report, [
            ((scores_file, report_out), (report_main, report_main)),
            ((check_scores, report_out), (report_check, report_check)),
        ], (), _run_write_report),
        (10, "merge_files", merge_files, [
            ((check_dupes, check_empty, merged_out), (["Budi", "Ani"], "Budi\nAni\n")),
            ((new_students_file, check_names, merged_out),
             (merged_new, "\n".join(merged_new) + "\n")),
            ((students_file, new_students_file, merged_out),
             (merged_main, "\n".join(merged_main) + "\n")),
        ], (), _run_merge_files),
    ]

    print("=" * 45)
    print("  Topic 09 - File Handling Exercises")
    print("=" * 45)
    score = 0
    for number, title, func, cases, must_use, runner in checks:
        score += _check(number, title, func, cases, must_use, runner)
    print("=" * 45)
    print(f"  Score: {score} / {len(checks)}")
    if score == len(checks):
        print("  All exercises passed. Push it to GitHub!")
    print("=" * 45)

    for test_file in [check_names, check_empty, check_dupes, check_scores,
                      check_header, check_new_log]:
        test_file.unlink(missing_ok=True)
