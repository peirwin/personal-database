Name: Pete Irwin
Topic: Homework Three
Date: {{date:MMM d, YYYY}}
Course: C241

---

### Question 1 (a)
##### Claim: $(P \land Q) \rightarrow R, P \land S ,\lnot \lnot Q \vdash R$

##### PF: 
Assume $P \land S$ and $\lnot \lnot Q$, 
This would imply $Q$ (dbl. neg)
This would imply $P$ and $S$ (simp.)
Now $P \land Q$ (conj.)
Since $(P \land Q)$ is true, $R$ is true (appl.) $\qquad \blacksquare$ 

### Question 1 (b)
##### Claim: $(K \lor L) \rightarrow N, K \land M \vdash N \land M$

##### PF: 
Assume $K \land M$,
This would imply $M$ and $K$ (simp.)
($K \lor L$) now holds (weak.)
Which implies $N$ (appl.)
From $N$, we derive $N \land M$ (conj.) $\qquad \blacksquare$

### Question 1 (c)
##### Claim: $A \land \lnot \lnot B \vdash B \lor (A \rightarrow \lnot C)$

##### PF:
Assume $A \land \lnot \lnot B$
This would imply $A$ and $\lnot \lnot B$ (simp.)
$\lnot \lnot B$ would imply $B$ (dbl. neg)
$B$ would imply $B \lor (A \rightarrow \lnot C)$ (weak.) $\qquad \blacksquare$

### Question 1 (d)
##### Claim: $(A \land B) \rightarrow C, B, A \land \lnot D \vdash C \land \lnot D$

##### PF: 
Assume $A \land \lnot D$ and $B$
This would imply $A$ and $\lnot D$ (simp.)
$(A \land B)$ holds (conj.)
Which implies $C$ (appl.)
$C$ would then imply $C \land \lnot D$ (conj.) $\qquad \blacksquare$

### Question 1 (e)
##### Claim $(A \land B) \rightarrow C, B \vdash (A \land \lnot D) \rightarrow (C \land \lnot D)$

##### PF: (Direct Proof)
Assume $(A \land B)$ and $\lnot D$
This implies $A$ and $B$ (simp.)
And implies $C$ (appl.)
With $\lnot D$, we see that $(A \land \lnot D)$ (conj.)
Aswell as $(C \land \lnot D)$ (conj.)
Which concludes $(A \land \lnot D) \rightarrow (C \land \lnot D)$ (dir. pf) $\qquad \blacksquare$

### Question 1 (f)
##### Claim: $\lnot P \rightarrow (Q \land R) \vdash (\lnot P \land S) \rightarrow (R \land S)$

##### PF:
Assume $\lnot P$ and $S$
$\lnot P$ would imply $(Q \land R)$ (appl.)
Which would imply $Q$ and $R$ (simp.)
$S$ would imply $(\lnot P \land S)$ (conj.)
And would also imply $(R \land S)$ (conj.)
These truths would imply $(\lnot P \land S) \rightarrow (R \land S)$ (dir. pf)


### Question 1 (g)
##### Claim: $X \land (X \rightarrow (Z \land Y)) \vdash X \land Y$

##### PF: Direct Proof
Assume $X \land (X \rightarrow (Z \land Y))$
Then $X$ and $(X \rightarrow (Z \land Y))$ (simp.)
Since $X$, this would imply $(Z \land Y)$ (appl.)
Which would then imply $Y$ and $Z$ (simp.)
Since $X$ and $Y$, $(X \land Y)$ holds (conj.) $\qquad \blacksquare$



### Question 1 (h)
##### Claim: $\vdash (X \land (X \rightarrow (Z \land Y))) \rightarrow (X \land Y)$

##### PF: 
Assume $(X \land Y)$
This would imply $X$ and $Y$ (simp.)
We can then imply $(Z \land Y)$ (appl.)
Which would verify $X \rightarrow (Z \land Y)$ (dir. pf)
Now we can say that $X \land (X \rightarrow (Z \land Y))$ (conj.)
Which concludes $(X \land (X \rightarrow (Z \land Y))) \rightarrow (X \land Y)$ (dir. pf) $\qquad \blacksquare$


### Question 1 (i)
##### Claim: $P \land Q \vdash \lnot (P \rightarrow \lnot Q)$

##### PF:
Assume $(P \rightarrow \lnot Q)$, and $P \land Q$
$P \land Q$ implies $P$ and $Q$ (simp.)
And $P$ would imply $\lnot Q$ (appl.)
$Q$ and $\lnot Q$ cannot stand, therefore we get $\lnot (P \rightarrow \lnot Q)$ (condic.) $\blacksquare$


### Question 1 (j)
##### Claim: $(W \land X) \rightarrow \lnot Y, X \vdash \lnot (W \land Y)$

##### PF: 
Assume $(W \land Y)$ and $X$
This implies $W$ and $Y$ (simp.)
And now $(W \land X)$ (conj.)
Which implies $\lnot Y$ (appl.)
$Y$ and $\lnot Y$ cannot stand, therefore we get $\lnot (W \land Y)$ (condic.) $\blacksquare$

### Question 2

##### Claim: $P \rightarrow \lnot Q, \lnot Q \vdash \lnot \lnot P$

##### PF:
Assume $\lnot Q$, $\lnot (P \rightarrow \lnot Q)$, and $\lnot \lnot P$
We can see $P$ (dbl. neg)
Now $P \rightarrow \lnot Q$ (dir pf.)
Which implies $(P \rightarrow \lnot Q) \land \lnot (P \rightarrow \lnot Q)$ (conj.)
**Since this is always false, the claim is disproven**

