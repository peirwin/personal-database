## C++ Intro

### refs:

- learncpp.com
- cppreference.com
- cplusplus.com

### advantages:

- widely used
- fast code
- saturated market
- highly customizable
- supports OOP
- popular in game dev

### disadvantages

- easy to write unsafe code
- manual memory management
- difficult debugging
- relatively confusing syntax
- difficult to understand 

### properties

- **flag** : -std=C++17
-  [[statically typed]] (similar to Java + C)
	-  variable is defined before use

### example

```c++
#include <iostream> //pre-processor directive 
					//includes a C++ library
int main(int argc, char * argv[]) //main fn runs first, returns int
{ //argc = number of program args, argv = array of string args
	std::cout << "Hello, world!\n"; //std is namespace, << inputs str
	return 0; //serves for future error detection
}
```

### indentation styles

#### k&r
```c++
while (x == y) {
	something();
	somethingelse();
}
```

#### allman
```c++
while (x == y)
{
	something();
	somethingelse());
}
```

### standard library

- called by '#include'
- referenced via the 'std::' [[namespace]]

### source code

- written in .cpp
	- define functions
- header files
	- call functions

### compilation
- popular compilers (gcc, vs, clang)
- c++ --> binary --> CPU
- no virtual machine
- no interpreter

##### process

 	- source .cpp
	- pre-processor
	- expanded source
	- compiler 
		- catches syntax errors
	- object file
	- linker
	- executable
	
##### example
**program: myprog.cpp**
- 'g++ myprog.cpp' [[-o]] \<name\> --> executable
- 'g++ [[-E]] myprog.c' > myprog.s
- 'g++ [[-c]] myprog.c' > myprog.o
**polycompilation**
- 'g++  \*.cpp [[-o]]  myprog'

##### G++ preprocessor fn
ex: \#include \<library\>
- inserts the entire text from the library
- synonym to python import




