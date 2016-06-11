import java.lang.management.ManagementFactory
import scala.collection.JavaConverters._

/**
  * Created by rcirk_000 on 6/10/2016.
  */
object Main extends App {

  val bean = ManagementFactory.getRuntimeMXBean
  val aList = bean.getInputArguments.asScala
  aList.foreach(println)
}
