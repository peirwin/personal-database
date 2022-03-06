Topic: homework 4
Date: 2/9/2022
Name: Pete Irwin
Course: C241

---

### Question one

#### (a) - CLAIM: $A \rightarrow \lnot B, \lnot \lnot B \vdash \lnot (A \rightarrow B)$
###### PF:

This claim is false because truth assignment A = false B = false indicates that the premises are true, while the conclusion is false.

#### (b) - CLAIM: $\vdash (M \rightarrow \lnot N) \rightarrow \lnot (M \land N)$
###### PF:

Assume $(M \rightarrow \lnot N)$
$\qquad$ Suppose $(M \land N)$ (towards contradiction)
$\qquad \qquad$ This would imply $M$ and $N$ (simp.)
$\qquad \qquad$ $M$ would indicate $\lnot N$ (appl.)
$\qquad \qquad$ Since $N$ and $\lnot N$ cannot stand, $\lnot (M \land N)$ holds (condic.)
$\blacksquare$

#### (c) - CLAIM: $Z \rightarrow A, \lnot A, \vdash \lnot Z$
###### PF:
Assume $Z \rightarrow A$ and $\lnot A$
$\qquad$ Assume $Z$ (towards contradiction)
$\qquad \qquad$ This would imply $A$ (appl.)
$\qquad \qquad$Since $A$ and $\lnot A$ cannot stand, $\lnot Z$ (condic.)
$\blacksquare$

#### (d) - CLAIM: $Z \rightarrow A, \lnot A, A \rightarrow B \vdash \lnot Z \land \lnot B$
###### PF:

This Claim is false because with assignment A = False, Z = False, and B = True, the propositions will be satisfied, but the conclusion will not be.

#### (e) - CLAIM: $Z \rightarrow A, B \rightarrow A, \lnot A \vdash \lnot Z \land \lnot B$
###### PF:
Assume $\lnot A$, $B \rightarrow A$, and $Z \rightarrow Z$
$\qquad$ Suppose B (towards contradiction)
$\qquad \qquad$ This would imply $A$ (appl.)
$\qquad \qquad$ Since $A$ and $\lnot A$ conflict, $\lnot B$ (condic.)
$\qquad$ Suppose Z (towards contradiction)
$\qquad \qquad$ This would indicate $A$
$\qquad \qquad$ Since $A$ and $\lnot A$ conflict, $\lnot Z$ (condic.)
Because $\lnot B$ and $\lnot Z$, we can conclude $\lnot B \land \lnot Z$
$\blacksquare$

#### (f) - CLAIM: $P \lor (Q \land \lnot \lnot R), P \rightarrow R \vdash R$
###### PF:
Assume $P \lor (Q \land \lnot \lnot R)$ and $P \rightarrow R$
$\qquad$ Case one: Assume $P$
$\qquad \qquad$ This would imply $R$ (appl.)
$\qquad$ Case two: Assume $Q \land \lnot \lnot R$
$\qquad \qquad$ This would imply $Q$ and $\lnot \lnot R$ (simp.)
$\qquad \qquad$ Which would then imply $R$ (dbl. neg)
$R$ is true in both cases, therefore $R$ (cases)
$\blacksquare$

#### (g) - CLAIM: $(F \land G) \lor (H \rightarrow I), H \vdash G \lor I$
###### PF:
Assume $(F \land G) \lor (H \rightarrow I)$ and $H$
$\qquad$ Case one: Assume $(F \land G)$
$\qquad \qquad$ This would imply $F$ and $G$ (simp.)
$\qquad \qquad$ Which would imply $G \lor I$ (weak.)
$\qquad$ Case two: Assume $(H \rightarrow I)$
$\qquad \qquad$ This would imply $I$ due to $H$ (appl.)
$\qquad \qquad$ Which would imply $G \lor I$ (weak.)
$G \lor I$ is true in both cases, therefore $G \lor I$ (cases)
$\blacksquare$

#### (h) - CLAIM: $X \rightarrow Y \vdash (X \lor Z) \rightarrow Y$
###### PF:

This claim is incorrect because truth assignment X = false, Y = false, Z = true will satisfy the propositions but not the conclusion. 
 
 
#### (i) - CLAIM: $J \rightarrow K \vdash (J \lor \lnot \lnot K) \rightarrow K$
###### PF:
Assume $J \rightarrow K$
$\qquad$ Suppose $J \lor \lnot \lnot K$
$\qquad \qquad$ Case one: Suppose $J$ 
$\qquad \qquad$ This would indicate $K$ (appl.)
$\qquad \qquad$ Case two: Suppose $\lnot \lnot K$
$\qquad \qquad$ This would indicate $K$ (dbl. neg)
$\qquad$ Both cases give $K$, therefore $K$
With both $J \lor \lnot \lnot K$ and $K$, we conclude $(J \lor \lnot \lnot K) \rightarrow K$ (dir. pf) 
$\blacksquare$

#### (j) - CLAIM: $(A \land C) \rightarrow D, A \land \lnot B \vdash \lnot (A \rightarrow B) \land (C \rightarrow D)$
###### PF:
Assume $(A \land C) \rightarrow D$ and $A \land \lnot B$
From assumption two, we conclude $A$ and $\lnot B$ (simp.)
$\qquad$ Assume $C$
$\qquad$ We can say $C \land A$ (conj.)
$\qquad$ Which then concludes $D$ (appl.)
From the above subproof, we see $C \rightarrow D$ (dir. pf)
$\qquad$ Now Assume $A \rightarrow B$
$\qquad$ With $A$, we imply $B$ (appl.)
Because $B$ and $\lnot B$ cannot stand, we conclude $\lnot (A \rightarrow B)$ (condic.)
With both $C \rightarrow D$ and $\lnot (A \rightarrow B)$, we see $\lnot (A \rightarrow B) \land (C \rightarrow D)$ (conj.)

### Question two

#### (a) - Line two is incorrect because $\lor - Elim$ must be applied through a subproof, which this proof does not do.

#### (b) - Line six is incorrect because you cannot reuse a subproof formula outside of the subproof as part of a direct proof.

#### (c) - This proof is valid.

#### (d) - Line 7 is incorrect because they are incorrectly introducing the $\lnot$ on the wrong formula.

#### (e) - This proof is valid.

#### (f) - This proof is valid, though it is awful to read.  

### Question three

#### (a) - CLAIM: $A \rightarrow (B \land C) \equiv (A \rightarrow B) \land (A \rightarrow C)$
PF::
**subproof claim:** $A \rightarrow (B \land C) \vdash (A \rightarrow B) \land (A \rightarrow C)$
Assume $A \rightarrow (B \land C)$ and $A$
This would imply $B \land C$ (appl.)
Which would imply $B$ and $C$ (simp.)
With $A$ and $C$, we can say $A \rightarrow C$ (dir. pf)
With $A$ and $B$, we can say $A \rightarrow B$ (dir. pf)
Which concludes $(A \rightarrow B) \land (A \rightarrow C)$
$\blacksquare$
 
**subproof2 claim:** $(A \rightarrow B) \land (A \rightarrow C) \vdash A \rightarrow (B \land C)$
Assume $(A \rightarrow B) \land (A \rightarrow C)$ and $A$
This implies $A \rightarrow B$ and $A \rightarrow C$
Since $A$, $B$ (appl.)
Since $A$, $C$ (appl.)
$B$ and $C$ imply $B \land C$ (conj.)
Conclusively, $A \rightarrow (B \land C)$
$\blacksquare$

#### (b) - CLAIM: $A \rightarrow (B \land C) \equiv (A \rightarrow B) \land (A \rightarrow C)$
EQUIVALENCE PF::
 $A \rightarrow (B \land C) \equiv (A \rightarrow B) \land (A \rightarrow C)$
 $\lnot A \lor (B \land C) \equiv (\lnot A \lor B) \land (\lnot A \lor C)$ (impl.)
 $(\lnot A \lor B) \land (\lnot A \lor C) \equiv (\lnot A \lor B) \land (\lnot A \lor C)$ (distr. of $\lor$ over $\land$)
 $\blacksquare$
 
 ### Question four
 
 #### (a) - CLAIM: $(A \land B) \rightarrow C \equiv (A \rightarrow C) \land (B \rightarrow C)$
 NOT LOGICALLY EQUIVALENT: When A=True, C=False, and B=False, both equations have different truth values.
 
 #### (b) - CLAIM: $(A \rightarrow B) \rightarrow C \equiv (\lnot A \rightarrow C) \land (B \rightarrow C)$ 
 ##### PF:
 $\lnot (\lnot A \lor B) \lor C \equiv (A \lor C) \land (\lnot B \lor C)$ (impl.)
 $(A \land \lnot B) \lor C \equiv (A \lor C) \land (\lnot B \lor C)$ (de morgan) 
 $(A \lor C) \land (\lnot B \lor C \equiv (A \lor C) \land (\lnot B \lor C))$ (distr. of $\lor$ over $\land$)
 $\blacksquare$
 
 #### (c) - CLAIM: $\lnot ((W \land \lnot X) \rightarrow (\lnot Y \lor Z)) \equiv (\lnot W \lor X) \land (Y \land \lnot Z)$
 NOT LOGICALLY EQUIVALENT: When W=True, X=True, Y=True, and Z=False, both equations have different truth values
 
 #### (d) - CLAIM: $\lnot ((W \land \lnot X) \rightarrow (\lnot Y \lor Z)) \equiv (Y \land \lnot Z) \land (W \land \lnot X)$
 ##### PF:
$\lnot((\lnot (W \land \lnot X) \lor (\lnot Y \lor Z))) \equiv (Y \land \lnot Z) \land (W \land \lnot X)$ (impl.)
$\lnot((\lnot W \lor X) \lor (\lnot Y \lor Z))) \equiv (Y \land \lnot Z) \land (W \land \lnot X)$ (de morgan) 
 $\lnot(\lnot W \lor X) \land \lnot (\lnot Y \lor Z) \equiv (Y \land \lnot Z) \land (W \land \lnot X)$ (de morgan)
 $(W \land \lnot X) \land (Y \land \lnot Z) \equiv (Y \land \lnot Z) \land (W \land \lnot X)$ (de morgan)
$(Y \land \lnot Z) \land (W \land \lnot X) \equiv (Y \land \lnot Z) \land (W \land \lnot X)$ (commutativity of $\land$)
$\blacksquare$

#### (e) - CLAIM: $(M \rightarrow N) \land (\lnot M \rightarrow N) \equiv N$
##### PF:
$(\lnot M \lor N) \land (M \lor N) \equiv N$ (impl.)
$N \lor (M \land \lnot M) \equiv N$ (distributivity of $\lor$ over $\land$)
$N \lor (\bot) \equiv N$ (negation)
$N \equiv N$ ($\lor$ identity)

### Question five

#### CLAIM: $\vdash P \lor \lnot P$
##### PF:


