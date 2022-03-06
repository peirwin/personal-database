Name: Pete Irwin
Topic: Quiz 3
Date: 02.03.2022
Course: C241

---

### Question One

Claim: $(A \land B) \rightarrow C, \lnot \lnot A \vdash (B \land D) \rightarrow (C \lor \lnot D)$

Assume $(A \land B \rightarrow C)$ and $(A \land B)$
This would imply $C$ (appl.)
Aswell as $A$ and $B$ (simp.)
This would satisfy $\lnot \lnot A$ (dbl. neg)
The propositions now all satisfy
Now assuming $D$,
$C$ would imply $C \lor \lnot D$ (weak.)
$B$ and $D$ would satisfy $B \land D$ (conj.)
We can now conclude $(B \land D) \rightarrow (C \lor \lnot D)$ $\blacksquare$

---

### Question two

Claim: $P \land \lnot R \vdash \lnot (P \rightarrow (Q \land R))$

Assume $P \rightarrow (Q \land R)$ and $P \land \lnot R$
The second assumption would imply $P$ and $\lnot R$ (simp.)
The first assumption, along with $P$, would imply $Q \land R$ (appl.)
$\qquad (Q \land R)$ would imply $Q$ and $R$ (simp.)
$\qquad R$ and $\lnot R$ cannot hold, therefore $\lnot (P \rightarrow (Q \land R))$ (condic.) $\blacksquare$

---