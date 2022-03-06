## Computer Architecture Introduction
#### Architecture: hardware presentation
#### Organization: hardware implementation

###### Language of instruction
![](https://i.imgur.com/iaZ4O21.png)

---

==Program==: **readable code** 
**↓** *(This process is dependent on ISA)*
==Executable/Binary==: **machine code**

[[ISA]]: instruction set architecture (neccessary semantics of machine code) 
[[Firmware]] is built off of the ISA, which is **==why compilers are architecture and OS specific==**

ISA instruction examples:
- Arithemetic (add, sub, mult, div)
- Logic (and, or, not)
- Data transfer

ISA features:
- Consise (limited size)
- Generic
- Simple

ISA designs:
- Redcued instruction set comptuer ([[RISC]])
	- simple/regular (64-128 instructions)
	- [[ARM]], IBM PowerPc, HP PA-RISC
- Complex instruction set computer ([[CISC]])
	- complex (500+ instructions)
	- Intel [[X86]] (AMD uses,  VAX)

ISA substructure/Universal Turing machines (UTM):
- Turing machines (**assumes infinity memory**) (**theoretical**)
	- <u>Alan turing</u> (father of CS)
	- Turing-Completeness is defined by the turing machine
		- requires state, loop, and condition.
	- (old state, old symbol) → (new state, new symbol)
	- Turing-Church thesis says that anything can be simulated by a turing machine
- Requires: 
	- generic action table (instruction processor) (CPU)
		- contains program counter 
		- contains instructory units
	- simulated action table (Instruction memory):
		- sequence of instructions
	- state register (program counter /data memory cells)
		- variables + constants + pointers
	- "tape" (memory drive)
		- array of bytes

##### CPU (central processing unit)

Arithmetic locic unit (computation)
Control unit (conditionals + loops)
Program counter (location of operation)
	- capable of branch instruction
		- move to a new program location
	- capable of sequencial instruction
		-transfer values between memory locations

##### Practical architecture

[[Harvard architecture]] (OUTDATED):
- instruction memory and data memory are separate
[[Von-Neumann architecture]] (present use with registers in the CPU)
- all memory is unified
The larger the structure, the slower it is, therefore [[RAM]] can be used to speed up processing
The cpu contains 16-64 registers of [[IRAM]] (internal RAM)

	


