package abstractfactory

/**
  * Created by apinter on 21/04/2017.
  */
case class LondonFeedbackXMLParser extends XMLParser {
  override def parse: Unit = println("LONDON parsing FEEDBACK")
}
