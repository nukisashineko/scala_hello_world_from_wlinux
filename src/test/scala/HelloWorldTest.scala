import org.specs2.mutable.Specification
class HelloWorldTest extends Specification{
  "HelloWorld#main" should {
    "return 0" in {
      val helloWorld = new HelloWorld
      helloWorld.main mustEqual 0
    }
  }
}
