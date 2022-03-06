## INTRO TO ASSEMBLY
#### refers to the lowest level languages specific to an ISA
#### contains a machine instruction and operands

---

The assembly language most capable in writitng highly efficient code
- Used for operating systems and device drivers
- May use features that are not supported by standard programming languages

An **Assembler** converts the assembly language to machine code
- nasm, tasm, masm ([[X86]])
- creates executables

A **Register** is a named storage location for general use
- Stack pointer
- Program counter
	- containts the address of the current instruction
- Return address 
	- begins at 0, ends at n^[number of registers within the memory]-1

A **Machine specific register (MSR)** are specific to the processor
- Control the machine
- Speed of fans
- Power control settings

The storage of **data types**
- the bytes of information are stored in consecutive locations with the start being on the left
  - LSB (==Least significant byte==) storage is called *LIttle endian representation*
    + [[X86]], [[ARM]]
  - MSB (==Most significant byte==) storage is called *Big endian representation*
    - Sun Sparc, IBM PPC 

		%%a 4 byte int would be stored from address `i-(i+3)`%%
- types: char (1 byte), short (2 bytes), int (4 bytes), long int (8 bytes)