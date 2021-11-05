object HelloWorld {
  def main(args: Array[String]): Unit = {
    System.out.println("Hellow World")
    val name = scala.io.StdIn.readLine("Enter userId: ")
    println("Hello!" +name)
    println("Please put in your password:")
    val password = scala.io.StdIn.readLine()
    println("the password you placed is " +password)
    //instatiate the login system
    var login  = new loginSystem();
    login.findUser("admin");

    //test to print users
    println("Need to print out the users")
    login.printUser()


    //test to print users with passwords
    println("Need to print out the users with password")
    login.printUserPassword()

    //test to make an user
    println("Need to test if new user went in")
    login.createUser("hugo","123")
    login.printUserPassword()

    //test to delete an user
    println("Need to test if new user was deleted")
    login.deleteUser("hugo")
    login.printUserPassword()


    //write out to csv
    //login.write()


  }
}