# Write some scala code to print a fibonacci series
# 0 1 1 2 3 5 8 13 21 34 55 89 144

def fib(n: Int): Int = {
  if (n == 0 || n == 1) n
  else fib(n-1) + fib(n-2)
}

for (i <- 0 to 10) println(fib(i))

// 3. Write some scala code to print a factorial series
// 1 2 6 24 120 720

def fact(n: Int): Int = {
  if (n == 0) 1
  else n * fact(n-1)
}

for (i <- 0 to 10) println(fact(i))

// 4. Write some scala code to print a factorial series
// 1 2 6 24 120 720

def fact2(n: Int): Int = {
  def loop(acc: Int, n: Int): Int = {
    if (n == 0) acc
    else loop(acc * n, n-1)
  }
  loop(1, n)
}

for (i <- 0 to 10) println(fact2(i))

// 5. Write some scala code to print a factorial series
// 1 2 6 24 120 720

def fact3(n: Int): Int = {
  def loop(acc: Int, n: Int): Int = {
    if (n == 0) acc
    else loop(acc * n, n-1)
  }
  loop(1, n)
}

for (i <- 0 to 10) println(fact3(i))

// 6. Write some scala code to print a factorial series
// 1 2 6 24 120 720

def fact4(n: Int): Int = {
  def loop(acc: Int, n: Int): Int = {
    if (n == 0) acc
    else loop(acc * n, n-1)
  }
  loop(1, n)
}

for (i <- 0 to 10) println(fact4(i))

// 7. Write some scala code to print a factorial series
// 1 2 6 24 120 720

def fact5(n: Int): Int = {
  def loop(acc: Int, n: Int