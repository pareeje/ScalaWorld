package exercises.mapsntuples

import scala.collection.JavaConversions.propertiesAsScalaMap

object JavaProps {
  def main( args : Array[String]){
    val props = propertiesAsScalaMap(System.getProperties())

    val maxkey = props.keySet.map(_.length).max

    for( (k,v) <- props ) printf("%-" + maxkey + "s | %s\n", k, v)
  	}
}