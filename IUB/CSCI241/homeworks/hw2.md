Name: Pete Irwin
Topic: Homework Two
Date: Jan 22, 2022
Course: C241

---

### QUESTION ONE
- (a) $A \rightarrow \lnot B$ is satisfiable
$$ \begin{array}{c|c|c|}
A & B & A \rightarrow \lnot B \\
\hline
T & T & F \\
T & F & T \\
F & T & T \\
F & F & T \\
\end{array} $$
- (b) $(A \land \lnot A) \lor (B \land \lnot B)$ is not satisfiable
$$ \begin{array}{c|c|c|}
A & B & (A \land \lnot A) \lor (B \land \lnot B)  \\
\hline
T & T & F \\
T & F & F \\
F & T & F \\
F & F & F \\
\end{array} $$
- (c) $\lnot (A \land B) \iff (\lnot A \lor \lnot B)$ is satisfiable
$$ \begin{array}{c|c|c|}
A & B & \lnot (A \land B) \iff (\lnot A \lor \lnot B) \\
\hline
T & T & T \\
T & F & F \\
F & T & F \\
F & F & T \\
\end{array} $$
- (d) $(A \, \oplus \lnot B) \land \lnot (A \rightarrow B)$ is not satisfiable
$$ \begin{array}{c|c|c|}
A & B & (A \, \oplus \lnot B) \land \lnot (A \rightarrow B) \\
\hline
T & T & F \\
T & F & F \\
F & T & F \\
F & F & F \\
\end{array} $$
- (e) $\lnot ((B \land \lnot A) \rightarrow (A \lor \lnot C))$ is satisfiable
$$ \begin{array}{c|c|c|}
A & B & C & \lnot ((B \land \lnot A) \rightarrow (A \lor \lnot C)) \\
\hline
T & T & T & F \\
T & F & T & F \\
F & T & T & T \\
F & F & T & F \\
T & T & F & F \\
T & F & F & F \\
F & T & F & F \\
F & F & F & F \\
\end{array} $$
- (f) $\lnot A \lor ((D \lor \lnot D) \rightarrow ((B \land \lnot B) \iff (C \rightarrow C)))$ is satisfiable
$$ \begin{array}{c|c|c|c|c|}
A & B & C & D & \lnot A \lor ((D \lor \lnot D) \rightarrow ((B \land \lnot B) \iff (C \rightarrow C))) \\
\hline
T & F & T & T & F\\
T & T & T & T & F\\
F & T & T & T & T\\
F & F & T & T & T\\
T & T & F & T & F\\
T & F & F & T & F\\
F & T & F & T & T\\
F & F & F & T & T\\
T & T & T & F & F\\
T & F & T & F & F\\
F & T & T & F & T\\
F & F & T & F & T\\
T & T & F & F & F\\
T & F & F & F & F\\
F & T & F & F & T\\
F & F & F & F & T\\
\end{array} $$

### QUESTION TWO
- (a) $X \rightarrow \lnot X$ is not a contradiction
$$ \begin{array}{c|c|c|}
A & B & X \rightarrow \lnot X \\
\hline
T & T & F \\
T & F & T \\
F & T & T \\
F & F & T \\
\end{array} $$
- (b)/(c) $\lnot A \rightarrow \lnot (A \lor B)$ is not a tautology, but is a contingency
$$ \begin{array}{c|c|c|}
A & B & \lnot A \rightarrow \lnot (A \lor B)\\
\hline
T & T & T \\
T & F & T \\
F & T & F \\
F & F & T \\
\end{array} $$
- (d)/(e) $((A \rightarrow B) \land (C \lor \lnot B)) \rightarrow (A \rightarrow C)$ is a tautology, and is satisfiable 
 $$ \begin{array}{c|c|c|}
A & B & C & ((A \rightarrow B) \land (C \lor \lnot B)) \rightarrow (A \rightarrow C) \\
\hline
T & T & T & T\\
T & F & T & T\\
F & T & T & T\\
F & F & T & T\\
T & T & F & T\\
T & F & F & T\\
F & T & F & T\\
F & F & F & T\\
\end{array} $$
- (f) $\lnot (A \land B) \iff (\lnot A \lor \lnot B)$ is a contingency
$$ \begin{array}{c|c|c|}
A & B & \lnot (A \land B) \iff (\lnot A \lor \lnot B)  \\
\hline
T & T & T \\
T & F & F \\
F & T & F \\
F & F & T \\
\end{array} $$
- (g)/(h) $(A \rightarrow B) \rightarrow (\lnot A \rightarrow \lnot B)$ is neither a contradiction nor a tautology
$$ \begin{array}{c|c|c|}
A & B & (A \rightarrow B) \rightarrow (\lnot A \rightarrow \lnot B)  \\
\hline
T & T & T \\
T & F & T \\
F & T & F \\
F & F & T \\
\end{array} $$

### QUESTION THREE

-(a) $\{A \land \lnot B, A \lor B\}$ is logically consistent with truth assignment A = True, B = False

-(b) $\{P \rightarrow Q, P, \lnot Q \}$ is logically consistent with truth assignment P = False, Q = True

-(c) $\{H \rightarrow E, \lnot G \iff H, G \}$ is logically consistent with truth assignment G = True, H = False, E = False

### QUESTION FOUR

-(a) $P \iff \lnot Q$ and $(P \land \lnot Q) \lor (\lnot P \land Q)$ are logically equivalent 
$$ 
\begin{array}{c|c|c|}
P & Q & P \iff \lnot Q  \\
\hline
T & T & F \\
T & F & T \\
F & T & T \\
F & F & F \\
\end{array}
\qquad
\begin{array}{c|c|c|}
P & Q & (P \land \lnot Q) \lor (\lnot P \land Q)  \\
\hline
T & T & F \\
T & F & T \\
F & T & T \\
F & F & F \\
\end{array} 
$$

-(b) $A \rightarrow B$ and $\lnot B \rightarrow A$ are not logically equivalent

$$ 
\begin{array}{c|c|c|}
A & B & A \rightarrow B  \\
\hline
T & T & T \\
T & F & F \\
F & T & T \\
F & F & T \\
\end{array}
\qquad
\begin{array}{c|c|c|}
A & B & \lnot B \rightarrow A  \\
\hline
T & T & T \\
T & F & T \\
F & T & T \\
F & F & F \\
\end{array} 
$$

### QUESTION FIVE

-(a) When B = False and A = True, the implication has a truth value of false, while it's converse has a truth value of true; therefore, the implication is not logically equivalent to it's converse.

-(b) The truth tables below prove that an implication is logically equivalent to it's contrapositive.
$$ 
\begin{array}{c|c|c|}
A & B & A \rightarrow B  \\
\hline
T & T & T \\
T & F & F \\
F & T & T \\
F & F & T \\
\end{array}
\qquad
\begin{array}{c|c|c|}
A & B & \lnot B \rightarrow \lnot A  \\
\hline
T & T & T \\
T & F & F \\
F & T & T \\
F & F & T \\
\end{array} 
$$

### QUESTION SIX

-(a) This argument is valid because none of the truth arguments satisfy all of the premises.
$$
\begin{array}{c|c|c|}
A & B & \lnot (A \land B)  \\
\hline
T & T & F \\
T & F & T \\
F & T & T \\
F & F & T \\
\end{array}
\qquad
\begin{array}{c|c|c|}
A & \lnot A  \\
\hline
T & F \\
F & T  \\
\end{array}
\qquad
\begin{array}{c|c|c|}
A & B & \lnot (B \rightarrow A) \\
\hline
T & T & F \\
T & F & F \\
F & T & T \\
F & F & F \\
\end{array}
$$

-(b) This argument is invalid because with truth assignment X = True, Y = True, the premises are both satisfied but the conclusion is not.

-(c) This argument is invalid because with truth assignment P = False, Q = False, the premises are both satisfied but the conclusion is not.
$$ 
\begin{array}{c|c|c|}
P & Q & P \rightarrow \lnot Q \\
\hline
T & T & F \\
T & F & T \\
F & T & T \\
F & F & T \\
\end{array}
\qquad
\begin{array}{c|c|c|}
P & Q & \lnot Q \\
\hline
T & T & F \\
T & F & T \\
F & T & F \\
F & F & T \\
\end{array} 
\qquad
\begin{array}{c|c|c|}
P & Q & \lnot \lnot P \\
\hline
T & T & T \\
T & F & T \\
F & T & F \\
F & F & F \\
\end{array}
$$

-(d) This argument is valid because none of the truth arguments satisfy all of the premises.
$$ 
\begin{array}{c|c|c|}
P & Q & P \iff Q \\
\hline
T & T & T \\
T & F & F \\
F & T & F \\
F & F & T \\
\end{array}
\qquad
\begin{array}{c|c|c|}
P & Q & \lnot Q \land P \\
\hline
T & T & F \\
T & F & F \\
F & T & T \\
F & F & F \\
\end{array} 
\qquad
\begin{array}{c|c|c|}
P & Q & Q \land \lnot P \\
\hline
T & T & F \\
T & F & T \\
F & T & F \\
F & F & F \\
\end{array}
$$
### QUESTION SEVEN

-(a) $\lnot A \iff \lnot B$

-(b) There is no such contingency that can be logically equivalent to a tautology and there is no such tautology that can be logically equivalent to a contingency. This is because a tautology is defined as a statement that is true for every truth assignment, which a contingency cannot be equivalent to because a contingency has to have at least one false output.

-(c) $\{P \land \not Q, P \}$

-(d) $\{A \rightarrow B, \lnot (A \rightarrow B) \}$

-(e) $\{A \rightarrow \lnot B, A \rightarrow B\}$

-(f) $\{((A \rightarrow B) \land (C \lor \lnot B)) \rightarrow (A \rightarrow C), A \rightarrow B\}$

-(g) Premise one: $A \lor B$ Premise two: $A \land B$ Conclusion: $\lnot (A \lor B)$

-(h) p = $X \iff Y$ and q = $X \lor Y$

-(i) p = $A \iff B$ and q = $A \lor B$

-(j) [bonus] premise = $(A \, \oplus \lnot B) \land \lnot (A \rightarrow B)$ conclusion =  $(A \land \lnot A) \lor (B \land \lnot B)$

### QUESTION EIGHT

-(a) yes, every tautology is satisfiable because a tautology must have a value of true for every truth assignment.

-(b) no, a satisfiable formula is able to have a truth assignment with a false output as long as the formula has at least one truth assignment that outputs true, while a tautology must have all it's truth assignments output true.

-(c) yes, every contingency is required to be satisfiable because a contingency must contain a true output, which satisfies the statement, and a false output.

### QUESTION NINE (BONUS)

The formula p is a tautology if and only if the formula $\lnot p$ is not satisfiable 

### QUESTION TEN

This argument is valid because of the following thought experiment. Assuming the argument is invalid, there should be one truth assignment where the three prepositions would be true and the conclusion would be false. For the conclusion to be false, D or B must be false. If D is false, preposition three would be true only if C is assigned false. If C is false, A must also be false to satisfy preposition two. If A is false, then there is no way for every preposition to be true; therefore, D cannot be false. If B is false, then it is impossible to satisfy preposition one. Because neither B or D can be false while satisfying all three of the prepositions, the argument cannot be invalid.

### QUESTION ELEVEN (BONUS)
(a) would have a larger truth table because the number of rows in the truth table increases by $2^k$, where k is the number of different atomic statements. In this case we have 5 in (a), which corresponds to 32 rows, and in (b) we have 2, which corresponds to 4 rows.