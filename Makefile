JAVA_FILES := $(shell find . -name "*.java")
CLASS_FILES := $(JAVA_FILES:.java=.class)	
all: $(CLASS_FILES)

run: 
	java -cp bin $(SECTION).$(CLASS)	

%.class: %.java
	mkdir -p bin/
	javac $< -d bin/

clean:
	find . -name "*.class" -delete	

.PHONY: all clean
