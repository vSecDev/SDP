package abstractfactory

/**
  * Created by apinter on 21/04/2017.
  */
case class NYCResponseXMLParser extends XMLParser{
  override def parse: Unit = println("NYC parsing RESPONSE")
}