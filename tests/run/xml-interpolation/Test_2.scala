import XmlQuote._

object Test {
  def main(args: Array[String]): Unit = {
    // TODO: enable once #5119 is fixed
    // assert(xml"Hello Allan!" == Xml("Hello Allan!", Nil))

    val name = new Object{}
    assert(xml"Hello $name!" == Xml("Hello ??!", List(name)))
  }
}
