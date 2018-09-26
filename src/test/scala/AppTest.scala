import org.specs2.mutable.Specification
class AppTest extends Specification{
  "App#main" should {
    "return 0" in {
      val app = new HelloWorld
      app.main mustEqual 0
    }
  }
}
