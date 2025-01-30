```groovy
def myMethod(a, b) {
  if (a == null || b == null) {
    return 0 // Or handle nulls in a way that makes sense for your application
  }
  return a + b
}

println myMethod(1,2) //3
println myMethod(null, 2) //0
println myMethod(1, null) //0
println myMethod(null, null) //0
```