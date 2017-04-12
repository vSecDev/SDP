package counter

/**
  * Created by apinter on 30/03/2017.
  */
class Counter(ct: Option[Int]) {
  var count = ct getOrElse 1

  def inc() = { new Counter(Option(count + 1)) }
  def dec() = { new Counter(Option(count - 1)) }

}