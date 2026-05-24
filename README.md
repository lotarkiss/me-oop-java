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

## Section 1

hello     - a simple hello world program
sum100    - a simple for loop for sum
prod9     - a simple for loop for product
factorial - a simple recursive factorial
rectangle - read `stdin`, calculate rect area
triangle  - read `stdin`, decide a triangle is valid