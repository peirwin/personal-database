Topic: Epsilon Delta Limits
Date: Jan 4, 2022
Course: S212
Class: week two

---

### Questions/Cues
- Item

### Notes
##### Rules:
Limit definition:
$$ 
\lim \limits_{x \to a} f(x) = L 
$$
for every $\epsilon$ > 0, there is a $\delta$ > 0 such that:
$$ 0 < |x - a| < \delta \quad \Rightarrow \quad |f(x) - L| < \epsilon  $$

###### Proof examples:

```ad-example
title: Example 1

$$ \lim \limits_{x \to 4} x = 4 $$

a = 4 (the value we are approaching)
L = 4 (the value of the limit)
f(x) = x (the operation)

subst: $|f(x) - L| < \epsilon$
to: $|x - 4| < \epsilon$

realize: $$\begin{align*} 
|x - a| < \delta \quad &\Rightarrow& \quad |x - 4| < \epsilon \\
&\Rightarrow& |f(x) - L| < \epsilon
\end{align*}$$

because this formula matches the definition,
the limit is confirmed true

```

```ad-example
title: Example 2

$$ \lim \limits_{x \to 1} 3x - 1 = 2$$

a = 1
L = 2
f(x) = 3x - 1

subst: $|f(x) - L| < \epsilon$
to: $|x - 1| < \epsilon/3$

realize: $$\begin{align}
|x - a| < \delta \quad &\Rightarrow& 3|x - 1| \epsilon \\
&\Rightarrow& |3x - 3| < \epsilon \\
&\Rightarrow& |(3x - 1) - 2| < \epsilon \\
&\Rightarrow& |f(x) - L| < \epsilon 
\end{align}$$


```

```ad-example
title: Example 3

$$ \lim \limits_{x \to \infty} \sqrt{x} = \infty $$

Because f(x) supposedly increases without bound:

$$ \begin{aligned}
0 < |x - a| < \delta, \, f(x) > M, \, M \in \Bbb{Z}^{+} \\
and \\
x > N, \, N \in \Bbb{Z}^{+} 
\end{aligned}$$

realize:
$$ \begin{aligned}
f(x) > M \quad &\Rightarrow& \quad x > M^2 \\
\\
x > N \quad &\Rightarrow& \quad x > M^2 \\
&\Rightarrow& \quad \sqrt{x} > M\\
&\Rightarrow& \quad f(x) > M

\end{aligned} $$

```



### Summary
Highlight ==what’s important!==

### References

source: chrome-extension://efaidnbmnnnibpcajpcglclefindmkaj/viewer.html?pdfurl=https%3A%2F%2Fwww.ocf.berkeley.edu%2F~yosenl%2Fmath%2Fepsilon-delta.pdf&clen=70408&chunk=true

