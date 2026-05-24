## Java 101

Some example codes. Tools to compile.
- GNU Make
- JDK

The Makefile use only `javac` to compile.

```bash
make
```

To cleanup as well.
```bash
make clean
```

To run the programs, use the appropiate `.class` file in `bin/` folder, or use the makefile (equialent).

```bash
java -cp bin section1.hello
```

or

```bash
SECTION=section1 CLASS=hello make run
```

Have fun, feel free to send PR with more examples!

## Section 1 - basic syntax, static stuff

- hello     - a simple hello world program
- sum100    - a simple for loop for sum
- prod9     - a simple for loop for product
- factorial - a simple recursive factorial
- rectangle - read `stdin`, calculate rect area
- triangle  - read `stdin`, decide a triangle is valid
- quadratic - read `stdin`, solve a quadratic equation

## Section 2 - arrays, lists, dynamic objects

- tempstat  - how to use Array<> for temperature statistics
- frequent  - how to use String as a `Array<char>` object
- wc        - how to use ArrayList<> for `stdin` word count
- lru       - how to use LinkedList<> for usage list
- numconv   - how to use Stack<> for number base conversion
- spooler   - how to use ArrayDeque<> for a simple ToDo-list
- hosts     - how to use HashMap<> for hostname lookup

## Section 3 - classes, and instances, references, get/set methods

- ??        - Alkalmazott?

## Section 4 - inheritance, and method override

- ??        - Alkalmazott?

## Section 5 - polymorphism

- ??        - Kifli, Kenyér, Zsömle?

## Section 6 - sorting

## Section 7 - exception handling