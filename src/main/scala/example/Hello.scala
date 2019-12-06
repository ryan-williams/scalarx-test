package example

object Hello extends App {
  import rx._

  val a = Var(7)
  val b = Var(24)

  val `a²` = Rx(a() * a())
  val b2 = Rx(b() * b())
  val c = Rx(`a²`() + b2())
  val d = Rx(math.sqrt(c()))

  def e: Rx[Int] = Rx(f() * 2)
  def f: Rx[Int] = Rx(e() * 2)

  println(e.now)

  // Rx(c).map(math.sqrt(_))

//  a2() = 324

  println(d.now)
  a() = 18
  println(d.now)

//  val c = Rx{ a() + b() }
//  println(c.now) // 3
//  println(a())
//  a() = 4
//  println(c.now) // 6
}

object Regular   {
  var a = 1
  var b = 2
  var c = a + b
  println(c)  // 3
  a = 4
  println(c)  // 3
}



//object A {
//  def apply() = 123
//}
//
//object B {
//  A()  // 123
//  A == B  // A.equals(B)
//
//  val s1 = "123"
//  val s2 = "1" + "2" + "3"
//
//  s1 == s2  // 🔥 in java
//  s1 == s2  // ✅ in scala
//  s1.equals(s2)  // ✅
//}
