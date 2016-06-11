import java.lang.management.ManagementFactory
import scala.collection.JavaConverters._

object Main extends App {
  val bean = ManagementFactory.getRuntimeMXBean
  val aList = bean.getInputArguments.asScala
  aList.foreach(println)

  println("Press any key to exit")
  System.in.read()
}
