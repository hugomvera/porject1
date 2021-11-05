
import scala.collection.mutable.ArrayBuffer
import com.github.tototoshi.csv._

import java.io.File

class loginSystem {
  def changeUsersPassword(name: String, password: String) = {
    val userIndex = this.users.indexOf(name)
    this.passwords(userIndex)=password
  }

  //  def write(): Unit = {
//
//    val f = new File("out.csv")
//    val writer = CSVWriter.open(f)
//    writer.writeAll("")
//    writer.close()
//
//  }

  def printUserPassword(): Unit = {
    var counter =0;
    for(a <- this.users){
      println("userName:"+a +"\tpassword:"+this.passwords(counter))
      counter =counter +1;
    }
  }


  //need a function for
  //print("Press cu to create user ")
  //need to create an user with a pasword
  def createUser(userName:String,password:String): Unit ={
    this.users +=userName
    this.passwords+=password
  }
  //need a function for
  //print("Press du to delete user ")
  def deleteUser(userName:String): Unit ={
    //this.users.indexOf(userName)
    val containsUser= this.users.contains(userName)
    if(containsUser == true){
      println("deleting the username")
       val index= this.users.indexOf(userName)
        this.users.remove(index)
         this.passwords.remove(index)
    }
    else{println("Cannot delete UserName")}
    //this.passwords+=password
  }
  //TODO need a function for
  //print("Press cp to change password for an user ")

  //make one where it list all users
  def printUser(): Unit ={
    for(a <- this.users){
      println("userName:"+a)
    }
  }

  def findUser(userName: String): Boolean = {
    if(this.users.contains(userName))
    { System.out.println("the user was found")
      return true}
    else {
      System.out.println("the user was  not found")
      return false}
  }



  def findPassword(userName: String): Boolean = {
    if(this.passwords.contains(userName))
    { System.out.println("the password was found")
      return true}
    else {
      System.out.println("THE PASSWORD NOT FOUND:GOOD BYE!")
      return false}
  }

  System.out.println("initizlized login object");

  val users = ArrayBuffer[String]()
  val passwords = ArrayBuffer[String]()

  this.users +="admin"
  this.passwords+="123"
  this.users +="basic"
  this.passwords+="123"

  //need to write a program where user searchs for an user.
  // if it is there then give out a true




  //lets make a csv file
//  val loginFile = "login.csv"
//  val bufferedSource = io.Source.fromFile(loginFile)
//  var count = 0;
//  for (line <- bufferedSource.getLines) {
//    val cols = line.split(",").map(_.trim)
//    // do whatever you want with the columns here
//    if (count == 0) {
//      this.users += cols(0)
//      this.passwords += cols(1)
//      count = 1 +count;
//    }
//    bufferedSource.close


  //a way to write to database





}
