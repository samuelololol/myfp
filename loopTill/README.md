
```
$ scala-2.11 loopTill.scala
10
9
8
7
6
5
4
3
2
1
```


## Closure

The free variable is `i`. Even though it's defined outside the closure, you
could still use it insde. The second parameter in the _loopTill_ example is a
closure, and in Scala that's represented as an object of type `scala.Function0`.
