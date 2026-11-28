"""
Topic 10 - OOP Exercises (SOLVED)
Topik 10 - Latihan OOP (SUDAH DIKERJAKAN)
==========================================
EN - How to use:
    1. Replace every `pass` inside the methods with your own code.
    2. Run:  python oop_exercises_unsolved.py
    3. The checker at the bottom creates objects from your classes and
       checks their attributes and the values your methods return.
       [TODO] = not started, [FAIL] = wrong answer, [PASS] = correct,
       [RULE] = right answer, but the required tool (super()...) is missing

ID - Cara pakai:
    1. Ganti setiap `pass` di dalam method dengan kodemu sendiri.
    2. Jalankan:  python oop_exercises_unsolved.py
    3. Checker di bagian bawah membuat objek dari class-mu lalu mengecek
       atributnya dan nilai yang dikembalikan method-mu.
       [TODO] = belum dikerjakan, [FAIL] = jawaban salah, [PASS] = benar,
       [RULE] = jawaban benar, tapi alat yang diwajibkan (super()...) tidak dipakai

Rules / Aturan:
    - Only use Topic 01-10 material.
      Hanya pakai materi Topik 01-10.
    - Don't rename the classes, methods, parameters or attributes that
      are given. The checker uses those exact names.
      Jangan ganti nama class, method, parameter, atau atribut yang sudah
      ditentukan. Checker memakai nama-nama itu persis.
    - Methods RETURN their results (no print inside them).
      Method me-RETURN hasilnya (jangan print di dalamnya).
    - NO HARDCODING: always work with the attributes and parameters.
      JANGAN HARDCODE: selalu olah atribut dan parameternya.
    - Only edit the method bodies. Do not change the checker.
      Ubah hanya isi method. Jangan ubah bagian checker.

Self-check / Cek sendiri:
    The checker builds several different objects for every exercise, so a
    hardcoded answer fails. You can also create your own objects and print
    them at the very bottom of the file, e.g.
        print(Rectangle(5, 2).area())
    Checker membuat beberapa objek berbeda untuk setiap soal, jadi jawaban
    hardcode pasti gagal. Kamu juga bisa membuat objek sendiri lalu
    mencetaknya di paling bawah file, misalnya print(Rectangle(5, 2).area()).
"""


# ---------------------------------------------------------------------------
# LEVEL 1 - WARM UP
# ---------------------------------------------------------------------------

class Rectangle:
    """
    Exercise 1 / Soal 1: A rectangle with a width and a height.
    EN: __init__ stores width and height as attributes (self.width,
        self.height). area() returns width * height. perimeter() returns
        2 * (width + height).
    ID: __init__ menyimpan width dan height sebagai atribut (self.width,
        self.height). area() mengembalikan width * height. perimeter()
        mengembalikan 2 * (width + height).
    Examples / Contoh:
        board = Rectangle(4, 3)
        board.width        -> 4
        board.area()       -> 12
        board.perimeter()  -> 14
    """

    def __init__(self, width, height):
        """EN: Store width and height. / ID: Simpan width dan height."""
        self.width = width
        self.height = height

    def area(self):
        """EN: Return the area. / ID: Kembalikan luasnya."""
        return self.width * self.height

    def perimeter(self):
        """EN: Return the perimeter. / ID: Kembalikan kelilingnya."""
        return  2 * (self.width + self.height)


class Student:
    """
    Exercise 2 / Soal 2: __init__, add_score() and average()
    EN: __init__(name) stores the name and starts an EMPTY list self.scores
        (create it inside __init__, so every student has their own list).
        add_score(score) adds one score to self.scores.
        average() returns the average of the scores, or 0 if there are none.
    ID: __init__(name) menyimpan nama dan membuat list KOSONG self.scores
        (buat di dalam __init__, supaya setiap mahasiswa punya list sendiri).
        add_score(score) menambah satu nilai ke self.scores.
        average() mengembalikan rata-rata nilainya, atau 0 kalau belum ada nilai.

    Exercise 3 / Soal 3: grade() and __str__()
    EN: grade() returns the UNAIR letter grade of average():
            >= 85 -> "A"     >= 80 -> "AB"    >= 75 -> "B"    >= 70 -> "BC"
            >= 65 -> "C"     >= 50 -> "D"     below 50 -> "E"
        __str__() returns "<name>: average <average, 2 decimals>, grade <grade>"
        Call self.average() and self.grade() instead of calculating again.
    ID: grade() mengembalikan huruf mutu UNAIR dari average() (skala di atas).
        __str__() mengembalikan "<name>: average <rata-rata, 2 desimal>, grade <grade>"
        Panggil self.average() dan self.grade(), jangan menghitung ulang.

    Examples / Contoh:
        excell = Student("Excell")
        excell.scores          -> []
        excell.add_score(88)
        excell.add_score(85)
        excell.scores          -> [88, 85]
        excell.average()       -> 86.5
        excell.grade()         -> "A"
        str(excell)            -> "Excell: average 86.50, grade A"
    """

    def __init__(self, name):
        """Exercise 2. EN: Store name, start an empty scores list. / ID: Simpan nama, buat list scores kosong."""
        self.name = name
        self.scores = []

    def add_score(self, score):
        """Exercise 2. EN: Add one score. / ID: Tambahkan satu nilai."""
        self.scores.append(score)

    def average(self):
        """Exercise 2. EN: Average, or 0 if no scores. / ID: Rata-rata, atau 0 kalau belum ada nilai."""
        if len(self.scores) == 0:
            return 0.0
        return sum(self.scores) / len(self.scores)

    def grade(self):
        """Exercise 3. EN: UNAIR letter grade of average(). / ID: Huruf mutu UNAIR dari average()."""
        if self.average() >=85:
            return "A"
        elif self.average() >= 80:
            return "AB"
        elif self.average() >= 75:
            return "B"
        elif self.average() >= 70:
            return "BC"
        elif self.average() >= 65:
            return "C"
        elif self.average() >= 50:
            return "D"
        else:
            return "E"

    def __str__(self):
        """Exercise 3. EN/ID: "<name>: average <x.xx>, grade <grade>" """
        return f"{self.name}: average {self.average():.2f}, grade {self.grade()}"


# ---------------------------------------------------------------------------
# LEVEL 2 - CORE PRACTICE
# ---------------------------------------------------------------------------

class BankAccount:
    """
    Exercise 4 / Soal 4: A bank account that protects its balance.
    EN: __init__(owner, balance=0) stores owner and _balance. The "_" means
        "don't change this from outside the class; use the methods".
        get_balance()     -> returns _balance
        deposit(amount)   -> amount <= 0: refuse and return False
                             otherwise add it to _balance and return True
        withdraw(amount)  -> amount <= 0 or amount > _balance: refuse, return False
                             otherwise subtract it from _balance and return True
        A refused action must NOT change the balance.
    ID: __init__(owner, balance=0) menyimpan owner dan _balance. Tanda "_"
        artinya "jangan diubah dari luar class; pakai method-nya".
        get_balance()     -> mengembalikan _balance
        deposit(amount)   -> amount <= 0: tolak dan kembalikan False
                             selain itu tambahkan ke _balance dan kembalikan True
        withdraw(amount)  -> amount <= 0 atau amount > _balance: tolak, kembalikan False
                             selain itu kurangi _balance dan kembalikan True
        Aksi yang ditolak TIDAK boleh mengubah saldo.

    Exercise 5 / Soal 5: transfer_to(other, amount)
    EN: Move amount from THIS account to `other` (another BankAccount
        object). Reuse self.withdraw() and other.deposit().
        If the withdraw is refused, nothing changes: return False.
        Otherwise deposit into `other` and return True.
    ID: Pindahkan amount dari akun INI ke `other` (objek BankAccount lain).
        Pakai ulang self.withdraw() dan other.deposit().
        Kalau withdraw ditolak, tidak ada yang berubah: kembalikan False.
        Selain itu deposit ke `other` dan kembalikan True.

    Examples / Contoh:
        excell = BankAccount("Excell", 100000)
        excell.deposit(50000)     -> True     (balance 150000)
        excell.withdraw(200000)   -> False    (balance still 150000)
        budi = BankAccount("Budi")
        budi.get_balance()        -> 0
        excell.transfer_to(budi, 30000)   -> True
        excell.get_balance()      -> 120000
        budi.get_balance()        -> 30000
    """

    def __init__(self, owner, balance=0):
        """Exercise 4. EN: Store owner and _balance. / ID: Simpan owner dan _balance."""
        self.owner = owner
        self._balance = balance

    def get_balance(self):
        """Exercise 4. EN: Return the balance. / ID: Kembalikan saldonya."""
        return self._balance

    def deposit(self, amount):
        """Exercise 4. EN: Add money, True/False. / ID: Tambah uang, True/False."""
        if amount <= 0:
            return False
        self._balance += amount
        return True

    def withdraw(self, amount):
        """Exercise 4. EN: Take money out, True/False. / ID: Ambil uang, True/False."""
        if amount > self._balance or amount <= 0:
            return False
        self._balance -= amount
        return True

    def transfer_to(self, other, amount):
        """Exercise 5. EN: Move money to another account. / ID: Pindahkan uang ke akun lain."""
        if self.withdraw(amount):
            other.deposit(amount)
            return True
        return False


class Course:
    """
    Exercise 6 / Soal 6: Class attribute vs instance attribute.
    EN: total_courses is a CLASS attribute shared by all Course objects.
        __init__(name, credits) stores name and credits (instance
        attributes) AND adds 1 to Course.total_courses.
        describe() returns "<name> (<credits> credits)".
    ID: total_courses adalah atribut CLASS yang dipakai bersama oleh semua
        objek Course. __init__(name, credits) menyimpan name dan credits
        (atribut instance) DAN menambah 1 ke Course.total_courses.
        describe() mengembalikan "<name> (<credits> credits)".
    Examples / Contoh:
        Course.total_courses       -> 0
        algorithms = Course("Algorithms", 3)
        english = Course("English", 2)
        Course.total_courses       -> 2
        english.describe()         -> "English (2 credits)"
    """
    total_courses = 0

    def __init__(self, name, credits):
        """EN: Store name and credits, count the course. / ID: Simpan name dan credits, hitung course-nya."""
        self.name = name
        self.credits = credits
        Course.total_courses += 1

    def describe(self):
        """EN/ID: "<name> (<credits> credits)" """
        return f"{self.name} ({self.credits} credits)"


class Person:
    """
    Exercise 7 / Soal 7: Inheritance (Person -> Lecturer, Undergraduate).
    EN: Person(name) stores name. introduce() returns "Hi, I'm <name>."
        Lecturer and Undergraduate (below) are CHILD classes of Person.
    ID: Person(name) menyimpan name. introduce() mengembalikan "Hi, I'm <name>."
        Lecturer dan Undergraduate (di bawah) adalah class ANAK dari Person.
    Examples / Contoh:
        Person("Budi").introduce()                     -> "Hi, I'm Budi."
        Lecturer("Dr. Sari", "Algorithms").introduce()
            -> "Hi, I'm Dr. Sari. I teach Algorithms."
        Undergraduate("Excell", 1).introduce()
            -> "Hi, I'm Excell. I'm in semester 1."
    """

    def __init__(self, name):
        """EN: Store name. / ID: Simpan name."""
        self.name = name

    def introduce(self):
        """EN/ID: "Hi, I'm <name>." """
        return f"Hi, I'm {self.name}."


class Lecturer(Person):
    """
    Exercise 7 / Soal 7 (continued / lanjutan)
    EN: __init__(name, subject): call super().__init__(name), then store
        subject. Override introduce() to return
        "Hi, I'm <name>. I teach <subject>."
        Tip: super().introduce() gives you the "Hi, I'm <name>." part.
    ID: __init__(name, subject): panggil super().__init__(name), lalu simpan
        subject. Override introduce() supaya mengembalikan
        "Hi, I'm <name>. I teach <subject>."
        Tips: super().introduce() memberikan bagian "Hi, I'm <name>."
    """

    def __init__(self, name, subject):
        """EN: Use the parent for name, store subject. / ID: Pakai induk untuk name, simpan subject."""
        super().__init__(name)
        self.subject = subject

    def introduce(self):
        """EN/ID: "Hi, I'm <name>. I teach <subject>." """
        return super().introduce() + f" I teach {self.subject}."


class Undergraduate(Person):
    """
    Exercise 7 / Soal 7 (continued / lanjutan)
    EN: __init__(name, semester): call super().__init__(name), then store
        semester. Override introduce() to return
        "Hi, I'm <name>. I'm in semester <semester>."
    ID: __init__(name, semester): panggil super().__init__(name), lalu simpan
        semester. Override introduce() supaya mengembalikan
        "Hi, I'm <name>. I'm in semester <semester>."
    """

    def __init__(self, name, semester):
        """EN: Use the parent for name, store semester. / ID: Pakai induk untuk name, simpan semester."""
        super().__init__(name)
        self.semester = semester

    def introduce(self):
        """EN/ID: "Hi, I'm <name>. I'm in semester <semester>." """
        return super().introduce() + f" I'm in semester {self.semester}."


# ---------------------------------------------------------------------------
# LEVEL 3 - CHALLENGE
# ---------------------------------------------------------------------------

class Classroom:
    """
    Exercise 8 / Soal 8 (Challenge): A class that holds Student objects.
    EN: Needs Exercise 2 (Student) to be finished first.
        __init__(name) stores name and an EMPTY list self.students.
        add_student(student) adds a Student OBJECT to the list.
        top_student() returns the Student OBJECT (not the name) with the
            highest average(). On a tie keep the first one added.
            Return None if the classroom is empty.
        pass_rate() returns the percentage (0-100) of students whose
            average() is >= 65. Return 0 if the classroom is empty.
    ID: Butuh Soal 2 (Student) selesai lebih dulu.
        __init__(name) menyimpan name dan list KOSONG self.students.
        add_student(student) menambahkan OBJEK Student ke list.
        top_student() mengembalikan OBJEK Student (bukan namanya) dengan
            average() tertinggi. Kalau sama, ambil yang ditambahkan lebih dulu.
            Kembalikan None kalau kelasnya kosong.
        pass_rate() mengembalikan persentase (0-100) mahasiswa yang
            average()-nya >= 65. Kembalikan 0 kalau kelasnya kosong.
    Examples / Contoh:
        room = Classroom("Algorithms A")
        ani = Student("Ani")
        ani.add_score(90)
        budi = Student("Budi")
        budi.add_score(60)
        room.add_student(ani)
        room.add_student(budi)
        room.top_student().name   -> "Ani"
        room.pass_rate()          -> 50.0
    """

    def __init__(self, name):
        """EN: Store name, start an empty students list. / ID: Simpan name, buat list students kosong."""
        self.name = name
        self.students = []

    def add_student(self, student):
        """EN: Add a Student object. / ID: Tambahkan objek Student."""
        self.students.append(student)

    def top_student(self):
        """EN: Student object with the highest average. / ID: Objek Student dengan rata-rata tertinggi."""
        if len(self.students) == 0:
            return None
        highest = self.students[0]
        for student in self.students:
            if student.average() > highest.average():
                highest = student
        return highest

    def pass_rate(self):
        """EN: Percent of students with average >= 65. / ID: Persen mahasiswa dengan rata-rata >= 65."""
        if len(self.students) == 0:
            return 0.0
        student_pass = 0
        for student in self.students:
            if student.average() >= 65:
                student_pass += 1
        rate = student_pass / len(self.students) * 100
        return rate


class Shape:
    """
    Exercise 9 / Soal 9 (Challenge): Polymorphism with shapes.
    EN: Shape(name) stores name.
        area() returns 0 (a general shape has no known area).
        describe() returns "<name> with area <area, 2 decimals>".
            IMPORTANT: call self.area() inside describe(), so every child
            class automatically uses ITS OWN area().
        Square, Triangle and Circle (below) are child classes. Each one calls
        super().__init__ with its own name ("Square", "Triangle", "Circle")
        and overrides area(). They do NOT need their own describe().
        total_area(shapes), a normal function below the classes, returns the
        sum of area() of every shape in the list.
    ID: Shape(name) menyimpan name.
        area() mengembalikan 0 (bentuk umum tidak punya luas yang pasti).
        describe() mengembalikan "<name> with area <luas, 2 desimal>".
            PENTING: panggil self.area() di dalam describe(), supaya setiap
            class anak otomatis memakai area() MILIKNYA SENDIRI.
        Square, Triangle dan Circle (di bawah) adalah class anak. Masing-masing
        memanggil super().__init__ dengan namanya sendiri ("Square",
        "Triangle", "Circle") dan meng-override area(). Mereka TIDAK perlu
        describe() sendiri.
        total_area(shapes), fungsi biasa di bawah class-class ini,
        mengembalikan jumlah area() dari semua bentuk di dalam list.
    Examples / Contoh:
        Square(4).area()                 -> 16
        Triangle(6, 3).area()            -> 9.0
        Circle(2).describe()             -> "Circle with area 12.56"
        total_area([Square(4), Triangle(6, 3), Circle(2)])  -> 37.56
    """

    def __init__(self, name):
        """EN: Store name. / ID: Simpan name."""
        self.name = name

    def area(self):
        """EN: A general shape: 0. / ID: Bentuk umum: 0."""
        return 0.00

    def describe(self):
        """EN/ID: "<name> with area <x.xx>" (use self.area())"""
        return f"{self.name} with area {self.area():.2f}"


class Square(Shape):
    """EN: Square(side): area = side * side. / ID: Persegi: luas = sisi * sisi."""

    def __init__(self, side):
        """EN: super().__init__("Square"), store side. / ID: super().__init__("Square"), simpan side."""
        super().__init__("Square")
        self.side = side

    def area(self):
        """EN/ID: side * side"""
        return self.side * self.side


class Triangle(Shape):
    """EN: Triangle(base, height): area = base * height / 2. / ID: Segitiga: luas = alas * tinggi / 2."""

    def __init__(self, base, height):
        """EN: super().__init__("Triangle"), store base and height. / ID: simpan base dan height."""
        super().__init__("Triangle")
        self.base = base
        self.height = height

    def area(self):
        """EN/ID: base * height / 2"""
        return self.base * self.height / 2


class Circle(Shape):
    """EN: Circle(radius): area = 3.14 * radius * radius. / ID: Lingkaran: luas = 3.14 * r * r."""

    def __init__(self, radius):
        """EN: super().__init__("Circle"), store radius. / ID: super().__init__("Circle"), simpan radius."""
        super().__init__("Circle")
        self.radius = radius

    def area(self):
        """EN/ID: 3.14 * radius * radius"""
        return 3.14 * self.radius * self.radius


def total_area(shapes):
    """
    Exercise 9 / Soal 9 (continued / lanjutan)
    EN: Return the sum of area() of all shapes in the list (0 if empty).
        You don't need to know which shape each one is: just call .area().
    ID: Kembalikan jumlah area() dari semua bentuk di list (0 kalau kosong).
        Tidak perlu tahu jenis bentuknya: cukup panggil .area().
    """
    return sum(shape.area() for shape in shapes)


# ---------------------------------------------------------------------------
# CHECKER - do not edit below this line / jangan ubah bagian di bawah ini
# ---------------------------------------------------------------------------
import inspect


def _body(func):
    """The code of a function/method after its docstring."""
    try:
        return inspect.getsource(func).split('"""')[-1]
    except (OSError, TypeError):
        return ""


def _is_todo(methods):
    for method in methods:
        if _body(method).strip() != "pass":
            return False
    return True


def _same(expected, got):
    if type(expected) == float or type(got) == float:
        if type(got) != int and type(got) != float:
            return False
        if type(expected) != int and type(expected) != float:
            return False
        return abs(expected - got) < 0.001
    if type(expected) == int and type(got) != int:
        return False
    return expected == got


class _Tester:
    """Compares values right away and remembers the FIRST mismatch."""

    def __init__(self):
        self.problem = None

    def expect(self, label, expected, got):
        if self.problem is None and not _same(expected, got):
            self.problem = (label, repr(expected), repr(got))


def _run(number, title, methods, test, rules=()):
    if _is_todo(methods):
        print(f"[TODO] Exercise {number:>2}: {title}")
        return 0
    tester = _Tester()
    crash = None
    try:
        test(tester)
    except Exception as error:
        crash = f"{type(error).__name__}: {error}"
    if tester.problem is not None:
        label, expected, got = tester.problem
        print(f"[FAIL] Exercise {number:>2}: {title}")
        print(f"         check:    {label}")
        print(f"         expected: {expected}")
        print(f"         got:      {got}")
        return 0
    if crash is not None:
        print(f"[FAIL] Exercise {number:>2}: {title}")
        print(f"         crashed:  {crash}")
        return 0
    for method, word in rules:
        if word not in _body(method):
            print(f"[RULE] Exercise {number:>2}: {title} - correct, but {method.__qualname__} must use `{word}`")
            return 0
    print(f"[PASS] Exercise {number:>2}: {title}")
    return 1


def _test_rectangle(t):
    board = Rectangle(4, 3)
    t.expect("Rectangle(4, 3).width", 4, board.width)
    t.expect("Rectangle(4, 3).height", 3, board.height)
    t.expect("Rectangle(4, 3).area()", 12, board.area())
    t.expect("Rectangle(4, 3).perimeter()", 14, board.perimeter())
    tall = Rectangle(2, 10)
    t.expect("Rectangle(2, 10).area()", 20, tall.area())
    t.expect("Rectangle(2, 10).perimeter()", 24, tall.perimeter())
    t.expect("Rectangle(2.5, 4).area()", 10.0, Rectangle(2.5, 4).area())


def _test_student_basics(t):
    excell = Student("Excell")
    t.expect("Student('Excell').name", "Excell", excell.name)
    t.expect("Student('Excell').scores for a new student", [], excell.scores)
    t.expect("average() with no scores", 0, excell.average())
    excell.add_score(88)
    excell.add_score(85)
    t.expect("scores after add_score(88) and add_score(85)", [88, 85], excell.scores)
    t.expect("average() of [88, 85]", 86.5, excell.average())
    budi = Student("Budi")
    budi.add_score(70)
    t.expect("Budi's scores (must not share Excell's list)", [70], budi.scores)
    t.expect("Excell's scores after Budi.add_score(70)", [88, 85], excell.scores)
    t.expect("average() of [70]", 70, budi.average())
    budi.add_score(61)
    budi.add_score(66)
    t.expect("average() of [70, 61, 66]", 65.6667, budi.average())


def _student_with(name, scores):
    student = Student(name)
    for score in scores:
        student.add_score(score)
    return student


def _test_student_grade(t):
    cases = [([88, 85], "A"), ([84, 85], "AB"), ([80], "AB"), ([79.5], "B"),
             ([75, 74], "BC"), ([70], "BC"), ([65, 66], "C"), ([64], "D"),
             ([50], "D"), ([49, 40], "E"), ([100], "A")]
    for scores, letter in cases:
        student = _student_with("X", scores)
        t.expect(f"grade() with scores {scores}", letter, student.grade())
    t.expect("str(Student) for Excell [88, 85]", "Excell: average 86.50, grade A",
             str(_student_with("Excell", [88, 85])))
    t.expect("str(Student) for Citra [70, 61, 66]", "Citra: average 65.67, grade C",
             str(_student_with("Citra", [70, 61, 66])))
    t.expect("str(Student) for Dina [40]", "Dina: average 40.00, grade E",
             str(_student_with("Dina", [40])))


def _test_bank_account(t):
    excell = BankAccount("Excell", 100000)
    t.expect("owner", "Excell", excell.owner)
    t.expect("_balance attribute", 100000, excell._balance)
    t.expect("get_balance() at start", 100000, excell.get_balance())
    t.expect("deposit(50000)", True, excell.deposit(50000))
    t.expect("balance after deposit(50000)", 150000, excell.get_balance())
    t.expect("deposit(0)", False, excell.deposit(0))
    t.expect("deposit(-5000)", False, excell.deposit(-5000))
    t.expect("balance after refused deposits", 150000, excell.get_balance())
    t.expect("withdraw(200000) (too much)", False, excell.withdraw(200000))
    t.expect("balance after refused withdraw", 150000, excell.get_balance())
    t.expect("withdraw(30000)", True, excell.withdraw(30000))
    t.expect("balance after withdraw(30000)", 120000, excell.get_balance())
    t.expect("withdraw(-1)", False, excell.withdraw(-1))
    t.expect("withdraw(120000) (exactly all)", True, excell.withdraw(120000))
    t.expect("balance after withdrawing everything", 0, excell.get_balance())
    budi = BankAccount("Budi")
    t.expect("BankAccount('Budi').get_balance() (default balance)", 0, budi.get_balance())


def _test_transfer(t):
    excell = BankAccount("Excell", 100000)
    budi = BankAccount("Budi", 20000)
    t.expect("excell.transfer_to(budi, 30000)", True, excell.transfer_to(budi, 30000))
    t.expect("excell balance after transfer", 70000, excell.get_balance())
    t.expect("budi balance after transfer", 50000, budi.get_balance())
    t.expect("excell.transfer_to(budi, 999999) (too much)", False, excell.transfer_to(budi, 999999))
    t.expect("excell balance after refused transfer", 70000, excell.get_balance())
    t.expect("budi balance after refused transfer", 50000, budi.get_balance())
    t.expect("excell.transfer_to(budi, 0)", False, excell.transfer_to(budi, 0))
    t.expect("budi.transfer_to(excell, 50000)", True, budi.transfer_to(excell, 50000))
    t.expect("budi balance after sending everything", 0, budi.get_balance())
    t.expect("excell balance after receiving", 120000, excell.get_balance())


def _test_course(t):
    before = Course.total_courses
    algorithms = Course("Algorithms", 3)
    english = Course("English", 2)
    t.expect("Course.total_courses after creating 2 courses", before + 2, Course.total_courses)
    calculus = Course("Calculus", 3)
    t.expect("Course.total_courses after creating 3 courses", before + 3, Course.total_courses)
    t.expect("algorithms.name", "Algorithms", algorithms.name)
    t.expect("english.credits", 2, english.credits)
    t.expect("algorithms.total_courses (read through an object)", before + 3, algorithms.total_courses)
    t.expect("english.describe()", "English (2 credits)", english.describe())
    t.expect("calculus.describe()", "Calculus (3 credits)", calculus.describe())


def _test_inheritance(t):
    t.expect("Person('Budi').introduce()", "Hi, I'm Budi.", Person("Budi").introduce())
    sari = Lecturer("Dr. Sari", "Algorithms")
    t.expect("Lecturer('Dr. Sari', 'Algorithms').name", "Dr. Sari", sari.name)
    t.expect("Lecturer(...).subject", "Algorithms", sari.subject)
    t.expect("Lecturer(...).introduce()", "Hi, I'm Dr. Sari. I teach Algorithms.", sari.introduce())
    excell = Undergraduate("Excell", 1)
    t.expect("Undergraduate('Excell', 1).name", "Excell", excell.name)
    t.expect("Undergraduate('Excell', 1).semester", 1, excell.semester)
    t.expect("Undergraduate('Excell', 1).introduce()", "Hi, I'm Excell. I'm in semester 1.",
             excell.introduce())
    people = [Person("Ani"), Lecturer("Pak Joko", "Calculus"), Undergraduate("Citra", 3)]
    texts = []
    for person in people:
        texts.append(person.introduce())
    t.expect("introduce() of [Person, Lecturer, Undergraduate] in one loop",
             ["Hi, I'm Ani.", "Hi, I'm Pak Joko. I teach Calculus.", "Hi, I'm Citra. I'm in semester 3."],
             texts)


def _test_classroom(t):
    room = Classroom("Algorithms A")
    t.expect("Classroom('Algorithms A').name", "Algorithms A", room.name)
    t.expect("students of a new classroom", [], room.students)
    t.expect("top_student() of an empty classroom", None, room.top_student())
    t.expect("pass_rate() of an empty classroom", 0, room.pass_rate())
    ani = _student_with("Ani", [90, 80])
    budi = _student_with("Budi", [60, 62])
    citra = _student_with("Citra", [70, 75])
    dina = _student_with("Dina", [50])
    for student in [ani, budi, citra, dina]:
        room.add_student(student)
    t.expect("number of students after 4 add_student()", 4, len(room.students))
    t.expect("top_student() is the Ani object", True, room.top_student() is ani)
    t.expect("pass_rate() with 2 of 4 passing", 50.0, room.pass_rate())
    eko = _student_with("Eko", [95, 97])
    room.add_student(eko)
    t.expect("top_student() after adding Eko (96.0)", "Eko", room.top_student().name)
    t.expect("pass_rate() with 3 of 5 passing", 60.0, room.pass_rate())
    other = Classroom("Calculus B")
    gita = _student_with("Gita", [80])
    hana = _student_with("Hana", [80])
    other.add_student(gita)
    other.add_student(hana)
    t.expect("top_student() on a tie keeps the first one (Gita)", True, other.top_student() is gita)
    t.expect("pass_rate() with 2 of 2 passing", 100.0, other.pass_rate())
    t.expect("first classroom still has 5 students", 5, len(room.students))


def _test_shapes(t):
    blob = Shape("Blob")
    t.expect("Shape('Blob').name", "Blob", blob.name)
    t.expect("Shape('Blob').area()", 0, blob.area())
    t.expect("Shape('Blob').describe()", "Blob with area 0.00", blob.describe())
    square = Square(4)
    t.expect("Square(4).name", "Square", square.name)
    t.expect("Square(4).area()", 16, square.area())
    t.expect("Square(2.5).describe()", "Square with area 6.25", Square(2.5).describe())
    triangle = Triangle(6, 3)
    t.expect("Triangle(6, 3).name", "Triangle", triangle.name)
    t.expect("Triangle(6, 3).area()", 9.0, triangle.area())
    t.expect("Triangle(5, 3).describe()", "Triangle with area 7.50", Triangle(5, 3).describe())
    circle = Circle(2)
    t.expect("Circle(2).area()", 12.56, circle.area())
    t.expect("Circle(2).describe()", "Circle with area 12.56", circle.describe())
    t.expect("Circle(10).describe()", "Circle with area 314.00", Circle(10).describe())
    t.expect("total_area([Square(4), Triangle(6, 3), Circle(2)])", 37.56,
             total_area([square, triangle, circle]))
    t.expect("total_area([Square(1), Square(2)])", 5, total_area([Square(1), Square(2)]))
    t.expect("total_area([])", 0, total_area([]))


if __name__ == "__main__":
    checks = [
        (1, "Rectangle", [Rectangle.__init__, Rectangle.area, Rectangle.perimeter],
         _test_rectangle, []),
        (2, "Student: add_score, average", [Student.__init__, Student.add_score, Student.average],
         _test_student_basics, []),
        (3, "Student: grade, __str__", [Student.grade, Student.__str__],
         _test_student_grade, []),
        (4, "BankAccount", [BankAccount.__init__, BankAccount.get_balance,
                            BankAccount.deposit, BankAccount.withdraw],
         _test_bank_account, []),
        (5, "BankAccount.transfer_to", [BankAccount.transfer_to],
         _test_transfer, [(BankAccount.transfer_to, "withdraw("),
                          (BankAccount.transfer_to, "deposit(")]),
        (6, "Course (class attribute)", [Course.__init__, Course.describe],
         _test_course, []),
        (7, "Person / Lecturer / Undergraduate", [Person.__init__, Person.introduce,
                                                  Lecturer.__init__, Lecturer.introduce,
                                                  Undergraduate.__init__, Undergraduate.introduce],
         _test_inheritance, [(Lecturer.__init__, "super()"), (Undergraduate.__init__, "super()")]),
        (8, "Classroom (challenge)", [Classroom.__init__, Classroom.add_student,
                                      Classroom.top_student, Classroom.pass_rate],
         _test_classroom, []),
        (9, "Shapes (challenge)", [Shape.__init__, Shape.area, Shape.describe,
                                   Square.__init__, Square.area, Triangle.__init__,
                                   Triangle.area, Circle.__init__, Circle.area, total_area],
         _test_shapes, [(Square.__init__, "super()"), (Triangle.__init__, "super()"),
                        (Circle.__init__, "super()"), (Shape.describe, "self.area()")]),
    ]

    print("=" * 45)
    print("  Topic 10 - OOP Exercises")
    print("=" * 45)
    score = 0
    for number, title, methods, test, rules in checks:
        score += _run(number, title, methods, test, rules)
    print("=" * 45)
    print(f"  Score: {score} / {len(checks)}")
    if score == len(checks):
        print("  All exercises passed. Push it to GitHub!")
    print("=" * 45)
