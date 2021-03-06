/* SBaz -- Scala Bazaar
 * Copyright 2005-2011 LAMP/EPFL
 * @author  Lex Spoon
 */


package sbaz.messages

/**
 * Request the list of keys known to the server.
 */
case object SendKeyList extends AbstractKeyMessage {
  def toXML = <sendkeylist/>
}
