package abstractfactory

// Here we define a basic component of a space ship
// Any part that implements the interface ESWeapon
// can replace that part in any ship
case class ESUFOBossGun() extends ESWeapon {
  // EnemyShip contains a reference to the object
  // ESWeapon. It is stored in the field weapon
  // The Strategy design pattern is being used here
  // When the field that is of type ESUFOGun is printed
  // the following shows on the screen
  override def toString = "40 damage"
}
