import scala.annotation.tailrec

object mainDriver extends App {

  var name = "";
  var password = "";
  var login  = new loginSystem();

  def userMenu() = {
    System.out.println("#####################User Menu####################")
    System.out.println("")
  }

  final def welcomeMenu():Unit ={
   System.out.println("#####################Welcome Menu####################")
  name = scala.io.StdIn.readLine("Enter userId: ")
  println("Hello!" +name)
  println("Please put in your password:")
  password = scala.io.StdIn.readLine()
  println("the password you placed is " +password)
  //instatiate the login system
  val flagUserName=login.findUser(name)
  val flagPassword = login.findPassword(password)
    if(flagUserName==true && flagPassword==true && name =="admin" ){
      System.out.println("welcome you been authentified as  Administrative")
      //will need to write a printmenu just for admin
      adminMenu();
    }

    if(flagUserName==true && flagPassword==true && name !="admin" ){
      System.out.println("welcome you been authentified ")
      userMenu();
    }
    welcomeMenu()
  }

  welcomeMenu()

  @tailrec
  final def printMenu():Unit = {
    println("")
    println("Put in a ticker: ")
    println("press x to exit")
    println("press t1 to buy and hold individual stocks")
    println("press s1 to short and hold individual stocks")
    println("press s to show all trades made on individual stocks")
    println("press 1 to show historical data for stock  on individual stocks")
    println("press 2 to make a graph of data individual stocks")
    println("press 3 to plot Volume individual stocks")
    println("press D to Deposit to account from Bank")
    println("press W to Withdraw  account from Investment Account")
    println("press S to  Show Transactions on Investment Account")
    println("press BS to  Buy stock")
    println("press SS to  SELL stock")
    val cmd = scala.io.StdIn.readLine()
    cmd match{
      case "s" => {
        //return Some("Foo")
        //val databaseS = new JDBC("dummy",1 ,"dummy")
        //databaseS.showToDataBase()
        printMenu()
      }

      case "1" => {
        //return Some("Foo")
       // val stk2 = new TradeStonk(ticker,1)
       // stk2.printStock()
        printMenu()
      }
      case "2" => {
        //return Some("Foo")
        //val stk2 = new TradeStonk(ticker,1)
        //System.out.println(stk2.adjclose)
        //stk2.plotStock()
        printMenu()
      }
      case "3" => {
        //return Some("Foo")
        //val stk2 = new TradeStonk(ticker,1)
        //System.out.println(stk2.adjclose)
        //stk2.plotVolume()
        printMenu()
      }

      case "x" => return None
      case "t1" =>
        //val stk2 = new TradeStonk(ticker,1)
        //stk2.buyAndHold();
        //val database1 = new JDBC(ticker,stk2.SumMoney,"BuyAndHold" )
        //database1.saveToDataBase()
        //System.out.println("the buy and hold yields " + stk2.SumMoney + "  X increase")
        printMenu();
      case "s1" =>
        //val stk2 = new TradeStonk(ticker,1)
        //stk2.shortAndHold();
        //val database1 = new JDBC(ticker,stk2.SumMoney ,"ShortAndHold")
        //database1.saveToDataBase()
        //System.out.println("the buy and hold yields " + stk2.SumMoney + "  X increase")
        printMenu();
      case "D" =>
//        System.out.println("Please put in an amount")
//        val DepositToAccount = scala.io.StdIn.readInt()
//        System.out.println("Please put in the date")
//        val DepositeDate = scala.io.StdIn.readLine()
//        System.out.println( "the followign amount will be deposited to your account\t " +DepositToAccount)
//        System.out.println( "the day of \t" +DepositeDate)
//        //c1.deposit(DepositeDate,DepositToAccount)
//        System.out.println( "your balannce is \t " +c1.cashBalance)
        printMenu();
      case "W" =>
//        System.out.println("Please put in an amount")
//        val WithdrawToAccount = scala.io.StdIn.readInt()
//        System.out.println("Please put in the date")
//        val WithdrawDate = scala.io.StdIn.readLine()
       // c1.withdraw(WithdrawDate,WithdrawToAccount)
        //System.out.println( "the followign amount will be withdrawn to your account \t " +WithdrawDate)
        //System.out.println( "the day of \t " +WithdrawDate)
        //System.out.println( "the balance is  \t  " + c1.cashBalance )
        printMenu();
      case "S" =>
       // c1.printStatement()
        printMenu();
      case "BS" =>
//        System.out.println("Please put in a Stock SYmbol")
//        val tickerToBuy = scala.io.StdIn.readLine()
//        System.out.println("Please put in an amount")
//        val amountStockToBuy = scala.io.StdIn.readInt()
//        System.out.println("Please put in the date")
//        val WithdrawDate = scala.io.StdIn.readLine()
//        c1.buyStock(WithdrawDate,tickerToBuy,amountStockToBuy)
//        System.out.println( "the day of \t " +WithdrawDate)
//        System.out.println( "the balance is  \t  " + c1.cashBalance )
        printMenu();
      case "SS" =>
//        System.out.println("Please put in a Stock SYmbol")
//        val tickerToBuy = scala.io.StdIn.readLine()
//        System.out.println("Please put in an amount")
//        val amountStockToBuy = scala.io.StdIn.readInt()
//        System.out.println("Please put in the date")
//        val WithdrawDate = scala.io.StdIn.readLine()
//        c1.sellStock(WithdrawDate,tickerToBuy,amountStockToBuy)
//        System.out.println( "the day of \t " +WithdrawDate)
//        System.out.println( "the balance is  \t  " + c1.cashBalance )
        printMenu();
      case _ =>
        //ticker = cmd
        printMenu();
    }
  }



  //#######################################admin menu
  final def adminMenu():Unit = {
    //
    println("###################Welcome to ADMIN MENU ############################")
    println("Press su to Show Users ")
    println("Press sup to Show Users with passwords ")
   println("Press cu to create user ")
    println("Press du to delete user ")
    println("Press cp to change password for an user ")
    println("Press x to go back to main menu ")
    val cmd = scala.io.StdIn.readLine()
    cmd match{
      case "cu" => {
        println("Creating User ")
        val name = scala.io.StdIn.readLine("Enter new userId: ")
        println(" put in  new password:")
        val password = scala.io.StdIn.readLine()
        login.createUser(name,password)
        adminMenu()
      }

      case "su" => {
        println("#######Showing Users ###############")
        login.printUser()
        adminMenu()
      }
      case "sup" => {
        println("#######showing users and passwords ###############")
        login.printUserPassword()
        adminMenu()
      }
      case "du" => {
        println("#######Deleting User ###############")
        val name = scala.io.StdIn.readLine("Enter  userId to delete: ")
        login.deleteUser(name)
        adminMenu()
      }

      case "cp" => {
        println("#######changing password ###############")
        val name = scala.io.StdIn.readLine("Enter  userId: ")
        println(" put in  new password:")
        val password = scala.io.StdIn.readLine()
        login.changeUsersPassword(name,password)
        adminMenu()
      }




      case "x" => return None
      case "t1" =>
        //val stk2 = new TradeStonk(ticker,1)
        //stk2.buyAndHold();
        //val database1 = new JDBC(ticker,stk2.SumMoney,"BuyAndHold" )
        //database1.saveToDataBase()
        //System.out.println("the buy and hold yields " + stk2.SumMoney + "  X increase")
        printMenu();
      case "s1" =>
        //val stk2 = new TradeStonk(ticker,1)
        //stk2.shortAndHold();
        //val database1 = new JDBC(ticker,stk2.SumMoney ,"ShortAndHold")
        //database1.saveToDataBase()
        //System.out.println("the buy and hold yields " + stk2.SumMoney + "  X increase")
        printMenu();
      case "D" =>
        //        System.out.println("Please put in an amount")
        //        val DepositToAccount = scala.io.StdIn.readInt()
        //        System.out.println("Please put in the date")
        //        val DepositeDate = scala.io.StdIn.readLine()
        //        System.out.println( "the followign amount will be deposited to your account\t " +DepositToAccount)
        //        System.out.println( "the day of \t" +DepositeDate)
        //        //c1.deposit(DepositeDate,DepositToAccount)
        //        System.out.println( "your balannce is \t " +c1.cashBalance)
        printMenu();
      case "W" =>
        //        System.out.println("Please put in an amount")
        //        val WithdrawToAccount = scala.io.StdIn.readInt()
        //        System.out.println("Please put in the date")
        //        val WithdrawDate = scala.io.StdIn.readLine()
        // c1.withdraw(WithdrawDate,WithdrawToAccount)
        //System.out.println( "the followign amount will be withdrawn to your account \t " +WithdrawDate)
        //System.out.println( "the day of \t " +WithdrawDate)
        //System.out.println( "the balance is  \t  " + c1.cashBalance )
        printMenu();
      case "S" =>
        // c1.printStatement()
        printMenu();
      case "BS" =>
        //        System.out.println("Please put in a Stock SYmbol")
        //        val tickerToBuy = scala.io.StdIn.readLine()
        //        System.out.println("Please put in an amount")
        //        val amountStockToBuy = scala.io.StdIn.readInt()
        //        System.out.println("Please put in the date")
        //        val WithdrawDate = scala.io.StdIn.readLine()
        //        c1.buyStock(WithdrawDate,tickerToBuy,amountStockToBuy)
        //        System.out.println( "the day of \t " +WithdrawDate)
        //        System.out.println( "the balance is  \t  " + c1.cashBalance )
        printMenu();
      case "SS" =>
        //        System.out.println("Please put in a Stock SYmbol")
        //        val tickerToBuy = scala.io.StdIn.readLine()
        //        System.out.println("Please put in an amount")
        //        val amountStockToBuy = scala.io.StdIn.readInt()
        //        System.out.println("Please put in the date")
        //        val WithdrawDate = scala.io.StdIn.readLine()
        //        c1.sellStock(WithdrawDate,tickerToBuy,amountStockToBuy)
        //        System.out.println( "the day of \t " +WithdrawDate)
        //        System.out.println( "the balance is  \t  " + c1.cashBalance )
        printMenu();
      case _ =>
        //ticker = cmd
        printMenu();
    }
  }









}